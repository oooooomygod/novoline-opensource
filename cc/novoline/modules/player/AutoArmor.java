/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.player;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.events.SettingEvent;
import cc.novoline.events.type.State;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.ItemStackInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.exploits.Disabler;
import cc.novoline.modules.EnumModuleType;
import deobf.IntProperty;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import deobf.ModuleRegistry;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import deobf.TimerUtil;
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
import net.ChestStealer;
import net.ModuleManager;
import net.NotificationType;
import net.P8;
import net.R1;
import net.GuiChat;
import net.a1c;
import net.aAK;
import net.aCM;
import net.abb_2;
import net.act_2;
import net.adt_2;
import net.afm_0;
import net.afy_2;
import net.alf_0;
import net.asp_2;
import net.auk_2;
import net.ayf_1;
import net.qh_1;
import net.yl_2;
import org.checkerframework.checker.nullness.qual.NonNull;

public class AutoArmor
extends AbstractModule {
    private static long L = a1c.a(-6833130042803887887L, 3964955413004894326L, MethodHandles.lookup().lookupClass()).a(274098216618604L);
    private static String[] M;
    private static Map O;
    private TimerUtil K;
    @Property(value="no-move")
    private BooleanProperty I;
    @Property(value="open-inventory")
    private BooleanProperty H;
    private static String[] N;
    @Property(value="equip-delay")
    private IntProperty J;

    public TimerUtil d() {
        return this.K;
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

    public AutoArmor(@NonNull int n, short s, ModuleManager moduleManager, EnumModuleType enumModuleType, String string, int n2, String string2) {
        long l4 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ L;
        long l5 = l4 ^ 0x6A5A05BCD8DBL;
        int n3 = (int)(l5 >>> 48);
        int n4 = (int)(l5 << 16 >>> 48);
        int n5 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n3, enumModuleType, string, (char)n4, n5, string2);
        this.K = new TimerUtil();
        this.J = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(3)), P8.d(1)), P8.d(10));
        this.H = asp_2.c();
        this.I = asp_2.c();
        ManagerInvoker.put(new Setting((String)((Object)AutoArmor.b("j", (int)25287, (long)(0x6DDD9F49BB9C4715L ^ l4))), (String)((Object)AutoArmor.b("j", (int)11905, (long)(0x40C608ADCE0F8B57L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.J, 1.0));
        ManagerInvoker.put(new Setting((String)((Object)AutoArmor.b("j", (int)20557, (long)(0x7CE1117AEA36F599L ^ l4))), (String)((Object)AutoArmor.b("j", (int)15547, (long)(0x3C6308BC19F9996EL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.H));
        ManagerInvoker.put(new Setting((String)((Object)AutoArmor.b("j", (int)32412, (long)(0x784199FC19A5B4BL ^ l4))), (String)((Object)AutoArmor.b("j", (int)18719, (long)(0x3820DFA5825E6CCCL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.I));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_d" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    boolean a(@NonNull ItemStack itemStack, int n) {
        ItemStack itemStack2;
        ChestStealer.d();
        String string = ayf_1.a;
        switch (n) {
            case 1: {
                string = ayf_1.i;
            }
            case 2: {
                string = ayf_1.h;
            }
            case 3: {
                string = ayf_1.e;
            }
            case 4: {
                string = ayf_1.d;
            }
        }
        if (!StringInvoker.a(act_2.l(itemStack), (CharSequence)string)) {
            return false;
        }
        float f = this.a(itemStack);
        int n2 = 5;
        if (ItemStackInvoker.e(afy_2.a(this.mc.player.bp, n2)) && this.a(itemStack2 = ItemStackInvoker.a(afy_2.a(this.mc.player.bp, n2))) > f && StringInvoker.a(act_2.l(itemStack2), (CharSequence)string)) {
            return false;
        }
        ++n2;
        return true;
    }

    public void a(SettingEvent settingEvent) {
        ChestStealer.j();
        if (settingEvent == null || afm_0.b(settingEvent).equals(ayf_1.c) || afm_0.b(settingEvent).equals(ayf_1.b)) {
            this.c();
        }
    }

    private void c() {
        ChestStealer.j();
        Disabler disabler = (Disabler)ModuleInvoker.isEnable(ModuleRegistry.DISABLER);
        if (!(disabler.x() && aAK.c(disabler) || auk_2.a((Boolean)Ba.b(this.I)))) {
            if (!disabler.x()) {
                this.a(this.r(), ayf_1.g, 5000, NotificationType.WARNING);
            }
            this.a(this.r(), ayf_1.f, 5000, NotificationType.WARNING);
            Ba.a(this.I, auk_2.b(true));
        }
    }

    public IntProperty f() {
        return this.J;
    }

    public int b() {
        return P8.b((Integer)adt_2.a(this.J));
    }

    @EventTarget
    public void a(MotionUpdateEvent motionUpdateEvent) {
        ChestStealer.d();
        if (EventInvoker.getState(motionUpdateEvent).equals((Object)State.PRE)) {
            if (aCM.a(abb_2.PRE) || aCM.a(abb_2.LOBBY) || auk_2.a((Boolean)Ba.b(this.I)) && PlayerInvoker.q(this.mc.player)) {
                return;
            }
            if (auk_2.a((Boolean)Ba.b(this.H)) ? this.mc.currentScreen instanceof R1 : this.mc.currentScreen == null || this.mc.currentScreen instanceof R1 || this.mc.currentScreen instanceof GuiChat) {
                ItemStack itemStack;
                int n;
                int n2 = 1;
                if (ItemStackInvoker.e(afy_2.a(this.mc.player.bp, 4 + n2))) {
                    ItemStack itemStack2 = ItemStackInvoker.a(afy_2.a(this.mc.player.bp, 4 + n2));
                    if (this.a(itemStack2, n2)) {
                        // empty if block
                    }
                    if (qh_1.c(this.K, P8.b((Integer)adt_2.a(this.J)) * 50)) {
                        PlayerInvoker.b(this.mc.player, 4 + n2);
                        qh_1.b(this.K);
                    }
                }
                if (ItemStackInvoker.e(afy_2.a(this.mc.player.bp, n = 9)) && this.a(itemStack = ItemStackInvoker.a(afy_2.a(this.mc.player.bp, n)), n2) && this.a(itemStack) > 0.0f && qh_1.c(this.K, P8.b((Integer)adt_2.a(this.J)) * 50)) {
                    PlayerInvoker.d(this.mc.player, n);
                    qh_1.b(this.K);
                }
                ++n;
                ++n2;
            }
        }
    }

    public BooleanProperty a() {
        return this.I;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = AutoArmor.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x2D5C;
        if (N[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])O.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                O.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_d", exception);
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

    private float a(@NonNull ItemStack itemStack) {
        ChestStealer.j();
        float f = 0.0f;
        if (act_2.k(itemStack) instanceof ItemArmor) {
            ItemArmor itemArmor = (ItemArmor)act_2.k(itemStack);
            f = (float)((double)f + ((double)itemArmor.o + (double)((100 - itemArmor.o) * alf_0.a(yl_2.x.c, itemStack)) * 0.0075));
            f = (float)((double)f + (double)alf_0.a(yl_2.D.c, itemStack) / 100.0);
            f = (float)((double)f + (double)alf_0.a(yl_2.o.c, itemStack) / 100.0);
            f = (float)((double)f + (double)alf_0.a(yl_2.h.c, itemStack) / 100.0);
            f = (float)((double)f + (double)alf_0.a(yl_2.k.c, itemStack) / 50.0);
            f = (float)((double)f + (double)alf_0.a(yl_2.v.c, itemStack) / 100.0);
        }
        return f;
    }

    public BooleanProperty e() {
        return this.H;
    }

    static {
        O = new HashMap(13);
        long l4 = L ^ 0x4E2A22746172L;
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
            return MethodHandles.lookup().findStatic(AutoArmor.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

