/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import deobf.ISaveHandler;
import java.util.List;
import net.IProgressUpdate;
import net.ISaveFormat;
import net.WorldInfo;

public class SaveLoaderInvoker {
    public static WorldInfo f(ISaveFormat iSaveFormat, String string) {
        return iSaveFormat.f(string);
    }

    public static void a(ISaveFormat iSaveFormat, String string, String string2) {
        iSaveFormat.a(string, string2);
    }

    public static boolean a(ISaveFormat iSaveFormat, String string) {
        return iSaveFormat.d(string);
    }

    public static boolean b(ISaveFormat iSaveFormat, String string) {
        return iSaveFormat.e(string);
    }

    public static boolean c(ISaveFormat iSaveFormat, String string) {
        return iSaveFormat.a(string);
    }

    public static boolean d(ISaveFormat iSaveFormat, String string) {
        return iSaveFormat.c(string);
    }

    public static void a(ISaveFormat iSaveFormat) {
        iSaveFormat.c();
    }

    public static ISaveHandler getSaveLoader(ISaveFormat iSaveFormat, String string, boolean bl) {
        return iSaveFormat.a(string, bl);
    }

    public static boolean e(ISaveFormat iSaveFormat, String string) {
        return iSaveFormat.b(string);
    }

    public static List b(ISaveFormat iSaveFormat) {
        return iSaveFormat.b();
    }

    public static boolean a(ISaveFormat iSaveFormat, String string, IProgressUpdate iProgressUpdate) {
        return iSaveFormat.a(string, iProgressUpdate);
    }
}

