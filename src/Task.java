import sun.applet.Main;

import java.util.Scanner;


import java.util.logging.Level;

import java.util.logging.Logger;


public class Task {
    static Logger LOGGER;
    private static Scanner scanner = new Scanner(System.in);

    static {
        try {
            LOGGER = Logger.getLogger(Main.class.getName());
        } catch (Exception ignore) {
            ignore.printStackTrace();
        }
    }

    public static void main(String[] args) {

        try {
            int i, mk7 = 0, max = 0, mpr = 0, x, res, n = 0;
            LOGGER.log(Level.INFO, "Создаём цикл с постусловием");
            do {
                LOGGER.log(Level.WARNING, "Если будет введено не целочисленное число, будет ошибка");
                System.out.println("Введите х");
                x = scanner.nextInt();
                if ((x % 7 == 0) && (x % 49 != 0) && (x > mk7)) mk7 = x;
                if ((x > max) && (x % 7 != 0)) max = x;
                n++;
            } while (x != 0);
            System.out.println("Введите res");
            res = scanner.nextInt();
            mpr = mk7 * max;
            if (mpr == 0) mpr = 1;
            System.out.println("Введёно чисел " + (n - 1));
            System.out.println("Контрольное значение " + res);
            System.out.println("Вычисленное значение " + mpr);
            System.out.print("Значения");
            if (res != mpr) System.out.print(" не");
            System.out.print(" совпали");

        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "что-то пошло не так", e);
        }
    }
}