package String_Assignment.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Ex_05_FindMaxOccuringCharInString {
    public static void main(String[] args) {

            String x = "SILLYSPIDERS";
            char[] y= x.toCharArray();
            int size = y.length;
        /*We are using LinkedHashMap because we have to find first character and Linked hashmap
         stores data in same sequence as the input */
            Map<Character,Integer> map = new LinkedHashMap<>();
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
            char maxkey = ' ';
            int maxValue= 0;
            Set<Map.Entry<Character,Integer>> lmap = map.entrySet();
            for(Map.Entry<Character,Integer> data : lmap)
            {
                if(data.getValue() > maxValue)
                {
                    maxValue = data.getValue();
                    maxkey = data.getKey();
                }
            }
        System.out.println(maxValue);
        System.out.println(maxkey);
        }

    }

