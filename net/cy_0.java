/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.NBTBase;
import net.BT;
import net.NBTTagCompound;
import net.OP;
import net.afh_0;
import net.ano_1;
import net.tn_0;

/*
 * Renamed from net.Cy
 */
public class cy_0
extends BT {
    private NBTTagCompound b;
    OP d;
    private String c;

    static NBTTagCompound b(cy_0 cy_02) {
        return cy_02.b;
    }

    public cy_0(OP oP, NBTTagCompound nBTTagCompound) {
        this(oP, tn_0.d(nBTTagCompound, ano_1.c), tn_0.m(nBTTagCompound, ano_1.h), tn_0.g(nBTTagCompound, ano_1.g));
    }

    private cy_0(OP oP, NBTTagCompound nBTTagCompound, String string, int n) {
        this.d = oP;
        super(n);
        if (string.equals(ano_1.d)) {
            string = afh_0.b(afh_0.a(tn_0.g(nBTTagCompound, ano_1.f)));
        }
        this.b = nBTTagCompound;
        this.c = string;
    }

    public cy_0(OP oP, NBTTagCompound nBTTagCompound, String string) {
        this(oP, nBTTagCompound, string, 1);
    }

    public NBTTagCompound a() {
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        tn_0.a(nBTTagCompound, ano_1.a, (NBTBase)this.b);
        tn_0.a(nBTTagCompound, ano_1.i, this.c);
        tn_0.b(nBTTagCompound, ano_1.b, this.a);
        return nBTTagCompound;
    }

    static String a(cy_0 cy_02) {
        return cy_02.c;
    }
}

