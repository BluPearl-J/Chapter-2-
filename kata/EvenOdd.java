//This progrsm Passes integer values to a user function.and determines if true or false for even,odd respectively. It doesnt collect input from external keyboard scanner """
public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Displaying results");
        boolean result = isEven(8);
        System.out.println("Is the number even? " + result);
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false; 
}
}
//public static void nameyHey()
//S.out ("HELLO WE GOTTA VOID TO RETRURN STRING");
//MAIN S.OUT (); nameyHey();