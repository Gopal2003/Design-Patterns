public class Developer {
    public static void main(String[] args) throws InterruptedException {
       NetworkConnection networkConnection1 =  new NetworkConnection();

       networkConnection1.setHost("localhost");
       networkConnection1.setIPAddress("127.0.0.1");
       networkConnection1.setImportantAction("Very Important Action");

       networkConnection1.setNetworkConnection();

       System.out.println(networkConnection1.toString());

       //It takes time when we firstly connect to the server.

       try{
        //? When we clone the object, it instantly becomes available.
           NetworkConnection networkConnection2 = (NetworkConnection) networkConnection1.clone();
           System.out.println(networkConnection2.toString());
       }
       catch(Exception e)
       {
        System.out.println("Exception: " + e.getMessage());
       }


    }
}
