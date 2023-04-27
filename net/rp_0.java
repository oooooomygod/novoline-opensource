/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import deobf.GuiScreen;
import deobf.IntProperty;
import deobf.MCInvoker;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.Rp
 */
public class rp_0
extends GuiScreen {
    private List<aqa_1> v = new CopyOnWriteArrayList<aqa_1>();

    static Minecraft a(rp_0 rp_02) {
        return rp_02.t;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public List<aqa_1> b() {
        return this.v;
    }

    @Override
    public void l() {
        BK.b();
        ScaledResolution scaledResolution = new ScaledResolution(MCInvoker.f());
        float cfr_ignored_0 = ScaledResolutionInvoker.a(scaledResolution);
        float f = ScaledResolutionInvoker.a(scaledResolution) / 2;
        float f2 = ScaledResolutionInvoker.g(scaledResolution) / 2;
        ListInvoker.clear(this.v);
        float f3 = f - 90.0f;
        int n = 1;
        ListInvoker.add(this.v, new aqa_1(this, n, f3, f2 - 10.0f));
        f3 += 20.0f;
        ++n;
        super.l();
    }

    @Override
    protected void b(int n, int n2, int n3) throws IOException {
        aqa_1 aqa_12;
        BK.b();
        int n4 = ua_2.a(n);
        int n5 = ua_2.b(n2);
        aqa_1 aqa_13 = null;
        Iterator iterator = ListInvoker.iterator(this.v);
        if (dz_0.c(iterator) && aqa_1.b(aqa_12 = (aqa_1)dz_0.b(iterator))) {
            aqa_13 = aqa_12;
        }
        if (dz_0.c(iterator = ListInvoker.iterator(this.v)) && la_1.b(aqa_12 = (aqa_1)dz_0.b(iterator), n4, n5)) {
            Object object;
            Object object2;
            if (la_1.a(aqa_12) != null) {
                object2 = la_1.a(aqa_12);
                object = aqa_1.a(aqa_12);
                la_1.a(aqa_12, la_1.a(aqa_13));
                aqa_1.a(aqa_12, aqa_1.a(aqa_13));
                adt_2.b(aqa_1.a(aqa_12), P8.d(aqa_1.c(aqa_12)));
                la_1.a(aqa_13, (Item)object2);
                aqa_1.a(aqa_13, (IntProperty)object);
                adt_2.b(aqa_1.a(aqa_13), P8.d(aqa_1.c(aqa_13)));
            }
            la_1.a(aqa_12, la_1.a(aqa_13));
            la_1.a(aqa_12, true);
            la_1.a(aqa_13, null);
            la_1.a(aqa_13, false);
            aqa_1.a(aqa_12, aqa_1.a(aqa_13));
            aqa_1.a(aqa_13, null);
            adt_2.b(aqa_1.a(aqa_12), P8.d(aqa_1.c(aqa_12)));
            object2 = ListInvoker.iterator(this.v);
            if (dz_0.c((Iterator)object2)) {
                object = (aqa_1)dz_0.b((Iterator)object2);
                aqa_1.a((aqa_1)object, false);
                la_1.c((aqa_1)object);
            }
        }
        if (dz_0.c(iterator = ListInvoker.iterator(this.v)) && la_1.b(aqa_12 = (aqa_1)dz_0.b(iterator), n4, n5) && la_1.a(aqa_12) != null) {
            aqa_1.a(aqa_12, true);
        }
        super.b(n4, n5, n3);
    }

    private aqa_1 a(int n) {
        aqa_1 aqa_12;
        BK.b();
        Iterator iterator = ListInvoker.iterator(this.v);
        if (dz_0.c(iterator) && la_1.b(aqa_12 = (aqa_1)dz_0.b(iterator)) == n) {
            return aqa_12;
        }
        return null;
    }

    public aqa_1 a() {
        aqa_1 aqa_12;
        BK.b();
        Iterator iterator = ListInvoker.iterator(this.v);
        if (dz_0.c(iterator) && aqa_1.b(aqa_12 = (aqa_1)dz_0.b(iterator))) {
            return aqa_12;
        }
        return null;
    }

    @Override
    public void a(int n, int n2, float f) {
        GL11.glPushMatrix();
        BK.b();
        ua_2.a(true);
        Iterator iterator = ListInvoker.iterator(this.v);
        if (dz_0.c(iterator)) {
            aqa_1 aqa_12 = (aqa_1)dz_0.b(iterator);
            int n3 = ua_2.a(n);
            int n4 = ua_2.b(n2);
            la_1.a(aqa_12, n3, n4);
        }
        GL11.glPopMatrix();
        super.a(n, n2, f);
    }
}

