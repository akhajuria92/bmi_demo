package com.app.bmicalculator.view.fragmets;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0003J\b\u0010\u0012\u001a\u00020\u0011H\u0003J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J!\u0010\u0019\u001a\u00020\u00112\u0012\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b\"\u00020\u001cH\u0016\u00a2\u0006\u0002\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/app/bmicalculator/view/fragmets/BmiResultFragment;", "Lcom/app/bmicalculator/base/BaseFragment;", "Lcom/app/bmicalculator/databinding/FragmentResultBinding;", "Lcom/app/bmicalculator/utils/HandleClick;", "Lcom/app/bmicalculator/base/BaseAdapter$OnItemClickListener;", "()V", "adapterBmiResult", "Lcom/app/bmicalculator/view/adapter/AdapterBmiResult;", "bmiData", "Lcom/app/bmicalculator/model/pojo/BmiData;", "dashList", "Ljava/util/ArrayList;", "Lcom/app/bmicalculator/model/pojo/auth/DashBoardModel;", "Lkotlin/collections/ArrayList;", "getLayoutRes", "", "initBMIList", "", "initUI", "onClickHandle", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "itemData", "", "", "([Ljava/lang/Object;)V", "onViewCreated", "app_debug"})
public final class BmiResultFragment extends com.app.bmicalculator.base.BaseFragment<com.app.bmicalculator.databinding.FragmentResultBinding> implements com.app.bmicalculator.utils.HandleClick, com.app.bmicalculator.base.BaseAdapter.OnItemClickListener {
    @org.jetbrains.annotations.Nullable()
    private com.app.bmicalculator.view.adapter.AdapterBmiResult adapterBmiResult;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.app.bmicalculator.model.pojo.auth.DashBoardModel> dashList;
    @org.jetbrains.annotations.Nullable()
    private com.app.bmicalculator.model.pojo.BmiData bmiData;
    
    public BmiResultFragment() {
        super();
    }
    
    @java.lang.Override()
    public int getLayoutRes() {
        return 0;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    private final void initBMIList() {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    java.lang.Object... itemData) {
    }
}