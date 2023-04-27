/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.NBTTagCompound;
import net.aKF;
import net.tn_0;

public class DD {
    public static DD a = new DD(aKF.b);
    private String b;

    public static DD a(NBTTagCompound nBTTagCompound) {
        if (tn_0.a(nBTTagCompound, aKF.c, 8)) {
            String string = tn_0.m(nBTTagCompound, aKF.a);
            return new DD(string);
        }
        return a;
    }

    public void b(NBTTagCompound nBTTagCompound) {
        tn_0.a(nBTTagCompound, aKF.d, this.b);
    }

    public String a() {
        return this.b;
    }

    public boolean b() {
        return this.b == null || this.b.isEmpty();
    }

    public DD(String string) {
        this.b = string;
    }
}

