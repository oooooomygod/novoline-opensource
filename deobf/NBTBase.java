/*
 * Decompiled with CFR 0.152.
 */
package deobf;

import deobf.NBTTagList;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import net.NBTTagCompound;
import net.NBTTagString;
import net.aD4;
import net.aD5;
import net.aDA;
import net.aDD;
import net.aDE;
import net.aDO;
import net.aDR;
import net.ada_0;
import net.adh_0;
import net.cv_0;
import net.gy_0;

public abstract class NBTBase {
    public static String[] a = new String[]{cv_0.j, cv_0.i, cv_0.f, cv_0.h, cv_0.a, cv_0.k, cv_0.e, cv_0.c, cv_0.d, cv_0.l, cv_0.g, cv_0.b};

    public boolean b() {
        return false;
    }

    abstract void a(DataInput var1, int var2, gy_0 var3) throws IOException;

    protected String c() {
        return this.toString();
    }

    public abstract byte a();

    protected static NBTBase a(byte by) {
        switch (by) {
            case 0: {
                return new aDE();
            }
            case 1: {
                return new aD4();
            }
            case 2: {
                return new aDA();
            }
            case 3: {
                return new ada_0();
            }
            case 4: {
                return new aDR();
            }
            case 5: {
                return new aDD();
            }
            case 6: {
                return new aD5();
            }
            case 7: {
                return new adh_0();
            }
            case 8: {
                return new NBTTagString();
            }
            case 9: {
                return new NBTTagList();
            }
            case 10: {
                return new NBTTagCompound();
            }
            case 11: {
                return new aDO();
            }
        }
        return null;
    }

    abstract void a(DataOutput var1) throws IOException;

    public abstract NBTBase d();

    public abstract String toString();

    public int hashCode() {
        return this.a();
    }

    public boolean equals(Object object) {
        if (!(object instanceof NBTBase)) {
            return false;
        }
        NBTBase nBTBase = (NBTBase)object;
        return this.a() == nBTBase.a();
    }
}

