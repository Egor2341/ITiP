package Lab2;

public class Backend extends Programmer{
    private String subd;
    private int numOfroutes;
    private String framework;

    public Backend() {
        super();
    }

    public Backend(String name, int experience) {
        super(name, experience);
    }

    public Backend(String name, int age, int experience, int salary){
        super(name, age, experience, salary);
    }

    public Backend(String name, int age, int experience, int salary, String subd, int numOfroutes, String framework) {
        super(name, age, experience, salary);
        this.subd = subd;
        this.numOfroutes = numOfroutes;
        this.framework = framework;
    }

    public void setSubd(String subd) {
        this.subd = subd;
    }

    public void setNumOfroutes(int numOfroutes) {
        this.numOfroutes = numOfroutes;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }


    @Override
    public void info(){
        System.out.println("Используемая субд: " + this.subd + "\n" +
                "Число ручек: " + this.numOfroutes + "\n" +
                "Используемый фреймворк: " + this.framework);
    }

    @Override
    public void curTask() {
        System.out.println("Программист " + this.getName() + " создает базу данных.");
    }

    public void route(){
        this.numOfroutes += 1;
        System.out.println("Программист " + this.getName() + " написал роут.");
    }
}
