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

import cc.novoline.invoke.ListInvoker;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import kotlin.Metadata;
import net.BD;
import net.JS;
import net.M0;
import net.WN;
import net.qv_0;
import net.skidunion.aG;
import net.skidunion.aP;
import net.skidunion.aj;
import net.skidunion.v_0;
import net.ve_0;
import net.yc_1;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\u0005"}, d2={"Lnet/net.skidunion/aD;", "Lnet/net.skidunion/aj;", "()V", "a", "", "client", "Lnet/net.skidunion/aP;", "args", "Lcom/google/gson/JsonObject;"})
public class aD
extends aj {
    public static aD g;

    private aD() {
        super(9, null, 2, null);
    }

    static {
        aD aD10;
        g = aD10 = new aD();
    }

    @Override
    public void a(@NotNull aP aP10, @NotNull JsonObject jsonObject) {
        zx_2.b((Object)aP10, JS.h);
        qv_0.b();
        zx_2.b(jsonObject, JS.f);
        JsonElement jsonElement = M0.d(jsonObject, JS.c);
        zx_2.a((Object)jsonElement, JS.b);
        String string = WN.f(jsonElement);
        JsonElement jsonElement2 = M0.d(jsonObject, JS.a);
        zx_2.a((Object)jsonElement2, JS.e);
        String string2 = WN.f(jsonElement2);
        zx_2.a((Object)string2, JS.d);
        String string3 = BD.a(string2);
        aG aG10 = yc_1.a(aP10);
        String string4 = string;
        zx_2.a((Object)string4, JS.g);
        ve_0.a(aG10, new v_0(string4, string3));
        ListInvoker.b(new ListInvoker[5]);
    }
}

