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
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.PacketEventInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import net.minecraft.item.ItemStack;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import deobf.TimerUtil;
import net.minecraft.network.packts.C03PacketPlayer;
import net.minecraft.network.packts.C08PacketPlayerBlockPlacement;
import net.minecraft.network.packts.C09PacketHeldItemChange;
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

import org.checkerframework.checker.nullness.qual.NonNull;

public class AutoHead
extends AbstractModule {
    @Property(value="force-absorption")
    private BooleanProperty K;
    private static long L = a1c.a(-4653783511621817849L, -4067874246210309632L, MethodHandles.lookup().lookupClass()).a(219529963381743L);
    private TimerUtil I;
    private static Map O = new HashMap(13);
    @Property(value="health")
    private DoubleProperty H;
    private static String[] M;
    private static String[] N;
    @Property(value="check-regen")
    private BooleanProperty J;

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = AutoHead.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x6FE;
        if (N[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])O.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                O.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_N", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return N[n2];
    }

    private boolean a(int n) {
        ChestStealer.j();
        return n != -1 && (auk_2.a((Boolean)Ba.b(this.K)) ? PlayerInvoker.d(this.mc.player) <= 0.0f : (double)PlayerInvoker.aa(this.mc.player) < db_0.b((Double)MD.b(this.H)) && (!auk_2.a((Boolean)Ba.b(this.J)) || !PlayerInvoker.b(this.mc.player, Potion.regeneration)));
    }

    static {
        long l4 = L ^ 0x54AFFC7477D9L;
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

    private Boolean lambda$new$1() {
        ChestStealer.j();
        return auk_2.b(!auk_2.a((Boolean)Ba.b(this.K)));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_N" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private Boolean lambda$new$0() {
        ChestStealer.j();
        return auk_2.b(!auk_2.a((Boolean)Ba.b(this.K)));
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
        ItemStack itemStack;
        ChestStealer.d();
        if (PacketEventInvoker.getState(packetEvent) == State.OUTGOING && PacketEventInvoker.c(packetEvent) instanceof C03PacketPlayer && !aCM.a(abb_2.LOBBY) && !aCM.a(abb_2.PRE) && this.a(this.a()) && (itemStack = InventoryInvoker.c(this.mc.player.inventory, this.a())) != null && act_2.k(itemStack) instanceof L0) {
            this.a(new C09PacketHeldItemChange(this.a()));
            this.a(new C08PacketPlayerBlockPlacement(itemStack));
            this.a(new C09PacketHeldItemChange(this.mc.player.inventory.a));
        }
    }

    public int a() {
        return PlayerInvoker.c(this.mc.player, Items.skull);
    }

    public AutoHead(@NonNull ModuleManager moduleManager, int n, EnumModuleType enumModuleType, int n2, String string, byte by, String string2) {
        long l4 = ((long)n << 32 | (long)n2 << 40 >>> 32 | (long)by << 56 >>> 56) ^ L;
        long l5 = l4 ^ 0x78CC9C2E0A1L;
        int n3 = (int)(l5 >>> 48);
        int n4 = (int)(l5 << 16 >>> 48);
        int n5 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n3, enumModuleType, string, (char)n4, n5, string2);
        this.I = new TimerUtil();
        this.H = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(14.0)), db_0.a(1.0)), db_0.a(20.0));
        this.K = asp_2.c();
        this.J = asp_2.c();
        ManagerInvoker.put(new Setting((String)((Object)AutoHead.b("q", (int)8819, (long)(0x561212C625BC947DL ^ l4))), (String)((Object)AutoHead.b("q", (int)19256, (long)(0x4A544B2AA9EFD33L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.K));
        ManagerInvoker.put(new Setting((String)((Object)AutoHead.b("q", (int)9070, (long)(0x467262EECEC1561L ^ l4))), (String)((Object)AutoHead.b("q", (int)16580, (long)(0x1E4D5C34F5F876CEL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.J, this::lambda$new$0));
        ManagerInvoker.put(new Setting((String)((Object)AutoHead.b("q", (int)23225, (long)(0x5107E8682D24ECB5L ^ l4))), (String)((Object)AutoHead.b("q", (int)12019, (long)(0x314E70DB738998FEL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.H, 1.0, this::lambda$new$1));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AutoHead.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

