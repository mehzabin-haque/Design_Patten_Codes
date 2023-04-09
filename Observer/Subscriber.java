package Observer;

public interface Subscriber {
    public void update(String channelName,boolean isLive);
}
