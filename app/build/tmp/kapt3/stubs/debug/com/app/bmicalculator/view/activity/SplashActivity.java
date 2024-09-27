package com.app.bmicalculator.view.activity;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0015J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/app/bmicalculator/view/activity/SplashActivity;", "Lcom/app/bmicalculator/base/BaseActivity;", "Lcom/app/bmicalculator/utils/InternetCallBack;", "()V", "binding", "Lcom/app/bmicalculator/databinding/ActivitySplashBinding;", "gotoNextScreen", "", "internetOn", "networkAvailable", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showTitleBar", "app_debug"})
@android.annotation.SuppressLint(value = {"CustomSplashScreen"})
public final class SplashActivity extends com.app.bmicalculator.base.BaseActivity implements com.app.bmicalculator.utils.InternetCallBack {
    @org.jetbrains.annotations.Nullable()
    private com.app.bmicalculator.databinding.ActivitySplashBinding binding;
    
    public SplashActivity() {
        super();
    }
    
    @java.lang.Override()
    @android.annotation.SuppressLint(value = {"ResourceType"})
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean showTitleBar() {
        return false;
    }
    
    private final void gotoNextScreen() {
    }
    
    @java.lang.Override()
    public void internetOn(boolean networkAvailable) {
    }
}