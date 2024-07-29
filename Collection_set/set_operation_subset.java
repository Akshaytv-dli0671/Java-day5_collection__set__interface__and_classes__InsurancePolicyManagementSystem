package Collection_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set_operation_subset {

    public static boolean issubset(Set<Integer> setA,Set<Integer> setB){
        return setB.containsAll(setA);
    }

    public static void main(String[] args) {
        //hashset;
        Set<Integer> setA=new HashSet<>();
        Set<Integer> setB=new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setB.add(1);
        setB.add(2);
        setB.add(3);
        setB.add(4);
        System.out.println("HashSet: "+issubset(setA,setB));

        //LinkedHashset
        Set<Integer> LsetA=new LinkedHashSet<>();
        Set<Integer> LsetB=new LinkedHashSet<>();
        LsetA.add(1);
        LsetA.add(2);
        LsetA.add(3);
        LsetB.add(1);
        LsetB.add(2);
        LsetB.add(3);
        LsetB.add(4);
        System.out.println("LinkedHashSet: "+issubset(LsetA,LsetB));

        //TreeSet
        Set<Integer> TsetA=new TreeSet<>();
        Set<Integer> TsetB=new TreeSet<>();
        TsetA.add(1);
        TsetA.add(2);
        TsetA.add(3);
        TsetB.add(1);
        TsetB.add(2);
        TsetB.add(3);
        TsetB.add(4);
        System.out.println("TreeSet: "+issubset(TsetA,TsetB));


    }
}
