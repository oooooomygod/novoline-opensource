/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import java.util.Comparator;
import net.ayj_0;

/*
 * Renamed from net.Oe
 */
public class oe_0
implements Comparator<Entity> {
    private Entity a;

    public int a(Entity entity, Entity entity2) {
        double d;
        double d2 = ayj_0.a(this.a, entity);
        return d2 < (d = ayj_0.a(this.a, entity2)) ? -1 : (d2 > d ? 1 : 0);
    }

    public oe_0(Entity entity) {
        this.a = entity;
    }
}

