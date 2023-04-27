/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.player;

import cc.novoline.events.EventTarget;
import cc.novoline.events.State;
import cc.novoline.events.events.PacketEvent;
import cc.novoline.events.events.PlayerUpdateEvent;
import cc.novoline.events.events.SettingEvent;
import cc.novoline.events.events.TickUpdateEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.PacketEventInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.exploits.Disabler;
import cc.novoline.modules.EnumModuleType;
import deobf.IntProperty;
import deobf.ModuleRegistry;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import deobf.TimerUtil;
import net.minecraft.network.packts.S08PacketPlayerPosLook;
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

import net.minecraft.block.BlockPos;
import org.checkerframework.checker.nullness.qual.NonNull;

public class GameSpeed
extends AbstractModule {
    @Property(value="ticks")
    private IntProperty M;
    private static String[] Q;
    private static Map R;
    @Property(value="lag-check")
    private BooleanProperty H;
    private BlockPos K;
    private TimerUtil I;
    private static long O;
    private int L;
    @Property(value="timer-boost")
    private FloatProperty N;
    @Property(value="mode")
    private StringProperty J;
    private static String[] P;

    @EventTarget
    public void a(PlayerUpdateEvent playerUpdateEvent) {
        ChestStealer.d();
        if (this.a(ModuleRegistry.SPEED, ModuleRegistry.LONGJUMP, ModuleRegistry.SCAFFOLD, ModuleRegistry.FLY)) {
            return;
        }
        if (StringPropertyInvoker.isMode(this.J, dp_0.e)) {
            this.mc.timer.timerSpeed = axx_1.a((Float)a9V.a(this.N));
        }
        if (StringPropertyInvoker.isMode(this.J, dp_0.f)) {
            ++this.L;
            if (this.L < P8.b((Integer)adt_2.a(this.M)) / 15 + 1) {
                this.mc.timer.timerSpeed = 0.1f;
            }
            if (this.L > P8.b((Integer)adt_2.a(this.M))) {
                this.L = 0;
            }
            this.mc.timer.timerSpeed = 2.0f;
        }
    }

    @EventTarget
    public void a(PacketEvent packetEvent) {
        ChestStealer.j();
        if (PacketEventInvoker.getState(packetEvent).equals((Object)State.INCOMING) && PacketEventInvoker.c(packetEvent) instanceof S08PacketPlayerPosLook && auk_2.a((Boolean)Ba.b(this.H))) {
            this.a(this.getClass());
        }
    }

    @Override
    public void w() {
        this.mc.timer.timerSpeed = 1.0f;
    }

    @Override
    public void o() {
        this.a((String)StringPropertyInvoker.b(this.J));
        this.L = 0;
    }

    private Boolean lambda$new$0() {
        return auk_2.b(StringPropertyInvoker.isMode(this.J, dp_0.i));
    }

    public void a(SettingEvent settingEvent) {
        ChestStealer.j();
        if (settingEvent == null || afm_0.b(settingEvent).equals(dp_0.c) || afm_0.b(settingEvent).equals(dp_0.b)) {
            boolean bl;
            Disabler disabler = (Disabler)ModuleInvoker.isEnable(ModuleRegistry.DISABLER);
            boolean bl2 = bl = disabler.x() && aAK.a(disabler);
            if (StringPropertyInvoker.isMode(this.J, dp_0.g)) {
                this.a(this.r(), dp_0.a, 4500, NotificationType.WARNING);
                StringPropertyInvoker.b(this.J, dp_0.d);
            }
        }
    }

    private Boolean lambda$new$1() {
        return auk_2.b(StringPropertyInvoker.isMode(this.J, dp_0.h));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_M" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x55A;
        if (Q[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])R.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                R.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_M", exception);
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

    static {
        O = a1c.a(-8663493043860563930L, -4663500212978872419L, MethodHandles.lookup().lookupClass()).a(251290515737555L);
        R = new HashMap(13);
        long l4 = O ^ 0x72648CADDBEEL;
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

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = GameSpeed.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    @EventTarget
    public void a(TickUpdateEvent tickUpdateEvent) {
        this.a((String)StringPropertyInvoker.b(this.J));
    }

    public GameSpeed(@NonNull short s, ModuleManager moduleManager, EnumModuleType enumModuleType, String string, short s3, int n, String string2) {
        long l4 = ((long)s << 48 | (long)s3 << 48 >>> 16 | (long)n << 32 >>> 32) ^ O;
        long l5 = l4 ^ 0x283D6F8E9CB5L;
        int n2 = (int)(l5 >>> 48);
        int n3 = (int)(l5 << 16 >>> 48);
        int n4 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n2, enumModuleType, string, (char)n3, n4, string2);
        this.J = StringPropertyInvoker.b(asp_2.a((String)((Object)GameSpeed.b("c", (int)29826, (long)(0x20F5C466EDE3BD3DL ^ l4)))), new String[]{GameSpeed.b("c", (int)24570, (long)(0x40B313E424AE1646L ^ l4)), GameSpeed.b("c", (int)21298, (long)(0x36D709A3D7F41A89L ^ l4))});
        this.N = (FloatProperty)a9V.a((FloatProperty)a9V.b(asp_2.a(axx_1.a(2.0f)), axx_1.a(1.0f)), axx_1.a(2.0f));
        this.H = asp_2.a(auk_2.b(true));
        this.M = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(30)), P8.d(15)), P8.d(150));
        this.I = new TimerUtil();
        ManagerInvoker.put(new Setting((String)((Object)GameSpeed.b("c", (int)27975, (long)(0x8AC5D15219B24F0L ^ l4))), (String)((Object)GameSpeed.b("c", (int)609, (long)(0x6E81C7596B83CBDBL ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.J));
        ManagerInvoker.put(new Setting((String)((Object)GameSpeed.b("c", (int)11282, (long)(0x662E6BF1E112E5A6L ^ l4))), (String)((Object)GameSpeed.b("c", (int)30468, (long)(0x404BCF1FB9B53EB9L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.M, 15.0, this::lambda$new$0));
        ManagerInvoker.put(new Setting((String)((Object)GameSpeed.b("c", (int)24465, (long)(0x2FC1DCDE4EF71629L ^ l4))), (String)((Object)GameSpeed.b("c", (int)16390, (long)(0x26DE952F99089BFL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.N, (double)0.05f, this::lambda$new$1));
        ManagerInvoker.put(new Setting((String)((Object)GameSpeed.b("c", (int)11628, (long)(0x33A13ADB0FC64D2L ^ l4))), (String)((Object)GameSpeed.b("c", (int)1474, (long)(0x12450D2949B34C74L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.H));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(GameSpeed.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

