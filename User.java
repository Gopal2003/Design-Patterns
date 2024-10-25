public class User {
    
    public static void main(String[] args)
    {
        // Build b = new Build.Builder()
        // .setName("Gopal")
        // .setDescription("Very Dedicated towards his goal")
        // .setId("BUILD12")
        // .build();


        // System.out.println(b.toString());

        //Another way

        Build b2 = Build.Builder.getBuilder()
        .setName("Gopal")
        .setDescription("Again very Good ")
        .setId("BUILD343")
        .build();

        System.out.println(b2.toString());
    }
}
