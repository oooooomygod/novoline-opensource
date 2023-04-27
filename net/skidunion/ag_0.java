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
import net.agf_1;
import net.skidunion.ap_0;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.net.skidunion.ag
 */
@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2={"Lnet/net.skidunion/ag;", "Lnet/net.skidunion/ap;", "name", "", "data", "(Ljava/lang/String;Ljava/lang/String;)V", "client"})
public class ag_0
extends ap_0 {
    private static String[] i;

    public static void b(String[] stringArray) {
        i = stringArray;
    }

    public ag_0(@NotNull String string, @NotNull String string2) {
        ag_0.a();
        zx_2.b(string, agf_1.c);
        zx_2.b(string2, agf_1.a);
        super(4, new Pair[]{a5e_0.a(agf_1.b, string), a5e_0.a(agf_1.d, string2)});
        ListInvoker.b(new ListInvoker[4]);
    }

    public static String[] a() {
        return i;
    }

    static {
        if (ag_0.a() == null) {
            ag_0.b(new String[5]);
        }
    }
}

