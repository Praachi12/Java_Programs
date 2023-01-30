package String_Assignment.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EX_01__CreatingMap {
    public static void main(String[] args) {
        String x = "AARADHYA";
        char[] y= x.toCharArray();
        int size = y.length;
        Map<Character,Integer> map = new HashMap<>();
        int i= 0;
        while(i != size)
        {
            if(map.containsKey(y[i])== false)
            {
                map.put(y[i],1);
            }
            else {
                int oldVal= map.get(y[i]);
                int newVal = oldVal + 1;
                map.put(y[i],newVal);

            }
            ++i;
        }
        Set<Map.Entry<Character,Integer>> hmap = map.entrySet();
        for(Map.Entry<Character,Integer> data : hmap)
        {
            System.out.println(data.getKey());
            System.out.println(data.getValue());
        }
    }

}
