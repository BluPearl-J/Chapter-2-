Exercises
2.7
Fill in the blanks in each of the following statements:
answer COMMENTS
 are used to document a program and improve its readability.


b) A decision can be made in a Java program with a(n) 

  answer
If control statements  if conditions else 
If(condition){}
.
c) The arithmetic operators with the same precedence as multiplication are 
% and / 
answer multiplication division remainder same precedence answer

.
d) When parentheses in an arithmetic expression are nested, the 
 set of  numbers inside parenthe-
ses is evaluated first.



e) A location in the computer’s memory that may contain different values at various times
throughout the execution of a program is called a(n) 
A variable answer
.








2.8
Write Java statements that accomplish each of the following tasks:



a) Display the message "Enter an integer: ", leaving the cursor on the same line.


Public class Message
Public static void main ( string () args) {

string  name =” Enter an integer ”;
System.out.println (“ name”)!
}
}

Compiler Javac Message.java
Java Message 


b) Assign the product of variables b and c to the int variable a.

Import java.util.Scanner
Public class Product {
Public static Void main( string() args)
 { Scanner Scanner=new scanner( System.in);

 System.out.print (“ Enter only an integer”);  //prompt user to input string 



Int b= scanner.nextlnt(); // reading integer


Int c= scanner.nextlnt()


System.out.println (Int a =b*c);
}
}

Int =b
Int =c
Int =b*c




c) Use a comment to state that a program performs a sample payroll calculation.


//This program does Sample payroll calculation answer single line

/* This program
Peforms sample calculation*/




2.9
State whether each of the following is true or false. If false, explain why.



a) Addition is executed first in the following expression: a * b / (c + d) * 5.

True Yes because in parenthesis . 



b) The following are all valid variable names: 

AccountValue,

 $value, 
value_in_$, 

ac-
count_no_1234, this is valid



US$, her_sales_in_$, his_$checking_account, X!, _$_, a@b, and
_name.

Answer 
False why underscores and special characters @, etc in declaring variables?



c) In 2 + 3 + 5 / 4, addition has the highest precedence.

False. Division has higher precedence over addition not in parenthesis.



d) The following are all invalid variable names: name@email.com, 87, x%, 99er, and 2_.



Answer True @ is not valid variable name



2.10
Assuming that x = 5 and y = 1, what does each of the following statements display?




a)
System.out.printf("x = %d%n", x + 5); 


If ×=5; y=1;
System displays number
 6 . 5+1 
Chapter 2 explains that %d is a placeholder for all decimals value[ base 10)



b)
System.out.printf("Value of %d *%d is %d\n", x, y, (x * y) ); 

System displays 5 

System displays (a text saying “value of 5*1 is 5”)




c)
System.out.printf("x is %d and y is %d", x, y); 



System displays a text saying
 ( “ X is 5 and Y is 1”)


d)
System.out.printf("%d is not equal to %d\n", (x + y), (x * y) );

System displays (“ 6 is not equal to 5”)
Because (X+y)=6 and X*Y=5


System displays ( “ 6 is not equal to 5”, (6), (5))




2.11
Which of the following Java statements contain variables whose values are not modified?
a)
int m = (p + 2) + 3; 


A  modified by adding variable p and 2 .

b)
System.out.println("m = m + 1"); 
Not modified a string prints out.

c)
int m = p / 2; 


Modified


d)
int j = k + 2; 

 modified




2.12
Given that y = ax2 + 5x + 2, which of the following are correct Java statements for this equation?
a)
y = a * x * x + 5 * x + 2;  correct

b)
y = a * x * x + (5 * x) + 2;  correct

c)
y = a * x * x + 5 * (x + 2);  wrong


d)
y = a * (x * x) + 5 * x + 2; 

Correct 


e)
y = a * x * (x + 5 * x) + 2; wrong



f)


2.13
What is the output that will be printed after execution of the following Java code snippet?
Explain why.
int p = 5;
System.out.printf("%d", p + 2 *
 4);


Answer 
5+2*4= 8+5 13 answer
System outputs (“13”)

%d outputs the decimal value of a java integer base 1.



System.out.printf("%d", p * 2 + 4);

10+4=14 answer



2.140✔️Write an application that displays the numbers 1 to 4 on the same line, with each pair of
adjacent numbers separated by one space. Use the followingtechniques:


Answer
Public class Numbers
Public static void main (string [ ] args); {
Int a = 1; 
Int b=2;
Int c = 3;
Int s= 4;
System.out.println (a, b,c,s);
}
}

Option two
Public class Numbers
Public static void main (string [ ]args);{
System.out.println (“1,2,3,4”);
}
}


a) Use one System.out.println statement.



Public class Scanner 
Scanner
Int a =1;
Int b=2;
Int c=3;
Int s =4;

System.out.println (“a, b, c, s”);
}

}



b) Use four System.out.print statements.
System .out.prinln (“ a”);
System.out println (“b”);
System.out.println (“c”);
System.out.println (“s”);
}
}



