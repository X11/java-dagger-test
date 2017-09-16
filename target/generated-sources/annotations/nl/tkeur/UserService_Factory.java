package nl.tkeur;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserService_Factory implements Factory<UserService> {
  private final Provider<UserRepository> userRepositoryProvider;

  public UserService_Factory(Provider<UserRepository> userRepositoryProvider) {
    assert userRepositoryProvider != null;
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public UserService get() {
    return new UserService(userRepositoryProvider.get());
  }

  public static Factory<UserService> create(Provider<UserRepository> userRepositoryProvider) {
    return new UserService_Factory(userRepositoryProvider);
  }

  /** Proxies {@link UserService#UserService(UserRepository)}. */
  public static UserService newUserService(UserRepository userRepository) {
    return new UserService(userRepository);
  }
}
