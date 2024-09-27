package com.app.bmicalculator.network;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/app/bmicalculator/network/HTTPStatus;", "", "()V", "ALREADY_EXIST", "", "BAD_REQUEST", "ERROR", "FORBIDDEN", "INVALID_ACCOUNT_STATUS", "NOT_FOUND", "STATUS_SUCCESS200", "STATUS_SUCCESS201", "STATUS_SUCCESS204", "UNAUTHORIZED_AND_VALIDATIONS", "app_debug"})
public final class HTTPStatus {
    public static final int UNAUTHORIZED_AND_VALIDATIONS = 401;
    public static final int BAD_REQUEST = 400;
    public static final int STATUS_SUCCESS200 = 200;
    public static final int STATUS_SUCCESS201 = 201;
    public static final int STATUS_SUCCESS204 = 204;
    public static final int NOT_FOUND = 404;
    public static final int ERROR = 500;
    public static final int ALREADY_EXIST = 409;
    public static final int FORBIDDEN = 403;
    public static final int INVALID_ACCOUNT_STATUS = 402;
    @org.jetbrains.annotations.NotNull()
    public static final com.app.bmicalculator.network.HTTPStatus INSTANCE = null;
    
    private HTTPStatus() {
        super();
    }
}