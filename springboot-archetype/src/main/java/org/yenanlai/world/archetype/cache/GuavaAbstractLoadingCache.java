package org.yenanlai.world.archetype.cache;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public abstract class GuavaAbstractLoadingCache<K, V> {

    private int expireAfterWriteDuration = 30;
    private TimeUnit timeUnit = TimeUnit.MINUTES;

    private Date resetTime;
    private long highestSize = 0;
    private Date highestTime;

    private LoadingCache<K, V> cache;

    private LoadingCache<K, V> getCache() {
        if (cache == null) {
            synchronized (this) {
                if (cache == null) {
                    cache = CacheBuilder.newBuilder()
                            .expireAfterWrite(expireAfterWriteDuration, timeUnit).recordStats()
                            .build(new CacheLoader<K, V>() {

                                @Override
                                public V load(K key) {
                                    return fetchData(key);
                                }
                            });
                    this.resetTime = new Date();
                    this.highestTime = new Date();
                    log.info("本地缓存 {} 初始化成功", this.getClass().getSimpleName());
                }
            }
        }

        return cache;
    }

    protected abstract V fetchData(K key);

    protected V getValue(K key) throws ExecutionException {
        V result = getCache().get(key);
        if (getCache().size() > highestSize) {
            this.highestSize = getCache().size();
            this.highestTime = new Date();
        }
        return result;
    }
}
