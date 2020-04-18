//package com.company.algo;
//
//import java.io.*;
//import java.util.*;
//import java.util.stream.Stream;
//
//class FlattenDictionary {
//
//    static HashMap<String, String>   flattenDictionary(HashMap<String, Object> dict) {
//        HashMap<String, String> result = new HashMap<>();
//        // your code goes here
//        Iterator dictItretor = dict.entrySet().iterator();
//        while(dictItretor.hasNext()){
//            Map.Entry dictElement = (Map.Entry)dictItretor.next();
//            String key = (String)dictElement.getKey();  // - -shou
//            String value="";
//            if(dictElement.getValue() instanceof Map){
//                // here
//             //   HashMap<String, String> map  = flattenDictionary((HashMap)dictElement.getValue());
//                for (String subKey : map.keySet()) {
//                    String newKey = key + "." + subKey;
//                    result.put(newKey, (String) map.get(subKey));
//                }
//                // prepend
//            }else{
//                String value1 = (String) dictElement.getValue();
//                result.put(key, value1);
//            }
//
//        }
//
//        return result;
//
//    }
//
//
//
//
//    static HashMap<String, String> flattenDictionary(HashMap<String, Object> dict) {
//
//
//        HashMap<String, String> result = new HashMap<>();
//        // Iterator iterator = dict.entrySet().iterator();
//        for (Map.Entry<String, Object> entry: dict.entrySet()) {
////    while(iterator.hasNext()){
//            //    HashMap<String, Object> entry = iterator.next();
//            if (entry.getValue() instanceof HashMap) {
//                HashMap<String, String> nestedMap = flattenDictionary((HashMap<String, Object>) entry.getValue());
//                for (Map.Entry<String, String> nestedEntry: nestedMap.entrySet()) {
//                    String newKey;
//                    if (nestedEntry.getKey().equals("")) {
//                        newKey = entry.getKey();
//                    } else {
//                        newKey = entry.getKey() + "." + nestedEntry.getKey();
//                    }
//
//                    result.put(newKey, nestedEntry.getValue());
//                }
//            } else {
//                result.put(entry.getKey(), (String) entry.getValue());
//            }
//        }
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//
//    }
//
//}
//
