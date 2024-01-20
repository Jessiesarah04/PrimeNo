//Test program 
import java.util.Scanner;
public class calculator{
    public static void diff(int num1,int num2){
        double result;
        result=num1-num2;
        System.out.println(num1+"-"+num2+" = "+result);
    }
    public static void main(String args[]){
        int num1,num2,result;
        String op;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        num1=Sc.nextInt();
        num2=Sc.nextInt();
        System.out.println("Enter the operations to be peformed(+,-,*,/,):");
        op=Sc.next();
        switch(op)
        {
            case"+":result=num1+num2;
            System.out.println("Addition of two numbers:"+result);
                break;
            case"-":diff(num1,num2);
                break;
            case"*":result=num1*num2;
            System.out.println("Product of two numbers:"+result);
                break;
            case"/":result=num1/num2;
            System.out.println("division of two numbers:"+result);
                break;
        }
    }
}