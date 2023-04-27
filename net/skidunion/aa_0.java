/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 */
package net.skidunion;

import com.google.gson.JsonObject;
import kotlin.Metadata;
import net.M0;
import net.a3B;
import net.a4W;
import net.skidunion.aG;
import net.skidunion.aP;
import net.skidunion.af_0;
import net.skidunion.aj;
import net.skidunion.w_0;
import net.ve_0;
import net.yc_1;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.net.skidunion.aa
 */
@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\u0005"}, d2={"Lnet/net.skidunion/aa;", "Lnet/net.skidunion/aj;", "()V", "a", "", "client", "Lnet/net.skidunion/aP;", "args", "Lcom/google/gson/JsonObject;"})
public class aa_0
extends aj {
    public static aa_0 g;

    private aa_0() {
        super(8, null, 2, null);
    }

    static {
        aa_0 aa_02;
        g = aa_02 = new aa_0();
    }

    @Override
    public void a(@NotNull aP aP10, @NotNull JsonObject jsonObject) {
        zx_2.b((Object)aP10, a3B.d);
        zx_2.b(jsonObject, a3B.a);
        af_0 af_02 = (af_0)a4W.a(this.a(), M0.d(jsonObject, a3B.c), af_0.class);
        aG aG10 = yc_1.a(aP10);
        af_0 af_03 = af_02;
        zx_2.a((Object)af_03, a3B.b);
        ve_0.a(aG10, new w_0(af_03));
    }
}

