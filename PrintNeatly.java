
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        String separator = "";
        for (int number: array) {
            System.out.print(separator + number);
            separator = ", ";
        }
    }
}
