package com.app.bmicalculator.model.repository.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\bJ\u0010\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/app/bmicalculator/model/repository/local/UserRepository;", "", "apiService", "Lcom/app/bmicalculator/network/retrofit/ApiService;", "(Lcom/app/bmicalculator/network/retrofit/ApiService;)V", "clearData", "", "getToken", "", "getUser", "Lcom/app/bmicalculator/model/pojo/auth/authentication/UserData;", "saveToken", "token", "saveUserData", "userData", "app_debug"})
public final class UserRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.app.bmicalculator.network.retrofit.ApiService apiService = null;
    
    @javax.inject.Inject()
    public UserRepository(@org.jetbrains.annotations.NotNull()
    com.app.bmicalculator.network.retrofit.ApiService apiService) {
        super();
    }
    
    public final void saveToken(@org.jetbrains.annotations.Nullable()
    java.lang.String token) {
    }
    
    public final void saveUserData(@org.jetbrains.annotations.Nullable()
    com.app.bmicalculator.model.pojo.auth.authentication.UserData userData) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.app.bmicalculator.model.pojo.auth.authentication.UserData getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void clearData() {
    }
}