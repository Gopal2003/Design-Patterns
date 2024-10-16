public class Singleton {
    
    //Lazy Initialize Singleton.
    private Singleton() {};

    private static Singleton instance;

    // This is not thread safe, Two thread t1 and t2 accessing this method, at first the instance is null, both will create new instance but only one needed. To avoid this we use synchronized keyword in the function declaration. But thr problem here is that we only need synchronization for the instance but writing synchronized keyword in the function declaration will restrict the access to the other code written inside the function. Hence, we will use a synchronized block in which we will store the function or block of code which requires synchronization.
    // public synchronized static Singleton getInstance()
    public static Singleton getInstance()
    {
        synchronized(Singleton.class){ // This part of code is synchronized.
            if(instance == null)
            {
                System.out.println("New Instance");
                instance =  new Singleton();
            }
        }

        return instance;
    }

    //eager way. This approach is not good though because it creates a new instance even though the user doesn't need the object.
    private static Singleton instance2 = new Singleton();

    public static Singleton getInstanceAgain()
    {
        return instance2;
    }
}
