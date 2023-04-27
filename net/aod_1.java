/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package net;

import net.S8;
import net.aEl;
import net.aL0;
import net.ao5_0;
import net.aoa_1;
import net.aou_1;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.aoD
 */
public class aod_1
extends ao5_0 {
    @NotNull
    public static aod_1 a(@NotNull String string, @NotNull String string2, aoa_1 ... aoa_1Array) {
        return new aod_1(string, string2, aoa_1Array);
    }

    private aod_1(@NotNull String string, @NotNull String string2, aoa_1 ... aoa_1Array) {
        aou_1.b();
        super(string);
        this.d(S8.b);
        int n = 0;
        int n2 = aoa_1Array.length;
        if (n < n2) {
            aoa_1 aoa_12 = aoa_1Array[n];
            this.c(aEl.a(aoa_12, aL0.a(aL0.a(aL0.a(new StringBuilder(), string2), S8.a), aoa_1.a(aoa_12)).toString()));
            if (n + 1 != n2) {
                this.a();
            }
            ++n;
        }
    }
}

