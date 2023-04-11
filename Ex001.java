import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex001 {
    
    Scanner scanner = new Scanner(System.in);
    LinkedList<String> list = new LinkedList<>();
    
    void ReverseLinkedList() {

        boolean doexe = true;

        while (doexe) {
            String line = scanner.nextLine();

            switch (line) {
                case "print":
                    System.out.println(list);
                    break;
                case "revers":
                    Collections.reverse(list);
                    break;
                case "exit":
                    doexe = false;
                    break;            
                default:
                    list.add(line);
                    break;
            }
        }
    }

}
