package Lap11bt;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> studenDEV = new HashMap<>();
        studenDEV.put("K1230","Tuấn");
        studenDEV.put("K1231","Nam");
        studenDEV.put("K1232","Huy");
        studenDEV.put("K1233","Mạnh");
        studenDEV.put("K1234","Khỏe");
        for (Map.Entry<String,String>entrySet:studenDEV.entrySet()){
            String key = entrySet.getKey();
            String value = entrySet.getValue();
            System.out.println(key + "-"+value);
        }
        System.out.println("Student rollno = K1231 is "+ studenDEV.get("K1231"));
        studenDEV.remove("K1231");
        System.out.println("after remove"+studenDEV);
    }
}
