/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package net;

import net.aWO;
import net.aYD;
import net.alh_0;
import net.anw_0;
import net.ao5_0;
import net.aor_1;
import net.aou_1;
import net.skidunion.Y;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.aoE
 */
public class aoe_1
extends ao5_0 {
    private aoe_1(@NotNull Y y, @NotNull String string, boolean bl) {
        aou_1.b();
        super(aor_1.a());
        this.a(aYD.c, anw_0.GRAY);
        this.a(aYD.e, anw_0.WHITE);
        this.a(aYD.d, anw_0.GRAY);
        this.a(alh_0.c(y), aor_1.a(aWO.a(alh_0.a(y))));
        this.a(alh_0.c(y), aor_1.a(aWO.a(alh_0.a(y))));
        this.a(aYD.b, anw_0.GRAY);
        this.a(aYD.f, anw_0.WHITE);
        this.a(aYD.a, anw_0.GRAY);
        this.a(string, anw_0.WHITE);
    }

    public static aoe_1 b(@NotNull Y y, @NotNull String string) {
        return new aoe_1(y, string, false);
    }

    public static aoe_1 a(@NotNull Y y, @NotNull String string) {
        return new aoe_1(y, string, true);
    }
}

