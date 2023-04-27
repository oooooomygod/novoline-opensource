/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.Render3DEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import deobf.Entity;
import deobf.EntityPlayer;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.visual.HUD;
import deobf.MCInvoker;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.Minecraft;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.lwjgl.opengl.GL11;

public class SimsESP
extends AbstractModule {
    @Property(value="color-mode")
    private StringProperty H;
    private double I;
    private static long K = a1c.a(3111184952030006415L, -2060197311251885323L, MethodHandles.lookup().lookupClass()).a(220922820427607L);
    private static String[] L;
    private static String[] M;
    @Property(value="color")
    private eu_0 J;
    private static Map N;

    private boolean lambda$getEntityPlayerList$1(EntityPlayer entityPlayer) {
        return entityPlayer != this.mc.player;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = SimsESP.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/aCc" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    public SimsESP(@NonNull int n, ModuleManager moduleManager, EnumModuleType enumModuleType, String string, char c, String string2, char c2) {
        long l4 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)c2 << 48 >>> 48) ^ K;
        long l5 = l4 ^ 0x3E2B28F93BFFL;
        int n2 = (int)(l5 >>> 48);
        int n3 = (int)(l5 << 16 >>> 48);
        int n4 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n2, enumModuleType, string, (char)n3, n4, string2);
        this.H = StringPropertyInvoker.b(asp_2.a((String)((Object)SimsESP.b("b", (int)31614, (long)(0x122492FEA4AC06F4L ^ l4)))), new String[]{SimsESP.b("b", (int)16972, (long)(0x1CFA967446883FCAL ^ l4)), SimsESP.b("b", (int)23922, (long)(0x245B24951AD4A0FAL ^ l4)), SimsESP.b("b", (int)20105, (long)(0xAC2E452F9F2B304L ^ l4)), SimsESP.b("b", (int)4577, (long)(0x56EA53E1E97E6C68L ^ l4)), SimsESP.b("b", (int)13488, (long)(0xDD0C2E4CD9AC937L ^ l4))});
        this.J = asp_2.b(P8.d(aol_1.b(new Color(0, 255, 0, 255))));
        ManagerInvoker.put(new Setting((String)((Object)SimsESP.b("b", (int)333, (long)(0x50F819A68F08FCC1L ^ l4))), (String)((Object)SimsESP.b("b", (int)21613, (long)(0x79CFC5087E2B29E2L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.H));
        ManagerInvoker.put(new Setting((String)((Object)SimsESP.b("b", (int)18349, (long)(0x70278A40CA9FBA26L ^ l4))), (String)((Object)SimsESP.b("b", (int)10652, (long)(0x3F777EC43C0BD412L ^ l4))), SettingType.COLOR_PICKER, (AbstractModule)this, this.J, null, this::lambda$new$0));
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x1621;
        if (M[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])N.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                N.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/aCc", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return M[n2];
    }

    static {
        N = new HashMap(13);
        long l4 = K ^ 0x6460E6690A10L;
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

    private List<EntityPlayer> a() {
        return (List)aMF.a(aMF.a(aMF.b(ListInvoker.stream(BlockInvoker.s(this.mc.world)), this::lambda$getEntityPlayerList$1), aN_.a(this::lambda$getEntityPlayerList$2)), aB0.a());
    }

    private Boolean lambda$new$0() {
        return auk_2.b(StringPropertyInvoker.isMode(this.H, ap5_0.d));
    }

    @EventTarget
    public void a(Render3DEvent render3DEvent) {
        HUD.t();
        if (!ListInvoker.isEmpty(this.a())) {
            this.I += 0.5;
            long l4 = 0L;
            int n = 0;
            if (n < ListInvoker.size(this.a())) {
                EntityPlayer entityPlayer = (EntityPlayer)ListInvoker.get(this.a(), n);
                if (entityPlayer != this.mc.player && !a6w_0.i(entityPlayer)) {
                    Color color = aUL.c(this.J);
                    if (StringPropertyInvoker.isMode(this.H, ap5_0.c)) {
                        double d = a6w_0.z(entityPlayer) / (a6w_0.O(entityPlayer) / 100.0f) / 100.0f;
                        color = new Color(a1V.a(new Color(255, 93, 93), new Color(44, 255, 90), (double)((float)d)));
                    }
                    if (StringPropertyInvoker.isMode(this.H, ap5_0.a)) {
                        color = pl_1.a(entityPlayer);
                    }
                    if (StringPropertyInvoker.isMode(this.H, ap5_0.e)) {
                        color = new Color(hb_2.a(l4));
                        l4 -= 120L;
                    }
                    if (StringPropertyInvoker.isMode(this.H, ap5_0.b)) {
                        color = new Color(hb_2.b(l4));
                        l4 -= 120L;
                    }
                    this.a(render3DEvent, entityPlayer, color);
                }
                ++n;
            }
        }
    }

    private void a(Render3DEvent render3DEvent, Entity entity, Color color) {
        double d = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double)a1j.a(render3DEvent) - MCInvoker.j((Minecraft)this.mc).s;
        HUD.j();
        double d2 = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)a1j.a(render3DEvent) - MCInvoker.j((Minecraft)this.mc).h;
        double d3 = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double)a1j.a(render3DEvent) - MCInvoker.j((Minecraft)this.mc).m;
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2896);
        GlStateManagerInvoker.A();
        GlStateManagerInvoker.enableDepth();
        GL11.glDepthMask((boolean)true);
        GL11.glShadeModel((int)7424);
        double d4 = 0.2;
        double d5 = (double)entity.n + 0.7;
        GL11.glBegin((int)5);
        int n = 0;
        int cfr_ignored_0 = n % 60;
        a1V.a(color);
        GL11.glVertex3d((double)d, (double)(d2 + d5 + 0.35), (double)d3);
        GL11.glVertex3d((double)(d + -MathInvoker.i(MathInvoker.o(this.I + (double)n)) * d4), (double)(d2 + d5), (double)(d3 + MathInvoker.m(MathInvoker.o(this.I + (double)n)) * d4));
        color = this.a(color);
        ++n;
        GL11.glEnd();
        Color color2 = aol_1.d(color);
        GL11.glBegin((int)5);
        int n2 = 0;
        int cfr_ignored_1 = n2 % 60;
        a1V.a(color2);
        GL11.glVertex3d((double)d, (double)(d2 + d5 - 0.35), (double)d3);
        GL11.glVertex3d((double)(d + -MathInvoker.i(MathInvoker.o(this.I + (double)n2)) * d4), (double)(d2 + d5), (double)(d3 + MathInvoker.m(MathInvoker.o(this.I + (double)n2)) * d4));
        color2 = this.a(color2);
        ++n2;
        GL11.glEnd();
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    private Color a(Color color) {
        return new Color(MathInvoker.max(0, aol_1.c(color) - 15), MathInvoker.max(0, aol_1.g(color) - 15), MathInvoker.max(0, aol_1.f(color) - 15));
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

    private Float lambda$getEntityPlayerList$2(EntityPlayer entityPlayer) {
        return axx_1.a(a6w_0.a(entityPlayer, (Entity)this.mc.player));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(SimsESP.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

