/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.Render2DEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.EntityRendererInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import deobf.Entity;
import deobf.EntityPlayer;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.visual.HUD;
import deobf.IntProperty;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;

import org.checkerframework.checker.nullness.qual.NonNull;

public class Glow
extends AbstractModule {
    @Property(value="mode")
    private StringProperty H;
    private static String[] Q;
    @Property(value="radius")
    private IntProperty I;
    @Property(value="color")
    private eu_0 J;
    private static long O;
    @Property(value="color-outline-mode")
    private StringProperty M;
    @Property(value="color-shader-mode")
    private StringProperty N;
    @Property(value="targets")
    private ListProperty<String> L;
    @Property(value="color-outline-state")
    private StringProperty K;
    private static String[] P;
    private static Map R;

    private Boolean lambda$new$4() {
        return auk_2.b(StringPropertyInvoker.isMode(this.H, aii_2.b));
    }

    public eu_0 d() {
        return this.J;
    }

    private Boolean lambda$new$0() {
        return auk_2.b(StringPropertyInvoker.isMode(this.H, aii_2.k));
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = Glow.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    public IntProperty b() {
        return this.I;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/aCj" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x5C83;
        if (Q[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])R.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                R.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/aCj", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return Q[n2];
    }

    private void lambda$onRender2D$5() {
        HUD.j();
        EntityRendererInvoker.a(this.mc.entityRenderer, this.mc.timer.renderPartialTicks, 0);
        Iterator iterator = ListInvoker.iterator((List)aMF.a(aMF.b(ListInvoker.stream(BlockInvoker.e(this.mc.world)), this::b), aB0.a()));
        if (dz_0.c(iterator)) {
            Entity entity = (Entity)dz_0.b(iterator);
            FT.b(MCInvoker.j(this.mc), entity, this.mc.timer.renderPartialTicks);
        }
        EntityRendererInvoker.b(this.mc.entityRenderer);
    }

    private Boolean lambda$new$1() {
        HUD.j();
        return auk_2.b(StringPropertyInvoker.isMode(this.H, aii_2.g) && StringPropertyInvoker.isMode(this.M, aii_2.h));
    }

    public Glow(@NonNull ModuleManager moduleManager, EnumModuleType enumModuleType, int n, char c, int n2, String string) {
        long l4 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ O;
        long l5 = l4 ^ 0x1834197C86E1L;
        int n3 = (int)(l5 >>> 56);
        long l6 = l5 << 8 >>> 8;
        super((byte)n3, moduleManager, l6, enumModuleType, string);
        this.H = StringPropertyInvoker.b(asp_2.a((String)((Object)Glow.b("a", (int)11653, (long)(0x46592CD8332BD0CBL ^ l4)))), new String[]{Glow.b("a", (int)4602, (long)(0x7DAE26CCD1B96CB7L ^ l4)), Glow.b("a", (int)4313, (long)(0x4CFB9DE4489CED95L ^ l4))});
        this.I = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(15)), P8.d(1)), P8.d(50));
        this.J = asp_2.b(P8.d(-5751202));
        this.M = StringPropertyInvoker.b(asp_2.a((String)((Object)Glow.b("a", (int)25431, (long)(0x5916A9589C289E14L ^ l4)))), new String[]{Glow.b("a", (int)7062, (long)(0x73B0121E698D66D9L ^ l4)), Glow.b("a", (int)4357, (long)(0x3673E4EBBCBBEC4FL ^ l4)), Glow.b("a", (int)3820, (long)(0x77ABA46A8E6EF3BDL ^ l4))});
        this.K = StringPropertyInvoker.b(asp_2.a((String)((Object)Glow.b("a", (int)23592, (long)(0x25D2FC2895C5217CL ^ l4)))), new String[]{Glow.b("a", (int)4357, (long)(0x3673E4EBBCBBEC4FL ^ l4)), Glow.b("a", (int)277, (long)(0x15C70B3FB9C6FC4FL ^ l4))});
        this.N = StringPropertyInvoker.b(asp_2.a((String)((Object)Glow.b("a", (int)4357, (long)(0x3673E4EBBCBBEC4FL ^ l4)))), new String[]{Glow.b("a", (int)4357, (long)(0x3673E4EBBCBBEC4FL ^ l4)), Glow.b("a", (int)4856, (long)(0x5A90CD594E8AEFA1L ^ l4)), Glow.b("a", (int)31463, (long)(0x3F3C3905B87187A1L ^ l4))});
        this.L = ava_0.a(asp_2.a(Glow.b("a", (int)6490, (long)(0x7C7D5E2AD4DB6402L ^ l4))), new String[]{Glow.b("a", (int)17130, (long)(0x6181E5EEEBD93FB9L ^ l4)), Glow.b("a", (int)14234, (long)(0x293812B1BB7FCACCL ^ l4)), Glow.b("a", (int)8608, (long)(0x7AC8D42DCA09DCE5L ^ l4)), Glow.b("a", (int)23802, (long)(0x2C2FB054B88DA1A5L ^ l4))});
        ManagerInvoker.put(new Setting((String)((Object)Glow.b("a", (int)5993, (long)(0x788E870E5F0F6A3CL ^ l4))), (String)((Object)Glow.b("a", (int)31154, (long)(0x26903D631C9D04F9L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.H));
        ManagerInvoker.put(new Setting((String)((Object)Glow.b("a", (int)14373, (long)(0x73B653AF18264577L ^ l4))), (String)((Object)Glow.b("a", (int)7182, (long)(0x387C9A788FBB6150L ^ l4))), SettingType.SELECTBOX, (AbstractModule)this, this.L));
        ManagerInvoker.put(new Setting((String)((Object)Glow.b("a", (int)7642, (long)(0x36D0FD8B058D608DL ^ l4))), (String)((Object)Glow.b("a", (int)22596, (long)(0x777FAD6AE1992518L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.M, this::lambda$new$0));
        ManagerInvoker.put(new Setting((String)((Object)Glow.b("a", (int)23755, (long)(0xEA93B50428A190L ^ l4))), (String)((Object)Glow.b("a", (int)13937, (long)(0x3E15E4DD25D5CB31L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.K, this::lambda$new$1));
        ManagerInvoker.put(new Setting((String)((Object)Glow.b("a", (int)26447, (long)(0x2CC77967DA551A1FL ^ l4))), (String)((Object)Glow.b("a", (int)7287, (long)(0x1D49A07442E1E12AL ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.N, this::lambda$new$2));
        ManagerInvoker.put(new Setting((String)((Object)Glow.b("a", (int)30780, (long)(0x5AA97B5FBE0B8578L ^ l4))), (String)((Object)Glow.b("a", (int)28936, (long)(0x5EDA188412120C4FL ^ l4))), SettingType.COLOR_PICKER, (AbstractModule)this, this.J, null, this::lambda$new$3));
        ManagerInvoker.put(new Setting((String)((Object)Glow.b("a", (int)20105, (long)(0x4FF11CDAD7D633CBL ^ l4))), (String)((Object)Glow.b("a", (int)5235, (long)(0x434957874B29E932L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.I, 1.0, this::lambda$new$4));
    }

    static {
        O = a1c.a(86149196633048367L, -4951998020159468220L, MethodHandles.lookup().lookupClass()).a(87773684370518L);
        R = new HashMap(13);
        long l4 = O ^ 0x29BB4E7B3D46L;
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

    @EventTarget
    public void a(Render2DEvent render2DEvent) {
        HUD.j();
        if (StringPropertyInvoker.isMode(this.H, aii_2.n)) {
            agg_2.a(agg_2.c(), P8.b((Integer)adt_2.a(this.I)), aUL.g(this.J), true, this::lambda$onRender2D$5, StringPropertyInvoker.isMode(this.N, aii_2.l) ? new Color(hb_2.a(0L)) : (StringPropertyInvoker.isMode(this.N, aii_2.f) ? aUL.c(this.J) : null));
        }
    }

    private Boolean lambda$new$2() {
        return auk_2.b(StringPropertyInvoker.isMode(this.H, aii_2.a));
    }

    public StringProperty c() {
        return this.K;
    }

    private boolean a(Entity entity) {
        HUD.j();
        return ava_0.b(this.L, aii_2.j) && entity instanceof EntityPlayer || ava_0.b(this.L, aii_2.c) && (entity instanceof ne_2 || entity instanceof ny_1) || ava_0.b(this.L, aii_2.p) && (entity instanceof nz_0 || entity instanceof np_1) || ava_0.b(this.L, aii_2.m) && entity instanceof n5_0;
    }

    public StringProperty a() {
        return this.N;
    }

    private Boolean lambda$new$3() {
        HUD.j();
        return auk_2.b(StringPropertyInvoker.isMode(this.H, aii_2.e) && StringPropertyInvoker.isMode(this.N, aii_2.d) || StringPropertyInvoker.isMode(this.H, aii_2.i) && StringPropertyInvoker.isMode(this.M, aii_2.o));
    }

    public ListProperty<String> f() {
        return this.L;
    }

    @Override
    public void o() {
    }

    public StringProperty e() {
        return this.M;
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

    public StringProperty g() {
        return this.H;
    }

    public boolean b(Entity entity) {
        HUD.j();
        return entity != null && ayj_0.a(entity) && !ayj_0.L(entity) && entity != this.mc.player && this.a(entity);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Glow.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

