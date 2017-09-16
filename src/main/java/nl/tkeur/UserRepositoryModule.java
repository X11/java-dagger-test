package nl.tkeur;

import dagger.Module;
import dagger.Provides;

@Module
public class UserRepositoryModule {

    @Provides
    UserRepository provideUserRepository() {
        return new UserRepository();
    }
}
