public class LabArrayT1 {
    public static void main(String [] args){
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]);
            for(int j=i;j<arr.length-1;j++){
               // System.out.print(arr[i]);
                System.out.print(arr[j]);
            }
           System.out.println();
        }
    }
}
