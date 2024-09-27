package com.app.bmicalculator.viewModels.base;

import android.app.Application;
import com.app.bmicalculator.model.repository.local.UserRepository;
import com.app.bmicalculator.model.repository.remote.AuthorizationRepository;
import com.app.bmicalculator.network.retrofit.ApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation"
})
public final class BaseViewModel_Factory implements Factory<BaseViewModel> {
  private final Provider<Application> mApplicationProvider;

  private final Provider<ApiService> apiServiceProvider;

  private final Provider<AuthorizationRepository> dataRepositoryProvider;

  private final Provider<UserRepository> userRepositoryProvider;

  public BaseViewModel_Factory(Provider<Application> mApplicationProvider,
      Provider<ApiService> apiServiceProvider,
      Provider<AuthorizationRepository> dataRepositoryProvider,
      Provider<UserRepository> userRepositoryProvider) {
    this.mApplicationProvider = mApplicationProvider;
    this.apiServiceProvider = apiServiceProvider;
    this.dataRepositoryProvider = dataRepositoryProvider;
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public BaseViewModel get() {
    return newInstance(mApplicationProvider.get(), apiServiceProvider.get(), dataRepositoryProvider.get(), userRepositoryProvider.get());
  }

  public static BaseViewModel_Factory create(Provider<Application> mApplicationProvider,
      Provider<ApiService> apiServiceProvider,
      Provider<AuthorizationRepository> dataRepositoryProvider,
      Provider<UserRepository> userRepositoryProvider) {
    return new BaseViewModel_Factory(mApplicationProvider, apiServiceProvider, dataRepositoryProvider, userRepositoryProvider);
  }

  public static BaseViewModel newInstance(Application mApplication, ApiService apiService,
      AuthorizationRepository dataRepository, UserRepository userRepository) {
    return new BaseViewModel(mApplication, apiService, dataRepository, userRepository);
  }
}
