public class Child {
    
    public static void main(String[] args) {
        
        Singleton c = Singleton.getInstance();

        Singleton c2 = Singleton.getInstance();

        System.out.println(c.hashCode());
        System.out.println(c2.hashCode());

        Singleton c3 = Singleton.getInstanceAgain();
        Singleton c4 = Singleton.getInstanceAgain();

        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());


    }
}
