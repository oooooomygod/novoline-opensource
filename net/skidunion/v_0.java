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
import net.skidunion.q_0;
import net.skidunion.x_0;
import net.t7_0;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.net.skidunion.v
 */
@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\t"}, d2={"Lnet/net.skidunion/v;", "Lnet/net.skidunion/q;", "d", "", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "b", "()Ljava/lang/String;", "a", "client"})
public class v_0
extends q_0 {
    @NotNull
    private String d;
    @NotNull
    private String a;

    public v_0(@NotNull String string, @NotNull String string2) {
        x_0.b();
        zx_2.b(string, t7_0.a);
        zx_2.b(string2, t7_0.b);
        this.d = string;
        this.a = string2;
        ListInvoker.b(new ListInvoker[4]);
    }

    @NotNull
    public String b() {
        return this.a;
    }

    @NotNull
    public String a() {
        return this.d;
    }
}

