package Collection_API;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    
    public static void main(String[] args) {
         Map<String,Integer> students = new HashMap<>();

         students.put("Navin",40);
         students.put("om",80);
         students.put("Ashok",70);

         //System.out.println(students.keySet());

        //System.out.println(students.get("Navin"));

        for(String key: students.keySet()){

            System.out.println("The "+key+" has scored "+ students.get(key));

        }

    }


}
