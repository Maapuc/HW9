import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println(" Задача № 1 ");
            System.out.println();

            int[] month = {11111, 22222, 33333, 44444, 55555};
            int sum = 0;
            for (int i = 0; i < month.length; i++) {
                sum += month[i];
            }
            System.out.println(" Сумма трат за месяц составила " + sum + " рублей ");
        }

        {
            System.out.println();
            System.out.println(" Задача № 2 ");
            System.out.println();
            int[] month = {11111, 22222, 33333, 44444, 55555};
            int min = month[1];
            int max = month[0];
            for (int i = 0; i < month.length; i++) {
                if (month[i] < min) {
                    min = month[i];
                }
                if (month[i] > max) {
                    max = month[i];
                }
            }
            System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей ");
        }
        {
            System.out.println();
            System.out.println(" Задача № 3 ");
            System.out.println();

            int[] month = {11111, 22222, 33333, 44444, 55555};
            int sum = 0;
            for (int i = 0; i < month.length; i++) {
                sum += month[i];
            }
            double middle = sum / 4.0;
            System.out.println(" Средняя сумма трат за месяц составила " + middle + " рублей ");
        }
        {
            System.out.println();
            System.out.println(" Задача № 4 ");
            System.out.println();

            char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
            }
        }
    }
}

