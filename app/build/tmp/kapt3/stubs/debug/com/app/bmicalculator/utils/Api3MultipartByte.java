package com.app.bmicalculator.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\fJ \u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nJ\u0016\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000eJ\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/app/bmicalculator/utils/Api3MultipartByte;", "", "()V", "builder", "Lokhttp3/MultipartBody$Builder;", "progressRequestBody", "Lcom/app/bmicalculator/utils/ProgressRequestBody;", "cancelRequest", "", "getImageBase64", "", "featured_image", "Ljava/io/File;", "getRequestBody", "Lokhttp3/RequestBody;", "put", "key", "file", "listener", "Lcom/app/bmicalculator/utils/ProgressRequestBody$UploadProgressListener;", "value", "body", "putFileGetByte", "app_debug"})
public final class Api3MultipartByte {
    @org.jetbrains.annotations.Nullable()
    private com.app.bmicalculator.utils.ProgressRequestBody progressRequestBody;
    @org.jetbrains.annotations.Nullable()
    private okhttp3.MultipartBody.Builder builder;
    
    public Api3MultipartByte() {
        super();
    }
    
    public final void put(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final void putFileGetByte(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.io.File featured_image) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImageBase64(@org.jetbrains.annotations.NotNull()
    java.io.File featured_image) {
        return null;
    }
    
    public final void put(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.io.File file) {
    }
    
    public final void put(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.io.File file, @org.jetbrains.annotations.NotNull()
    com.app.bmicalculator.utils.ProgressRequestBody.UploadProgressListener listener) {
    }
    
    public final void cancelRequest() {
    }
    
    public final void put(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody body) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.RequestBody getRequestBody() {
        return null;
    }
}