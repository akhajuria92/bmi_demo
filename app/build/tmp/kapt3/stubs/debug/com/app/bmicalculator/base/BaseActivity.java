package com.app.bmicalculator.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u001b\b&\u0018\u00002\u00020\u0001:\u0001hB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u00102\u001a\u000203J\b\u00104\u001a\u000203H\u0016J)\u00105\u001a\u00020\u00102\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u0004072\u0006\u00108\u001a\u00020$2\u0006\u0010!\u001a\u00020\"\u00a2\u0006\u0002\u00109J\b\u0010:\u001a\u00020\u0010H\u0002J\u0006\u0010;\u001a\u000203J\b\u0010<\u001a\u0004\u0018\u00010\u0004J\n\u0010=\u001a\u0004\u0018\u00010\u0004H\u0017J\u0006\u0010>\u001a\u00020\u0010J\b\u0010?\u001a\u0004\u0018\u00010@J\b\u0010A\u001a\u000203H\u0002J\u0010\u0010B\u001a\u0002032\b\u0010C\u001a\u0004\u0018\u00010DJ\u0006\u0010E\u001a\u000203J\u0006\u0010F\u001a\u000203J\u0012\u0010G\u001a\u0002032\b\u0010H\u001a\u0004\u0018\u00010IH\u0014J\b\u0010J\u001a\u000203H\u0014J+\u0010K\u001a\u0002032\u0006\u00108\u001a\u00020$2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u0004072\u0006\u0010M\u001a\u00020NH\u0016\u00a2\u0006\u0002\u0010OJ\b\u0010P\u001a\u000203H\u0014J\b\u0010Q\u001a\u000203H\u0014J\b\u0010R\u001a\u000203H\u0014J\b\u0010S\u001a\u00020\u0010H\u0002J\u0010\u0010T\u001a\u0002032\b\b\u0002\u0010U\u001a\u00020\u0010J\u0010\u0010V\u001a\u0002032\b\u0010W\u001a\u0004\u0018\u00010\u0004J\u0010\u0010X\u001a\u0002032\b\u0010Y\u001a\u0004\u0018\u00010@J\u000e\u0010Z\u001a\u0002032\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010[\u001a\u0002032\u0006\u0010\\\u001a\u00020\u0010J\u0012\u0010]\u001a\u0002032\b\u0010^\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010_\u001a\u00020\u0010H&J\u000e\u0010`\u001a\u0002032\u0006\u0010a\u001a\u00020\u0004J\u000e\u0010b\u001a\u0002032\u0006\u0010a\u001a\u00020\u0004J\b\u0010c\u001a\u000203H\u0002J\b\u0010d\u001a\u000203H\u0002J$\u0010e\u001a\u0002032\b\b\u0001\u0010f\u001a\u00020$2\b\b\u0002\u0010\\\u001a\u00020\u00102\b\b\u0003\u0010g\u001a\u00020$R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0013\u0010\r\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u001d0\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u0011\u0010+\u001a\u00020\u00048G\u00a2\u0006\u0006\u001a\u0004\b,\u0010\u0006R\u001b\u0010-\u001a\u00020.8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b1\u0010\f\u001a\u0004\b/\u00100\u00a8\u0006i"}, d2 = {"Lcom/app/bmicalculator/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "connectivityManager", "Landroid/net/ConnectivityManager;", "getConnectivityManager", "()Landroid/net/ConnectivityManager;", "connectivityManager$delegate", "Lkotlin/Lazy;", "deviceToken", "getDeviceToken", "exit", "", "internetCallBack", "Lcom/app/bmicalculator/utils/InternetCallBack;", "getInternetCallBack", "()Lcom/app/bmicalculator/utils/InternetCallBack;", "setInternetCallBack", "(Lcom/app/bmicalculator/utils/InternetCallBack;)V", "isNetwork", "()Z", "setNetwork", "(Z)V", "networkConnectionChangeLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/app/bmicalculator/network/retrofit/Event;", "getNetworkConnectionChangeLiveData", "()Landroidx/lifecycle/MutableLiveData;", "networkStatus", "permCallback", "Lcom/app/bmicalculator/base/BaseActivity$PermCallback;", "reqCode", "", "store", "Lcom/app/bmicalculator/utils/Prefs;", "getStore", "()Lcom/app/bmicalculator/utils/Prefs;", "setStore", "(Lcom/app/bmicalculator/utils/Prefs;)V", "uniqueDeviceId", "getUniqueDeviceId", "viewModel", "Lcom/app/bmicalculator/viewModels/base/BaseViewModel;", "getViewModel", "()Lcom/app/bmicalculator/viewModels/base/BaseViewModel;", "viewModel$delegate", "backAction", "", "checkLanguage", "checkPermissions", "perms", "", "requestCode", "([Ljava/lang/String;ILcom/app/bmicalculator/base/BaseActivity$PermCallback;)Z", "checkPlayServices", "exitFromApp", "getAccessToken", "getIMEINumber", "getOnBoardingComplete", "getUserData", "Lcom/app/bmicalculator/model/pojo/auth/authentication/UserData;", "gotoMainActivity", "hideKeyBoard", "input", "Landroid/view/View;", "initFCM", "logOutUser", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onRequestPermissionsResult", "permissions", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onStart", "onStop", "registerNetworkBroadCast", "saveOnBoardingComplete", "isDone", "saveToken", "token", "saveUserData", "data", "setOnInternetCallBackListener", "setSystemBarTheme", "isStatusBarFontDark", "showNoNetworkDialog", "status", "showTitleBar", "showToast", "msg", "showToastOne", "strictModeThread", "transitionSlideInHorizontal", "updateStatusBarColor", "colorId", "statusBarColor", "PermCallback", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private boolean isNetwork = false;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private com.app.bmicalculator.utils.InternetCallBack internetCallBack;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.app.bmicalculator.network.retrofit.Event<java.lang.Boolean>> networkConnectionChangeLiveData = null;
    @org.jetbrains.annotations.Nullable()
    private com.app.bmicalculator.utils.Prefs store;
    private boolean exit = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String networkStatus;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy connectivityManager$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "NETWORK_BROADCAST";
    @org.jetbrains.annotations.Nullable()
    private com.app.bmicalculator.base.BaseActivity.PermCallback permCallback;
    private int reqCode = 0;
    
    public BaseActivity() {
        super();
    }
    
    public final boolean isNetwork() {
        return false;
    }
    
    public final void setNetwork(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.viewModels.base.BaseViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.app.bmicalculator.utils.InternetCallBack getInternetCallBack() {
        return null;
    }
    
    public final void setInternetCallBack(@org.jetbrains.annotations.Nullable()
    com.app.bmicalculator.utils.InternetCallBack p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.app.bmicalculator.network.retrofit.Event<java.lang.Boolean>> getNetworkConnectionChangeLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.app.bmicalculator.utils.Prefs getStore() {
        return null;
    }
    
    public final void setStore(@org.jetbrains.annotations.Nullable()
    com.app.bmicalculator.utils.Prefs p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeviceToken() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"HardwareIds"})
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUniqueDeviceId() {
        return null;
    }
    
    private final android.net.ConnectivityManager getConnectivityManager() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setOnInternetCallBackListener(@org.jetbrains.annotations.NotNull()
    com.app.bmicalculator.utils.InternetCallBack internetCallBack) {
    }
    
    public final void initFCM() {
    }
    
    public final void saveOnBoardingComplete(boolean isDone) {
    }
    
    public final boolean getOnBoardingComplete() {
        return false;
    }
    
    private final void gotoMainActivity() {
    }
    
    private final void showNoNetworkDialog(java.lang.String status) {
    }
    
    private final boolean checkPlayServices() {
        return false;
    }
    
    public abstract boolean showTitleBar();
    
    public final void hideKeyBoard(@org.jetbrains.annotations.Nullable()
    android.view.View input) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    private final boolean registerNetworkBroadCast() {
        return false;
    }
    
    public final void setSystemBarTheme(boolean isStatusBarFontDark) {
    }
    
    public final void updateStatusBarColor(@androidx.annotation.ColorRes()
    int colorId, boolean isStatusBarFontDark, @androidx.annotation.ColorRes()
    int statusBarColor) {
    }
    
    public final boolean checkPermissions(@org.jetbrains.annotations.NotNull()
    java.lang.String[] perms, int requestCode, @org.jetbrains.annotations.NotNull()
    com.app.bmicalculator.base.BaseActivity.PermCallback permCallback) {
        return false;
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    public final void backAction() {
    }
    
    public final void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public final void showToastOne(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    private final void strictModeThread() {
    }
    
    private final void transitionSlideInHorizontal() {
    }
    
    public final void exitFromApp() {
    }
    
    public void checkLanguage() {
    }
    
    public final void logOutUser() {
    }
    
    @android.annotation.SuppressLint(value = {"HardwareIds", "MissingPermission"})
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.SecurityException.class, java.lang.NullPointerException.class})
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getIMEINumber() throws java.lang.SecurityException, java.lang.NullPointerException {
        return null;
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    public final void saveUserData(@org.jetbrains.annotations.Nullable()
    com.app.bmicalculator.model.pojo.auth.authentication.UserData data) {
    }
    
    public final void saveToken(@org.jetbrains.annotations.Nullable()
    java.lang.String token) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.app.bmicalculator.model.pojo.auth.authentication.UserData getUserData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAccessToken() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/app/bmicalculator/base/BaseActivity$PermCallback;", "", "permDenied", "", "resultCode", "", "permGranted", "app_debug"})
    public static abstract interface PermCallback {
        
        public abstract void permGranted(int resultCode);
        
        public abstract void permDenied(int resultCode);
    }
}