package org.yenanlai.world.archetype.cache;

public interface ILocalCache<K, V> {

    V get(K key);
}
