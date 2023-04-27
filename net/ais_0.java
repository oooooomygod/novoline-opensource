/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.aIs
 */
public class ais_0 {
    private static String[] d;
    private String b;
    private String c;
    private String a;

    public static void b(String[] stringArray) {
        d = stringArray;
    }

    public static String[] b() {
        return d;
    }

    public ais_0(@NotNull String string) {
        ais_0.b();
        this.c = StringInvoker.h(string);
        if (ListInvoker.b() != null) {
            ais_0.b(new String[5]);
        }
    }

    public String c() {
        return this.b;
    }

    public String a() {
        return this.c;
    }

    public String d() {
        return this.a;
    }

    static {
        if (ais_0.b() != null) {
            ais_0.b(new String[2]);
        }
    }

    public ais_0(@NotNull String string, @NotNull String string2, @NotNull String string3) {
        ais_0.b();
        this.c = StringInvoker.h(string);
        this.a = StringInvoker.h(string2);
        this.b = StringInvoker.h(string3);
        ListInvoker.b(new ListInvoker[1]);
    }
}

