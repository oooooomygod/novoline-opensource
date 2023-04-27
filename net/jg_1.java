/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.EventManagerInvoker;
import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import cc.novoline.modules.player.Scaffold;
import cc.novoline.modules.visual.CustomHit;
import deobf.DefaultVertexFormats;
import net.minecraft.renderer.texture.DynamicTexture;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.EntityPlayerSP;
import deobf.FontRenderer;
import deobf.MCInvoker;
import deobf.ModuleRegistry;
import deobf.OpenGlHelper;
import deobf.Tessellator;
import net.minecraft.multiplayer.WorldClient;
import net.minecraft.renderer.WorldRenderer;
import java.nio.FloatBuffer;
import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.jG
 */
public abstract class jg_1<T extends EntityLivingBase>
extends j7_0<T> {
    protected FloatBuffer i = N4.d(4);
    protected q1_0 h;
    public static float e;
    protected boolean k = false;
    private static Logger j;
    private static DynamicTexture f;
    public static float l;
    protected List<KB<T>> g = my_0.c();

    public void a(boolean bl) {
        this.k = bl;
    }

    private boolean d(T t, float f) {
        return this.a(t, f, true);
    }

    public void a() {
    }

    private void b() {
        this.a(8448);
        GL11.glTexEnvi((int)8960, (int)apl_1.s, (int)apl_1.B);
        GL11.glTexEnvi((int)8960, (int)apl_1.m, (int)770);
        GL11.glTexEnvi((int)8960, (int)apl_1.M, (int)770);
        aoj_0.a(apl_1.ab);
        this.e();
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        aoj_0.a(apl_1.p);
        GlStateManagerInvoker.k(0);
        this.e();
        aoj_0.a(apl_1.S);
        if (ys_2.aC()) {
            a3c_0.a(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void e() {
        GL11.glTexEnvi((int)8960, (int)8704, (int)apl_1.k);
        GL11.glTexEnvi((int)8960, (int)apl_1.E, (int)8448);
        GL11.glTexEnvi((int)8960, (int)apl_1.L, (int)768);
        GL11.glTexEnvi((int)8960, (int)apl_1.N, (int)768);
        GL11.glTexEnvi((int)8960, (int)apl_1.P, (int)5890);
        GL11.glTexEnvi((int)8960, (int)apl_1.U, (int)apl_1.aa);
        GL11.glTexEnvi((int)8960, (int)apl_1.K, (int)8448);
        GL11.glTexEnvi((int)8960, (int)apl_1.m, (int)770);
        GL11.glTexEnvi((int)8960, (int)apl_1.n, (int)5890);
    }

    private boolean a(T t, float f, boolean bl) {
        float f2 = atn_0.d(t, f);
        int n = this.a(t, f2, f);
        boolean bl2 = (n >> 24 & 0xFF) > 0;
        boolean bl3 = ((EntityLivingBase)t).a8 > 0 || ((EntityLivingBase)t).aS > 0;
        return false;
    }

    protected void a(T t, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        Iterator iterator = ListInvoker.iterator(this.g);
        while (dz_0.c(iterator)) {
            KB kB = (KB)dz_0.b(iterator);
            this.a(t, f3, apr_1.a(kB));
            apr_1.a(kB, t, f, f2, f3, f4, f5, f6, f7);
            this.b();
        }
    }

    protected void c(T t, float f) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(T t, double d, double d2, double d3, float f, float f2) {
        BP bP;
        if (!(!WorldClient.U || vi_2.a(ail_0.da) && aDb.a(ail_0.da, new Object[]{t, this, db_0.a(d), db_0.a(d2), db_0.a(d3)}))) {
            bP = new BP(this, (Entity)t, d, d2, d3, ad3_0.PRE);
            EventManagerInvoker.call(bP);
            if (v0_0.g(bP)) {
                return;
            }
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.A();
            this.h.f = this.a(t, f2);
            this.h.d = atn_0.g(t);
            if (ayy_0.d(ail_0.J)) {
                this.h.d = atn_0.g(t) && ((EntityLivingBase)t).r != null && aDb.e(((EntityLivingBase)t).r, ail_0.J, new Object[0]);
            }
            this.h.g = atn_0.u(t);
            try {
                float f3;
                Object object;
                float f4 = this.a(((EntityLivingBase)t).ay, ((EntityLivingBase)t).aD, f2);
                float f5 = this.a(((EntityLivingBase)t).aR, ((EntityLivingBase)t).aP, f2);
                float f6 = ((EntityLivingBase)t).prevRotationPitch + (((EntityLivingBase)t).rotationPitch - ((EntityLivingBase)t).prevRotationPitch) * f2;
                float f7 = f5 - f4;
                if (this.h.d && ((EntityLivingBase)t).r instanceof EntityLivingBase) {
                    object = (EntityLivingBase)((EntityLivingBase)t).r;
                    f4 = this.a(((EntityLivingBase)object).ay, ((EntityLivingBase)object).aD, f2);
                    f7 = f5 - f4;
                    float f8 = MathHelper.a(f7);
                    if (f8 < -85.0f) {
                        f8 = -85.0f;
                    }
                    if (f8 >= 85.0f) {
                        f8 = 85.0f;
                    }
                    f4 = f5 - f8;
                    if (f8 * f8 > 2500.0f) {
                        f4 += f8 * 0.2f;
                    }
                }
                if (t instanceof EntityPlayerSP) {
                    object = (Scaffold)ModuleInvoker.isEnable(ModuleRegistry.SCAFFOLD);
                    KillAura killAura = (KillAura)ModuleInvoker.isEnable(ModuleRegistry.KILLAURA);
                    if (ma_1.c((Scaffold)object)) {
                        f4 = this.a(ma_1.d((Scaffold)object), ma_1.f((Scaffold)object), f2);
                        f3 = this.a(ma_1.d((Scaffold)object), ma_1.f((Scaffold)object), f2) - f4;
                        float f9 = this.a(ma_1.h((Scaffold)object), ma_1.g((Scaffold)object), f2);
                        f7 = f3;
                        f6 = f9;
                    } else if (atH.j(killAura)) {
                        f4 = this.a(atH.l(killAura), atH.c(killAura), f2);
                        f3 = this.a(atH.l(killAura), atH.c(killAura), f2) - f4;
                        float f10 = this.a(atH.i(killAura), atH.g(killAura), f2);
                        f7 = f3;
                        f6 = f10;
                    }
                }
                this.b(t, d, d2, d3);
                float f11 = this.b(t, f2);
                this.a(t, f11, f4, f2);
                GlStateManagerInvoker.c();
                GlStateManagerInvoker.c(-1.0f, -1.0f, 1.0f);
                this.c(t, f2);
                GlStateManagerInvoker.translate(0.0f, -1.5078125f, 0.0f);
                float f12 = ((EntityLivingBase)t).aM + (((EntityLivingBase)t).aq - ((EntityLivingBase)t).aM) * f2;
                f3 = ((EntityLivingBase)t).aU - ((EntityLivingBase)t).aq * (1.0f - f2);
                if (atn_0.u(t)) {
                    f3 *= 3.0f;
                }
                if (f12 > 1.0f) {
                    f12 = 1.0f;
                }
                GlStateManagerInvoker.enableAlpha();
                aV7.a(this.h, t, f3, f12, f2);
                aV7.a(this.h, f3, f12, f11, f7, f6, 0.0625f, t);
                if (this.k) {
                    boolean bl = this.b((EntityLivingBase)t);
                    this.a(t, f3, f12, f11, f7, f6, 0.0625f);
                    this.c();
                } else {
                    boolean bl = this.d(t, f2);
                    this.a(t, f3, f12, f11, f7, f6, 0.0625f);
                    this.b();
                    GlStateManagerInvoker.c(true);
                    CustomHit customHit = (CustomHit)ModuleInvoker.isEnable(ModuleRegistry.CUSTOMHITGLINT);
                    if (auk_2.a((Boolean)Ba.b(h1_0.a(customHit)))) {
                        this.a(t, f3, f12, f2, f11, f7, f6, 0.0625f);
                    } else {
                        this.a(t, f2, true);
                        this.a(t, f3, f12, f2, f11, f7, f6, 0.0625f);
                        this.b();
                    }
                }
                GlStateManagerInvoker.y();
            }
            catch (Exception exception) {
                LoggerInvoker.a(j, TY.f, exception);
            }
            aoj_0.a(apl_1.ab);
            GlStateManagerInvoker.enableTexture2D();
            aoj_0.a(apl_1.S);
            GlStateManagerInvoker.b();
            GlStateManagerInvoker.popMatrix();
            if (!this.k) {
                super.b(t, d, d2, d3, f, f2);
            }
            if (vi_2.a(ail_0.ao)) {
                aDb.a(ail_0.ao, new Object[]{t, this, db_0.a(d), db_0.a(d2), db_0.a(d3)});
            }
        }
        bP = new BP(this, (Entity)t, d, d2, d3, ad3_0.POST);
        EventManagerInvoker.call(bP);
    }

    protected void a(T t, float f, float f2, float f3) {
        GlStateManagerInvoker.b(180.0f - f2, 0.0f, 1.0f, 0.0f);
        if (((EntityLivingBase)t).aS > 0) {
            float f4 = ((float)((EntityLivingBase)t).aS + f3 - 1.0f) / 20.0f * 1.6f;
            if ((f4 = MathHelper.g(f4)) > 1.0f) {
                f4 = 1.0f;
            }
            GlStateManagerInvoker.b(f4 * this.a(t), 0.0f, 0.0f, 1.0f);
        } else {
            String string = tc_0.b(atn_0.L(t));
            if ((string.equals(TY.c) || string.equals(TY.d)) && (!(t instanceof EntityPlayer) || a6w_0.a((EntityPlayer)t, aea_1.CAPE))) {
                GlStateManagerInvoker.translate(0.0f, ((EntityLivingBase)t).n + 0.1f, 0.0f);
                GlStateManagerInvoker.b(180.0f, 0.0f, 0.0f, 1.0f);
            }
        }
    }

    protected void a(T t, float f, float f2, float f3, float f4, float f5, float f6) {
        Chams chams;
        boolean bl = !atn_0.M(t);
        boolean bl2 = !atn_0.a(t, MCInvoker.f().player);
        if (!this.b((KB)t)) {
            return;
        }
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 0.15f);
        GlStateManagerInvoker.c(false);
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.b(770, 771);
        GlStateManagerInvoker.alphaFunc(516, 0.003921569f);
        Glow glow = (Glow)ModuleInvoker.isEnable(ModuleRegistry.GLOW);
        if (qc_0.a(glow) && StringPropertyInvoker.isMode(qc_0.b(glow), TY.a) && !ava_0.c(qc_0.f(glow)) && qc_0.a(glow, t)) {
            GL11.glPushMatrix();
            GlStateManagerInvoker.c(true);
            a0Z.b();
            aV7.a(this.h, t, f, f2, f3, f4, f5, f6);
            a0Z.c();
            aV7.a(this.h, t, f, f2, f3, f4, f5, f6);
            a0Z.d();
            a0Z.a(glow, t, ((EntityLivingBase)t).aE -= 9);
            aV7.a(this.h, t, f, f2, f3, f4, f5, f6);
            a0Z.a();
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glPopMatrix();
        }
        if (X.d(chams = (Chams)ModuleInvoker.isEnable(ModuleRegistry.CHAMS)) && (StringPropertyInvoker.isMode(X.a(chams), TY.b) || X.h(chams)) && !ava_0.c(X.i(chams)) && X.a(chams, t)) {
            int n = auk_2.a((Boolean)Ba.b(X.g(chams))) ? hb_2.b(0L) : aol_1.b(aUL.c(X.j(chams)));
            GL11.glPushAttrib((int)-1);
            GlStateManagerInvoker.enableBlend();
            GL11.glBlendFunc((int)770, (int)771);
            if (StringPropertyInvoker.isMode(X.a(chams), TY.g)) {
                GlStateManagerInvoker.disableTexture2D();
            }
            GlStateManagerInvoker.a(!auk_2.a((Boolean)Ba.b(X.f(chams))));
            GL11.glColor4f((float)((float)(n >> 16 & 0xFF) / 255.0f), (float)((float)(n >> 8 & 0xFF) / 255.0f), (float)((float)(n & 0xFF) / 255.0f), (float)MathInvoker.b(0.11764706f, X.k(chams) / 255.0f));
            OpenGlHelper.a(apl_1.ab, 240.0f, 240.0f);
            GlStateManagerInvoker.disableDepth();
            aV7.a(this.h, t, f, f2, f3, f4, f5, f6);
            GlStateManagerInvoker.enableDepth();
            n = auk_2.a((Boolean)Ba.b(X.g(chams))) ? a1V.i() : aol_1.b(aUL.c(X.b(chams)));
            GL11.glColor4f((float)((float)(n >> 16 & 0xFF) / 255.0f), (float)((float)(n >> 8 & 0xFF) / 255.0f), (float)((float)(n & 0xFF) / 255.0f), (float)MathInvoker.b(0.11764706f, X.k(chams) / 255.0f));
            aV7.a(this.h, t, f, f2, f3, f4, f5, f6);
            GlStateManagerInvoker.b(!auk_2.a((Boolean)Ba.b(X.f(chams))));
            if (StringPropertyInvoker.isMode(X.a(chams), TY.e)) {
                GlStateManagerInvoker.enableTexture2D();
            }
            GlStateManagerInvoker.disableBlend();
            GL11.glPopAttrib();
        } else {
            aV7.a(this.h, t, f, f2, f3, f4, f5, f6);
        }
        GlStateManagerInvoker.disableBlend();
        GlStateManagerInvoker.alphaFunc(516, 0.1f);
        GlStateManagerInvoker.popMatrix();
        GlStateManagerInvoker.c(true);
    }

    private void a(int n) {
        aoj_0.a(apl_1.S);
        GlStateManagerInvoker.enableTexture2D();
        GL11.glTexEnvi((int)8960, (int)8704, (int)apl_1.k);
        GL11.glTexEnvi((int)8960, (int)apl_1.E, (int)8448);
        GL11.glTexEnvi((int)8960, (int)apl_1.P, (int)apl_1.S);
        GL11.glTexEnvi((int)8960, (int)apl_1.U, (int)apl_1.B);
        GL11.glTexEnvi((int)8960, (int)apl_1.L, (int)768);
        GL11.glTexEnvi((int)8960, (int)apl_1.N, (int)768);
        GL11.glTexEnvi((int)8960, (int)apl_1.K, (int)n);
        GL11.glTexEnvi((int)8960, (int)apl_1.n, (int)apl_1.S);
    }

    public jg_1(RenderManager renderManager, q1_0 q1_02, float f) {
        super(renderManager);
        this.h = q1_02;
        this.c = f;
    }

    protected int a(T t, float f, float f2) {
        return 0;
    }

    @Override
    protected boolean c(T t) {
        EntityPlayerSP entityPlayerSP = MCInvoker.f().player;
        if (t instanceof EntityPlayer && t != entityPlayerSP) {
            Team team = atn_0.d(t);
            aFJ aFJ2 = a3D.a(team);
            Team team2 = PlayerInvoker.al(entityPlayerSP);
            switch (aFJ2.ordinal()) {
                case 0: {
                    return true;
                }
                case 1: {
                    return false;
                }
                case 2: {
                    return a3D.a(team, team2);
                }
                case 3: {
                    return !a3D.a(team, team2);
                }
            }
            return true;
        }
        return MCInvoker.c() && t != this.a.r && !atn_0.a(t, entityPlayerSP) && ((EntityLivingBase)t).h == null;
    }

    protected float b(T t, float f) {
        return (float)((EntityLivingBase)t).ticksExisted + f;
    }

    static {
        j = LogManagerInvoker.c();
        f = new DynamicTexture(16, 16);
        l = 64.0f;
        e = 32.0f;
        int[] nArray = arp_1.b(f);
        int n = 0;
        while (true) {
            nArray[n] = -1;
            ++n;
        }
    }

    protected float a(float f, float f2, float f3) {
        float f4;
        for (f4 = f2 - f; f4 < -180.0f; f4 += 360.0f) {
        }
        while (f4 >= 180.0f) {
            f4 -= 360.0f;
        }
        return f + f3 * f4;
    }

    protected float a(T t) {
        return 90.0f;
    }

    protected <V extends EntityLivingBase, U extends KB<V>> boolean a(U u) {
        return ListInvoker.remove(this.g, u);
    }

    protected void b(T t, double d, double d2, double d3) {
        GlStateManagerInvoker.translate((float)d, (float)d2, (float)d3);
    }

    @Override
    protected boolean b(EntityLivingBase entityLivingBase) {
        a35 a352;
        String string;
        int n = 0xFFFFFF;
        if (entityLivingBase instanceof EntityPlayer && StringInvoker.c(string = FontRendererInvoker.a(sd_1.g(a352 = (a35)atn_0.d(entityLivingBase)))) >= 2) {
            n = FontRendererInvoker.b(this.b(), StringInvoker.b(string, 1));
        }
        float f = (float)(n >> 16 & 0xFF) / 255.0f;
        float f2 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f3 = (float)(n & 0xFF) / 255.0f;
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.d(apl_1.S);
        GlStateManagerInvoker.color(f, f2, f3, 1.0f);
        GlStateManagerInvoker.disableTexture2D();
        GlStateManagerInvoker.d(apl_1.ab);
        GlStateManagerInvoker.disableTexture2D();
        GlStateManagerInvoker.d(apl_1.S);
        return true;
    }

    @Override
    public void a(T t, double d, double d2, double d3) {
        Bf bf = new Bf((Entity)t);
        EventManagerInvoker.call(bf);
        if (HA.a(bf)) {
            return;
        }
        if (!vi_2.a(ail_0.bV) || !aDb.a(ail_0.bV, new Object[]{t, this, db_0.a(d), db_0.a(d2), db_0.a(d3)})) {
            if (this.c(t)) {
                float f;
                double d4 = atn_0.b(t, this.a.r);
                float f2 = f = atn_0.s(t) ? e : l;
                if (d4 < (double)(f * f)) {
                    String string = aBO.a(atn_0.C(t));
                    GlStateManagerInvoker.alphaFunc(516, 0.1f);
                    if (atn_0.s(t)) {
                        FontRenderer fontRenderer = this.b();
                        GlStateManagerInvoker.pushMatrix();
                        GlStateManagerInvoker.translate((float)d, (float)d2 + ((EntityLivingBase)t).n + 0.5f - (atn_0.u(t) ? ((EntityLivingBase)t).n / 2.0f : 0.0f), (float)d3);
                        GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
                        GlStateManagerInvoker.b(-this.a.l, 0.0f, 1.0f, 0.0f);
                        GlStateManagerInvoker.b(this.a.b, 1.0f, 0.0f, 0.0f);
                        GlStateManagerInvoker.c(-0.02666667f, -0.02666667f, 0.02666667f);
                        GlStateManagerInvoker.translate(0.0f, 9.374999f, 0.0f);
                        GlStateManagerInvoker.disableLighting();
                        GlStateManagerInvoker.c(false);
                        GlStateManagerInvoker.enableBlend();
                        GlStateManagerInvoker.disableTexture2D();
                        GlStateManagerInvoker.b(770, 771, 1, 0);
                        int n = FontRendererInvoker.a(fontRenderer, string) / 2;
                        Tessellator tessellator = TessellatorInvoker.getInstance();
                        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
                        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.d);
                        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, -n - 1, -1.0, 0.0), 0.0f, 0.0f, 0.0f, 0.25f));
                        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, -n - 1, 8.0, 0.0), 0.0f, 0.0f, 0.0f, 0.25f));
                        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, n + 1, 8.0, 0.0), 0.0f, 0.0f, 0.0f, 0.25f));
                        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, n + 1, -1.0, 0.0), 0.0f, 0.0f, 0.0f, 0.25f));
                        TessellatorInvoker.draw(tessellator);
                        GlStateManagerInvoker.enableTexture2D();
                        GlStateManagerInvoker.c(true);
                        FontRendererInvoker.a(fontRenderer, string, -FontRendererInvoker.a(fontRenderer, string) / 2, 0.0f, 0x20FFFFFF);
                        GlStateManagerInvoker.D();
                        GlStateManagerInvoker.disableBlend();
                        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
                        GlStateManagerInvoker.popMatrix();
                    } else {
                        this.a(t, d, d2 - (atn_0.u(t) ? (double)(((EntityLivingBase)t).n / 2.0f) : 0.0), d3, string, 0.02666667f, d4);
                    }
                }
            }
            if (vi_2.a(ail_0.cX)) {
                aDb.a(ail_0.cX, new Object[]{t, this, db_0.a(d), db_0.a(d2), db_0.a(d3)});
            }
        }
    }

    @Override
    public <V extends EntityLivingBase, U extends KB<V>> boolean b(U u) {
        return ListInvoker.add(this.g, u);
    }

    protected void c() {
        GlStateManagerInvoker.D();
        GlStateManagerInvoker.d(apl_1.S);
        GlStateManagerInvoker.enableTexture2D();
        GlStateManagerInvoker.d(apl_1.ab);
        GlStateManagerInvoker.enableTexture2D();
        GlStateManagerInvoker.d(apl_1.S);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    protected float a(T t, float f) {
        return atn_0.e(t, f);
    }

    public q1_0 d() {
        return this.h;
    }
}

