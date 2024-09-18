import java.util.Scanner;

class code5{
    public static void main(String args[]){
        Scanner stu=new Scanner(System.in);
        String name=stu.nextLine();
        double score=stu.nextDouble();
        stu.nextLine();
        String dept=stu.nextLine();
        System.out.println("My name is:"+name+"\n"+"My score is:"+score/10+"/10"+"\n"+"My department is:"+dept);
    }
}