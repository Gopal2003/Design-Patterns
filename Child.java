import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Child {
    
    public static void main(String[] args) throws CloneNotSupportedException {
        
        // Singleton c = Singleton.getInstance();

        // Singleton c2 = Singleton.getInstance();
        
        // System.out.println("Lazy Way");
        // System.out.println(c.hashCode());
        // System.out.println(c2.hashCode());
        
        // Singleton c3 = Singleton.getInstanceAgain();
        // Singleton c4 = Singleton.getInstanceAgain();
        
        // System.out.println("");
        // System.out.println("Eager Way");
        // System.out.println(c3.hashCode());
        // System.out.println(c4.hashCode());
        
        // System.out.println();
        System.out.println("Ways to break the singleton fucntionality");
        //Ways to break the singleton class.


        //!Way 1 : Using Reflection API
        // Singleton c5 = Singleton.getInstance();
        // System.out.println(c5.hashCode());


        // Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor(); 

        // //Changing the Accessibility since the constructor is private in singleton class
        // constructor.setAccessible(true);


        // Singleton c6 = constructor.newInstance();
        // System.out.println(c6.hashCode());

        //* Solution : When we call constructor.newInstance(), either object is not created or the same object is returned.
        // ? 1. If Object exists, throw an exception inside the constructor of the Singleton class. 

        // if(instance != null)
        // {
        //   throw new RuntimeException("Breaking the Singleton pattern");
        // }


        // ? 2. Use enum  
        
        // public enum Singleton {}

        //As there is no constructor in the enum, calling the constructor will not make any sence and also gives error.
        // Singleton c1 = Singleton.INSTANCE;
        // System.out.println(c1.hashCode());
        
        // c1.test();

        // Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor(); // !Throws NoSuchMethodException
        // Singleton c6 = constructor.newInstance();
        // System.out.println(c6.hashCode());


        //!Way 2 - Deserialization
        // TODO: Serialization is the process of converting an object into a byte stream so it can be saved to a file or transferred over a network.
        // ? Solution: Implementing readResolve method in Singleton class. 

        // Singleton singleton = Singleton.getInstance();
        // System.out.println(singleton.hashCode());

        // ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        // oos.writeObject(singleton);

        // System.out.println("Serialization completed");

        // ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
        // Singleton singleton2 = (Singleton)ois.readObject();

        // System.out.println(singleton2.hashCode());


        //!Way 3 - Cloning
        // ? Soluction : Return the same instance from the method clone which is overrinded in the singleton class instead of returning the super.clone();
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.hashCode());

        Singleton signleton2 = (Singleton)singleton.clone();
        System.out.println(signleton2.hashCode());


        



    }
}
