import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number");
        int number1 =Integer.parseInt( sc.nextLine());
        int number2 =Integer.parseInt( sc.nextLine());
        System.out.println("Enter one operation");
        String operation = sc.nextLine();
        if(operation.equals("sum")){
            System.out.println(number1+number2);
        } else if (operation.equals("sub")) {
            System.out.println(number1-number2);
        } else if(operation.equals("mul")){
            System.out.println(number1*number2);
        }
        else {
            System.out.println(number1/number2);
        }
    }
}
