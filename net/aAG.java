/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import deobf.MCInvoker;
import deobf.NBTBase;
import deobf.TimerUtil;
import java.awt.Color;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;

public class aAG {
    private static int q;
    private byte A = 0;
    private static byte j = 3;
    static op_2 h;
    private static float n = 0.71f;
    private static int m;
    private static int r = 7245117;
    private AltRepositoryGUI w;
    private String a;
    private static int u = 100;
    static float f = 5.0f;
    private static int o = 24;
    private static int t = -7961722;
    private static byte x = 1;
    private op_2 e;
    private float p = 255.0f;
    private static int C;
    private ais_0 B;
    private static byte b = 2;
    private static int c = 0x9E3939;
    private long g;
    private double k;
    private static int i = 10;
    private static GameProfile d;
    private long v;
    private static byte l = 0;
    long z;
    private float s = 0.0f;
    private TimerUtil y = new TimerUtil();

    private void a(float f, int n, int n2) {
        P8.b();
        float f2 = zd_2.b(this.w);
        if (qh_1.c(this.y, 10L) && this.p > 0.0f) {
            this.p -= f2;
            qh_1.b(this.y);
        }
        if (this.s < f) {
            this.s = MathInvoker.a(this.s + zd_2.e(this.w), f);
        }
    }

    public void a() {
        this.a((byte)1, false);
        this.a((byte)2, false);
    }

    public boolean e() {
        return this.a((byte)0);
    }

    private void a(byte by, boolean bl) {
        P8.b();
        byte by2 = (byte)(1 << by);
        this.A = (byte)(this.A & ~by2);
        this.A = (byte)(this.A & ~by2 | 1 << by & by2);
    }

    public double n() {
        return this.k;
    }

    public op_2 m() {
        return this.e;
    }

    public boolean g() {
        return this.a((byte)1);
    }

    public ais_0 j() {
        return this.B;
    }

    public void i() {
        P8.b();
        aAG aAG2 = (aAG)oc_1.a(aMF.d(aMF.b(ListInvoker.stream(zd_2.d(this.w)), aAG::e)), null);
        if (aAG2 != null) {
            aAG2.c(false);
        }
        this.c(true);
        this.w.a(aAG2, this, null);
    }

    void a(@NotNull GameProfile gameProfile, @Nullable ResourceLocation resourceLocation) {
        Minecraft minecraft = MCInvoker.f();
        this.e = new op_2(gameProfile, resourceLocation);
        FT.a(MCInvoker.j(minecraft), this.e.worldObj, minecraft.fontRendererObj, this.e, this.e, minecraft.gameSettings, 0.0f);
    }

    public void a(long l4) {
        this.g = l4;
    }

    private void a(boolean bl) {
        this.a((byte)1, true);
        this.a((byte)2, bl);
    }

    private void a(@NotNull op_2 op_22, int n) {
        Minecraft minecraft = MCInvoker.f();
        TextureManagerInvoker.bindTexture(MCInvoker.E(minecraft), apz_1.d(op_22));
        wh_1.a(23, n + 3, 8.0f, 8.0f, 8, 8, 30, 30, 64.0f, 64.0f);
    }

    public void a(@NotNull GameProfile gameProfile) {
        this.a(gameProfile, null);
        Minecraft minecraft = MCInvoker.f();
        ayw_0.c(a4Z.c(gameProfile));
        ayw_0.a(a4Z.c(gameProfile), (Multimap)MCInvoker.m(minecraft));
        MinecraftProfileTexture minecraftProfileTexture = (MinecraftProfileTexture)MapInvoker.c(aSI.a(MCInvoker.T(minecraft), gameProfile, false), MinecraftProfileTexture.Type.SKIN);
        MCInvoker.a(minecraft, () -> this.lambda$setGameProfile$1(minecraft, minecraftProfileTexture, gameProfile));
    }

    private void b(boolean bl) {
        this.a((byte)3, bl);
    }

    public String c() {
        return this.a;
    }

    public aAG(@NotNull ais_0 ais_02, @NotNull op_2 op_22, @NotNull AltRepositoryGUI altRepositoryGUI, Long l4, String string, double d) {
        this.w = altRepositoryGUI;
        this.B = ais_02;
        this.e = op_22;
        this.g = lx_2.a(l4);
        this.k = d;
        this.a = string;
    }

