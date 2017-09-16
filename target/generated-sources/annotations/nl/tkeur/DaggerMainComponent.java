package nl.tkeur;

import dagger.MembersInjector;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerMainComponent implements MainComponent {
  private Provider<UserRepository> provideUserRepositoryProvider;

  private Provider<UserService> provideUserServiceProvider;

  private MembersInjector<Main> mainMembersInjector;

  private DaggerMainComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static MainComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideUserRepositoryProvider =
        UserRepositoryModule_ProvideUserRepositoryFactory.create(builder.userRepositoryModule);

    this.provideUserServiceProvider =
        UserServiceModule_ProvideUserServiceFactory.create(
            builder.userServiceModule, provideUserRepositoryProvider);

    this.mainMembersInjector = Main_MembersInjector.create(provideUserServiceProvider);
  }

  @Override
  public UserService provideUserService() {
    return provideUserServiceProvider.get();
  }

  @Override
  public void inject(Main main) {
    mainMembersInjector.injectMembers(main);
  }

  public static final class Builder {
    private UserRepositoryModule userRepositoryModule;

    private UserServiceModule userServiceModule;

    private Builder() {}

    public MainComponent build() {
      if (userRepositoryModule == null) {
        this.userRepositoryModule = new UserRepositoryModule();
      }
      if (userServiceModule == null) {
        this.userServiceModule = new UserServiceModule();
      }
      return new DaggerMainComponent(this);
    }

    public Builder userRepositoryModule(UserRepositoryModule userRepositoryModule) {
      this.userRepositoryModule = Preconditions.checkNotNull(userRepositoryModule);
      return this;
    }

    public Builder userServiceModule(UserServiceModule userServiceModule) {
      this.userServiceModule = Preconditions.checkNotNull(userServiceModule);
      return this;
    }
  }
}
