/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import cc.novoline.invoke.MathInvoker;
import com.google.common.base.Predicate;
import deobf.Entity;
import net.a0l_0;

/*
 * Renamed from net.ao0
 */
class ao0_0
implements Predicate<Entity> {
    int a;
    int b;

    public boolean a(Entity entity) {
        int n = a0l_0.a((int)MathInvoker.n(entity.rotationPitch));
        return this.a > this.b ? n >= this.a || n <= this.b : n >= this.a && n <= this.b;
    }

    ao0_0(int n, int n2) {
        this.a = n;
        this.b = n2;
    }
}

