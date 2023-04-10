package Mediator.CharRoom;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatRoomMediator {

    private List<User> userList = new ArrayList<>();
    
    @Override
    public void sendMessage(String msg, User user) {
        for(User users: userList){
            if(users != user){
                users.recieve(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        userList.add(user);
    }
    
}
