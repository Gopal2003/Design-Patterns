public class ProfessionalFactory implements AbstractFactory {

    @Override
    public Profession getProfession(String professionName) {
        
        if(professionName.equals("Engineer"))
        {
            return new Engineer();
        }

        return new Teacher();
        
    }
    
}
