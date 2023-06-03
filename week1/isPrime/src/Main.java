
public class Main {

    public static void main(String[] args) {

        int number1 = 23;
        int reminder = number1 % 2;
        boolean isPrime = true;

        for (int i = 2; i < number1; i++) {
            if (number1 % i == 0)
                isPrime = false;
        }


        if (isPrime)
            System.out.println("\n" + reminder + " Left over dividing by 2\nNumber is prime");
        else
            System.out.println(" - Number is not prime");


        if (number1 == 1) {
            System.out.println("1 is not prime");
            return;
        }

        if (number1 < 2)
            System.out.println("Invalid number");
        


    }

}

