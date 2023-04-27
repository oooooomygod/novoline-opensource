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
import cc.novoline.invoke.LoggerInvoker;
import com.google.gson.JsonObject;
import kotlin.Metadata;
import net.M0;
import net.a4W;
import net.aL0;
import net.agd_0;
import net.alh_0;
import net.aow_2;
import net.av9_0;
import net.h9;
import net.skidunion.B;
import net.skidunion.I;
import net.skidunion.Y;
import net.skidunion.aP;
import net.skidunion.aj;
import net.ve_0;
import net.yc_1;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\u0005"}, d2={"Lnet/net.skidunion/ah;", "Lnet/net.skidunion/aj;", "()V", "a", "", "client", "Lnet/net.skidunion/aP;", "args", "Lcom/google/gson/JsonObject;"})
public class ah
extends aj {
    public static ah g;

    static {
        ah ah2;
        g = ah2 = new ah();
    }

    private ah() {
        super(2, null, 2, null);
    }

    @Override
    public void a(@NotNull aP aP10, @NotNull JsonObject jsonObject) {
        zx_2.b((Object)aP10, aow_2.d);
        zx_2.b(jsonObject, aow_2.b);
        Y y = (Y)a4W.a(this.a(), M0.d(jsonObject, aow_2.c), Y.class);
        h9.b();
        LoggerInvoker.info(this.b(), aL0.a(aL0.a(new StringBuilder(), aow_2.a), alh_0.c(y)).toString());
        agd_0.a(yc_1.d(aP10), alh_0.c(y));
        yc_1.a(aP10, I.AUTHENTICATED);
        av9_0.b(yc_1.g(aP10));
        ve_0.a(yc_1.a(aP10), new B());
        if (ListInvoker.b() != null) {
            h9.b(new int[1]);
        }
    }
}

