import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");

        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int maxValue = scanner.nextInt();

        logger.log("Создаём и наполняем список");
        List<Integer> source = new ArrayList<>();
        Random random = new Random();
        System.out.print("Вот случайный список: ");
        for (int i = 0; i < arraySize; i++) {
            int value = random.nextInt(maxValue);
            source.add(value);
            System.out.print(value + " ");
        }
        System.out.println();

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int treshold = scanner.nextInt();

        Filter filter = new Filter(treshold);
        List<Integer> result = filter.filterOut(source);

        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
        System.out.println();

        logger.log("Завершаем программу");
    }

}
