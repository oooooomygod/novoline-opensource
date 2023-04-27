/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
package cc.novoline.invoke;

import org.lwjgl.input.Mouse;

public class MouseInvoker {
    private static int b;

    public static int a() {
        return Mouse.getX();
    }

    public static boolean f() {
        return Mouse.isCreated();
    }

    public static boolean b() {
        return Mouse.isInsideWindow();
    }

    public static int o() {
        return Mouse.getDX();
    }

    static {
        if (MouseInvoker.g() != 0) {
            MouseInvoker.b(74);
        }
    }

    public static int m() {
        return Mouse.getDWheel();
    }

    public static boolean j() {
        return Mouse.next();
    }

    public static int e() {
        MouseInvoker.g();
        return 60;
    }

    public static void a(int n, int n2) {
        Mouse.setCursorPosition((int)n, (int)n2);
    }

    public static boolean c(int n) {
        return Mouse.isButtonDown((int)n);
    }

    public static int n() {
        return Mouse.getDY();
    }

    public static int h() {
        return Mouse.getEventDWheel();
    }

    public static void a(boolean bl) {
        Mouse.setGrabbed((boolean)bl);
    }

    public static int k() {
        return Mouse.getY();
    }

    public static void b(int n) {
        b = n;
    }

    public static boolean i() {
        return Mouse.getEventButtonState();
    }

    public static int l() {
        return Mouse.getEventX();
    }

    public static int g() {
        return b;
    }

    public static int d() {
        return Mouse.getEventY();
    }

    public static int c() {
        return Mouse.getEventButton();
    }
}

