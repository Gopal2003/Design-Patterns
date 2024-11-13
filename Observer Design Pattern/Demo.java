public class Demo {
    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel();

        Subscriber sub1 = new Subscriber("John");
        Subscriber sub2 = new Subscriber("Jane");
        Subscriber sub3 = new Subscriber("David");

        channel.subscribe(sub1);
        channel.subscribe(sub2);
        channel.subscribe(sub3);

        channel.newVideoUploaded("Observer Design Pattern");
        channel.newVideoUploaded("Factory Design Pattern");
    }
}
