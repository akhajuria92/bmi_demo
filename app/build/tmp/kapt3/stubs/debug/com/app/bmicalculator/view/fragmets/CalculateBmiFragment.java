package com.app.bmicalculator.view.fragmets;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0003J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/app/bmicalculator/view/fragmets/CalculateBmiFragment;", "Lcom/app/bmicalculator/base/BaseFragment;", "Lcom/app/bmicalculator/databinding/FragmentCalculateBmiBinding;", "Lcom/app/bmicalculator/utils/HandleClick;", "()V", "chosen", "", "countAge", "", "countWeight", "height", "", "weight", "calculateBMI", "", "getLayoutRes", "initUI", "onClickHandle", "view", "Landroid/view/View;", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class CalculateBmiFragment extends com.app.bmicalculator.base.BaseFragment<com.app.bmicalculator.databinding.FragmentCalculateBmiBinding> implements com.app.bmicalculator.utils.HandleClick {
    private float height = 0.0F;
    private float weight = 0.0F;
    private int countWeight = 50;
    private int countAge = 19;
    private boolean chosen = true;
    
    public CalculateBmiFragment() {
        super();
    }
    
    @java.lang.Override()
    public int getLayoutRes() {
        return 0;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void initUI() {
    }
    
    @java.lang.Override()
    public void onClickHandle(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final void calculateBMI() {
    }
}