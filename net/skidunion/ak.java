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
import net.aD7;
import net.skidunion.aG;
import net.skidunion.aP;
import net.skidunion.aj;
import net.skidunion.b_0;
import net.skidunion.s_0;
import net.ve_0;
import net.yc_1;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\u0005"}, d2={"Lnet/net.skidunion/ak;", "Lnet/net.skidunion/aj;", "()V", "a", "", "client", "Lnet/net.skidunion/aP;", "args", "Lcom/google/gson/JsonObject;"})
public class ak
extends aj {
    public static ak g;

    @Override
    public void a(@NotNull aP aP10, @NotNull JsonObject jsonObject) {
        zx_2.b((Object)aP10, aD7.h);
        zx_2.b(jsonObject, aD7.c);
        JsonElement jsonElement = M0.d(jsonObject, aD7.a);
        zx_2.a((Object)jsonElement, aD7.e);
        String string = WN.f(jsonElement);
        JsonElement jsonElement2 = M0.d(jsonObject, aD7.d);
        zx_2.a((Object)jsonElement2, aD7.b);
        String string2 = WN.f(jsonElement2);
        aG aG10 = yc_1.a(aP10);
        String string3 = string;
        zx_2.a((Object)string3, aD7.f);
        String string4 = string2;
        zx_2.a((Object)string4, aD7.g);
        ve_0.a(aG10, new s_0(new b_0(string3, string4, aP10)));
    }

    private ak() {
        super(12, null, 2, null);
    }

    static {
        ak ak2;
        g = ak2 = new ak();
    }
}

