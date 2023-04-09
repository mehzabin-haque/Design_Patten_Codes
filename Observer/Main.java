package Observer;

public class Main {
    public static void main(String[] args) {
        
        Channel yt = new YoutubeChannel("tananana");
        Subscriber s1 = new SubscriberImp("Chandler");
        Subscriber s2 = new SubscriberImp("Monica");
        Subscriber s3 = new SubscriberImp("Bing");

        yt.subscribe(s1);
        yt.subscribe(s2);
        yt.subscribe(s3);

        ((YoutubeChannel) yt).setLive(true);

        // Unsubscribe one subscriber
        yt.unsubscribe(s2);

        // Set the channel as not live
        ((YoutubeChannel) yt).setLive(false);
    }
}
