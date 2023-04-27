/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 */
package net;

import com.google.common.collect.AbstractIterator;
import net.minecraft.block.BlockPos;

class XT
extends AbstractIterator<BlockPos> {
    private BlockPos a;
    aPQ b;

    XT(aPQ aPQ2) {
        this.b = aPQ2;
        this.a = null;
    }

    protected BlockPos a() {
        if (this.a == null) {
            this.a = this.b.b;
            return this.a;
        }
        if (this.a.equals(this.b.a)) {
            return (BlockPos)this.endOfData();
        }
        int n = amv_2.j(this.a);
        int n2 = amv_2.h(this.a);
        int n3 = amv_2.i(this.a);
        if (n < amv_2.j(this.b.a)) {
            ++n;
        } else if (n2 < amv_2.h(this.b.a)) {
            n = amv_2.j(this.b.b);
            ++n2;
        } else if (n3 < amv_2.i(this.b.a)) {
            n = amv_2.j(this.b.b);
            n2 = amv_2.h(this.b.b);
            ++n3;
        }
        this.a = new BlockPos(n, n2, n3);
        return this.a;
    }
}

