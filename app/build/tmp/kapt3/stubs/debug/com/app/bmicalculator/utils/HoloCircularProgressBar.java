package com.app.bmicalculator.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 Q2\u00020\u0001:\u0001QB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u00072\u0006\u0010@\u001a\u00020\u0007H\u0003J\u0010\u0010A\u001a\u00020>2\u0006\u0010B\u001a\u00020CH\u0014J\u0018\u0010D\u001a\u00020>2\u0006\u0010E\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\u0007H\u0014J\u0010\u0010G\u001a\u00020>2\u0006\u0010H\u001a\u00020IH\u0014J\b\u0010J\u001a\u00020IH\u0014J\u000e\u0010K\u001a\u00020>2\u0006\u00108\u001a\u00020\u0007J\u000e\u0010L\u001a\u00020>2\u0006\u0010M\u001a\u00020\u0007J\b\u0010N\u001a\u00020>H\u0002J\b\u0010O\u001a\u00020>H\u0002J\b\u0010P\u001a\u00020>H\u0002R\u001e\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u00100\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u000e8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b1\u0010\u0010\"\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b5\u0010\u0010R$\u0010/\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u000e8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b6\u0010\u0010\"\u0004\b7\u00103R$\u00109\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b:\u0010\f\"\u0004\b;\u0010<\u00a8\u0006R"}, d2 = {"Lcom/app/bmicalculator/utils/HoloCircularProgressBar;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "circleStrokeWidth", "getCircleStrokeWidth", "()I", "currentRotation", "", "getCurrentRotation", "()F", "isMarkerEnabled", "", "()Z", "setMarkerEnabled", "(Z)V", "isThumbEnabled", "setThumbEnabled", "mBackgroundColorPaint", "Landroid/graphics/Paint;", "mCircleBounds", "Landroid/graphics/RectF;", "mGravity", "mHorizontalInset", "mIsInitializing", "mMarkerColorPaint", "mMarkerProgress", "mOverrdraw", "mProgress", "mProgressBackgroundColor", "mProgressColor", "mProgressColorPaint", "mRadius", "mSquareRect", "mThumbColorPaint", "mThumbPosX", "mThumbPosY", "mThumbRadius", "mTranslationOffsetX", "mTranslationOffsetY", "mVerticalInset", "progress", "markerProgress", "getMarkerProgress", "setMarkerProgress", "(F)V", "markerRotation", "getMarkerRotation", "getProgress", "setProgress", "color", "progressColor", "getProgressColor", "setProgressColor", "(I)V", "computeInsets", "", "dx", "dy", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onRestoreInstanceState", "state", "Landroid/os/Parcelable;", "onSaveInstanceState", "setProgressBackgroundColor", "setWheelSize", "dimension", "updateBackgroundColor", "updateMarkerColor", "updateProgressColor", "Companion", "app_debug"})
public final class HoloCircularProgressBar extends android.view.View {
    
    /**
     * The rectangle enclosing the circle.
     */
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.RectF mCircleBounds = null;
    
    /**
     * the rect for the thumb square
     */
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.RectF mSquareRect = null;
    
    /**
     * the paint for the background.
     */
    @org.jetbrains.annotations.NotNull()
    private android.graphics.Paint mBackgroundColorPaint;
    
    /**
     * The stroke width used to paint the circle.
     */
    private int circleStrokeWidth = 10;
    
    /**
     * The gravity of the view. Where should the Circle be drawn within the given bounds
     *
     * [.computeInsets]
     */
    private int mGravity = android.view.Gravity.CENTER;
    
    /**
     * The Horizontal inset calcualted in [.computeInsets] depends on [ ][.mGravity].
     */
    private int mHorizontalInset = 0;
    
    /**
     * true if not all properties are set. then the view isn't drawn and there are no errors in the
     * LayoutEditor
     */
    private boolean mIsInitializing = true;
    private boolean isMarkerEnabled = false;
    private boolean isThumbEnabled = true;
    
    /**
     * The Marker color paint.
     */
    @org.jetbrains.annotations.Nullable()
    private android.graphics.Paint mMarkerColorPaint;
    
    /**
     * The Marker progress.
     */
    private float mMarkerProgress = 0.0F;
    
    /**
     * the overdraw is true if the progress is over 1.0.
     */
    private boolean mOverrdraw = false;
    
    /**
     * The current progress.
     */
    private float mProgress = 0.3F;
    
    /**
     * The color of the progress background.
     */
    private int mProgressBackgroundColor = 0;
    
    /**
     * the color of the progress.
     */
    private int mProgressColor = 0;
    
    /**
     * paint for the progress.
     */
    @org.jetbrains.annotations.Nullable()
    private android.graphics.Paint mProgressColorPaint;
    
    /**
     * Radius of the circle
     *
     *
     * Note: (Re)calculated in [.onMeasure].
     */
    private float mRadius = 0.0F;
    
    /**
     * The Thumb color paint.
     */
    @org.jetbrains.annotations.NotNull()
    private android.graphics.Paint mThumbColorPaint;
    
