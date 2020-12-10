import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Task {
    static Logger LOGGER;
    private static Scanner scanner = new Scanner(System.in);

    static {
        try {
            LOGGER = Logger.getLogger(Task.class.getName());
        } catch (Exception ignore) {
            ignore.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        try {
            LOGGER.log(Level.INFO, "Создаём цикл с постусловием");
            while (true) {
                LOGGER.log(Level.WARNING, "Если будет введено не целочисленное число, будет ошибка");
                System.out.println("Введите x");
                int x = scanner.nextInt();
                if (x == 0) {
                    break;
                }
                list.add(x);
            }
            int mpr = calc(list);
            System.out.println("Введёно чисел " + list.size());
            System.out.println("Введите res");
            int res = scanner.nextInt();
            System.out.println("Контрольное значение " + res);
            System.out.println("Вычисленное значение " + mpr);
            System.out.print("Значения");
            if (res != mpr) {
                System.out.print(" не");
            }
            System.out.print(" совпали");
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "что-то пошло не так", e);
        }
    }

    public static int calc(List<Integer> list) {
        try {
            int mk7 = 0, max = 0, mpr = 0;
            for (int x : list) {
                if ((x % 7 == 0) && (x % 49 != 0) && (x > mk7)) {
                    mk7 = x;
                }
                if ((x > max) && (x % 7 != 0)) {
                    max = x;
                }
            }
            mpr = mk7 * max;
            if (mpr == 0) {
                mpr = 1;
            }
            return mpr;
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Ошибка расчета", e);
            throw e;
        }
    }
}