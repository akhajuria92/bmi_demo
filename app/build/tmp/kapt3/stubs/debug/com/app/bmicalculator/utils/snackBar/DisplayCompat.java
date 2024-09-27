package com.app.bmicalculator.utils.snackBar;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u00c0\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001d\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/app/bmicalculator/utils/snackBar/DisplayCompat;", "", "()V", "IMPL", "Lcom/app/bmicalculator/utils/snackBar/DisplayCompat$Impl;", "getRealSize", "", "display", "Landroid/view/Display;", "outSize", "Landroid/graphics/Point;", "getSize", "getWidthFromPercentage", "", "targetActivity", "Landroid/app/Activity;", "mMaxWidthPercentage", "", "(Landroid/app/Activity;Ljava/lang/Float;)I", "Impl", "app_debug"})
public final class DisplayCompat {
    @org.jetbrains.annotations.NotNull()
    private static final com.app.bmicalculator.utils.snackBar.DisplayCompat.Impl IMPL = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.app.bmicalculator.utils.snackBar.DisplayCompat INSTANCE = null;
    
    private DisplayCompat() {
        super();
    }
    
    public final void getSize(@org.jetbrains.annotations.NotNull()
    android.view.Display display, @org.jetbrains.annotations.NotNull()
    android.graphics.Point outSize) {
    }
    
    public final void getRealSize(@org.jetbrains.annotations.NotNull()
    android.view.Display display, @org.jetbrains.annotations.NotNull()
    android.graphics.Point outSize) {
    }
    
    public final int getWidthFromPercentage(@org.jetbrains.annotations.NotNull()
    android.app.Activity targetActivity, @org.jetbrains.annotations.Nullable()
    java.lang.Float mMaxWidthPercentage) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH \u00a2\u0006\u0002\b\tJ\u001d\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH \u00a2\u0006\u0002\b\u000b\u00a8\u0006\f"}, d2 = {"Lcom/app/bmicalculator/utils/snackBar/DisplayCompat$Impl;", "", "()V", "getRealSize", "", "display", "Landroid/view/Display;", "outSize", "Landroid/graphics/Point;", "getRealSize$app_debug", "getSize", "getSize$app_debug", "app_debug"})
    public static abstract class Impl {
        
        public Impl() {
            super();
        }
        
        public abstract void getSize$app_debug(@org.jetbrains.annotations.NotNull()
        android.view.Display display, @org.jetbrains.annotations.NotNull()
        android.graphics.Point outSize);
        
        public abstract void getRealSize$app_debug(@org.jetbrains.annotations.NotNull()
        android.view.Display display, @org.jetbrains.annotations.NotNull()
        android.graphics.Point outSize);
    }
}