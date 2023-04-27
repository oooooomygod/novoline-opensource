/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.visual;

import cc.novoline.events.EventTarget;
import cc.novoline.events.State;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.events.PacketEvent;
import cc.novoline.events.events.Render3DEvent;
import cc.novoline.events.events.SettingEvent;
import cc.novoline.events.events.TickUpdateEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.PacketEventInvoker;
import cc.novoline.invoke.PlayerControllerInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.*;
import net.minecraft.network.packts.C07PacketPlayerDigging;
import net.minecraft.network.packts.C07PacketPlayerDigging$Action;
import net.minecraft.network.packts.C08PacketPlayerBlockPlacement;
import net.minecraft.network.packts.S23PacketBlockChange;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import net.Ba;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.BooleanProperty;
import net.INetHandlerPlayServer;
import net.ListProperty;
import net.MathHelper;
import net.ModuleManager;
import net.P8;
import net.StringProperty;
import net.a1c;
import net.aA5;
import net.aVG;
import net.adt_2;
import net.afm_0;
import net.amv_2;
import net.asp_2;
import net.atq_0;
import net.auk_2;
import net.ava_0;
import net.dz_0;
import net.gw_2;
import net.gz_2;
import net.hb_2;
import net.jv_0;
import net.minecraft.init.Blocks;
import net.my_0;
import net.qh_1;
import org.checkerframework.checker.nullness.qual.NonNull;

