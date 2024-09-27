package com.app.bmicalculator.utils.extensions;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b\u001a$\u0010\t\u001a\u00020\u0005*\u00020\u00062\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n\u001a\u0012\u0010\f\u001a\u00020\u0005*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0001\u001a\n\u0010\u000f\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\u000f\u001a\u00020\u0001*\u00020\u0010\u001a\n\u0010\u000f\u001a\u00020\u0001*\u00020\b\u001a\n\u0010\u0011\u001a\u00020\b*\u00020\u0006\u001a\n\u0010\u0011\u001a\u00020\b*\u00020\u0010\u001a\n\u0010\u0011\u001a\u00020\b*\u00020\b\u001a\n\u0010\u0012\u001a\u00020\u0013*\u00020\u0006\u001a\n\u0010\u0012\u001a\u00020\u0013*\u00020\u0010\u001a\n\u0010\u0012\u001a\u00020\u0013*\u00020\b\u001a\n\u0010\u0014\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\u0014\u001a\u00020\u0001*\u00020\u0010\u001a\n\u0010\u0014\u001a\u00020\u0001*\u00020\b\u001a\n\u0010\u0015\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\u0015\u001a\u00020\u0001*\u00020\b\u001a\u0014\u0010\u0016\u001a\u00020\u0005*\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u0013\u001a\n\u0010\u0018\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\u0018\u001a\u00020\u0001*\u00020\b\u001a\n\u0010\u0019\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\u0019\u001a\u00020\u0001*\u00020\b\u001a\n\u0010\u001a\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\u001a\u001a\u00020\u0001*\u00020\b\u001a\"\u0010\u001b\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u001eH\u0007\u001a\"\u0010\u001b\u001a\u00020\u0005*\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u001eH\u0007\u001a$\u0010\u001f\u001a\u00020\u0005*\u00020\u00062\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n\u001a\n\u0010 \u001a\u00020\u0005*\u00020\u0006\u001a\n\u0010!\u001a\u00020\u0005*\u00020\u0006\u001a\n\u0010\"\u001a\u00020\u0005*\u00020\u0006\u001a\u0012\u0010#\u001a\u00020\b*\u00020\u00062\u0006\u0010$\u001a\u00020\b\u001a\n\u0010%\u001a\u00020\u0005*\u00020\u0006\u001aH\u0010&\u001a\u00020\u0005*\u00020\u00102\u0006\u0010\'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u00132\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020\u00012\b\b\u0002\u0010+\u001a\u00020\u00132\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050\u001e\u001aw\u0010&\u001a\u00020\u0005*\u00020\u00102\u0006\u0010\'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u00132\b\b\u0002\u0010.\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020\u00012\b\b\u0002\u0010+\u001a\u00020\u00132\b\b\u0002\u0010/\u001a\u00020\u00132#\b\u0002\u0010,\u001a\u001d\u0012\u0013\u0012\u00110\u0013\u00a2\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\u000500\u001a\u008f\u0001\u0010&\u001a\u00020\u0005*\u00020\u00102\u0006\u0010\'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u00132\u0006\u00104\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020\u00012\b\b\u0002\u0010+\u001a\u00020\u00132\b\b\u0002\u0010/\u001a\u00020\u00132\b\b\u0002\u00105\u001a\u00020\u00132#\b\u0002\u0010,\u001a\u001d\u0012\u0013\u0012\u00110\u0013\u00a2\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\u000500\u001a\u0012\u00106\u001a\u00020\u0005*\u0002072\u0006\u0010+\u001a\u00020\u0013\u001a\n\u00108\u001a\u00020\u0005*\u00020\u0006\u001a\u0012\u00109\u001a\u00020\u0005*\u00020\r2\u0006\u0010:\u001a\u00020\u0001\u001a\u0012\u0010;\u001a\u00020\u0005*\u00020\r2\u0006\u0010:\u001a\u00020\u0001\u00a8\u0006<"}, d2 = {"containsZeroAfterDecimal", "", "value", "", "addCurrencyValue", "", "Landroid/widget/EditText;", "currency", "", "afterTextChanged", "Lkotlin/Function2;", "Landroid/text/TextWatcher;", "changeColor", "Landroid/view/View;", "isSelected", "checkIbanNo", "Landroid/widget/TextView;", "checkString", "getLength", "", "isBlank", "isHashTag", "isPasswordVisible", "drawableStart", "isValidEmail", "isValidName", "isValidPassword", "onDrawableClick", "drawableType", "onClick", "Lkotlin/Function0;", "onTextChanged", "preventLeadingTrailingSpaces", "preventMultipleSpaces", "preventSpacesInPassword", "removeSpecialChar", "s", "setFocus", "setSpanString", "spanText", "start", "end", "showBold", "color", "onSpanClick", "start2", "end2", "color2", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "start3", "end3", "color3", "setStrokeColor", "Lcom/google/android/material/textfield/TextInputEditText;", "showSoftKeyboard", "visibilityInvisibleView", "isShow", "visibilityView", "app_debug"})
public final class EditTextKt {
    
