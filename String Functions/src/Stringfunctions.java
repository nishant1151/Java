public class Stringfunctions {
    public int stringLength(String str){
        return str.toCharArray().length;
    }
    public boolean compareStrings(String str1,String str2){
        int i=0;
        boolean flag =true;
        char [] arr1=str1.toCharArray();
        char [] arr2=str2.toCharArray();

        if(arr1.length==arr2.length){
        for(i=0;i<=arr1.length-1;i++){
            if(arr1[i]!=arr2[i]){
                flag=false;
                break;
            }
        }
        return flag;
        }
        return false;
    }

    public String stringCopy(String str1){
        int i=0;
        char arr1[]=str1.toCharArray();
        char arr2[] = new char[arr1.length];
        for(i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];
        }
        return String.copyValueOf(arr2)  ;

    }

    public String stringConcat(String str1,String str2){
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
        char arr3[]=new char[arr1.length+arr2.length];

        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr3[i+arr1.length]=arr2[i];
        }
        return String.copyValueOf(arr3);
    }

    public String reverseString(String str){
        char temp;
        char arr[]=str.toCharArray();
        int len=arr.length;
        for(int i=0;i<len/2;i++){
            temp=arr[len-i-1];
            arr[len-i-1]=arr[i];
            arr[i]=temp;
        }
        return String.copyValueOf(arr);
    }


    public String convertToUpperCase(String str){
        char arr[]=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=97 && arr[i]<=122){
                arr[i]= (char) (arr[i]-32);
            }
        }
return String.copyValueOf(arr);
    }

    public String convertToLowerCase(String str){
        char arr[]=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=65 && arr[i]<=90){
                arr[i]= (char) (arr[i]+32);
            }
        }
        return String.copyValueOf(arr);
    }

}
