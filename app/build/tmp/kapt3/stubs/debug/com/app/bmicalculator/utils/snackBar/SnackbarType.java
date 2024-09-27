package com.app.bmicalculator.utils.snackBar;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\r"}, d2 = {"Lcom/app/bmicalculator/utils/snackBar/SnackbarType;", "", "minHeight", "", "maxHeight", "maxLines", "(Ljava/lang/String;IIII)V", "getMaxHeight", "()I", "getMaxLines", "getMinHeight", "SINGLE_LINE", "MULTI_LINE", "app_debug"})
public enum SnackbarType {
    /*public static final*/ SINGLE_LINE /* = new SINGLE_LINE(0, 0, 0) */,
    /*public static final*/ MULTI_LINE /* = new MULTI_LINE(0, 0, 0) */;
    private final int minHeight = 0;
    private final int maxHeight = 0;
    private final int maxLines = 0;
    
    SnackbarType(int minHeight, int maxHeight, int maxLines) {
    }
    
    public final int getMinHeight() {
        return 0;
    }
    
    public final int getMaxHeight() {
        return 0;
    }
    
    public final int getMaxLines() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<com.app.bmicalculator.utils.snackBar.SnackbarType> getEntries() {
        return null;
    }
}