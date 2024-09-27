package com.app.bmicalculator.network.retrofit;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
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
public final class NetworkingProvider_ProvideLoggingInterceptorFactory implements Factory<HttpLoggingInterceptor> {
  @Override
  public HttpLoggingInterceptor get() {
    return provideLoggingInterceptor();
  }

  public static NetworkingProvider_ProvideLoggingInterceptorFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static HttpLoggingInterceptor provideLoggingInterceptor() {
    return Preconditions.checkNotNullFromProvides(NetworkingProvider.INSTANCE.provideLoggingInterceptor());
  }

  private static final class InstanceHolder {
    private static final NetworkingProvider_ProvideLoggingInterceptorFactory INSTANCE = new NetworkingProvider_ProvideLoggingInterceptorFactory();
  }
}
