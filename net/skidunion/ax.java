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
import net.aCA;
import net.skidunion.ag_0;
import net.skidunion.ap_0;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2={"Lnet/net.skidunion/ax;", "Lnet/net.skidunion/ap;", "name", "", "(Ljava/lang/String;)V", "client"})
public class ax
extends ap_0 {
    public ax(@NotNull String string) {
        ag_0.a();
        zx_2.b(string, aCA.a);
        super(5, (Pair<String, ? extends Object>)a5e_0.a(aCA.b, string));
        if (ListInvoker.b() != null) {
            ag_0.b(new String[3]);
        }
    }
}

