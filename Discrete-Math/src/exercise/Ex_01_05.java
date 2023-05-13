package exercise;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex_01_05 {
    public static void init(List<Integer> list, String path) throws IOException {
        MyFile.read(list, path);
    }

    public static void removeDuplicates(List<Integer> list){
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if(list.get(i) == list.get(j)){
                    list.remove(j);
                    j--;
                }
            }
        }
    }

    public static void sort(List<Integer> list){
        Collections.sort(list);
    }

    public static List<Integer> unionSet(List<Integer> listA, List<Integer> listB){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < listA.size(); i++) {
            result.add(listA.get(i));
        }
        for (int i = 0; i < listB.size(); i++) {
            if(!result.contains(listB.get(i))){
                result.add(listB.get(i));
            }
        }
        return result;
    }

    public static List<Integer> unionSet(List<Integer> listA, List<Integer> listB, List<Integer> listC){
        List<Integer> result = new ArrayList<>();
        result = unionSet(listA, listB);
        result = unionSet(result, listC);
        return result;
    }
    public static List<Integer> unionSubtract(List<Integer> listA, List<Integer> listB){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < listA.size(); i++) {
            result.add(listA.get(i));
        }
        for (int i = 0; i < listB.size(); i++) {
            if(result.contains(listB.get(i))){
                result.remove(listB.get(i));
            }
        }
        return result;
    }

    public static List<Integer> unionSubtract(List<Integer> listA, List<Integer> listB, List<Integer> listC){
        List<Integer> result = new ArrayList<>();
        result = unionSubtract(listA, listB);
        result = unionSubtract(result, listC);
        return result;
    }

    public static List<Integer> intersect(List<Integer> listA, List<Integer> listB){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < listB.size(); i++) {
            if(listA.contains(listB.get(i))){
                result.add(listB.get(i));
            }
        }
        return result;
    }
    public static List<Integer> intersect(List<Integer> listA, List<Integer> listB, List<Integer> listC){
        List<Integer> result = new ArrayList<>();
        result = intersect(listA, listB);
        result = intersect(result, listC);
        return result;
    }

    public static List<List<Integer>> calculateCartesianProduct(List<Integer> listA, List<Integer> listB){
        List<List<Integer>> arr3D = new ArrayList<>();
        for (int i = 0; i < listA.size(); i++) {
            arr3D.add(new ArrayList<>());
            for (int j = 0; j < listB.size(); j++) {
                arr3D.get(i).add(listA.get(i) * listB.get(j));
            }
        }
        return arr3D;
    }
    public static List<List<Integer>> calculateCartesianProduct(List<Integer> listA, List<Integer> listB, List<Integer> listC){
        List<List<Integer>> arr3D = new ArrayList<>();
        arr3D = calculateCartesianProduct(listA, listB);
        for (int i = 0; i < arr3D.size(); i++) {
            System.out.println(arr3D.get(i));
            for (int j = 0; j < arr3D.get(i).size(); j++) {
                arr3D.get(i).set(j, arr3D.get(i).get(j) * listC.get(i));
            }
        }
        return arr3D;
    }

    public static void main(String[] args) throws IOException {
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        init(listA, "src/data/dataA.inp");
        init(listB, "src/data/dataB.inp");
        sort(listA);
        sort(listB);
        removeDuplicates(listA);
        removeDuplicates(listB);
        System.out.print("List A: ");
        System.out.println(listA);
        System.out.print("List B: ");
        System.out.println(listB);
        /**
         * Union set
         */
        List<Integer> listC = unionSet(listA, listB);
        System.out.println("Union list A and list B");
        System.out.println(listC);
        /**
         * Union subtract
         */
        listC = unionSubtract(listA, listB);
        System.out.println("Union subtract list A and list B");
        System.out.println(listC);
        System.out.println("Intersection list A and list B");
        listC = intersect(listA, listB);
        System.out.println(listC);
        /**
         * Calculate Descartes
         */
        System.out.println("Calculate Descartes");
        System.out.println(calculateCartesianProduct(listA,listB));
    }
}
