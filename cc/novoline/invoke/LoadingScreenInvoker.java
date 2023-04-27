/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import deobf.LoadingScreenRenderer;

public class LoadingScreenInvoker {
    public static void displayLoadingString(LoadingScreenRenderer loadingScreenRenderer, String string) {
        loadingScreenRenderer.b(string);
    }

    public static void b(LoadingScreenRenderer loadingScreenRenderer, String string) {
        loadingScreenRenderer.a(string);
    }

    public static void displaySavingString(LoadingScreenRenderer loadingScreenRenderer, String string) {
        loadingScreenRenderer.c(string);
    }
}

