/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  org.jetbrains.annotations.NotNull
 */
package net;

import cc.novoline.invoke.ListInvoker;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import net.KR;
import net.a0e_0;
import net.skidunion.o_0;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.aek
 */
public class aek_2
implements o_0 {
    private a0e_0 b;
    private Object2ObjectArrayMap<String, String> a;
    private static ListInvoker[] c;

    public aek_2() {
        aek_2.b();
        this.b = new a0e_0(null);
        this.a = new Object2ObjectArrayMap();
        ListInvoker.b(new ListInvoker[1]);
    }

    public static ListInvoker[] b() {
        return c;
    }

    static {
        if (aek_2.b() != null) {
            aek_2.b(new ListInvoker[1]);
        }
    }

    public static void b(ListInvoker[] listInvokerArray) {
        c = listInvokerArray;
    }

    @Override
    @NotNull
    public String a(@NotNull String string) {
        aek_2.b();
        String string2 = (String)KR.a(this.a, (Object)string, arg_0 -> this.lambda$hash$0(string, arg_0));
        if (ListInvoker.b() != null) {
            aek_2.b(new ListInvoker[1]);
        }
        return string2;
    }

    private String lambda$hash$0(String string, String string2) {
        String string3 = this.b.a(string2);
        KR.a(this.a, (Object)string, string2);
        return string3;
    }
}

