package com.app.bmicalculator.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lcom/app/bmicalculator/utils/NetworkUtil;", "", "()V", "TYPE_IS_CONNECTING", "", "getTYPE_IS_CONNECTING", "()I", "setTYPE_IS_CONNECTING", "(I)V", "TYPE_MOBILE", "getTYPE_MOBILE", "setTYPE_MOBILE", "TYPE_NOT_CONNECTED", "getTYPE_NOT_CONNECTED", "setTYPE_NOT_CONNECTED", "TYPE_WIFI", "getTYPE_WIFI", "setTYPE_WIFI", "getConnectivityStatus", "context", "Landroid/content/Context;", "getConnectivityStatusString", "", "app_debug"})
public final class NetworkUtil {
    private static int TYPE_WIFI = 1;
    private static int TYPE_MOBILE = 2;
    private static int TYPE_NOT_CONNECTED = 0;
    private static int TYPE_IS_CONNECTING = 3;
    @org.jetbrains.annotations.NotNull()
    public static final com.app.bmicalculator.utils.NetworkUtil INSTANCE = null;
    
    private NetworkUtil() {
        super();
    }
    
    public final int getTYPE_WIFI() {
        return 0;
    }
    
    public final void setTYPE_WIFI(int p0) {
    }
    
    public final int getTYPE_MOBILE() {
        return 0;
    }
    
    public final void setTYPE_MOBILE(int p0) {
    }
    
    public final int getTYPE_NOT_CONNECTED() {
        return 0;
    }
    
    public final void setTYPE_NOT_CONNECTED(int p0) {
    }
    
    public final int getTYPE_IS_CONNECTING() {
        return 0;
    }
    
    public final void setTYPE_IS_CONNECTING(int p0) {
    }
    
    public final int getConnectivityStatus(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getConnectivityStatusString(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}