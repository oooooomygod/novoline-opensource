/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.Entity;
import deobf.MCInvoker;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.mi
 */
public class mi_1
extends Entity {
    protected float av;
    protected float an;
    protected float ar;
    protected KM ak;
    protected int am;
    protected float au;
    protected int ay;
    protected float al;
    public static double aw;
    public static double ap;
    protected int as;
    protected float at;
    protected float aq = 1.0f;
    protected int ax;
    public static double aj;
    protected float ao;

    public float c() {
        return this.aq;
    }

    public float b() {
        return this.av;
    }

    public void a(WorldRenderer worldRenderer, Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = (float)this.ax / 16.0f;
        float f8 = f7 + 0.0624375f;
        float f9 = (float)this.as / 16.0f;
        float f10 = f9 + 0.0624375f;
        float f11 = 0.1f * this.au;
        if (this.ak != null) {
            f7 = qg_2.a(this.ak);
            f8 = qg_2.m(this.ak);
            f9 = qg_2.f(this.ak);
            f10 = qg_2.k(this.ak);
        }
        float f12 = (float)(this.prevPosX + (this.posX - this.prevPosX) * (double)f - aj);
        float f13 = (float)(this.prevPosY + (this.posY - this.prevPosY) * (double)f - ap);
        float f14 = (float)(this.prevPosZ + (this.posZ - this.prevPosZ) * (double)f - aw);
        int n = aLF.d() ? 0xF000F0 : this.d(f);
        int n2 = n >> 16 & 0xFFFF;
        int n3 = n & 0xFFFF;
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f12 - f2 * f11 - f5 * f11, f13 - f3 * f11, f14 - f4 * f11 - f6 * f11), f8, f10), this.an, this.ao, this.av, this.aq), n2, n3));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f12 - f2 * f11 + f5 * f11, f13 + f3 * f11, f14 - f4 * f11 + f6 * f11), f8, f9), this.an, this.ao, this.av, this.aq), n2, n3));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f12 + f2 * f11 + f5 * f11, f13 + f3 * f11, f14 + f4 * f11 + f6 * f11), f7, f9), this.an, this.ao, this.av, this.aq), n2, n3));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f12 + f2 * f11 - f5 * f11, f13 - f3 * f11, f14 + f4 * f11 - f6 * f11), f7, f10), this.an, this.ao, this.av, this.aq), n2, n3));
    }

    public float d() {
        return this.ao;
    }

    @Override
    public boolean aB() {
        return false;
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
    }

    @Override
    protected void g() {
    }

    @Override
    protected boolean p() {
        return false;
    }

    public void a() {
        ++this.ax;
    }

    public float e() {
        return this.an;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    public void c(int n) {
        if (this.f() != 0) {
            throw new RuntimeException(s4_0.e);
        }
        this.ax = n % 16;
        this.as = n / 16;
    }

    @Override
    public String toString() {
        return aL0.c(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), ara_2.k(this.getClass())), s4_0.g), this.posX), s4_0.b), this.posY), s4_0.c), this.posZ), s4_0.f), this.an), s4_0.a), this.ao), s4_0.j), this.av), s4_0.d), this.aq), s4_0.i), this.ay).toString();
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
    }

    protected mi_1(World world, double d, double d2, double d3) {
        super(world);
        this.c(0.2f, 0.2f);
        this.j(d, d2, d3);
        this.lastTickPosX = this.prevPosX = d;
        this.lastTickPosY = this.prevPosY = d2;
        this.lastTickPosZ = this.prevPosZ = d3;
        this.av = 1.0f;
        this.ao = 1.0f;
        this.an = 1.0f;
        this.at = a5_0.e(this.Q) * 3.0f;
        this.al = a5_0.e(this.Q) * 3.0f;
        this.au = (a5_0.e(this.Q) * 0.5f + 0.5f) * 2.0f;
        this.am = (int)(4.0f / (a5_0.e(this.Q) * 0.9f + 0.1f));
        this.ay = 0;
    }

    public void c(float f) {
        if (this.aq == 1.0f && f < 1.0f) {
            ayx_2.b(MCInvoker.f().effectRenderer, this);
        } else if (this.aq < 1.0f && f == 1.0f) {
            ayx_2.c(MCInvoker.f().effectRenderer, this);
        }
        this.aq = f;
    }

    public mi_1 a(float f) {
        this.c(0.2f * f, 0.2f * f);
        this.au *= f;
        return this;
    }

    public mi_1 b(float f) {
        this.motionX *= (double)f;
        this.motionY = (this.motionY - (double)0.1f) * (double)f + (double)0.1f;
        this.motionZ *= (double)f;
        return this;
    }

    public mi_1(World world, double d, double d2, double d3, double d4, double d5, double d6) {
        this(world, d, d2, d3);
        this.motionX = d4 + (MathInvoker.a() * 2.0 - 1.0) * (double)0.4f;
        this.motionY = d5 + (MathInvoker.a() * 2.0 - 1.0) * (double)0.4f;
        this.motionZ = d6 + (MathInvoker.a() * 2.0 - 1.0) * (double)0.4f;
        float f = (float)(MathInvoker.a() + MathInvoker.a() + 1.0) * 0.15f;
        float f2 = MathHelper.e(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
        this.motionX = this.motionX / (double)f2 * (double)f * (double)0.4f;
        this.motionY = this.motionY / (double)f2 * (double)f * (double)0.4f + (double)0.1f;
        this.motionZ = this.motionZ / (double)f2 * (double)f * (double)0.4f;
    }

    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        if (this.ay++ >= this.am) {
            this.E();
        }
        this.motionY -= 0.04 * (double)this.ar;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.motionX *= (double)0.98f;
        this.motionY *= (double)0.98f;
        this.motionZ *= (double)0.98f;
        if (this.onGround) {
            this.motionX *= (double)0.7f;
            this.motionZ *= (double)0.7f;
        }
    }

    public int f() {
        return 0;
    }

    public void a(KM kM) {
        int n = this.f();
        if (n == 1) {
            this.ak = kM;
            return;
        }
        throw new RuntimeException(s4_0.h);
    }

    public void b(float f, float f2, float f3) {
        this.an = f;
        this.ao = f2;
        this.av = f3;
    }
}

