public class EmployeesBuilder {
    private int id;
    private String name;
    private int age;
    private String title;
    private String address;

    public EmployeesBuilder setId(int id)
    {
        this.id = id;
        return this;
    }

    public EmployeesBuilder setName(String name)
    {
        this.name = name;
        return this;
    }

    public EmployeesBuilder setYas(int age) {
        this.age = age;
        return this;
    }

    public EmployeesBuilder setUnvan(String title) {
        this.title = title;
        return this;
    }

    public EmployeesBuilder setAddress(String address)
    {
        this.address = address;
        return this;
    }

    @Override public String toString()
    {
        return "id : " + this.id + ", Name : " + this.name + ", Age : " + this.age + ", Title : " + this.title + ", Address : " + this.address;
    }
}
