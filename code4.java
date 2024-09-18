import java.util.Scanner;

class code4{
    public static void main(String args[]){
        Scanner num=new Scanner(System.in);
        int a=num.nextInt();
        int b=num.nextInt();
        int c=num.nextInt();
        int d=a*b*c;
        int e=a+b+c;
        int avg=d/e;
        System.out.println("Average:"+avg);


    }
}