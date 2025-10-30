import  java.util.Scanner;


public class input {
    public  static  void  main(String[] args){
        System.out.println("working file ");

        Scanner cs = new Scanner(System.in);

        System.out.println("add tow numbers");

        System.out.println("first number");
        int number1 = cs.nextInt();
        System.out.println("scoded number");
        int number2 = cs.nextInt();
        System.out.println("the sum is ");
        int result = number1 + number2;
        System.out.println(result);
    }
}
