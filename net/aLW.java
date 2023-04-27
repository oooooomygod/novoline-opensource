/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.GuiScreen;
import net.minecraft.client.Minecraft;

public class aLW {
    public static void g(GuiScreen guiScreen) {
        guiScreen.f();
    }

    public static void b(GuiScreen guiScreen) {
        guiScreen.e();
    }

    public static void e(GuiScreen guiScreen) {
        guiScreen.g();
    }

    public static boolean b(int n) {
        return GuiScreen.a(n);
    }

    public static boolean d(int n) {
        return GuiScreen.f(n);
    }

    public static String c() {
        return GuiScreen.o();
    }

    public static boolean a(int n) {
        return GuiScreen.b(n);
    }

    public static void a(GuiScreen guiScreen, Minecraft minecraft, int n, int n2) {
        guiScreen.b(minecraft, n, n2);
    }

    public static void a(GuiScreen guiScreen, int n, int n2, float f) {
        guiScreen.a(n, n2, f);
    }

    public static void b(GuiScreen guiScreen, Minecraft minecraft, int n, int n2) {
        guiScreen.a(minecraft, n, n2);
    }

    public static boolean d(GuiScreen guiScreen) {
        return guiScreen.d();
    }

    public static boolean d() {
        return GuiScreen.m();
    }

    public static void a(String string) {
        GuiScreen.e(string);
    }

    public static boolean b() {
        return GuiScreen.j();
    }

    public static boolean c(int n) {
        return GuiScreen.c(n);
    }

    public static void f(GuiScreen guiScreen) {
        guiScreen.c();
    }

    public static void c(GuiScreen guiScreen) {
        guiScreen.i();
    }

    public static boolean a() {
        return GuiScreen.k();
    }

    public static void a(GuiScreen guiScreen) {
        guiScreen.handleInput();
    }
}

