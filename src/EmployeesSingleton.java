public class EmployeesSingleton {
    private static EmployeesSingleton instance;
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeesSingleton(){

    }

    public static EmployeesSingleton getInstance(){

        if (instance == null){
            instance = new EmployeesSingleton();
        }

        return instance;
    }
}
