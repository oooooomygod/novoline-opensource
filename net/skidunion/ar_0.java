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
import net.axg_0;
import net.skidunion.a3;
import net.skidunion.ap_0;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.net.skidunion.ar
 */
@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2={"Lnet/net.skidunion/ar;", "Lnet/net.skidunion/ap;", "i", "", "(Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "client"})
public class ar_0
extends ap_0 {
    @NotNull
    private String i;

    public ar_0(@NotNull String string) {
        int n = a3.e();
        zx_2.b(string, axg_0.b);
        super(11, (Pair<String, ? extends Object>)a5e_0.a(axg_0.a, string));
        int n2 = n;
        this.i = string;
        if (ListInvoker.b() != null) {
            a3.b(++n2);
        }
    }

    @NotNull
    public String a() {
        return this.i;
    }
}

