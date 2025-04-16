public class Reverse {
    public void  reverseArray(){
        int arr[] = {1,4,5,7,9,12};

        System.out.println("Elements of the array is : ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Elements of the array in Reverse order is  : ");
        for (int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
