package com.app.bmicalculator.network;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\fJ\u0010\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u0014\u001a\u00020\fH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/app/bmicalculator/network/SocketClient;", "", "messageListener", "Lcom/app/bmicalculator/network/SocketClient$MessageListener;", "(Lcom/app/bmicalculator/network/SocketClient$MessageListener;)V", "input", "Ljava/io/BufferedReader;", "output", "Ljava/io/PrintWriter;", "socket", "Ljava/net/Socket;", "connect", "", "serverIp", "", "serverPort", "", "disconnect", "sendMessage", "message", "startReceivingMessages", "Companion", "MessageListener", "app_debug"})
public final class SocketClient {
    @org.jetbrains.annotations.Nullable()
    private final com.app.bmicalculator.network.SocketClient.MessageListener messageListener = null;
    @org.jetbrains.annotations.Nullable()
    private java.net.Socket socket;
    @org.jetbrains.annotations.Nullable()
    private java.io.PrintWriter output;
    @org.jetbrains.annotations.Nullable()
    private java.io.BufferedReader input;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "SocketClient";
    @org.jetbrains.annotations.NotNull()
    public static final com.app.bmicalculator.network.SocketClient.Companion Companion = null;
    
    public SocketClient(@org.jetbrains.annotations.Nullable()
    com.app.bmicalculator.network.SocketClient.MessageListener messageListener) {
        super();
    }
    
    public final void connect(@org.jetbrains.annotations.Nullable()
    java.lang.String serverIp, int serverPort) {
    }
    
    private final void startReceivingMessages() {
    }
    
    public final void disconnect() {
    }
    
    public final void sendMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/app/bmicalculator/network/SocketClient$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/app/bmicalculator/network/SocketClient$MessageListener;", "", "onMessageReceived", "", "message", "", "app_debug"})
    public static abstract interface MessageListener {
        
        public abstract void onMessageReceived(@org.jetbrains.annotations.Nullable()
        java.lang.String message);
    }
}