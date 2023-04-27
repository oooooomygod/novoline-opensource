/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import deobf.Entity;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.axu
 */
class axu_2
implements Predicate<Entity> {
    int a;
    BlockPos d;
    int c;
    int e;
    int b;

    public boolean a(Entity entity) {
        int n = (int)ayj_0.b(entity, this.d);
        return !(this.b >= 0 && n < this.a || this.e >= 0 && n > this.c);
    }

    axu_2(BlockPos blockPos, int n, int n2, int n3, int n4) {
        this.d = blockPos;
        this.b = n;
        this.a = n2;
        this.e = n3;
        this.c = n4;
    }
}

