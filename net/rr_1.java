/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.vector.Vector3f
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.client.entity.AbstractClientPlayer;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.MCInvoker;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.rr
 */
public class rr_1
extends rv_0 {
    private a5Y P;
    public a5K M;
    public ay_2 S;
    private boolean C;
    private a5Y K;
    private static ListInvoker[] O;
    public float R;
    public a5K T;
    public aQ2 N;
    public float I;
    public ay_2 Q;
    public a5K D;
    public a5K H;
    public a5K G;
    public a5K E;
    public ay_2 A;
    public float J;
    public a5K B;
    public float F;
    public a5K L;

    public static ListInvoker[] b() {
        return O;
    }

    static {
        if (rr_1.b() != null) {
            rr_1.b(new ListInvoker[3]);
        }
    }

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
        GL11.glPopMatrix();
    }

    public static void b(ListInvoker[] listInvokerArray) {
        O = listInvokerArray;
    }

    public void a(AbstractClientPlayer abstractClientPlayer) {
        rr_1.b();
        atJ atJ2 = s6_0.a(aUi.c(abstractClientPlayer));
        asj_0.a(this.S, atJ2.B);
        asj_0.a(this.Q, atJ2.A);
        asj_0.a(this.A, atJ2.H);
    }

    @Override
    public void a(float f) {
        rr_1.b();
        if (this.C) {
            this.h.g += 1.0f;
            this.h.a(f);
            this.h.g -= 1.0f;
        }
        this.h.a(f);
    }

    public void e(float f) {
        GlStateManagerInvoker.translate(this.S.e.x * f, -this.S.e.y * f, this.S.e.z * f);
        GlStateManagerInvoker.b(asj_0.c(this.Q), 1.0f, 0.0f, 0.0f);
        GlStateManagerInvoker.b(asj_0.a(this.Q), 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.b(asj_0.b(this.Q), 0.0f, 0.0f, 1.0f);
    }

    public void d(float f) {
        GlStateManagerInvoker.b(asj_0.c(this.Q), 1.0f, 0.0f, 0.0f);
        GlStateManagerInvoker.b(asj_0.a(this.Q), 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.b(asj_0.b(this.Q), 0.0f, 0.0f, 1.0f);
    }

    public rr_1(float f, boolean bl) {
        this(f, bl, true);
    }

    public rr_1(float f, boolean bl, boolean bl2) {
        super(f, bl);
        rr_1.b();
        this.S = new ay_2();
        this.Q = new ay_2();
        this.A = new ay_2();
        this.N = new aQ2();
        this.b = 64;
        this.e = bl2 ? 64 : 32;
        this.C = bl;
        this.P = new a5K(this, 24, 0);
        up_0.a(this.P, -3.0f, -6.0f, -1.0f, 6, 6, 1, f);
        this.K = new a5K(this, 0, 0);
        up_0.a(this.K, 64, 32);
        up_0.a(this.K, -5.0f, 0.0f, -1.0f, 10, 16, 1, f);
        this.k = new a5K(this, 32, 0);
        up_0.a(this.k, -4.0f, -8.0f, -4.0f, 8, 8, 8, f + 0.5f);
        up_0.a(this.k, 0.0f, 0.0f, 0.0f);
        this.q = new a5K(this, 16, 16);
        up_0.a(this.q, -4.0f, -12.0f, -2.0f, 8, 12, 4, f);
        up_0.a(this.q, 0.0f, 12.0f, 0.0f);
        this.r = UW.a(new a5K(this, 0, 0), true);
        up_0.a(this.r, -4.0f, -8.0f, -4.0f, 8, 8, 8, f);
        up_0.a(this.r, 0.0f, -12.0f, 0.0f);
        this.j = aFU.a(aFU.b(new a51(this, 32, 48), (a5K)this.q), true);
        up_0.a(this.j, -1.0f, -2.0f, -2.0f, 3, 6, 4, f);
        up_0.a(this.j, 5.0f, -9.5f, 0.0f);
        this.h = aFU.a(aFU.b(new a51(this, 40, 16), (a5K)this.q), true);
        up_0.a(this.h, -2.0f, -2.0f, -2.0f, 3, 6, 4, f);
        up_0.a(this.h, -5.0f, -9.5f, 0.0f);
        this.y = new a5K(this, 48, 48);
        up_0.a(this.y, -1.0f, -2.0f, -2.0f, 3, 6, 4, f + 0.25f);
        UW.b((a5K)((a5K)this.y)).C -= 0.25f;
        N5.a(UW.b((a5K)this.y), this.y);
        up_0.a(this.y, 0.0f, 0.0f, 0.0f);
        this.w = new a5K(this, 40, 32);
        up_0.a(this.w, -2.0f, -2.0f, -2.0f, 3, 6, 4, f + 0.25f);
        UW.b((a5K)((a5K)this.w)).C -= 0.25f;
        N5.a(UW.b((a5K)this.w), this.w);
        up_0.a(this.w, 0.0f, 0.0f, 0.0f);
        UW.a(UW.b(UW.d((a5K)this.h, -0.01f, 0.0f, -0.01f), 3.02f, 6.0f, 4.02f));
        UW.a(UW.b(UW.d((a5K)this.j, -0.01f, 0.0f, -0.01f), 3.02f, 6.0f, 4.02f));
        this.L = new a5K(this, 32, 54);
        UW.a(this.L, -1.0f, 0.0f, -4.0f, 3, 6, 4, f);
        UW.a(this.L, 0.0f, 4.0f, 2.0f);
        N5.a(UW.b(this.L), this.L, 3, 0.0f, -6.0f);
        this.E = new a5K(this, 40, 22);
        UW.a(this.E, -2.0f, 0.0f, -4.0f, 3, 6, 4, f);
        UW.a(this.E, 0.0f, 4.0f, 2.0f);
        N5.a(UW.b(this.E), this.E, 3, 0.0f, -6.0f);
        this.H = new a5K(this, 48, 54);
        UW.a(this.H, -1.0f, 0.0f, -4.0f, 3, 6, 4, f + 0.25f);
        UW.b((a5K)this.H).C -= 0.25f;
        UW.b((a5K)this.H).s += 0.25f;
        N5.a(UW.b(this.H), this.H);
        UW.a(this.H, 0.0f, 0.0f, 0.0f);
        N5.a(UW.b(this.H), this.H, 3, 0.0f, -6.0f);
        this.T = new a5K(this, 40, 38);
        UW.a(this.T, -2.0f, 0.0f, -4.0f, 3, 6, 4, f + 0.25f);
        UW.b((a5K)this.T).C -= 0.25f;
        UW.b((a5K)this.T).s += 0.25f;
        N5.a(UW.b(this.T), this.T);
        UW.a(this.T, 0.0f, 0.0f, 0.0f);
        N5.a(UW.b(this.T), this.T, 3, 0.0f, -6.0f);
        ListInvoker.b(new ListInvoker[2]);
        this.j = aFU.a(aFU.b(new a51(this, 32, 48), (a5K)this.q), true);
        up_0.a(this.j, -1.0f, -2.0f, -2.0f, 4, 6, 4, f);
        up_0.a(this.j, 5.0f, -10.0f, 0.0f);
        this.h = aFU.a(aFU.b(new a51(this, 40, 16), (a5K)this.q), true);
        up_0.a(this.h, -3.0f, -2.0f, -2.0f, 4, 6, 4, f);
        up_0.a(this.h, -5.0f, -10.0f, 0.0f);
        this.y = new a5K(this, 48, 48);
        up_0.a(this.y, -1.0f, -2.0f, -2.0f, 4, 6, 4, f + 0.25f);
        UW.b((a5K)((a5K)this.y)).C -= 0.25f;
        N5.a(UW.b((a5K)this.y), this.y);
        up_0.a(this.y, 0.0f, 0.0f, 0.0f);
        this.w = new a5K(this, 40, 32);
        up_0.a(this.w, -3.0f, -2.0f, -2.0f, 4, 6, 4, f + 0.25f);
        up_0.a(this.w, 0.0f, 0.0f, 0.0f);
        UW.a(UW.b(UW.d((a5K)this.h, -0.01f, 0.0f, -0.01f), 4.02f, 6.0f, 4.02f));
        UW.a(UW.b(UW.d((a5K)this.j, -0.01f, 0.0f, -0.01f), 4.02f, 6.0f, 4.02f));
        this.L = new a5K(this, 32, 54);
        UW.a(this.L, -1.0f, 0.0f, -4.0f, 4, 6, 4, f);
        UW.a(this.L, 0.0f, 4.0f, 2.0f);
        N5.a(UW.b(this.L), this.L, 3, 0.0f, -6.0f);
        this.E = new a5K(this, 40, 22);
        UW.a(this.E, -3.0f, 0.0f, -4.0f, 4, 6, 4, f);
        UW.a(this.E, 0.0f, 4.0f, 2.0f);
        N5.a(UW.b(this.E), this.E, 3, 0.0f, -6.0f);
        this.H = new a5K(this, 48, 54);
        UW.a(this.H, -1.0f, 0.0f, -4.0f, 4, 6, 4, f + 0.25f);
        UW.b((a5K)this.H).C -= 0.25f;
        UW.b((a5K)this.H).s += 0.25f;
        N5.a(UW.b(this.H), this.H);
        UW.a(this.H, 0.0f, 0.0f, 0.0f);
        N5.a(UW.b(this.H), this.H, 3, 0.0f, -6.0f);
        this.T = new a5K(this, 40, 38);
        UW.a(this.T, -3.0f, 0.0f, -4.0f, 4, 6, 4, f + 0.25f);
        UW.a(this.T, 0.0f, 0.0f, 0.0f);
        N5.a(UW.b(this.T), this.T, 3, 0.0f, -6.0f);
        this.l = new a5K(this, 0, 16);
        up_0.a(this.l, -2.0f, 0.0f, -2.0f, 4, 6, 4, f);
        up_0.a(this.l, -1.9f, 12.0f, 0.0f);
        this.o = new a5K(this, 16, 48);
        up_0.a(this.o, -2.0f, 0.0f, -2.0f, 4, 6, 4, f);
        up_0.a(this.o, 1.9f, 12.0f, 0.0f);
        this.x = new a5K(this, 0, 48);
        up_0.a(this.x, -2.0f, 0.0f, -2.0f, 4, 6, 4, f + 0.25f);
        UW.b((a5K)((a5K)this.x)).C -= 0.25f;
        N5.a(UW.b((a5K)this.x), this.x);
        up_0.a(this.x, 0.0f, 0.0f, 0.0f);
        this.s = new a5K(this, 0, 32);
        up_0.a(this.s, -2.0f, 0.0f, -2.0f, 4, 6, 4, f + 0.25f);
        UW.b((a5K)((a5K)this.s)).C -= 0.25f;
        N5.a(UW.b((a5K)this.s), this.s);
        up_0.a(this.s, 0.0f, 0.0f, 0.0f);
        this.z = new a5K(this, 16, 32);
        up_0.a(this.z, -4.0f, -12.0f, -2.0f, 8, 12, 4, f + 0.25f);
        up_0.a(this.z, 0.0f, 0.0f, 0.0f);
        this.M = new a5K(this, 0, 22);
        UW.a(this.M, -2.0f, 0.0f, 0.0f, 4, 6, 4, f);
        UW.a(this.M, 0.0f, 6.0f, -2.0f);
        N5.a(UW.b(this.M), this.M, 3, 0.0f, -6.0f);
        this.B = new a5K(this, 16, 54);
        UW.a(this.B, -2.0f, 0.0f, 0.0f, 4, 6, 4, f);
        UW.a(this.B, 0.0f, 6.0f, -2.0f);
        N5.a(UW.b(this.B), this.B, 3, 0.0f, -6.0f);
        this.D = new a5K(this, 0, 38);
        UW.a(this.D, -2.0f, 0.0f, 0.0f, 4, 6, 4, f + 0.25f);
        UW.b((a5K)this.D).C -= 0.25f;
        UW.b((a5K)this.D).s += 0.25f;
        N5.a(UW.b(this.D), this.D);
        UW.a(this.D, 0.0f, 0.0f, 0.0f);
        N5.a(UW.b(this.D), this.D, 3, 0.0f, -6.0f);
        this.G = new a5K(this, 0, 54);
        UW.a(this.G, -2.0f, 0.0f, 0.0f, 4, 6, 4, f + 0.25f);
        UW.b((a5K)this.G).C -= 0.25f;
        UW.b((a5K)this.G).s += 0.25f;
        N5.a(UW.b(this.G), this.G);
        UW.a(this.G, 0.0f, 0.0f, 0.0f);
        N5.a(UW.b(this.G), this.G, 3, 0.0f, -6.0f);
        up_0.a(this.q, this.h);
        up_0.a(this.q, this.j);
        up_0.a(this.q, this.r);
        up_0.a(this.q, this.z);
        up_0.a(this.r, this.k);
        up_0.a(this.h, this.E);
        up_0.a(this.j, this.L);
        up_0.a(this.h, this.w);
        up_0.a(this.j, this.y);
        UW.a(this.E, (a5Y)this.T);
        UW.a(this.L, (a5Y)this.H);
        up_0.a(this.l, this.M);
        up_0.a(this.o, this.B);
        up_0.a(this.l, this.s);
        up_0.a(this.o, this.x);
        UW.a(this.M, (a5Y)this.D);
        UW.a(this.B, (a5Y)this.G);
        aFU.a((a51)this.h, this.E);
        aFU.a((a51)this.j, this.L);
        UW.a(UW.b(UW.d((a5K)this.l, -0.01f, 0.0f, -0.01f), 4.02f, 6.0f, 4.02f));
        UW.a(UW.b(UW.d((a5K)this.o, -0.01f, 0.0f, -0.01f), 4.02f, 6.0f, 4.02f));
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
        this.I = f;
        this.R = f2;
        this.F = f5;
        this.J = f4;
        if (MCInvoker.f().currentScreen != null) {
            this.J = 0.0f;
        }
        UW.a((a5K)this.r, atJ2.w);
        UW.a((a5K)this.k, atJ2.y);
        UW.a((a5K)this.q, atJ2.M);
        UW.a((a5K)this.h, atJ2.L);
        UW.a((a5K)this.j, atJ2.v);
        UW.a((a5K)this.l, atJ2.G);
        UW.a((a5K)this.o, atJ2.E);
        UW.a(this.E, atJ2.s);
        UW.a(this.L, atJ2.x);
        UW.a(this.M, atJ2.D);
        UW.a(this.B, atJ2.F);
        asj_0.a(this.S, atJ2.B);
        asj_0.a(this.Q, atJ2.A);
        asj_0.a(this.A, atJ2.H);
        this.N = atJ2.J;
        if (s6_0.a(s6_0.a(ayj_0.B(entity)))) {
            asj_0.a(this.S, new Vector3f(0.0f, -1.0f, 0.0f), 0.5f);
            asj_0.a(this.Q, new Vector3f(0.0f, 0.0f, 0.0f), 0.5f);
            asj_0.a(this.A, new Vector3f(0.0f, 0.0f, 0.0f), 0.5f);
            UW.c((a5K)this.r);
            UW.c((a5K)this.k);
            UW.c((a5K)this.q);
            UW.c((a5K)this.h);
            UW.c((a5K)this.j);
            UW.c((a5K)this.l);
            UW.c((a5K)this.o);
            UW.c(this.E);
            UW.c(this.L);
            UW.c(this.M);
            UW.c(this.B);
            aqt_1.a = s6_0.a(ayj_0.B(entity));
            if (ayj_0.p(entity)) {
                DJ.a(atC.a(atC.a(entity), atK.d), (EntityLivingBase)entity, this, s6_0.a(ayj_0.B(entity)));
                aii_0.a(this, atK.f, atK.B);
            }
            if (ayj_0.q(entity)) {
                DJ.a(atC.a(atC.a(entity), atK.l), (EntityLivingBase)entity, this, s6_0.a(ayj_0.B(entity)));
                aii_0.a(this, atK.C, atK.e);
            }
            boolean cfr_ignored_0 = !s6_0.b(s6_0.a(ayj_0.B(entity))) | s6_0.a((int)ayj_0.B((Entity)entity)).b < 2.0f;
            boolean cfr_ignored_1 = s6_0.a((int)ayj_0.B((Entity)entity)).f.x == 0.0f & s6_0.a((int)ayj_0.B((Entity)entity)).f.z == 0.0f;
            if (ayj_0.e(entity)) {
                DJ.a(atC.a(atC.a(entity), atK.a), (EntityLivingBase)entity, this, s6_0.a(ayj_0.B(entity)));
                aii_0.a(this, atK.x, atK.p);
            }
            DJ.a(atC.a(atC.a(entity), atK.j), (EntityLivingBase)entity, this, s6_0.a(ayj_0.B(entity)));
            aii_0.a(this, atK.g, atK.b);
            if (ayj_0.l(entity)) {
                DJ.a(atC.a(atC.a(entity), atK.s), (EntityLivingBase)entity, this, s6_0.a(ayj_0.B(entity)));
                aii_0.a(this, atK.E, atK.h);
            }
            if (this.i) {
                DJ.a(atC.a(atC.a(entity), atK.q), (EntityLivingBase)entity, this, s6_0.a(ayj_0.B(entity)));
                aii_0.a(this, atK.m, atK.o);
            }
            if (a6w_0.n((EntityPlayer)entity) != null && act_2.k(a6w_0.n((EntityPlayer)entity)) instanceof LY || a6w_0.n((EntityPlayer)entity) != null && BlocksInvoker.a(act_2.k(a6w_0.n((EntityPlayer)entity))) != null) {
                DJ.a(atC.a(atC.a(entity), atK.v), (EntityLivingBase)entity, this, s6_0.a(ayj_0.B(entity)));
                aii_0.a(this, atK.A, atK.w);
            }
            if (a6w_0.n((EntityPlayer)entity) != null && act_2.k(a6w_0.n((EntityPlayer)entity)) instanceof ls_0) {
                DJ.a(atC.a(atC.a(entity), atK.i), (EntityLivingBase)entity, this, s6_0.a(ayj_0.B(entity)));
                aii_0.a(this, atK.r, atK.t);
            }
            DJ.a(atC.a(atC.a(entity), atK.u), (EntityLivingBase)entity, this, s6_0.a(ayj_0.B(entity)));
            UW.a((a5K)this.r, atJ2.g);
            UW.a((a5K)this.k, atJ2.g);
            UW.a((a5K)this.q, atJ2.g);
            UW.a((a5K)this.j, atJ2.g);
            UW.a((a5K)this.h, atJ2.g);
            UW.a((a5K)this.o, atJ2.g);
            UW.a((a5K)this.l, atJ2.g);
            UW.a(this.L, atJ2.g);
            UW.a(this.E, atJ2.g);
            UW.a(this.B, atJ2.g);
            UW.a(this.M, atJ2.g);
            asj_0.g(this.S, atJ2.g);
            asj_0.g(this.Q, atJ2.g);
            asj_0.g(this.A, atJ2.g);
            abo_2.a(this.N, atJ2.g);
            atJ2.p = true;
        }
        s6_0.a(s6_0.a(ayj_0.B(entity)), this);
    }

    @Override
    public void b() {
        up_0.b(this.j, 0.0625f);
        up_0.b(this.y, 0.0625f);
    }

    public void f(float f) {
        GlStateManagerInvoker.translate(this.S.e.x * f, -this.S.e.y * f, this.S.e.z * f);
    }

    @Override
    public void a(boolean bl) {
        super.a(bl);
        this.y.p = bl;
        this.w.p = bl;
        this.x.p = bl;
        this.s.p = bl;
        this.z.p = bl;
        this.K.p = bl;
        this.P.p = bl;
    }

    @Override
    public void a() {
        up_0.b(this.h, 0.0625f);
        up_0.b(this.w, 0.0625f);
    }
}

