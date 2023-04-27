/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package net;

import cc.novoline.Novoline;
import java.io.IOException;
import net.a0_0;
import net.aL0;
import net.amv_2;
import net.apq_2;
import net.ht_1;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.a1
 */
public class a1_0
extends a0_0 {
    public a1_0(@NotNull Novoline novoline, String string, String string2, String string3) {
        super(novoline, string, string2, string3);
    }

    @Override
    public void a(String[] stringArray, int n, int n2) throws ht_1, IOException {
        amv_2.b();
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = 1;
        if (n3 < stringArray.length) {
            aL0.a(aL0.a(stringBuilder, stringArray[n3]), apq_2.a);
            ++n3;
        }
    }
}

