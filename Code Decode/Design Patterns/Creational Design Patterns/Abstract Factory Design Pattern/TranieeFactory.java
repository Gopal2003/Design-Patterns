public class TranieeFactory implements AbstractFactory{

    @Override
    public Profession getProfession(String professionName) {
        
        if(professionName.equals("TranieeEngineer"))
        {
            return new EngineerTraniee();
        }

        return new TeacherTraniee();
    }
    

}
