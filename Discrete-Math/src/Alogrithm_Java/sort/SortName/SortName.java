package Alogrithm_Java.sort.SortName;

public class SortName {
    public static void swap(String[] arr, int i, int j){
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void display(String[] arr){
        for (int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static boolean isPerson1GatherThanPerson2(String str1, String str2){
        int n = Math.min(str1.length(), str2.length());
        boolean res = true;
        for(int i = 0 ;i < n; i++){
            if(str1.charAt(i) < str2.charAt(i)){
                res = false;
                break;
            }
        }
        if(res && str1.length() < str2.length()){
            res = false;
        }
        return res;
    }
    public static void main(String[] args) {
        String[] arr = {"Kien_Nguyen","Tuan_Tran","Long_Nguyen","Ly_Ngoc","Hai_Vo","An_Nguyen","Kien_Phong"};
        for (int i = 0; i < arr.length - 1; i++) {// duyệt các phần tử trong arr
            String[] person1 = arr[i].split("_");
            for (int j = i + 1; j < arr.length; j++) { // duyệt các phần tử tiếp đó
                String[] person2 = arr[j].split("_");
                if(!isPerson1GatherThanPerson2(person1[0], person2[0])){// nếu first name của người 1 nhỏ hớn first name của người 2
                    //thì swap vị trí
                    swap(arr, i, j);
                }
//                else if(person1[0].compareTo(person2[0]) == 0 && person1[1].compareTo(person2[1]) < 0){
//                    //nếu first name giống nhau kiểm tra tên family name theo các tương tự
//                    swap(arr, i, j);
//                }
            }
        }
        display(arr);
    }
}
