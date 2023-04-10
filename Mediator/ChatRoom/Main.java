package Mediator.ChatRoom;

public class Main {
    public static void main(String[] args) {
        ChatRoomMediator mediator = new ChatRoom();
		User user1 = new UserImp(mediator, "Pankaj");
		User user2 = new UserImp(mediator, "Lisa");
		User user3 = new UserImp(mediator, "Saurabh");
		// User user4 = new UserImp(mediator, "David");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		// mediator.addUser(user4);
		
		user1.send("Hi All");
        user2.send("VALLAGE NA");
        user3.send("EXAM POCHA POP");
    }
}
