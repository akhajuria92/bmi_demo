package com.app.bmicalculator.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0005J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0016\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014R@\u0010\u0003\u001a4\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/app/bmicalculator/utils/PermissionUtil;", "", "()V", "onPermissionChanged", "Lkotlin/Function2;", "Lcom/app/bmicalculator/utils/PERMISSION;", "Lkotlin/ParameterName;", "name", "permission", "", "isAvailable", "", "checkPermission", "activity", "Landroid/app/Activity;", "isPermissionAvailable", "context", "Landroid/content/Context;", "onPermissionGranted", "requestCode", "", "app_debug"})
public final class PermissionUtil {
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function2<? super com.app.bmicalculator.utils.PERMISSION, ? super java.lang.Boolean, kotlin.Unit> onPermissionChanged;
    
    public PermissionUtil() {
        super();
    }
    
    private final boolean isPermissionAvailable(android.content.Context context, com.app.bmicalculator.utils.PERMISSION permission) {
        return false;
    }
    
    public final void checkPermission(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    com.app.bmicalculator.utils.PERMISSION permission) {
    }
    
    public final void onPermissionGranted(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, int requestCode) {
    }
}