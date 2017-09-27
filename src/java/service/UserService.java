package service;

public class UserService {
    
    private final User user1 = new User("adam","password");
    private final User user2 = new User("betty","password");
    
    public boolean login(User user){
        return user.equals(user1) || user.equals(user2);
    }

}
