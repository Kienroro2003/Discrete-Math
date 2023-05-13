package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Card {
    public static int card(int[] arr){
        int count = 0;
        int length = arr.length;
        int[] tempArr = new int[length];
        Arrays.fill(tempArr, 1);
        for (int i = 0; i < length - 1; i++) {
            if(tempArr[i] == 1){
                for (int j = i + 1; j < length; j++) {
                    if(arr[i] == arr[j]){
                        tempArr[j] = 0;
                    }
                }
                tempArr[i] = 0;
                ++count;
            }
        }
        return count;
    }
    public static int card(List<Integer> list){
        int count = 0;
        int length = list.size();
        int[] tempArr = new int[length];
        Arrays.fill(tempArr, 1);
        for (int i = 0; i < length - 1; i++) {
            if(tempArr[i] == 1){
                for (int j = i + 1; j < length; j++) {
                    if(list.get(i) == list.get(j)){
                        tempArr[j] = 0;
                    }
                }
                tempArr[i] = 0;
                ++count;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,4,2};
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);
        System.out.println("exercise.Card: " + card(list));
    }
}
