/*
 * Decompiled with CFR 0.152.
 */
package deobf;

import net.Potion;
import net.ResourceLocation;

public class PotionHealth
extends Potion {
    public PotionHealth(int n, ResourceLocation resourceLocation, boolean bl, int n2) {
        super(n, resourceLocation, bl, n2);
    }

    @Override
    public boolean c() {
        return true;
    }

    @Override
    public boolean b(int n, int n2) {
        return n >= 1;
    }
}

