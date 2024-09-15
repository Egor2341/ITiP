package Lab2;

public abstract class Employee {

    private String name;
    private int age;
    private int experience;
    private int salary;
    private static int counter;

    public Employee() {
        System.out.println("Необходимо передать параметры");
    }

    public Employee(String name, int experience) {
        this.name = name;
        this.experience = experience;
        counter += 1;
    }

    public Employee(String name, int age, int experience, int salary) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.salary = salary;
        counter += 1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void getValues() {
        System.out.println("Имя - " + this.name + "\n" +
                "Возраст - " + this.age + "\n" +
                "Опыт - " + this.experience + "\n" +
                "Зарплата - " + this.salary + " руб");
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public int getExperience(){
        return this.experience;
    }

    public int getSalary(){
        return this.salary;
    }

    public static int getCounter(){
        return counter;
    }

    public abstract void info();

}
