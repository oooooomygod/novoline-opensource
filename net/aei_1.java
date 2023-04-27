/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import deobf.NBTBase;
import deobf.NBTTagList;
import java.util.Iterator;
import net.EK;
import net.MZ;
import net.NBTTagCompound;
import net.NBTTagString;
import net.O3;
import net.P8;
import net.a7r_0;
import net.aD4;
import net.aD5;
import net.aDA;
import net.aDD;
import net.aDR;
import net.aNA;
import net.aNI;
import net.aP2;
import net.aRU;
import net.aS0;
import net.aWT;
import net.ada_0;
import net.adw_2;
import net.axt_2;
import net.axx_1;
import net.db_0;
import net.dd_0;
import net.dz_0;
import net.ke_0;
import net.kv_0;
import net.lx_2;
import net.tn_0;
import net.tx_1;
import net.yq_0;
import net.ys_2;

/*
 * Renamed from net.aeI
 */
public class aei_1 {
    private static int g = 4;
    private static int a = 3;
    private int f;
    private String l;
    private static int h = 2;
    private static int m = 0;
    private static String c;
    private static String i;
    private String e;
    private static String j;
    private static String b;
    private static int k = 1;
    private String[] d;

    public boolean a(NBTTagCompound nBTTagCompound) {
        aP2.b();
        if (nBTTagCompound == null) {
            return false;
        }
        NBTBase nBTBase = nBTTagCompound;
        int n = 0;
        if (n < this.d.length) {
            String string = this.d[n];
            if ((nBTBase = aei_1.a(nBTBase, string)) == null) {
                return false;
            }
            ++n;
        }
        if (this.l.equals(aNI.l)) {
            return this.b(nBTBase);
        }
        if ((nBTBase = aei_1.a(nBTBase, this.l)) == null) {
            return false;
        }
        return this.a(nBTBase);
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private boolean b(String string, String string2) {
        return MZ.a(string, string2, '*', '?');
    }

    private static NBTBase a(NBTBase nBTBase, String string) {
        aP2.b();
        if (nBTBase instanceof NBTTagCompound) {
            NBTTagCompound nBTTagCompound = (NBTTagCompound)nBTBase;
            return tn_0.h(nBTTagCompound, string);
        }
        if (nBTBase instanceof NBTTagList) {
            NBTTagList nBTTagList = (NBTTagList)nBTBase;
            ys_2.a(string, -1);
            return null;
        }
        return null;
    }

    public aei_1(String string, String string2) {
        aP2.b();
        this.d = null;
        this.l = null;
        this.f = 0;
        this.e = null;
        Object[] objectArray = ys_2.a(string, aNI.g);
        this.d = (String[])a7r_0.a(objectArray, 0, objectArray.length - 1);
        this.l = objectArray[objectArray.length - 1];
        if (StringInvoker.e(string2, aNI.d)) {
            this.f = 1;
            string2 = StringInvoker.a(string2, StringInvoker.c(aNI.j));
        }
        if (StringInvoker.e(string2, aNI.a)) {
            this.f = 2;
            string2 = StringInvoker.i(StringInvoker.a(string2, StringInvoker.c(aNI.k)));
        }
        if (StringInvoker.e(string2, aNI.e)) {
            this.f = 3;
            string2 = StringInvoker.a(string2, StringInvoker.c(aNI.f));
        }
        if (StringInvoker.e(string2, aNI.h)) {
            this.f = 4;
            string2 = StringInvoker.i(StringInvoker.a(string2, StringInvoker.c(aNI.m)));
        }
        this.f = 0;
        this.e = string2 = ke_0.a(string2);
    }

    private boolean b(NBTBase nBTBase) {
        int n;
        int n2;
        String string;
        NBTBase nBTBase2;
        NBTBase nBTBase3;
        Iterator iterator;
        aP2.b();
        if (nBTBase instanceof NBTTagCompound && dz_0.c(iterator = aS0.f(tn_0.c(nBTBase3 = (NBTTagCompound)nBTBase))) && this.a(nBTBase2 = tn_0.h(nBTBase3, string = (String)dz_0.b(iterator)))) {
            return true;
        }
        if (nBTBase instanceof NBTTagList && (n2 = 0) < (n = kv_0.c((NBTTagList)(nBTBase3 = (NBTTagList)nBTBase)))) {
            nBTBase2 = kv_0.a((NBTTagList)nBTBase3, n2);
            if (this.a(nBTBase2)) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    private static String c(NBTBase nBTBase) {
        aP2.b();
        if (nBTBase == null) {
            return null;
        }
        if (nBTBase instanceof NBTTagString) {
            NBTTagString nBTTagString = (NBTTagString)nBTBase;
            return dd_0.a(nBTTagString);
        }
        if (nBTBase instanceof ada_0) {
            ada_0 ada_02 = (ada_0)nBTBase;
            return P8.g(aRU.a(ada_02));
        }
        if (nBTBase instanceof aD4) {
            aD4 aD42 = (aD4)nBTBase;
            return axt_2.b(aNA.a(aD42));
        }
        if (nBTBase instanceof aDA) {
            aDA aDA2 = (aDA)nBTBase;
            return aWT.a(tx_1.a(aDA2));
        }
        if (nBTBase instanceof aDR) {
            aDR aDR2 = (aDR)nBTBase;
            return lx_2.c(O3.a(aDR2));
        }
        if (nBTBase instanceof aDD) {
            aDD aDD2 = (aDD)nBTBase;
            return axx_1.d(yq_0.a(aDD2));
        }
        if (nBTBase instanceof aD5) {
            aD5 aD52 = (aD5)nBTBase;
            return db_0.c(EK.a(aD52));
        }
        return nBTBase.toString();
    }

    /*
     * Handled impossible loop by duplicating code
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        String[] stringArray = new String[4];
        int n = 0;
        String string = "\ns\u0012@SJ\t\u0011f\u0014Q_\u0015\u0017\u0016,";
        int n2 = "\ns\u0012@SJ\t\u0011f\u0014Q_\u0015\u0017\u0016,".length();
        int n3 = 6;
        int n4 = -1;
        while (true) {
            int n5 = 88;
            int n6 = ++n4;
            String string2 = string.substring(n6, n6 + n3);
            int n7 = -1;
            boolean bl = true;
            do {
                char[] cArray;
                block7: {
                    int n8;
                    char[] cArray2;
                    int n9;
                    int n10;
                    block6: {
                        if (!bl || (bl = false) || !true) {
                            string = "\u001ae\u0013C\\\u0010\u0019P\u0007\u0003v\u0002P\\\u001aM";
                            n2 = "\u001ae\u0013C\\\u0010\u0019P\u0007\u0003v\u0002P\\\u001aM".length();
                            n3 = 8;
                            n4 = -1;
                            n5 = 74;
                            int n11 = ++n4;
                            string2 = string.substring(n11, n11 + n3);
                            n7 = 0;
                        }
                        char[] cArray3 = string2.toCharArray();
                        int n12 = cArray3.length;
                        n10 = 0;
                        n9 = n5;
                        cArray2 = cArray3;
                        n8 = n12;
                        if (n12 <= 1) break block6;
                        cArray = cArray2;
                        n8 = n8;
                        if (n8 <= n10) break block7;
                    }
                    do {
                        cArray2 = cArray2;
                        int n13 = n10;
                        int cfr_ignored_1 = n10 % 7;
                        cArray2[n13] = (char)(cArray2[n13] ^ (n9 ^ 0x20));
                        ++n10;
                        n9 = n9;
                        cArray = cArray2;
                        n8 = n8;
                    } while (n8 > n10);
                }
                stringArray[n++] = new String(cArray).intern();
            } while ((n4 += n3) >= n2);
            n3 = string.charAt(n4);
        }
    }

    private boolean a(NBTBase nBTBase) {
        aP2.b();
        if (nBTBase == null) {
            return false;
        }
        aei_1.c(nBTBase);
        return false;
    }

    public String toString() {
        aP2.b();
        StringBuffer stringBuffer = new StringBuffer();
        int n = 0;
        if (n < this.d.length) {
            String string = this.d[n];
            adw_2.a(stringBuffer, string);
            ++n;
        }
        if (adw_2.a(stringBuffer) > 0) {
            adw_2.a(stringBuffer, aNI.b);
        }
        adw_2.a(stringBuffer, this.l);
        adw_2.a(stringBuffer, aNI.n);
        adw_2.a(stringBuffer, this.e);
        return stringBuffer.toString();
    }

    private boolean a(String string, String string2) {
        return StringInvoker.k(string, string2);
    }
}

