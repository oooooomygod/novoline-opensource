/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 */
package net.skidunion;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.HashMap;
import kotlin.Metadata;
import net.M0;
import net.P8;
import net.WN;
import net.a1r;
import net.aYB;
import net.asa_2;
import net.ds_2;
import net.lx_2;
import net.skidunion.a2;
import net.skidunion.a4;
import net.skidunion.a5;
import net.skidunion.aA;
import net.skidunion.aD;
import net.skidunion.aL;
import net.skidunion.aP;
import net.skidunion.aR;
import net.skidunion.aU;
import net.skidunion.aa_0;
import net.skidunion.ah;
import net.skidunion.aj;
import net.skidunion.ak;
import net.skidunion.ao_0;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2={"Lnet/net.skidunion/F;", "", "()V", "b", "Ljava/util/HashMap;", "", "Lnet/net.skidunion/aj;", "Lkotlin/collections/HashMap;", "a", "", "client", "Lnet/net.skidunion/aP;", "message", ""})
public class F {
    private static HashMap<Integer, aj> b;
    public static F a;

    static {
        F f;
        a = f = new F();
        b = new HashMap();
        MapInvoker.c(b, P8.d(1), aA.g);
        MapInvoker.c(b, P8.d(2), ah.g);
        MapInvoker.c(b, P8.d(3), aL.g);
        MapInvoker.c(b, P8.d(4), a4.g);
        MapInvoker.c(b, P8.d(6), aU.g);
        MapInvoker.c(b, P8.d(7), ao_0.g);
        MapInvoker.c(b, P8.d(8), a2.g);
        MapInvoker.c(b, P8.d(9), aa_0.g);
        MapInvoker.c(b, P8.d(10), aD.g);
        MapInvoker.c(b, P8.d(11), a5.g);
        MapInvoker.c(b, P8.d(12), ak.g);
        MapInvoker.c(b, P8.d(13), aR.g);
    }

    private F() {
    }

    public void a(@NotNull aP aP10, @NotNull String string) {
        zx_2.b((Object)aP10, asa_2.a);
        zx_2.b(string, asa_2.b);
        aj.d();
        JsonElement jsonElement = a1r.a(new JsonParser(), string);
        zx_2.a((Object)jsonElement, asa_2.e);
        JsonObject jsonObject = WN.c(jsonElement);
        JsonElement jsonElement2 = M0.d(jsonObject, asa_2.h);
        zx_2.a((Object)jsonElement2, asa_2.d);
        int n = WN.e(jsonElement2);
        aj aj10 = (aj)ds_2.a(b, P8.d(n));
        if (aj10 != null) {
            aj aj11;
            aj aj12 = aj11 = aj10;
            if (M0.c(jsonObject, asa_2.c)) {
                JsonElement jsonElement3 = M0.d(jsonObject, asa_2.f);
                zx_2.a((Object)jsonElement3, asa_2.g);
                aYB.a(aj12, lx_2.b(WN.j(jsonElement3)));
            }
            JsonObject jsonObject2 = jsonObject;
            zx_2.a((Object)jsonObject2, asa_2.i);
            aYB.a(aj12, aP10, jsonObject2);
        }
        ListInvoker.b(new ListInvoker[2]);
    }
}

