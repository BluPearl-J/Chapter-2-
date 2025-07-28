public class Difference {
    public static void main(String[] args) {
        System.out.println("RETURNING difference");
        int result = difference(8, 180);
        System.out.println("Difference is " + result);
    }

    public static int difference(int number1, int number2) {
        if (number1 >= number2)
            return (number1 - number2);
        else
            return (number2 - number1);
    }
}
