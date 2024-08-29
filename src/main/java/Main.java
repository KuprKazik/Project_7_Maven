package ru.netology.services;
//import ru.netology.services.CalcService;

public class Main {
    public static void main(String[] args) {
        CalcService service = new CalcService();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;
        int actual = service.calculate(income, expenses, threshold);
        System.out.println("Количество месяцев отдыха в следующем году:" + actual);
    }
}
