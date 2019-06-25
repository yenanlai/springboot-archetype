package org.yenanlai.world.archetype.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

/**
 * ObjectMapper单例
 */
@Slf4j
public class ObjectMapperSingleton {

    private volatile static ObjectMapper instance; //声明成 volatile

    private ObjectMapperSingleton() {
    }

    public static ObjectMapper get() {
        if (instance == null) {
            synchronized (ObjectMapperSingleton.class) {
                if (instance == null) {
                    instance = new ObjectMapper();
                    instance.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                }
            }
        }
        return instance;
    }

    public static JavaType getCollectionType(ObjectMapper mapper, Class<?> collectionClass,
            Class<?>... elementClasses) {
        return mapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);
    }
}
