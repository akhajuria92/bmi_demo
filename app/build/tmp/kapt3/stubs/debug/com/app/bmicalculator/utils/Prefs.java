package com.app.bmicalculator.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 42\u00020\u0001:\u000234B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0007J*\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u0002H\u0017\u0018\u00010\u0016j\n\u0012\u0004\u0012\u0002H\u0017\u0018\u0001`\u0018\"\u0004\b\u0000\u0010\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007J\u001a\u0010\u0019\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u0013J\u001a\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u001cJ\u001a\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u001fJ\u001a\u0010 \u001a\u00020!2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u001a\u001a\u00020!J\u001a\u0010\"\u001a\u00020#2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u001a\u001a\u00020#J+\u0010$\u001a\u0004\u0018\u0001H\u0017\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u0014\u001a\u00020\u00072\u000e\u0010%\u001a\n\u0012\u0004\u0012\u0002H\u0017\u0018\u00010&\u00a2\u0006\u0002\u0010\'J\u001e\u0010(\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0007J*\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010*2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0010\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010*J\u0010\u0010+\u001a\u00020,2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007J\u0006\u0010-\u001a\u00020,J\u001a\u0010.\u001a\u00020,2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010/\u001a\u0004\u0018\u00010\u0001J\u0018\u0010.\u001a\u00020,2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u00100\u001a\u00020\u0013J\u0018\u0010.\u001a\u00020,2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u00100\u001a\u00020\u001cJ\u0018\u0010.\u001a\u00020,2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u00100\u001a\u00020\u001fJ\u0018\u0010.\u001a\u00020,2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u00100\u001a\u00020!J\u0018\u0010.\u001a\u00020,2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u00100\u001a\u00020#J\u001a\u0010.\u001a\u00020,2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u00100\u001a\u0004\u0018\u00010\u0007J\"\u0010.\u001a\u00020,2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0010\u00100\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010*J2\u00101\u001a\u00020,\"\u0004\b\u0000\u0010\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u001a\u00102\u001a\u0016\u0012\u0004\u0012\u0002H\u0017\u0018\u00010\u0016j\n\u0012\u0004\u0012\u0002H\u0017\u0018\u0001`\u0018R\u001b\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u00030\u00068F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/app/bmicalculator/utils/Prefs;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "all", "", "", "getAll", "()Ljava/util/Map;", "editor", "Landroid/content/SharedPreferences$Editor;", "getEditor", "()Landroid/content/SharedPreferences$Editor;", "setEditor", "(Landroid/content/SharedPreferences$Editor;)V", "preferences", "Landroid/content/SharedPreferences;", "checkContains", "", "key", "getArray", "Ljava/util/ArrayList;", "T", "Lkotlin/collections/ArrayList;", "getBoolean", "defValue", "getDouble", "", "defaultValue", "getFloat", "", "getInt", "", "getLong", "", "getObject", "a", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "getString", "getStringSet", "", "remove", "", "removeAll", "save", "object", "value", "saveArrayList", "modelCourses", "Builder", "Companion", "app_debug"})
public final class Prefs {
    @org.jetbrains.annotations.NotNull()
    private android.content.SharedPreferences preferences;
    @org.jetbrains.annotations.NotNull()
    private android.content.SharedPreferences.Editor editor;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "UVADriverPreferences";
    @org.jetbrains.annotations.Nullable()
    private static com.app.bmicalculator.utils.Prefs singleton;
    @org.jetbrains.annotations.NotNull()
    private static final com.google.gson.Gson GSON = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.app.bmicalculator.utils.Prefs.Companion Companion = null;
    
    @android.annotation.SuppressLint(value = {"CommitPrefEdits"})
    public Prefs(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final void save(@org.jetbrains.annotations.Nullable()
    java.lang.String key, boolean value) {
    }
    
    public final void save(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    public final void save(@org.jetbrains.annotations.Nullable()
    java.lang.String key, int value) {
    }
    
    public final void save(@org.jetbrains.annotations.Nullable()
    java.lang.String key, float value) {
    }
    
    public final void save(@org.jetbrains.annotations.Nullable()
    java.lang.String key, long value) {
    }
    
    public final void save(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.util.Set<java.lang.String> value) {
    }
    
    public final void save(@org.jetbrains.annotations.Nullable()
    java.lang.String key, double value) {
    }
    
    public final void save(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Object object) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object>T getObject(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Class<T> a) {
        return null;
    }
    
    public final boolean getBoolean(@org.jetbrains.annotations.Nullable()
    java.lang.String key, boolean defValue) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getString(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.String defValue) {
        return null;
    }
    
    public final int getInt(@org.jetbrains.annotations.Nullable()
    java.lang.String key, int defValue) {
        return 0;
    }
    
    public final float getFloat(@org.jetbrains.annotations.Nullable()
    java.lang.String key, float defValue) {
        return 0.0F;
    }
    
    public final double getDouble(@org.jetbrains.annotations.Nullable()
    java.lang.String key, double defaultValue) {
        return 0.0;
    }
    
    public final long getLong(@org.jetbrains.annotations.Nullable()
    java.lang.String key, long defValue) {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Set<java.lang.String> getStringSet(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.util.Set<java.lang.String> defValue) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, ?> getAll() {
        return null;
    }
    
    public final void remove(@org.jetbrains.annotations.Nullable()
    java.lang.String key) {
    }
    
    public final void removeAll() {
    }
    
    public final boolean checkContains(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences.Editor getEditor() {
        return null;
    }
    
    public final void setEditor(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences.Editor p0) {
    }
    
    public final <T extends java.lang.Object>void saveArrayList(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<T> modelCourses) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object>java.util.ArrayList<T> getArray(@org.jetbrains.annotations.Nullable()
    java.lang.String key) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/app/bmicalculator/utils/Prefs$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "build", "Lcom/app/bmicalculator/utils/Prefs;", "app_debug"})
    static final class Builder {
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        
        public Builder(@org.jetbrains.annotations.Nullable()
        android.content.Context context) {
            super();
        }
        
        /**
         * Method that creates an instance of Prefs
         *
         * @return an instance of Prefs
         */
        @org.jetbrains.annotations.NotNull()
        public final com.app.bmicalculator.utils.Prefs build() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/app/bmicalculator/utils/Prefs$Companion;", "", "()V", "GSON", "Lcom/google/gson/Gson;", "TAG", "", "singleton", "Lcom/app/bmicalculator/utils/Prefs;", "with", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.app.bmicalculator.utils.Prefs with(@org.jetbrains.annotations.Nullable()
        android.content.Context context) {
            return null;
        }
    }
}