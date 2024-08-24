package ClassRoom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Theater <K,V extends Person> {
    private K index;
    private V [] person;
    private Map <K,ArrayList<V>> map = new HashMap<>();




    @Override
    public String toString() {
        return "Theater{" +
                "index=" + index +
                ", person=" + Arrays.toString(person) +
                ", map=" + map +
                '}';
    }

    public void checkTicket() {
        for (int i = 0; i < map.size(); i++) {
            K key = (K) map.keySet().toArray()[i];
            ArrayList<V> peopleList = map.get(key);
            if (peopleList != null) {
                for (int j = 0; j < peopleList.size(); j++) {
                    System.out.println( "ряд: " + (i+1) + ", место: " + (j + 1 ) + ", " + peopleList.get(j));
                }
            }
        }
    }




    public void addPersonToLine(Person person) {
        ArrayList<V> peopleList = map.get(person.getClass());
        if (peopleList == null) {
            peopleList = new ArrayList<>();
            map.put((K) person.getClass(), peopleList);
        }
        peopleList.add((V) person);
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
