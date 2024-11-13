import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{

    List<Subscriber> subscribers = new ArrayList<>();
    
    @Override
    public void subscribe(Subscriber sb) {
        
       subscribers.add( sb);
    }

    @Override
    public void unsubscribe(Subscriber sb) {
       subscribers.remove(sb);
    }

    @Override
    public void newVideoUploaded( String title) {
        for(Subscriber s : subscribers)
        {
            s.notified(title,s.name);
        }
        
    }
    
}