public class Arrayutilities {

    public static void reverseArray(int[] arr){
        int temp;
        for(int i=0;i<arr.length/2;i++){
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;

        }}
        public static int maxNumber(int[] arr){

        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
            return max;

        }

    public static int minNumber(int[] arr){

        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;}

        public static int[] copyArray(int[] arr1,int[] arr2 ){
        int [] arr3= new int[arr1.length+arr2.length];


            for(int j=0;j<arr1.length;j++){
                arr3[j]=arr1[j];
            }
            for(int j=0;j<arr2.length;j++){
                arr3[j+arr1.length]=arr2[j];
            }

            return arr3;



    }

    }

