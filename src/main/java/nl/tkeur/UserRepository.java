package nl.tkeur;

/**
 * Created by ikke on 9/16/17.
 */
public class UserRepository {

    private User[] users;

    public UserRepository() {
        this.users = new User[]{
                new User("John", "Doe"),
                new User("Jane", "Doe"),
        };
    }

    public User[] getUsers() {
        return users;
    }
}