public class XRay
extends AbstractModule {
    @Property(value="delay")
    private IntProperty ae;
    private List<BlockPos> O;
    private int P;
    @Property(value="mode")
    private StringProperty J;
    private static String[] eb;
    private TimerUtil L;
    @Property(value="esp")
    private BooleanProperty U;
    private BlockPos Y;
    @Property(value="tracers-filter")
    private ListProperty H;
    @Property(value="esp-filter")
    private ListProperty aa;
    private static String[] cb;
    private int I;
    private TimerUtil R;
    @Property(value="tracers")
    private BooleanProperty V;
    private int Q;
    @Property(value="chunk-update")
    private BooleanProperty K;
    private static long bb;
    private int ac;
    private int M;
    private static Map ib;
    private List<Integer> Z;
    private int X;
    @Property(value="opacity")
    private IntProperty T;
    private List<BlockPos> ad;
    private int S;
    @Property(value="distance")
    private IntProperty ab;
    private int N;
    private List<C08PacketPlayerBlockPlacement> W;

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = XRay.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    public boolean e() {
        return auk_2.a((Boolean)Ba.b(this.U));
    }

    public List<BlockPos> d() {
        return this.O;
    }

    public XRay(@NonNull ModuleManager moduleManager, long l4, EnumModuleType enumModuleType, String string, char c) {
        long l5 = (l4 << 16 | (long)c << 48 >>> 48) ^ bb;
        long l6 = l5 ^ 0xFA27DB5B8E6L;
        int n = (int)(l6 >>> 56);
        long l7 = l6 << 8 >>> 8;
        super((byte)n, moduleManager, l7, enumModuleType, string);
        this.Z = my_0.a(new Integer[]{P8.d(10), P8.d(11), P8.d(8), P8.d(9), P8.d(14), P8.d(15), P8.d(16), P8.d(21), P8.d(41), P8.d(42), P8.d(46), P8.d(48), P8.d(52), P8.d(56), P8.d(57), P8.d(61), P8.d(62), P8.d(73), P8.d(74), P8.d(84), P8.d(89), P8.d(103), P8.d(116), P8.d(117), P8.d(118), P8.d(120), P8.d(129), P8.d(133), P8.d(137), P8.d(145), P8.d(152), P8.d(153), P8.d(154)});
        this.O = new ArrayList<BlockPos>();
        this.ad = new ArrayList<BlockPos>();
        this.W = new ArrayList<C08PacketPlayerBlockPlacement>();
        this.R = new TimerUtil();
        this.L = new TimerUtil();
        this.J = StringPropertyInvoker.b(asp_2.a((String)((Object)XRay.b("p", (int)7442, (long)(0x678C02E79D423CDL ^ l5)))), new String[]{XRay.b("p", (int)28202, (long)(0x2200FB10363A50EBL ^ l5)), XRay.b("p", (int)4146, (long)(0x50378B8482C32EFCL ^ l5))});
        this.T = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(160)), P8.d(0)), P8.d(255));
        this.U = asp_2.d();
        boolean bl = HUD.t();
        this.V = asp_2.d();
        this.aa = ava_0.a(asp_2.a(XRay.b("p", (int)27382, (long)(0x480D72E496E45435L ^ l5)), XRay.b("p", (int)28471, (long)(0x72133F3FE7BED1D6L ^ l5)), XRay.b("p", (int)19031, (long)(0x94E5E9044DFF48DL ^ l5))), new String[]{XRay.b("p", (int)21013, (long)(0x52D209A433ABECC4L ^ l5)), XRay.b("p", (int)26427, (long)(0x46799943E57159EDL ^ l5)), XRay.b("p", (int)9346, (long)(0x4E6134C8F2079A40L ^ l5)), XRay.b("p", (int)14455, (long)(0x1DF4EE5CBAAA06A9L ^ l5)), XRay.b("p", (int)12760, (long)(0x1656DEAD404A8F03L ^ l5)), XRay.b("p", (int)7613, (long)(0x5E80682AC66FA37DL ^ l5)), XRay.b("p", (int)9171, (long)(0x53B7CEC3F34F1D1EL ^ l5))});
        this.H = ava_0.a(asp_2.a(XRay.b("p", (int)26427, (long)(0x46799943E57159EDL ^ l5)), XRay.b("p", (int)9171, (long)(0x53B7CEC3F34F1D1EL ^ l5)), XRay.b("p", (int)12760, (long)(0x1656DEAD404A8F03L ^ l5))), new String[]{XRay.b("p", (int)11415, (long)(0x5956AF21058D9250L ^ l5)), XRay.b("p", (int)26427, (long)(0x46799943E57159EDL ^ l5)), XRay.b("p", (int)3997, (long)(0x1C5C6CF25C143140L ^ l5)), XRay.b("p", (int)11794, (long)(0x9C7301464E490F1L ^ l5)), XRay.b("p", (int)12760, (long)(0x1656DEAD404A8F03L ^ l5)), XRay.b("p", (int)17703, (long)(0x7FAD1AE085EDFBC5L ^ l5)), XRay.b("p", (int)9171, (long)(0x53B7CEC3F34F1D1EL ^ l5))});
        this.ab = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(42)), P8.d(16)), P8.d(64));
        this.K = asp_2.c();
        this.ae = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(5000)), P8.d(1000)), P8.d(10000));
        this.I = hb_2.a(0, 255, 255);
        this.ac = hb_2.a(225, 225, 225);
        this.X = hb_2.a(255, 0, 0);
        this.Q = hb_2.a(0, 255, 0);
        this.P = hb_2.a(255, 255, 0);
        this.M = hb_2.a(0, 0, 255);
        this.S = hb_2.a(0, 30, 30);
        ManagerInvoker.put(new Setting((String)((Object)XRay.b("p", (int)15392, (long)(0x1FA83A8B424A02ECL ^ l5))), (String)((Object)XRay.b("p", (int)20706, (long)(0x2487E8E21D336E29L ^ l5))), SettingType.COMBOBOX, (AbstractModule)this, this.J));
        ManagerInvoker.put(new Setting((String)((Object)XRay.b("p", (int)28424, (long)(0x12B3D5A92E9651CEL ^ l5))), (String)((Object)XRay.b("p", (int)17462, (long)(0x45DFC2D7678E7AE4L ^ l5))), SettingType.CHECKBOX, (AbstractModule)this, this.U));
        ManagerInvoker.put(new Setting((String)((Object)XRay.b("p", (int)8727, (long)(0x1ABECFA8EBB19CC7L ^ l5))), (String)((Object)XRay.b("p", (int)32655, (long)(0x4CB990B8D453C146L ^ l5))), SettingType.SELECTBOX, (AbstractModule)this, this.aa, this.U::get));
        ManagerInvoker.put(new Setting((String)((Object)XRay.b("p", (int)24674, (long)(0xDD6A9EA375F5EB1L ^ l5))), (String)((Object)XRay.b("p", (int)13834, (long)(0x4442C5EB1B4F08EAL ^ l5))), SettingType.CHECKBOX, (AbstractModule)this, this.V));
        ManagerInvoker.put(new Setting((String)((Object)XRay.b("p", (int)2959, (long)(0x472D7884D78EB547L ^ l5))), (String)((Object)XRay.b("p", (int)31027, (long)(0x7C3D89D7D9AEC7EFL ^ l5))), SettingType.SELECTBOX, (AbstractModule)this, this.H, this.V::get));
        ManagerInvoker.put(new Setting((String)((Object)XRay.b("p", (int)29372, (long)(0xEDFE10E0EE84C78L ^ l5))), (String)((Object)XRay.b("p", (int)32199, (long)(0x70DB092D5FB04310L ^ l5))), SettingType.SLIDER, (AbstractModule)this, this.T, 5.0));
        ManagerInvoker.put(new Setting((String)((Object)XRay.b("p", (int)2698, (long)(0x126D18A19735345EL ^ l5))), (String)((Object)XRay.b("p", (int)32473, (long)(0x48E24EEA931C01CL ^ l5))), SettingType.SLIDER, (AbstractModule)this, this.ab, 4.0));
        ManagerInvoker.put(new Setting((String)((Object)XRay.b("p", (int)5112, (long)(0x4BB2697771FD2D2DL ^ l5))), (String)((Object)XRay.b("p", (int)10660, (long)(0x52374D2A0B99976EL ^ l5))), SettingType.CHECKBOX, (AbstractModule)this, this.K));
        ManagerInvoker.put(new Setting((String)((Object)XRay.b("p", (int)2432, (long)(0x6CA2BD470435374FL ^ l5))), (String)((Object)XRay.b("p", (int)28065, (long)(0x7498F7CA5A7F5379L ^ l5))), SettingType.SLIDER, this, this.ae, 500.0, (String)((Object)XRay.b("p", (int)22935, (long)(0x1AEC7004F20DE74EL ^ l5))), this.K::get));
        if (ListInvoker.b() != null) {
            boolean bl2 = bl;
            if (l4 > 0L) {
                bl2 = !bl2;
            }
            HUD.c(bl2);
        }
    }

    @Override
    public void w() {
        jv_0.m(this.mc.renderGlobal);
        ListInvoker.clear(this.O);
        ListInvoker.clear(this.ad);
        ListInvoker.clear(this.W);
    }

    @EventTarget
    public void a(Render3DEvent render3DEvent) {
        Object object;
        BlockPos blockPos;
        Iterator iterator;
        HUD.t();
        if (auk_2.a((Boolean)Ba.b(this.U)) && dz_0.c(iterator = ListInvoker.iterator(this.O)) && PlayerInvoker.a(this.mc.player, (double)amv_2.j(blockPos = (BlockPos)dz_0.b(iterator)), (double)amv_2.i(blockPos)) <= (double)P8.b((Integer)adt_2.a(this.ab))) {
            boolean bl;
            boolean bl2;
            boolean bl3;
            boolean bl4;
            boolean bl5;
            boolean bl6;
            boolean bl7;
            object = BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, blockPos));
            if (auk_2.a((Boolean)Ba.b(this.U))) {
                bl7 = object == Blocks.C && ava_0.b(this.aa, aA5.q);
                bl6 = object == Blocks.iron_ore && ava_0.b(this.aa, aA5.m);
                bl5 = object == Blocks.bH && ava_0.b(this.aa, aA5.p);
                bl4 = object == Blocks.b5 && ava_0.b(this.aa, aA5.b);
                bl3 = object == Blocks.coal_ore && ava_0.b(this.aa, aA5.i);
                bl2 = object == Blocks.K && ava_0.b(this.aa, aA5.r);
                boolean bl8 = bl = object == Blocks.gold_ore && ava_0.b(this.aa, aA5.n);
            }
            if (auk_2.a((Boolean)Ba.b(this.V))) {
                bl7 = object == Blocks.C && ava_0.b(this.H, aA5.h);
                bl6 = object == Blocks.iron_ore && ava_0.b(this.H, aA5.e);
                bl5 = object == Blocks.bH && ava_0.b(this.H, aA5.f);
                bl4 = object == Blocks.b5 && ava_0.b(this.H, aA5.a);
                bl3 = object == Blocks.coal_ore && ava_0.b(this.H, aA5.o);
                bl2 = object == Blocks.K && ava_0.b(this.H, aA5.g);
                boolean bl9 = bl = object == Blocks.gold_ore && ava_0.b(this.H, aA5.l);
            }
        }
        if (this.mc.player != null && PlayerControllerInvoker.c(this.mc.playerController) && !ListInvoker.isEmpty(this.W)) {
            int n = 1800;
            int n2 = 180;
            if (ListInvoker.size(this.W) > n2) {
                object = ListInvoker.subList(this.W, 0, n2);
                if (qh_1.c(this.L, n)) {
                    ListInvoker.forEach((List)object, this::a);
                    ListInvoker.removeAll(this.W, (Collection)object);
                    qh_1.b(this.L);
                }
            }
            if (qh_1.c(this.L, n)) {
                ListInvoker.forEach(this.W, this::a);
                ListInvoker.clear(this.W);
                qh_1.b(this.L);
            }
        }
    }

    @Override
    public void o() {
        jv_0.m(this.mc.renderGlobal);
    }

    public StringProperty c() {
        return this.J;
    }

    public List<Integer> f() {
        return this.Z;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/aCU" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    public int a() {
        return P8.b((Integer)adt_2.a(this.ab));
    }

    private boolean lambda$onMotion$0(BlockPos blockPos) {
        HUD.t();
        return PlayerInvoker.b(this.mc.player, blockPos) > 8.0;
    }

    @EventTarget
    public void a(MotionUpdateEvent motionUpdateEvent) {
        HUD.t();
        if (EventInvoker.getState(motionUpdateEvent) == cc.novoline.events.type.State.PRE && this.Y != null) {
            double cfr_ignored_0 = -MathHelper.h(MathInvoker.o(this.mc.player.rotationYaw));
            double cfr_ignored_1 = MathHelper.b(MathInvoker.o(this.mc.player.rotationYaw));
            int n = -6;
            int n2 = -6;
            int cfr_ignored_2 = n % 2;
            int cfr_ignored_3 = n2 % 2;
            ++n2;
            ++n;
            ListInvoker.removeIf(this.ad, this::lambda$onMotion$0);
            this.Y = null;
        }
    }

    static {
        bb = a1c.a(1520894953074039133L, -5706466240381294978L, MethodHandles.lookup().lookupClass()).a(229702596214483L);
        ib = new HashMap(13);
        long l4 = bb ^ 0x32BC6F340BC5L;
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

    public IntProperty b() {
        return this.T;
    }

    @EventTarget
    public void a(PacketEvent packetEvent) {
        block7: {
            BlockPos blockPos;
            Block block;
            Packet<INetHandlerPlayServer> packet;
            block6: {
                HUD.t();
                if (PacketEventInvoker.getState(packetEvent) != State.OUTGOING) break block6;
                if (!(PacketEventInvoker.c(packetEvent) instanceof C07PacketPlayerDigging)) break block7;
                packet = (C07PacketPlayerDigging)PacketEventInvoker.c(packetEvent);
                if (atq_0.b(packet) == C07PacketPlayerDigging$Action.STOP_DESTROY_BLOCK) {
                    ListInvoker.remove(this.O, atq_0.a(packet));
                }
                if (atq_0.b(packet) == C07PacketPlayerDigging$Action.START_DESTROY_BLOCK && StringPropertyInvoker.isMode(this.J, aA5.k) && (amv_2.h(atq_0.a(packet)) == amv_2.h(PlayerInvoker.af(this.mc.player)) || this.mc.player.rotationPitch < -60.0f || this.mc.player.rotationPitch > 60.0f)) {
                    this.Y = atq_0.a(packet);
                }
            }
            if (PacketEventInvoker.c(packetEvent) instanceof S23PacketBlockChange && ((block = BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, blockPos = aVG.b((S23PacketBlockChange)(packet = (S23PacketBlockChange)PacketEventInvoker.c(packetEvent)))))) instanceof gz_2 || block instanceof gw_2) && !ListInvoker.contains(this.O, blockPos)) {
                ListInvoker.add(this.O, blockPos);
            }
        }
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x2110;
        if (eb[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])ib.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                ib.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/aCU", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return eb[n2];
    }

    @EventTarget
    public void a(SettingEvent settingEvent) {
        HUD.t();
        if (afm_0.b(settingEvent).equals(aA5.d) || afm_0.b(settingEvent).equals(aA5.j)) {
            jv_0.m(this.mc.renderGlobal);
        }
        if (afm_0.b(settingEvent).equals(aA5.c) && this.N != P8.b((Integer)adt_2.a(this.T))) {
            jv_0.m(this.mc.renderGlobal);
            this.N = P8.b((Integer)adt_2.a(this.T));
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

    @EventTarget
    public void a(TickUpdateEvent tickUpdateEvent) {
        HUD.j();
        if (this.mc.world != null && auk_2.a((Boolean)Ba.b(this.K)) && qh_1.c(this.R, P8.b((Integer)adt_2.a(this.ae)))) {
            jv_0.m(this.mc.renderGlobal);
            qh_1.b(this.R);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(XRay.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

