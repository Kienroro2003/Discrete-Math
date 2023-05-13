package exercise;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ex_01_06 extends Ex_01_05{
    public static void main(String[] args) throws IOException {
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        List<Integer> listC = new ArrayList<>();
        init(listA, "src/data/dataA.inp");
        init(listB, "src/data/dataB.inp");
        init(listC, "src/data/dataC.inp");
        sort(listA);
        sort(listB);
        sort(listC);
        removeDuplicates(listA);
        removeDuplicates(listB);
        removeDuplicates(listC);
        System.out.print("List A: ");
        System.out.println(listA);
        System.out.print("List B: ");
        System.out.println(listB);
        System.out.print("List C: ");
        System.out.println(listC);
        /**
         * Union set
         */
        List<Integer> temp = unionSet(listA, listB, listC);
        System.out.println("Union list A, list B and list C");
        System.out.println(temp);
        /**
         * Union subtract
         */
        temp = unionSubtract(listA, listB, listC);
        System.out.println("Union subtract list A, list B and list C");
        System.out.println(temp);
        System.out.println("Intersection list A, list B and list C");
        temp = intersect(listA, listB, listC);
        System.out.println(temp);
        /**
         * Calculate Descartes
         */
        System.out.println("Calculate Descartes");
        System.out.println(calculateCartesianProduct(listA,listB, listC));
    }
}
