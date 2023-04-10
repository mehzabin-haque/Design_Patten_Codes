package Mediator.CharRoom;

public abstract class User {
    protected ChatRoomMediator mediator;
    protected String name;

    public User(ChatRoomMediator mediator, String name){
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String msg);
    public abstract void recieve(String msg);
}
