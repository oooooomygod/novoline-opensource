/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 */
package net.skidunion;

import kotlin.Metadata;
import net.agn_0;
import net.skidunion.I;
import net.skidunion.aP;
import net.yc_1;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.net.skidunion.d
 */
@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2={"Lnet/net.skidunion/d;", "Ljava/lang/Thread;", "a", "Lnet/net.skidunion/aP;", "(Lnet/net.skidunion/aP;)V", "run", "", "client"})
public class d_0
extends Thread {
    private aP a;

    public d_0(@NotNull aP aP10) {
        zx_2.b((Object)aP10, agn_0.b);
        super(agn_0.a);
        this.a = aP10;
    }

    @Override
    public void run() {
        yc_1.a(this.a, I.CONNECTING);
        this.a.reconnectBlocking();
    }
}

