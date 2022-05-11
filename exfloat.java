
//team leader

//Wrokers
//kkkkkkkkkk
import java.util.Scanner;
class exfloat
{
public static void main (String args[])
{
Scanner sc=new Scanner (System.in);
System.out.println("Enter float value");
float f=sc.nextFloat();
float g=sc.nextFloat();
System.out.println("Enter char");
char c=sc.next().charAt(0);
switch(c)
{ 
case '+':      
System.out.println ("Add values : "+(f+g));
break;
case '-':
System.out.println ("sub values : "+(f-g));
break;
case '*':
System.out.println ("Mul values : "+(f*g));
break;
case '/':
System.out.println("Div values : "+(f/g));
break;
}
}
}

/*


float a
float b

cr= /
*
-
+


8 2 /  4 

8 2 *  16
*/
