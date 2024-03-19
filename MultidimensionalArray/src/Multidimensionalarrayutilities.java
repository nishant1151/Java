import java.util.Arrays;

public class Multidimensionalarrayutilities {
    public static void print2dArray(int [][] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void print2dArrayForEach(int [][]arr){
        for(int[] arr1:arr){
            for(int i:arr1){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void printReverseArray(int [][] arr){
        for(int i=arr.length-1;i>=0;i--){
            for(int j=arr[i].length-1;j>=0;j--){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }


    }
    public static void printReverseInternalArray(int[][] arr){
        for(int i=0;i< arr.length;i++){
            for(int j= arr[i].length-1;j>=0;j--){
                System.out.print(arr[i][j]+"");
            }
            System.out.println();
        }
    }

    public static int [][] reverseInternalArray(int[][] arr){
           int temp;
           for(int i=0;i< arr.length;i++){
               for(int j=0;j< arr[i].length/2;j++){
                   temp=arr[i][j];
                   arr[i][j]=arr[i][arr[i].length-j-1];
                   arr[i][arr[i].length-j-1]=temp;
               }
           }
           return arr;

    }

    public static int [][] reverseArray(int[][] arr){

        for(int i=0;i< arr.length/2;i++){
            int []temp =new int [arr[i].length];
            for(int j=0;j< arr[i].length;j++){
                temp[j]=arr[i][j];
            }
            for(int j=0;j< arr[i].length;j++){
                arr[i][j]=arr[arr.length-i-1][j];
            }
            for(int j=0;j< arr[i].length;j++){
                arr[arr.length-i-1][j]=temp[j];
            }


        }
return reverseInternalArray(arr);
    }


    public static void additionOfMatrix(int [][]arr1,int [][]arr2){

        for(int i=0;i<arr1.length;i++){

            for(int j=0;j< arr1[i].length;j++){
                arr1[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(arr1));
    }
    public static void multiplicationOfMatrix(int [][]arr1,int [][]arr2){




}
    public static int[][] transposeMatrix(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        return transpose;
    }

}
