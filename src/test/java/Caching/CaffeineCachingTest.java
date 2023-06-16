package Caching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaffeineCachingTest {


    @Test
    void manualPopulation() {
        var cache = CaffeineCaching.manualPopulation ();

        /**
         * we can get some value from the cache using the getIfPresent method.
         * */

         //This method will return null if the value is not present in the cache
        assertNull(cache.getIfPresent ("KEY"));

        // This should return notNull as KEY-A is present in cache
        assertNotNull(cache.getIfPresent ("KEY-A"));

    }
}