/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import deobf.Entity;
import net.N5;
import net.UW;
import net.a51;
import net.a5K;
import net.a5Y;
import net.aFU;
import net.acc_0;
import net.ay_2;
import net.ea_1;
import net.rr_1;
import net.ry_1;
import net.up_0;
import org.lwjgl.opengl.GL11;

public class r6
extends ry_1 {
    public float v;
    public a5Y B;
    public ay_2 s = new ay_2();
    public float x;
    public float u;
    public a5Y y;
    public ay_2 z;
    public a5Y t;
    public a5Y w;
    public float A;
    public ay_2 C = new ay_2();

    public r6(float f, float f2, int n, int n2) {
        this.z = new ay_2();
        this.b = n;
        this.e = n2;
        this.r = new a5K(this, 0, 0);
        up_0.a(this.r, -4.0f, -8.0f, -4.0f, 8, 8, 8, f);
        up_0.a(this.r, 0.0f, 0.0f + f2 - 12.0f, 0.0f);
        this.k = new a5K(this, 32, 0);
        up_0.a(this.k, -4.0f, -8.0f, -4.0f, 8, 8, 8, f + 0.5f);
        up_0.a(this.k, 0.0f, 0.0f, 0.0f);
        this.q = UW.a(new a5K(this, 16, 16), true);
        up_0.a(this.q, -4.0f, -12.0f, -2.0f, 8, 12, 4, f);
        up_0.a(this.q, 0.0f, 0.0f + f2 + 12.0f, 0.0f);
        this.h = aFU.b(new a51(this, 40, 16), (a5K)this.q);
        up_0.a(this.h, -3.0f, -2.0f, -2.0f, 4, 6, 4, f);
        up_0.a(this.h, -5.0f, 2.0f + f2 - 12.0f, 0.0f);
        this.j = aFU.b(new a51(this, 40, 16), (a5K)this.q);
        this.j.x = true;
        up_0.a(this.j, -1.0f, -2.0f, -2.0f, 4, 6, 4, f);
        up_0.a(this.j, 5.0f, 2.0f + f2 - 12.0f, 0.0f);
        this.l = new a5K(this, 0, 16);
        up_0.a(this.l, -2.0f, 0.0f, -2.0f, 4, 6, 4, f);
        up_0.a(this.l, -1.9f, 12.0f + f2, 0.0f);
        this.o = new a5K(this, 0, 16);
        this.o.x = true;
        up_0.a(this.o, -2.0f, 0.0f, -2.0f, 4, 6, 4, f);
        up_0.a(this.o, 1.9f, 12.0f + f2, 0.0f);
        this.y = new a5K(this, 40, 22);
        up_0.a(this.y, 0.0f, 0.0f, -4.0f, 4, 6, 4, f);
        up_0.a(this.y, -3.0f, 4.0f, 2.0f);
        N5.a(UW.b((a5K)this.y), this.y, 3, 0.0f, -6.0f);
        this.w = new a5K(this, 40, 22);
        this.w.x = true;
        up_0.a(this.w, 0.0f, 0.0f, -4.0f, 4, 6, 4, f);
        up_0.a(this.w, -1.0f, 4.0f, 2.0f);
        N5.a(UW.b((a5K)this.w), this.y, 3, 0.0f, -6.0f);
        this.B = new a5K(this, 0, 22);
        up_0.a(this.B, -2.0f, 0.0f, 0.0f, 4, 6, 4, f);
        up_0.a(this.B, 0.0f, 6.0f, -2.0f);
        N5.a(UW.b((a5K)this.B), this.B, 3, 0.0f, -6.0f);
        this.t = new a5K(this, 0, 22);
        this.t.x = true;
        up_0.a(this.t, -2.0f, 0.0f, 0.0f, 4, 6, 4, f);
        up_0.a(this.t, 0.0f, 6.0f, -2.0f);
        N5.a(UW.b((a5K)this.t), this.t, 3, 0.0f, -6.0f);
        up_0.a(this.q, this.r);
        up_0.a(this.q, this.h);
        up_0.a(this.q, this.j);
        up_0.a(this.r, this.k);
        up_0.a(this.h, this.y);
        up_0.a(this.j, this.w);
        up_0.a(this.l, this.B);
        up_0.a(this.o, this.t);
        aFU.a((a51)this.h, (a5K)this.y);
        aFU.a((a51)this.j, (a5K)this.w);
    }

    public void a(rr_1 rr_12) {
        a5K.e();
    }

    public r6(float f) {
        this(f, 0.0f, 64, 32);
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, Entity entity) {
    }

    @Override
    public void a(Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        ea_1.a(System.out, acc_0.a);
        a5K.c();
        this.a(f, f2, f3, f4, f5, f6, entity);
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
    }

    public r6() {
        this(0.0f);
    }
}

