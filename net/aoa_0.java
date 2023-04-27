/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package net;

import net.aL0;
import net.aR7;
import net.aWO;
import net.alh_0;
import net.anw_0;
import net.ao5_0;
import net.aor_1;
import net.arp_0;
import net.skidunion.b_0;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.aoA
 */
public class aoa_0
extends ao5_0 {
    @NotNull
    public static aoa_0 a(@NotNull b_0 b_02) {
        return new aoa_0(b_02);
    }

    private aoa_0(@NotNull b_0 b_02) {
        super(aor_1.a());
        this.a(alh_0.c(aR7.b(b_02)), aor_1.a(aWO.a(alh_0.a(aR7.b(b_02)))));
        this.a(aL0.a(aL0.a(new StringBuilder(), arp_0.a), aR7.a(b_02)).toString(), anw_0.WHITE);
    }
}

