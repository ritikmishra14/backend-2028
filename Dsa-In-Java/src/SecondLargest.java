public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = {2,9,8,100,12,50 , 100};

        int largest = Integer.MIN_VALUE;
        int secondLarget = Integer.MIN_VALUE;// 50

// Corner Cases:
//        Array has negatives
//        Array is empty
//        Array has duplicates
        for(int i=0; i<arr.length; i++) {
            if(arr.length == 0) {
                secondLarget = -1;
            }
            if(arr[i] > largest) {
                secondLarget = largest;
                largest = arr[i];
            }
            else if( arr[i] > secondLarget && arr[i] != largest) {
                secondLarget = arr[i];

            }
        }




        System.out.println(secondLarget);
    }
}
