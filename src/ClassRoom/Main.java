package ClassRoom;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {




        Theater<Integer, Person> theater =  new Theater();
        theater.addPersonToLine(new Critic("Чика"));
        theater.addPersonToLine(new Critic("Чика"));
        System.out.println(theater);

//        theater.addRow(0,clients);
//        theater.addRow(1,critics);
//        theater.addRow(2,staff);
//
//        theater.deletePerson(5,5);
//
//        theater.checkTicket();
    }
}
