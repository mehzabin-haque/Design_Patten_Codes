package Observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Channel{

    List<Subscriber> subscribers = new ArrayList<>();
    private String channelName;
    private boolean isLive;

    public YoutubeChannel(String channelName){
        this.channelName = channelName;
        isLive = false;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribes() {
        for(Subscriber subscriber:subscribers){
            subscriber.update(channelName, isLive);
        }
    }

    public void setLive(boolean isLive){
        this.isLive = isLive; 
        notifySubscribes();
    }
    
}
