/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.misc;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.type.State;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.GameSettingsInvoker;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.ObjectMouseOverInvoker;
import cc.novoline.invoke.PlayerControllerInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import net.minecraft.item.ItemStack;
import deobf.ModuleRegistry;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
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
import net.Item;
import net.KillAura;
import net.LC;
import net.ModuleManager;
import net.QI;
import net.UhcCrafts;
import net.a1c;
import net.abx_0;
import net.act_2;
import net.alf_0;
import net.asp_2;
import net.atH;
import net.auk_2;
import net.lw_0;
import net.yl_2;
import org.checkerframework.checker.nullness.qual.NonNull;

public class AutoTool
extends AbstractModule {
    @Property(value="auto-weapon")
    private BooleanProperty H;
    private static Map O;
    private static long L;
    private static String[] M;
    private int K;
    private boolean I;
    private static String[] N;
    @Property(value="switch-back")
    private BooleanProperty J;

    @EventTarget
    public void a(MotionUpdateEvent motionUpdateEvent) {
        UhcCrafts.d();
        if (EventInvoker.getState(motionUpdateEvent).equals((Object)State.PRE)) {
            KillAura killAura = (KillAura)ModuleInvoker.isEnable(ModuleRegistry.KILLAURA);
            if (auk_2.a((Boolean)Ba.b(this.H)) && (this.mc.objectMouseOver.entityHit != null && GameSettingsInvoker.e(this.mc.gameSettings.G) || atH.m(killAura))) {
                this.b();
            }
            if (PlayerControllerInvoker.c(this.mc.playerController)) {
                if (!this.I) {
                    this.K = this.mc.player.inventory.a;
                    this.I = true;
                }
                PlayerInvoker.a(this.mc.player, ObjectMouseOverInvoker.getBlockPos(this.mc.objectMouseOver));
            }
            if (this.I) {
                if (auk_2.a((Boolean)Ba.b(this.J))) {
                    this.mc.player.inventory.a = this.K;
                }
                this.I = false;
            }
        }
    }

    public void b() {
        UhcCrafts.d();
        float f = 1.0f;
        int n = -1;
        int n2 = 0;
        ItemStack itemStack = InventoryInvoker.c(this.mc.player.inventory, n2);
        if (itemStack != null && this.a(itemStack) > f) {
            n = n2;
            f = this.a(itemStack);
        }
        ++n2;
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x6F61;
        if (N[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])O.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                O.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_u", exception);
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

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = AutoTool.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private float a(@NonNull ItemStack itemStack) {
        UhcCrafts.d();
        float f = 0.0f;
        Item item = act_2.k(itemStack);
        if (item instanceof lw_0) {
            f += abx_0.a((lw_0)item);
        }
        if (item instanceof LC) {
            f += QI.b((LC)item);
        }
        return f += (float)alf_0.a(yl_2.b.c, itemStack) * 1.25f + (float)alf_0.a(yl_2.e.c, itemStack) * 0.3f;
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
        L = a1c.a(3099011756308476482L, -2599472500130912503L, MethodHandles.lookup().lookupClass()).a(133137884403708L);
        O = new HashMap(13);
        long l4 = L ^ 0x507CC9E4E096L;
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

    @Override
    public void w() {
        this.K = this.mc.player.inventory.a;
        this.I = false;
    }

    public AutoTool(@NonNull char c, int n, ModuleManager moduleManager, EnumModuleType enumModuleType, String string, char c2, String string2) {
        long l4 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)c2 << 48 >>> 48) ^ L;
        long l5 = l4 ^ 0x39A9A1CD96D3L;
        int n2 = (int)(l5 >>> 48);
        int n3 = (int)(l5 << 16 >>> 48);
        int n4 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n2, enumModuleType, string, (char)n3, n4, string2);
        this.J = asp_2.d();
        this.H = asp_2.d();
        ManagerInvoker.put(new Setting((String)((Object)AutoTool.b("e", (int)24418, (long)(0xC2DB48B6ED5F683L ^ l4))), (String)((Object)AutoTool.b("e", (int)8416, (long)(0xFCF3FA03DF40900L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.J));
        ManagerInvoker.put(new Setting((String)((Object)AutoTool.b("e", (int)29864, (long)(0x780BDDFDCED15D4AL ^ l4))), (String)((Object)AutoTool.b("e", (int)27539, (long)(0x1CBA6267CFAB4270L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.H));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_u" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AutoTool.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

