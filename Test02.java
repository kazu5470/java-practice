import java.io.*;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Test02 {
    
//     public static <K, V> K getKey(Map<K, V> map, V value)
// 	{
// 		for (K key: map.keySet())
// 		{
// 			if (value.equals(map.get(key))) {
// 				return key;
// 			}
// 		}
// 		return null;
// 	}
    
    public static void main(String[] args){
        Map<String, List<String>> normalMap = new HashMap<String, List<String>>();
        if (!normalMap.containsKey("コーヒー")) {
        normalMap.put("コーヒー", new ArrayList<String>());
        }
        normalMap.get("コーヒー").add("サイズS");
        if (!normalMap.containsKey("コーヒー")) {
        normalMap.put("コーヒー", new ArrayList<String>());
        }
        normalMap.get("コーヒー").add("値段４００円");
        if (!normalMap.containsKey("コーヒー")) {
        normalMap.put("コーヒー", new ArrayList<String>());
        }
        normalMap.get("コーヒー").add("持ち帰り");
        if (!normalMap.containsKey("カフェオレ")) {
                normalMap.put("カフェオレ", new ArrayList<String>());
        }
        normalMap.get("カフェオレ").add("サイズM");
        if (!normalMap.containsKey("カフェオレ")) {
                normalMap.put("カフェオレ", new ArrayList<String>());
        }
        normalMap.get("カフェオレ").add("値段５００円");
        if (!normalMap.containsKey("カフェオレ")) {
                normalMap.put("カフェオレ", new ArrayList<String>());
        }
        normalMap.get("カフェオレ").add("持ち帰り");
        if (!normalMap.containsKey("オレンジジュース")) {
                normalMap.put("オレンジジュース", new ArrayList<String>());
        }
        normalMap.get("オレンジジュース").add("サイズS");
        if (!normalMap.containsKey("オレンジジュース")) {
        normalMap.put("オレンジジュース", new ArrayList<String>());
        }
        normalMap.get("オレンジジュース").add("値段４５０円");
        if (!normalMap.containsKey("オレンジジュース")) {
                normalMap.put("オレンジジュース", new ArrayList<String>());
        }
        normalMap.get("オレンジジュース").add("店内");
        
        // for(Map.Entry<String, List<String>> entry : normalMap.entrySet() ){
        //     System.out.println("key:" + entry.getKey() + ", value:" + entry.getValue());
        // }
        Set<String> foundKeys = normalMap.entrySet()
                                  .stream()
                                  .filter(entry -> Objects.equals(entry.getValue(), "サイズS"))
                                  .map(Map.Entry::getKey)
                                  .collect(Collectors.toSet());

        System.out.println("Result: " + foundKeys);
    }    
}
        // System.out.println(getKey(normalMap, "サイズS"));