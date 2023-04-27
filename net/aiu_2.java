/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.DisplayInvoker;
import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.EnumPlayerType;
import cc.novoline.modules.visual.HUD;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import deobf.ModuleRegistry;
import deobf.NameTags;
import java.awt.Color;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.aiu
 */
class aiu_2 {
    NameTags c;
    private EntityLivingBase a;
    private double[] b;

    private float d() {
        HUD.t();
        float f = PlayerInvoker.b(MCInvoker.f().player, this.a);
        NameTags nameTags = (NameTags)ModuleInvoker.isEnable(ModuleRegistry.NAMETAGS);
        if (StringPropertyInvoker.a(qd_2.b(nameTags), aD2.s)) {
            return (float)MathInvoker.d((double)this.c() * (f >= 110.0f ? 0.058 : 0.032 + (double)(4.0f / f)), 1.0);
        }
        return (float)MathInvoker.d((double)this.c() * (f >= 110.0f ? 0.046 : 0.02 + (double)(4.0f / f)), 1.0);
    }

    private double[] a(double d, double d2, double d3) {
        double[] dArray;
        FloatBuffer floatBuffer = a9w_0.a(3);
        HUD.j();
        IntBuffer intBuffer = a9w_0.b(16);
        FloatBuffer floatBuffer2 = a9w_0.a(16);
        FloatBuffer floatBuffer3 = a9w_0.a(16);
        GL11.glGetFloat((int)2982, (FloatBuffer)floatBuffer2);
        GL11.glGetFloat((int)2983, (FloatBuffer)floatBuffer3);
        GL11.glGetInteger((int)2978, (IntBuffer)intBuffer);
        boolean bl = afs_2.a((float)d, (float)d2, (float)d3, floatBuffer2, floatBuffer3, intBuffer, floatBuffer);
        if (bl) {
            double[] dArray2 = new double[3];
            dArray2[0] = aHB.b(floatBuffer, 0);
            dArray2[1] = (float)DisplayInvoker.getHeight() - aHB.b(floatBuffer, 1);
            dArray = dArray2;
            dArray2[2] = aHB.b(floatBuffer, 2);
        } else {
            dArray = null;
        }
        return dArray;
    }

    static double[] a(aiu_2 aiu_22, double d, double d2, double d3) {
        return aiu_22.a(d, d2, d3);
    }

    private float a(String string) {
        HUD.j();
        if (StringInvoker.d((String)StringPropertyInvoker.b(NameTags.d(this.c)), aD2.c)) {
            return a7l_0.a(adj_1.a(pI.a, P8.b((Integer)adt_2.a(NameTags.b(this.c)))), string);
        }
        return FontRendererInvoker.a(NameTags.f((NameTags)this.c).fontRendererObj, string);
    }

