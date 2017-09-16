package nl.tkeur;

import javax.inject.Inject;

class UserService {

    private UserRepository userRepository;

    @Inject
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    void printUsers() {
        User[] users = userRepository.getUsers();
        for (User user : users) {
            System.out.println(user.getFullName());
        }
    }
}
