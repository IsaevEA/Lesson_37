package ClassRoom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {




        Theater<Integer, Person> theater =  new Theater();

        theater.addPersonToLine(new Client("Чика"));
        theater.addPersonToLine(new Client("тима"));
        theater.addPersonToLine(new Client("Назар"));
        theater.addPersonToLine(new Critic("Муха"));
        theater.addPersonToLine(new Staff("Кутя"));

        theater.checkTicket();



//        theater.addRow(0,clients);
//        theater.addRow(1,critics);
//        theater.addRow(2,staff);
//
//        theater.deletePerson(5,5);
//
//        theater.checkTicket();
    }
}
