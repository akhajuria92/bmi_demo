package com.app.bmicalculator.utils.extensions;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r\u001a$\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u001a\u001a\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u001a\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016\u001a\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0002\u0010\u001c\u001a&\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u0016\u001a\u0012\u0010\"\u001a\u0004\u0018\u00010\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u000b\u001a\u0010\u0010$\u001a\u0004\u0018\u00010\u000b2\u0006\u0010#\u001a\u00020\u000b\u001a\u000e\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0016\u001a\u0006\u0010\'\u001a\u00020(\u001a\n\u0010)\u001a\u00020\u000b*\u00020\u000b\u001a\n\u0010*\u001a\u00020\u000b*\u00020\u0016\u001a\n\u0010*\u001a\u00020\u000b*\u00020\r\u001a\n\u0010*\u001a\u00020\u000b*\u00020\u000b\u001a\n\u0010+\u001a\u00020(*\u00020,\u001a\f\u0010-\u001a\u0004\u0018\u00010\u000b*\u00020.\u001a\n\u0010/\u001a\u00020\u000b*\u000200\u001a\u0012\u00101\u001a\u00020(*\u0002022\u0006\u00103\u001a\u00020\r\u001a\u0014\u00104\u001a\u00020(*\u0002052\b\b\u0002\u00106\u001a\u000207\u001a\n\u00108\u001a\u00020\r*\u00020.\u001a\n\u00109\u001a\u000207*\u00020\u000b\u001a\n\u0010:\u001a\u000207*\u00020.\u001a\n\u0010;\u001a\u000207*\u00020\u000b\u001a\n\u0010<\u001a\u000207*\u00020\u000b\u001a\n\u0010=\u001a\u00020(*\u000205\u001a\u001e\u0010>\u001a\u00020(*\u00020?2\b\b\u0002\u0010@\u001a\u00020\r2\b\b\u0002\u0010A\u001a\u000207\u001a\n\u0010B\u001a\u00020(*\u000205\u001a\n\u0010C\u001a\u00020(*\u00020\r\u001a\n\u0010D\u001a\u00020(*\u000205\u001a\u001a\u0010E\u001a\u00020(*\u00020?2\u0006\u0010F\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020\u000b\u001a\n\u0010H\u001a\u00020(*\u000205\u001a\f\u0010I\u001a\u00020(*\u00020JH\u0007\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0011\u0010\u0006\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\u00a8\u0006K"}, d2 = {"decimalFormatEXT", "Ljava/text/DecimalFormat;", "getDecimalFormatEXT", "()Ljava/text/DecimalFormat;", "decimalFormatNoDecimalEXT", "getDecimalFormatNoDecimalEXT", "decimalFormatOneDecimalEXT", "getDecimalFormatOneDecimalEXT", "addTextColor", "Landroid/text/SpannableStringBuilder;", "text", "", "color", "", "changeDateFormat", "dateString", "sourceDateFormat", "targetDateFormat", "changeDateFormatFromDate", "sourceDate", "Ljava/util/Date;", "deg2red", "", "lat", "getDistanceBWTwoLatLong", "start", "Landroid/location/Location;", "end", "(Landroid/location/Location;Landroid/location/Location;)Ljava/lang/Double;", "getDistanceKMBWTwoLatLong", "latitude1", "longitude1", "latitude2", "longitude2", "getFileExtensionFromUrl", "url", "getMimeTypeFromStringUrl", "red2deg", "distance", "removeAllCookies", "", "convertArabicToNumeric", "convertToArabic", "disableEmojiInTitle", "Landroid/widget/EditText;", "getActualBatteryPer", "Landroid/content/Context;", "getFormatedNumber", "", "getRecyclerViewHeight", "Landroidx/recyclerview/widget/RecyclerView;", "listSize", "hideKeyboard", "Landroid/view/View;", "isHide", "", "isBatteryChargingNew", "isEmail", "isMobileDataEnable", "isPhone", "isStrongPassword", "preventDoubleClick", "readMoreReadLess", "Landroid/widget/TextView;", "maxLineCount", "isExpanded", "setBounceAnim", "setPagination", "setSlideInAnim", "setTextWithDifferentSizes", "amount", "monthText", "setWrongShakeAnim", "webViewCommonSetting", "Landroid/webkit/WebView;", "app_debug"})
public final class CommonExtKt {
    @org.jetbrains.annotations.NotNull()
    private static final java.text.DecimalFormat decimalFormatEXT = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.text.DecimalFormat decimalFormatOneDecimalEXT = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.text.DecimalFormat decimalFormatNoDecimalEXT = null;
    
