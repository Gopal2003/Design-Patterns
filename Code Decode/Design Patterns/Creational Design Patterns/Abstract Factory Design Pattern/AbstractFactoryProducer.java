public class AbstractFactoryProducer{

    public AbstractFactory getProfession(boolean isTraniee)
    {
        if(isTraniee)
        {
            return new TranieeFactory();
        }
        else
        {
            return new ProfessionalFactory();
        }
    }
}