import java.util.Scanner;
class Armstrong
{  
  public static void main(String[] args)  {  
    int num;
    Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        num=sc.nextInt();

  
    Armstrong obj=new Armstrong ();
    obj.calculate(num);
    }
static int calculate( int n)
{
    int c=0,a,temp;

    temp=n;  
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println("armstrong number");   
    else  
        System.out.println("Not armstrong number");   
return 0 ;
   }  

}

