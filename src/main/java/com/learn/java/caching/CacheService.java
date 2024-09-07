package com.learn.java.caching;

import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;
import com.learn.java.TestEntityObject;
import java.util.concurrent.TimeUnit;

/**
 * One fundamental difference between a cache and a Map is that a cache evicts stored items. An
 * eviction policy decides which objects should be deleted at any given time. This policy directly
 * affects the cache's hit rate — a crucial characteristic of caching libraries.
 */
public class CacheService {

  private final LoadingCache<String, TestEntityObject> loadingCache;

  // Constructor to initialize the cache
  public CacheService() {
    this.loadingCache = Caffeine.newBuilder()
        .maximumSize(100) // The cache can hold up to 100 entries.
        .expireAfterWrite(10, TimeUnit.MINUTES) // Each entry expires 10 minutes after it’s written.
        .refreshAfterWrite(5,
            TimeUnit.MINUTES) // Each entry is eligible for refresh 5 minutes after it’s written, so if accessed after 5 minutes, a new value will be loaded.
        .build(this::getEntityObject); // Automatically load the value when cache misses
  }

  public TestEntityObject getEntityObject(String id) {
    System.out.println("Actual Method Invoked for id : " + id);
    return TestEntityObject.builder()
        .id(id)
        .description("description for " + id)
        .build();
  }

  public TestEntityObject getCacheEntityObject(String id) {
    return loadingCache.get(id);
  }

}