    @NotNull
    public static aAG a(AltRepositoryGUI altRepositoryGUI, @NotNull NBTTagCompound nBTTagCompound) {
        NBTTagCompound nBTTagCompound2 = tn_0.a(nBTTagCompound, kd_0.k, null);
        GameProfile gameProfile = S1.a(nBTTagCompound2);
        op_2 op_22 = new op_2((GameProfile)UY.b(gameProfile), null);
        Long l4 = lx_2.b(lx_2.a(tn_0.b(nBTTagCompound, kd_0.D, null)));
        P8.b();
        String string = kd_0.o;
        double d = 1.0;
        if (tn_0.b(nBTTagCompound, kd_0.d)) {
            d = db_0.c(tn_0.b(nBTTagCompound, kd_0.m, null));
        }
        if (tn_0.b(nBTTagCompound, kd_0.j)) {
            string = tn_0.b(nBTTagCompound, kd_0.e, null);
        }
        return new aAG(new ais_0(tn_0.m(nBTTagCompound, kd_0.b), tn_0.m(nBTTagCompound, kd_0.l), tn_0.m(nBTTagCompound, kd_0.p)), op_22, altRepositoryGUI, l4, string, d);
    }

    public void d() {
        ListInvoker.forEach(zd_2.d(this.w), aAG::a);
        zd_2.b(this.w, this);
        MCInvoker.f().session = new Session(aks_1.b(this.B), aks_1.c(this.B), aks_1.a(this.B), kd_0.r);
        this.a(aL0.a(aL0.a(new StringBuilder(), kd_0.a), this).toString(), NotificationType.SUCCESS);
        this.p = 255.0f;
        this.s = 0.0f;
    }

    private boolean a(float f, float f2, int n, int n2) {
        P8.b();
        return n >= 22 && (float)n <= f + 22.0f && (float)n2 >= f2 && (float)n2 <= f2 + 36.0f;
    }

    public NBTBase k() {
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        tn_0.a(nBTTagCompound, kd_0.s, StringInvoker.a(this.g));
        tn_0.a(nBTTagCompound, kd_0.z, this.a);
        tn_0.a(nBTTagCompound, kd_0.w, StringInvoker.a(this.k));
        tn_0.a(nBTTagCompound, kd_0.c, aks_1.a(this.B));
        tn_0.a(nBTTagCompound, kd_0.h, aks_1.b(this.B));
        tn_0.a(nBTTagCompound, kd_0.i, aks_1.c(this.B));
        tn_0.a(nBTTagCompound, kd_0.n, (NBTBase)S1.a(new NBTTagCompound(), apz_1.b(this.e)));
        return nBTTagCompound;
    }

    public String toString() {
        return aL0.a(aL0.a(new StringBuilder(), kd_0.A), a4Z.d(apz_1.b(this.e))).toString();
    }

    public boolean l() {
        P8.b();
        return this.g() && !this.a((byte)2);
    }

    public boolean h() {
        P8.b();
        return this.g() && this.a((byte)2);
    }

    void c(boolean bl) {
        this.a((byte)0, bl);
    }

    static {
        d = new GameProfile(new UUID(0L, 0L), kd_0.x);
        h = new op_2(d, null);
        C = aol_1.b(new Color(0, 0, 0, 75));
        q = aol_1.b(new Color(0, 0, 0, 100));
        m = aol_1.b(new Color(198, 198, 198));
    }

    public boolean f() {
        return this.a((byte)3);
    }

    private ResourceLocation lambda$setGameProfile$1(Minecraft minecraft, MinecraftProfileTexture minecraftProfileTexture, GameProfile gameProfile) throws Exception {
        return aFZ.a(MCInvoker.N(minecraft), minecraftProfileTexture, MinecraftProfileTexture.Type.SKIN, (arg_0, arg_1, arg_2) -> this.lambda$null$0(gameProfile, arg_0, arg_1, arg_2));
    }

