import java.util.Scanner;

public class UserInput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.nextLine();
        System.out.println(name);
        System.out.printf("%s",name);
        System.out.println();
        int number1 =Integer.parseInt( sc.nextLine());
        System.out.println(number1);

        String str = sc.nextLine();
        System.out.println(str);
        sc.close();
    }
}
