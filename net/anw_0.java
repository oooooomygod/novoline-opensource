/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.StringInvoker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;
import net.a0H;
import net.aL0;
import net.my_0;
import net.ow_1;

/*
 * Renamed from net.aNw
 */
public enum anw_0 {
    BLACK(a0H.B, '0', 0),
    DARK_BLUE(a0H.b, '1', 1),
    DARK_GREEN(a0H.n, '2', 2),
    DARK_AQUA(a0H.f, '3', 3),
    DARK_RED(a0H.Q, '4', 4),
    DARK_PURPLE(a0H.t, '5', 5),
    GOLD(a0H.L, '6', 6),
    GRAY(a0H.s, '7', 7),
    DARK_GRAY(a0H.q, '8', 8),
    BLUE(a0H.T, '9', 9),
    GREEN(a0H.r, 'a', 10),
    AQUA(a0H.l, 'b', 11),
    RED(a0H.N, 'c', 12),
    LIGHT_PURPLE(a0H.C, 'd', 13),
    YELLOW(a0H.D, 'e', 14),
    WHITE(a0H.A, 'f', 15),
    OBFUSCATED(a0H.k, 'k', true),
    BOLD(a0H.i, 'l', true),
    STRIKETHROUGH(a0H.j, 'm', true),
    UNDERLINE(a0H.H, 'n', true),
    ITALIC(a0H.I, 'o', true),
    RESET(a0H.J, 'r', -1);

    private static Pattern a;
    private static Map<String, anw_0> e;
    private int g;
    private String d;
    private String f;
    private boolean h;
    private char c;

    public static anw_0 b(String string) {
        return null;
    }

    public static anw_0 a(int n) {
        return RESET;
    }

    public String b() {
        return StringInvoker.i(this.name());
    }

    public static Collection<String> a(boolean bl, boolean bl2) {
        ArrayList arrayList = my_0.c();
        for (anw_0 anw_02 : anw_0.values()) {
            if (anw_02.d()) {
                // empty if block
            }
            if (anw_02.a()) {
                // empty if block
            }
            ListInvoker.add(arrayList, anw_02.b());
        }
        return arrayList;
    }

    public int c() {
        return this.g;
    }

    public boolean d() {
        return !this.h && this != RESET;
    }

    public static String a(String string) {
        return null;
    }

    private anw_0(String string2, char c, boolean bl) {
        this(string2, c, bl, -1);
    }

    public boolean a() {
        return this.h;
    }

    private anw_0(String string2, char c, boolean bl, int n2) {
        this.f = string2;
        this.c = c;
        this.h = bl;
        this.g = n2;
        this.d = aL0.a(aL0.a(new StringBuilder(), a0H.R), c).toString();
    }

    private static String c(String string) {
        return StringInvoker.a(StringInvoker.i(string), a0H.z, a0H.U);
    }

    static {
        e = MapsInvoker.a();
        a = ow_1.c(a0H.a);
        for (anw_0 anw_02 : anw_0.values()) {
            MapInvoker.c(e, anw_0.c(anw_02.f), (Object)anw_02);
        }
    }

    public String toString() {
        return this.d;
    }

    private anw_0(String string2, char c, int n2) {
        this(string2, c, false, n2);
    }
}

