package nl.tkeur;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Main_MembersInjector implements MembersInjector<Main> {
  private final Provider<UserService> userServiceProvider;

  public Main_MembersInjector(Provider<UserService> userServiceProvider) {
    assert userServiceProvider != null;
    this.userServiceProvider = userServiceProvider;
  }

  public static MembersInjector<Main> create(Provider<UserService> userServiceProvider) {
    return new Main_MembersInjector(userServiceProvider);
  }

  @Override
  public void injectMembers(Main instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.userService = userServiceProvider.get();
  }

  public static void injectUserService(Main instance, Provider<UserService> userServiceProvider) {
    instance.userService = userServiceProvider.get();
  }
}