    public void a(int n, int n2) {
        if (this.e != null) {
            Minecraft minecraft = MCInvoker.f();
            int n3 = this.w.n;
            int n4 = this.w.f;
            float f = (float)n4 / 3.0f * 0.71f;
            int n5 = n3 - 182;
            int n6 = 25 + n4 - 25 - 24 - 120 - 24;
            int n7 = n3 - 182 - n;
            float f2 = (float)n4 / 2.0f + this.e.n * f - this.e.n * f * (apz_1.c(this.e) / this.e.n) - (float)n2;
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManagerInvoker.enableColorMaterial();
            GlStateManagerInvoker.pushMatrix();
            GL11.glEnable((int)2929);
            GlStateManagerInvoker.translate(n5, n6, 50.0f);
            GL11.glScalef((float)(-f), (float)f, (float)f);
            GlStateManagerInvoker.b(180.0f, 0.0f, 0.0f, 1.0f);
            GlStateManagerInvoker.b(135.0f, 0.0f, 1.0f, 0.0f);
            ne_0.a();
            GlStateManagerInvoker.b(-135.0f, 0.0f, 1.0f, 0.0f);
            float f3 = (float)MathInvoker.b((double)((float)n7 / 40.0f));
            float f4 = -((float)MathInvoker.b((double)(f2 / 40.0f)));
            GlStateManagerInvoker.b(f4 * 20.0f, 1.0f, 0.0f, 0.0f);
            this.e.aD = f3 * 20.0f;
            this.e.rotationYaw = f3 * 40.0f;
            this.e.rotationPitch = f4 * 20.0f;
            this.e.aP = this.e.rotationYaw;
            this.e.aR = this.e.rotationYaw;
            GlStateManagerInvoker.translate(0.0f, 0.0f, 0.0f);
            try {
                RenderManager renderManager = MCInvoker.j(minecraft);
                FT.a(renderManager, 180.0f);
                FT.b(renderManager, false);
                FT.a(renderManager, this.e, 0.0, 0.0, 0.0, 0.0f, 1.0f);
                FT.b(renderManager, true);
            }
            catch (Exception exception) {
                ch_2.a(exception);
            }
            GL11.glDisable((int)2929);
            GlStateManagerInvoker.popMatrix();
            ne_0.e();
            GlStateManagerInvoker.y();
            GlStateManagerInvoker.d(apl_1.ab);
            GlStateManagerInvoker.disableTexture2D();
            GlStateManagerInvoker.d(apl_1.S);
        }
    }

    public long b() {
        return this.g;
    }

    private void lambda$null$0(GameProfile gameProfile, MinecraftProfileTexture.Type type, ResourceLocation resourceLocation, MinecraftProfileTexture minecraftProfileTexture) {
        this.a(gameProfile, resourceLocation);
    }

    protected boolean b(float f, float f2, int n, int n2) {
        P8.b();
        if (!this.a(f, f2, n, n2)) {
            return false;
        }
        if (MCInvoker.a() - this.z < 250L) {
            this.d();
        }
        this.i();
        this.z = MCInvoker.a();
        return true;
    }

    private void a(String string, NotificationType notificationType) {
        aci_0.a(NovolineInvoker.i(NovolineInvoker.getInstance()), new aUM(this, 50, ag3_0.TICK, string, notificationType));
    }

    private boolean a(byte by) {
        P8.b();
        byte by2 = (byte)(1 << by);
        return (this.A & by2) == by2;
    }

    public void a(float f, int n, int n2, int n3) {
        Object object;
        P8.b();
        a1V.a(22.0f, (float)n, f, 36.0f, 0.0f, !this.e() ? new Color(0, 0, 0, 125) : new Color(0, 0, 0, 150));
        if (this.g() && this.p > 0.0f) {
            object = this.h() ? new Color(30, 180, 30, (int)this.p) : new Color(180, 30, 30, (int)this.p);
            a1V.a(22.0f, (float)n, this.s, 36.0f, 0.0f, (Color)object);
            this.a(f, n2, n3);
        }
        this.a(this.e, n);
        a7l_0.a(aYW.a, (CharSequence)apz_1.a(this.e), 56.0f, (float)n + 4.5f, m);
        if (zd_2.c(this.w) == this) {
            a7l_0.a(aYW.a, (CharSequence)kd_0.C, f - 35.0f, (float)n + 18.0f - 4.0f, aol_1.b(new Color(255, 255, 255, 100)));
        }
        if (this.g != -1L && this.g - SystemInvoker.f() < 0L) {
            this.g = 0L;
        }
        if (this.g != 0L) {
            if (this.g != -1L) {
                int n4 = (int)((this.g - SystemInvoker.f()) / 1000L);
                String string = n4 > 86400 ? aL0.a(aL0.c(new StringBuilder(), n4 / 86400), kd_0.q).toString() : kd_0.f;
                n4 = !string.equals(kd_0.v) ? n4 % 86400 : n4;
                String string2 = n4 > 3600 ? aL0.a(aL0.c(new StringBuilder(), n4 / 3600), kd_0.u).toString() : kd_0.g;
                n4 = !string2.equals(kd_0.E) ? n4 % 3600 : n4;
                String string3 = n4 > 60 ? aL0.a(aL0.c(new StringBuilder(), n4 / 60), kd_0.t).toString() : kd_0.B;
                object = aL0.a(aL0.a(aL0.a(new StringBuilder(), string), string2), string3).toString();
            }
            object = kd_0.y;
            a7l_0.a(aYW.a, (CharSequence)object, f - (float)a7l_0.a(aYW.a, (CharSequence)object) - (float)(zd_2.c(this.w) == this ? 45 : -10) + 5.0f, (float)n + 18.0f - 4.0f, m);
        }
    }
}

