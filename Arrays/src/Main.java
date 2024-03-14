import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        int[] arr = {100, 20, 70, 40,1, 50,157};
        int arr2[] = new int[arr.length];


        Arrayutilities arr1 = new Arrayutilities();
        arr1.reverseArray(arr);


        String str = Arrays.toString(arr);
        String[] str2 = str.split(", ");
        for (int i = 0; i < str2.length; i++) {
            System.out.println(str2[i]);
        }

        str2[0] = str2[0].replace('[', ' ');
        str2[str2.length-1] = str2[str2.length-1].replace(']', ' ');


        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(str2[i].trim());
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        System.out.println(Arrayutilities.maxNumber(arr));
        System.out.println(Arrayutilities.minNumber(arr));

        int []arr5={1,2,0,5,2};
        System.out.println(Arrays.toString(Arrayutilities.copyArray(arr,arr5)));

    }

}

