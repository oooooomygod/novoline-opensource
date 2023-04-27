/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.aL0;
import net.anw_0;
import net.ao5_0;
import net.aou_1;
import net.qu_0;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.aoR
 */
public class aor_1
extends ao5_0 {
    private static String g = aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.LIGHT_PURPLE), qu_0.c), (Object)anw_0.GRAY), qu_0.d), (Object)anw_0.RESET).toString();

    @NotNull
    public static aor_1 b(@NotNull String string) {
        return new aor_1(string);
    }

    protected aor_1(@NotNull String string) {
        super(g);
        aou_1.b();
        this.a(qu_0.b, anw_0.RED);
        this.a(string, anw_0.WHITE);
        if (ListInvoker.b() != null) {
            aou_1.b(false);
        }
    }

    static anw_0 a(String string) {
        return aor_1.c(string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static anw_0 c(String string) {
        aou_1.c();
        String string2 = string;
        int n = -1;
        switch (string2.hashCode()) {
            case 76514: {
                if (!string2.equals(qu_0.a)) return anw_0.GRAY;
                n = 0;
            }
            case 62130991: {
                if (!string2.equals(qu_0.e)) return anw_0.GRAY;
                return anw_0.GRAY;
            }
        }
        return anw_0.GRAY;
    }

    static String a() {
        return g;
    }
}

