import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3222);
        list.add(3232);
        list.add(442);
        list.add(34);
        list.add(664);
        list.add(7432);
        list.add(43);
        System.out.print(list);

        System.out.println(list.contains(442)); //to check
        list.set(0,21);
        System.out.println("List after update" + list);
        list.remove(1);
        System.out.println("list after removing" + list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        System.out.println(list);

        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
