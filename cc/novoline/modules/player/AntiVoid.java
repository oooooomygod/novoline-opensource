/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.player;

import cc.novoline.events.EventTarget;
import cc.novoline.events.State;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.events.PacketEvent;
import cc.novoline.events.events.TickUpdateEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.PacketEventInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import deobf.IntProperty;
import deobf.ModuleRegistry;
import deobf.Packet;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import net.minecraft.network.packts.C03PacketPlayer;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import net.Ba;
import net.BooleanProperty;
import net.ChestStealer;
import net.ModuleManager;
import net.P8;
import net.StringProperty;
import net.a1c;
import net.a3r_0;
import net.adt_2;
import net.asp_2;
import net.auk_2;
import net.ka_0;
import org.checkerframework.checker.nullness.qual.NonNull;

public class AntiVoid
extends AbstractModule {
    @Property(value="mode")
    private StringProperty P;
    private static String[] R;
    @Property(value="void-check")
    private BooleanProperty I;
    private List<Packet> L;
    private static Map T;
    private double M;
    private double O;
    private double J;
    private static long Q;
    private boolean H;
    @Property(value="fall-dist")
    private IntProperty N;
    private static String[] S;
    private double K;

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = AntiVoid.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private Boolean lambda$new$0() {
        return auk_2.b(StringPropertyInvoker.isMode(this.P, a3r_0.b));
    }

    static {
        Q = a1c.a(-6718134785460973576L, 6469313086842820928L, MethodHandles.lookup().lookupClass()).a(202093102377582L);
        T = new HashMap(13);
        long l4 = Q ^ 0x62F3F0CB121L;
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
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x3F20;
        if (S[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])T.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                T.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_t", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return S[n2];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_t" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    @EventTarget
    public void a(MotionUpdateEvent motionUpdateEvent) {
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
        this.a((String)StringPropertyInvoker.b(this.P));
    }

    @EventTarget
    public void a(PacketEvent packetEvent) {
        block8: {
            block9: {
                ChestStealer.j();
                if (PacketEventInvoker.getState(packetEvent) != State.OUTGOING || !(PacketEventInvoker.c(packetEvent) instanceof C03PacketPlayer)) break block8;
                C03PacketPlayer c03PacketPlayer = (C03PacketPlayer)PacketEventInvoker.c(packetEvent);
                if (StringPropertyInvoker.isMode(this.P, a3r_0.a)) {
                    if (ka_0.h(c03PacketPlayer) && this.mc.player.fallDistance > (float)P8.b((Integer)adt_2.a(this.N)) && (!auk_2.a((Boolean)Ba.b(this.I)) || !PlayerInvoker.T(this.mc.player))) {
                        ka_0.a(c03PacketPlayer, ka_0.a(c03PacketPlayer) + (double)this.mc.player.fallDistance);
                    }
                    return;
                }
                if (ModuleInvoker.isEnable(ModuleRegistry.SCAFFOLD).x() || ModuleInvoker.isEnable(ModuleRegistry.LONGJUMP).x()) {
                    return;
                }
                if (this.mc.player.onGround) {
                    this.O = this.mc.player.posX;
                    this.K = this.mc.player.posY;
                    this.J = this.mc.player.posZ;
                }
                if (!(this.mc.player.motionY < -0.0785) || PlayerInvoker.T(this.mc.player)) break block9;
                ListInvoker.add(this.L, PacketEventInvoker.c(packetEvent));
                PacketEventInvoker.setCancelled(packetEvent, true);
                if (!(this.mc.player.fallDistance > (float)P8.b((Integer)adt_2.a(this.N)))) break block8;
                PlayerInvoker.b(this.mc.player, this.O, this.K, this.J);
                ListInvoker.clear(this.L);
            }
            if (!ListInvoker.isEmpty(this.L)) {
                ListInvoker.forEach(this.L, this::b);
                ListInvoker.clear(this.L);
            }
        }
    }

    public AntiVoid(@NonNull ModuleManager moduleManager, int n, int n2, EnumModuleType enumModuleType, String string, int n3, String string2) {
        long l4 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ Q;
        long l5 = l4 ^ 0x66CE1BC9CA21L;
        int n4 = (int)(l5 >>> 48);
        int n5 = (int)(l5 << 16 >>> 48);
        int n6 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n4, enumModuleType, string, (char)n5, n6, string2);
        this.P = StringPropertyInvoker.b(asp_2.a((String)((Object)AntiVoid.b("o", (int)16810, (long)(0x47459AF00FF164FCL ^ l4)))), new String[]{AntiVoid.b("o", (int)11762, (long)(0x57CACA8CAB308A6L ^ l4)), AntiVoid.b("o", (int)15659, (long)(0x3E0FA096730D987BL ^ l4))});
        this.N = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(20)), P8.d(5)), P8.d(50));
        this.I = asp_2.a(auk_2.b(true));
        this.L = new ArrayList<Packet>();
        ManagerInvoker.put(new Setting((String)((Object)AntiVoid.b("o", (int)10093, (long)(0x6882AF21F154823CL ^ l4))), (String)((Object)AntiVoid.b("o", (int)14067, (long)(0x70D97C8FE31F13A0L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.P));
        ManagerInvoker.put(new Setting((String)((Object)AntiVoid.b("o", (int)3173, (long)(0x6C60AE19D185A937L ^ l4))), (String)((Object)AntiVoid.b("o", (int)1611, (long)(0x790B1F464A4C2313L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.N, 1.0));
        ManagerInvoker.put(new Setting((String)((Object)AntiVoid.b("o", (int)30595, (long)(0x5B4CA230EC84D2D6L ^ l4))), (String)((Object)AntiVoid.b("o", (int)27808, (long)(0x34B08861964FC9F7L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.I, this::lambda$new$0));
    }

    @Override
    public void o() {
        this.a((String)StringPropertyInvoker.b(this.P));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AntiVoid.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

