package com.app.bmicalculator.model.repository.local;

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
public final class UserRepository_Factory implements Factory<UserRepository> {
  private final Provider<ApiService> apiServiceProvider;

  public UserRepository_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public UserRepository get() {
    return newInstance(apiServiceProvider.get());
  }

  public static UserRepository_Factory create(Provider<ApiService> apiServiceProvider) {
    return new UserRepository_Factory(apiServiceProvider);
  }

  public static UserRepository newInstance(ApiService apiService) {
    return new UserRepository(apiService);
  }
}
