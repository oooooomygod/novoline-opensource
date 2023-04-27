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
import net.P8;
import net.a5e_0;
import net.auk_2;
import net.axj_1;
import net.skidunion.ap_0;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2={"Lnet/net.skidunion/a3;", "Lnet/net.skidunion/ap;", "target", "", "durationMins", "", "unmute", "", "(Ljava/lang/String;IZ)V", "client"})
public class a3
extends ap_0 {
    private static int i;

    public static void b(int n) {
        i = n;
    }

    static {
        if (a3.d() == 0) {
            a3.b(36);
        }
    }

    public a3(@NotNull String string, int n, boolean bl) {
        a3.d();
        zx_2.b(string, axj_1.a);
        super(12, new Pair[]{a5e_0.a(axj_1.b, string), a5e_0.a(axj_1.d, P8.d(n)), a5e_0.a(axj_1.c, auk_2.b(bl))});
        ListInvoker.b(new ListInvoker[4]);
    }

    public static int d() {
        a3.e();
        return 13;
    }

    public static int e() {
        return i;
    }
}