    void b() {
        HUD.j();
        GL11.glPushMatrix();
        ScaledResolution scaledResolution = new ScaledResolution(MCInvoker.f());
        EnumPlayerType enumPlayerType = a8F.a(NovolineInvoker.A(NovolineInvoker.getInstance()), atn_0.L(this.a));
        float f = (float)(this.b[0] / (double)ScaledResolutionInvoker.getScaleFactor(scaledResolution));
        float f2 = (float)(this.b[1] / (double)ScaledResolutionInvoker.getScaleFactor(scaledResolution));
        float f3 = (float)(this.b[2] / (double)ScaledResolutionInvoker.getScaleFactor(scaledResolution));
        NameTags nameTags = (NameTags)ModuleInvoker.isEnable(ModuleRegistry.NAMETAGS);
        List list = (List)ava_0.a(qd_2.a(nameTags));
        List list2 = (List)ava_0.a(qd_2.d(nameTags));
        String string = ListInvoker.contains(list2, aD2.l) ? (StringPropertyInvoker.a(qd_2.b(nameTags), aD2.b) ? aL0.c(aL0.a(new StringBuilder(), aD2.A), (int)(atn_0.c(this.a) + atn_0.j(this.a))).toString() : aD2.k) : aD2.v;
        String string2 = ListInvoker.contains(list, aD2.n) ? aL0.a(aL0.c(aL0.a(new StringBuilder(), aD2.f), (int)PlayerInvoker.b(NameTags.e((NameTags)this.c).player, this.a)), aD2.z).toString() : aD2.o;
        String string3 = aBO.a(atn_0.C(this.a));
        GL11.glTranslatef((float)f, (float)f2, (float)f3);
        float f4 = 1.0f;
        switch (MCInvoker.f().gameSettings.z) {
            case 0: {
                f4 = 0.5f;
            }
            case 1: {
                f4 = 2.0f;
            }
            case 3: {
                f4 = 0.6666667f;
            }
        }
        if (this.b[2] < 0.0 || this.b[2] >= 1.0) {
            GlStateManagerInvoker.popMatrix();
            return;
        }
        ScaledResolution scaledResolution2 = new ScaledResolution(NameTags.c(this.c));
        double d = (double)ScaledResolutionInvoker.getScaleFactor(scaledResolution2) / MathInvoker.b((double)ScaledResolutionInvoker.getScaleFactor(scaledResolution2), 2.0);
        GL11.glScaled((double)d, (double)d, (double)d);
        GlStateManagerInvoker.disableDepth();
        KillAura killAura = (KillAura)ModuleInvoker.isEnable(ModuleRegistry.KILLAURA);
        String string4 = aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), enumPlayerType == EnumPlayerType.FRIEND ? aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.AQUA), aD2.m).toString() : (atH.k(killAura) && ava_0.b(atH.f(killAura), aD2.e) && pl_1.b(this.a) ? aD2.h : (enumPlayerType == EnumPlayerType.TARGET ? aD2.j : aD2.g))), (Object)anw_0.RESET), string3), (Object)anw_0.GRAY), string2).toString();
        float f5 = MathInvoker.b(-(this.a(string4) / 2.0f) - 3.0f - (this.a(string4) / 2.0f + 4.0f));
        float f6 = (int)(atn_0.y(this.a) + atn_0.j(this.a));
        float f7 = 100.0f / f6;
        float f8 = (int)((atn_0.c(this.a) + atn_0.j(this.a)) * f7);
        float f9 = f5 / 100.0f;
        int n = ListInvoker.contains(list2, aD2.t) && StringPropertyInvoker.a(qd_2.b(nameTags), aD2.d) ? 5 : 0;
        float f10 = this.a(string4) / 2.0f;
        ScaledResolution scaledResolution3 = new ScaledResolution(MCInvoker.f());
        float f11 = (float)ScaledResolutionInvoker.getScaledWidth(scaledResolution3) / 2.0f;
        float f12 = (float)ScaledResolutionInvoker.i(scaledResolution3) / 2.0f;
        float f13 = (float)a7l_0.a(aYW.a, string4) / 2.0f * 0.5f;
        float f14 = 6.75f;
        float cfr_ignored_0 = f11 / f4 + f13;
        float cfr_ignored_1 = f11 / f4 - f13;
        float cfr_ignored_2 = f12 / f4 - f14;
        float cfr_ignored_3 = f12 / f4 + f14;
        if (ListInvoker.contains(list2, aD2.y)) {
            a1V.b((double)(-f10 - 2.0f - (float)n), (double)(-8.0f - this.d()), (double)(this.a(aL0.a(aL0.a(new StringBuilder(), string4), string).toString()) / 2.0f + (StringPropertyInvoker.a(qd_2.b(nameTags), aD2.x) ? 2.0f : this.a(string) - 3.0f - (float)n)), (double)((float)(ListInvoker.contains(list2, aD2.w) ? (StringPropertyInvoker.a(qd_2.b(nameTags), aD2.p) ? 6 : 5) : 5) - this.d()) + 0.6 * (double)MathInvoker.max(0, P8.b((Integer)adt_2.a(NameTags.b(this.c))) - 20), aol_1.b(new Color(enumPlayerType == EnumPlayerType.TARGET ? 100 : 0, enumPlayerType == EnumPlayerType.FRIEND || atH.k(killAura) && ava_0.b(atH.f(killAura), aD2.i) && pl_1.b(this.a) ? 90 : 0, enumPlayerType == EnumPlayerType.FRIEND ? 120 : (pl_1.b(this.a) ? 15 : 0), P8.b((Integer)adt_2.a(qd_2.c(nameTags))))));
        }
        if (ListInvoker.contains(list, aD2.q)) {
            this.a((EntityPlayer)this.a);
        }
        this.a(string4, -f10 - (float)n, -this.d() - 5.0f, 0xFFFFFF);
        this.a(string, f10 - (float)n, -this.d() - 5.0f, this.a());
        if (ListInvoker.contains(list2, aD2.u) && StringPropertyInvoker.a(qd_2.b(nameTags), aD2.a)) {
            double d2 = 0.6 * (double)MathInvoker.max(0, P8.b((Integer)adt_2.a(NameTags.b(this.c))) - 20);
            a1V.b((double)(-f10 - 2.0f), (double)(5.0f - this.d()) + d2, (double)(-f10 - 5.0f + f8 * f9), (double)(6.0f - this.d()) + d2, this.a());
        }
        GlStateManagerInvoker.enableDepth();
        GL11.glPopMatrix();
    }

    static double[] a(aiu_2 aiu_22, double[] dArray) {
        aiu_22.b = dArray;
        return dArray;
    }

    private void a(ItemStack itemStack, int n, float f) {
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.c(true);
        GlStateManagerInvoker.clear(256);
        ne_0.a();
        MCInvoker.A((Minecraft)MCInvoker.f()).e = -150.0f;
        GlStateManagerInvoker.disableDepth();
        GlStateManagerInvoker.disableTexture2D();
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.enableAlpha();
        GlStateManagerInvoker.enableTexture2D();
        GlStateManagerInvoker.D();
        GlStateManagerInvoker.enableDepth();
        GlStateManagerInvoker.b(0.7, 0.7, 0.7);
        DU.b(MCInvoker.A(MCInvoker.f()), itemStack, n, f);
        DU.a(MCInvoker.A(MCInvoker.f()), awe_1.a, itemStack, n, (int)f);
        MCInvoker.A((Minecraft)MCInvoker.f()).e = 0.0f;
        ne_0.e();
        GlStateManagerInvoker.A();
        GlStateManagerInvoker.enableAlpha();
        GlStateManagerInvoker.disableBlend();
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.c(0.5f, 0.5f, 0.5f);
        GlStateManagerInvoker.disableDepth();
        GlStateManagerInvoker.enableDepth();
        GlStateManagerInvoker.c(2.0f, 2.0f, 2.0f);
        GlStateManagerInvoker.popMatrix();
    }

    static EntityLivingBase a(aiu_2 aiu_22) {
        return aiu_22.a;
    }

    public aiu_2(NameTags nameTags, EntityLivingBase entityLivingBase) {
        this.c = nameTags;
        this.b = new double[]{0.0, 0.0, 0.0};
        this.a = entityLivingBase;
    }

    private void a(String string, float f, float f2, int n) {
        HUD.t();
        if (StringInvoker.d((String)StringPropertyInvoker.b(NameTags.d(this.c)), aD2.r)) {
            a7l_0.a(adj_1.a(pI.a, P8.b((Integer)adt_2.a(NameTags.b(this.c)))), (CharSequence)string, f, f2, n);
        }
        FontRendererInvoker.a(NameTags.a((NameTags)this.c).fontRendererObj, string, f, f2, n);
    }

    private int a() {
        float f = atn_0.c(this.a);
        float f2 = atn_0.y(this.a);
        float f3 = MathInvoker.b(0.0f, MathInvoker.a(f, f2) / f2);
        return aol_1.a(f3 / 3.0f, 1.0f, 1.0f) | 0xFF000000;
    }

    private int c() {
        int n = (int)MathInvoker.a(MCInvoker.f().player.posX - this.a.posX);
        int n2 = (int)MathInvoker.a(MCInvoker.f().player.posY - this.a.posY);
        int n3 = (int)MathInvoker.a(MCInvoker.f().player.posZ - this.a.posZ);
        return (int)MathInvoker.d(n * n + n2 * n2 + n3 * n3);
    }

    private void a(EntityPlayer entityPlayer) {
        ItemStack itemStack;
        ItemStack[] itemStackArray = entityPlayer.inventory.d;
        HUD.t();
        int n = 0;
        Object object = itemStackArray;
        int n2 = ((ItemStack[])object).length;
        int n3 = 0;
        if (n3 < n2) {
            ItemStack itemStack2 = object[n3];
            itemStack = itemStack2;
            if (itemStack != null) {
                n -= 8;
            }
            ++n3;
        }
        if (a6w_0.n(entityPlayer) != null) {
            n -= 8;
            object = act_2.C(a6w_0.n(entityPlayer));
            if (act_2.z((ItemStack)object) && (act_2.k((ItemStack)object) instanceof lw_0 || act_2.k((ItemStack)object) instanceof ItemArmor)) {
                object.a = 1;
            }
            this.a((ItemStack)object, n, -25.0f - this.d() * 1.5f);
            n += 16;
        }
        itemStackArray = entityPlayer.inventory.d;
        int n4 = 3;
        itemStack = itemStackArray[n4];
        this.a(itemStack, n, -25.0f - this.d() * 1.5f);
        n += 16;
        --n4;
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
    }
}

