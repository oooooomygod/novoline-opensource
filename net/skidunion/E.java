/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 */
package net.skidunion;

import cc.novoline.invoke.ListInvoker;
import kotlin.Metadata;
import net.a2h_0;
import net.skidunion.Y;
import net.skidunion.q_0;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2={"Lnet/net.skidunion/E;", "Lnet/net.skidunion/q;", "d", "Lnet/net.skidunion/Y;", "(Lnet/net.skidunion/Y;)V", "b", "()Lnet/net.skidunion/Y;", "client"})
public class E
extends q_0 {
    private static int[] a;
    @NotNull
    private Y d;

    @NotNull
    public Y b() {
        return this.d;
    }

    static {
        if (E.a() != null) {
            E.b(new int[3]);
        }
    }

    public static int[] a() {
        return a;
    }

    public E(@NotNull Y y) {
        E.a();
        zx_2.b(y, a2h_0.a);
        this.d = y;
        ListInvoker.b(new ListInvoker[3]);
    }

    public static void b(int[] nArray) {
        a = nArray;
    }
}

