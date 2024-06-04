class smallest{
    public static void main(String[] args) {
        int[] array = {11,45,1,25};
        int smallest = array[0];

        //checking loop
        for(int i = 0; i<array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
            }
        }
        System.out.println("The smallest element in the array: " + smallest);
    }
}