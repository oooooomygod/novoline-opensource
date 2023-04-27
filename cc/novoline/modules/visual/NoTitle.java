/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.visual;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.LoadWorldEvent;
import cc.novoline.events.events.PacketEvent;
import cc.novoline.events.events.Render2DEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.PacketEventInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.utils.Timer;
import cc.novoline.utils.fonts.api.FontRenderer;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.configurations.annotation.Property;
import net.minecraft.network.packts.S45PacketTitle;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import net.Ba;
import net.BooleanProperty;
import net.ModuleManager;
import net.ScaledResolution;
import net.StringProperty;
import net._j_0;
import net.a1c;
import net.a7l_0;
import net.aBO;
import net.abl_1;
import net.adj_1;
import net.amy_0;
import net.asp_2;
import net.auk_2;
import net.avj_1;
import net.ax4_0;
import net.hb_2;
import net.pI;
import net.uc_0;
import net.xz_0;
import org.checkerframework.checker.nullness.qual.NonNull;

public class NoTitle
extends AbstractModule {
    private String L;
    private ax4_0 I;
    private int N;
    private static long O = a1c.a(-7729311920249371859L, 4656771321914220581L, MethodHandles.lookup().lookupClass()).a(169481117443597L);
    private static String[] Q;
    private static String[] P;
    private Timer K;
    @Property(value="style")
    private StringProperty J;
    private static Map R;
    @Property(value="no-render")
    private BooleanProperty M;
    private String H;

    private Boolean lambda$new$0() {
        HUD.t();
        return auk_2.b(!auk_2.a((Boolean)Ba.b(this.M)));
    }

    @EventTarget
    public void a(LoadWorldEvent loadWorldEvent) {
        this.L = null;
        this.H = null;
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x5EF0;
        if (Q[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])R.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                R.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/aCl", exception);
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
    public void a(PacketEvent packetEvent) {
        HUD.j();
        if (PacketEventInvoker.c(packetEvent) instanceof S45PacketTitle) {
            S45PacketTitle s45PacketTitle = (S45PacketTitle)PacketEventInvoker.c(packetEvent);
            if (StringPropertyInvoker.isMode(this.J, amy_0.c)) {
                if (avj_1.d(s45PacketTitle) == xz_0.TITLE) {
                    this.L = aBO.a(avj_1.e(s45PacketTitle));
                }
                if (avj_1.d(s45PacketTitle) == xz_0.SUBTITLE) {
                    this.H = aBO.a(avj_1.e(s45PacketTitle));
                }
                abl_1.b(this.K);
                _j_0.a(this.I, 0.0);
                this.N = 255;
            }
            if (StringPropertyInvoker.isMode(this.J, amy_0.b) || auk_2.a((Boolean)Ba.b(this.M))) {
                PacketEventInvoker.setCancelled(packetEvent, true);
            }
        }
    }

    @EventTarget
    public void a(Render2DEvent render2DEvent) {
        HUD.t();
        if (StringPropertyInvoker.isMode(this.J, amy_0.a)) {
            ScaledResolution scaledResolution = uc_0.a(render2DEvent);
            FontRenderer fontRenderer = adj_1.a(pI.a, 46);
            FontRenderer fontRenderer2 = adj_1.a(pI.a, 38);
            int n = hb_2.a(255, 255, 255, this.N);
            double d = ScaledResolutionInvoker.e(scaledResolution) / 2.0;
            double d2 = 114.0;
            _j_0.a(this.I, d, d2, 0.1, () -> this.lambda$onRender2D$1(fontRenderer, scaledResolution, n, fontRenderer2), 300L);
            this.N = (int)(255.0 - abl_1.a(this.K, 4000L, 255.0));
            if (this.N <= 40) {
                this.L = null;
                this.H = null;
            }
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = NoTitle.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    @Override
    public void w() {
        this.L = null;
        this.H = null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/aCl" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private void lambda$onRender2D$1(FontRenderer fontRenderer, ScaledResolution scaledResolution, int n, FontRenderer fontRenderer2) {
        HUD.t();
        if (this.L != null && !StringInvoker.g(this.L)) {
            a7l_0.a(fontRenderer, (CharSequence)this.L, ScaledResolutionInvoker.e(scaledResolution) / 2.0 - (double)(a7l_0.a(fontRenderer, this.L) / 2), 100.0, n, true, true);
        }
        if (this.H != null && !StringInvoker.g(this.H)) {
            a7l_0.a(fontRenderer2, (CharSequence)this.H, ScaledResolutionInvoker.e(scaledResolution) / 2.0 - (double)(a7l_0.a(fontRenderer2, this.H) / 2), 125.0, n, true, true);
        }
    }

    public NoTitle(@NonNull ModuleManager moduleManager, int n, int n2, EnumModuleType enumModuleType, String string, char c, String string2) {
        long l4 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)c << 48 >>> 48) ^ O;
        long l5 = l4 ^ 0x64EA6FE81E60L;
        int n3 = (int)(l5 >>> 48);
        int n4 = (int)(l5 << 16 >>> 48);
        int n5 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n3, enumModuleType, string, (char)n4, n5, string2);
        this.J = StringPropertyInvoker.b(asp_2.a((String)((Object)NoTitle.b("j", (int)10618, (long)(0x3AC097B7E7ECB9B9L ^ l4)))), new String[]{NoTitle.b("j", (int)27948, (long)(0x96AA2A14567FDEDL ^ l4)), NoTitle.b("j", (int)27932, (long)(0x32279221C2497DDCL ^ l4))});
        this.M = asp_2.c();
        this.I = new ax4_0();
        this.K = new Timer();
        this.L = null;
        this.H = null;
        ManagerInvoker.put(new Setting((String)((Object)NoTitle.b("j", (int)9314, (long)(0x695454347D1434A7L ^ l4))), (String)((Object)NoTitle.b("j", (int)12093, (long)(0x1316053A9CF9BFF9L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.J, this::lambda$new$0));
        ManagerInvoker.put(new Setting((String)((Object)NoTitle.b("j", (int)251, (long)(0x49F375C3352D903CL ^ l4))), (String)((Object)NoTitle.b("j", (int)27135, (long)(0x54EDCB7919EA793DL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.M));
    }

    static {
        R = new HashMap(13);
        long l4 = O ^ 0x542AC84FBA05L;
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(NoTitle.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

