package com.app.bmicalculator.utils.snackBar;

/**
 * A [View.OnTouchListener] that makes any [View] dismissible
 * when the user swipes (drags her finger) horizontally across the view.
 *
 *
 * @author Roman Nurik
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH\u0017J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u0003H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/app/bmicalculator/utils/snackBar/SwipeDismissTouchListener;", "Landroid/view/View$OnTouchListener;", "mContainerView", "Landroid/view/View;", "mToken", "", "mCallbacks", "Lcom/app/bmicalculator/utils/snackBar/SwipeDismissTouchListener$DismissCallbacks;", "(Landroid/view/View;Ljava/lang/String;Lcom/app/bmicalculator/utils/snackBar/SwipeDismissTouchListener$DismissCallbacks;)V", "mAnimationTime", "", "mDownX", "", "mDownY", "mMaxFlingVelocity", "", "mMinFlingVelocity", "mSlop", "mSwiping", "", "mSwipingSlop", "mTranslationX", "mVelocityTracker", "Landroid/view/VelocityTracker;", "mViewWidth", "onTouch", "view", "motionEvent", "Landroid/view/MotionEvent;", "performDismiss", "", "DismissCallbacks", "app_debug"})
public final class SwipeDismissTouchListener implements android.view.View.OnTouchListener {
    @org.jetbrains.annotations.NotNull()
    private final android.view.View mContainerView = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String mToken = null;
    @org.jetbrains.annotations.NotNull()
    private final com.app.bmicalculator.utils.snackBar.SwipeDismissTouchListener.DismissCallbacks mCallbacks = null;
    private final int mSlop = 0;
    private final int mMinFlingVelocity = 0;
    private final int mMaxFlingVelocity = 0;
    private final long mAnimationTime = 0L;
    private int mViewWidth = 1;
    private float mDownX = 0.0F;
    private float mDownY = 0.0F;
    private boolean mSwiping = false;
    private int mSwipingSlop = 0;
    @org.jetbrains.annotations.Nullable()
    private android.view.VelocityTracker mVelocityTracker;
    private float mTranslationX = 0.0F;
    
    public SwipeDismissTouchListener(@org.jetbrains.annotations.NotNull()
    android.view.View mContainerView, @org.jetbrains.annotations.NotNull()
    java.lang.String mToken, @org.jetbrains.annotations.NotNull()
    com.app.bmicalculator.utils.snackBar.SwipeDismissTouchListener.DismissCallbacks mCallbacks) {
        super();
    }
    
    @java.lang.Override()
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    public boolean onTouch(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    android.view.MotionEvent motionEvent) {
        return false;
    }
    
    private final void performDismiss(android.view.View view) {
    }
    
    /**
     * The callback interface used by [SwipeDismissTouchListener] to inform its client
     * about a successful dismissal of the view for which it was created.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H&J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0001H&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0003H&\u00a8\u0006\u000b"}, d2 = {"Lcom/app/bmicalculator/utils/snackBar/SwipeDismissTouchListener$DismissCallbacks;", "", "canDismiss", "", "token", "onDismiss", "", "view", "Landroid/view/View;", "pauseTimer", "shouldPause", "app_debug"})
    public static abstract interface DismissCallbacks {
        
        /**
         * Called to determine whether the view can be dismissed.
         */
        public abstract boolean canDismiss(@org.jetbrains.annotations.NotNull()
        java.lang.Object token);
        
        /**
         * Called when the user has indicated they she would like to dismiss the view.
         *
         * @param view  The originating [View] to be dismissed.
         * @param token The optional token passed to this object's constructor.
         */
        public abstract void onDismiss(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        java.lang.Object token);
        
        public abstract void pauseTimer(boolean shouldPause);
    }
}