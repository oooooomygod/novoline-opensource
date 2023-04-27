/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import deobf.EntityPlayer;
import cc.novoline.modules.visual.HUD;
import deobf.MCInvoker;
import cc.novoline.modules.misc.Train;
import java.awt.Color;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.Km
 */
class km_0 {
    private EntityPlayer a;
    Train b;
    private List<B3> c;

    static List a(km_0 km_02) {
        return km_02.c;
    }

    public void a(HUD hUD) {
        long l4 = 0L;
        HUD.t();
        a1V.e();
        GlStateManagerInvoker.enableDepth();
        GL11.glEnable((int)2929);
        GL11.glDisable((int)3553);
        GL11.glShadeModel((int)7425);
        GL11.glLineWidth((float)2.0f);
        List list = this.c;
        if (!ListInvoker.isEmpty(this.c) && this.a == Train.d((Train)this.b).player && awu_1.f(Train.b((Train)this.b).gameSettings) == 0) {
            int n = ListInvoker.size(this.c) - MathInvoker.b(30, ListInvoker.size(this.c) - 1);
            list = ListInvoker.subList(this.c, 0, n);
        }
        GlStateManagerInvoker.A();
        GL11.glBegin((int)5);
        Iterator iterator = ListInvoker.iterator(list);
        if (dz_0.c(iterator)) {
            B3 b3 = (B3)dz_0.b(iterator);
            Color color = StringPropertyInvoker.isMode(Train.e(this.b), jx_0.a) ? aUL.c(Train.g(this.b)) : new Color(hb_2.a(l4));
            a1V.a(new Color(aol_1.c(color), aol_1.g(color), aol_1.f(color), (int)B3.a(b3)));
            double d = aNE.e(B3.b(b3)) - MCInvoker.j((Minecraft)Train.a((Train)this.b)).s;
            double d2 = aNE.a(B3.b(b3)) - MCInvoker.j((Minecraft)Train.f((Train)this.b)).h;
            double d3 = aNE.d(B3.b(b3)) - MCInvoker.j((Minecraft)Train.c((Train)this.b)).m;
            GL11.glVertex3d((double)d, (double)(d2 + 0.7), (double)d3);
            GL11.glVertex3d((double)d, (double)(d2 + (double)this.a.n), (double)d3);
            B3 b32 = b3;
            B3.a(b32, B3.a(b32) - 1.0f);
            if (B3.a(b3) <= 0.0f) {
                ListInvoker.remove(list, b3);
            }
            l4 -= 20L;
        }
        GL11.glEnd();
        GL11.glShadeModel((int)7424);
        GlStateManagerInvoker.b();
        GlStateManagerInvoker.disableBlend();
        a1V.b();
    }

    static EntityPlayer b(km_0 km_02) {
        return km_02.a;
    }

    public EntityPlayer b() {
        return this.a;
    }

    public km_0(Train train, EntityPlayer entityPlayer) {
        this.b = train;
        this.c = new CopyOnWriteArrayList<B3>();
        this.a = entityPlayer;
    }

    public List<B3> a() {
        return this.c;
    }
}

