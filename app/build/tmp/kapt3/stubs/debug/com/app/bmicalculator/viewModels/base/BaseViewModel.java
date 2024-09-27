package com.app.bmicalculator.viewModels.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0019\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/app/bmicalculator/viewModels/base/BaseViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "mApplication", "Landroid/app/Application;", "apiService", "Lcom/app/bmicalculator/network/retrofit/ApiService;", "dataRepository", "Lcom/app/bmicalculator/model/repository/remote/AuthorizationRepository;", "userRepository", "Lcom/app/bmicalculator/model/repository/local/UserRepository;", "(Landroid/app/Application;Lcom/app/bmicalculator/network/retrofit/ApiService;Lcom/app/bmicalculator/model/repository/remote/AuthorizationRepository;Lcom/app/bmicalculator/model/repository/local/UserRepository;)V", "getApiService", "()Lcom/app/bmicalculator/network/retrofit/ApiService;", "isRefresh", "", "()Z", "setRefresh", "(Z)V", "getToken", "", "getUserData", "Lcom/app/bmicalculator/model/pojo/auth/authentication/UserData;", "saveToken", "", "token", "saveUserData", "data", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class BaseViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application mApplication = null;
    @org.jetbrains.annotations.NotNull()
    private final com.app.bmicalculator.network.retrofit.ApiService apiService = null;
    @org.jetbrains.annotations.NotNull()
    private final com.app.bmicalculator.model.repository.remote.AuthorizationRepository dataRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.app.bmicalculator.model.repository.local.UserRepository userRepository = null;
    private boolean isRefresh = false;
    
    @javax.inject.Inject()
    public BaseViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application mApplication, @org.jetbrains.annotations.NotNull()
    com.app.bmicalculator.network.retrofit.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.app.bmicalculator.model.repository.remote.AuthorizationRepository dataRepository, @org.jetbrains.annotations.NotNull()
    com.app.bmicalculator.model.repository.local.UserRepository userRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.network.retrofit.ApiService getApiService() {
        return null;
    }
    
    public final boolean isRefresh() {
        return false;
    }
    
    public final void setRefresh(boolean p0) {
    }
    
    public final void saveUserData(@org.jetbrains.annotations.Nullable()
    com.app.bmicalculator.model.pojo.auth.authentication.UserData data) {
    }
    
    public final void saveToken(@org.jetbrains.annotations.Nullable()
    java.lang.String token) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToken() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.app.bmicalculator.model.pojo.auth.authentication.UserData getUserData() {
        return null;
    }
}