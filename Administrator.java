package Lab2;

public class Administrator extends Employee {

    private String specialization;
    private int numOfClients;
    private String qualification;

    public Administrator() {
        super();
    }

    public Administrator(String name, int experience) {
        super(name, experience);
    }

    public Administrator(String name, int age, int experience, int salary){
        super(name, age, experience, salary);
    }

    public Administrator(String name, int age, int experience, int salary, String specialization, int numOfClients, String qualification) {
        super(name, age, experience, salary);
        this.specialization = specialization;
        this.numOfClients = numOfClients;
        this.qualification = qualification;
    }

    public void info() {
        System.out.println("Специализация: " + this.specialization + "\n" +
                "Количество принятых клиентов: " + this.numOfClients + "\n" +
                "Квалификация: " + this.qualification);
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setNumOfClients(int numOfClients) {
        this.numOfClients = numOfClients;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void ReceivingClient(String client) {
        this.numOfClients += 1;
        System.out.println("Клиент " + client + " обратился к администратору " + this.getName());
    }


    public void securityCall() {
        System.out.println("Клиент представляет угрозу. Вызывается охрана.");
    }
}
