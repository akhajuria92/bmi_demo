package com.app.bmicalculator.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0003\u0014\u0015\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/app/bmicalculator/utils/ProgressRequestBody;", "Lokhttp3/RequestBody;", "file", "Ljava/io/File;", "contentType", "", "listener", "Lcom/app/bmicalculator/utils/ProgressRequestBody$UploadProgressListener;", "(Ljava/io/File;Ljava/lang/String;Lcom/app/bmicalculator/utils/ProgressRequestBody$UploadProgressListener;)V", "isCancelled", "", "path", "cancel", "", "contentLength", "", "Lokhttp3/MediaType;", "writeTo", "sink", "Lokio/BufferedSink;", "Companion", "ProgressUpdater", "UploadProgressListener", "app_debug"})
public final class ProgressRequestBody extends okhttp3.RequestBody {
    @org.jetbrains.annotations.NotNull()
    private final java.io.File file = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String contentType = null;
    @org.jetbrains.annotations.NotNull()
    private final com.app.bmicalculator.utils.ProgressRequestBody.UploadProgressListener listener = null;
    private boolean isCancelled = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String path = null;
    private static final int DEFAULT_BUFFER_SIZE = 2048;
    @org.jetbrains.annotations.NotNull()
    public static final com.app.bmicalculator.utils.ProgressRequestBody.Companion Companion = null;
    
    public ProgressRequestBody(@org.jetbrains.annotations.NotNull()
    java.io.File file, @org.jetbrains.annotations.NotNull()
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    com.app.bmicalculator.utils.ProgressRequestBody.UploadProgressListener listener) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public okhttp3.MediaType contentType() {
        return null;
    }
    
    @java.lang.Override()
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    public long contentLength() throws java.io.IOException {
        return 0L;
    }
    
    @java.lang.Override()
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    public void writeTo(@org.jetbrains.annotations.NotNull()
    okio.BufferedSink sink) throws java.io.IOException {
    }
    
    public final void cancel() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/app/bmicalculator/utils/ProgressRequestBody$Companion;", "", "()V", "DEFAULT_BUFFER_SIZE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/app/bmicalculator/utils/ProgressRequestBody$ProgressUpdater;", "Ljava/lang/Runnable;", "mUploaded", "", "mTotal", "(Lcom/app/bmicalculator/utils/ProgressRequestBody;JJ)V", "run", "", "app_debug"})
    final class ProgressUpdater implements java.lang.Runnable {
        private final long mUploaded = 0L;
        private final long mTotal = 0L;
        
        public ProgressUpdater(long mUploaded, long mTotal) {
            super();
        }
        
        @java.lang.Override()
        public void run() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/app/bmicalculator/utils/ProgressRequestBody$UploadProgressListener;", "", "onCancelled", "", "onProgressUpdate", "percentage", "", "app_debug"})
    public static abstract interface UploadProgressListener {
        
        public abstract void onProgressUpdate(int percentage);
        
        public abstract void onCancelled();
    }
}