import java.util.Scanner;

public class ToyRaffle {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        Toy toy1 = new Toy("Игрушка 1", 10, 33);
        Toy toy2 = new Toy("Игрушка 2", 10, 33);
        Toy toy3 = new Toy("Игрушка 3", 10, 34);

        store.addToy(toy1);
        store.addToy(toy2);
        store.addToy(toy3);

        store.current_toys_in_store();

        store.changeToyFrequency();

        String continue_flag = "1";
        while (continue_flag.equals("1")) {
            int toy_id = store.organizeRaffle();
            store.getPrizeToy(toy_id);
            store.current_toys_in_store();
            System.out.println("Устроим лотерею ещё раз? 1 - да, любой другой символ - нет");
            Scanner in = new Scanner(System.in);
            continue_flag = in.next();
        }
    }
}
