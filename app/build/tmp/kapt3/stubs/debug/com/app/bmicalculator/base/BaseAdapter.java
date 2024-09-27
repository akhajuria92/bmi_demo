package com.app.bmicalculator.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\f\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007\u001e\u001f !\"#$B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u001f\u0010\u0016\u001a\u00020\f2\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u0018\"\u00020\u0019\u00a2\u0006\u0002\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\f2\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u0018\"\u00020\u0019\u00a2\u0006\u0002\u0010\u001aJ\u000e\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/app/bmicalculator/base/BaseAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/app/bmicalculator/base/BaseViewHolder;", "Landroid/view/View$OnClickListener;", "()V", "onItemClickListener", "Lcom/app/bmicalculator/base/BaseAdapter$OnItemClickListener;", "onPageEndListener", "Lcom/app/bmicalculator/base/BaseAdapter$OnPageEndListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onClick", "v", "Landroid/view/View;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onItemClick", "itemData", "", "", "([Ljava/lang/Object;)V", "onPageEnd", "setOnItemClickListener", "setOnPageEndListener", "OnItemClickListener", "OnPageEndListener", "checkChange", "clickListener", "itemClick", "itemSelected", "textChange", "app_debug"})
public class BaseAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.app.bmicalculator.base.BaseViewHolder> implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.Nullable()
    private com.app.bmicalculator.base.BaseAdapter.OnItemClickListener onItemClickListener;
    @org.jetbrains.annotations.Nullable()
    private com.app.bmicalculator.base.BaseAdapter.OnPageEndListener onPageEndListener;
    
    public BaseAdapter() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.app.bmicalculator.base.BaseViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.app.bmicalculator.base.BaseViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    com.app.bmicalculator.base.BaseAdapter.OnItemClickListener onItemClickListener) {
    }
    
    public final void setOnPageEndListener(@org.jetbrains.annotations.NotNull()
    com.app.bmicalculator.base.BaseAdapter.OnPageEndListener onPageEndListener) {
    }
    
    public final void onItemClick(@org.jetbrains.annotations.NotNull()
    java.lang.Object... itemData) {
    }
    
    public final void onPageEnd(@org.jetbrains.annotations.NotNull()
    java.lang.Object... itemData) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0005\"\u00020\u0001H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/app/bmicalculator/base/BaseAdapter$OnItemClickListener;", "", "onItemClick", "", "itemData", "", "([Ljava/lang/Object;)V", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        java.lang.Object... itemData);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0005\"\u00020\u0001H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/app/bmicalculator/base/BaseAdapter$OnPageEndListener;", "", "onPageEnd", "", "itemData", "", "([Ljava/lang/Object;)V", "app_debug"})
    public static abstract interface OnPageEndListener {
        
        public abstract void onPageEnd(@org.jetbrains.annotations.NotNull()
        java.lang.Object... itemData);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u00a6\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/app/bmicalculator/base/BaseAdapter$checkChange;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "dataBinding", "Landroidx/databinding/ViewDataBinding;", "position", "", "(Lcom/app/bmicalculator/base/BaseAdapter;Landroidx/databinding/ViewDataBinding;I)V", "getDataBinding", "()Landroidx/databinding/ViewDataBinding;", "setDataBinding", "(Landroidx/databinding/ViewDataBinding;)V", "app_debug"})
    public abstract class checkChange implements android.widget.CompoundButton.OnCheckedChangeListener {
        @org.jetbrains.annotations.NotNull()
        private androidx.databinding.ViewDataBinding dataBinding;
        private int position = 0;
        
        protected checkChange(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ViewDataBinding dataBinding, int position) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.databinding.ViewDataBinding getDataBinding() {
            return null;
        }
        
        public final void setDataBinding(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ViewDataBinding p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\b\u00a6\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&R\u001a\u0010\u0004\u001a\u00020\u0005X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lcom/app/bmicalculator/base/BaseAdapter$clickListener;", "Landroid/view/View$OnClickListener;", "dataBinding", "Landroidx/databinding/ViewDataBinding;", "adapterPosition", "", "(Lcom/app/bmicalculator/base/BaseAdapter;Landroidx/databinding/ViewDataBinding;I)V", "getAdapterPosition", "()I", "setAdapterPosition", "(I)V", "getDataBinding", "()Landroidx/databinding/ViewDataBinding;", "setDataBinding", "(Landroidx/databinding/ViewDataBinding;)V", "onClickItem", "", "app_debug"})
    public abstract class clickListener implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private androidx.databinding.ViewDataBinding dataBinding;
        private int adapterPosition;
        
        public clickListener(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ViewDataBinding dataBinding, int adapterPosition) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.databinding.ViewDataBinding getDataBinding() {
            return null;
        }
        
        public final void setDataBinding(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ViewDataBinding p0) {
        }
        
        protected final int getAdapterPosition() {
            return 0;
        }
        
        protected final void setAdapterPosition(int p0) {
        }
        
        public abstract void onClickItem(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ViewDataBinding dataBinding, int adapterPosition);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u00a6\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/app/bmicalculator/base/BaseAdapter$itemClick;", "Landroid/widget/AdapterView$OnItemClickListener;", "dataBinding", "Landroidx/databinding/ViewDataBinding;", "adapterPosition", "", "(Lcom/app/bmicalculator/base/BaseAdapter;Landroidx/databinding/ViewDataBinding;I)V", "getAdapterPosition$app_debug", "()I", "setAdapterPosition$app_debug", "(I)V", "getDataBinding", "()Landroidx/databinding/ViewDataBinding;", "setDataBinding", "(Landroidx/databinding/ViewDataBinding;)V", "app_debug"})
    public abstract class itemClick implements android.widget.AdapterView.OnItemClickListener {
        @org.jetbrains.annotations.NotNull()
        private androidx.databinding.ViewDataBinding dataBinding;
        private int adapterPosition;
        
        public itemClick(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ViewDataBinding dataBinding, int adapterPosition) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.databinding.ViewDataBinding getDataBinding() {
            return null;
        }
        
        public final void setDataBinding(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ViewDataBinding p0) {
        }
        
        public final int getAdapterPosition$app_debug() {
            return 0;
        }
        
        public final void setAdapterPosition$app_debug(int p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u00a6\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/app/bmicalculator/base/BaseAdapter$itemSelected;", "Landroid/widget/AdapterView$OnItemSelectedListener;", "dataBinding", "Landroidx/databinding/ViewDataBinding;", "adapterPosition", "", "(Lcom/app/bmicalculator/base/BaseAdapter;Landroidx/databinding/ViewDataBinding;I)V", "getAdapterPosition", "()I", "setAdapterPosition", "(I)V", "getDataBinding", "()Landroidx/databinding/ViewDataBinding;", "setDataBinding", "(Landroidx/databinding/ViewDataBinding;)V", "app_debug"})
    public abstract class itemSelected implements android.widget.AdapterView.OnItemSelectedListener {
        @org.jetbrains.annotations.NotNull()
        private androidx.databinding.ViewDataBinding dataBinding;
        private int adapterPosition;
        
        protected itemSelected(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ViewDataBinding dataBinding, int adapterPosition) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.databinding.ViewDataBinding getDataBinding() {
            return null;
        }
        
        public final void setDataBinding(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ViewDataBinding p0) {
        }
        
        protected final int getAdapterPosition() {
            return 0;
        }
        
        protected final void setAdapterPosition(int p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u00a6\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/app/bmicalculator/base/BaseAdapter$textChange;", "Landroid/text/TextWatcher;", "dataBinding", "Landroidx/databinding/ViewDataBinding;", "position", "", "(Lcom/app/bmicalculator/base/BaseAdapter;Landroidx/databinding/ViewDataBinding;I)V", "getDataBinding", "()Landroidx/databinding/ViewDataBinding;", "setDataBinding", "(Landroidx/databinding/ViewDataBinding;)V", "getPosition", "()I", "setPosition", "(I)V", "app_debug"})
    public abstract class textChange implements android.text.TextWatcher {
        @org.jetbrains.annotations.NotNull()
        private androidx.databinding.ViewDataBinding dataBinding;
        private int position;
        
        protected textChange(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ViewDataBinding dataBinding, int position) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.databinding.ViewDataBinding getDataBinding() {
            return null;
        }
        
        public final void setDataBinding(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ViewDataBinding p0) {
        }
        
        public final int getPosition() {
            return 0;
        }
        
        public final void setPosition(int p0) {
        }
    }
}