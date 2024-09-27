package com.app.bmicalculator.utils.snackBar;

/**
 * A handler for multiple [Snackbar]s
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0006"}, d2 = {"Lcom/app/bmicalculator/utils/snackBar/SnackbarManager;", "", "()V", "show", "", "Companion", "app_debug"})
public final class SnackbarManager {
    private static final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    private static final android.os.Handler MAIN_THREAD = null;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.ref.WeakReference<com.app.bmicalculator.utils.snackBar.Snackbar> snackbarReference;
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    @org.jetbrains.annotations.Nullable()
    private static com.app.bmicalculator.utils.snackBar.Snackbar snackBar;
    @org.jetbrains.annotations.Nullable()
    private static com.app.bmicalculator.utils.snackBar.SnackbarManager snackBarManager;
    @org.jetbrains.annotations.NotNull()
    public static final com.app.bmicalculator.utils.snackBar.SnackbarManager.Companion Companion = null;
    
    private SnackbarManager() {
        super();
    }
    
    /**
     * Displays a  in the current [Activity], dismissing
     * the current Snackbar being displayed, if any. Note that the Activity will be obtained from
     * the Snackbar's [android.content.Context]. If the Snackbar was created with
     * [Activity.getApplicationContext] then you must explicitly pass the target
     * Activity using [.show]
     */
    public final void show() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\tJ\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001aJ\"\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/app/bmicalculator/utils/snackBar/SnackbarManager$Companion;", "", "()V", "MAIN_THREAD", "Landroid/os/Handler;", "TAG", "", "kotlin.jvm.PlatformType", "currentSnackbar", "Lcom/app/bmicalculator/utils/snackBar/Snackbar;", "getCurrentSnackbar", "()Lcom/app/bmicalculator/utils/snackBar/Snackbar;", "instance", "Lcom/app/bmicalculator/utils/snackBar/SnackbarManager;", "getInstance", "()Lcom/app/bmicalculator/utils/snackBar/SnackbarManager;", "snackBar", "snackBarManager", "snackbarReference", "Ljava/lang/ref/WeakReference;", "create", "snackbar", "dismiss", "", "show", "activity", "Landroid/app/Activity;", "parent", "Landroid/view/ViewGroup;", "usePhoneLayout", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final com.app.bmicalculator.utils.snackBar.SnackbarManager getInstance() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.app.bmicalculator.utils.snackBar.SnackbarManager create(@org.jetbrains.annotations.NotNull()
        com.app.bmicalculator.utils.snackBar.Snackbar snackbar) {
            return null;
        }
        
        /**
         * Displays a  in the current [Activity], dismissing
         * the current Snackbar being displayed, if any
         *
         * @param snackbar instance of  to display
         * @param activity target [Activity] to display the Snackbar
         */
        public final void show(@org.jetbrains.annotations.NotNull()
        com.app.bmicalculator.utils.snackBar.Snackbar snackbar, @org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
        }
        
        /**
         * Displays a   in the specified [ViewGroup], dismissing
         * the current Snackbar being displayed, if any
         *
         * @param snackbar       instance of   to display
         * @param parent         parent [ViewGroup] to display the Snackbar
         * @param usePhoneLayout true: use phone layout, false: use tablet layout
         */
        @kotlin.jvm.JvmOverloads()
        public final void show(@org.jetbrains.annotations.NotNull()
        com.app.bmicalculator.utils.snackBar.Snackbar snackbar, @org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent) {
        }
        
        /**
         * Displays a   in the specified [ViewGroup], dismissing
         * the current Snackbar being displayed, if any
         *
         * @param snackbar       instance of   to display
         * @param parent         parent [ViewGroup] to display the Snackbar
         * @param usePhoneLayout true: use phone layout, false: use tablet layout
         */
        @kotlin.jvm.JvmOverloads()
        public final void show(@org.jetbrains.annotations.NotNull()
        com.app.bmicalculator.utils.snackBar.Snackbar snackbar, @org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, boolean usePhoneLayout) {
        }
        
        /**
         * Dismisses the   shown by this manager.
         */
        public final void dismiss() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.app.bmicalculator.utils.snackBar.Snackbar getCurrentSnackbar() {
            return null;
        }
    }
}