c) Use one System.out.printf statement.


System.out.printf (“%d, %d, %d, %d”  a, b, v,s );



2.15
(Arithmetic) Write an application that asks the user to enter two integers, obtains them from
the user and 

prints the square of each, 

the sum of their squares,


 and the difference of the squares (first
number squared minus the second number squared). Use the techniques shown in Fig. 2.7.




2.16
(Comparing Integers) Write an application that asks the user to enter one integer,
 obtains
it from the user and
 displays 
whether the number and its square are greater than, equal to, not equal
to, or less than the number 100. 

Use the techniques shown in Fig. 2.15.



2.17
(Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
user and
 displays the sum, 
average,
 product, smallest 
and largest of the numbers. Use the techniques
shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
representation of the average. So, if the sum of the values is 7, the average should be 2, not
2.3333….]

Answer 
Import Java.until.Scanner;
Public class Average
Public static void main ( string [ ] args ); {
Scanner input= new scanner (system.in);


System.out.print (“ Enter first integer”);


int number 1 =input .nextlnt ( ); 



System.out.print (“ Enter second integer”:);

int number 2 =input.nextlnt ( ); 



System.out.print (“ Enter third integer”);


int number 3 =input 
.nextlnt ( ); 

int average= (number 1 + number 2 + number 3 ) /3 

System.out.printf (“ average is %d %n , average ”)
//Display average 

int Product = (number 1×number 2 * number 3)
System.out.printf (“ product is %d %n , product ”)
//Display product
Math.max=()
Math.Min ()
}
}













2.18
(Displaying Shapes with Asterisks) Write an application that displays a box, an oval, an ar-
row and a diamond using asterisks (*), as follows:






2.19
What does the following code print?
System.out.printf("  ****%n ******%n*******%n ******%n  ****%n");


Answer 
It prints each * string symbol on a new line .
Line 1 ****
Line 2 ******
Line 3 *******
etc in five lines total 



2.20
What does the following code print?
System.out.println("*");

Answer
It prints a string one asterisk or multiplication symbol

System.out.println("***");

System.out.println("*****");

System.out.println("****");

System.out.println("**");

2.21
What does the following code print?
System.out.print("*");
System.out.print("***");
System.out.print("*****");
System.out.print("****");
System.out.println("**");
*********     ***       *        *
*       *   *     *    ***      * *
*       *  *       *  *****    *   *
*       *  *       *    *  







2.22
What does the following code print?
System.out.print("*");  answer string *

System.out.println("***");
Answer a string ***



System.out.println("*****");
Answer a string *****



System.out.print("****");
Answer a string ****


System.out.println("**");
Answer a string **

2.23
What does the following code print?

System.out.printf("%s%n%s%n%s%n%s%n", "  *", " ***", "*****", " ***", "  *");
*
***
******
***

Multiplication/asterisk symbol line 1

Three multiplication symbols line 2

5 multiplication symbols line 3
3 multiplication symbols line 4
One multiplication symbol line 6


On lst line  the string comma ,
On next line the string multiplication symbol
On 3rd line the string three multiplication symbols 
On 4th line the string 5 multiplication symbol 
On 5th line the string 3 multiplication symbols0
On 6th line the string one multiplica



2.24
(Largest and Smallest Integers) Write an application that reads five integers and determines
and prints the largest and smallest integers in the group. Use only the programming techniques you
learned in this chapter.

Math.min
Math.max
If else





2.25
(Divisible by 3) Write an application that reads an integer and determines and prints
whether it’s divisible by 3 or not.


 [Hint: Use the remainder operator. A number is divisible by 3 if
it’s divided by 3 with a remainder of 0.] If x/3=0,
System.println (“%d, divisible by 3”, x)





2.26
(Multiples) Write an application that reads two integers, 



determines whether the first
number tripled is a multiple of the second number doubled, 



and prints the result.

 [Hint: Use the
remainder operator.]


Answer 
Import Java.util.scanner; //import scanner class

Public class Identifier





2.27
(Checkerboard Pattern of Asterisks) Write an application that displays a checkerboard pat-
tern, as follows:




2.28
(Diameter, Circumference and Area of a Circle) Here’s a peek ahead. In this chapter, you
learned about integers and the type 

int. Java can also represent floating-point numbers that contain
decimal points, such as 3.14159. 


Write an application that inputs from the user the radius of a circle
as an integer and prints the circle’s diameter, circumference and area using the floating-point value
3.14159 for π. Use the techniques shown in Fig. 2.7. [Note: You may also use the predefined con-
stant Math.PI for the value of π. This constant is more precise than the value 3.14159. Class Math
is defined in package java.lang. Classes in that package are imported automatically, 


so you do not
need to import class Math to use it.] Use the following formulas (r is the radius): 
diameter = 2r
circumference = 2πr
area = πr2
Do not store the results of each calculation in a variable. 





Rather, specify each calculation as the
value that will be output in a System.out.printf statement. 


