import java.util.Scanner;
class Revnum
{
public static void main(String args[])
{
int num, rev=0, rem;
Scanner scan = new Scanner(System.in);
num = scan.nextInt();
while(num != 0)
{
rem = num%10;
rev = rev*10 + rem;
num = num/10;
}
System.out.print(rev);
}
}