package Lab3;

public class Product {
    private String name;
    private String description;
    private int salary;
    private int count;

    public Product (String name, String description, int salary, int count){
        this.name = name;
        this.description = description;
        this.count = count;
        this.salary = salary;
    }

    public Product (String name, int salary, int count){
        this.name = name;
        this.count = count;
        this.salary = salary;
    }

    public Product(){
        System.out.println("Поля не заполнены.");
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public int getSalary() {
        return salary;
    }

    public String getDescription() {
        return description;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
