class Count{
public static void main(String args[]){
int x=10, y=70,z=7, i, c=0;
for(i=x;i<=y;i++)
{
if(i%z==0)
System.out.println(i);
c=c+1;
System.out.println(+c);
}
}
}