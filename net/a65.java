/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.ITickable;
import deobf.TileEntity;
import net.aLH;
import net.aV8;
import net.f9_0;

public class a65
extends TileEntity
implements ITickable {
    @Override
    public void b() {
        if (this.e != null && !this.e.isRemote && aV8.d(this.e) % 20L == 0L) {
            this.a = this.k();
            if (this.a instanceof f9_0) {
                aLH.a((f9_0)this.a, this.e, this.g);
            }
        }
    }
}

