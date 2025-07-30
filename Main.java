import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");

        Queue<String> queue = new LinkedList(firstClients);

        while (!queue.isEmpty()) {
            System.out.println(queue.peek() + " сделал новый маникюр");
            if (Math.random() < 0.5) { // проверка условия, которое срабатывает с 50% вероятностью
                queue.offer("friend off " + queue.poll());
                System.out.println(queue.poll() + " сделал новый маникюр");
            } else {
                queue.poll();
            }
        }
    }
}
