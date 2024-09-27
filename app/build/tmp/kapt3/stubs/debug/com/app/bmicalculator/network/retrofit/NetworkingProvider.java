package com.app.bmicalculator.network.retrofit;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0007J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0012H\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lcom/app/bmicalculator/network/retrofit/NetworkingProvider;", "", "()V", "appInterceptor", "Lokhttp3/Interceptor;", "getAppInterceptor", "()Lokhttp3/Interceptor;", "setAppInterceptor", "(Lokhttp3/Interceptor;)V", "provideApiProvider", "Lretrofit2/Retrofit;", "okHttpClient", "Lokhttp3/OkHttpClient;", "provideApiService", "Lcom/app/bmicalculator/network/retrofit/ApiService;", "retrofit", "provideHttpClient", "logging", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideLoggingInterceptor", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class NetworkingProvider {
    @org.jetbrains.annotations.Nullable()
    private static okhttp3.Interceptor appInterceptor;
    @org.jetbrains.annotations.NotNull()
    public static final com.app.bmicalculator.network.retrofit.NetworkingProvider INSTANCE = null;
    
    private NetworkingProvider() {
        super();
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.logging.HttpLoggingInterceptor provideLoggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.Interceptor getAppInterceptor() {
        return null;
    }
    
    public final void setAppInterceptor(@org.jetbrains.annotations.Nullable()
    okhttp3.Interceptor p0) {
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.OkHttpClient provideHttpClient(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor logging) {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit provideApiProvider(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.network.retrofit.ApiService provideApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
}