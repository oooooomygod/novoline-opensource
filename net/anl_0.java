/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.NBTTagList;
import net.aDD;
import net.kv_0;

/*
 * Renamed from net.aNl
 */
public class anl_0 {
    protected float a;
    protected float c;
    protected float b;

    public float d() {
        return this.a;
    }

    public anl_0(float f, float f2, float f3) {
        this.b = f;
        this.a = f2;
        this.c = f3;
    }

    public float b() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (!(object instanceof anl_0)) {
            return false;
        }
        anl_0 anl_02 = (anl_0)object;
        return this.b == anl_02.b && this.a == anl_02.a && this.c == anl_02.c;
    }

    public float c() {
        return this.b;
    }

    public anl_0(NBTTagList nBTTagList) {
        this.b = kv_0.b(nBTTagList, 0);
        this.a = kv_0.b(nBTTagList, 1);
        this.c = kv_0.b(nBTTagList, 2);
    }

    public NBTTagList a() {
        NBTTagList nBTTagList = new NBTTagList();
        kv_0.a(nBTTagList, new aDD(this.b));
        kv_0.a(nBTTagList, new aDD(this.a));
        kv_0.a(nBTTagList, new aDD(this.c));
        return nBTTagList;
    }
}

