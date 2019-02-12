import java.util.Scanner;
class Factorial
{
public static void main(String args[])
{
int num, i, fact=1;
Scanner scan = new Scanner(System.in);
num = scan.nextInt();
for(i=num; i>0; i--)
{
fact = fact*i;
}
System.out.print(fact);
}
}