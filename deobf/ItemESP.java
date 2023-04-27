/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Vector3d
 *  javax.vecmath.Vector4d
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.lwjgl.opengl.GL11
 */
package deobf;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.Render2DEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.DisplayInvoker;
import cc.novoline.invoke.EntityRendererInvoker;
import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.ItemStackInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.modules.AbstractModule;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector4d;

import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.configurations.annotation.Property;
import cc.novoline.modules.player.AutoArmor;
import cc.novoline.modules.visual.HUD;
import net.minecraft.client.Minecraft;
import net.Ba;
import net.BooleanProperty;
import net.DU;
import net.HL;
import net.Item;
import net.Items;
import net.JE;
import net.L0;
import net.LC;
import net.LK;
import net.LY;
import net.MathHelper;
import net.ModuleManager;
import net.N4;
import net.QI;
import net.ScaledResolution;
import net.TN;
import net.a1V;
import net.a1c;
import net.a7r_0;
import net.aHB;
import net.aL0;
import net.aND;
import net.aPL;
import net.abx_0;
import net.act_2;
import net.aec_0;
import net.afm_2;
import net.afs_2;
import net.alf_0;
import net.anw_0;
import net.aol_1;
import net.asp_2;
import net.auk_2;
import net.dz_0;
import net.go_0;
import net.lh_0;
import net.ls_0;
import net.lw_0;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.og_0;
import net.px_0;
import net.rm_2;
import net.ua_2;
import net.uc_0;
import net.yl_2;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.lwjgl.opengl.GL11;

