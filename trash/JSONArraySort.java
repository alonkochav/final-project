//package utilities;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

// begin with the reference JSONArray example:
// https://processing.org/reference/JSONArray.html

import java.util.ArrayList;
import java.util.Collections;  // added
import java.util.Comparator;   // added

//public class JSONArraySort extends JSONArray {
//
//        // utility -- sort will need to get all objects from private ArrayList
//        ArrayList<JSONObject> getAll() {
//            ArrayList<JSONObject> myobjs = new ArrayList<JSONObject>();
//            for (int i=0; i<this.size(); i++) {
//                myobjs.add((JSONObject)this.get(i));
//            }
//            return myobjs;
//        }
//
//        // utility -- sort will need to clear all objects from private ArrayList
//        public void clear() {
//            for (int i=this.size()-1; i>=0; i--) {
//                this.remove(i);
//            }
//        }
//
//        // sort by getting all objects, sorting with comparator, clearing, and appending
//        public void sort() {
//            ArrayList<JSONObject> myobjs = this.getAll();
//            Collections.sort(myobjs, new JSONComparator());
//            this.clear();
//            for (int i=0; i<myobjs.size(); i++) {
//                this.append(myobjs.get(i));
//            }
//        }
//
//}