    public static final boolean containsZeroAfterDecimal(double value) {
        return false;
    }
    
    public static final void visibilityView(@org.jetbrains.annotations.NotNull()
    android.view.View $this$visibilityView, boolean isShow) {
    }
    
    public static final void visibilityInvisibleView(@org.jetbrains.annotations.NotNull()
    android.view.View $this$visibilityInvisibleView, boolean isShow) {
    }
    
    public static final void afterTextChanged(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$afterTextChanged, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super android.text.TextWatcher, kotlin.Unit> afterTextChanged) {
    }
    
    public static final void addCurrencyValue(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$addCurrencyValue, @org.jetbrains.annotations.NotNull()
    java.lang.String currency) {
    }
    
    public static final void onTextChanged(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$onTextChanged, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super android.text.TextWatcher, kotlin.Unit> onTextChanged) {
    }
    
    public static final boolean isBlank(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$isBlank) {
        return false;
    }
    
    public static final int getLength(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$getLength) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String checkString(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$checkString) {
        return null;
    }
    
    public static final boolean isBlank(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$isBlank) {
        return false;
    }
    
    public static final int getLength(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$getLength) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String checkString(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$checkString) {
        return null;
    }
    
    public static final void setStrokeColor(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText $this$setStrokeColor, int color) {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    public static final void onDrawableClick(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$onDrawableClick, int drawableType, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    public static final void isPasswordVisible(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$isPasswordVisible, int drawableStart) {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    public static final void onDrawableClick(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$onDrawableClick, int drawableType, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    public static final void setSpanString(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setSpanString, @org.jetbrains.annotations.NotNull()
    java.lang.String spanText, int start, int end, boolean showBold, int color, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSpanClick) {
    }
    
    public static final void setSpanString(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setSpanString, @org.jetbrains.annotations.NotNull()
    java.lang.String spanText, int start, int end, int start2, int end2, boolean showBold, int color, int color2, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onSpanClick) {
    }
    
    public static final void setSpanString(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setSpanString, @org.jetbrains.annotations.NotNull()
    java.lang.String spanText, int start, int end, int start2, int end2, int start3, int end3, boolean showBold, int color, int color2, int color3, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onSpanClick) {
    }
    
    public static final boolean isValidEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$isValidEmail) {
        return false;
    }
    
    public static final boolean isValidEmail(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$isValidEmail) {
        return false;
    }
    
    public static final boolean isValidPassword(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$isValidPassword) {
        return false;
    }
    
    public static final boolean isValidPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$isValidPassword) {
        return false;
    }
    
    public static final boolean isHashTag(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$isHashTag) {
        return false;
    }
    
    public static final boolean isHashTag(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$isHashTag) {
        return false;
    }
    
    public static final boolean isValidName(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$isValidName) {
        return false;
    }
    
    public static final boolean checkIbanNo(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$checkIbanNo) {
        return false;
    }
    
    public static final boolean checkIbanNo(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$checkIbanNo) {
        return false;
    }
    
    public static final boolean checkIbanNo(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$checkIbanNo) {
        return false;
    }
    
    public static final boolean isValidName(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$isValidName) {
        return false;
    }
    
    public static final boolean isBlank(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$isBlank) {
        return false;
    }
    
    public static final int getLength(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$getLength) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String checkString(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$checkString) {
        return null;
    }
    
    public static final void setFocus(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$setFocus) {
    }
    
    public static final void showSoftKeyboard(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$showSoftKeyboard) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String removeSpecialChar(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$removeSpecialChar, @org.jetbrains.annotations.NotNull()
    java.lang.String s) {
        return null;
    }
    
    public static final void changeColor(@org.jetbrains.annotations.NotNull()
    android.view.View $this$changeColor, boolean isSelected) {
    }
    
    public static final void preventMultipleSpaces(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$preventMultipleSpaces) {
    }
    
    public static final void preventSpacesInPassword(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$preventSpacesInPassword) {
    }
    
    public static final void preventLeadingTrailingSpaces(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$preventLeadingTrailingSpaces) {
    }
}