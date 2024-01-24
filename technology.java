 class j
{
public static void main(String[]args)
{
int num=2025,count=0,n1=0,copy=num,n2=0;
  while(num>0)
  {
  count++;
num/=10;
  }
    if(count%2==0)
    {
     n1=copy/(int)Math.pow(10,count/2);
     n2=copy%(int)Math.pow(10,count/2);

     }
     else
     System.out.println("not a technology number");
     
}
}