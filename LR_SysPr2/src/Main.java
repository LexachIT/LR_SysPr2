import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Integer> sequence = new ArrayList<>();
        // Заполнение списка случайными числами
        for (int i = 0; i < 10; i++) {
            sequence.add((int) (Math.random() * 100));
        }
        int R = findMaximalR(sequence);
        System.out.println(R >= 0 ? "Успех: R = " + R : "-1 \n Не удалось найти число R");
    }
    private static int findMaximalR(List<Integer> sequence) {
        int maxR = -1;
        // Проверка элементов массива
        for (int i = 0; i < sequence.size(); i++) {
            for (int j = i + 1; j < sequence.size(); j++) {
                int product = sequence.get(i) * sequence.get(j);
                if (product % 14 == 0 && product > maxR) {
                    maxR = product;
                }
            }
        }
        return maxR;
    }
}