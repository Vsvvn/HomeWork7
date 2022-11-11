public class Main {
    public static void main(String[] args) {

        System.out.println("Задание № 1");

        System.out.println("Задача № 1");
        int moneySum = 29000;
        int annualSavingsInterest = 0;
        int month = 0;

        while (annualSavingsInterest < 2_459_000) {
            month++;
            annualSavingsInterest = annualSavingsInterest + annualSavingsInterest / 100;
            annualSavingsInterest = annualSavingsInterest + moneySum;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + annualSavingsInterest + " рублей");
        }

        System.out.println();

        System.out.println("Задача № 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();

        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }

        System.out.println();
        System.out.println();

        System.out.println("Задача № 3");
        int populationState = 12_000_000;
        int populationGrowth = populationState / 1000 * 17;
        int populationDecline = populationState / 1000 * 8;
        int populationSum = populationGrowth - populationDecline;
        int totalPopulation = 0;

        for (int y = 1; y <= 10; y++) {
            totalPopulation = totalPopulation + populationSum;

            System.out.println("Год " + y + ", численность населения составляет " + (populationState + totalPopulation));
        }

        System.out.println();


        System.out.println("Задание № 2");

        System.out.println("Задача № 1");
        int money = 15_000;
        int total = 0;
        for (int j = 0; total < 12_000_000; j++) {
            total = total + (total / 100) * 7;
            total = total + money;
            System.out.println("Месяц " + j + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println();

        System.out.println("Задача № 2");
        int deposit = 15_000;
        int totalDeposit = 0;
        for (int j = 0; totalDeposit < 12_000_000; j++) {
            totalDeposit = totalDeposit + (totalDeposit / 100) * 7;
            totalDeposit = totalDeposit + deposit;
            if (j % 6 == 0) {
                System.out.println("Месяц " + j + ", сумма накоплений равна " + totalDeposit + " рублей");
            }
        }

        System.out.println();

        System.out.println("Задача № 3");
        int input = 15_000;
        int totalInput = 0;
        for (int a = 0; a <= 108; a++) {
            totalInput = totalInput + (totalInput / 100) * 7;
            totalInput = totalInput + input;
            if (a % 6 == 0) {
                System.out.println("Месяц " + a + ", сумма накоплений равна " + totalInput + " рублей");
            }
        }

        System.out.println();

        System.out.println("Задача № 4");
        int friday = 5;

        for (; friday < 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }

        System.out.println();


        System.out.println("Задание № 3");
        System.out.println("Задача № 1");
        int comet = 79;
        int theBeginningOfTheCalculationPeriod = 1822;
        int completionOfTheSettlementPeriod = 2122;

        while (theBeginningOfTheCalculationPeriod < completionOfTheSettlementPeriod) {
            theBeginningOfTheCalculationPeriod++;
            if (theBeginningOfTheCalculationPeriod % comet == 0) {
                System.out.println(theBeginningOfTheCalculationPeriod);
            }
        }

        System.out.println();

        System.out.println("Задача № 2");

        int number = 2;
        int multiply;

        for (int j = 1; j <= 10; j++) {
            multiply = 2 * j;
            System.out.println(number + "*" + j + "=" + multiply);
        }
    }
}