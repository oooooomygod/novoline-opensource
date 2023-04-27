/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ChatStyle;
import net.amn_0;
import net.anw_0;
import net.awv_1;

public class HX {
    private static int[] b;

    public static ChatStyle c(ChatStyle chatStyle) {
        return chatStyle.m();
    }

    public static awv_1 b(ChatStyle chatStyle) {
        return chatStyle.d();
    }

    public static String e(ChatStyle chatStyle) {
        return chatStyle.n();
    }

    public static ChatStyle d(ChatStyle chatStyle, Boolean bl) {
        return chatStyle.c(bl);
    }

    public static ChatStyle b(ChatStyle chatStyle, Boolean bl) {
        return chatStyle.e(bl);
    }

    public static amn_0 f(ChatStyle chatStyle) {
        return chatStyle.h();
    }

    public static ChatStyle a(ChatStyle chatStyle, awv_1 awv_12) {
        return chatStyle.a(awv_12);
    }

    public static ChatStyle a(ChatStyle chatStyle, Boolean bl) {
        return chatStyle.b(bl);
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static int[] b() {
        return b;
    }

    public static ChatStyle c(ChatStyle chatStyle, Boolean bl) {
        return chatStyle.d(bl);
    }

    public static ChatStyle a(ChatStyle chatStyle) {
        return chatStyle.c();
    }

    public static ChatStyle a(ChatStyle chatStyle, anw_0 anw_02) {
        return chatStyle.a(anw_02);
    }

    public static ChatStyle a(ChatStyle chatStyle, String string) {
        return chatStyle.a(string);
    }

    public static ChatStyle a(ChatStyle chatStyle, ChatStyle chatStyle2) {
        return chatStyle.f(chatStyle2);
    }

    static {
        if (HX.b() != null) {
            HX.b(new int[5]);
        }
    }

    public static ChatStyle a(ChatStyle chatStyle, amn_0 amn_02) {
        return chatStyle.a(amn_02);
    }

    public static boolean d(ChatStyle chatStyle) {
        return chatStyle.a();
    }

    public static String g(ChatStyle chatStyle) {
        return chatStyle.f();
    }
}

