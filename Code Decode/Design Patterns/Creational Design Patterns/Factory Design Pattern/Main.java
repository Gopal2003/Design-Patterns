public class Main{
    public static void main(String[] args) {
        Factory profession = new Factory();

        Profession p1 = profession.getObject("Doctor");
        p1.print();

        Profession p2 = profession.getObject("Engineer");
        p2.print();

        Profession p3 = profession.getObject("Teacher");
        p3.print();
    }
}