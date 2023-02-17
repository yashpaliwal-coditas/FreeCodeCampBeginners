public class Operators {
    public static void main(String args[]){
        int number1 = 12;
        int number2 = 6;
        System.out.println(number1+number2);
        System.out.println(number1-number2);
        System.out.println(number1*number2);
        System.out.println(number1/number2);
        System.out.println(number1%number2);
        number1 +=5;
        System.out.println(number1);
        number1 -=5;
        System.out.println(number1);
        number1 /=5;
        System.out.println(number1);
        number1 *=5;
        System.out.println(number1);
        number1 %=5;
        System.out.println(number1);
        number1=30;
        System.out.println(number1 == number2);
        System.out.println(number1 != number2);
        System.out.println(number1 < number2);
        System.out.println(number1 <= number2);
        System.out.println(number1 > number2);
        System.out.println(number1 >= number2);

        System.out.println(number1>15 && number2>12);
        System.out.println(number1>15 || number2>12);
        boolean bool=true;
        System.out.println(bool);
        System.out.println(!bool);
        int count=0;
        System.out.println(++count);
        System.out.println(count);
        System.out.println(count++);
        System.out.println(count);
        int dcount=8;
        System.out.println(--dcount);
        System.out.println(dcount);
        System.out.println(dcount--);
        System.out.println(dcount);

    }
}
