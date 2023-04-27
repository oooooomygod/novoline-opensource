/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import deobf.EntityPlayer;
import net.N6;
import net.ResourceLocation;
import net.SoundHandler;
import net.aCD;
import net.ajZ;

public class SoundHandlerInvoker {
    private static boolean b;

    public static void a(SoundHandler soundHandler) {
        soundHandler.b();
    }

    public static void c(SoundHandler soundHandler, aCD aCD2) {
        soundHandler.a(aCD2);
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static void c(SoundHandler soundHandler) {
        soundHandler.a();
    }

    public static void a(SoundHandler soundHandler, aCD aCD2) {
        soundHandler.c(aCD2);
    }

    static {
        if (SoundHandlerInvoker.a()) {
            SoundHandlerInvoker.b(true);
        }
    }

    public static void d(SoundHandler soundHandler) {
        soundHandler.d();
    }

    public static ajZ a(SoundHandler soundHandler, N6[] n6Array) {
        return soundHandler.a(n6Array);
    }

    public static boolean b(SoundHandler soundHandler, aCD aCD2) {
        return soundHandler.b(aCD2);
    }

    public static void e(SoundHandler soundHandler) {
        soundHandler.h();
    }

    public static ajZ a(SoundHandler soundHandler, ResourceLocation resourceLocation) {
        return soundHandler.a(resourceLocation);
    }

    public static boolean b() {
        return b;
    }

    public static void b(SoundHandler soundHandler) {
        soundHandler.e();
    }

    public static boolean a() {
        SoundHandlerInvoker.b();
        return true;
    }

    public static void a(SoundHandler soundHandler, aCD aCD2, int n) {
        soundHandler.a(aCD2, n);
    }

    public static void a(SoundHandler soundHandler, EntityPlayer entityPlayer, float f) {
        soundHandler.a(entityPlayer, f);
    }
}

