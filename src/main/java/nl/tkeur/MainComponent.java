package nl.tkeur;

import dagger.Component;

@Component(modules = {UserRepositoryModule.class, UserServiceModule.class})
public interface MainComponent {

    UserService provideUserService();

    void inject(Main main);
}
