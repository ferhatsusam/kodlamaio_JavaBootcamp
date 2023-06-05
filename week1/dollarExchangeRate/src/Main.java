public class Main {


        public static void main(String[] args) {

        int expiry = 12;
        double dollarYesterday = 18.20;
        double dollarToday = 18.78;
        boolean dollarFall = true;
        String arrowDirection = "";


        if (dollarToday < dollarYesterday) {
            arrowDirection = "↓ ↓ ↓ The Dollar Fell";
            System.out.println(arrowDirection);
        }
        else if (dollarToday > dollarYesterday) {
            arrowDirection = "↑ ↑ ↑ The Dollar Rose";
            System.out.println(arrowDirection);
        }

        else {
            arrowDirection = "- The Dollar Fixed";
            System.out.println(arrowDirection);
        }



    }

}
