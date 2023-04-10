package Mediator.CharRoom;

public class UserImp extends User {

    public UserImp(ChatRoomMediator mediator, String name) {
        super(mediator, name);
        
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + " Sending msg : " + msg);
        mediator.sendMessage(msg,this);
    }

    @Override
    public void recieve(String msg) {
        System.out.println(this.name + " Received msg : " + msg);
    }
    
}
