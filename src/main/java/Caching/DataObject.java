package Caching;

/**
 * using this record for testing purpose only
 */
record DataObject(String userData) {

  private static int objectCounter = 0;

  public static DataObject get(String data) {
    objectCounter++;
    return new DataObject(data);
  }
}
