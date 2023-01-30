package String_Assignment.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Ex_06_Print_DuplicateCharInString
{
    public static void main(String[] args) {
        String x = "SILLYSPIDERS";
        char[] y = x.toCharArray();
        int size = y.length;
        Map<Character, Integer> map = new LinkedHashMap<>();
        int i = 0;
        while (i != size) {
            if (map.containsKey(y[i]) == false) {
                map.put(y[i], 1);
            } else {
                int oldVal = map.get(y[i]);
                int newVal = oldVal + 1;
                map.put(y[i], newVal);

            }
            ++i;
        }
        Set<Map.Entry<Character,Integer>> lmap = map.entrySet();
        for(Map.Entry<Character,Integer> data : lmap)
        {
            if(data.getValue() > 1)
            {
                System.out.println(data.getKey());
                System.out.println(data.getValue());
            }
        }
    }
}
