package com.app.bmicalculator.network.retrofit;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
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
public final class NetworkingProvider_ProvideApiProviderFactory implements Factory<Retrofit> {
  private final Provider<OkHttpClient> okHttpClientProvider;

  public NetworkingProvider_ProvideApiProviderFactory(Provider<OkHttpClient> okHttpClientProvider) {
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return provideApiProvider(okHttpClientProvider.get());
  }

  public static NetworkingProvider_ProvideApiProviderFactory create(
      Provider<OkHttpClient> okHttpClientProvider) {
    return new NetworkingProvider_ProvideApiProviderFactory(okHttpClientProvider);
  }

  public static Retrofit provideApiProvider(OkHttpClient okHttpClient) {
    return Preconditions.checkNotNullFromProvides(NetworkingProvider.INSTANCE.provideApiProvider(okHttpClient));
  }
}
