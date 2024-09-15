package Lab2;

public class Programmer extends Employee{

    private String language;
    private int numOfProjects;
    private String professionalism;
    private int coffee;

    public Programmer() {
        super();
    }

    public Programmer(String name, int experience) {
        super(name, experience);
    }

    public Programmer(String name, int age, int experience, int salary){
        super(name, age, experience, salary);
    }

    public Programmer(String name, int age, int experience, int salary, String language, int numOfProjects, String professionalism) {
        super(name, age, experience, salary);
        this.language = language;
        this.numOfProjects = numOfProjects;
        this.professionalism = professionalism;
    }

    public void setLanguage(String object) {
        this.language = language;
    }

    public void setNumOfProjects(int numOfProjects) {
        this.numOfProjects = numOfProjects;
    }

    public void setProfessionalism(String professionalism) {
        this.professionalism = professionalism;
    }

    public void info(){
        System.out.println("Язык программирования " + this.language + "\n" +
                "Число проектов: " + this.numOfProjects + "\n" +
                "Уровень профессионализма: " + this.professionalism);
    }

    public void curTask(){
        System.out.println("Программист " + this.getName() + " что-то кодит.");
    }

    public void drinkCoffee(){
        this.coffee += 1;
        System.out.println("Программист " + this.getName() + " выпил кофе.");
    }

}
