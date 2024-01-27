public class Main {
    public static void main(String[] args) {
        EmployeesBuilder employee1 = new EmployeesBuilder();
        EmployeesBuilder employee2 = new EmployeesBuilder();

        employee1.setId(1)
                .setName("John Doe")
                .setYas(35)
                .setUnvan("Manager")
                .setAddress("Kartal / İstanbul");
        employee2.setId(2)
                .setName("Jane Doe")
                .setYas(25)
                .setUnvan("Analyst")
                .setAddress("Kadıköy / İstanbul");
        System.out.println(employee1);
        System.out.println(employee2);

        EmployeesSingleton employee3 = EmployeesSingleton.getInstance();
        employee3.setId(3);
        employee3.setName("William Doe");
        System.out.println("id : " + employee3.getId() + ", Name : " + employee3.getName());
    }
}