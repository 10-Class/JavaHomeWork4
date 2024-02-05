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
        System.out.println(number3(25, 75));

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
        calculator(11.0, 'D', 'R');

    }

    //#1
    public static void fiveOrSeven(int n) {
        if (n % 5 == 0) {
            System.out.println("Число равно пяти");
        } else if (n % 7 == 0) {
            System.out.println("Число равно семи");
        } else {
            System.out.println("Число не равно пяти или семи");
        }
    }

    // #2
    public static void year(int y) {
        if (y % 400 == 0) {
            System.out.println("Високосный");
        } else if (y % 100 == 0) {
            System.out.println("Не високосный");
        } else if (y % 4 == 0) {
            System.out.println("Високосный");
        } else {
            System.out.println("Не високосный");
        }
    }

    // #3
    public static String number3 (int one, int two){
        if (one >= 25 && one <= 75 && two >= 25 && two <= 75) {
            return "True";
        }else {
            return "False";
        }
    }

    // #4
    public static void Clocks(int seconds) {
        int h = seconds / 3600;
        int m_s = seconds - 23 * 3600;
        int m = m_s / 60;
        int s = m_s - m * 60;
        System.out.println("" + h + ":" + m + ":" + s);
    }

    // #5 R - рубль
    //        D - доллар
    //        Y - йена
    //        G - фунт стершлингов
    public static void calculator(double sum, char in, char out) {
        double rubindolar = 0.011;
        double rubinyean = 1.64;
        double rubinfunt = 0.0088;

        double dolarinrub = 91.01;
        double dolarinyean = 148.86;
        double dolarinfunt = 0.80;

        double yeaninrub = 0.61;
        double yeanindolar = 0.0067;
        double yeaninfunt = 0.0054;

        double funtinrub = 113.97;
        double funtinyean = 186.43;
        double funtindolar = 1.25;
        if (in == 'R' && out == 'D') {
            System.out.println("" + sum + in + " is " + (rubindolar * sum) + "D");
        } else if (in == 'R' && out == 'Y') {
            System.out.println("" + sum + in + " is " + (rubinyean * sum) + "Y");
        } else if (in == 'R' && out == 'G') {
            System.out.println("" + sum + in + " is " + (rubinfunt * sum) + "G");
        } else if (in == 'D' && out == 'R') {//
            System.out.println("" + sum + in + " is " + (sum * dolarinrub) + "R");
        } else if (in == 'D' && out == 'Y') {
            System.out.println("" + sum + in + " is " + (sum * dolarinyean) + "Y");
        } else if (in == 'D' && out == 'G') {
            System.out.println("" + sum + in + " is " + (sum * dolarinfunt) + "G");
        } else if (in == 'Y' && out == 'D') {//
            System.out.println("" + sum + in + " is " + (sum * yeanindolar) + "D");
        } else if (in == 'Y' && out == 'R') {
            System.out.println("" + sum + in + " is " + (sum * yeaninrub) + "R");
        } else if (in == 'Y' && out == 'G') {
            System.out.println("" + sum + in + " is " + (sum * yeaninfunt) + "G");
        } else if (in == 'G' && out == 'D') {//
            System.out.println("" + sum + in + " is " + (sum * funtindolar) + "D");
        } else if (in == 'G' && out == 'Y') {
            System.out.println("" + sum + in + " is " + (sum * funtinyean) + "Y");
        } else if (in == 'G' && out == 'R') {
            System.out.println("" + sum + in + " is " + (sum * funtinrub) + "R");
        } else {
            System.out.println("Такой валюты не найдено!");
        }


    }

}
