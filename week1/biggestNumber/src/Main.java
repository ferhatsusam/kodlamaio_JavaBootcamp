public class Main {
    public static void main(String[] args) {

        int number1 =  213;
        int number2 = 109;
        int number3 = 78;
        int biggest = number1;

        if (biggest < number2)
            biggest = number2;

        if (biggest < number3)
            biggest = number3;

        System.out.println("The biggest = " + biggest);

    }
}