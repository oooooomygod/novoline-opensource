/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import deobf.ISaveHandler;
import java.io.File;
import net.NBTTagCompound;
import net.WorldInfo;
import net.a9K;
import net.ajV;
import net.ku_1;

public class SaveHandlerInvoker {
    public static File c(ISaveHandler iSaveHandler) {
        return iSaveHandler.a();
    }

    public static void a(ISaveHandler iSaveHandler, WorldInfo worldInfo, NBTTagCompound nBTTagCompound) {
        iSaveHandler.a(worldInfo, nBTTagCompound);
    }

    public static ajV d(ISaveHandler iSaveHandler) {
        return iSaveHandler.c();
    }

    public static WorldInfo b(ISaveHandler iSaveHandler) {
        return iSaveHandler.f();
    }

    public static void e(ISaveHandler iSaveHandler) {
        iSaveHandler.d();
    }

    public static ku_1 a(ISaveHandler iSaveHandler, a9K a9K2) {
        return iSaveHandler.a(a9K2);
    }

    public static void a(ISaveHandler iSaveHandler, WorldInfo worldInfo) {
        iSaveHandler.a(worldInfo);
    }

    public static String a(ISaveHandler iSaveHandler) {
        return iSaveHandler.e();
    }

    public static File a(ISaveHandler iSaveHandler, String string) {
        return iSaveHandler.a(string);
    }
}

