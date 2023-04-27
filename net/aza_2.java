/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.Entity;
import deobf.MCInvoker;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.aza
 */
public class aza_2 {
    private boolean g = false;
    private double e = 0.0;
    private Minecraft d;
    private boolean i = false;
    private double a = 0.0;
    private int j = 0;
    int c;
    private double b = 0.0;
    float f;
    private int h = -1;

    public void d() {
        GL11.glEndList();
        this.j = this.c;
        this.e = MCInvoker.v((Minecraft)this.d).prevPosX;
        this.a = MCInvoker.v((Minecraft)this.d).prevPosY;
        this.b = MCInvoker.v((Minecraft)this.d).prevPosZ;
        this.i = true;
        GlStateManagerInvoker.e();
    }

    public void c() {
        aP2.b();
        Entity entity = MCInvoker.v(this.d);
        double d = entity.prevPosX + (entity.posX - entity.prevPosX) * (double)this.f;
        double d2 = entity.prevPosY + (entity.posY - entity.prevPosY) * (double)this.f;
        double d3 = entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double)this.f;
        double d4 = (float)(this.c - this.j) + this.f;
        float f = (float)(d - this.e + d4 * 0.03);
        float f2 = (float)(d2 - this.a);
        float f3 = (float)(d3 - this.b);
        GlStateManagerInvoker.pushMatrix();
        if (this.g) {
            GlStateManagerInvoker.translate(-f / 12.0f, -f2, -f3 / 12.0f);
        }
        GlStateManagerInvoker.translate(-f, -f2, -f3);
        GlStateManagerInvoker.i(this.h);
        GlStateManagerInvoker.popMatrix();
        GlStateManagerInvoker.e();
    }

    public void a(boolean bl, int n, float f) {
        aP2.b();
        if (this.g != bl) {
            this.i = false;
        }
        this.g = bl;
        this.c = n;
        this.f = f;
    }

    public boolean a() {
        aP2.b();
        if (!this.i) {
            return true;
        }
        if (this.c >= this.j + 20) {
            return true;
        }
        Entity entity = MCInvoker.v(this.d);
        boolean bl = this.a + (double)ayj_0.n(entity) < 128.0 + (double)(this.d.gameSettings.bt * 128.0f);
        boolean bl2 = entity.prevPosY + (double)ayj_0.n(entity) < 128.0 + (double)(this.d.gameSettings.bt * 128.0f);
        return false;
    }

    public aza_2(Minecraft minecraft) {
        this.d = minecraft;
        this.h = N4.b(1);
    }

    public void e() {
        this.i = false;
    }

    public void b() {
        GL11.glNewList((int)this.h, (int)4864);
    }
}

