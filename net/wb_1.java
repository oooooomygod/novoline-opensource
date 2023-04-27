/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.NBTTagList;
import java.util.Iterator;
import net.NBTTagCompound;
import net.NBTTagString;
import net.QU;
import net.VM;
import net.a26;
import net.a35;
import net.aFJ;
import net.aL0;
import net.aOA;
import net.acl_0;
import net.afi_1;
import net.aon_1;
import net.auu_1;
import net.dz_0;
import net.hs_0;
import net.kv_0;
import net.ms_0;
import net.sd_1;
import net.tc_0;
import net.tn_0;
import net.to_1;
import net.wo_0;
import net.za_2;
import org.apache.logging.log4j.Logger;

/*
 * Renamed from net.wB
 */
public class wb_1
extends wo_0 {
    private static Logger d = LogManagerInvoker.c();
    private NBTTagCompound e;
    private za_2 c;

    protected void b(NBTTagList nBTTagList) {
        for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
            aFJ aFJ2;
            NBTTagCompound nBTTagCompound = kv_0.g(nBTTagList, i);
            String string = tn_0.m(nBTTagCompound, auu_1.Q);
            if (StringInvoker.c(string) > 16) {
                string = StringInvoker.b(string, 0, 16);
            }
            a35 a352 = VM.f(this.c, string);
            String string2 = tn_0.m(nBTTagCompound, auu_1.q);
            if (StringInvoker.c(string2) > 32) {
                string2 = StringInvoker.b(string2, 0, 32);
            }
            sd_1.b(a352, string2);
            if (tn_0.a(nBTTagCompound, auu_1.J, 8)) {
                sd_1.a(a352, tc_0.a(tn_0.m(nBTTagCompound, auu_1.u)));
            }
            sd_1.c(a352, tn_0.m(nBTTagCompound, auu_1.z));
            sd_1.a(a352, tn_0.m(nBTTagCompound, auu_1.ac));
            if (tn_0.a(nBTTagCompound, auu_1.d, 99)) {
                sd_1.b(a352, tn_0.c(nBTTagCompound, auu_1.H));
            }
            if (tn_0.a(nBTTagCompound, auu_1.F, 99)) {
                sd_1.a(a352, tn_0.c(nBTTagCompound, auu_1.C));
            }
            if (tn_0.a(nBTTagCompound, auu_1.T, 8)) {
                aFJ2 = to_1.a(tn_0.m(nBTTagCompound, auu_1.x));
                sd_1.a(a352, aFJ2);
            }
            if (tn_0.a(nBTTagCompound, auu_1.r, 8)) {
                aFJ2 = to_1.a(tn_0.m(nBTTagCompound, auu_1.k));
                sd_1.b(a352, aFJ2);
            }
            this.a(a352, tn_0.c(nBTTagCompound, auu_1.K, 8));
        }
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        if (this.c == null) {
            LoggerInvoker.warn(d, auu_1.o);
        } else {
            tn_0.a(nBTTagCompound, auu_1.ab, this.b());
            tn_0.a(nBTTagCompound, auu_1.E, this.a());
            tn_0.a(nBTTagCompound, auu_1.Y, this.c());
            this.d(nBTTagCompound);
        }
    }

    protected void c(NBTTagList nBTTagList) {
        for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
            NBTTagCompound nBTTagCompound = kv_0.g(nBTTagList, i);
            aOA aOA2 = (aOA)MapInvoker.c(aOA.c, tn_0.m(nBTTagCompound, auu_1.B));
            String string = tn_0.m(nBTTagCompound, auu_1.g);
            if (StringInvoker.c(string) > 16) {
                string = StringInvoker.b(string, 0, 16);
            }
            acl_0 acl_02 = VM.a(this.c, string, aOA2);
            afi_1.a(acl_02, tn_0.m(nBTTagCompound, auu_1.V));
            afi_1.a(acl_02, a26.a(tn_0.m(nBTTagCompound, auu_1.y)));
        }
    }

    protected void a(a35 a352, NBTTagList nBTTagList) {
        for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
            VM.a(this.c, kv_0.f(nBTTagList, i), sd_1.h(a352));
        }
    }

    public wb_1() {
        this(auu_1.S);
    }

    protected void a(NBTTagList nBTTagList) {
        for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
            NBTTagCompound nBTTagCompound = kv_0.g(nBTTagList, i);
            acl_0 acl_02 = VM.a(this.c, tn_0.m(nBTTagCompound, auu_1.R));
            String string = tn_0.m(nBTTagCompound, auu_1.j);
            if (StringInvoker.c(string) > 40) {
                string = StringInvoker.b(string, 0, 40);
            }
            QU qU = VM.c(this.c, string, acl_02);
            hs_0.a(qU, tn_0.g(nBTTagCompound, auu_1.O));
            if (!tn_0.b(nBTTagCompound, auu_1.I)) continue;
            hs_0.a(qU, tn_0.c(nBTTagCompound, auu_1.U));
        }
    }

    public wb_1(String string) {
        super(string);
    }

    public void a(za_2 za_22) {
        this.c = za_22;
        if (this.e != null) {
            this.a(this.e);
        }
    }

    protected NBTTagList c() {
        NBTTagList nBTTagList = new NBTTagList();
        Iterator iterator = ms_0.a(VM.d(this.c));
        while (dz_0.c(iterator)) {
            a35 a352 = (a35)dz_0.b(iterator);
            NBTTagCompound nBTTagCompound = new NBTTagCompound();
            tn_0.a(nBTTagCompound, auu_1.P, sd_1.h(a352));
            tn_0.a(nBTTagCompound, auu_1.c, sd_1.c(a352));
            if (tc_0.a(sd_1.i(a352)) >= 0) {
                tn_0.a(nBTTagCompound, auu_1.h, tc_0.b(sd_1.i(a352)));
            }
            tn_0.a(nBTTagCompound, auu_1.m, sd_1.g(a352));
            tn_0.a(nBTTagCompound, auu_1.M, sd_1.f(a352));
            tn_0.a(nBTTagCompound, auu_1.N, sd_1.a(a352));
            tn_0.a(nBTTagCompound, auu_1.s, sd_1.k(a352));
            tn_0.a(nBTTagCompound, auu_1.G, sd_1.b((a35)a352).field_178830_e);
            tn_0.a(nBTTagCompound, auu_1.aa, sd_1.j((a35)a352).field_178830_e);
            NBTTagList nBTTagList2 = new NBTTagList();
            Iterator iterator2 = ms_0.a(sd_1.d(a352));
            while (dz_0.c(iterator2)) {
                String string = (String)dz_0.b(iterator2);
                kv_0.a(nBTTagList2, new NBTTagString(string));
            }
            tn_0.a(nBTTagCompound, auu_1.Z, nBTTagList2);
            kv_0.a(nBTTagList, nBTTagCompound);
        }
        return nBTTagList;
    }

    protected NBTTagList a() {
        NBTTagList nBTTagList = new NBTTagList();
        Iterator iterator = ms_0.a(VM.c(this.c));
        while (dz_0.c(iterator)) {
            QU qU = (QU)dz_0.b(iterator);
            if (hs_0.e(qU) == null) continue;
            NBTTagCompound nBTTagCompound = new NBTTagCompound();
            tn_0.a(nBTTagCompound, auu_1.w, hs_0.c(qU));
            tn_0.a(nBTTagCompound, auu_1.l, afi_1.d(hs_0.e(qU)));
            tn_0.b(nBTTagCompound, auu_1.v, hs_0.d(qU));
            tn_0.a(nBTTagCompound, auu_1.f, hs_0.b(qU));
            kv_0.a(nBTTagList, nBTTagCompound);
        }
        return nBTTagList;
    }

    protected void c(NBTTagCompound nBTTagCompound) {
        int n = 0;
        while (true) {
            if (tn_0.a(nBTTagCompound, aL0.c(aL0.a(new StringBuilder(), auu_1.a), n).toString(), 8)) {
                String string = tn_0.m(nBTTagCompound, aL0.c(aL0.a(new StringBuilder(), auu_1.X), n).toString());
                acl_0 acl_02 = VM.a(this.c, string);
                VM.a(this.c, n, acl_02);
            }
            ++n;
        }
    }

    protected NBTTagList b() {
        NBTTagList nBTTagList = new NBTTagList();
        Iterator iterator = ms_0.a(VM.e(this.c));
        while (dz_0.c(iterator)) {
            acl_0 acl_02 = (acl_0)dz_0.b(iterator);
            if (afi_1.a(acl_02) == null) continue;
            NBTTagCompound nBTTagCompound = new NBTTagCompound();
            tn_0.a(nBTTagCompound, auu_1.b, afi_1.d(acl_02));
            tn_0.a(nBTTagCompound, auu_1.L, aon_1.a(afi_1.a(acl_02)));
            tn_0.a(nBTTagCompound, auu_1.ad, afi_1.b(acl_02));
            tn_0.a(nBTTagCompound, auu_1.i, a26.a(afi_1.c(acl_02)));
            kv_0.a(nBTTagList, nBTTagCompound);
        }
        return nBTTagList;
    }

    @Override
    public void a(NBTTagCompound nBTTagCompound) {
        if (this.c == null) {
            this.e = nBTTagCompound;
        } else {
            this.c(tn_0.c(nBTTagCompound, auu_1.A, 10));
            this.a(tn_0.c(nBTTagCompound, auu_1.p, 10));
            if (tn_0.a(nBTTagCompound, auu_1.D, 10)) {
                this.c(tn_0.d(nBTTagCompound, auu_1.W));
            }
            if (tn_0.a(nBTTagCompound, auu_1.e, 9)) {
                this.b(tn_0.c(nBTTagCompound, auu_1.t, 10));
            }
        }
    }

    protected void d(NBTTagCompound nBTTagCompound) {
        NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
        int n = 0;
        while (true) {
            acl_0 acl_02 = VM.a(this.c, n);
            tn_0.a(nBTTagCompound2, aL0.c(aL0.a(new StringBuilder(), auu_1.n), n).toString(), afi_1.d(acl_02));
            ++n;
        }
    }
}

