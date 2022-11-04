import java.io.*;
import java.util.*;
public class Test002 {
    
    public static <K, V> K getKey(Map<K, V> map, V value)
	{
		for (K key: map.keySet())
		{
			if (value.equals(map.get(key))) {
				return key;
			}
		}
		return null;
	}
    
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
        
        
        // System.out.println(getKey(normalMap, "サイズS"));
        // 全てのキーを取得
        // for (String key : normalMap.keySet() ) {
        //     System.out.println("key:" + key);
        // }    
        // // 全ての値を取得
        // // for (String value : normalMap.values() ) {
        // //     System.out.println("value:" + value);
        // // }    
        // // 全てのキーと値を取得 
        for(Map.Entry<String, List<String>> entry : normalMap.entrySet() ){
            System.out.println("key:" + entry.getKey() + ", value:" + entry.getValue());
        }    
        // hashmap.put("コーヒー","サイズS","値段４００円","持ち帰り");
        // hashmap.put("カフェオレ","サイズM","値段５００円","持ち帰り");
        // hashmap.put("オレンジジュース","サイズS","値段４５０円","店内");
    }
}