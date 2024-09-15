package Lab2;

public class Manager extends Employee{

    private String object;
    private int numOfSubordinates;
    private String level;

    public Manager() {
        super();
    }

    public Manager(String name, int experience) {
        super(name, experience);
    }

    public Manager(String name, int age, int experience, int salary){
        super(name, age, experience, salary);
    }

    public Manager(String name, int age, int experience, int salary, String object, int numOfSubordinates, String level) {
        super(name, age, experience, salary);
        this.object = object;
        this.numOfSubordinates = numOfSubordinates;
        this.level = level;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public void setNumOfSubordinates(int numOfSubordinates) {
        this.numOfSubordinates = numOfSubordinates;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void info(){
        System.out.println("Объект управления: " + this.object + "\n" +
                "Число подчиненных: " + this.numOfSubordinates + "\n" +
                "Уровень менеджера: " + this.level);
    }

    public void dismissalSubordinate(String name){
        this.numOfSubordinates -= 1;
        System.out.println("Менеджер " + this.getName() + " уволил подчиненного " + name);
    }

    public void meeting(){
        System.out.println("Менеджер " + this.getName() + " проводит собрание своей команды.");
    }

}
