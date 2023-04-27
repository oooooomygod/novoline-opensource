/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.Entity;
import deobf.EntityLivingBase;
import cc.novoline.modules.visual.Glint;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import deobf.ModuleRegistry;
import java.util.Map;


public abstract class aY3<T extends q1_0>
implements KB<EntityLivingBase> {
    private boolean k;
    private float g = 1.0f;
    private float b = 1.0f;
    protected q1_0 i;
    private jg_1 c;
    protected static ResourceLocation a;
    private static String h = "CL_00002428";
    private float d = 1.0f;
    private static Map e;
    protected q1_0 j;
    private float f = 1.0f;

    protected T a(EntityLivingBase entityLivingBase, ItemStack itemStack, int n, T t) {
        return t;
    }

    public ResourceLocation a(Entity entity, ItemStack itemStack, int n, String string) {
        ItemArmor itemArmor = (ItemArmor)act_2.k(itemStack);
        String string2 = ax1_0.a(xs_2.a(itemArmor));
        String string3 = uq_0.e;
        int n2 = StringInvoker.d(string2, 58);
        if (n2 != -1) {
            string3 = StringInvoker.b(string2, 0, n2);
            string2 = StringInvoker.a(string2, n2 + 1);
        }
        String string4 = StringInvoker.a(uq_0.l, new Object[]{string3, string2, P8.d(n == 2 ? 2 : 1), uq_0.a});
        string4 = aDb.e(ail_0.cM, new Object[]{entity, itemStack, string4, P8.d(n), string});
        ResourceLocation resourceLocation = (ResourceLocation)MapInvoker.c(e, string4);
        resourceLocation = new ResourceLocation(string4);
        MapInvoker.c(e, string4, resourceLocation);
        return resourceLocation;
    }

    private boolean b(int n) {
        return n == 2;
    }

    private void a(EntityLivingBase entityLivingBase, float f, float f2, float f3, float f4, float f5, float f6, float f7, int n) {
        ItemStack itemStack = this.a(entityLivingBase, n);
        if (act_2.k(itemStack) instanceof ItemArmor) {
            ItemArmor itemArmor = (ItemArmor)act_2.k(itemStack);
            q1_0 q1_02 = this.a(n);
            aV7.a(q1_02, fl_0.a(this.c));
            aV7.a(q1_02, entityLivingBase, f, f2, f3);
            if (aC8.b(ail_0.aW)) {
                q1_02 = this.a(entityLivingBase, itemStack, n, q1_02);
            }
            this.a(q1_02, n);
            boolean bl = this.b(n);
            if (!ys_2.b() || !am1_0.a(itemStack, 2, (String)null)) {
                if (ayy_0.d(ail_0.cM)) {
                    fl_0.a(this.c, this.a((Entity)entityLivingBase, itemStack, 2, (String)null));
                } else {
                    fl_0.a(this.c, this.a(itemArmor, bl));
                }
            }
            if (ayy_0.d(ail_0.cM)) {
                int n2 = xs_2.c(itemArmor, itemStack);
                if (n2 != -1) {
                    float f8 = (float)(n2 >> 16 & 0xFF) / 255.0f;
                    float f9 = (float)(n2 >> 8 & 0xFF) / 255.0f;
                    float f10 = (float)(n2 & 0xFF) / 255.0f;
                    GlStateManagerInvoker.color(this.d * f8, this.g * f9, this.b * f10, this.f);
                    aV7.a(q1_02, entityLivingBase, f, f2, f4, f5, f6, f7);
                    if (!ys_2.b() || !am1_0.a(itemStack, 2, uq_0.b)) {
                        fl_0.a(this.c, this.a((Entity)entityLivingBase, itemStack, 2, uq_0.j));
                    }
                }
                GlStateManagerInvoker.color(this.d, this.g, this.b, this.f);
                aV7.a(q1_02, entityLivingBase, f, f2, f4, f5, f6, f7);
                if (!(this.k || !act_2.n(itemStack) || ys_2.b() && am1_0.a(entityLivingBase, itemStack, q1_02, f, f2, f3, f4, f5, f6, f7))) {
                    this.a(entityLivingBase, q1_02, f, f2, f3, f4, f5, f6, f7);
                }
                return;
            }
            switch (WT.a[xs_2.a(itemArmor).ordinal()]) {
                case 1: {
                    int n3 = xs_2.c(itemArmor, itemStack);
                    float f11 = (float)(n3 >> 16 & 0xFF) / 255.0f;
                    float f12 = (float)(n3 >> 8 & 0xFF) / 255.0f;
                    float f13 = (float)(n3 & 0xFF) / 255.0f;
                    GlStateManagerInvoker.color(this.d * f11, this.g * f12, this.b * f13, this.f);
                    aV7.a(q1_02, entityLivingBase, f, f2, f4, f5, f6, f7);
                    if (!ys_2.b() || !am1_0.a(itemStack, 2, uq_0.g)) {
                        fl_0.a(this.c, this.a(itemArmor, bl, uq_0.k));
                    }
                }
                case 2: 
                case 3: 
                case 4: 
                case 5: {
                    GlStateManagerInvoker.color(this.d, this.g, this.b, this.f);
                    aV7.a(q1_02, entityLivingBase, f, f2, f4, f5, f6, f7);
                }
            }
            if (!(this.k || !act_2.n(itemStack) || ys_2.b() && am1_0.a(entityLivingBase, itemStack, q1_02, f, f2, f3, f4, f5, f6, f7))) {
                this.a(entityLivingBase, q1_02, f, f2, f3, f4, f5, f6, f7);
            }
        }
    }

    public q1_0 a(int n) {
        return this.b(n) ? this.j : this.i;
    }

    private void a(float f, float f2, float f3) {
        Glint glint = (Glint)ModuleInvoker.isEnable(ModuleRegistry.GLINTCOLORIZE);
        if (aVL.a(glint)) {
            a1V.a(aVL.b(glint));
        } else {
            GlStateManagerInvoker.color(f, f2, f3, 1.0f);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "F&u?\u001b+\u001f7^\u00187".toCharArray();
        int n2 = 0;
        int n3 = 44;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x29));
            n3 = n3;
        }
    }

    protected abstract void a(T var1, int var2);

    public aY3(jg_1 jg_12) {
        this.c = jg_12;
        this.a();
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public void a(EntityLivingBase entityLivingBase, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(entityLivingBase, f, f2, f3, f4, f5, f6, f7, 4);
        this.a(entityLivingBase, f, f2, f3, f4, f5, f6, f7, 3);
        this.a(entityLivingBase, f, f2, f3, f4, f5, f6, f7, 2);
        this.a(entityLivingBase, f, f2, f3, f4, f5, f6, f7, 1);
    }

    private void a(EntityLivingBase entityLivingBase, q1_0 q1_02, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (!(ys_2.b() && !am1_0.b() || ys_2.aC() && aVE.ch)) {
            float f8 = (float)entityLivingBase.ticksExisted + f3;
            fl_0.a(this.c, a);
            if (ys_2.aC()) {
                axw_2.f();
            }
            GlStateManagerInvoker.enableBlend();
            GlStateManagerInvoker.depthFunc(514);
            GlStateManagerInvoker.c(false);
            float f9 = 0.5f;
            GlStateManagerInvoker.color(f9, f9, f9, 1.0f);
            int n = 0;
            while (true) {
                GlStateManagerInvoker.disableLighting();
                GlStateManagerInvoker.b(768, 1);
                float f10 = 0.76f;
                float f11 = 0.5f * f10;
                float f12 = 0.25f * f10;
                float f13 = 0.8f * f10;
                this.a(f11, f12, f13);
                GlStateManagerInvoker.matrixMode(5890);
                GlStateManagerInvoker.loadIdentity();
                float f14 = 0.33333334f;
                GlStateManagerInvoker.c(f14, f14, f14);
                GlStateManagerInvoker.b(30.0f - (float)n * 60.0f, 0.0f, 0.0f, 1.0f);
                GlStateManagerInvoker.translate(0.0f, f8 * (0.001f + (float)n * 0.003f) * 20.0f, 0.0f);
                GlStateManagerInvoker.matrixMode(5888);
                aV7.a(q1_02, entityLivingBase, f, f2, f4, f5, f6, f7);
                ++n;
            }
        }
    }

    private ResourceLocation a(ItemArmor itemArmor, boolean bl) {
        return this.a(itemArmor, bl, null);
    }

    protected abstract void a();

    private ResourceLocation a(ItemArmor itemArmor, boolean bl, String string) {
        String string2 = StringInvoker.a(uq_0.i, new Object[]{ax1_0.a(xs_2.a(itemArmor)), P8.d(2), uq_0.d});
        ResourceLocation resourceLocation = (ResourceLocation)MapInvoker.c(e, string2);
        resourceLocation = new ResourceLocation(string2);
        MapInvoker.c(e, string2, resourceLocation);
        return resourceLocation;
    }

    public ItemStack a(EntityLivingBase entityLivingBase, int n) {
        return atn_0.b(entityLivingBase, n - 1);
    }
}

