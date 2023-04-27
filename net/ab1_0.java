/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import deobf.NBTBase;
import net.ICommandSender;
import net.NBTTagCompound;
import net.QU;
import net.VM;
import net.a9N;
import net.aL0;
import net.aV8;
import net.acl_0;
import net.aig_0;
import net.alj_1;
import net.ax8_0;
import net.axy_1;
import net.ays_0;
import net.hs_0;
import net.il_2;
import net.tn_0;
import net.za_2;

/*
 * Renamed from net.ab1
 */
public class ab1_0 {
    private static int b = a9N.values().length;
    private String[] c = a;
    private String[] d = a;
    private static String[] a = new String[b];

    private static il_2 a(il_2 il_22) {
        return il_22;
    }

    public void a(ICommandSender iCommandSender, a9N a9N2, int n) {
        String string;
        String string2 = this.c[ax8_0.b(a9N2)];
        axy_1 axy_12 = new axy_1(this, iCommandSender);
        try {
            string = ays_0.a(axy_12, string2);
        }
        catch (il_2 il_22) {
            return;
        }
        String string3 = this.d[ax8_0.b(a9N2)];
        za_2 za_22 = aV8.v(alj_1.a(iCommandSender));
        acl_0 acl_02 = VM.a(za_22, string3);
        if (VM.a(za_22, string, acl_02)) {
            QU qU = VM.c(za_22, string, acl_02);
            hs_0.a(qU, n);
        }
    }

    public void a(ab1_0 ab1_02) {
        for (a9N a9N2 : a9N.values()) {
            ab1_0.a(this, a9N2, ab1_02.c[ax8_0.b(a9N2)], ab1_02.d[ax8_0.b(a9N2)]);
        }
    }

    private static void a(ab1_0 ab1_02, a9N a9N2) {
        if (ab1_02.c != a && ab1_02.d != a) {
            ab1_02.c[ax8_0.b((a9N)a9N2)] = null;
            ab1_02.d[ax8_0.b((a9N)a9N2)] = null;
            for (a9N a9N3 : a9N.values()) {
                if (ab1_02.c[ax8_0.b(a9N3)] != null && ab1_02.d[ax8_0.b(a9N3)] != null) break;
            }
            ab1_02.c = a;
            ab1_02.d = a;
        }
    }

    public static void a(ab1_0 ab1_02, a9N a9N2, String string, String string2) {
        if (!StringInvoker.g(string) && !StringInvoker.g(string2)) {
            if (ab1_02.c == a || ab1_02.d == a) {
                ab1_02.c = new String[b];
                ab1_02.d = new String[b];
            }
            ab1_02.c[ax8_0.b((a9N)a9N2)] = string;
            ab1_02.d[ax8_0.b((a9N)a9N2)] = string2;
        } else {
            ab1_0.a(ab1_02, a9N2);
        }
    }

    public void b(NBTTagCompound nBTTagCompound) {
        if (tn_0.a(nBTTagCompound, aig_0.f, 10)) {
            NBTTagCompound nBTTagCompound2 = tn_0.d(nBTTagCompound, aig_0.b);
            for (a9N a9N2 : a9N.values()) {
                String string = aL0.a(aL0.a(new StringBuilder(), ax8_0.a(a9N2)), aig_0.c).toString();
                String string2 = aL0.a(aL0.a(new StringBuilder(), ax8_0.a(a9N2)), aig_0.d).toString();
                if (!tn_0.a(nBTTagCompound2, string, 8) || !tn_0.a(nBTTagCompound2, string2, 8)) continue;
                String string3 = tn_0.m(nBTTagCompound2, string);
                String string4 = tn_0.m(nBTTagCompound2, string2);
                ab1_0.a(this, a9N2, string3, string4);
            }
        }
    }

    public void a(NBTTagCompound nBTTagCompound) {
        NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
        for (a9N a9N2 : a9N.values()) {
            String string = this.c[ax8_0.b(a9N2)];
            String string2 = this.d[ax8_0.b(a9N2)];
            tn_0.a(nBTTagCompound2, aL0.a(aL0.a(new StringBuilder(), ax8_0.a(a9N2)), aig_0.a).toString(), string);
            tn_0.a(nBTTagCompound2, aL0.a(aL0.a(new StringBuilder(), ax8_0.a(a9N2)), aig_0.e).toString(), string2);
        }
        if (!tn_0.b(nBTTagCompound2)) {
            tn_0.a(nBTTagCompound, aig_0.g, (NBTBase)nBTTagCompound2);
        }
    }
}

