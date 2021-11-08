package K;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class test1 {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<String, String>();
        map.put("key01", "value01");
        map.put("key02", "value02");
        map.put("key03", "value03");
        map.put("key04", "value04");
        map.put("key05", "value05");

// 방법 04 : keySet().iterator()
        Iterator<String> iteratorK = map.keySet().iterator();
        while (iteratorK.hasNext()) {
            String key = iteratorK.next();
            String value = map.get(key);
            System.out.println("[key]:" + key + ", [value]:" + value);
        }
    }
}
