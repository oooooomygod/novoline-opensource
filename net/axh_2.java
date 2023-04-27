/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import net.Potion;
import net.a5_0;
import net.amk_0;
import net.ari_0;

/*
 * Renamed from net.axh
 */
public class axh_2
implements amk_0 {
    public int a;

    public void a(Random random) {
        int n = a5_0.a(random, 5);
        if (n <= 1) {
            this.a = ari_0.f(Potion.moveSpeed);
        } else if (n <= 2) {
            this.a = ari_0.f(Potion.damageBoost);
        } else if (n <= 3) {
            this.a = ari_0.f(Potion.regeneration);
        } else if (n <= 4) {
            this.a = ari_0.f(Potion.invisibility);
        }
    }
}

