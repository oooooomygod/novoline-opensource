/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.lwjgl.opengl.GL11
 */
package cc.novoline.modules.visual;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.Render3DEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.invoke.SystemInvoker;
import cc.novoline.modules.AbstractModule;
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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.Minecraft;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.lwjgl.opengl.GL11;

public class BreadCrumbs
extends AbstractModule {
    private static String[] M;
    private List<xv_1> H;
    @Property(value="color-mode")
    private StringProperty I;
    private static String[] L;
    private static Map N;
    @Property(value="color")
    private eu_0 J;
    private static long K;

    public int a(int n, int n2) {
        double d = MathInvoker.j(SystemInvoker.f() - (long)n * (long)n2) / 11.0;
        Color color = aol_1.b((float)((d %= 360.0) / 360.0), 1.0f, 0.7f);
        return aol_1.b(new Color(aol_1.c(color), aol_1.g(color), aol_1.f(color)));
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

    @EventTarget
    public void a(Render3DEvent render3DEvent) {
        HUD.j();
        if (PlayerInvoker.q(this.mc.player)) {
            ListInvoker.add(this.H, new xv_1(MCInvoker.j((Minecraft)this.mc).s, MCInvoker.j((Minecraft)this.mc).h + 0.1, MCInvoker.j((Minecraft)this.mc).m));
        }
        long l4 = 0L;
        GL11.glPushMatrix();
        GL11.glDisable((int)3553);
        GL11.glLineWidth((float)2.0f);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glEnable((int)2881);
        GL11.glEnable((int)2848);
        GL11.glBegin((int)3);
        Iterator iterator = ListInvoker.iterator(this.H);
        if (dz_0.c(iterator)) {
            xv_1 xv_12 = (xv_1)dz_0.b(iterator);
            ie_0.a(xv_12, ie_0.d(xv_12) + 1);
            if (ie_0.d(xv_12) > 250) {
                ListInvoker.remove(this.H, xv_12);
            }
            a1V.a(aol_1.b(this.a(l4)));
            GL11.glVertex3d((double)(ie_0.a(xv_12) - MCInvoker.j((Minecraft)this.mc).s), (double)(ie_0.c(xv_12) - MCInvoker.j((Minecraft)this.mc).h), (double)(ie_0.b(xv_12) - MCInvoker.j((Minecraft)this.mc).m));
            l4 -= 40L;
        }
        GL11.glEnd();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        GL11.glDisable((int)2881);
        GL11.glPopMatrix();
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = BreadCrumbs.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    public BreadCrumbs(@NonNull ModuleManager moduleManager, int n, byte by, EnumModuleType enumModuleType, String string, int n2) {
        long l4 = ((long)n << 32 | (long)by << 56 >>> 32 | (long)n2 << 40 >>> 40) ^ K;
        long l5 = l4 ^ 0x3A027E4CBAE2L;
        int n3 = (int)(l5 >>> 56);
        long l6 = l5 << 8 >>> 8;
        super((byte)n3, moduleManager, l6, enumModuleType, string);
        this.H = new CopyOnWriteArrayList<xv_1>();
        this.I = StringPropertyInvoker.b(asp_2.a((String)((Object)BreadCrumbs.b("g", (int)30360, (long)(0x5AD9293699D3ADE9L ^ l4)))), new String[]{BreadCrumbs.b("g", (int)2265, (long)(0x6CA62F029515D3ADL ^ l4)), BreadCrumbs.b("g", (int)2424, (long)(0x9F0C2DF3E1F520EL ^ l4))});
        this.J = asp_2.b(P8.d(aol_1.b(new Color(200, 200, 200))));
        ManagerInvoker.put(new Setting((String)((Object)BreadCrumbs.b("g", (int)9506, (long)(0x355FFF1E6AF17E50L ^ l4))), (String)((Object)BreadCrumbs.b("g", (int)22750, (long)(0x6C77AD88B66803ABL ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.I));
        ManagerInvoker.put(new Setting((String)((Object)BreadCrumbs.b("g", (int)32201, (long)(0x3F80F5F99881A6B9L ^ l4))), (String)((Object)BreadCrumbs.b("g", (int)7144, (long)(0x39445891A82AC09BL ^ l4))), SettingType.COLOR_PICKER, (AbstractModule)this, this.J, null, this::lambda$new$0));
    }

    static {
        K = a1c.a(-349076365272964045L, 686147453668328769L, MethodHandles.lookup().lookupClass()).a(56623069866933L);
        N = new HashMap(13);
        long l4 = K ^ 0x5C9ECDA17A72L;
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

    private Color a(long l4) {
        HUD.t();
        return StringPropertyInvoker.isMode(this.I, afp_2.b) ? aUL.c(this.J) : new Color(hb_2.a(l4));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_w" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private Boolean lambda$new$0() {
        return auk_2.b(StringPropertyInvoker.isMode(this.I, afp_2.a));
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x46A7;
        if (M[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])N.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                N.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_w", exception);
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(BreadCrumbs.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

