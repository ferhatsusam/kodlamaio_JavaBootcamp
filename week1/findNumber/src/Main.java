public class Main {

    public static void main(String[] args) {


        int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
        int wanted = 5;
        boolean isThere = false;


        for (int sayi : numbers) {
            if (sayi == wanted) {
                isThere = true;
                break;
            }
        }


        if (isThere)
            System.out.println("There is");
        else
            System.out.println("No");



    }

}
