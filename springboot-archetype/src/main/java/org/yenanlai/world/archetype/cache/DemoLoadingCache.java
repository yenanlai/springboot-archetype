package org.yenanlai.world.archetype.cache;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * Guava使用示例
 */
@Slf4j
@Component
public class DemoLoadingCache extends GuavaAbstractLoadingCache<String, String> implements
                              ILocalCache<String, String> {

    @Override
    protected String fetchData(String key) {
        return "本地缓存 key: " + key;
    }

    @Override
    public String get(String key) {
        try {
            return getValue(key);
        } catch (Exception e) {
            log.error("根据 {} 在缓存中取值失败", key, e);
            return null;
        }
    }
}
