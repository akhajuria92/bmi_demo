package com.app.bmicalculator.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\'J\u0010\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u001a\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\u0006\u0010 \u001a\u00020\u0013J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#H\u0016J\u0012\u0010$\u001a\u00020\u00152\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J$\u0010\'\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010(\u001a\u00020\u0015H\u0016J\u0018\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020,H\u0017J\u001a\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u001a2\b\u0010%\u001a\u0004\u0018\u00010&H\u0017J$\u0010/\u001a\u00020\u00152\b\b\u0001\u00100\u001a\u00020\u00172\b\b\u0002\u00101\u001a\u00020\u00132\b\b\u0002\u00102\u001a\u00020\u0017R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u00028\u0000X\u0096.\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/app/bmicalculator/base/BaseFragment;", "DB", "Landroidx/databinding/ViewDataBinding;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnTouchListener;", "()V", "baseActivity", "Lcom/app/bmicalculator/base/BaseActivity;", "getBaseActivity", "()Lcom/app/bmicalculator/base/BaseActivity;", "setBaseActivity", "(Lcom/app/bmicalculator/base/BaseActivity;)V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "isLoaded", "", "backPress", "", "getLayoutRes", "", "hideKeyBoard", "input", "Landroid/view/View;", "init", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "isInternetConnected", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "onResume", "onTouch", "v", "event", "Landroid/view/MotionEvent;", "onViewCreated", "view", "updateStatusBarColor", "colorId", "isStatusBarFontDark", "statusBarColor", "app_debug"})
public abstract class BaseFragment<DB extends androidx.databinding.ViewDataBinding> extends androidx.fragment.app.Fragment implements android.view.View.OnTouchListener {
    public DB binding;
    private boolean isLoaded = false;
    public com.app.bmicalculator.base.BaseActivity baseActivity;
    
    public BaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public DB getBinding() {
        return null;
    }
    
    public void setBinding(@org.jetbrains.annotations.NotNull()
    DB p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.base.BaseActivity getBaseActivity() {
        return null;
    }
    
    public final void setBaseActivity(@org.jetbrains.annotations.NotNull()
    com.app.bmicalculator.base.BaseActivity p0) {
    }
    
    @androidx.annotation.LayoutRes()
    public abstract int getLayoutRes();
    
    private final void init(android.view.LayoutInflater inflater, android.view.ViewGroup container) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @android.annotation.SuppressLint(value = {"ResourceType"})
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void hideKeyBoard(@org.jetbrains.annotations.Nullable()
    android.view.View input) {
    }
    
    public final boolean isInternetConnected() {
        return false;
    }
    
    public void backPress() {
    }
    
    public final void updateStatusBarColor(@androidx.annotation.ColorRes()
    int colorId, boolean isStatusBarFontDark, int statusBarColor) {
    }
    
    @java.lang.Override()
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    public boolean onTouch(@org.jetbrains.annotations.NotNull()
    android.view.View v, @org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
}