package com.app.bmicalculator.network.retrofit;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
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
public final class NetworkingProvider_ProvideApiServiceFactory implements Factory<ApiService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkingProvider_ProvideApiServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiService get() {
    return provideApiService(retrofitProvider.get());
  }

  public static NetworkingProvider_ProvideApiServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkingProvider_ProvideApiServiceFactory(retrofitProvider);
  }

  public static ApiService provideApiService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkingProvider.INSTANCE.provideApiService(retrofit));
  }
}
