


public class KataOne {

public static boolean isPrime(int number) {
for (int divisor = 2; divisor <= number / 2; divisor++) {
if (number % divisor == 0) { 
 }
}

 return true; // Number is prime
}

public static void main (String[] args) {

System.out.println(KataOne.isPrime(7));  
System.out.println(KataOne.isPrime(9));  
}
}





MinusSubtract.java

public class MinusSubtract {


public static int difference(int i1, int i2) {
int result = i2-i1;


return result;
}

public static void main(String[] args) {
System.out.println("Difference of 1 and 10 is " + difference(1, 10));
System.out.println("Difference of20 and 37 is " + difference(20, 37));
System.out.println("Difference of35 and 49 is " + difference(35, 49));
}
}

