public class Factory {
    
    public Profession getObject(String name)
    {
        if(name.equals("Doctor"))
        {
            return new Doctor();
        }
        else if(name.equals("Teacher"))
        {
            return new Teacher();
        }

        return new Engineer();
    }
}
