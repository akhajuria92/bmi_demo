package com.app.bmicalculator.view.fragmets;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J!\u0010\u0014\u001a\u00020\u000f2\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0016\"\u00020\u0017H\u0016\u00a2\u0006\u0002\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u000fH\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/app/bmicalculator/view/fragmets/HomeFragment;", "Lcom/app/bmicalculator/base/BaseFragment;", "Lcom/app/bmicalculator/databinding/FragmentHomeBinding;", "Lcom/app/bmicalculator/utils/HandleClick;", "Lcom/app/bmicalculator/base/BaseAdapter$OnItemClickListener;", "()V", "adapterHome", "Lcom/app/bmicalculator/view/adapter/AdapterHome;", "dashList", "Ljava/util/ArrayList;", "Lcom/app/bmicalculator/model/pojo/auth/DashBoardModel;", "Lkotlin/collections/ArrayList;", "getLayoutRes", "", "initDashBoardList", "", "initUI", "onClickHandle", "view", "Landroid/view/View;", "onItemClick", "itemData", "", "", "([Ljava/lang/Object;)V", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter", "app_debug"})
public final class HomeFragment extends com.app.bmicalculator.base.BaseFragment<com.app.bmicalculator.databinding.FragmentHomeBinding> implements com.app.bmicalculator.utils.HandleClick, com.app.bmicalculator.base.BaseAdapter.OnItemClickListener {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.app.bmicalculator.model.pojo.auth.DashBoardModel> dashList;
    @org.jetbrains.annotations.Nullable()
    private com.app.bmicalculator.view.adapter.AdapterHome adapterHome;
    
    public HomeFragment() {
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
    
    private final void initUI() {
    }
    
    @java.lang.Override()
    public void onClickHandle(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    public final void initDashBoardList() {
    }
    
    private final void setAdapter() {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    java.lang.Object... itemData) {
    }
}