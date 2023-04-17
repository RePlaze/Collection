package Core.Collections.Collection;

import java.util.HashMap;

/*
 HashMap is a collection that stores key-value pairs in a hash table,
 providing constant-time performance for basic operations.

 It implements the Map interface and is more efficient than other Map implementations such as TreeMap.
 A hash table stores keys and their associated values in an array-like structure.
 The index of the array is determined by a hash function that converts the key into an integer value.
 If multiple keys generate the same hash code (collision),
 a linked list is used to store the values associated with those keys.
 */
public class $HashMap {
    // initialize a HashMap
    private static final HashMap<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        // Key methods:
        put();
        get();
        remove();
        containsKey();
        values();
        size();
        clear();
        isEmpty();
    }

    public static void put() {
        // put(key, value) - adds a key-value pair to the map
        map.put( "John", 25 );
        map.put( "Jane", 30 );
        map.put( "Alex", 19 );
        println( "Added John and Jane to the map" );
    }

    public static void get() {
        // get(key) - retrieves the value for a specific key
        int ageOfJohn = map.get( "John" );
        println( "Age of John: " + ageOfJohn );
    }

    public static void remove() {
        // remove(key) - removes a key-value pair from the map
        map.remove( "Jane" );
        println( "Removed Jane from the map" );
    }

    public static void containsKey() {
        // containsKey(key) - checks if a key is present in the map
        boolean isJanePresent = map.containsKey( "Jane" );
        println( "Is Jane present in the map? " + isJanePresent );
    }

    public static void values() {
        // values() - gets a collection of the values in the map
        println( "Values in the map: " + map.values() );
    }

    public static void size() {
        // size() - gets the number of key-value mappings in the map
        println( "Number of entries in the map: " + map.size() );
    }

    public static void clear() {
        // clear() - removes all key-value pairs from the map
        map.clear();
        println( "Cleared the map" );
    }

    public static void isEmpty() {
        // isEmpty() - checks if the map is empty
        boolean isMapEmpty = map.isEmpty();
        println( "Is the map empty? " + isMapEmpty );
    }

    public static void println(Object string) {
        System.out.println( string );
    }

    public static void print(Object string) {
        System.out.print( string );
    }
}
