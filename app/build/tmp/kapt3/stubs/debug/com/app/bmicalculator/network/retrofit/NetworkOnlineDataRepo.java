package com.app.bmicalculator.network.retrofit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00070\u0006J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u00a5@\u00a2\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002\u00a8\u0006\u000f"}, d2 = {"Lcom/app/bmicalculator/network/retrofit/NetworkOnlineDataRepo;", "RESULT", "REQUEST", "", "()V", "asFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/app/bmicalculator/network/retrofit/DataResult;", "fetchDataFromRemoteSource", "Lretrofit2/Response;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getErrorMsg", "", "responseBody", "Lokhttp3/ResponseBody;", "app_debug"})
public abstract class NetworkOnlineDataRepo<RESULT extends java.lang.Object, REQUEST extends java.lang.Object> {
    
    public NetworkOnlineDataRepo() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.app.bmicalculator.network.retrofit.DataResult<REQUEST>> asFlow() {
        return null;
    }
    
    private final java.lang.String getErrorMsg(okhttp3.ResponseBody responseBody) {
        return null;
    }
    
    @androidx.annotation.MainThread()
    @org.jetbrains.annotations.Nullable()
    protected abstract java.lang.Object fetchDataFromRemoteSource(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<REQUEST>> $completion);
}