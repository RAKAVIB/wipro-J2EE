import java.util.Scanner;
class Div{
public static void main(String args[]){
int num;
Scanner scan=new Scanner(System.in);
num=scan.nextInt();
if(num%10==0)
System.out.println("the number is divisible by 10");
else
System.out.println("the number is not divisible by 10");
}
}