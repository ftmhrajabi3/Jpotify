package users;

import java.util.ArrayList;

public class User {

	private String email;
	private String password;
	private ArrayList<User> friends = new ArrayList<User>();
	
	
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public String getPassword() {
		return password;
	}


	public ArrayList<User> getFriends() {
		return friends;
	}
	
	
	public void addFriend(User friend) {
		friends.add(friend);
	}
	
	
	public void removeFriend(User friend) {
		friends.remove(friend);
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((friends == null) ? 0 : friends.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (friends == null) {
			if (other.friends != null)
				return false;
		} else if (!friends.equals(other.friends))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", friends=" + friends + "]";
	}
	
	//add user to server
	public void addUser() {
		
	}
	
	
	
}
