/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.utils.Timer;
import deobf.TimerUtil;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.ax4
 */
public class ax4_0 {
    private boolean b;
    private double c;
    private boolean a;
    private Timer d = new Timer();
    private double e;

    public boolean d() {
        return this.a;
    }

    public double c() {
        return this.c;
    }

    public void a(double d, double d2, double d3, Runnable runnable, long l4) {
        block4: {
            block5: {
                block2: {
                    block3: {
                        TimerUtil.e();
                        if (!this.a) break block2;
                        if (!this.b) break block3;
                        this.c = 1.0 + abl_1.a(this.d, l4, d3);
                        if (!(this.c >= 1.0 + d3)) break block4;
                        abl_1.b(this.d);
                        this.b = false;
                    }
                    this.c = 1.0 + d3 - abl_1.a(this.d, l4, 1.0 + d3);
                }
                if (!this.b) break block5;
                this.c = this.e + abl_1.a(this.d, l4, 1.0 + d3 - this.e);
                if (!(this.c >= 1.0 + d3)) break block4;
                abl_1.b(this.d);
                this.b = false;
            }
            this.c = 1.0 + d3 - abl_1.a(this.d, l4, d3);
        }
        GL11.glPushMatrix();
        GL11.glTranslated((double)d, (double)d2, (double)0.0);
        GL11.glScaled((double)this.c, (double)this.c, (double)1.0);
        GL11.glTranslated((double)(-d), (double)(-d2), (double)0.0);
        sj_1.a(runnable);
        GL11.glPopMatrix();
    }

    public void a() {
        abl_1.b(this.d);
        this.b = true;
        this.a = true;
    }

    public boolean b() {
        return this.b;
    }

    public void b(double d) {
        this.c = d;
    }

    public void a(double d, double d2, double d3, Runnable runnable, long l4, long l5) {
        block4: {
            block5: {
                block2: {
                    block3: {
                        TimerUtil.e();
                        if (!this.a) break block2;
                        if (!this.b) break block3;
                        this.c = 1.0 + abl_1.a(this.d, l5, d3);
                        if (!(this.c >= 1.0 + d3)) break block4;
                        abl_1.b(this.d);
                        this.b = false;
                    }
                    this.c = 1.0 + d3 - abl_1.a(this.d, l5, 1.0 + d3);
                }
                if (!this.b) break block5;
                this.c = this.e + abl_1.a(this.d, l4, 1.0 + d3 - this.e);
                if (!(this.c >= 1.0 + d3)) break block4;
                abl_1.b(this.d);
                this.b = false;
            }
            this.c = 1.0 + d3 - abl_1.a(this.d, l4, d3);
        }
        GL11.glPushMatrix();
        GL11.glTranslated((double)d, (double)d2, (double)0.0);
        GL11.glScaled((double)this.c, (double)this.c, (double)1.0);
        GL11.glTranslated((double)(-d), (double)(-d2), (double)0.0);
        sj_1.a(runnable);
        GL11.glPopMatrix();
    }

    public void a(double d) {
        abl_1.b(this.d);
        this.e = d;
        this.c = d;
        this.b = true;
        this.a = false;
    }
}