    /**
     * The Thumb pos x.
     *
     * Care. the position is not the position of the rotated thumb. The position is only calculated
     * in [.onMeasure]
     */
    private float mThumbPosX = 0.0F;
    
    /**
     * The Thumb pos y.
     *
     * Care. the position is not the position of the rotated thumb. The position is only calculated
     * in [.onMeasure]
     */
    private float mThumbPosY = 0.0F;
    
    /**
     * The pointer width (in pixels).
     */
    private int mThumbRadius = 20;
    
    /**
     * The Translation offset x which gives us the ability to use our own coordinates system.
     */
    private float mTranslationOffsetX = 0.0F;
    
    /**
     * The Translation offset y which gives us the ability to use our own coordinates system.
     */
    private float mTranslationOffsetY = 0.0F;
    private int mVerticalInset = 0;
    
    /**
     * used to save the super state on configuration change
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String INSTANCE_STATE_SAVEDSTATE = "saved_state";
    
    /**
     * used to save the progress on configuration changes
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String INSTANCE_STATE_PROGRESS = "progress";
    
    /**
     * used to save the marker progress on configuration changes
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String INSTANCE_STATE_MARKER_PROGRESS = "marker_progress";
    
    /**
     * used to save the background color of the progress
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String INSTANCE_STATE_PROGRESS_BACKGROUND_COLOR = "progress_background_color";
    
    /**
     * used to save the color of the progress
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String INSTANCE_STATE_PROGRESS_COLOR = "progress_color";
    
    /**
     * used to save and restore the visibility of the thumb in this instance
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String INSTANCE_STATE_THUMB_VISIBLE = "thumb_visible";
    
    /**
     * used to save and restore the visibility of the marker in this instance
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String INSTANCE_STATE_MARKER_VISIBLE = "marker_visible";
    @org.jetbrains.annotations.NotNull()
    public static final com.app.bmicalculator.utils.HoloCircularProgressBar.Companion Companion = null;
    
    @kotlin.jvm.JvmOverloads()
    public HoloCircularProgressBar(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public HoloCircularProgressBar(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public HoloCircularProgressBar(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    /**
     * The stroke width used to paint the circle.
     */
    public final int getCircleStrokeWidth() {
        return 0;
    }
    
    public final boolean isMarkerEnabled() {
        return false;
    }
    
    public final void setMarkerEnabled(boolean p0) {
    }
    
    public final boolean isThumbEnabled() {
        return false;
    }
    
    public final void setThumbEnabled(boolean p0) {
    }
    
    public final float getMarkerProgress() {
        return 0.0F;
    }
    
    public final void setMarkerProgress(float progress) {
    }
    
    public final float getProgress() {
        return 0.0F;
    }
    
    /**
     * Sets the progress.
     *
     * @param progress the new progress
     */
    public final void setProgress(float progress) {
    }
    
    /**
     * Gets the progress color.
     *
     * @return the progress color
     */
    public final int getProgressColor() {
        return 0;
    }
    
    /**
     * Sets the progress color.
     *
     * @param color the new progress color
     */
    public final void setProgressColor(int color) {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    @java.lang.Override()
    protected void onRestoreInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Parcelable state) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected android.os.Parcelable onSaveInstanceState() {
        return null;
    }
    
    public final void setProgressBackgroundColor(int color) {
    }
    
    /**
     * Sets the wheel size.
     *
     * @param dimension the new wheel size
     */
    public final void setWheelSize(int dimension) {
    }
    
    /**
     * Compute insets.
     *
     * <pre>
     * ______________________
     * |_________dx/2_________|
     * |......| /'''''\|......|
     * |-dx/2-|| View ||-dx/2-|
     * |______| \_____/|______|
     * |________ dx/2_________|
     *   </pre> *
     *
     * @param dx the dx the horizontal unfilled space
     * @param dy the dy the horizontal unfilled space
     */
    @android.annotation.SuppressLint(value = {"NewApi"})
    private final void computeInsets(int dx, int dy) {
    }
    
    /**
     * Gets the current rotation.
     *
     * @return the current rotation
     */
    private final float getCurrentRotation() {
        return 0.0F;
    }
    
    /**
     * Gets the marker rotation.
     *
     * @return the marker rotation
     */
    private final float getMarkerRotation() {
        return 0.0F;
    }
    
    /**
     * updates the paint of the background
     */
    private final void updateBackgroundColor() {
    }
    
    /**
     * updates the paint of the marker
     */
    private final void updateMarkerColor() {
    }
    
    /**
     * updates the paint of the progress and the thumb to give them a new visual style
     */
    private final void updateProgressColor() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/app/bmicalculator/utils/HoloCircularProgressBar$Companion;", "", "()V", "INSTANCE_STATE_MARKER_PROGRESS", "", "INSTANCE_STATE_MARKER_VISIBLE", "INSTANCE_STATE_PROGRESS", "INSTANCE_STATE_PROGRESS_BACKGROUND_COLOR", "INSTANCE_STATE_PROGRESS_COLOR", "INSTANCE_STATE_SAVEDSTATE", "INSTANCE_STATE_THUMB_VISIBLE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}