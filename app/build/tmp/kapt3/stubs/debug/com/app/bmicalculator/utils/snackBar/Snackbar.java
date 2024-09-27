package com.app.bmicalculator.utils.snackBar;

/**
 * View that provides quick feedback about an operation in a small popup at the base of the screen
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00b6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\'\u0018\u0000 \u00a3\u00012\u00020\u0001:\u0006\u00a3\u0001\u00a4\u0001\u00a5\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010Z\u001a\u00020\u00002\b\b\u0001\u0010[\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\\\u001a\u00020\bJ\u0010\u0010\u0007\u001a\u00020\u00002\b\b\u0001\u0010[\u001a\u00020\u0006J\u000e\u0010]\u001a\u00020\u00002\u0006\u0010^\u001a\u00020\"J\u000e\u0010_\u001a\u00020\u00002\u0006\u0010`\u001a\u00020\u001eJ\u000e\u0010a\u001a\u00020\u00002\u0006\u0010b\u001a\u00020\u0012J\u000e\u0010c\u001a\u00020\u00002\u0006\u0010d\u001a\u00020\u0012J\u000e\u0010e\u001a\u00020\u00002\u0006\u0010f\u001a\u00020gJ\u000e\u0010h\u001a\u00020\u00002\u0006\u0010i\u001a\u00020jJ\u0010\u0010k\u001a\u00020\u00002\b\b\u0001\u0010[\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0006J\u0010\u0010l\u001a\u00020\u00002\b\b\u0001\u0010[\u001a\u00020\u0006J\u0006\u0010m\u001a\u00020nJ\u000e\u0010m\u001a\u00020n2\u0006\u0010o\u001a\u00020\u0012J\u000e\u0010p\u001a\u00020\u00002\u0006\u0010d\u001a\u00020\u0012J\u0006\u0010q\u001a\u00020nJ\u000e\u0010r\u001a\u00020\u00002\u0006\u0010s\u001a\u00020\u0012J\u0015\u0010t\u001a\u00020n2\u0006\u0010u\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\bvJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020-J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010w\u001a\u00020\u00002\u0006\u0010`\u001a\u00020/J\u0006\u0010x\u001a\u00020nJ\u0010\u0010y\u001a\u00020n2\b\u0010z\u001a\u0004\u0018\u00010jJ)\u0010{\u001a\u00020|2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010}\u001a\u0004\u0018\u00010D2\u0006\u0010~\u001a\u00020\u007f2\u0007\u0010\u0080\u0001\u001a\u00020\u0012J\u0012\u0010\u0081\u0001\u001a\u00020\u00122\u0007\u0010\u0082\u0001\u001a\u00020\u007fH\u0007J\u000f\u0010\u0083\u0001\u001a\u00020\u00122\u0006\u0010}\u001a\u00020DJ\u0018\u0010\u001b\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0003\u0010\u0084\u0001J\u0011\u0010\u0085\u0001\u001a\u00020\u00002\b\b\u0001\u0010[\u001a\u00020\u0006J\u0010\u0010\u0086\u0001\u001a\u00020\u00002\u0007\u0010\u0086\u0001\u001a\u00020\u0006J\u0019\u0010\u0086\u0001\u001a\u00020\u00002\u0007\u0010\u0087\u0001\u001a\u00020\u00062\u0007\u0010\u0088\u0001\u001a\u00020\u0006J+\u0010\u0086\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u00062\u0007\u0010\u008a\u0001\u001a\u00020\u00062\u0007\u0010\u008b\u0001\u001a\u00020\u00062\u0007\u0010\u008c\u0001\u001a\u00020\u0006J\u0010\u0010\u008d\u0001\u001a\u00020\u00002\u0007\u0010\u008d\u0001\u001a\u000209J\t\u0010\u008e\u0001\u001a\u00020nH\u0014J\u0011\u0010\u008f\u0001\u001a\u00020n2\u0006\u0010u\u001a\u00020\u0006H\u0004J\u0010\u0010\u0090\u0001\u001a\u00020\u00002\u0007\u0010\u0090\u0001\u001a\u00020<J\t\u0010\u0091\u0001\u001a\u00020nH\u0004J\u0007\u0010\u0092\u0001\u001a\u00020\u0012J\u0007\u0010\u0093\u0001\u001a\u00020\u0012J\u000f\u0010\u0094\u0001\u001a\u00020n2\u0006\u0010}\u001a\u00020DJ\u001c\u0010\u0094\u0001\u001a\u00020n2\u0006\u0010~\u001a\u00020\u007f2\t\b\u0002\u0010\u0080\u0001\u001a\u00020\u0012H\u0007J\u000f\u0010\u0095\u0001\u001a\u00020\u00002\u0006\u0010d\u001a\u00020\u0012J\u000f\u0010\u0096\u0001\u001a\u00020n2\u0006\u0010}\u001a\u00020DJ\u000f\u0010\u0096\u0001\u001a\u00020n2\u0006\u0010~\u001a\u00020\u007fJ\u0018\u0010\u0096\u0001\u001a\u00020n2\u0006\u0010~\u001a\u00020\u007f2\u0007\u0010\u0080\u0001\u001a\u00020\u0012J\"\u0010\u0097\u0001\u001a\u00020n2\b\u0010}\u001a\u0004\u0018\u00010D2\u0007\u0010\u0098\u0001\u001a\u00020|2\u0006\u0010~\u001a\u00020\u007fJ\u0007\u0010\u0099\u0001\u001a\u00020nJ\u000f\u0010\u0099\u0001\u001a\u00020n2\u0006\u0010\r\u001a\u00020\u000eJ\u000f\u0010\u009a\u0001\u001a\u00020\u00002\u0006\u0010`\u001a\u00020 J\u0010\u0010\u009b\u0001\u001a\u00020\u00002\u0007\u0010\u009c\u0001\u001a\u00020\u0012J\u000e\u0010Q\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\bJ\u0010\u0010Q\u001a\u00020\u00002\b\b\u0001\u0010[\u001a\u00020\u0006J\u000e\u0010T\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\u0006J\u0011\u0010\u009d\u0001\u001a\u00020\u00002\b\b\u0001\u0010[\u001a\u00020\u0006J\u000f\u0010\u009e\u0001\u001a\u00020\u00002\u0006\u0010^\u001a\u00020\"J\u000e\u0010W\u001a\u00020\u00002\u0006\u0010W\u001a\u00020VJ\u001c\u0010\u009f\u0001\u001a\u00020n2\b\u0010}\u001a\u0004\u0018\u00010D2\u0007\u0010\u0098\u0001\u001a\u00020|H\u0004J\u001a\u0010\u00a0\u0001\u001a\u00020n2\b\u0010}\u001a\u0004\u0018\u00010D2\u0007\u0010\u00a1\u0001\u001a\u00020(J\u0010\u0010\u00a2\u0001\u001a\u00020\u00002\u0007\u0010\u0090\u0001\u001a\u00020<R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0012@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u001e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0012@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u001e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0012@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\u001b\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\fR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u00102\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u00103R\u000e\u00104\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u00108\u001a\u0004\u0018\u000109X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010:R\u000e\u0010;\u001a\u00020<X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020*X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010C\u001a\u0004\u0018\u00010DX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010E\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020<X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010L\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010\fR\u0010\u0010N\u001a\u0004\u0018\u00010OX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010P\u001a\u0004\u0018\u00010OX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010Q\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u001e\u0010T\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010\fR\u001e\u0010W\u001a\u00020V2\u0006\u0010\t\u001a\u00020V@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010Y\u00a8\u0006\u00a6\u0001"}, d2 = {"Lcom/app/bmicalculator/utils/snackBar/Snackbar;", "Lcom/app/bmicalculator/utils/snackBar/SnackbarLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "actionColor", "", "actionLabel", "", "<set-?>", "color", "getColor", "()I", "duration", "", "getDuration", "()J", "isActionClicked", "", "isAnimated", "()Z", "isDimissing", "isDismissAnimated", "isDismissed", "isIndefiniteDuration", "isShowAnimated", "isShowing", "lineColor", "getLineColor", "mActionClickListener", "Lcom/app/bmicalculator/utils/snackBar/ActionClickListener;", "mActionSwipeListener", "Lcom/app/bmicalculator/utils/snackBar/ActionSwipeListener;", "mActionTypeface", "Landroid/graphics/Typeface;", "mCanSwipeToDismiss", "mCustomDuration", "mDismissRunnable", "Ljava/lang/Runnable;", "mDisplayFrame", "Landroid/graphics/Rect;", "mDisplaySize", "Landroid/graphics/Point;", "mDrawable", "mDuration", "Lcom/app/bmicalculator/utils/snackBar/Snackbar$SnackbarDuration;", "mEventListener", "Lcom/app/bmicalculator/utils/snackBar/EventListener;", "mIsReplacePending", "mIsShowingByReplace", "mLineColor", "Ljava/lang/Integer;", "mMarginBottom", "mMarginLeft", "mMarginRight", "mMarginTop", "mMaxWidthPercentage", "", "Ljava/lang/Float;", "mPhonePosition", "Lcom/app/bmicalculator/utils/snackBar/Snackbar$SnackbarPosition;", "mRealDisplaySize", "mRefreshLayoutParamsMarginsRunnable", "mShouldAllowMultipleActionClicks", "mShouldDismissOnActionClicked", "mSnackbarFinish", "mSnackbarStart", "mTargetActivity", "Landroid/app/Activity;", "mTextTypeface", "mTimeRemaining", "mUndefinedColor", "mUndefinedDrawable", "mUsePhoneLayout", "mWidePosition", "mWindowInsets", "offset", "getOffset", "snackbarAction", "Landroid/widget/TextView;", "snackbarText", "text", "getText", "()Ljava/lang/CharSequence;", "textColor", "getTextColor", "Lcom/app/bmicalculator/utils/snackBar/SnackbarType;", "type", "getType", "()Lcom/app/bmicalculator/utils/snackBar/SnackbarType;", "actionColorResource", "resId", "actionButtonLabel", "actionLabelTypeface", "typeface", "actionListener", "listener", "allowMultipleActionClicks", "shouldAllow", "animation", "withAnimation", "attachToAbsListView", "absListView", "Landroid/widget/AbsListView;", "attachToRecyclerView", "recyclerView", "Landroid/view/View;", "backgroundDrawable", "colorResource", "dismiss", "", "animate", "dismissAnimation", "dismissByReplace", "dismissOnActionClicked", "shouldDismiss", "dispatchOnWindowSystemUiVisibilityChangedCompat", "visible", "dispatchOnWindowSystemUiVisibilityChangedCompat$app_debug", "eventListener", "finish", "focusForAccessibility", "view", "init", "Landroid/view/ViewGroup$MarginLayoutParams;", "targetActivity", "parent", "Landroid/view/ViewGroup;", "usePhoneLayout", "isNavigationBarHidden", "root", "isNavigationBarTranslucent", "(Ljava/lang/Integer;)Lcom/app/bmicalculator/utils/snackBar/Snackbar;", "lineColorResource", "margin", "marginLR", "marginTB", "marginLeft", "marginTop", "marginRight", "marginBottom", "maxWidthPercentage", "onDetachedFromWindow", "onWindowSystemUiVisibilityChangedCompat", "position", "refreshLayoutParamsMargins", "shouldDismissOnActionClicked", "shouldStartTimer", "show", "showAnimation", "showByReplace", "showInternal", "params", "startTimer", "swipeListener", "swipeToDismiss", "canSwipeToDismiss", "textColorResource", "textTypeface", "updateLayoutParamsMargins", "updateWindowInsets", "outInsets", "widePosition", "Companion", "SnackbarDuration", "SnackbarPosition", "app_debug"})
public final class Snackbar extends com.app.bmicalculator.utils.snackBar.SnackbarLayout {
    private final int mUndefinedColor = -10000;
    private final int mUndefinedDrawable = -10000;
    @org.jetbrains.annotations.NotNull()
    private com.app.bmicalculator.utils.snackBar.SnackbarType type = com.app.bmicalculator.utils.snackBar.SnackbarType.SINGLE_LINE;
    @org.jetbrains.annotations.NotNull()
    private com.app.bmicalculator.utils.snackBar.Snackbar.SnackbarDuration mDuration = com.app.bmicalculator.utils.snackBar.Snackbar.SnackbarDuration.LENGTH_LONG;
    @org.jetbrains.annotations.Nullable()
    private java.lang.CharSequence text;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView snackbarText;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView snackbarAction;
    private int color;
    private int textColor;
    
    /**
     * bottom of the [Activity].
     */
    private int offset = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer mLineColor;
    @org.jetbrains.annotations.NotNull()
    private com.app.bmicalculator.utils.snackBar.Snackbar.SnackbarPosition mPhonePosition = com.app.bmicalculator.utils.snackBar.Snackbar.SnackbarPosition.BOTTOM;
    @org.jetbrains.annotations.NotNull()
    private com.app.bmicalculator.utils.snackBar.Snackbar.SnackbarPosition mWidePosition = com.app.bmicalculator.utils.snackBar.Snackbar.SnackbarPosition.BOTTOM_CENTER;
    private int mDrawable;
    private int mMarginTop = 0;
    private int mMarginBottom = 0;
    private int mMarginLeft = 0;
    private int mMarginRight = 0;
    private long mSnackbarStart = 0L;
    private long mSnackbarFinish = 0L;
    private long mTimeRemaining = -1L;
    @org.jetbrains.annotations.Nullable()
    private java.lang.CharSequence actionLabel;
    private int actionColor;
    private boolean isShowAnimated = true;
    private boolean isDismissAnimated = true;
    private boolean mIsReplacePending = false;
    private boolean mIsShowingByReplace = false;
    private long mCustomDuration = -1L;
    @org.jetbrains.annotations.Nullable()
    private com.app.bmicalculator.utils.snackBar.ActionClickListener mActionClickListener;
    @org.jetbrains.annotations.Nullable()
    private com.app.bmicalculator.utils.snackBar.ActionSwipeListener mActionSwipeListener;
    private boolean mShouldAllowMultipleActionClicks = false;
    
    /**
     * @return whether the action button has been clicked. In other words, this method will let
     * you know if {
     * was called. This is useful, for instance, if you want to know during
     */
    private boolean isActionClicked = false;
    private boolean mShouldDismissOnActionClicked = true;
    @org.jetbrains.annotations.Nullable()
    private com.app.bmicalculator.utils.snackBar.EventListener mEventListener;
    @org.jetbrains.annotations.Nullable()
    private android.graphics.Typeface mTextTypeface;
    @org.jetbrains.annotations.Nullable()
    private android.graphics.Typeface mActionTypeface;
    
    /**
     */
    private boolean isShowing = false;
    private boolean mCanSwipeToDismiss = true;
    
    /**
     * @return true if this  is dismissing.
     */
    private boolean isDimissing = false;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Rect mWindowInsets = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Rect mDisplayFrame = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Point mDisplaySize = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Point mRealDisplaySize = null;
    @org.jetbrains.annotations.Nullable()
    private android.app.Activity mTargetActivity;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float mMaxWidthPercentage;
    private boolean mUsePhoneLayout = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Runnable mDismissRunnable = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Runnable mRefreshLayoutParamsMarginsRunnable = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.app.bmicalculator.utils.snackBar.Snackbar.Companion Companion = null;
    
    private Snackbar(android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.SnackbarType getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.CharSequence getText() {
        return null;
    }
    
    public final int getColor() {
        return 0;
    }
    
    public final int getTextColor() {
        return 0;
    }
    
    /**
     * bottom of the [Activity].
     */
    public final int getOffset() {
        return 0;
    }
    
    public final boolean isShowAnimated() {
        return false;
    }
    
    /**
     */
    public final boolean isShowing() {
        return false;
    }
    
    /**
     * @return true if this  is dismissing.
     */
    public final boolean isDimissing() {
        return false;
    }
    
    private final boolean isIndefiniteDuration() {
        return false;
    }
    
    public final int getLineColor() {
        return 0;
    }
    
    public final long getDuration() {
        return 0L;
    }
    
    public final boolean isAnimated() {
        return false;
    }
    
    public final boolean isDismissed() {
        return false;
    }
    
    /**
     * Sets the type of [Snackbar] to be displayed.
     *
     * @param type the [SnackbarType] of this instance
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar type(@org.jetbrains.annotations.NotNull()
    com.app.bmicalculator.utils.snackBar.SnackbarType type) {
        return null;
    }
    
    /**
     * Sets the text to be displayed in this [Snackbar]
     *
     * @param text
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar text(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text) {
        return null;
    }
    
    /**
     * Sets the text to be displayed in this [Snackbar]
     *
     * @param resId
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar text(@androidx.annotation.StringRes()
    int resId) {
        return null;
    }
    
    /**
     * Sets the background color of this [Snackbar]
     *
     * @param color
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar color(int color) {
        return null;
    }
    
    /**
     * Sets the background color of this [Snackbar]
     *
     * @param resId
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar colorResource(@androidx.annotation.ColorRes()
    int resId) {
        return null;
    }
    
    /**
     * Sets the background drawable of this [Snackbar]
     *
     * @param resId
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar backgroundDrawable(@androidx.annotation.DrawableRes()
    int resId) {
        return null;
    }
    
    /**
     * Sets the text color of this [Snackbar]
     *
     * @param textColor
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar textColor(int textColor) {
        return null;
    }
    
    /**
     * Sets the text color of this [Snackbar]
     *
     * @param resId
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar textColorResource(@androidx.annotation.ColorRes()
    int resId) {
        return null;
    }
    
    /**
     * Sets the text color of this [Snackbar]'s top line, or null for none
     *
     * @param lineColor
     * @return
     */
    private final com.app.bmicalculator.utils.snackBar.Snackbar lineColor(java.lang.Integer lineColor) {
        return null;
    }
    
    /**
     * Sets the text color of this [Snackbar]'s top line
     *
     * @param resId
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar lineColorResource(@androidx.annotation.ColorRes()
    int resId) {
        return null;
    }
    
    /**
     * Sets the action label to be displayed, if any. Note that if this is not set, the action
     * button will not be displayed
     *
     * @param actionButtonLabel
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar actionLabel(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence actionButtonLabel) {
        return null;
    }
    
    /**
     * Sets the action label to be displayed, if any. Note that if this is not set, the action
     * button will not be displayed
     *
     * @param resId
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar actionLabel(@androidx.annotation.StringRes()
    int resId) {
        return null;
    }
    
    /**
     * Set the position of the [Snackbar]. Note that if this is not set, the default is to
     * show the snackbar to the bottom of the screen.
     *
     * @param position
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar position(@org.jetbrains.annotations.NotNull()
    com.app.bmicalculator.utils.snackBar.Snackbar.SnackbarPosition position) {
        return null;
    }
    
    /**
     * Set the position for wide screen (tablets | desktop) of the [Snackbar]. Note that if this is not set, the default is to
     * show the snackbar to the bottom | center of the screen.
     *
     * @param position A
     * @return A [Snackbar] instance to make changing
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar widePosition(@org.jetbrains.annotations.NotNull()
    com.app.bmicalculator.utils.snackBar.Snackbar.SnackbarPosition position) {
        return null;
    }
    
    /**
     * Sets all the margins of the [Snackbar] to the same value, in pixels
     *
     * @param margin
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar margin(int margin) {
        return null;
    }
    
    /**
     * Sets the margins of the [Snackbar] in pixels such that the left and right are equal, and the top and bottom are equal
     *
     * @param marginLR
     * @param marginTB
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar margin(int marginLR, int marginTB) {
        return null;
    }
    
    /**
     * Sets all the margin of the [Snackbar] individually, in pixels
     *
     * @param marginLeft
     * @param marginTop
     * @param marginRight
     * @param marginBottom
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar margin(int marginLeft, int marginTop, int marginRight, int marginBottom) {
        return null;
    }
    
    /**
     * Sets the color of the action button label. Note that you must set a button label with
     * [Snackbar.actionLabel] for this button to be displayed
     *
     * @param actionColor
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar actionColor(int actionColor) {
        return null;
    }
    
    /**
     * Sets the color of the action button label. Note that you must set a button label with
     * [Snackbar.actionLabel] for this button to be displayed
     *
     * @param resId
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar actionColorResource(@androidx.annotation.ColorRes()
    int resId) {
        return null;
    }
    
    /**
     * Determines whether this [Snackbar] should dismiss when the action button is touched
     *
     * @param shouldDismiss
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar dismissOnActionClicked(boolean shouldDismiss) {
        return null;
    }
    
    /**
     * Sets the listener to be called when the [Snackbar] action is
     * selected. Note that you must set a button label with
     * [Snackbar.actionLabel] for this button to be displayed
     *
     * @param listener
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar actionListener(@org.jetbrains.annotations.NotNull()
    com.app.bmicalculator.utils.snackBar.ActionClickListener listener) {
        return null;
    }
    
    /**
     * Sets the listener to be called when the [Snackbar] is dismissed by swipe.
     *
     * @param listener
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar swipeListener(@org.jetbrains.annotations.NotNull()
    com.app.bmicalculator.utils.snackBar.ActionSwipeListener listener) {
        return null;
    }
    
    /**
     * Determines whether this [Snackbar] should allow the action button to be
     * clicked multiple times
     *
     * @param shouldAllow
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar allowMultipleActionClicks(boolean shouldAllow) {
        return null;
    }
    
    /**
     * Sets the listener to be called when the [Snackbar] is dismissed.
     *
     * @param listener
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar eventListener(@org.jetbrains.annotations.NotNull()
    com.app.bmicalculator.utils.snackBar.EventListener listener) {
        return null;
    }
    
    /**
     * Sets on/off both show and dismiss animations for this [Snackbar]
     *
     * @param withAnimation
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar animation(boolean withAnimation) {
        return null;
    }
    
    /**
     * Sets on/off show animation for this [Snackbar]
     *
     * @param withAnimation
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar showAnimation(boolean withAnimation) {
        return null;
    }
    
    /**
     * Sets on/off dismiss animation for this [Snackbar]
     *
     * @param withAnimation
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar dismissAnimation(boolean withAnimation) {
        return null;
    }
    
    /**
     * Determines whether this  can be swiped off from the screen
     *
     * @param canSwipeToDismiss
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar swipeToDismiss(boolean canSwipeToDismiss) {
        return null;
    }
    
    /**
     * Sets the duration of this [Snackbar]. See
     * [Snackbar.SnackbarDuration] for available options
     *
     * @param duration
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar duration(@org.jetbrains.annotations.NotNull()
    com.app.bmicalculator.utils.snackBar.Snackbar.SnackbarDuration duration) {
        return null;
    }
    
    /**
     * Sets a custom duration of this [Snackbar]
     *
     * @param duration custom duration. Value must be greater than 0 or it will be ignored
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar duration(long duration) {
        return null;
    }
    
    /**
     * Attaches this [Snackbar] to an AbsListView (ListView, GridView, ExpandableListView) so
     * it dismisses when the list is scrolled
     *
     * @param absListView
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar attachToAbsListView(@org.jetbrains.annotations.NotNull()
    android.widget.AbsListView absListView) {
        return null;
    }
    
    /**
     * Attaches this [Snackbar] to a RecyclerView so it dismisses when the list is scrolled
     *
     * @param recyclerView The RecyclerView instance to attach to.
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar attachToRecyclerView(@org.jetbrains.annotations.NotNull()
    android.view.View recyclerView) {
        return null;
    }
    
    /**
     * Use a custom typeface for this Snackbar's text
     *
     * @param typeface
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar textTypeface(@org.jetbrains.annotations.NotNull()
    android.graphics.Typeface typeface) {
        return null;
    }
    
    /**
     * Use a custom typeface for this Snackbar's action label
     *
     * @param typeface
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar actionLabelTypeface(@org.jetbrains.annotations.NotNull()
    android.graphics.Typeface typeface) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.ViewGroup.MarginLayoutParams init(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.app.Activity targetActivity, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, boolean usePhoneLayout) {
        return null;
    }
    
    public final void updateWindowInsets(@org.jetbrains.annotations.Nullable()
    android.app.Activity targetActivity, @org.jetbrains.annotations.NotNull()
    android.graphics.Rect outInsets) {
    }
    
    public final void showByReplace(@org.jetbrains.annotations.NotNull()
    android.app.Activity targetActivity) {
    }
    
    public final void showByReplace(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
    }
    
    public final void showByReplace(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, boolean usePhoneLayout) {
    }
    
    /**
     * Displays the [Snackbar] at the bottom of the
     * [Activity] provided.
     *
     * @param targetActivity
     */
    public final void show(@org.jetbrains.annotations.NotNull()
    android.app.Activity targetActivity) {
    }
    
    /**
     * Displays the [Snackbar] at the bottom of the
     * [ViewGroup] provided.
     *
     * @param parent
     * @param usePhoneLayout
     */
    @kotlin.jvm.JvmOverloads()
    public final void show(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
    }
    
    /**
     * Displays the [Snackbar] at the bottom of the
     * [ViewGroup] provided.
     *
     * @param parent
     * @param usePhoneLayout
     */
    @kotlin.jvm.JvmOverloads()
    public final void show(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, boolean usePhoneLayout) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.bmicalculator.utils.snackBar.Snackbar maxWidthPercentage(float maxWidthPercentage) {
        return null;
    }
    
    public final void showInternal(@org.jetbrains.annotations.Nullable()
    android.app.Activity targetActivity, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup.MarginLayoutParams params, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
    }
    
    public final void focusForAccessibility(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    public final boolean shouldStartTimer() {
        return false;
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.JELLY_BEAN)
    public final boolean isNavigationBarHidden(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup root) {
        return false;
    }
    
    public final boolean isNavigationBarTranslucent(@org.jetbrains.annotations.NotNull()
    android.app.Activity targetActivity) {
        return false;
    }
    
    public final void startTimer() {
    }
    
    public final void startTimer(long duration) {
    }
    
    public final void dismissByReplace() {
    }
    
    public final void dismiss() {
    }
    
    public final void dismiss(boolean animate) {
    }
    
    public final void finish() {
    }
    
    @java.lang.Override()
    protected void onDetachedFromWindow() {
    }
    
    public final void dispatchOnWindowSystemUiVisibilityChangedCompat$app_debug(int visible) {
    }
    
    protected final void onWindowSystemUiVisibilityChangedCompat(int visible) {
    }
    
    protected final void refreshLayoutParamsMargins() {
    }
    
    protected final void updateLayoutParamsMargins(@org.jetbrains.annotations.Nullable()
    android.app.Activity targetActivity, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup.MarginLayoutParams params) {
    }
    
    public final boolean shouldDismissOnActionClicked() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0007J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0007J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0017\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0000\u00a2\u0006\u0002\b\u001dJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001c\u00a8\u0006 "}, d2 = {"Lcom/app/bmicalculator/utils/snackBar/Snackbar$Companion;", "", "()V", "createMarginLayoutParams", "Landroid/view/ViewGroup$MarginLayoutParams;", "viewGroup", "Landroid/view/ViewGroup;", "width", "", "height", "position", "Lcom/app/bmicalculator/utils/snackBar/Snackbar$SnackbarPosition;", "dpToPx", "dp", "scale", "", "getInAnimationResource", "snackbarPosition", "getOutAnimationResource", "setBackgroundDrawable", "", "view", "Landroid/view/View;", "drawable", "Landroid/graphics/drawable/Drawable;", "shouldUsePhoneLayout", "", "context", "Landroid/content/Context;", "shouldUsePhoneLayout$app_debug", "with", "Lcom/app/bmicalculator/utils/snackBar/Snackbar;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.app.bmicalculator.utils.snackBar.Snackbar with(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.ViewGroup.MarginLayoutParams createMarginLayoutParams(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup viewGroup, int width, int height, @org.jetbrains.annotations.NotNull()
        com.app.bmicalculator.utils.snackBar.Snackbar.SnackbarPosition position) {
            return null;
        }
        
        public final boolean shouldUsePhoneLayout$app_debug(@org.jetbrains.annotations.Nullable()
        android.content.Context context) {
            return false;
        }
        
        public final int dpToPx(int dp, float scale) {
            return 0;
        }
        
        /**
         * @param snackbarPosition
         * @return the animation resource used by this  instance
         * to enter the view
         */
        @androidx.annotation.AnimRes()
        public final int getInAnimationResource(@org.jetbrains.annotations.NotNull()
        com.app.bmicalculator.utils.snackBar.Snackbar.SnackbarPosition snackbarPosition) {
            return 0;
        }
        
        /**
         * @param snackbarPosition
         * @return the animation resource used by this  instance
         * to exit the view
         */
        @androidx.annotation.AnimRes()
        public final int getOutAnimationResource(@org.jetbrains.annotations.NotNull()
        com.app.bmicalculator.utils.snackBar.Snackbar.SnackbarPosition snackbarPosition) {
            return 0;
        }
        
        /**
         * Set a Background Drawable using the appropriate Android version api call
         *
         * @param view
         * @param drawable
         */
        public final void setBackgroundDrawable(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        android.graphics.drawable.Drawable drawable) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/app/bmicalculator/utils/snackBar/Snackbar$SnackbarDuration;", "", "duration", "", "(Ljava/lang/String;IJ)V", "getDuration", "()J", "LENGTH_SHORT", "LENGTH_LONG", "LENGTH_INDEFINITE", "app_debug"})
    public static enum SnackbarDuration {
        /*public static final*/ LENGTH_SHORT /* = new LENGTH_SHORT(0L) */,
        /*public static final*/ LENGTH_LONG /* = new LENGTH_LONG(0L) */,
        /*public static final*/ LENGTH_INDEFINITE /* = new LENGTH_INDEFINITE(0L) */;
        private final long duration = 0L;
        
        SnackbarDuration(long duration) {
        }
        
        public final long getDuration() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.app.bmicalculator.utils.snackBar.Snackbar.SnackbarDuration> getEntries() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/app/bmicalculator/utils/snackBar/Snackbar$SnackbarPosition;", "", "layoutGravity", "", "(Ljava/lang/String;II)V", "getLayoutGravity", "()I", "TOP", "BOTTOM", "BOTTOM_CENTER", "app_debug"})
    public static enum SnackbarPosition {
        /*public static final*/ TOP /* = new TOP(0) */,
        /*public static final*/ BOTTOM /* = new BOTTOM(0) */,
        /*public static final*/ BOTTOM_CENTER /* = new BOTTOM_CENTER(0) */;
        private final int layoutGravity = 0;
        
        SnackbarPosition(int layoutGravity) {
        }
        
        public final int getLayoutGravity() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.app.bmicalculator.utils.snackBar.Snackbar.SnackbarPosition> getEntries() {
            return null;
        }
    }
}