The values produced by the circum-
ference and area calculations are floating-point numbers. Such values can be output with the for-
mat specifier %f in a System.out.printf statement. You’ll learn more about floating-point
numbers in Chapter 3.




2.29
(Integer Value of a Character) Here’s another peek ahead. In this chapter, you learned
about integers and the type int. Java can also represent uppercase letters, lowercase letters and a con-
siderable variety of special symbols. Every character has a corresponding integer representation. The
set of characters a computer uses together with the corresponding integer representations for those



characters is called that computer’s character set.



 You can indicate a character value in a program
simply by enclosing that character in single quotes, as in 'A'. 
You can determine a character’s integer equivalent by preceding that character with (int), as in
(int) 'A' 
An operator of this form is called a cast operator. (You’ll learn about cast operators in Chapter 4.)


The following statement outputs a character and its integer equivalent:
System.out.printf("The character %c has the value %d%n", 'A', ((int) 'A'));
When the preceding statement executes, it displays the character A and the value 65 

(from the Uni-
code® character set) as part of the string. 

The format specifier %c is a placeholder for a character (in
this case, the character 'A').




Using statements similar to the one shown earlier in this exercise,


 write an application that
displays the integer equivalents of some uppercase letters, lowercase letters, digits and special sym-
bols.




 Display the integer equivalents of the following: A B C a b c 0 1 2 $ * + / and the blank
character.

(int)’A’
(int)’B’
(int)C’
(Int)a
(Int)b
(Int)c
(Int)0








2.30
(Separating the Digits in an Integer) Write an application that inputs one number consist-
ing of five digits from the user,


 separates the number into its individual digits and 



prints the digits
separated from one another by three spaces each. For example, if the user types in the number 42339,

the program should print 
Assume that the user enters the correct number of digits. What happens when you enter a
number with more than five digits? 


What happens when you enter a number with fewer than five
digits?
 [Hint: It’s possible to do this exercise with the techniques you learned in this chapter. You’ll
need to use both division and remainder operations to “pick off” each digit.]



2.31
(Table of Squares and Cubes) Using only the programming techniques you learned in this
chapter, write an application that calculates the squares and cubes of the numbers from 0 to 10 and
prints the resulting values in 


table format, as shown below.

Answer
Public class Calculate 
Public static void main ( string [ ] args) {
int  z= 0;
int a=1;
int b= 2;
int c=3;
int d= 4;
e=5;
f= 6;
g=7;
H=8;
I=9;
L=10);


int squares = int Cube = z^2 +a^2+ b^2 +c^3 +d^2 + e^2 + f^2 + g^ 2 +H^2 + I^2 +L^2;


int Cube = z^3 +a^3+ b^3 +c^3 +d^3 + e^3 + f^3 + g^ 3 +H^3 + I^3 +L^3;


System.out.printf (table )
}
}






 
2.32
(Negative, Positive and Zero Values) Write a program that inputs five numbers and deter-
mines and prints the number of negative numbers input, the number of positive numbers input and
the number of zeros input.


Answer 
import Java.util.Scanner 
Public class comparison {
Public static void main (string [ ] args )
 { 
Scanner input =new Scanner (system.in);


System.out.print (“ Enter first integer ”); //prompt


int number 1 = input.nextlnt ( ); //collect or read first number from user

System.out.print (“ Enter second integer”); //prompt 2
int number 2 =input.nextlnt ( ) // collect number 2

System.out.print (“ Enter second integer”); //prompt 3
int number 3 =input.nextlnt ( ) // collect number 3

System.out.print (“ Enter second integer”); //prompt 4
int number 4 =input.nextlnt ( ) // collect number 4

System.out.print (“ Enter second integer”); //prompt 5
int number 5 =input.nextlnt ( ) // collect number 5

if ( number 1<0)
system.out.print ( “ this inputted number is negative and less than 0”);
}
if (number 1>0)
system.out.print (“ this  input number is positive ”)
}
if (number 1=0)
system.out.print (“ this  input number  equals zero ”)
}

if ( number 2<0)
system.out.print ( “ this inputted number is negative and less than 0”);
}
if (number 2>0)
system.out.print (“ this  input number is positive ”)
}
if (number 2=0)
system.out.print (“ this  input number  equals zero ”)
}

if ( number 3<0)
system.out.print ( “ this inputted number is negative and less than 0”);
}
if (number 3>0)
system.out.print (“ this  input number is positive ”)
}
if (number 3=0)
system.out.print (“ this  input number  equals zero ”)
}

if ( number 4<0)
system.out.print ( “ this inputted number is negative and less than 0”);
}
if (number 4>0)
system.out.print (“ this  input number is positive ”)
}
if (number 4=0)
system.out.print (“ this  input number  equals zero ”)
}
if ( number 5<0)
system.out.print ( “ this inputted number is negative and less than 0”);
}
if (number 5>0)
system.out.print (“ this  input number is positive ”)
}
if (number 5
=0)
system.out.print (“ this  input number  equals zero ”)
}



















Making a Difference
2.33
(Body Mass Index Calculator) 
