public class Even {
    public void evenNumber(){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("elements in the array is : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
