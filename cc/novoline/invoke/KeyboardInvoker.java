/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package cc.novoline.invoke;

import org.lwjgl.input.Keyboard;

public class KeyboardInvoker {
    private static int[] b;

    public static char getEventCharacter() {
        return Keyboard.getEventCharacter();
    }

    static {
        if (KeyboardInvoker.e() != null) {
            KeyboardInvoker.b(new int[3]);
        }
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static int b() {
        return Keyboard.getEventKey();
    }

    public static boolean c() {
        return Keyboard.isRepeatEvent();
    }

    public static int[] e() {
        return b;
    }

    public static boolean g() {
        return Keyboard.isCreated();
    }

    public static boolean a(int n) {
        return Keyboard.isKeyDown((int)n);
    }

    public static boolean getEventKey() {
        return Keyboard.getEventKeyState();
    }

    public static boolean d() {
        return Keyboard.next();
    }

    public static String b(int n) {
        return Keyboard.getKeyName((int)n);
    }

    public static void a(boolean bl) {
        Keyboard.enableRepeatEvents((boolean)bl);
    }
}

