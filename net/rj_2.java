/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.client.entity.AbstractClientPlayer;
import deobf.Entity;
import deobf.MCInvoker;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.rj
 */
public class rj_2
extends ry_1 {
    public a5K A;
    public float C;
    public a5K F;
    public float t;
    public a5K s;
    public a5K E;
    public ay_2 B;
    public ay_2 w;
    public float y;
    public a5K D;
    public ay_2 v;
    public float z;
    public aQ2 x;
    public a5K u;

    @Override
    public void a(Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        rr_1.b();
        this.a(f, f2, f3, f4, f5, f6, entity);
        GL11.glPushMatrix();
        if (this.g) {
            float f7 = 2.0f;
            GL11.glPushMatrix();
            GL11.glScalef((float)(1.5f / f7), (float)(1.5f / f7), (float)(1.5f / f7));
            GL11.glTranslatef((float)0.0f, (float)(16.0f * f6), (float)0.0f);
            up_0.b(this.r, f6);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef((float)(1.0f / f7), (float)(1.0f / f7), (float)(1.0f / f7));
            GL11.glTranslatef((float)0.0f, (float)(24.0f * f6), (float)0.0f);
            up_0.b(this.q, f6);
            up_0.b(this.h, f6);
            up_0.b(this.j, f6);
            up_0.b(this.l, f6);
            up_0.b(this.o, f6);
            up_0.b(this.k, f6);
            GL11.glPopMatrix();
        }
        up_0.b(this.q, f6);
        up_0.b(this.l, f6);
        up_0.b(this.o, f6);
        GL11.glPushMatrix();
        this.q.a(f6);
        up_0.b(this.r, f6);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }

    public void d(float f) {
        GlStateManagerInvoker.translate(this.B.e.x * f, -this.B.e.y * f, this.B.e.z * f);
    }

    public rj_2(float f) {
        rr_1.b();
        super(f);
        this.B = new ay_2();
        this.v = new ay_2();
        this.w = new ay_2();
        this.x = new aQ2();
        this.b = 64;
        this.e = 32;
        this.s = new a5K(this, 24, 0);
        UW.a(this.s, -3.0f, -6.0f, -1.0f, 6, 6, 1, f);
        this.E = new a5K(this, 0, 0);
        UW.a(this.E, 64, 32);
        UW.a(this.E, -5.0f, 0.0f, -1.0f, 10, 16, 1, f);
        this.r = UW.a(new a5K(this, 0, 0), true);
        up_0.a(this.r, -4.0f, -8.0f, -4.0f, 8, 8, 8, f);
        up_0.a(this.r, 0.0f, -12.0f, 0.0f);
        this.k = new a5K(this, 32, 0);
        up_0.a(this.k, -4.0f, -8.0f, -4.0f, 8, 8, 8, f + 0.5f);
        up_0.a(this.k, 0.0f, 0.0f, 0.0f);
        this.q = new a5K(this, 16, 16);
        up_0.a(this.q, -4.0f, -12.0f, -2.0f, 8, 12, 4, f);
        up_0.a(this.q, 0.0f, 12.0f, 0.0f);
        this.j = aFU.a(aFU.b(new a51(this, 40, 16), (a5K)this.q), true);
        up_0.a(this.j, -1.0f, -2.0f, -2.0f, 4, 6, 4, f);
        up_0.a(this.j, 5.0f, -10.0f, 0.0f);
        this.j.x = true;
        this.h = aFU.a(aFU.b(new a51(this, 40, 16), (a5K)this.q), true);
        up_0.a(this.h, -3.0f, -2.0f, -2.0f, 4, 6, 4, f);
        up_0.a(this.h, -5.0f, -10.0f, 0.0f);
        UW.a(UW.b(UW.d((a5K)this.h, -0.01f, 0.0f, -0.01f), 4.02f, 6.0f, 4.02f));
        UW.a(UW.b(UW.d((a5K)this.j, -0.01f, 0.0f, -0.01f), 4.02f, 6.0f, 4.02f));
        this.u = new a5K(this, 40, 22);
        UW.a(this.u, -1.0f, 0.0f, -4.0f, 4, 6, 4, f);
        UW.a(this.u, 0.0f, 4.0f, 2.0f);
        this.u.x = true;
        N5.a(UW.b(this.u), this.u, 3, 0.0f, -6.0f);
        this.A = new a5K(this, 40, 22);
        UW.a(this.A, -3.0f, 0.0f, -4.0f, 4, 6, 4, f);
        UW.a(this.A, 0.0f, 4.0f, 2.0f);
        N5.a(UW.b(this.A), this.A, 3, 0.0f, -6.0f);
        this.l = new a5K(this, 0, 16);
        up_0.a(this.l, -2.0f, 0.0f, -2.0f, 4, 6, 4, f);
        up_0.a(this.l, -1.9f, 12.0f, 0.0f);
        this.o = new a5K(this, 0, 16);
        this.o.x = true;
        up_0.a(this.o, -2.0f, 0.0f, -2.0f, 4, 6, 4, f);
        up_0.a(this.o, 1.9f, 12.0f, 0.0f);
        this.D = new a5K(this, 0, 22);
        UW.a(this.D, -2.0f, 0.0f, 0.0f, 4, 6, 4, f);
        UW.a(this.D, 0.0f, 6.0f, -2.0f);
        N5.a(UW.b(this.D), this.D, 3, 0.0f, -6.0f);
        this.F = new a5K(this, 0, 22);
        this.F.x = true;
        UW.a(this.F, -2.0f, 0.0f, 0.0f, 4, 6, 4, f);
        UW.a(this.F, 0.0f, 6.0f, -2.0f);
        N5.a(UW.b(this.F), this.F, 3, 0.0f, -6.0f);
        up_0.a(this.q, this.h);
        up_0.a(this.q, this.j);
        up_0.a(this.r, this.k);
        up_0.a(this.h, this.A);
        up_0.a(this.j, this.u);
        up_0.a(this.l, this.D);
        up_0.a(this.o, this.F);
        aFU.a((a51)this.h, this.A);
        aFU.a((a51)this.j, this.u);
        UW.a(UW.b(UW.d((a5K)this.l, -0.01f, 0.0f, -0.01f), 4.02f, 6.0f, 4.02f));
        UW.a(UW.b(UW.d((a5K)this.o, -0.01f, 0.0f, -0.01f), 4.02f, 6.0f, 4.02f));
        if (ListInvoker.b() != null) {
            rr_1.b(new ListInvoker[2]);
        }
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, Entity entity) {
        rr_1.b();
        if (MCInvoker.f().world == null) {
            return;
        }
        if (MCInvoker.f().world.isRemote && MCInvoker.G(MCInvoker.f())) {
            return;
        }
        atJ atJ2 = s6_0.a(ayj_0.B(entity));
        this.z = f;
        this.y = f2;
        this.C = f5;
        this.t = f4;
        if (MCInvoker.f().currentScreen != null) {
            this.t = 0.0f;
        }
        UW.a((a5K)this.r, atJ2.w);
        UW.a((a5K)this.k, atJ2.y);
        UW.a((a5K)this.q, atJ2.M);
        UW.a((a5K)this.h, atJ2.L);
        UW.a((a5K)this.j, atJ2.v);
        UW.a((a5K)this.l, atJ2.G);
        UW.a((a5K)this.o, atJ2.E);
        UW.a(this.A, atJ2.s);
        UW.a(this.u, atJ2.x);
        UW.a(this.D, atJ2.D);
        UW.a(this.F, atJ2.F);
        asj_0.a(this.B, atJ2.B);
        asj_0.a(this.v, atJ2.A);
        asj_0.a(this.w, atJ2.H);
        this.x = atJ2.J;
    }

    public void b(float f) {
        GlStateManagerInvoker.translate(this.B.e.x * f, -this.B.e.y * f, this.B.e.z * f);
        GlStateManagerInvoker.b(asj_0.c(this.v), 1.0f, 0.0f, 0.0f);
        GlStateManagerInvoker.b(asj_0.a(this.v), 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.b(asj_0.b(this.v), 0.0f, 0.0f, 1.0f);
    }

    public void a(AbstractClientPlayer abstractClientPlayer) {
        rr_1.b();
        atJ atJ2 = s6_0.a(aUi.c(abstractClientPlayer));
        asj_0.a(this.B, atJ2.B);
        asj_0.a(this.v, atJ2.A);
        asj_0.a(this.w, atJ2.H);
    }

    public void c(float f) {
        GlStateManagerInvoker.b(asj_0.c(this.v), 1.0f, 0.0f, 0.0f);
        GlStateManagerInvoker.b(asj_0.a(this.v), 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.b(asj_0.b(this.v), 0.0f, 0.0f, 1.0f);
    }
}

