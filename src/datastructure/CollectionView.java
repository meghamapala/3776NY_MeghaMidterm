package datastructure;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class CollectionView {

public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "Denver");
        map.put(4, "Boston");
        map.put(5, "San Jose");
        map.put(6, "Seattle");
        map.put(7, "Hartford");
        map.put(8, "Newark");
        map.put(9, "Las Vegas");
        map.put(10,"Chicago");

        System.out.println(map.get(6));
        System.out.println(map.size());

        for (HashMap.Entry entry:map.entrySet()){
                System.out.println(entry.getKey()+"  "+entry.getValue());
        }
        System.out.println(map.remove(2,"LA"));
        for (HashMap.Entry entry:map.entrySet()) {
                System.out.print(entry.getKey() + " " + entry.getValue()+"  ");
        }
}
}
