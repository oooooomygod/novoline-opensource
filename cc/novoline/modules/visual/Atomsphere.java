/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.visual;

import cc.novoline.events.EventTarget;
import cc.novoline.events.State;
import cc.novoline.events.events.PacketEvent;
import cc.novoline.events.events.Render2DEvent;
import cc.novoline.events.events.TickUpdateEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.PacketEventInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import deobf.IntProperty;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import net.minecraft.network.packts.S03PacketTimeUpdate;
import net.minecraft.network.packts.S2BPacketChangeGameState;
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
import net.DA;
import net.DoubleProperty;
import net.MD;
import net.ModuleManager;
import net.P8;
import net.StringProperty;
import net.a1c;
import net.adg_1;
import net.adt_2;
import net.asp_2;
import net.auk_2;
import net.db_0;
import org.checkerframework.checker.nullness.qual.NonNull;

public class Atomsphere
extends AbstractModule {
    @Property(value="time")
    private DoubleProperty I;
    @Property(value="weather-control")
    private BooleanProperty H;
    @Property(value="weather-mode")
    private StringProperty L;
    private long M;
    private static long N = a1c.a(-2002080600495315847L, -6427068558434546135L, MethodHandles.lookup().lookupClass()).a(162444182177512L);
    @Property(value="time-mode")
    private StringProperty J;
    private static String[] O;
    @Property(value="cycle-speed")
    private IntProperty K;
    private static Map Q;
    private static String[] P;

    static {
        Q = new HashMap(13);
        long l4 = N ^ 0x5D5833BC9C61L;
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

    public StringProperty a() {
        return this.L;
    }

    public Atomsphere(@NonNull byte by, int n, ModuleManager moduleManager, EnumModuleType enumModuleType, int n2, String string) {
        long l4 = ((long)by << 56 | (long)n << 32 >>> 8 | (long)n2 << 40 >>> 40) ^ N;
        long l5 = l4 ^ 0x4AA584FACB93L;
        int n3 = (int)(l5 >>> 56);
        long l6 = l5 << 8 >>> 8;
        super((byte)n3, moduleManager, l6, enumModuleType, string);
        this.J = StringPropertyInvoker.b(asp_2.a((String)((Object)Atomsphere.b("y", (int)1756, (long)(0x730633A81BCE8098L ^ l4)))), new String[]{Atomsphere.b("y", (int)14512, (long)(0x5EE993AA91FD3EE8L ^ l4)), Atomsphere.b("y", (int)7489, (long)(0x458B375300351B10L ^ l4))});
        this.I = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(12.0)), db_0.a(1.0)), db_0.a(24.0));
        this.K = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(5)), P8.d(1)), P8.d(20));
        this.L = StringPropertyInvoker.b(asp_2.a((String)((Object)Atomsphere.b("y", (int)13275, (long)(0x1A8F31C2EB633585L ^ l4)))), new String[]{Atomsphere.b("y", (int)32010, (long)(0x466B9449707BFB5DL ^ l4)), Atomsphere.b("y", (int)17893, (long)(0x90BE5BDD3C7C3B7L ^ l4)), Atomsphere.b("y", (int)1393, (long)(0x352C01697DBF8327L ^ l4)), Atomsphere.b("y", (int)22960, (long)(0x697559D639C1DFEDL ^ l4)), Atomsphere.b("y", (int)24752, (long)(0x3D8557E863FEE6E0L ^ l4))});
        this.H = asp_2.c();
        ManagerInvoker.put(new Setting((String)((Object)Atomsphere.b("y", (int)20033, (long)(0x682FC92E8910C806L ^ l4))), (String)((Object)Atomsphere.b("y", (int)55, (long)(0x999112B40210668L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.J));
        ManagerInvoker.put(new Setting((String)((Object)Atomsphere.b("y", (int)29956, (long)(0x26AC4712A6497350L ^ l4))), (String)((Object)Atomsphere.b("y", (int)3375, (long)(0x2A317938845F8B69L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.I, 0.5, this::lambda$new$0));
        ManagerInvoker.put(new Setting((String)((Object)Atomsphere.b("y", (int)19519, (long)(0x6022389C32ABCA65L ^ l4))), (String)((Object)Atomsphere.b("y", (int)26988, (long)(0x782743C293016F37L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.K, 1.0, this::lambda$new$1));
        ManagerInvoker.put(new Setting((String)((Object)Atomsphere.b("y", (int)243, (long)(0x224245437D9E06AAL ^ l4))), (String)((Object)Atomsphere.b("y", (int)21574, (long)(0x6A94580BAB0B5213L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.H));
        ManagerInvoker.put(new Setting((String)((Object)Atomsphere.b("y", (int)7922, (long)(0x53C90EE8D72D98A1L ^ l4))), (String)((Object)Atomsphere.b("y", (int)3794, (long)(0x1969B84AB31E888EL ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.L, this.H::get));
    }

    private Boolean lambda$new$1() {
        return auk_2.b(StringPropertyInvoker.isMode(this.J, DA.h));
    }

    @EventTarget
    public void a(Render2DEvent render2DEvent) {
        HUD.j();
        if (StringPropertyInvoker.isMode(this.J, DA.d)) {
            this.M += (long)P8.b((Integer)adt_2.a(this.K));
            BlockInvoker.a(this.mc.world, this.M);
            if (this.M > 24000L) {
                this.M = 0L;
            }
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

    private Boolean lambda$new$0() {
        return auk_2.b(StringPropertyInvoker.isMode(this.J, DA.c));
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x6AF0;
        if (P[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])Q.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                Q.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a__", exception);
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

    @EventTarget
    public void a(PacketEvent packetEvent) {
        HUD.j();
        if (PacketEventInvoker.getState(packetEvent).equals((Object)State.INCOMING)) {
            S2BPacketChangeGameState s2BPacketChangeGameState;
            if (auk_2.a((Boolean)Ba.b(this.H)) && PacketEventInvoker.c(packetEvent) instanceof S2BPacketChangeGameState && (adg_1.a(s2BPacketChangeGameState = (S2BPacketChangeGameState)PacketEventInvoker.c(packetEvent)) == 1 || adg_1.a(s2BPacketChangeGameState) == 2 || adg_1.a(s2BPacketChangeGameState) == 7 || adg_1.a(s2BPacketChangeGameState) == 8)) {
                PacketEventInvoker.setCancelled(packetEvent, true);
            }
            if (PacketEventInvoker.c(packetEvent) instanceof S03PacketTimeUpdate) {
                PacketEventInvoker.setCancelled(packetEvent, true);
            }
        }
    }

    /*
     * Exception decompiling
     */
    @EventTarget
    public void a(TickUpdateEvent var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getString(SwitchStringRewriter.java:404)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.access$600(SwitchStringRewriter.java:53)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:368)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:26)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewriteComplex(SwitchStringRewriter.java:201)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:73)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:881)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a__" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = Atomsphere.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Atomsphere.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

