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
import net.skidunion.aG;
import net.skidunion.aP;
import net.skidunion.aj;
import net.skidunion.u_0;
import net.ve_0;
import net.xs_0;
import net.yc_1;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\u0005"}, d2={"Lnet/net.skidunion/a2;", "Lnet/net.skidunion/aj;", "()V", "a", "", "client", "Lnet/net.skidunion/aP;", "args", "Lcom/google/gson/JsonObject;"})
public class a2
extends aj {
    public static a2 g;

    private a2() {
        super(8, null, 2, null);
    }

    @Override
    public void a(@NotNull aP aP10, @NotNull JsonObject jsonObject) {
        zx_2.b((Object)aP10, xs_0.g);
        zx_2.b(jsonObject, xs_0.d);
        aG aG10 = yc_1.a(aP10);
        JsonElement jsonElement = M0.d(jsonObject, xs_0.c);
        zx_2.a((Object)jsonElement, xs_0.e);
        String string = WN.f(jsonElement);
        zx_2.a((Object)string, xs_0.f);
        JsonElement jsonElement2 = M0.d(jsonObject, xs_0.a);
        zx_2.a((Object)jsonElement2, xs_0.b);
        ve_0.a(aG10, new u_0(string, WN.b(jsonElement2)));
    }

    static {
        a2 a23;
        g = a23 = new a2();
    }
}

