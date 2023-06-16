package Caching;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;

import java.util.concurrent.TimeUnit;

/**
 * using this record for testing purpose only
 */
record DataObject(String userData) {
    private static int objectCounter = 0;

    public static DataObject get(String data) {
        objectCounter++;
        return new DataObject (data);
    }
}

/**
 * One fundamental difference between a cache and a Map is that a cache evicts stored items.
 * An eviction policy decides which objects should be deleted at any given time.
 * This policy directly affects the cache's hit rate — a crucial characteristic of caching libraries.
 */
public class CaffeineCaching {

    /**
     * Caffeine's three strategies for cache population: manual, synchronous loading, and asynchronous loading.
     */
    public static Cache<String, DataObject> manualPopulation(){

        // It has a maximum size of 100 entries.
        // Each entry in the cache will expire and be removed after 1 minute of being written.
        Cache<String, DataObject> cache = Caffeine.newBuilder ()
                .maximumSize (100)
                .expireAfterWrite (1, TimeUnit.MINUTES)
                .build ();

        // Making a manual population of key : "JEE"
        cache.put ("KEY-A", new DataObject ("VALUE-A"));
        return cache;

    }

}


