/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package net;

import cc.novoline.Novoline;
import java.io.IOException;

import org.jetbrains.annotations.NotNull;
import net.skidunion.Protection;

/*
 * Renamed from net.bj
 */
public class bj_2
extends a0_0 {
    public bj_2(@NotNull Novoline novoline, String string, String string2, String string3) {
        super(novoline, string, string2, string3);
    }

    @Override
    public void a(String[] stringArray, int n, int n2) throws ht_1, IOException {
        amv_2.b();
        if (Integer.parseInt(Protection.q) <= 2 && stringArray.length != 1) {
            this.a(yu_0.a, yu_0.b);
        }
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }
}

