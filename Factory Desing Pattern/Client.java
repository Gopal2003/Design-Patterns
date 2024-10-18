public class Client {
    public static void main(String[] args) {
        FactoryClass getDetails = new FactoryClass();

        Employee employee = getDetails.getEmployee("WEB DEVELOPER");
        System.out.println(employee.salary());

        Employee employee2 = getDetails.getEmployee("ANDROID DEVELOPER");
        System.out.println(employee2.salary());
    }
}
