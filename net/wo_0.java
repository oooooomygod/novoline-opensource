/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.NBTTagCompound;

/*
 * Renamed from net.wO
 */
public abstract class wo_0 {
    private boolean a;
    public String b;

    public boolean b() {
        return this.a;
    }

    public wo_0(String string) {
        this.b = string;
    }

    public void a() {
        this.a(true);
    }

    public abstract void a(NBTTagCompound var1);

    public void a(boolean bl) {
        this.a = bl;
    }

    public abstract void b(NBTTagCompound var1);
}

