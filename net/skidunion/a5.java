/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 */
package net.skidunion;

import cc.novoline.invoke.ListInvoker;
import com.google.gson.JsonObject;
import kotlin.Metadata;
import net.a3M;
import net.aWA;
import net.skidunion.aP;
import net.skidunion.aj;
import net.skidunion.t_0;
import net.ve_0;
import net.yc_1;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\u0005"}, d2={"Lnet/net.skidunion/a5;", "Lnet/net.skidunion/aj;", "()V", "a", "", "client", "Lnet/net.skidunion/aP;", "args", "Lcom/google/gson/JsonObject;"})
public class a5
extends aj {
    public static a5 g;

    private a5() {
        super(11, null, 2, null);
    }

    @Override
    public void a(@NotNull aP aP10, @NotNull JsonObject jsonObject) {
        a3M.b();
        zx_2.b((Object)aP10, aWA.a);
        zx_2.b(jsonObject, aWA.b);
        ve_0.a(yc_1.a(aP10), new t_0());
        ListInvoker.b(new ListInvoker[1]);
    }

    static {
        a5 a510;
        g = a510 = new a5();
    }
}

