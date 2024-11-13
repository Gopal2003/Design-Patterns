public interface Subject{

    void subscribe(Subscriber name);

    void unsubscribe(Subscriber sb);

    void newVideoUploaded(String title);
}