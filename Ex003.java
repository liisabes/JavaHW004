import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex003 {
    Scanner scanner = new Scanner(System.in);
    LinkedList<Integer> list = new LinkedList<>();

    void SummLinkedList() {

        System.out.println("Введите количество раз ввода цифр: ");
        String count = scanner.nextLine();
        int countofdo = Integer.parseInt(count);
        
        System.out.println("Введите цифры: ");
        for (int i = 0; i < countofdo; i++) {

            String line = scanner.nextLine();
            int number = Integer.parseInt(line);

            list.add(number);
            Integer summ = 0;
            Iterator<Integer> iterator = list.iterator();
            while (iterator.hasNext()) {
                summ += iterator.next();
            }
            System.out.println("Сумма элементов: " + summ);
        }

    }
}