public class ItemESP
extends AbstractModule {
    private static String[] P;
    private static String[] O;
    private FloatBuffer M;
    @Property(value="names")
    private BooleanProperty L;
    @Property(value="needed-only")
    private BooleanProperty I;
    private static Map Q;
    private FloatBuffer K;
    private static long N;
    private IntBuffer J;
    private FloatBuffer H;

    private float a(@NonNull ItemStack itemStack) {
        float f;
        block5: {
            block7: {
                lw_0 lw_02;
                String string;
                Item item;
                block6: {
                    block4: {
                        HUD.t();
                        item = act_2.k(itemStack);
                        if (!(item instanceof lw_0)) {
                            return 0.0f;
                        }
                        string = px_0.c(item);
                        lw_02 = (lw_0)item;
                        if (!(item instanceof LY)) break block4;
                        f = abx_0.a(lw_02, itemStack, Blocks.stone);
                        if (!StringInvoker.a(StringInvoker.i(string), (CharSequence)TN.r)) break block5;
                        f -= 5.0f;
                    }
                    if (!(item instanceof LK)) break block6;
                    f = abx_0.a(lw_02, itemStack, Blocks.dirt);
                    if (!StringInvoker.a(StringInvoker.i(string), (CharSequence)TN.o)) break block5;
                    f -= 5.0f;
                }
                if (!(item instanceof ls_0)) break block7;
                f = abx_0.a(lw_02, itemStack, Blocks.b2);
                if (!StringInvoker.a(StringInvoker.i(string), (CharSequence)TN.j)) break block5;
                f -= 5.0f;
            }
            return 1.0f;
        }
        f = (float)((double)f + (double)alf_0.a(yl_2.p.c, itemStack) * 0.0075);
        f = (float)((double)f + (double)alf_0.a(yl_2.k.c, itemStack) / 100.0);
        return f;
    }

    private boolean b(ItemStack itemStack) {
        HUD.j();
        int n = 0;
        if (this.mc.player.inventory.d[n] != null && act_2.k(this.mc.player.inventory.d[n]) == act_2.k(itemStack)) {
            return true;
        }
        ++n;
        n = 9;
        if (ItemStackInvoker.e(PlayerInvoker.f(this.mc.player, n))) {
            ItemStack itemStack2 = ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n));
            if (act_2.k(itemStack) == act_2.k(itemStack2)) {
                return true;
            }
        }
        ++n;
        return false;
    }

    private float d(@NonNull ItemStack itemStack) {
        float f = 0.0f;
        HUD.t();
        Item item = act_2.k(itemStack);
        if (item instanceof lw_0) {
            f += abx_0.a((lw_0)item);
        }
        if (item instanceof LC) {
            f += QI.b((LC)item);
        }
        return f += (float)alf_0.a(yl_2.b.c, itemStack) * 1.25f + (float)alf_0.a(yl_2.e.c, itemStack) * 0.01f;
    }

    private Color b(og_0 og_02) {
        HUD.j();
        String string = aec_0.k(og_02).r();
        if (StringInvoker.d(string, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GOLD), TN.l).toString()) || StringInvoker.d(string, TN.u) || StringInvoker.d(string, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GREEN), TN.h).toString()) || StringInvoker.d(string, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.RED), TN.s).toString()) || StringInvoker.d(string, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.RED), TN.t).toString()) || StringInvoker.d(string, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GREEN), TN.q).toString()) || StringInvoker.d(string, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GOLD), TN.k).toString()) || StringInvoker.d(string, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GOLD), TN.p).toString())) {
            return new Color(255, 255, 255);
        }
        if (!this.a(og_02)) {
            return new Color(255, 255, 255);
        }
        if (act_2.k(aec_0.k(og_02)) instanceof ItemArmor) {
            return new Color(75, 189, 193);
        }
        if (act_2.k(aec_0.k(og_02)) instanceof lh_0) {
            return new Color(255, 199, 71);
        }
        if (act_2.k(aec_0.k(og_02)) instanceof L0 && this.a(og_02)) {
            return new Color(255, 199, 71);
        }
        if (act_2.k(aec_0.k(og_02)) instanceof LC) {
            return new Color(255, 117, 117);
        }
        if (act_2.k(aec_0.k(og_02)) instanceof LY) {
            return new Color(130, 219, 82);
        }
        if (act_2.k(aec_0.k(og_02)) instanceof LK) {
            return new Color(130, 219, 82);
        }
        if (act_2.k(aec_0.k(og_02)) instanceof ls_0) {
            return new Color(130, 219, 82);
        }
        return new Color(255, 255, 255);
    }

    private static String b(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = ItemESP.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private boolean a(og_0 og_02) {
        boolean bl;
        HUD.t();
        boolean bl2 = bl = act_2.k(aec_0.k(og_02)) instanceof ItemArmor || act_2.k(aec_0.k(og_02)) == Items.skull && !StringInvoker.d(aec_0.k(og_02).r(), TN.a) && !StringInvoker.d(aec_0.k(og_02).r(), TN.f) && !StringInvoker.d(aec_0.k(og_02).r(), TN.m) && !StringInvoker.d(aec_0.k(og_02).r(), TN.n) && !StringInvoker.d(aec_0.k(og_02).r(), aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GREEN), TN.d).toString()) || act_2.k(aec_0.k(og_02)) instanceof lh_0;
        if (act_2.k(aec_0.k(og_02)) instanceof ItemArmor) {
            ItemStack itemStack;
            AutoArmor autoArmor = (AutoArmor)ModuleInvoker.isEnable(ModuleRegistry.AUTOARMOR);
            int n = 1;
            String string = TN.e;
            string = TN.i;
            string = TN.c;
            string = TN.b;
            string = TN.g;
            if (ItemStackInvoker.e(PlayerInvoker.f(this.mc.player, 4 + n)) && StringInvoker.a(px_0.c(act_2.k(itemStack = ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, 4 + n)))), (CharSequence)string) && StringInvoker.a(px_0.c(act_2.k(aec_0.k(og_02))), (CharSequence)string)) {
                return this.c(aec_0.k(og_02)) > this.c(ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, 4 + n)));
            }
            ++n;
            return !this.b(aec_0.k(og_02));
        }
        if (act_2.k(aec_0.k(og_02)) instanceof LC) {
            int n = 9;
            if (ItemStackInvoker.e(PlayerInvoker.f(this.mc.player, n)) && act_2.k(ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n))) instanceof LC) {
                return this.d(aec_0.k(og_02)) > this.d(ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n)));
            }
            ++n;
            return !this.b(aec_0.k(og_02));
        }
        if (act_2.k(aec_0.k(og_02)) instanceof LY) {
            int n = 9;
            if (ItemStackInvoker.e(PlayerInvoker.f(this.mc.player, n)) && act_2.k(ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n))) instanceof LY) {
                return this.a(aec_0.k(og_02)) > this.a(ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n)));
            }
            ++n;
            return !this.b(aec_0.k(og_02));
        }
        if (act_2.k(aec_0.k(og_02)) instanceof LK) {
            int n = 9;
            if (ItemStackInvoker.e(PlayerInvoker.f(this.mc.player, n)) && act_2.k(ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n))) instanceof LK) {
                return this.a(aec_0.k(og_02)) > this.a(ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n)));
            }
            ++n;
            return !this.b(aec_0.k(og_02));
        }
        if (act_2.k(aec_0.k(og_02)) instanceof ls_0) {
            int n = 9;
            if (ItemStackInvoker.e(PlayerInvoker.f(this.mc.player, n)) && act_2.k(ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n))) instanceof ls_0) {
                return this.a(aec_0.k(og_02)) > this.a(ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n)));
            }
            ++n;
            return !this.b(aec_0.k(og_02));
        }
        return bl;
    }

    @EventTarget
    public void a(Render2DEvent render2DEvent) {
        Entity entity;
        HUD.j();
        Iterator iterator = ListInvoker.iterator(BlockInvoker.e(this.mc.world));
        if (dz_0.c(iterator) && (entity = (Entity)dz_0.b(iterator)) instanceof og_0) {
            JE jE = aPL.a(DU.a(MCInvoker.A(this.mc)), aec_0.k((og_0)entity));
            float f = MathHelper.sin(((float)aec_0.j((og_0)entity) + uc_0.b(render2DEvent)) / 10.0f + ((og_0)entity).ap) * 0.1f + 0.1f;
            float cfr_ignored_0 = afm_2.a((HL)aND.a((JE)jE), (go_0)go_0.GROUND).c.y;
            double d = a1V.a(entity.posX, entity.lastTickPosX, (double)uc_0.b(render2DEvent));
            double d2 = a1V.a(entity.posY + (double)f, entity.lastTickPosY + (double)f, (double)uc_0.b(render2DEvent));
            double d3 = a1V.a(entity.posZ, entity.lastTickPosZ, (double)uc_0.b(render2DEvent));
            double d4 = (double)entity.width / 1.4;
            double d5 = (double)entity.n + 0.2;
            rm_2 rm_22 = new rm_2(d - d4, d2, d3 - d4, d + d4, d2 + d5, d3 + d4);
            List list = a7r_0.a(new Vector3d[]{new Vector3d(rm_22.e, rm_22.a, rm_22.f), new Vector3d(rm_22.e, rm_22.c, rm_22.f), new Vector3d(rm_22.b, rm_22.a, rm_22.f), new Vector3d(rm_22.b, rm_22.c, rm_22.f), new Vector3d(rm_22.e, rm_22.a, rm_22.d), new Vector3d(rm_22.e, rm_22.c, rm_22.d), new Vector3d(rm_22.b, rm_22.a, rm_22.d), new Vector3d(rm_22.b, rm_22.c, rm_22.d)});
            EntityRendererInvoker.a(this.mc.entityRenderer, uc_0.b(render2DEvent), 0);
            Vector4d vector4d = null;
            Iterator iterator2 = ListInvoker.iterator(list);
            if (dz_0.c(iterator2)) {
                Vector3d vector3d = (Vector3d)dz_0.b(iterator2);
                vector3d = this.a(uc_0.a(render2DEvent), vector3d.x - MCInvoker.j((Minecraft)this.mc).k, vector3d.y - MCInvoker.j((Minecraft)this.mc).n, vector3d.z - MCInvoker.j((Minecraft)this.mc).j);
                if (vector3d != null && vector3d.z >= 0.0 && vector3d.z < 1.0) {
                    if (vector4d == null) {
                        vector4d = new Vector4d(vector3d.x, vector3d.y, vector3d.z, 0.0);
                    }
                    vector4d.x = MathInvoker.a(vector3d.x, vector4d.x);
                    vector4d.y = MathInvoker.a(vector3d.y, vector4d.y);
                    vector4d.z = MathInvoker.d(vector3d.x, vector4d.z);
                    vector4d.w = MathInvoker.d(vector3d.y, vector4d.w);
                }
            }
            EntityRendererInvoker.b(this.mc.entityRenderer);
            if (vector4d != null && (!auk_2.a((Boolean)Ba.b(this.I)) || this.a((og_0)entity))) {
                double d6 = vector4d.x;
                double d7 = vector4d.y;
                double d8 = vector4d.z;
                double d9 = vector4d.w;
                a1V.a(d6, d7, d8, d9, this.a((og_0)entity) ? 4.0 : 3.0, Color.BLACK);
                a1V.a(d6, d7, d8, d9, this.a((og_0)entity) ? 2.0 : 1.0, this.b((og_0)entity));
                if (auk_2.a((Boolean)Ba.b(this.L))) {
                    float f2 = 1.0f;
                    switch (this.mc.gameSettings.z) {
                        case 0: {
                            f2 = 0.5f;
                        }
                        case 1: {
                            f2 = 2.0f;
                        }
                        case 3: {
                            f2 = 0.6666667f;
                        }
                    }
                    double[] dArray = ua_2.a(d6, d7);
                    double[] dArray2 = ua_2.a(d8, d9);
                    double[] dArray3 = new double[]{dArray[0] * 2.0, dArray[1] * 2.0, dArray2[0] * 2.0, dArray2[1] * 2.0};
                    GL11.glPushMatrix();
                    GL11.glScalef((float)(0.5f * f2), (float)(0.5f * f2), (float)(0.5f * f2));
                    double d10 = MathInvoker.a(dArray3[2] - dArray3[0]);
                    float f3 = (float)(FontRendererInvoker.d(this.mc.fontRendererCrack) * 2) - (float)(FontRendererInvoker.d(this.mc.fontRendererCrack) / 2);
                    FontRendererInvoker.drawStringWithShadow(this.mc.fontRendererCrack, aec_0.k((og_0)entity).r(), (float)(dArray3[0] + d10 / 2.0 - (double)(FontRendererInvoker.a(this.mc.fontRendererCrack, aec_0.k((og_0)entity).r()) / 2)), (float)dArray2[1] * 2.0f + f3, aol_1.b(aol_1.a(this.b((og_0)entity))));
                    GL11.glPopMatrix();
                }
            }
        }
    }

    static {
        N = a1c.a(8692818149896215975L, 4513008327899478971L, MethodHandles.lookup().lookupClass()).a(186035398736430L);
        Q = new HashMap(13);
        long l4 = N ^ 0x7FDEB2EA13B5L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        int n = 2;
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l4 >>> 56);
        int n2 = 1;
        while (true) {
            byArray2 = byArray2;
            byArray2[n2] = (byte)(l4 << n2 * 8 >>> 56);
            ++n2;
        }
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x293E;
        if (P[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])Q.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                Q.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/aCv", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return P[n2];
    }

    public ItemESP(@NonNull int n, char c, ModuleManager moduleManager, int n2, EnumModuleType enumModuleType, String string, String string2) {
        long l4 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ N;
        long l5 = l4 ^ 0x3F1931E5E78L;
        int n3 = (int)(l5 >>> 48);
        int n4 = (int)(l5 << 16 >>> 48);
        int n5 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n3, enumModuleType, string, (char)n4, n5, string2);
        this.L = asp_2.c();
        this.I = asp_2.c();
        this.J = N4.a(16);
        this.M = N4.d(16);
        this.K = N4.d(16);
        this.H = N4.d(4);
        ManagerInvoker.put(new Setting((String)((Object)ItemESP.b("t", (int)9756, (long)(0xEA4FDEB2C03810AL ^ l4))), (String)((Object)ItemESP.b("t", (int)15422, (long)(0x30E1A894D7829B2AL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.L));
        ManagerInvoker.put(new Setting((String)((Object)ItemESP.b("t", (int)5108, (long)(0x549395D0148F34E3L ^ l4))), (String)((Object)ItemESP.b("t", (int)31875, (long)(0x7F86FCEB7F0F5B96L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.I));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/aCv" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private Vector3d a(ScaledResolution scaledResolution, double d, double d2, double d3) {
        GL11.glGetFloat((int)2982, (FloatBuffer)this.M);
        GL11.glGetFloat((int)2983, (FloatBuffer)this.K);
        GL11.glGetInteger((int)2978, (IntBuffer)this.J);
        if (afs_2.a((float)d, (float)d2, (float)d3, this.M, this.K, this.J, this.H)) {
            return new Vector3d((double)(aHB.b(this.H, 0) / (float)ScaledResolutionInvoker.getScaleFactor(scaledResolution)), (double)(((float)DisplayInvoker.getHeight() - aHB.b(this.H, 1)) / (float)ScaledResolutionInvoker.getScaleFactor(scaledResolution)), (double)aHB.b(this.H, 2));
        }
        return null;
    }

    private float c(@NonNull ItemStack itemStack) {
        HUD.j();
        float f = 0.0f;
        if (act_2.k(itemStack) instanceof ItemArmor) {
            ItemArmor itemArmor = (ItemArmor)act_2.k(itemStack);
            f = (float)((double)f + ((double)itemArmor.o + (double)((100 - itemArmor.o) * alf_0.a(yl_2.x.c, itemStack)) * 0.0075));
            f = (float)((double)f + (double)alf_0.a(yl_2.D.c, itemStack) / 100.0);
            f = (float)((double)f + (double)alf_0.a(yl_2.o.c, itemStack) / 100.0);
            f = (float)((double)f + (double)alf_0.a(yl_2.h.c, itemStack) / 100.0);
            f = (float)((double)f + (double)alf_0.a(yl_2.k.c, itemStack) / 50.0);
            f = (float)((double)f + (double)alf_0.a(yl_2.v.c, itemStack) / 100.0);
        }
        return f;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ItemESP.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

