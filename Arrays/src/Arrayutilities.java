import java.util.Arrays;

public class Arrayutilities {

    public static void reverseArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;

        }
    }

    public static int maxNumber(int[] arr) {

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }

    public static int minNumber(int[] arr) {

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int[] copyArray(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];


        for (int j = 0; j < arr1.length; j++) {
            arr3[j] = arr1[j];
        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[j + arr1.length] = arr2[j];
        }

        return arr3;

    }

    public static boolean arrayequals(String[] arr1, String[] arr2) {
        boolean flag = false;

        if (arr2.length == arr1.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i].equals(arr2[i])) {
                    flag = true;
                } else {
                    flag = false;
                }
            }
        }


        return flag;
    }




    public static String[] arrayCopy(String[] arr, int len) {
        String[] arr1 = new String[len];
        for (int i = 0; i < len; i++) {

                arr1[i] = arr[i];
        }
        return arr1;
    }

    public static String[] arrayFill(String [] arr,String val){
        for(int i=0;i<arr.length;i++){
            arr[i]=val;
        }
        return arr;
    }

    public static void sort(String[] arr){
        String temp = "";
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(compare(arr[i], arr[j]) == 1){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static int binarySearch(String[] arr, String value){
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while(start < end){
            mid = (start + end) / 2;
            if(compare(arr[mid], value) == 1){
                end = mid - 1;
            }else if(compare(arr[mid], value) == -1){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -(start + 1);
    }
    public static int compare(String str1, String str2){
        int len = Integer.min(str1.length(), str2.length());
        System.out.println(len+""+str1.length()+""+ str2.length());
        for(int i = 0; i < len; i++){
            if(str1.charAt(i) > str2.charAt(i)){
                return 1;
            }else if(str1.charAt(i) < str2.charAt(i)){
                return -1;
            }
        }
        if(str1.length() == str2.length()){
            return 0;
        }else if(str1.length() > str2.length()){
            return 1;
        }
        return -1;
    }

public static boolean equals(String str1, String str2){
    if(str1.length() != str2.length()){
        return false;
    }
    for(int j = 0; j < str1.length(); j++){
        if(str1.charAt(j) != str2.charAt(j)){
            return false;
        }
    }
    return true;
}}


