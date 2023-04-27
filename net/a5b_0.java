/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import net.a5K;
import net.asj_0;
import net.q1_0;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.a5b
 */
public class a5b_0
extends a5K {
    a5K L;

    public a5b_0(q1_0 q1_02, int n, int n2) {
        super(q1_02, n, n2);
    }

    public a5b_0(q1_0 q1_02, String string) {
        super(q1_02, string);
    }

    @Override
    public void a(float f) {
        block7: {
            block6: {
                a5K.e();
                this.f(f);
                this.L.a(f);
                if (this.t != 0.0f || this.m != 0.0f || this.n != 0.0f) break block6;
                if (this.g == 0.0f && this.o == 0.0f && this.z == 0.0f) break block7;
                GL11.glTranslatef((float)(this.g * f), (float)(this.o * f), (float)(this.z * f));
                GL11.glRotatef((float)(-asj_0.a(this.H)), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)asj_0.c(this.H), (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)asj_0.b(this.H), (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScalef((float)this.I, (float)this.K, (float)this.A);
            }
            GL11.glTranslatef((float)(this.g * f), (float)(this.o * f), (float)(this.z * f));
            GL11.glRotatef((float)(-asj_0.a(this.H)), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)asj_0.c(this.H), (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)asj_0.b(this.H), (float)0.0f, (float)0.0f, (float)1.0f);
            if (this.n != 0.0f) {
                GL11.glRotatef((float)(this.n * 57.295776f), (float)0.0f, (float)0.0f, (float)1.0f);
            }
            if (this.m != 0.0f) {
                GL11.glRotatef((float)(this.m * 57.295776f), (float)0.0f, (float)1.0f, (float)0.0f);
            }
            if (this.t != 0.0f) {
                GL11.glRotatef((float)(this.t * 57.295776f), (float)1.0f, (float)0.0f, (float)0.0f);
            }
            GL11.glScalef((float)this.I, (float)this.K, (float)this.A);
        }
    }

    public a5b_0(q1_0 q1_02) {
        super(q1_02);
    }

    public a5b_0 a(a5K a5K2) {
        this.L = a5K2;
        return this;
    }
}

