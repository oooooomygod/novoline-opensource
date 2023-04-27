/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SysInvoker;
import deobf.GuiScreen;
import deobf.MCInvoker;
import net.minecraft.resources.ResourcePackRepository;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.Logger;

public class RB
extends GuiScreen {
    private boolean v = false;
    private GuiScreen A;
    private a8W w;
    private static Logger x = LogManagerInvoker.c();
    private a8p_0 y;
    private List<sg_1> z;
    private List<sg_1> B;

    @Override
    protected void b(int n, int n2, int n3) throws IOException {
        super.b(n, n2, n3);
        aOY.a(this.y, n, n2, n3);
        I0.a(this.w, n, n2, n3);
    }

    @Override
    public void c() throws IOException {
        super.c();
        this.w.g();
        this.y.g();
    }

    public RB(GuiScreen guiScreen) {
        this.A = guiScreen;
    }

    public void a() {
        this.v = true;
    }

    public List<sg_1> a(sg_1 sg_12) {
        return this.b(sg_12) ? this.B : this.z;
    }

    @Override
    public void a(int n, int n2, float f) {
        this.e(0);
        this.y.a(n, n2, f);
        this.w.a(n, n2, f);
        this.b(this.q, I18n.format(W7.j, new Object[0]), this.n / 2, 16, 0xFFFFFF);
        this.b(this.q, I18n.format(W7.g, new Object[0]), this.n / 2 - 77, this.f - 26, 0x808080);
        super.a(n, n2, f);
    }

    public List<sg_1> b() {
        return this.B;
    }

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.g) {
            if (qG.m == 2) {
                File file = mf_1.a(MCInvoker.D(this.t));
                String string = zq_2.j(file);
                if (Util.a() == a3t_0.OSX) {
                    try {
                        LoggerInvoker.info(x, string);
                        als_2.a(als_2.a(), new String[]{W7.h, string});
                        return;
                    }
                    catch (IOException iOException) {
                        LoggerInvoker.a(x, W7.a, iOException);
                    }
                } else if (Util.a() == a3t_0.WINDOWS) {
                    String string2 = StringInvoker.a(W7.e, new Object[]{string});
                    try {
                        als_2.a(als_2.a(), string2);
                        return;
                    }
                    catch (IOException iOException) {
                        LoggerInvoker.a(x, W7.i, iOException);
                    }
                }
                boolean bl = false;
                try {
                    Class clazz = ara_2.a(W7.l);
                    Object object = VT.a(ara_2.a(clazz, W7.n, new Class[0]), null, new Object[0]);
                    VT.a(ara_2.a(clazz, W7.c, new Class[]{URI.class}), object, new Object[]{zq_2.l(file)});
                }
                catch (Throwable throwable) {
                    LoggerInvoker.a(x, W7.d, throwable);
                    bl = true;
                }
                LoggerInvoker.info(x, W7.f);
                SysInvoker.a(aL0.a(aL0.a(new StringBuilder(), W7.b), string).toString());
            } else if (qG.m == 1) {
                if (this.v) {
                    Object object;
                    ArrayList arrayList = my_0.c();
                    Iterator iterator = ListInvoker.iterator(this.B);
                    while (dz_0.c(iterator)) {
                        object = (sg_1)dz_0.b(iterator);
                        if (!(object instanceof so_1)) continue;
                        ListInvoker.add(arrayList, asp_0.a((so_1)object));
                    }
                    asg_0.e(arrayList);
                    mf_1.a(MCInvoker.D(this.t), arrayList);
                    ListInvoker.clear(this.t.gameSettings.bg);
                    ListInvoker.clear(this.t.gameSettings.bY);
                    iterator = ListInvoker.iterator(arrayList);
                    while (dz_0.c(iterator)) {
                        object = (ResourcePackRepositoryEntry)dz_0.b(iterator);
                        ListInvoker.add(this.t.gameSettings.bg, ad6_0.e((ResourcePackRepositoryEntry)object));
                        if (ad6_0.c((ResourcePackRepositoryEntry)object) == 1) continue;
                        ListInvoker.add(this.t.gameSettings.bY, ad6_0.e((ResourcePackRepositoryEntry)object));
                    }
                    awu_1.c(this.t.gameSettings);
                    MCInvoker.w(this.t);
                }
                MCInvoker.displayGuiScreen(this.t, this.A);
            }
        }
    }

    @Override
    protected void a(int n, int n2, int n3) {
        super.a(n, n2, n3);
    }

    @Override
    public void l() {
        ListInvoker.add(this.l, new qe_0(2, this.n / 2 - 154, this.f - 48, I18n.format(W7.k, new Object[0])));
        ListInvoker.add(this.l, new qe_0(1, this.n / 2 + 4, this.f - 48, I18n.format(W7.m, new Object[0])));
        if (!this.v) {
            ResourcePackRepositoryEntry resourcePackRepositoryEntry2;
            this.z = my_0.c();
            this.B = my_0.c();
            ResourcePackRepository resourcePackRepository = MCInvoker.D(this.t);
            mf_1.d(resourcePackRepository);
            ArrayList arrayList = my_0.a((Iterable)mf_1.b(resourcePackRepository));
            ListInvoker.removeAll(arrayList, mf_1.f(resourcePackRepository));
            Iterator iterator = ListInvoker.iterator(arrayList);
            while (dz_0.c(iterator)) {
                resourcePackRepositoryEntry2 = (ResourcePackRepositoryEntry)dz_0.b(iterator);
                ListInvoker.add(this.z, new so_1(this, resourcePackRepositoryEntry2));
            }
            iterator = ListInvoker.iterator(my_0.a(mf_1.f(resourcePackRepository)));
            while (dz_0.c(iterator)) {
                resourcePackRepositoryEntry2 = (ResourcePackRepositoryEntry)dz_0.b(iterator);
                ListInvoker.add(this.B, new so_1(this, resourcePackRepositoryEntry2));
            }
            ListInvoker.add(this.B, new se_1(this));
        }
        this.y = new a8p_0(this.t, 200, this.f, this.z);
        aOY.a(this.y, this.n / 2 - 4 - 200);
        aOY.a(this.y, 7, 8);
        this.w = new a8W(this.t, 200, this.f, this.B);
        I0.a(this.w, this.n / 2 + 4);
        I0.a(this.w, 7, 8);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public List<sg_1> c() {
        return this.z;
    }

    public boolean b(sg_1 sg_12) {
        return ListInvoker.contains(this.B, sg_12);
    }
}

