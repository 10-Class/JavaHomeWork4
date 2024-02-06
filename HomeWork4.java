package homework4;

public class HomeWork4 {
    public static void main(String[] args) {
        /* 1 Написать функцию, которая проверяет,
        что число  делится на 5 или на 7 - должна возвращать true/false */
        fiveOrSeven(49);

        /* 2 Написать функцию, которая проверяет, является ли год високосным
        или нет - должна возвращать true/false */
        year(1772);

        /* *3 Напишите функцию, которая принимает два целых числа от 25 до 75
        и возвращает true, если в обоих числах есть общая цифра */
        System.out.println("contains 76 64: " + contains(76, 64));
        System.out.println("contains 45 71: " + contains(45, 71));

        /* *4 Напишите функцию, принимающую целое число (секунды)
        и печатающую часов:минут:секунд - например, 3662 -> 1:1:2 */
        Clocks(83540);

        /* *5 Напишите функцию калькулятор курсов валюты - принимает сумму в евро и символ валюты,
        в которую нужно перевести -
        R - рубль
        D - доллар
        Y - йена
        G - фунт стершлингов
        должна возвращает сумму в выбранной валюте */
        calculator(11.0, 'E', 'Y');

    }

    //#1
    public static void fiveOrSeven(int n) {
        if (n % 5 == 0) {
            System.out.println(true);
        } else if (n % 7 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    // #2
    public static void year(int y) {
        if (y % 400 == 0) {
            System.out.println(true);
        } else if (y % 100 == 0) {
            System.out.println(false);
        } else if (y % 4 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    // #3
    public static boolean contains(int a, int b) {
        String f = "" + a;
        String s = "" + b;

        String f1 = f.substring(0, 1);
        String f2 = f.substring(1, 2);
        return s.contains(f1) || s.contains(f2);
    }

    // #4
    public static void Clocks(int t) {
        int h = t / 3600;
        int m = (t - h * 3600) / 60;
        int s = (t - h * 3600 - m * 60);
        System.out.println("" + h + ":" + m + ":" + s);
    }

    // #5 R - рубль
    //        D - доллар
    //        Y - йена
    //        G - фунт стершлингов
    public static void calculator(double sum, char in, char out) {
        double euindolar = 1.08;
        double euinyean = 159.02;
        double euinfunt = 0.85;
        double euinrub = 97.35;

        double rubindolar = 0.011;
        double rubinyean = 1.64;
        double rubinfunt = 0.0088;
        double rubineu = 0.010;

        double dolarinrub = 91.01;
        double dolarinyean = 148.86;
        double dolarinfunt = 0.80;
        double dolarineu = 0.93;

        double yeaninrub = 0.61;
        double yeanindolar = 0.0067;
        double yeaninfunt = 0.0054;
        double yeanineu = 0.0063;

        double funtinrub = 113.97;
        double funtinyean = 186.43;
        double funtindolar = 1.25;
        double fyntinfeu = 1.17;
        if (in == 'R' && out == 'D') {
            System.out.println("" + sum + in + " is " + (rubindolar * sum) + "D");
        } else if (in == 'R' && out == 'Y') {
            System.out.println("" + sum + in + " is " + (rubinyean * sum) + "Y");
        } else if (in == 'R' && out == 'G') {
            System.out.println("" + sum + in + " is " + (rubinfunt * sum) + "G");
        } else if (in == 'R' && out == 'E') {
            System.out.println("" + sum + in + " is " + (rubineu * sum) + "E");
        } else if (in == 'D' && out == 'R') {//
            System.out.println("" + sum + in + " is " + (sum * dolarinrub) + "R");
        } else if (in == 'D' && out == 'Y') {
            System.out.println("" + sum + in + " is " + (sum * dolarinyean) + "Y");
        } else if (in == 'D' && out == 'G') {
            System.out.println("" + sum + in + " is " + (sum * dolarinfunt) + "G");
        } else if (in == 'D' && out == 'E') {
            System.out.println("" + sum + in + " is " + (sum * dolarineu) + "E");
        } else if (in == 'Y' && out == 'D') {//
            System.out.println("" + sum + in + " is " + (sum * yeanindolar) + "D");
        } else if (in == 'Y' && out == 'R') {
            System.out.println("" + sum + in + " is " + (sum * yeaninrub) + "R");
        } else if (in == 'Y' && out == 'G') {
            System.out.println("" + sum + in + " is " + (sum * yeaninfunt) + "G");
        } else if (in == 'Y' && out == 'E') {
            System.out.println("" + sum + in + " is " + (sum * yeanineu) + "E");
        } else if (in == 'G' && out == 'D') {//
            System.out.println("" + sum + in + " is " + (sum * funtindolar) + "D");
        } else if (in == 'G' && out == 'Y') {
            System.out.println("" + sum + in + " is " + (sum * funtinyean) + "Y");
        } else if (in == 'G' && out == 'R') {
            System.out.println("" + sum + in + " is " + (sum * funtinrub) + "R");
        } else if (in == 'G' && out == 'E') {
            System.out.println("" + sum + in + " is " + (sum * fyntinfeu) + "R");
        } else if (in == 'E' && out == 'D') {//
            System.out.println("" + sum + in + " is " + (sum * euindolar) + "D");
        } else if (in == 'E' && out == 'Y') {
            System.out.println("" + sum + in + " is " + (sum * euinyean) + "Y");
        } else if (in == 'E' && out == 'R') {
            System.out.println("" + sum + in + " is " + (sum * euinrub) + "R");
        } else if (in == 'E' && out == 'G') {
            System.out.println("" + sum + in + " is " + (sum * euinfunt) + "G");
        } else {
            System.out.println("Такой валюты не найдено!");
        }


    }

}
