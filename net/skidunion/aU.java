/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 */
package net.skidunion;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import kotlin.Metadata;
import net.M0;
import net.WN;
import net.agd_0;
import net.ape_0;
import net.aqh_1;
import net.skidunion.D;
import net.skidunion.aG;
import net.skidunion.aP;
import net.skidunion.aj;
import net.ve_0;
import net.yc_1;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\u0005"}, d2={"Lnet/net.skidunion/aU;", "Lnet/net.skidunion/aj;", "()V", "a", "", "client", "Lnet/net.skidunion/aP;", "args", "Lcom/google/gson/JsonObject;"})
public class aU
extends aj {
    public static aU g;

    static {
        aU aU4;
        g = aU4 = new aU();
    }

    @Override
    public void a(@NotNull aP aP10, @NotNull JsonObject jsonObject) {
        zx_2.b((Object)aP10, aqh_1.d);
        zx_2.b(jsonObject, aqh_1.c);
        JsonElement jsonElement = M0.d(jsonObject, aqh_1.b);
        zx_2.a((Object)jsonElement, aqh_1.a);
        String string = WN.f(jsonElement);
        ape_0.c(agd_0.b(yc_1.d(aP10)), string);
        aG aG10 = yc_1.a(aP10);
        String string2 = string;
        zx_2.a((Object)string2, aqh_1.e);
        ve_0.a(aG10, new D(string2));
    }

    private aU() {
        super(6, null, 2, null);
    }
}

