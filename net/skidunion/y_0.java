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
import net.a8m_0;
import net.skidunion.q_0;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.net.skidunion.y
 */
@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2={"Lnet/net.skidunion/y;", "Lnet/net.skidunion/q;", "e", "", "b", "", "(ILjava/lang/String;)V", "b", "()I", "b", "()Ljava/lang/String;", "client"})
public class y_0
extends q_0 {
    private int e;
    private static int[] d;
    @NotNull
    private String a;

    static {
        if (y_0.b() == null) {
            y_0.b(new int[5]);
        }
    }

    public static int[] b() {
        return d;
    }

    @NotNull
    public String c() {
        return this.a;
    }

    public int a() {
        return this.e;
    }

    public static void b(int[] nArray) {
        d = nArray;
    }

    public y_0(int n, @NotNull String string) {
        zx_2.b(string, a8m_0.a);
        y_0.b();
        this.e = n;
        this.a = string;
        ListInvoker.b(new ListInvoker[2]);
    }
}

