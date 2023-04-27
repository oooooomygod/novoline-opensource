/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.function.Predicate;
import java.util.function.Supplier;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.Qh
 */
public class qh_0
extends QR<aAG> {
    private Predicate<aAG> r = qh_0::lambda$new$0;

    @Override
    public void a(Minecraft minecraft, int n, int n2) {
        HZ.c();
        this.b(minecraft, n, n2);
        aAG aAG2 = (aAG)JM.a(this.q);
        if (wl_2.a(this.r, aAG2)) {
            this.b();
        }
    }

    public qh_0(int n, int n2, int n3, int n4, Supplier<aAG> supplier) {
        super(aay_0.a, n, n2, n3, n4, 15, supplier);
    }

    private static boolean lambda$new$0(aAG aAG2) {
        HZ.c();
        return aAG2 != null && at1.e(aAG2) != null;
    }
}

