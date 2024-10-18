public class FactoryClass {
    
    public Employee getEmployee(String employee)
    {
        if(employee.trim().equalsIgnoreCase("ANDROID DEVELOPER"))
        {
            return new AndroidDeveloper();
        }
        else if(employee.trim().equalsIgnoreCase("WEB DEVELOPER"))
        {
            return new WebDeveloper();
        }

        return null;
    }

}
