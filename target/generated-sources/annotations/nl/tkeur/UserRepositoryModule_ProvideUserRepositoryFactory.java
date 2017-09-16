package nl.tkeur;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserRepositoryModule_ProvideUserRepositoryFactory
    implements Factory<UserRepository> {
  private final UserRepositoryModule module;

  public UserRepositoryModule_ProvideUserRepositoryFactory(UserRepositoryModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UserRepository get() {
    return Preconditions.checkNotNull(
        module.provideUserRepository(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UserRepository> create(UserRepositoryModule module) {
    return new UserRepositoryModule_ProvideUserRepositoryFactory(module);
  }

  /** Proxies {@link UserRepositoryModule#provideUserRepository()}. */
  public static UserRepository proxyProvideUserRepository(UserRepositoryModule instance) {
    return instance.provideUserRepository();
  }
}
