/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import deobf.Entity;
import deobf.EntityPlayer;

class VR
implements Predicate<Entity> {
    VR() {
    }

    public boolean a(Entity entity) {
        return entity instanceof EntityPlayer;
    }
}

