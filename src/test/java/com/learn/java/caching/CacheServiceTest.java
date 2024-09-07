package com.learn.java.caching;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CacheServiceTest {

  private CacheService cacheService;

  @BeforeEach
  void setUp(){
    cacheService = new CacheService();
  }

  @Test
  void testCacheMethod(){

    // first hit should print actual method invoked as well
    System.out.println(cacheService.getCacheEntityObject("id1"));


    // second hit should be served from cache
    // shouldn't print "Actual Method Invoked for id : id1"
    System.out.println(cacheService.getCacheEntityObject("id1"));
  }
}