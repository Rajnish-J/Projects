class average_array{
    public static void main(String[] args) {
        int[] array = {1,2,3};
        int sum = 0;
        int average = 0;

        // addition loop
        for(int i = 0;i<array.length; i++){
            sum += array[i];
        }
        average = sum/array.length;
        System.out.println(average);
    }
}