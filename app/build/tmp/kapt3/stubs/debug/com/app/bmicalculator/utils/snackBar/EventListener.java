package com.app.bmicalculator.utils.snackBar;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u000b"}, d2 = {"Lcom/app/bmicalculator/utils/snackBar/EventListener;", "", "onDismiss", "", "snackbar", "Lcom/app/bmicalculator/utils/snackBar/Snackbar;", "onDismissByReplace", "onDismissed", "onShow", "onShowByReplace", "onShown", "app_debug"})
public abstract interface EventListener {
    
    /**
     * Called when a   is about to enter the screen
     *
     * @param snackbar the   that's being shown
     */
    public abstract void onShow(@org.jetbrains.annotations.NotNull()
    com.app.bmicalculator.utils.snackBar.Snackbar snackbar);
    
    /**
     * Called when a   is about to enter the screen while
     * a   is about to exit the screen by replacement.
     *
     * @param snackbar the   that's being shown
     */
    public abstract void onShowByReplace(@org.jetbrains.annotations.NotNull()
    com.app.bmicalculator.utils.snackBar.Snackbar snackbar);
    
    /**
     * Called when a   is fully shown
     *
     * @param snackbar the   that's being shown
     */
    public abstract void onShown(@org.jetbrains.annotations.NotNull()
    com.app.bmicalculator.utils.snackBar.Snackbar snackbar);
    
    /**
     * Called when a   is about to exit the screen
     *
     * @param snackbar the   that's being dismissed
     */
    public abstract void onDismiss(@org.jetbrains.annotations.NotNull()
    com.app.bmicalculator.utils.snackBar.Snackbar snackbar);
    
    /**
     * Called when a   is about to exit the screen
     * when a new   is about to enter the screen.
     *
     * @param snackbar the   that's being dismissed
     */
    public abstract void onDismissByReplace(@org.jetbrains.annotations.NotNull()
    com.app.bmicalculator.utils.snackBar.Snackbar snackbar);
    
    /**
     * Called when a   had just been dismissed
     *
     * @param snackbar the   that's being dismissed
     */
    public abstract void onDismissed(@org.jetbrains.annotations.NotNull()
    com.app.bmicalculator.utils.snackBar.Snackbar snackbar);
}