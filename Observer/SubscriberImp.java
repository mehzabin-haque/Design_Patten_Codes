package Observer;

public class SubscriberImp implements Subscriber{

    private String subscriberName;

    public SubscriberImp(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void update(String channelName, boolean isLive) {
        String liveStatus = isLive ? "Live" : "Not Live";
        System.out.println("Hey " + subscriberName + "! The channel " + channelName + " is currently " + liveStatus + ".");
    }
    
}
