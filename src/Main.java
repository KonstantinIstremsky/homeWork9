import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        }
        public static void task1(){
        int [] expenses = {100, 200, 300, 400, 500};
        int total = 0;
         for (int value: expenses) {
             total += value;
         }
         System.out.println("Сумма трат за месяц составила " + total + " тысяч рублей");
        }

        public static void task2(){
        int [] expenses = {100, 200, 300, 400, 500};
        int min = expenses[0];
        int max = expenses[0];
        for (int value: expenses) {
            if (value < min){
                min = value;
            }
            if (value > max){
                max = value;
            }
        }
            System.out.println("Минимальная сумма трат за день состваила " + min + " рублей");
            System.out.println("Максимальная сумма трат за день состваила " + max + " рублей");
    }

    public static void task3(){
        int [] expenses = {100, 200, 300, 400, 500};
        int total = 0;
        for (int value: expenses) {
            total += value;
    }
        double average = total / expenses.length;
        System.out.println("Средняя сумма трат за день составила " + average + " рублей");
    }

    public static void task4(){
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i>=0; i--){
        System.out.print(reverseFullName[i]);
        }
    }
    }