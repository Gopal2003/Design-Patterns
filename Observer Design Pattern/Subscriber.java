public class Subscriber implements Observer{

    String name;

    Subscriber(String name)
    {
        this.name = name;
    }
    
    @Override
    public void notified(String title, String name) {
        System.out.println("Hello " + name + " A new Video is uploaded! " + title);
    }
    
}