public class Main {

    public static void main(String[] args) {

        AbstractFactoryProducer professionFactory = new AbstractFactoryProducer();

        AbstractFactory factory = professionFactory.getProfession(true);

        Profession profession = factory.getProfession("TranieeEngineer");

        profession.print();

    }
}
