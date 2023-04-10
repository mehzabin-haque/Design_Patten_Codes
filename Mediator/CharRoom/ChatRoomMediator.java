package Mediator.CharRoom;

public interface ChatRoomMediator {
    public void sendMessage(String msg,User user);
    public void addUser(User user);
}
