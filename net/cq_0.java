/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;
import java.util.concurrent.Callable;

/*
 * Renamed from net.Cq
 */
class cq_0
implements Callable<String> {
    ItemStack a;
    aSK b;

    public String a() throws Exception {
        return act_2.w(this.a);
    }

    cq_0(aSK aSK2, ItemStack itemStack) {
        this.b = aSK2;
        this.a = itemStack;
    }
}

