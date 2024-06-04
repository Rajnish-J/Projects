class copy_reverse_array{
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        // empty array
        int[] arr2 = new int[3];

        //loop for copying
        for(int i = 0; i<arr2.length; i++){
            arr2[i] = arr1[i];
        }

        //loop for reverse printing
        for(int i = arr2.length - 1; i>=0; i--){
            System.out.println(arr2[i]);
        }
    }
}