    public static final void getRecyclerViewHeight(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$getRecyclerViewHeight, int listSize) {
    }
    
    public static final boolean isStrongPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$isStrongPassword) {
        return false;
    }
    
    public static final void setBounceAnim(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setBounceAnim) {
    }
    
    public static final void setSlideInAnim(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setSlideInAnim) {
    }
    
    public static final void setWrongShakeAnim(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setWrongShakeAnim) {
    }
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.view.View $this$hideKeyboard, boolean isHide) {
    }
    
    public static final void preventDoubleClick(@org.jetbrains.annotations.NotNull()
    android.view.View $this$preventDoubleClick) {
    }
    
    public static final void removeAllCookies() {
    }
    
    public static final void readMoreReadLess(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$readMoreReadLess, int maxLineCount, boolean isExpanded) {
    }
    
    @android.annotation.SuppressLint(value = {"SetJavaScriptEnabled"})
    public static final void webViewCommonSetting(@org.jetbrains.annotations.NotNull()
    android.webkit.WebView $this$webViewCommonSetting) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.text.DecimalFormat getDecimalFormatEXT() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.text.DecimalFormat getDecimalFormatOneDecimalEXT() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.text.DecimalFormat getDecimalFormatNoDecimalEXT() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getActualBatteryPer(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getActualBatteryPer) {
        return null;
    }
    
    public static final int isBatteryChargingNew(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$isBatteryChargingNew) {
        return 0;
    }
    
    public static final boolean isMobileDataEnable(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$isMobileDataEnable) {
        return false;
    }
    
    public static final double getDistanceKMBWTwoLatLong(double latitude1, double longitude1, double latitude2, double longitude2) {
        return 0.0;
    }
    
    public static final double red2deg(double distance) {
        return 0.0;
    }
    
    public static final double deg2red(double lat) {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Double getDistanceBWTwoLatLong(@org.jetbrains.annotations.NotNull()
    android.location.Location start, @org.jetbrains.annotations.Nullable()
    android.location.Location end) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.text.SpannableStringBuilder addTextColor(@org.jetbrains.annotations.NotNull()
    java.lang.String text, int color) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String convertToArabic(int $this$convertToArabic) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String convertToArabic(double $this$convertToArabic) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String convertToArabic(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$convertToArabic) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String convertArabicToNumeric(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$convertArabicToNumeric) {
        return null;
    }
    
    public static final void setPagination(int $this$setPagination) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String changeDateFormat(@org.jetbrains.annotations.Nullable()
    java.lang.String dateString, @org.jetbrains.annotations.Nullable()
    java.lang.String sourceDateFormat, @org.jetbrains.annotations.Nullable()
    java.lang.String targetDateFormat) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String changeDateFormatFromDate(@org.jetbrains.annotations.Nullable()
    java.util.Date sourceDate, @org.jetbrains.annotations.Nullable()
    java.lang.String targetDateFormat) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getFormatedNumber(long $this$getFormatedNumber) {
        return null;
    }
    
    public static final void disableEmojiInTitle(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$disableEmojiInTitle) {
    }
    
    public static final boolean isEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$isEmail) {
        return false;
    }
    
    public static final boolean isPhone(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$isPhone) {
        return false;
    }
    
    public static final void setTextWithDifferentSizes(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setTextWithDifferentSizes, @org.jetbrains.annotations.NotNull()
    java.lang.String amount, @org.jetbrains.annotations.NotNull()
    java.lang.String monthText) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getMimeTypeFromStringUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getFileExtensionFromUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String url) {
        return null;
    }
}