/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 */
package net.skidunion;

import cc.novoline.invoke.MapInvoker;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import net.M0;
import net.OV;
import net.WN;
import net.a4W;
import net.a6o_0;
import net.agd_0;
import net.alh_0;
import net.axw_1;
import net.dz_0;
import net.skidunion.Y;
import net.skidunion.aP;
import net.skidunion.aj;
import net.yc_1;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\u0005"}, d2={"Lnet/net.skidunion/a4;", "Lnet/net.skidunion/aj;", "()V", "a", "", "client", "Lnet/net.skidunion/aP;", "args", "Lcom/google/gson/JsonObject;"})
public class a4
extends aj {
    public static a4 g;

    @Override
    public void a(@NotNull aP aP10, @NotNull JsonObject jsonObject) {
        zx_2.b((Object)aP10, a6o_0.c);
        axw_1.b();
        zx_2.b(jsonObject, a6o_0.a);
        JsonElement jsonElement = M0.d(jsonObject, a6o_0.f);
        zx_2.a((Object)jsonElement, a6o_0.b);
        JsonArray jsonArray = WN.g(jsonElement);
        JsonArray jsonArray2 = jsonArray;
        zx_2.a((Object)jsonArray2, a6o_0.e);
        Iterable iterable = (Iterable)jsonArray2;
        Iterator iterator = OV.a(iterable);
        if (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            JsonElement jsonElement2 = (JsonElement)object;
            Y y = (Y)a4W.a(g.a(), jsonElement2, Y.class);
            Map map = agd_0.b(yc_1.d(aP10));
            String string = alh_0.c(y);
            Y y2 = y;
            zx_2.a((Object)y2, a6o_0.d);
            MapInvoker.c(map, string, y2);
        }
    }

    static {
        a4 a410;
        g = a410 = new a4();
    }

    private a4() {
        super(4, null, 2, null);
    }
}

