package Lab3;

import java.util.LinkedList;

public class HashTable<K, V> {
    private LinkedList<Element<K, V>>[] table;
    private int countBackets;
    private int size;
    private  LinkedList<K> keys = new LinkedList<>();

    public HashTable() {
        countBackets = 5;
        table = new LinkedList[countBackets];
    }

    private int hash(K key, int countBackets) {
        int index = key.hashCode() % countBackets;
        return index < 0 ? index * -1 : index;
    }
    public int getIndex(K key) {
        int index = key.hashCode() % countBackets;
        return index < 0 ? index * -1 : index;
    }

    private void expansion() {
        LinkedList<Element<K, V>>[] newTable = new LinkedList[countBackets * 2];
        for (K key : keys) {
            int index = hash(key, countBackets*2);
            if (newTable[index] == null) {
                newTable[index] = new LinkedList<>();
            }
            newTable[index].add(new Element<>(key, get(key)));
        }
        countBackets*=2;
        table = newTable;

    }


    public void put(K key, V value) {
        if (size == countBackets) {
            expansion();
        }
        int index = hash(key, countBackets);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }
        for (Element<K, V> element : table[index]) {
            if (element.getKey().equals(key)) {
                element.setValue(value);
                return;
            }
        }
        table[index].add(new Element<>(key, value));
        keys.add(key);
        size++;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public V get(K key) {
        int index = hash(key, countBackets);
        for (Element<K, V> element : table[index]) {
            if (element.getKey().equals(key)) {
                return element.getValue();
            }
        }
        return null;
    }

    public void remove(K key) {
        int index = hash(key, countBackets);
        for (Element<K, V> element : table[index]) {
            if (element.getKey().equals(key)) {
                table[index].remove(element);
                keys.remove(key);
                size--;
                return;
            }
        }
    }


}
