class ReversePrint {
    public static void main(String[] args) {
        String[] array = {"Rajnish", "Srimathi"};
        int a = array.length;

        for (int i = a - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
