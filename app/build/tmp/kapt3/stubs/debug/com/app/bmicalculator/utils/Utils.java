package com.app.bmicalculator.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0013J\u001a\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u0013H\u0016J\u0018\u0010\u001b\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010!\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\"\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010$J\u000e\u0010%\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010&\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005\u00a8\u0006\'"}, d2 = {"Lcom/app/bmicalculator/utils/Utils;", "", "()V", "isDeviceRooted", "", "()Z", "checkRootMethod1", "checkRootMethod2", "checkRootMethod3", "compareDouble", "", "d1", "", "d2", "deleteGpsData", "", "context", "Landroid/content/Context;", "getActualBatteryPer", "", "getAppVersion", "getBatteryPercentage", "", "getChronoTimeFromMillis", "elapsedTime", "", "getDeviceName", "isAppInstalled", "packageName", "packagename", "packageManager", "Landroid/content/pm/PackageManager;", "isBatteryCharging", "isBatteryChargingNew", "mockLocationEnabled", "location", "Landroid/location/Location;", "olaInstall", "telerickshawInstall", "app_debug"})
public final class Utils {
    @org.jetbrains.annotations.NotNull()
    public static final com.app.bmicalculator.utils.Utils INSTANCE = null;
    
    private Utils() {
        super();
    }
    
    public final boolean isDeviceRooted() {
        return false;
    }
    
    private final boolean checkRootMethod1() {
        return false;
    }
    
    private final boolean checkRootMethod2() {
        return false;
    }
    
    private final boolean checkRootMethod3() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeviceName() {
        return null;
    }
    
    public final int getAppVersion(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    public final float getBatteryPercentage(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getActualBatteryPer(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final int isBatteryChargingNew(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    public final boolean isBatteryCharging(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final void deleteGpsData(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final boolean isAppInstalled(@org.jetbrains.annotations.Nullable()
    java.lang.String packagename, @org.jetbrains.annotations.NotNull()
    android.content.pm.PackageManager packageManager) {
        return false;
    }
    
    public final boolean mockLocationEnabled(@org.jetbrains.annotations.Nullable()
    android.location.Location location) {
        return false;
    }
    
    public final int compareDouble(double d1, double d2) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getChronoTimeFromMillis(long elapsedTime) {
        return null;
    }
    
    public final boolean telerickshawInstall(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public boolean isAppInstalled(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String packageName) {
        return false;
    }
    
    public final boolean olaInstall(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
}