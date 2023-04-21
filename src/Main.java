public class Main {
    public static void main(String[] args) {
        CreditPaymentService oneYear = new CreditPaymentService();
        int loanAmount = 1_000_000; //Сумма кредита
        double interestRate = 9.9;  //Годовая процентная ставка
        int loanTermYear = 1;       //Срок кредита в годах
        double CreditPayment = oneYear.calculate( loanAmount, interestRate, loanTermYear);
        System.out.println("Срок кредита: " + loanTermYear + " год");
        System.out.println("Ежемесячный платеж: " + CreditPayment);

        System.out.println();

        CreditPaymentService twoYear = new CreditPaymentService();
        int loanTermYear2 = 2;
        double CreditPayment2 = twoYear.calculate(loanAmount, interestRate, loanTermYear2);
        System.out.println("Срок кредита: " + loanTermYear2 + " года");
        System.out.println("Ежемесячный платеж: " + CreditPayment2);

        System.out.println();

        CreditPaymentService threeYear = new CreditPaymentService();
        int loanTermYear3 = 3;
        double CreditPayment3 = threeYear.calculate(loanAmount, interestRate, loanTermYear3);
        System.out.println("Срок кредита: " + loanTermYear3 + " года");
        System.out.println("Ежемесячный платеж: " + CreditPayment3);

    }
}
