package InterviewKit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToGetUniqueElementFromList {
    public static void main(String[] args) {
        /** When you write forEach loop you must define the type first not class type only generic type
         *  Integer a : reference of class or array that want to iterate
         */
         String[] j = {"1","2"};
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(1);
        a.add(3);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.size();i++){
            if(!map.containsKey(a.get(i))){
                map.put(a.get(i),1);
            } else{
                map.put(a.get(i),a.get(i)+1);
            }
        }

      //  for(Integer e : a )

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
            }

        }

    }
}
