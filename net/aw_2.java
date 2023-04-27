/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.Novoline;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringInvoker;
import java.util.List;
import net.a0_0;
import net.aGR;
import net.aZM;
import net.amv_2;
import net.azo_1;
import net.ht_1;
import net.sy_1;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.aw
 */
public class aw_2
extends a0_0 {
    @Override
    public void a(String[] stringArray, int n, int n2) throws ht_1 {
        amv_2.b();
        if (stringArray.length < 1) {
            this.a(sy_1.b, sy_1.c, azo_1.a(sy_1.a, this.d));
            this.b();
            return;
        }
        if (NovolineInvoker.n(this.g) != null) {
            aGR.a(NovolineInvoker.n(this.g), new aZM(StringInvoker.a((CharSequence)sy_1.d, stringArray)));
        }
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    public aw_2(@NonNull Novoline novoline, String string, String string2, List<String> list) {
        super(novoline, string, string2, list);
    }
}

