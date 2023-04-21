public class CreditPaymentService {
    public static double calculate(int loanAmount, double interestRate, int loanTermYear) {
        int loanTermMonth = loanTermYear * 12;     //Срок кредита в месяцах
        double monthlyRate = interestRate / 12 / 100; //Месячная процентная ставка
        double a = 1 + monthlyRate;
        double a1 = Math.pow(a, loanTermMonth);
        String a2 = String.format("%.10f", a1); //
        System.out.println();
        System.out.println();
        double monthlyPayment = (loanAmount * monthlyRate * a1) / (a1 - 1);
        return (int) monthlyPayment;
    }
}
