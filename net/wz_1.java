/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.NBTBase;
import net.NBTTagCompound;
import net.aL0;
import net.aiu_0;
import net.tn_0;
import net.wo_0;

/*
 * Renamed from net.wZ
 */
public class wz_1
extends wo_0 {
    private NBTTagCompound c = new NBTTagCompound();

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        tn_0.a(nBTTagCompound, aiu_0.c, (NBTBase)this.c);
    }

    public wz_1(String string) {
        super(string);
    }

    public static String a(int n, int n2) {
        return aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), aiu_0.e), n), aiu_0.a), n2), aiu_0.b).toString();
    }

    public void a(NBTTagCompound nBTTagCompound, int n, int n2) {
        tn_0.a(this.c, wz_1.a(n, n2), (NBTBase)nBTTagCompound);
    }

    public NBTTagCompound a() {
        return this.c;
    }

    @Override
    public void a(NBTTagCompound nBTTagCompound) {
        this.c = tn_0.d(nBTTagCompound, aiu_0.d);
    }
}

