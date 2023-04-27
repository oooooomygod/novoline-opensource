/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 */
package net;

import cc.novoline.invoke.StringInvoker;
import com.google.common.base.Splitter;
import deobf.NBTBase;
import java.util.regex.Pattern;
import net.DZ;
import net.NBTTagString;
import net.P8;
import net.aD4;
import net.aD5;
import net.aDA;
import net.aDD;
import net.aDO;
import net.aDR;
import net.aEq;
import net.aL0;
import net.aWT;
import net.ada_0;
import net.amx_2;
import net.at8;
import net.auk_2;
import net.axt_2;
import net.axx_1;
import net.db_0;
import net.lx_2;
import net.ow_1;
import net.wk_2;

class atM
extends at8 {
    private static Pattern e;
    private static Pattern b;
    protected String f;
    private static Pattern c;
    private static Pattern d;
    private static Pattern j;
    private static Pattern i;
    private static Pattern h;
    private static Splitter g;

    public atM(String string, String string2) {
        this.a = string;
        this.f = string2;
    }

    static {
        h = ow_1.c(aEq.d);
        e = ow_1.c(aEq.p);
        i = ow_1.c(aEq.f);
        j = ow_1.c(aEq.m);
        d = ow_1.c(aEq.j);
        b = ow_1.c(aEq.k);
        c = ow_1.c(aEq.i);
        g = amx_2.a(amx_2.a(','));
    }

    @Override
    public NBTBase a() {
        block26: {
            block25: {
                block24: {
                    block23: {
                        block22: {
                            block21: {
                                block20: {
                                    block19: {
                                        block18: {
                                            try {
                                                if (!wk_2.a(ow_1.a(h, this.f))) break block18;
                                                return new aD5(db_0.c(StringInvoker.b(this.f, 0, StringInvoker.c(this.f) - 1)));
                                            }
                                            catch (NumberFormatException numberFormatException) {
                                                this.f = StringInvoker.a(this.f, aEq.o, aEq.n);
                                                return new NBTTagString(this.f);
                                            }
                                        }
                                        if (!wk_2.a(ow_1.a(e, this.f))) break block19;
                                        return new aDD(axx_1.a(StringInvoker.b(this.f, 0, StringInvoker.c(this.f) - 1)));
                                    }
                                    if (!wk_2.a(ow_1.a(i, this.f))) break block20;
                                    return new aD4(axt_2.a(StringInvoker.b(this.f, 0, StringInvoker.c(this.f) - 1)));
                                }
                                if (!wk_2.a(ow_1.a(j, this.f))) break block21;
                                return new aDR(lx_2.a(StringInvoker.b(this.f, 0, StringInvoker.c(this.f) - 1)));
                            }
                            if (!wk_2.a(ow_1.a(d, this.f))) break block22;
                            return new aDA(aWT.a(StringInvoker.b(this.f, 0, StringInvoker.c(this.f) - 1)));
                        }
                        if (!wk_2.a(ow_1.a(b, this.f))) break block23;
                        return new ada_0(P8.a(this.f));
                    }
                    if (!wk_2.a(ow_1.a(c, this.f))) break block24;
                    return new aD5(db_0.c(this.f));
                }
                if (!StringInvoker.d(this.f, aEq.e) && !StringInvoker.d(this.f, aEq.b)) break block25;
                boolean bl = auk_2.b(this.f);
                return new aD4((byte)(bl ? 1 : 0));
            }
            if (!StringInvoker.e(this.f, aEq.l) || !StringInvoker.c(this.f, aEq.q)) break block26;
            String string = StringInvoker.b(this.f, 1, StringInvoker.c(this.f) - 1);
            String[] stringArray = (String[])DZ.a(amx_2.b(g, string), String.class);
            int[] nArray = new int[stringArray.length];
            for (int i = 0; i < stringArray.length; ++i) {
                nArray[i] = P8.a(StringInvoker.h(stringArray[i]));
                continue;
            }
            try {
                return new aDO(nArray);
            }
            catch (NumberFormatException numberFormatException) {
                return new NBTTagString(this.f);
            }
        }
        if (StringInvoker.e(this.f, aEq.h) && StringInvoker.c(this.f, aEq.c)) {
            this.f = StringInvoker.b(this.f, 1, StringInvoker.c(this.f) - 1);
        }
        this.f = StringInvoker.a(this.f, aEq.g, aEq.a);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < StringInvoker.c(this.f); ++i) {
            if (i < StringInvoker.c(this.f) - 1 && StringInvoker.b(this.f, i) == '\\' && StringInvoker.b(this.f, i + 1) == '\\') {
                aL0.a(stringBuilder, '\\');
                ++i;
                continue;
            }
            aL0.a(stringBuilder, StringInvoker.b(this.f, i));
        }
        return new NBTTagString(stringBuilder.toString());
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }
}

