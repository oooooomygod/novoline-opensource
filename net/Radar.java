/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.Render2DEvent;
import cc.novoline.events.events.RenderGuiEvent;
import cc.novoline.events.events.ShaderEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import deobf.EntityPlayer;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.visual.HUD;
import deobf.IntProperty;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import java.awt.Color;
import java.awt.Dimension;
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
import org.lwjgl.opengl.GL11;

public class Radar
extends AbstractModule {
    int H;
    @Property(value="radar-x-position")
    private IntProperty M;
    @Property(value="radar-size")
    private DoubleProperty O;
    @Property(value="radar-scale")
    private DoubleProperty U;
    private int J;
    @Property(value="background-roundness")
    private DoubleProperty V;
    @Property(value="background-smoothness")
    private IntProperty N;
    private static Map ab;
    @Property(value="radar-y-position")
    private IntProperty P;
    private static String[] Y;
    int I;
    private int L;
    @Property(value="radar-alpha")
    private IntProperty T;
    private Dimension Q;
    @Property(value="blur")
    private BooleanProperty K;
    private static String[] Z;
    private static long X;
    boolean S;
    @Property(value="radar-background")
    private StringProperty W;
    @Property(value="hide-on-debug")
    private BooleanProperty R;

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = Radar.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    @EventTarget
    public void b(Render2DEvent render2DEvent) {
        HUD.t();
        if (this.a(auk_2.a((Boolean)Ba.b(this.R)))) {
            double d = ua_2.a(true);
            this.a(render2DEvent);
            ua_2.a(d);
        }
    }

    public Radar(@NonNull ModuleManager moduleManager, int n, EnumModuleType enumModuleType, int n2, String string, char c) {
        long l4 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)c << 48 >>> 48) ^ X;
        long l5 = l4 ^ 0x29E8D07B9B6AL;
        int n3 = (int)(l5 >>> 56);
        long l6 = l5 << 8 >>> 8;
        super((byte)n3, moduleManager, l6, enumModuleType, string);
        this.Q = aj7.a(aj7.a());
        this.J = (int)(anv_0.a(this.Q) / 2.0);
        this.L = (int)(anv_0.b(this.Q) / 2.0);
        this.U = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(0.85)), db_0.a(0.25)), db_0.a(5.0));
        this.O = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(120.0)), db_0.a(50.0)), db_0.a(200.0));
        this.T = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(120)), P8.d(100)), P8.d(200));
        this.W = StringPropertyInvoker.b(asp_2.a((String)((Object)Radar.b("q", (int)4350, (long)(0x1DB8196FDA681FEDL ^ l4)))), new String[]{Radar.b("q", (int)10223, (long)(0x7F0FAA7BA01FA8F6L ^ l4)), Radar.b("q", (int)4568, (long)(0x66DC62F8484F1ECCL ^ l4))});
        this.K = asp_2.c();
        this.R = asp_2.c();
        this.V = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(12.0)), db_0.a(0.0)), db_0.a(48.0));
        this.N = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(1)), P8.d(0)), P8.d(16));
        this.M = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(5)), P8.d(1)), P8.d(this.J));
        this.P = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(152)), P8.d(1)), P8.d(this.L));
        ManagerInvoker.put(new Setting((String)((Object)Radar.b("q", (int)2414, (long)(0x514A76092F33067BL ^ l4))), (String)((Object)Radar.b("q", (int)4554, (long)(0x2FBD4877AB819ED6L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.O, 5.0));
        ManagerInvoker.put(new Setting((String)((Object)Radar.b("q", (int)8178, (long)(0x2A5F4561ECB410E3L ^ l4))), (String)((Object)Radar.b("q", (int)23328, (long)(0x66C87C16F3F9D432L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.U, 0.05));
        ManagerInvoker.put(new Setting((String)((Object)Radar.b("q", (int)18448, (long)(0x5AE3118C8762C70EL ^ l4))), (String)((Object)Radar.b("q", (int)6947, (long)(0x4C9E07BE7F619433L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.W));
        ManagerInvoker.put(new Setting((String)((Object)Radar.b("q", (int)32657, (long)(0x73C360EEC5FE7096L ^ l4))), (String)((Object)Radar.b("q", (int)21254, (long)(0xAF11D7BA6D95C1CL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.T, 5.0));
        ManagerInvoker.put(new Setting((String)((Object)Radar.b("q", (int)2374, (long)(0x476485DB94650640L ^ l4))), (String)((Object)Radar.b("q", (int)29209, (long)(0x756527B906FBFD0FL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.V, 1.0, this::lambda$new$0));
        ManagerInvoker.put(new Setting((String)((Object)Radar.b("q", (int)17620, (long)(0x510CB48F86F54BCBL ^ l4))), (String)((Object)Radar.b("q", (int)6631, (long)(0x3A3975C7F30F96FCL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.N, 1.0));
        ManagerInvoker.put(new Setting((String)((Object)Radar.b("q", (int)25021, (long)(0x45000ECB567D6EA5L ^ l4))), (String)((Object)Radar.b("q", (int)31969, (long)(0x6FB8E26D70E973E5L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.K));
        ManagerInvoker.put(new Setting((String)((Object)Radar.b("q", (int)28320, (long)(0x5B56A7D48D42E1BDL ^ l4))), (String)((Object)Radar.b("q", (int)23661, (long)(0x4CF26F201C7BD37AL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.R));
    }

    private Boolean lambda$new$0() {
        return auk_2.b(StringPropertyInvoker.isMode(this.W, cj_1.a));
    }

    @EventTarget
    public void a(ShaderEvent shaderEvent) {
        HUD.j();
        if (auk_2.a((Boolean)Ba.b(this.K)) && this.a(auk_2.a((Boolean)Ba.b(this.R)))) {
            double d = ua_2.a(true);
            double d2 = P8.b((Integer)adt_2.a(this.M));
            double d3 = P8.b((Integer)adt_2.a(this.P));
            a1V.a(d2, d3, db_0.b((Double)MD.b(this.O)), db_0.b((Double)MD.b(this.O)), StringPropertyInvoker.isMode(this.W, cj_1.b) ? db_0.b((Double)MD.b(this.V)) / 2.0 : db_0.b((Double)MD.b(this.O)) / 2.0, hb_2.a(asx_1.BLACK));
            ua_2.a(d);
        }
    }

    private void a(int n) {
        HUD.t();
        Iterator iterator = ListInvoker.iterator((List)aMF.a(aMF.b(ListInvoker.stream(BlockInvoker.s(this.mc.world)), this::lambda$renderCricles$1), aB0.a()));
        if (dz_0.c(iterator)) {
            EntityPlayer entityPlayer = (EntityPlayer)dz_0.b(iterator);
            float f = ae4_0.a(entityPlayer.posX, entityPlayer.posZ);
            float f2 = -(f - this.mc.player.rotationYaw + 180.0f);
            double d = MathInvoker.o(f2);
            double d2 = MathInvoker.a(this.mc.player.posX - entityPlayer.posX);
            double d3 = MathInvoker.a(this.mc.player.posZ - entityPlayer.posZ);
            double d4 = MathInvoker.d(d2 * d2 + d3 * d3) / db_0.b((Double)MD.b(this.U));
            double d5 = MathInvoker.i(d);
            double d6 = MathInvoker.m(d);
            double d7 = db_0.b((Double)MD.b(this.O)) * 1.05;
            if (d5 > 0.0 && d6 < 0.0 && d5 * d4 < d7 / 2.0 && -d6 * d4 < d7 / 2.0 || d5 < 0.0 && d6 < 0.0 && -d5 * d4 < d7 / 2.0 && -d6 * d4 < d7 / 2.0 || d5 > 0.0 && d6 > 0.0 && d5 * d4 < d7 / 2.0 && d6 * d4 < d7 / 2.0 || d5 < 0.0 && d6 > 0.0 && -d5 * d4 < d7 / 2.0 && d6 * d4 < d7 / 2.0) {
                aV3.a(aV3.a(), (double)P8.b((Integer)adt_2.a(this.M)) + MathInvoker.i(d) * d4 - 1.0 + db_0.b((Double)MD.b(this.O)) / 2.0, (double)P8.b((Integer)adt_2.a(this.P)) + MathInvoker.m(d) * d4 - 1.0 + db_0.b((Double)MD.b(this.O)) / 2.0, 1.5 + 1.5 * (1.0 - 0.0625 * (double)P8.b((Integer)adt_2.a(this.N))), 0.1875 * (double)P8.b((Integer)adt_2.a(this.N)), new Color(n), true);
            }
        }
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x3349;
        if (Z[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])ab.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                ab.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/aCQ", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return Z[n2];
    }

    static {
        X = a1c.a(-4634704776831682343L, 7596088353146619723L, MethodHandles.lookup().lookupClass()).a(104936933542437L);
        ab = new HashMap(13);
        long l4 = X ^ 0x4CCE4C5DA136L;
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

    public void a(Render2DEvent render2DEvent) {
        HUD.t();
        double d = P8.b((Integer)adt_2.a(this.M));
        double d2 = P8.b((Integer)adt_2.a(this.P));
        Color color = new Color(0, 0, 0, P8.b((Integer)adt_2.a(this.T)));
        if (StringPropertyInvoker.isMode(this.W, cj_1.c)) {
            aV3.a(aV3.a(), d, d2, db_0.b((Double)MD.b(this.O)), db_0.b((Double)MD.b(this.O)), db_0.b((Double)MD.b(this.V)), (double)P8.b((Integer)adt_2.a(this.N)), color, true);
        }
        aV3.a(aV3.a(), d + db_0.b((Double)MD.b(this.O)) / 2.0, d2 + db_0.b((Double)MD.b(this.O)) / 2.0, db_0.b((Double)MD.b(this.O)), P8.b((Integer)adt_2.a(this.N)), color, true);
        int n = hb_2.a(0L);
        double d3 = 4.25;
        a1V.b(d + db_0.b((Double)MD.b(this.O)) / 2.0 - 0.25, d2 + db_0.b((Double)MD.b(this.O)) / 2.0 - d3, d + db_0.b((Double)MD.b(this.O)) / 2.0 + 0.25, (double)((float)(d2 + db_0.b((Double)MD.b(this.O)) / 2.0 + d3)), n);
        a1V.b(d + db_0.b((Double)MD.b(this.O)) / 2.0 - d3, d2 + db_0.b((Double)MD.b(this.O)) / 2.0 - 0.25, d + db_0.b((Double)MD.b(this.O)) / 2.0 + d3, d2 + db_0.b((Double)MD.b(this.O)) / 2.0 + 0.25, n);
        adp_0.b(false);
        a1V.a(d, d2, db_0.b((Double)MD.b(this.O)), db_0.b((Double)MD.b(this.O)), db_0.b((Double)MD.b(this.V)) / 2.0, hb_2.a(asx_1.BLACK));
        adp_0.a(true);
        this.a(n);
        adp_0.a();
    }

    private boolean a(boolean bl) {
        HUD.j();
        return !bl || !this.mc.gameSettings.ar;
    }

    @EventTarget
    public void a(RenderGuiEvent renderGuiEvent) {
        block5: {
            block7: {
                int n;
                int n2;
                int n3;
                int n4;
                block6: {
                    HUD.t();
                    if (!(HN.d(renderGuiEvent) instanceof GuiChat) || !this.a(auk_2.a((Boolean)Ba.b(this.R)))) break block5;
                    n4 = ua_2.a(HN.b(renderGuiEvent));
                    n3 = ua_2.b(HN.a(renderGuiEvent));
                    n2 = P8.b((Integer)adt_2.a(this.M));
                    n = P8.b((Integer)adt_2.a(this.P));
                    if (HN.c(renderGuiEvent) != alw_0.CLICK) break block6;
                    if (!this.a(n2, n, n4, n3) || HN.e(renderGuiEvent) != 0) break block5;
                    this.H = n2 - n4;
                    this.I = n - n3;
                    this.S = true;
                }
                if (HN.c(renderGuiEvent) != alw_0.RENDER) break block7;
                if (this.S) {
                    adt_2.b(this.M, P8.d(MathHelper.a(this.H + n4, P8.b((Integer)adt_2.b(this.M)), P8.b((Integer)adt_2.c(this.M)))));
                    adt_2.b(this.P, P8.d(MathHelper.a(this.I + n3, P8.b((Integer)adt_2.b(this.P)), P8.b((Integer)adt_2.c(this.P)))));
                }
                if (!this.a(n2, n, n4, n3)) break block5;
                GL11.glPushMatrix();
                ua_2.a(true);
                int n5 = hb_2.a(hb_2.a(asx_1.BLACK), 100);
                a1V.a((double)n2, (double)n, db_0.b((Double)MD.b(this.O)), db_0.b((Double)MD.b(this.O)), StringPropertyInvoker.isMode(this.W, cj_1.d) ? db_0.b((Double)MD.b(this.V)) / 2.0 : db_0.b((Double)MD.b(this.O)) / 2.0, 2.5f, n5, hb_2.a(asx_1.WHITE));
                GL11.glPopMatrix();
            }
            if (HN.c(renderGuiEvent) == alw_0.RELEASE && HN.e(renderGuiEvent) == 0) {
                this.S = false;
            }
        }
    }

    private boolean a(int n, int n2, int n3, int n4) {
        HUD.j();
        double d = this.a(n, n2)[2];
        double d2 = this.a(n, n2)[3];
        return n3 >= n && (double)n3 < d && n4 >= n2 && (double)n4 < d2;
    }

    private boolean lambda$renderCricles$1(EntityPlayer entityPlayer) {
        HUD.t();
        return entityPlayer != this.mc.player && entityPlayer != null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/aCQ" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private double[] a(int n, int n2) {
        double d = (double)n + db_0.b((Double)MD.b(this.O));
        double d2 = (double)n2 + db_0.b((Double)MD.b(this.O));
        return new double[]{n, n2, d, d2};
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Radar.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

