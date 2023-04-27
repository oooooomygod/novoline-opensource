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
import net.atO;
import net.skidunion.b_0;
import net.skidunion.q_0;
import net.skidunion.u_0;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.net.skidunion.s
 */
@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2={"Lnet/net.skidunion/s;", "Lnet/net.skidunion/q;", "a", "Lnet/net.skidunion/b;", "(Lnet/net.skidunion/b;)V", "a", "()Lnet/net.skidunion/b;", "client"})
public class s_0
extends q_0 {
    @NotNull
    private b_0 a;

    @NotNull
    public b_0 a() {
        return this.a;
    }

    public s_0(@NotNull b_0 b_02) {
        u_0.e();
        zx_2.b(b_02, atO.a);
        this.a = b_02;
        if (ListInvoker.b() != null) {
            u_0.b(false);
        }
    }
}

