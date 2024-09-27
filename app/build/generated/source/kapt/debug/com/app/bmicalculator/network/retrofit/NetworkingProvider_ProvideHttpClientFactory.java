package com.app.bmicalculator.network.retrofit;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

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
public final class NetworkingProvider_ProvideHttpClientFactory implements Factory<OkHttpClient> {
  private final Provider<HttpLoggingInterceptor> loggingProvider;

  public NetworkingProvider_ProvideHttpClientFactory(
      Provider<HttpLoggingInterceptor> loggingProvider) {
    this.loggingProvider = loggingProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideHttpClient(loggingProvider.get());
  }

  public static NetworkingProvider_ProvideHttpClientFactory create(
      Provider<HttpLoggingInterceptor> loggingProvider) {
    return new NetworkingProvider_ProvideHttpClientFactory(loggingProvider);
  }

  public static OkHttpClient provideHttpClient(HttpLoggingInterceptor logging) {
    return Preconditions.checkNotNullFromProvides(NetworkingProvider.INSTANCE.provideHttpClient(logging));
  }
}
