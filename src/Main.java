import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class Main {
    public static void main(String[] args) {
        Queue <Person> queuePerson = new ArrayDeque<>();
        for (Person p : generateClient()) {
            queuePerson.offer(p);
        }
        System.out.println("Карусель запустилась");

        while (!queuePerson.isEmpty()){
            if (queuePerson.peek().getTicketsAmount() > 0){
                System.out.println((queuePerson.peek()) + " прокатился!");
                queuePerson.peek().setTicketsAmount(queuePerson.peek().getTicketsAmount()-1);
                queuePerson.offer(queuePerson.poll());
            }
            else {
                System.out.println(queuePerson.poll()+ " билеты закончились!");
            }
        }
        System.out.println("Людей в очереди нет! У всех закончились билеты.");
    }

    public static List<Person> generateClient() {
        LinkedList<Person> list = new LinkedList<>();
        list.add(new Person("Юрий", "Лапшин", 7));
        list.add(new Person("Михаил", "Лапшин", 5));
        list.add(new Person("Иван", "Лапшин", 4));
        list.add(new Person("Елена", "Лапшина", 3));
        list.add(new Person("Ольга", "Лапшина", 1));
        return list;
    }
}