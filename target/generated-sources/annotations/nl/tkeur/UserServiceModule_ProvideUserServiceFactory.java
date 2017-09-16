package nl.tkeur;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserServiceModule_ProvideUserServiceFactory implements Factory<UserService> {
  private final UserServiceModule module;

  private final Provider<UserRepository> userRepositoryProvider;

  public UserServiceModule_ProvideUserServiceFactory(
      UserServiceModule module, Provider<UserRepository> userRepositoryProvider) {
    assert module != null;
    this.module = module;
    assert userRepositoryProvider != null;
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public UserService get() {
    return Preconditions.checkNotNull(
        module.provideUserService(userRepositoryProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UserService> create(
      UserServiceModule module, Provider<UserRepository> userRepositoryProvider) {
    return new UserServiceModule_ProvideUserServiceFactory(module, userRepositoryProvider);
  }

  /** Proxies {@link UserServiceModule#provideUserService(UserRepository)}. */
  public static UserService proxyProvideUserService(
      UserServiceModule instance, UserRepository userRepository) {
    return instance.provideUserService(userRepository);
  }
}
