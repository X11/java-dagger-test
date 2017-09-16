package nl.tkeur;

import dagger.Module;
import dagger.Provides;

@Module
public class UserServiceModule {

    @Provides
    UserService provideUserService(UserRepository userRepository) {
        return new UserService(userRepository);
    }
}
