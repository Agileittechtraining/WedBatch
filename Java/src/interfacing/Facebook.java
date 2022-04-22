package interfacing;

public class Facebook implements Appstore {
	@Override
	public void findingfriends() {
	System.out.println("Finding friends from facebook");	
	}
	@Override
	public void sendingfriendrequests() {
	System.out.println("Sending friend requests from facebook");
	}
	public void login() {
	System.out.println("Login from facebook");
		
	}
}
