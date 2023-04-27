/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package net;

import java.text.SimpleDateFormat;
import java.util.Date;
import net.aL0;
import net.aZ2;
import net.acs_1;
import net.afw_0;
import net.alh_0;
import net.ao5_0;
import net.aor_1;
import net.op_0;
import net.skidunion.af_0;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.aoh
 */
public class aoh_2
extends ao5_0 {
    private static SimpleDateFormat g = new SimpleDateFormat(afw_0.b);

    private aoh_2(@NotNull af_0 af_02) {
        super(aor_1.a());
        this.d(aL0.a(aL0.a(new StringBuilder(), afw_0.h), op_0.d(af_02)).toString()).d(afw_0.a);
        this.d(aor_1.a()).d(aL0.a(aL0.a(new StringBuilder(), afw_0.g), alh_0.c(op_0.b(af_02))).toString()).d(afw_0.c);
        this.d(aor_1.a()).d(aL0.a(aL0.a(new StringBuilder(), afw_0.d), aZ2.a(g, new Date(acs_1.a(op_0.a(af_02))))).toString()).d(afw_0.e);
        this.d(aor_1.a()).d(aL0.a(aL0.a(new StringBuilder(), afw_0.f), aZ2.a(g, new Date(acs_1.a(op_0.c(af_02))))).toString());
    }

    @NotNull
    public static aoh_2 a(@NotNull af_0 af_02) {
        return new aoh_2(af_02);
    }
}

