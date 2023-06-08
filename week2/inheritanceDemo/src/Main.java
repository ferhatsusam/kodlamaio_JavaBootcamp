public class Main {

    public static void main(String[] args) {

        CreditUI creditUI = new CreditUI();

        CreditUI.CreditCalculation(new TeacherCreditManager());

        // CreditUI.CreditCalculation(new MilitaryCreditManager());
        // CreditUI.CreditCalculation(new AgricultureCreditManager());

    }
}
