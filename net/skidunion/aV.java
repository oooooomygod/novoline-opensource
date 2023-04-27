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
import net.AG;
import net.a5e_0;
import net.skidunion.K;
import net.skidunion.ap_0;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2={"Lnet/net.skidunion/aV;", "Lnet/net.skidunion/ap;", "serverEntity", "Lnet/net.skidunion/K;", "(Lnet/net.skidunion/K;)V", "client"})
public class aV
extends ap_0 {
    private static ListInvoker[] i;

    public aV(@NotNull K k) {
        aV.a();
        zx_2.b(k, AG.b);
        super(2, (Pair<String, ? extends Object>)a5e_0.a(AG.a, k));
        if (ListInvoker.b() != null) {
            aV.a(new ListInvoker[5]);
        }
    }

    public static ListInvoker[] a() {
        return i;
    }

    static {
        if (aV.a() == null) {
            aV.a(new ListInvoker[5]);
        }
    }

    public static void a(ListInvoker[] listInvokerArray) {
        i = listInvokerArray;
    }
}

