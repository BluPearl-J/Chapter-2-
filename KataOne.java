


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


