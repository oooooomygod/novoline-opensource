/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.ChatComponentStyle;
import deobf.IChatComponent;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import net.ChatComponentText;
import net.ChatStyle;
import net.HX;
import net.P8;
import net.a7r_0;
import net.aL0;
import net.ahq_0;
import net.anz_0;
import net.dz_0;
import net.le_0;
import net.my_0;
import net.ow_1;
import net.pu_1;
import net.wk_2;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.aoZ
 */
public class aoz_1
extends ChatComponentStyle {
    public static Pattern f = ow_1.c(pu_1.h);
    private String g;
    List<IChatComponent> e;
    private Object c = new Object();
    private long h = -1L;
    private Object[] d;

    private IChatComponent a(int n) {
        IChatComponent iChatComponent;
        if (n >= this.d.length) {
            throw new le_0(this, n);
        }
        Object object = this.d[n];
        if (object instanceof IChatComponent) {
            iChatComponent = (IChatComponent)object;
        } else {
            iChatComponent = new ChatComponentText(pu_1.c);
            HX.a(iChatComponent.d(), this.d());
        }
        return iChatComponent;
    }

    @Override
    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), pu_1.j), this.g), '\''), pu_1.a), a7r_0.b(this.d)), pu_1.d), this.a), pu_1.f), this.d()), '}').toString();
    }

    public String a() {
        return this.g;
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + this.g.hashCode();
        n = 31 * n + a7r_0.c(this.d);
        return n;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    @Override
    public String c() {
        this.d();
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<IChatComponent> iterator = this.e.iterator();
        while (dz_0.c(iterator)) {
            IChatComponent iChatComponent = (IChatComponent)dz_0.b(iterator);
            aL0.a(stringBuilder, iChatComponent.c());
        }
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof aoz_1)) {
            return false;
        }
        aoz_1 aoz_12 = (aoz_1)object;
        return a7r_0.a(this.d, aoz_12.d) && this.g.equals(aoz_12.g) && super.equals(object);
    }

    @Override
    public Iterator<IChatComponent> iterator() {
        this.d();
        return anz_0.a(aoz_1.a(this.e), aoz_1.a(this.a));
    }

    @Override
    public aoz_1 b() {
        Object[] objectArray = new Object[this.d.length];
        for (int i = 0; i < this.d.length; ++i) {
            objectArray[i] = this.d[i] instanceof IChatComponent ? ((IChatComponent)this.d[i]).b() : this.d[i];
        }
        aoz_1 aoz_12 = new aoz_1(this.g, objectArray);
        aoz_12.a(HX.c(this.d()));
        Iterator<IChatComponent> iterator = this.a().iterator();
        while (dz_0.c(iterator)) {
            IChatComponent iChatComponent = (IChatComponent)dz_0.b(iterator);
            aoz_12.a(iChatComponent.b());
        }
        return aoz_12;
    }

    /*
     * Unable to fully structure code
     */
    protected void a(String var1_1) {
        var3_2 = ow_1.a(aoz_1.f, var1_1);
        var5_3 = 0;
        while (true) {
            block10: {
                block11: {
                    if (!wk_2.a(var3_2, var5_3)) break;
                    var7_6 = wk_2.b(var3_2);
                    var6_4 = wk_2.d(var3_2);
                    if (var7_6 > var5_3) {
                        var8_8 = new ChatComponentText(StringInvoker.a(StringInvoker.b(var1_1, var5_3, var7_6), new Object[0]));
                        HX.a(var8_8.d(), this.d());
                        ListInvoker.add(this.e, var8_8);
                    }
                    var8_8 = wk_2.b(var3_2, 2);
                    var9_9 = StringInvoker.b(var1_1, var7_6, var6_4);
                    if (!pu_1.k.equals(var8_8) || !pu_1.g.equals(var9_9)) ** GOTO lbl24
                    var10_10 = new ChatComponentText(pu_1.b);
                    HX.a(var10_10.d(), this.d());
                    ListInvoker.add(this.e, var10_10);
                    break block10;
lbl24:
                    // 1 sources

                    if (pu_1.l.equals(var8_8)) break block11;
                    throw new le_0(this, aL0.a(aL0.a(aL0.a(new StringBuilder(), pu_1.e), var9_9), pu_1.i).toString());
                }
                var10_10 = wk_2.b(var3_2, 1);
                var11_11 = P8.a((String)var10_10) - 1;
                if (var11_11 < this.d.length) {
                    ListInvoker.add(this.e, this.a(var11_11));
                }
            }
            var5_3 = var6_4;
        }
        try {
            if (var5_3 < StringInvoker.c(var1_1)) {
                var7_7 = new ChatComponentText(StringInvoker.a(StringInvoker.a(var1_1, var5_3), new Object[0]));
                HX.a(var7_7.d(), this.d());
                ListInvoker.add(this.e, var7_7);
            }
            return;
        }
        catch (IllegalFormatException var6_5) {
            throw new le_0(this, (Throwable)var6_5);
        }
    }

    @Override
    public IChatComponent a(ChatStyle chatStyle) {
        super.a(chatStyle);
        for (Object object : this.d) {
            if (!(object instanceof IChatComponent)) continue;
            HX.a(((IChatComponent)object).d(), this.d());
        }
        if (this.h > -1L) {
            Iterator<IChatComponent> iterator = this.e.iterator();
            while (dz_0.c(iterator)) {
                IChatComponent iChatComponent = (IChatComponent)dz_0.b(iterator);
                HX.a(iChatComponent.d(), chatStyle);
            }
        }
        return this;
    }

    public aoz_1(String string, Object ... objectArray) {
        this.e = my_0.c();
        this.g = string;
        this.d = objectArray;
        for (Object object : objectArray) {
            if (!(object instanceof IChatComponent)) continue;
            HX.a(((IChatComponent)object).d(), this.d());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    synchronized void d() {
        Object object = this.c;
        synchronized (object) {
            long l4 = ahq_0.a();
            if (l4 == this.h) {
                return;
            }
            this.h = l4;
            ListInvoker.clear(this.e);
        }
        try {
            this.a(ahq_0.b(this.g));
            return;
        }
        catch (le_0 le_02) {
            ListInvoker.clear(this.e);
            try {
                this.a(ahq_0.c(this.g));
                return;
            }
            catch (le_0 le_03) {
                throw le_02;
            }
        }
    }

    public Object[] c() {
        return this.d;
    }
}

