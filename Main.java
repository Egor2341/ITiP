package Lab3;

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        HashTable<String, Integer> table = new HashTable<>();
        System.out.println(table.isEmpty());
        table.put("Car", 52);
        System.out.println(table.get("Car"));
        table.put("Car", 33);
        System.out.println(table.get("Car"));
        table.put("Truck", 44);
        System.out.println(table.size());
        table.remove("Truck");
        System.out.println(table.size());
        System.out.println(table.get("Truck"));
        table.put("rtwe", 56);
        table.put("gsf", 31);
        table.put("Truchsfdsfgsdk", 676);
        table.put("fadhgsser", 746);
        System.out.println(table.getIndex("Car"));
        table.put("fasdfa", 54523);
        System.out.println(table.getIndex("Car"));

        Hashtable<Integer, Product> warehouse = new Hashtable<>();
        warehouse.put(1234, new Product("Гречка", 69, 150));
        warehouse.put(1335, new Product("Филе куриное", 290, 75));
        warehouse.put(6542, new Product("Молоко деревенское", 90, 130));
        System.out.println(warehouse.size());
        System.out.println(warehouse.get(1335).getName());
        warehouse.put(6542, new Product("Молоко", 75, 130));
        System.out.println(warehouse.get(6542).getSalary());
        warehouse.remove(1234);
        System.out.println(warehouse.get(1234));
        System.out.println(warehouse.containsKey(1234));
        warehouse.get(6542).setCount(111);
        System.out.println(warehouse.get(6542).getCount());

    }

}
