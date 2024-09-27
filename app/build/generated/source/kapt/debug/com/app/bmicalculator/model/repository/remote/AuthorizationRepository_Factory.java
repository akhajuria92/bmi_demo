package com.app.bmicalculator.model.repository.remote;

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
public final class AuthorizationRepository_Factory implements Factory<AuthorizationRepository> {
  private final Provider<ApiService> apiServiceProvider;

  public AuthorizationRepository_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public AuthorizationRepository get() {
    return newInstance(apiServiceProvider.get());
  }

  public static AuthorizationRepository_Factory create(Provider<ApiService> apiServiceProvider) {
    return new AuthorizationRepository_Factory(apiServiceProvider);
  }

  public static AuthorizationRepository newInstance(ApiService apiService) {
    return new AuthorizationRepository(apiService);
  }
}
