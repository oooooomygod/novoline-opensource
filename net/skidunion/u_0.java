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
import net.azm_1;
import net.skidunion.q_0;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.net.skidunion.u
 */
@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2={"Lnet/net.skidunion/u;", "Lnet/net.skidunion/q;", "b", "", "e", "", "(Ljava/lang/String;Z)V", "b", "()Z", "e", "()Ljava/lang/String;", "client"})
public class u_0
extends q_0 {
    private boolean d;
    private static boolean e;
    @NotNull
    private String a;

    public boolean a() {
        return this.d;
    }

    public static boolean d() {
        return e;
    }

    @NotNull
    public String b() {
        return this.a;
    }

    public static void b(boolean bl) {
        e = bl;
    }

    static {
        if (u_0.e()) {
            u_0.b(true);
        }
    }

    public u_0(@NotNull String string, boolean bl) {
        zx_2.b(string, azm_1.a);
        u_0.d();
        this.a = string;
        this.d = bl;
        ListInvoker.b(new ListInvoker[4]);
    }

    public static boolean e() {
        u_0.d();
        return true;
    }
}

