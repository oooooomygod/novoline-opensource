/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.DisplayMode
 *  org.lwjgl.opengl.PixelFormat
 */
package cc.novoline.invoke;

import cc.novoline.invoke.ListInvoker;
import java.nio.ByteBuffer;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.PixelFormat;

public class DisplayInvoker {
    private static ListInvoker[] b;

    public static boolean i() {
        return Display.isCreated();
    }

    public static boolean wasResized() {
        return Display.wasResized();
    }

    public static ListInvoker[] f() {
        return b;
    }

    public static DisplayMode g() {
        return Display.getDesktopDisplayMode();
    }

    public static void a(PixelFormat pixelFormat) {
        Display.create((PixelFormat)pixelFormat);
    }

    public static void k() {
        Display.create();
    }

    public static void a(boolean bl) {
        Display.setResizable((boolean)bl);
    }

    public static void a(String string) {
        Display.setTitle((String)string);
    }

    public static int getWidth() {
        return Display.getWidth();
    }

    public static void a(int n) {
        Display.sync((int)n);
    }

    public static void b(boolean bl) {
        Display.setFullscreen((boolean)bl);
    }

    public static DisplayMode e() {
        return Display.getDisplayMode();
    }

    public static void m() {
        Display.update();
    }

    public static void a(DisplayMode displayMode) {
        Display.setDisplayMode((DisplayMode)displayMode);
    }

    public static DisplayMode[] a() {
        return Display.getAvailableDisplayModes();
    }

    static {
        if (DisplayInvoker.f() == null) {
            DisplayInvoker.b(new ListInvoker[5]);
        }
    }

    public static int a(ByteBuffer[] byteBufferArray) {
        return Display.setIcon((ByteBuffer[])byteBufferArray);
    }

    public static int getHeight() {
        return Display.getHeight();
    }

    public static boolean l() {
        return Display.isActive();
    }

    public static void a(int n, int n2) {
        Display.setLocation((int)n, (int)n2);
    }

    public static boolean c() {
        return Display.isCloseRequested();
    }

    public static void setVSyncEnabled(boolean bl) {
        Display.setVSyncEnabled((boolean)bl);
    }

    public static String b() {
        return Display.getTitle();
    }

    public static void h() {
        Display.destroy();
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }
}

