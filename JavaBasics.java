/*public: anyone can access it
static: method can be run without creating an
/*instance of the class containing the main method*/
/*void: method doesen't return any value
main: the name of method
println: prints a line of text to the screen

comentario:
/* this is a comment */
// comment

/*Variáveis: store data for processing
types:
int - for intergers (123 and -456)
double - for floating point or real numbers with 
optional decima points and fractional parts in
fixed or scientific notations, such as 3.9798, -76.97
string: for text such as "Hello world" - text are
encloused within double quotes. 

String name = "Ana";

char - stands for character and holds a single 
character.
booleand - true/false - conditions
boolean online = true;


Input:
Scanner a object
import java.util.Scanner;
Scanner myVar = new Scanner(System.in)
You can now read in different kinds of input data that the user enters.
Here are some methods that are available through the Scanner class:
Read a byte - nextByte()
Read a short - nextShort()
Read an int - nextInt()
Read a long - nextLong()
Read a float - nextFloat()
Read a double - nextDouble()
Read a boolean - nextBoolean()
Read a complete line - nextLine()
Read a word - next()

ex: 
public static void main(String[ ]args) {
		Scanner myVar = new Scanner(System.in);
		System.out.println(myVar.nextLine());
	}

math operators

int x = 6+3;

+ add
- sub
* mult
/ div
% modulo - resto da divisao*/

int sum1 = 50 + 10; 
int sum2 = sum1 + 66; 
int sum3 = sum2 + sum2;

int sum1 = 1000 - 10;
int sum2 = sum1 - 5;
int sum3 = sum1 - sum2;

int x = 2;
int y = 4;
int result = x + y;
System.out.println(result);

int sum1 = 1000 * 2;
int sum2 = sum1 * 10;
int sum3 = sum1 * sum2;

int sum1 = 1000 / 5;
int sum2 = sum1 / 2;
int sum3 = sum1 / sum2;

int x = 15; int y = 4;
int result = x / y;
System.out.println(result); //3

int value = 23;
int res = value % 6; 
System.out.println(res); //res is 5

int z = 8;
int k = 5;
int resu = z % k;
System.out.println(resu); //3


/*Increment Operators
provides a more convenient and compact way to
increase or decrease the value of variable by one.
ex: x = x + 1; can be simplifield to ++x

Pefix & Postfix
may be used with bothe the increment and decrement
operators.
With prefix form, the operator appears before the operand, 
while in postfix form, the operator appears after the operand. 
Below is an explanation of how the two forms work:

Prefix: Increments the variable's value and uses the new 
value in the expression. */

int a = 34;
int b = ++a; //y is 35

/*Postfix: The variable's value is first used in the expression 
and is then increased.

int c = 34;
int d = c++; 
System.out.println(d);//y is 34

/*c is first assigned to d, and is then incremented by one. 
Therefore, c becomes 35, while d is assigned the value of 34.


assignment operator (=), which assigns a value to a variable.
int value = 5;

This assigned the value 5 to a variable called value of type int.

Java provides a number of assignment operators to make it easier to write code.
Addition and assignment (+=): */
int num1 = 4;
int num2 = 8;
num2 += num1; //num2 = num2 + num1;
//num2 is 12 and num1 is 4
System.out.println(num2);//12

substraction and assignment (-=)
int n1 = 4;
int n2 = 8;
n2 -= n1; //n2 = n2 - n1;
//n2 is 4 and n1 is 4
System.out.println(n2);//4


/*String concatenation
The + (plus) operator between strings adds them together to make a new string. 
This process is called concatenation.
The resulted string is the first string put together 
with the second string.


Desicions making
conditionals statements - different actions based
on different conditions.
if - else */

if (condition) {
   // executes when the condition is true
}

/*Any of the following comparison operators may 
be used to form the condition:

< less than
> greater than
!= not equal to
== equal to
<= less than or equal to
>= greater than or equal to */

int x = 7;
if (x < 42) {
  System.out.println("Hi");
}

/*switch statement tests a variable for 
equality against a list of values. Each value 
is called a case, and the variable being switched
on is checked for each case. */

switch (expression) {
   case value1 :
     //Statements
     break; //optional
   case value2 :
     //Statements
     break; //optional
    //You can have any number of case statements.
    default : //Optional
       //Statements
}

/*- When the variable being switched on is equal to a case, 
the statements following that case will execute until a break 
statement is reached.
- When a break statement is reached, the switch terminates, and 
the flow of control jumps to the next line after the switch statement.
- Not every case needs to contain a break. If no break appears, the 
flow of control will fall through to subsequent cases until a break 
is reached.*/


while Loops


/*A loop statement allows to repeatedly execute a statement or group of statements.

A while loop statement repeatedly executes a target statement as long as a given condition is true.
For Loop
*/

for (initialization; condition; increment/decrement) {
   statement(s)
}

/*Initialization: Expression executes only once during the beginning of loop
Condition: Is evaluated each time the loop iterates. The loop executes the statement repeatedly, until this condition returns false.
Increment/Decrement: Executes after each iteration of the loop.*/

for(int x = 1; x <=5; x++){
  System.out.printl(x);
}


/*This initializes x to the value 1, and repeatedly prints the value of x, 
until the condition x<=5 becomes false. On each iteration, the statement x++ is executed, 
incrementing x by one.

You can have any type of condition and any type of increment statements in the for loop.
The example below prints only the even values between 0 and 10: */

public class Program {
    public static void main(String[] args) {
        for(int x=0; x<=10; x=x+2) {
            System.out.println(x);
        }
    }
}



do...while Loops


/*A do...while loop is similar to a while loop, except that a do...while loop 
is guaranteed to execute at least one time.
Example:*/
int x = 1;
do {
  System.out.println(x);
  x++;
} while (x<5);

/*(Notice that the condition appears at the end of the loop, so the statements in the loop execute once before it is tested.
Even with a false condition, the code will run once.
Example:*/

int x = 1;
do {
  System.out.println(x);
  x++;
} while(x < 0);

Loop Control Statements


//The break and continue statements change the loop's execution flow.
//he break statement terminates the loop and transfers execution to the statement immediately following the loop.
//Example:

int x = 1;

while(x > 0) {
  System.out.println(x);
  if(x==4){
    break;
  }
  x++;
}

//The continue statement causes the loop to skip the remainder of its body and then immediately retest its condition prior to reiterating. In other words, it makes the loop skip to its next iteration.
//Example:

for(int x=10; x<=40; x=x+10){
  if(x == 30) {
   continue;
  }
  System.out.println(x);
}

