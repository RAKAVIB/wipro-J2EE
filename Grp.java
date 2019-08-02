import java.util.Scanner;
class Grp{
public static void main(String args[]){
int a;
Scanner scan=new Scanner(System.in);
a=scan.nextInt();
if (a<40)
System.out.println(+a+" belongs to group1");
else if(a>=40 && a<50)
System.out.println(+a+" belongs to group2");
else
System.out.println(+a+" belongs to group3");
}
}