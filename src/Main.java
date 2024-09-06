public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("    Task 1");

        int inMonth = 15_000;
        int total = 0;
        int i = 1;

        for (; total <= 2_459_000; i++) {
            total += inMonth;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей %n", i, total);
        }

        System.out.println();


        //Task 2
        System.out.println("    Task 2");

        int i2 = 1;

        while (i2 <= 10) {
            System.out.print(i2 + " ");
            i2++;
        }
        System.out.println();

        for (i2 = 10; i2 > 0; i2--) {
            System.out.print(i2 + " ");
        }

        System.out.println();
        System.out.println();


        //Task 3
        System.out.println("    Task 3");

        int population = 12_000_000;
        int fertility = population * 17 / 1000;
        int mortality = population * 8 / 1000;

        for (int i3 = 1; i3 <= 10; i3++) {
            population = population + fertility - mortality;
            System.out.printf("Год %d, численность населения составляет %d %n", i3, population);
        }

        System.out.println();


        //Task 4
        System.out.println("    Task 4");

        double total4 = 15000;
        double percent = 0.07;
        int i4 = 1;

        while (total4 <= 12_000_000) {
            total4 = total4 + total4 * percent;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей %n", i4, total4);
            i4++;
        }

        System.out.println();


        //Task 5
        System.out.println("    Task 5");

        int inMonth5 = 15000;
        double total5 = 0;
        double percent5 = 0.07;
        int i5 = 1;

        while (total5 <= 12_000_000) {
            total5 = total5 + inMonth5;
            total5 = total5 + total5 * percent5;
            if (i5 % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей %n", i5, total5);
            }
            i5++;
        }

        System.out.println();


        //Task 6
        System.out.println("    Task 6");

        int inMonth6 = 15000;
        double total6 = 0;
        double percent6 = 0.07;
        int i6 = 1;

        while (i6 <= 9 * 12) {
            total6 = total6 + inMonth6;
            total6 = total6 + total6 * percent6;
            if (i6 % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей %n", i6, total6);
            }
            i6++;
        }

        System.out.println();


        //Task 7
        System.out.println("    Task 7");

        int firstFriday = 7;
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.%n", day);
        }

        System.out.println();


        //Task 8
        System.out.println("    Task 8");

        for (int i8 = 0; i8 <= 2024 + 100; i8 += 79) {
            if (i8 > (2024 - 200)) {
                System.out.println(i8);
            }
        }
    }
}