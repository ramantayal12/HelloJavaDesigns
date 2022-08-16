package JavaCollections;

import java.util.ArrayList;

public class CollectionsDriver {

    public static void main(String args[]){

        // hashMaps
        System.out.println ("hashMaps");
        OverHashMaps hashMapsBasics = new OverHashMaps ();
        hashMapsBasics.putMethod ();
        hashMapsBasics.getMethod ();
        hashMapsBasics.iterateMethod ();
        hashMapsBasics.forEachMethod ();

        // ArrayList
        System.out.println ("ArrayList");
        ArrayListOverView arrayListOverView = new ArrayListOverView ();
        ArrayList<Integer> arrayList = arrayListOverView.initializeMethods ();
        arrayListOverView.manipulatingArrayList (arrayList);

    }
}
