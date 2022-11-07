import java.io.*;
import java.util.*;

public class Test03 {
    public static void main(String[] args) {
        Map<String, String> normalMap = new HashMap<String, String>();
        normalMap.put("コーヒー", "サイズS");
        normalMap.put("コーヒー", "値段４００円");
        
        System.out.println(normalMap);
        
    }
}