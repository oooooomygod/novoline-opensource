/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package net;

import java.util.List;
import net.a9X;
import net.aEl;
import net.aOX;
import net.aar_1;
import net.adr_1;
import net.aj_2;
import net.anw_0;
import net.ao4_0;
import net.ao5_0;
import net.aoa_0;
import net.aoa_1;
import net.aod_1;
import net.aoe_1;
import net.aog_1;
import net.aoh_2;
import net.aor_1;
import net.aou_1;
import net.arb_2;
import net.ax5_0;
import net.skidunion.Y;
import net.skidunion.af_0;
import net.skidunion.b_0;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from net.vP
 */
public class vp_1 {
    @NotNull
    public static aoa_1 a(@NotNull String string, @NotNull String string2) {
        return aEl.a(string, string2);
    }

    @NotNull
    public static aoe_1 b(@NotNull Y y, @NotNull String string) {
        return aoe_1.a(y, string);
    }

    @NotNull
    public static aou_1 a() {
        return ao4_0.a();
    }

    @NotNull
    public static ao5_0 b(@Nullable String string) {
        return aar_1.a(string);
    }

    @NotNull
    public static aoh_2 a(@NotNull af_0 af_02) {
        return a9X.a(af_02);
    }

    @NotNull
    public static aor_1 a(@NotNull String string) {
        return ax5_0.a(string);
    }

    @NotNull
    public static aoe_1 a(@NotNull Y y, @NotNull String string) {
        return aoe_1.b(y, string);
    }

    @Contract(value="-> fail", pure=true)
    private vp_1() {
        throw new UnsupportedOperationException(adr_1.a);
    }

    @NotNull
    public static aog_1 a(@NotNull List<af_0> list, boolean bl) {
        return aOX.a(list, bl);
    }

    @NotNull
    public static aoa_0 a(@NotNull b_0 b_02) {
        return arb_2.a(b_02);
    }

    @NotNull
    public static aod_1 a(@NotNull String string, @NotNull String string2, aoa_1 ... aoa_1Array) {
        return aj_2.a(string, string2, aoa_1Array);
    }

    @NotNull
    public static ao5_0 a(@Nullable String string, @Nullable anw_0 anw_02) {
        return aar_1.a(string, anw_02);
    }
}

