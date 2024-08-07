public class Main {
    public static void main(String[] args) {
        String my_string = "NCC-1701";
        int i;

        System.out.println(my_string);
        int my_length = my_string.length();

        for (i = 1; i <= my_length; i++) {
            System.out.print(my_string.charAt(my_string.length() - i));
        }

        System.out.println();

        int[] my_array = new int[]{ 1, 2, 3, 4, 5 };

        for (i = 0; i < my_array.length; i++) {
            System.out.print(my_array[i]);
        }

        System.out.println();

        for (i = (my_array.length - 1); i >= 0; i--) {
            System.out.print(my_array[i]);
        }

    }

}