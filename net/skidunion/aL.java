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
import cc.novoline.invoke.MapInvoker;
import com.google.gson.JsonObject;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import net.M0;
import net.a2E;
import net.a4W;
import net.aS0;
import net.agd_0;
import net.alh_0;
import net.ape_0;
import net.av1_0;
import net.axw_1;
import net.skidunion.C;
import net.skidunion.E;
import net.skidunion.K;
import net.skidunion.U;
import net.skidunion.Y;
import net.skidunion.aP;
import net.skidunion.aj;
import net.ve_0;
import net.yc_1;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\u0005"}, d2={"Lnet/net.skidunion/aL;", "Lnet/net.skidunion/aj;", "()V", "a", "", "client", "Lnet/net.skidunion/aP;", "args", "Lcom/google/gson/JsonObject;"})
public class aL
extends aj {
    public static aL g;

    @Override
    public void a(@NotNull aP aP10, @NotNull JsonObject jsonObject) {
        ConcurrentHashMap concurrentHashMap;
        zx_2.b((Object)aP10, av1_0.d);
        zx_2.b(jsonObject, av1_0.a);
        Y y = (Y)a4W.a(this.a(), M0.d(jsonObject, av1_0.b), Y.class);
        ape_0.a(agd_0.b(yc_1.d(aP10)), alh_0.c(y));
        axw_1.b();
        Map map = agd_0.b(yc_1.d(aP10));
        String string = alh_0.c(y);
        Y y2 = y;
        zx_2.a((Object)y2, av1_0.c);
        MapInvoker.c(map, string, y2);
        ConcurrentHashMap concurrentHashMap2 = concurrentHashMap = agd_0.a(yc_1.d(aP10));
        K k = alh_0.b(y);
        String string2 = k != null ? a2E.a(k) : null;
        aS0.a(ape_0.b(concurrentHashMap2), new U(string2));
        ve_0.a(yc_1.a(aP10), new C(y));
        ve_0.a(yc_1.a(aP10), new E(y));
        ListInvoker.b(new ListInvoker[3]);
    }

    static {
        aL aL3;
        g = aL3 = new aL();
    }

    private aL() {
        super(3, null, 2, null);
    }
}

