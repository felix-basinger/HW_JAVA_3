import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Homework3 {
    public static void main(String[] args) {

//=========================== Задание 1 ========================================
        int randNum = new Random().nextInt(10, 16);

        ArrayList<Integer> ints = new ArrayList<>(randNum);
        for (int i = 0; i < randNum; i++) {
            ints.add(new Random().nextInt(30) + 1);
        }
        System.out.println(ints);

//        ints.removeIf(i -> i % 2 == 0);

        ArrayList<Integer> temp1 = new ArrayList<>();
        for (int i = 0; i < randNum; i++) {
            if (ints.get(i) % 2 != 0) {
                temp1.add(ints.get(i));
            }
        }
        System.out.printf("Удаление всех четных элементов списка: %s\n", temp1);

//=========================== Задание 2 ========================================

        ArrayList<Integer> temp2 = new ArrayList<>(ints);
        temp2.sort((Comparator.comparingInt(o -> o)));
        System.out.printf("Минимальное значение списка: %s\n", temp2.get(0));

//=========================== Задание 3 ========================================

        System.out.printf("Максимальное значение списка: %s\n", temp2.get(temp2.size() - 1));

//=========================== Задание 4 ========================================

        Double count = 0.0;
        double result;
        for (int i = 0; i < randNum; i++) {
            count += ints.get(i);
        }
        result =  count / ints.size();
        System.out.printf("Среднее значение элементов списка: %s\n", result);
    }
}
