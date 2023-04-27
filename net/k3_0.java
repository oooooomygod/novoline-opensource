/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import deobf.Entity;
import deobf.EntityPlayerMP;

/*
 * Renamed from net.k3
 */
class k3_0
implements Predicate<Entity> {
    int b;
    int a;

    k3_0(int n, int n2) {
        this.b = n;
        this.a = n2;
    }

    public boolean a(Entity entity) {
        if (!(entity instanceof EntityPlayerMP)) {
            return false;
        }
        EntityPlayerMP entityPlayerMP = (EntityPlayerMP)entity;
        return !(this.b > -1 && entityPlayerMP.bL < this.b || this.a > -1 && entityPlayerMP.bL > this.a);
    }
}

