import java.util.Scanner;
class Sign{
public static void main(String args[]){
int num;
System.out.println("enter a number");
Scanner scan=new Scanner(System.in);
num=scan.nextInt();
if(num>0)
System.out.println("the number is positive");
else if(num<0)
System.out.println("the number is negative");
else if(num==0)
System.out.println("zero");
else
System.out.println(" ");
}
}