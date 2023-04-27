/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.Pair
 *  org.jetbrains.annotations.NotNull
 */
package net.skidunion;

import cc.novoline.invoke.ListInvoker;
import kotlin.Metadata;
import kotlin.Pair;
import net.a5e_0;
import net.aL9;
import net.skidunion.ap_0;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2={"Lnet/net.skidunion/ac;", "Lnet/net.skidunion/ap;", "aesKey", "", "token", "(Ljava/lang/String;Ljava/lang/String;)V", "client"})
public class ac
extends ap_0 {
    private static boolean i;

    public static boolean a() {
        ac.c();
        return true;
    }

    public ac(@NotNull String string, @NotNull String string2) {
        ac.a();
        zx_2.b(string, aL9.d);
        zx_2.b(string2, aL9.a);
        super(1, new Pair[]{a5e_0.a(aL9.c, string), a5e_0.a(aL9.b, string2)});
        ListInvoker.b(new ListInvoker[3]);
    }

    public static boolean c() {
        return i;
    }

    static {
        if (ac.c()) {
            ac.b(true);
        }
    }

    public static void b(boolean bl) {
        i = bl;
    }
}

