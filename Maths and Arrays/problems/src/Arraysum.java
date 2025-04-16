public class Arraysum {
    public void arraySum(){
        int arr[] = {2,3,4,5,6};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Sum of all elements in array is: " + sum);
    }
}
