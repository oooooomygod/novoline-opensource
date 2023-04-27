/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 */
package net.skidunion;

import cc.novoline.invoke.ListInvoker;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import kotlin.Metadata;
import net.M0;
import net.WN;
import net.a4W;
import net.azw_2;
import net.qv_0;
import net.skidunion.aP;
import net.skidunion.af_0;
import net.skidunion.aj;
import net.skidunion.x_0;
import net.ve_0;
import net.y0_0;
import net.yc_1;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\u0005"}, d2={"Lnet/net.skidunion/aR;", "Lnet/net.skidunion/aj;", "()V", "a", "", "client", "Lnet/net.skidunion/aP;", "args", "Lcom/google/gson/JsonObject;"})
public class aR
extends aj {
    public static aR g;

    static {
        aR aR10;
        g = aR10 = new aR();
    }

    @Override
    public void a(@NotNull aP aP10, @NotNull JsonObject jsonObject) {
        qv_0.b();
        zx_2.b((Object)aP10, y0_0.d);
        zx_2.b(jsonObject, y0_0.c);
        Gson gson = this.a();
        JsonElement jsonElement = M0.d(jsonObject, y0_0.b);
        zx_2.a((Object)jsonElement, y0_0.e);
        Object object = a4W.a(gson, (JsonElement)WN.g(jsonElement), af_0[].class);
        zx_2.a(object, y0_0.a);
        List list = azw_2.a((Object[])object);
        ve_0.a(yc_1.a(aP10), new x_0(list));
        if (ListInvoker.b() != null) {
            qv_0.b(new int[4]);
        }
    }

    private aR() {
        super(13, null, 2, null);
    }
}

