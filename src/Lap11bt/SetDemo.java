package Lap11bt;

import lombok.Data;

import java.util.Arrays;
import java.util.TreeSet;

@Data
public class SetDemo {


    public static void main(String[] args) {
        int count[] = {34,5,65,23,12,45,7};
        System.out.println("Original Array" + Arrays.toString(count));
        TreeSet sortedSet = new TreeSet<Integer>();
        for (int i = 0; i < 7; i++) {
            sortedSet.add(count[i]);

        }
        System.out.println("The sort list is");
        System.out.println(sortedSet);
        System.out.println("The first element of  the set is:"
                    +(Integer)sortedSet.first());
        System.out.println("The last element of  the set is:"
                +(Integer)sortedSet.last());


    }


}
