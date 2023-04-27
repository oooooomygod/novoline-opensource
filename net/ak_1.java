/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package net;

import cc.novoline.Novoline;
import java.util.List;
import net.a0_0;
import net.agw_1;
import net.amv_2;
import net.azo_1;
import net.ht_1;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.aK
 */
public class ak_1
extends a0_0 {
    public ak_1(@NotNull Novoline novoline, String string, String string2, List<String> list) {
        super(novoline, string, string2, list);
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    @Override
    public void a(String[] stringArray, int n, int n2) throws ht_1 {
        amv_2.b();
        if (stringArray.length < 2) {
            this.a(agw_1.a, agw_1.c, azo_1.a(agw_1.b, agw_1.d));
            return;
        }
    }
}

