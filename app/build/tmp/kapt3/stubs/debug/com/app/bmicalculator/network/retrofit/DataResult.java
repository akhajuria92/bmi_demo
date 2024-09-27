package com.app.bmicalculator.network.retrofit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b\u00a8\u0006\f"}, d2 = {"Lcom/app/bmicalculator/network/retrofit/DataResult;", "T", "", "()V", "Failure", "Loading", "Logout", "Success", "Lcom/app/bmicalculator/network/retrofit/DataResult$Failure;", "Lcom/app/bmicalculator/network/retrofit/DataResult$Loading;", "Lcom/app/bmicalculator/network/retrofit/DataResult$Logout;", "Lcom/app/bmicalculator/network/retrofit/DataResult$Success;", "app_debug"})
public abstract class DataResult<T extends java.lang.Object> {
    
    private DataResult() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J\u0011\u0010\u0013\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u00c6\u0003J1\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0004H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001b"}, d2 = {"Lcom/app/bmicalculator/network/retrofit/DataResult$Failure;", "Lcom/app/bmicalculator/network/retrofit/DataResult;", "", "message", "", "code", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/String;ILjava/lang/Exception;)V", "getCode", "()I", "getException", "()Ljava/lang/Exception;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
    public static final class Failure extends com.app.bmicalculator.network.retrofit.DataResult {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String message = null;
        private final int code = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Exception exception = null;
        
        public Failure(@org.jetbrains.annotations.Nullable()
        java.lang.String message, int code, @org.jetbrains.annotations.Nullable()
        java.lang.Exception exception) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMessage() {
            return null;
        }
        
        public final int getCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Exception getException() {
            return null;
        }
        
        public Failure() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Exception component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.app.bmicalculator.network.retrofit.DataResult.Failure copy(@org.jetbrains.annotations.Nullable()
        java.lang.String message, int code, @org.jetbrains.annotations.Nullable()
        java.lang.Exception exception) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/app/bmicalculator/network/retrofit/DataResult$Loading;", "Lcom/app/bmicalculator/network/retrofit/DataResult;", "", "nothing", "(Ljava/lang/Void;)V", "getNothing", "()Ljava/lang/Void;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Loading extends com.app.bmicalculator.network.retrofit.DataResult {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Void nothing = null;
        
        public Loading(@org.jetbrains.annotations.Nullable()
        java.lang.Void nothing) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Void getNothing() {
            return null;
        }
        
        public Loading() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Void component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.app.bmicalculator.network.retrofit.DataResult.Loading copy(@org.jetbrains.annotations.Nullable()
        java.lang.Void nothing) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0004H\u00c6\u0003J\u0011\u0010\u000e\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u00c6\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lcom/app/bmicalculator/network/retrofit/DataResult$Logout;", "Lcom/app/bmicalculator/network/retrofit/DataResult;", "", "code", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(ILjava/lang/Exception;)V", "getCode", "()I", "getException", "()Ljava/lang/Exception;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    public static final class Logout extends com.app.bmicalculator.network.retrofit.DataResult {
        private final int code = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Exception exception = null;
        
        public Logout(int code, @org.jetbrains.annotations.Nullable()
        java.lang.Exception exception) {
        }
        
        public final int getCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Exception getException() {
            return null;
        }
        
        public Logout() {
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Exception component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.app.bmicalculator.network.retrofit.DataResult.Logout copy(int code, @org.jetbrains.annotations.Nullable()
        java.lang.Exception exception) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0002B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00018\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lcom/app/bmicalculator/network/retrofit/DataResult$Success;", "T", "Lcom/app/bmicalculator/network/retrofit/DataResult;", "data", "code", "", "(Ljava/lang/Object;I)V", "getCode", "()I", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(Ljava/lang/Object;I)Lcom/app/bmicalculator/network/retrofit/DataResult$Success;", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    public static final class Success<T extends java.lang.Object> extends com.app.bmicalculator.network.retrofit.DataResult<T> {
        @org.jetbrains.annotations.Nullable()
        private final T data = null;
        private final int code = 0;
        
        public Success(@org.jetbrains.annotations.Nullable()
        T data, int code) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final T getData() {
            return null;
        }
        
        public final int getCode() {
            return 0;
        }
        
        public Success() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final T component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.app.bmicalculator.network.retrofit.DataResult.Success<T> copy(@org.jetbrains.annotations.Nullable()
        T data, int code) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}