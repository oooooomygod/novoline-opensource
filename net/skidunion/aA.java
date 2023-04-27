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
import net.M0;
import net.WN;
import net.abq_0;
import net.asz_2;
import net.ey_2;
import net.h9;
import net.skidunion.I;
import net.skidunion.W;
import net.skidunion.a6;
import net.skidunion.aP;
import net.skidunion.ac;
import net.skidunion.aj;
import net.skidunion.ay;
import net.vz_2;
import net.yc_1;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\u0005"}, d2={"Lnet/net.skidunion/aA;", "Lnet/net.skidunion/aj;", "()V", "a", "", "client", "Lnet/net.skidunion/aP;", "args", "Lcom/google/gson/JsonObject;"})
public class aA
extends aj {
    public static aA g;

    static {
        aA aA10;
        g = aA10 = new aA();
    }

    private aA() {
        super(1, null, 2, null);
    }

    @Override
    public void a(@NotNull aP aP10, @NotNull JsonObject jsonObject) {
        zx_2.b((Object)aP10, asz_2.e);
        zx_2.b(jsonObject, asz_2.a);
        h9.b();
        JsonElement jsonElement = M0.d(jsonObject, asz_2.b);
        zx_2.a((Object)jsonElement, asz_2.c);
        String string = WN.f(jsonElement);
        String string2 = ey_2.a(ay.b);
        String string3 = string;
        zx_2.a((Object)string3, asz_2.d);
        a6 a610 = new a6(vz_2.a(a6.d, string3));
        yc_1.a(aP10, new ac(abq_0.a(a610, string2), abq_0.a(a610, yc_1.b(aP10))));
        yc_1.a(aP10, I.LOGIN_SENT);
        yc_1.a(aP10, new W(string2));
        ListInvoker.b(new ListInvoker[3]);
    }
}

