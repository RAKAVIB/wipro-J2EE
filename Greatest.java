import java.util.Scanner;
class Greatest{
public static void main(String args[]){
int x,y;
Scanner scan=new Scanner(System.in);
x=scan.nextInt();
y=scan.nextInt();
if(x>y)
System.out.println(+x+" is greater");
else
System.out.println(+y+" is greater");
}
}