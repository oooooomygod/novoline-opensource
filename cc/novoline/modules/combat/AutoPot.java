/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.combat;

import cc.novoline.events.EventTarget;
import cc.novoline.events.State;
import cc.novoline.events.events.PacketEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.ItemStackInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.PacketEventInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.exploits.Disabler;
import cc.novoline.modules.EnumModuleType;
import deobf.IntProperty;
import net.minecraft.item.ItemStack;
import deobf.ModuleRegistry;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import deobf.TimerUtil;
import net.minecraft.network.packts.C03PacketPlayer;
import net.minecraft.network.packts.C05PacketPlayerLook;
import net.minecraft.network.packts.C06PacketPlayerPosLook;
import net.minecraft.network.packts.C08PacketPlayerBlockPlacement;
import net.minecraft.network.packts.C09PacketHeldItemChange;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;

import org.checkerframework.checker.nullness.qual.NonNull;

public class AutoPot
extends AbstractModule {
    private int J;
    private static String[] O;
    @Property(value="health")
    private DoubleProperty K;
    @Property(value="potions")
    private ListProperty<String> I;
    private static String[] P;
    private TimerUtil H;
    @Property(value="delay")
    private IntProperty M;
    @Property(value="over-pot")
    private BooleanProperty L;
    private static Map Q;
    private static long N;

    @EventTarget
    public void a(PacketEvent packetEvent) {
        KillAura.w();
        if (PacketEventInvoker.getState(packetEvent) == State.OUTGOING && PacketEventInvoker.c(packetEvent) instanceof C03PacketPlayer) {
            C03PacketPlayer c03PacketPlayer = (C03PacketPlayer)PacketEventInvoker.c(packetEvent);
            if (this.mc.currentScreen != null || aCM.d() && (aCM.a(abb_2.PRE) || aCM.a(abb_2.LOBBY))) {
                return;
            }
            if (this.mc.player.onGround) {
                int n = 9;
                ItemStack itemStack = ItemStackInvoker.a(afy_2.a(this.mc.player.bp, n));
                Item item = act_2.k(itemStack);
                if (item instanceof ItemPotion) {
                    ItemPotion itemPotion = (ItemPotion)item;
                    a2l_0 a2l_02 = (a2l_0)ListInvoker.get(en_2.a(itemPotion, itemStack), 0);
                    int n2 = 0;
                    int[] nArray = this.a();
                    int n3 = nArray.length;
                    if (n2 < n3) {
                        int n4 = nArray[n2];
                        if (a3M.b(a2l_02) == n4 && en_2.b(act_2.c(itemStack)) && this.a(n4, a2l_02) && this.a(n4) && this.a(itemPotion, itemStack) && qh_1.c(this.H, P8.b((Integer)adt_2.a(this.M)))) {
                            Disabler disabler = (Disabler)ModuleInvoker.isEnable(ModuleRegistry.DISABLER);
                            PlayerInvoker.a(this.mc.player, n, this.b());
                            if (aAK.a(disabler, true)) {
                                aAK.b(disabler);
                            }
                            this.b(new C09PacketHeldItemChange(this.b()));
                            float f = ka_0.b(c03PacketPlayer) ? ka_0.e(c03PacketPlayer) : this.mc.player.rotationYaw;
                            float f2 = 90.0f;
                            if (ka_0.h(c03PacketPlayer)) {
                                PacketEventInvoker.a(packetEvent, new C06PacketPlayerPosLook(ka_0.d(c03PacketPlayer), ka_0.a(c03PacketPlayer), ka_0.c(c03PacketPlayer), f, f2, ka_0.g(c03PacketPlayer)));
                            }
                            PacketEventInvoker.a(packetEvent, new C05PacketPlayerLook(f, f2, ka_0.g(c03PacketPlayer)));
                            this.b(new C08PacketPlayerBlockPlacement(InventoryInvoker.c(this.mc.player.inventory, this.b())));
                            this.b(new C09PacketHeldItemChange(this.mc.player.inventory.a));
                            qh_1.b(this.H);
                        }
                        ++n2;
                    }
                }
                ++n;
            }
        }
    }

    private int b() {
        int n = 5;
        KillAura.w();
        int n2 = 36;
        if (!ItemStackInvoker.e(afy_2.a(this.mc.player.bp, n2))) {
            n = n2 - 36;
        }
        if (act_2.k(ItemStackInvoker.a(afy_2.a(this.mc.player.bp, n2))) instanceof ItemPotion) {
            n = n2 - 36;
        }
        ++n2;
        return n;
    }

    private int[] a() {
        KillAura.w();
        int[] nArray = new int[]{-1, -1, -1, -1, -1};
        if (ava_0.b(this.I, ank_1.c)) {
            nArray[0] = 6;
        }
        if (ava_0.b(this.I, ank_1.d)) {
            nArray[1] = 10;
        }
        if (ava_0.b(this.I, ank_1.a)) {
            nArray[2] = 8;
        }
        if (ava_0.b(this.I, ank_1.f)) {
            nArray[3] = 1;
        }
        if (ava_0.b(this.I, ank_1.b)) {
            nArray[4] = 12;
        }
        return nArray;
    }

    private Boolean lambda$new$1() {
        KillAura.w();
        return auk_2.b(!ava_0.c(this.I));
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x447;
        if (P[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])Q.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                Q.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a0Y", exception);
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

    private boolean a(ItemPotion itemPotion, ItemStack itemStack) {
        Iterator iterator;
        ItemPotion itemPotion2;
        ItemStack itemStack2;
        KillAura.w();
        if (en_2.a(itemPotion, itemStack) == null || ListInvoker.size(en_2.a(itemPotion, itemStack)) != 1) {
            return false;
        }
        a2l_0 a2l_02 = (a2l_0)ListInvoker.get(en_2.a(itemPotion, itemStack), 0);
        int n = a3M.b(a2l_02);
        int n2 = a3M.g(a2l_02);
        int n3 = a3M.c(a2l_02);
        int n4 = 9;
        if (ItemStackInvoker.e(afy_2.a(this.mc.player.bp, n4)) && act_2.k(itemStack2 = ItemStackInvoker.a(afy_2.a(this.mc.player.bp, n4))) instanceof ItemPotion && en_2.a(itemPotion2 = (ItemPotion)act_2.k(itemStack2), itemStack2) != null && dz_0.c(iterator = ListInvoker.iterator(en_2.a(itemPotion2, itemStack2)))) {
            a2l_0 a2l_03 = (a2l_0)dz_0.b(iterator);
            int n5 = a3M.b(a2l_03);
            int n6 = a3M.g(a2l_03);
            int n7 = a3M.c(a2l_03);
            if (n5 == n && en_2.b(act_2.c(itemStack2))) {
                if (n6 > n2) {
                    return false;
                }
                if (n6 == n2 && n7 > n3) {
                    return false;
                }
            }
        }
        ++n4;
        return true;
    }

    private boolean a(int n, a2l_0 a2l_02) {
        KillAura.w();
        if (auk_2.a((Boolean)Ba.b(this.L))) {
            return !PlayerInvoker.a(this.mc.player, n) || MapInvoker.b(PlayerInvoker.o(this.mc.player), P8.d(n)) && a3M.g((a2l_0)MapInvoker.c(PlayerInvoker.o(this.mc.player), P8.d(n))) < a3M.g(a2l_02);
        }
        return !PlayerInvoker.a(this.mc.player, n);
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
        N = a1c.a(2974782325974940258L, -2466912659481597711L, MethodHandles.lookup().lookupClass()).a(77126593771724L);
        Q = new HashMap(13);
        long l4 = N ^ 0x1503FFCB77DFL;
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

    public AutoPot(@NonNull ModuleManager moduleManager, short s, EnumModuleType enumModuleType, String string, char c, String string2, int n) {
        long l4 = ((long)s << 48 | (long)c << 48 >>> 16 | (long)n << 32 >>> 32) ^ N;
        long l5 = l4 ^ 0x66337365EB77L;
        int n2 = (int)(l5 >>> 48);
        int n3 = (int)(l5 << 16 >>> 48);
        int n4 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n2, enumModuleType, string, (char)n3, n4, string2);
        this.H = new TimerUtil();
        this.J = -1;
        this.K = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(14.0)), db_0.a(0.5)), db_0.a(20.0));
        this.M = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(900)), P8.d(900)), P8.d(1500));
        this.I = ava_0.a(asp_2.a(AutoPot.b("t", (int)20482, (long)(0x5D3CF2DC028BEF61L ^ l4))), new String[]{AutoPot.b("t", (int)2996, (long)(0x387F413D1A4634D3L ^ l4)), AutoPot.b("t", (int)21964, (long)(0xD9EAA553D62EAA1L ^ l4)), AutoPot.b("t", (int)4914, (long)(0x630A12CD6EA2C52L ^ l4)), AutoPot.b("t", (int)13312, (long)(0x7271E60CCD950B6CL ^ l4)), AutoPot.b("t", (int)19337, (long)(0x1CBCDB64731CF4E8L ^ l4))});
        this.L = asp_2.c();
        ManagerInvoker.put(new Setting((String)((Object)AutoPot.b("t", (int)18155, (long)(0xED95E44F14F989L ^ l4))), (String)((Object)AutoPot.b("t", (int)15104, (long)(0x4DA697F3F3468468L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.K, 0.5, this::lambda$new$0));
        ManagerInvoker.put(new Setting((String)((Object)AutoPot.b("t", (int)27975, (long)(0x6E602451F45B5222L ^ l4))), (String)((Object)AutoPot.b("t", (int)16055, (long)(0xFAE30AC953001D1L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.M, 50.0, this::lambda$new$1));
        ManagerInvoker.put(new Setting((String)((Object)AutoPot.b("t", (int)9655, (long)(0x4794B1F616DE9ADCL ^ l4))), (String)((Object)AutoPot.b("t", (int)14490, (long)(0x63B4A2C5158287F3L ^ l4))), SettingType.SELECTBOX, (AbstractModule)this, this.I));
        ManagerInvoker.put(new Setting((String)((Object)AutoPot.b("t", (int)16032, (long)(0x1E01DF439E1581CAL ^ l4))), (String)((Object)AutoPot.b("t", (int)10707, (long)(0x51A4515FC0F516B7L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.L));
    }

    private Boolean lambda$new$0() {
        KillAura.w();
        return auk_2.b(ava_0.b(this.I, ank_1.g) || ava_0.b(this.I, ank_1.e));
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = AutoPot.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private boolean a(int n) {
        KillAura.w();
        if (n == 1 || n == 8) {
            return PlayerInvoker.q(this.mc.player);
        }
        if (n == 6 || n == 10) {
            return (double)PlayerInvoker.aa(this.mc.player) < db_0.b((Double)MD.b(this.K));
        }
        if (n == 12) {
            return PlayerInvoker.t(this.mc.player);
        }
        return false;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a0Y" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AutoPot.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

