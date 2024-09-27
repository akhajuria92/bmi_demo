package com.app.bmicalculator.databinding;
import com.app.bmicalculator.R;
import com.app.bmicalculator.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCalculateBmiBindingImpl extends FragmentCalculateBmiBinding implements com.app.bmicalculator.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.titleTV, 8);
        sViewsWithIds.put(R.id.heightTV, 9);
        sViewsWithIds.put(R.id.heightTxtET, 10);
        sViewsWithIds.put(R.id.heightCL, 11);
        sViewsWithIds.put(R.id.Seekbar, 12);
        sViewsWithIds.put(R.id.ageTV, 13);
        sViewsWithIds.put(R.id.ageCL, 14);
        sViewsWithIds.put(R.id.ageET, 15);
        sViewsWithIds.put(R.id.weightTV, 16);
        sViewsWithIds.put(R.id.weightCL, 17);
        sViewsWithIds.put(R.id.weightTxtET, 18);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCalculateBmiBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private FragmentCalculateBmiBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.SeekBar) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[15]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[13]
            , (com.google.android.material.button.MaterialButton) bindings[7]
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[10]
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[17]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[16]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[18]
            );
        this.ageMinusIV.setTag(null);
        this.agePlusIV.setTag(null);
        this.calculateBT.setTag(null);
        this.femaleCB.setTag(null);
        this.maleCB.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.weightMinusIV.setTag(null);
        this.weightPlusIV.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.app.bmicalculator.generated.callback.OnClickListener(this, 6);
        mCallback4 = new com.app.bmicalculator.generated.callback.OnClickListener(this, 4);
        mCallback2 = new com.app.bmicalculator.generated.callback.OnClickListener(this, 2);
        mCallback7 = new com.app.bmicalculator.generated.callback.OnClickListener(this, 7);
        mCallback5 = new com.app.bmicalculator.generated.callback.OnClickListener(this, 5);
        mCallback3 = new com.app.bmicalculator.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.app.bmicalculator.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.handleClick == variableId) {
            setHandleClick((com.app.bmicalculator.utils.HandleClick) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandleClick(@Nullable com.app.bmicalculator.utils.HandleClick HandleClick) {
        this.mHandleClick = HandleClick;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handleClick);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.app.bmicalculator.utils.HandleClick handleClick = mHandleClick;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.ageMinusIV.setOnClickListener(mCallback3);
            this.agePlusIV.setOnClickListener(mCallback4);
            this.calculateBT.setOnClickListener(mCallback7);
            this.femaleCB.setOnClickListener(mCallback2);
            this.maleCB.setOnClickListener(mCallback1);
            this.weightMinusIV.setOnClickListener(mCallback5);
            this.weightPlusIV.setOnClickListener(mCallback6);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 6: {
                // localize variables for thread safety
                // handleClick != null
                boolean handleClickJavaLangObjectNull = false;
                // handleClick
                com.app.bmicalculator.utils.HandleClick handleClick = mHandleClick;



                handleClickJavaLangObjectNull = (handleClick) != (null);
                if (handleClickJavaLangObjectNull) {



                    handleClick.onClickHandle(callbackArg_0);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // handleClick != null
                boolean handleClickJavaLangObjectNull = false;
                // handleClick
                com.app.bmicalculator.utils.HandleClick handleClick = mHandleClick;



                handleClickJavaLangObjectNull = (handleClick) != (null);
                if (handleClickJavaLangObjectNull) {



                    handleClick.onClickHandle(callbackArg_0);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // handleClick != null
                boolean handleClickJavaLangObjectNull = false;
                // handleClick
                com.app.bmicalculator.utils.HandleClick handleClick = mHandleClick;



                handleClickJavaLangObjectNull = (handleClick) != (null);
                if (handleClickJavaLangObjectNull) {



                    handleClick.onClickHandle(callbackArg_0);
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // handleClick != null
                boolean handleClickJavaLangObjectNull = false;
                // handleClick
                com.app.bmicalculator.utils.HandleClick handleClick = mHandleClick;



                handleClickJavaLangObjectNull = (handleClick) != (null);
                if (handleClickJavaLangObjectNull) {



                    handleClick.onClickHandle(callbackArg_0);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // handleClick != null
                boolean handleClickJavaLangObjectNull = false;
                // handleClick
                com.app.bmicalculator.utils.HandleClick handleClick = mHandleClick;



                handleClickJavaLangObjectNull = (handleClick) != (null);
                if (handleClickJavaLangObjectNull) {



                    handleClick.onClickHandle(callbackArg_0);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // handleClick != null
                boolean handleClickJavaLangObjectNull = false;
                // handleClick
                com.app.bmicalculator.utils.HandleClick handleClick = mHandleClick;



                handleClickJavaLangObjectNull = (handleClick) != (null);
                if (handleClickJavaLangObjectNull) {



                    handleClick.onClickHandle(callbackArg_0);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // handleClick != null
                boolean handleClickJavaLangObjectNull = false;
                // handleClick
                com.app.bmicalculator.utils.HandleClick handleClick = mHandleClick;



                handleClickJavaLangObjectNull = (handleClick) != (null);
                if (handleClickJavaLangObjectNull) {



                    handleClick.onClickHandle(callbackArg_0);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): handleClick
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}