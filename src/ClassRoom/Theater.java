package ClassRoom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Theater <K,V extends Person> {
    private K index;
    private V [] person;
    private Map <K,ArrayList<V>> map = new HashMap<>();
    Client [] clients = new Client[16];
    Critic [] critics = new Critic[16];
    Staff [] staff = new Staff[16];
    int countClient = 0;
    int countCritic = 0;
    int countStaff = 0;




    @Override
    public String toString() {
        return "Theater{" +
                "index=" + index +
                ", person=" + Arrays.toString(person) +
                ", map=" + map +
                '}';
    }

    public void checkTicket(){
        for (int i = 0; i < map.size(); i++) {

        }
    }


    public void deletePerson(int num, int index)  {

    }
    public void addPersonToLine(Person person){
        if (person instanceof Client){
            map.get(0).add((V) person);
        } else if (person instanceof Critic) {
            map.get(1).add((V) person);
        } else if (person instanceof Staff) {
            map.get(2).add((V) person);
        }
    }


    public K getIndex() {
        return index;
    }

    public void setIndex(K index) {
        this.index = index;
    }

    public V[] getPerson() {
        return person;
    }

    public void setPerson(V[] person) {
        this.person = person;
    }

    public Map<K, ArrayList<V>> getMap() {
        return map;
    }

    public void setMap(Map<K, ArrayList<V>> map) {
        this.map = map;
    }
}
