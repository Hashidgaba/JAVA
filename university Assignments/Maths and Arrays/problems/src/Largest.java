public class Largest {
    public void maxElement(){
        int arr[] = {2,3,4,5,9,12};
        System.out.println("Elements of the array is : ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("largest Number in array is : " + max);
    }
}
