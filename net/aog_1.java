/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.List;
import java.util.StringJoiner;
import net.P_;
import net.aL0;
import net.aWO;
import net.alb_2;
import net.alh_0;
import net.anw_0;
import net.ao5_0;
import net.aor_1;
import net.aou_1;
import net.op_0;
import net.skidunion.af_0;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.aoG
 */
public class aog_1
extends ao5_0 {
    private static void lambda$new$0(StringJoiner stringJoiner, af_0 af_02) {
        aou_1.c();
        if (aWO.a(alh_0.a(op_0.b(af_02))).equals(alb_2.c) || aWO.a(alh_0.a(op_0.b(af_02))).equals(alb_2.b)) {
            P_.a(stringJoiner, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GREEN), op_0.d(af_02)).toString());
        }
        P_.a(stringJoiner, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GRAY), op_0.d(af_02)).toString());
    }

    @NotNull
    public static aog_1 a(@NotNull List<af_0> list, boolean bl) {
        return new aog_1(list, bl);
    }

    private aog_1(@NotNull List<af_0> list, boolean bl) {
        aou_1.c();
        super(aor_1.a());
        StringJoiner stringJoiner = new StringJoiner(alb_2.g);
        this.d(alb_2.i);
        this.d(alb_2.h).a(alb_2.a, anw_0.GRAY).a(alb_2.e, anw_0.GREEN).a(alb_2.f, anw_0.GRAY).d(alb_2.d);
        ListInvoker.forEach(list, arg_0 -> aog_1.lambda$new$0(stringJoiner, arg_0));
        this.d(stringJoiner.toString());
    }
}

