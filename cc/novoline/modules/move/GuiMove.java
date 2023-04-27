/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.move;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.GuiMoveUpdateEvent;
import cc.novoline.events.events.TickUpdateEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.EventManagerInvoker;
import cc.novoline.invoke.GameSettingsInvoker;
import cc.novoline.invoke.KeyboardInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
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
import net.ChestStealer;
import net.ModuleManager;
import net.MovementInput;
import net.UhcCrafts;
import net.a1c;
import net.aCM;
import net.aOK;
import net.alu_0;
import net.arw_1;
import net.asp_2;
import net.auk_2;
import net.ty_2;
import net.wj_0;
import org.checkerframework.checker.nullness.qual.NonNull;

public class GuiMove
extends AbstractModule {
    private static String[] J;
    @Property(value="sneak")
    private BooleanProperty H;
    private static String[] K;
    private static long I;
    private static Map L;

    public GuiMove(@NonNull int n, ModuleManager moduleManager, EnumModuleType enumModuleType, int n2, String string, String string2, short s) {
        long l4 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)s << 48 >>> 48) ^ I;
        long l5 = l4 ^ 0x2D7A396C4294L;
        int n3 = (int)(l5 >>> 48);
        int n4 = (int)(l5 << 16 >>> 48);
        int n5 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n3, enumModuleType, string, (char)n4, n5, string2);
        this.H = asp_2.a(auk_2.b(false));
        ManagerInvoker.put(new Setting((String)((Object)GuiMove.b("d", (int)20164, (long)(0x108DE6D3517D9DF6L ^ l4))), (String)((Object)GuiMove.b("d", (int)20255, (long)(0x613CD93D9E6D9C2CL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.H));
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = GuiMove.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_I" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x41F6;
        if (K[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])L.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                L.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_I", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return K[n2];
    }

    public void b() {
        MovementInput movementInput = PlayerInvoker.j(this.mc.player);
        wj_0.a(movementInput, 0.0f);
        UhcCrafts.d();
        wj_0.b(movementInput, 0.0f);
        if (KeyboardInvoker.a(GameSettingsInvoker.getKeyCode(this.mc.gameSettings.cd))) {
            wj_0.b(movementInput, wj_0.c(movementInput) + 1.0f);
        }
        if (KeyboardInvoker.a(GameSettingsInvoker.getKeyCode(this.mc.gameSettings.L))) {
            wj_0.b(movementInput, wj_0.c(movementInput) - 1.0f);
        }
        if (KeyboardInvoker.a(GameSettingsInvoker.getKeyCode(this.mc.gameSettings.ac))) {
            wj_0.a(movementInput, wj_0.b(movementInput) + 1.0f);
        }
        if (KeyboardInvoker.a(GameSettingsInvoker.getKeyCode(this.mc.gameSettings.ab))) {
            wj_0.a(movementInput, wj_0.b(movementInput) - 1.0f);
        }
        wj_0.a(movementInput, KeyboardInvoker.a(GameSettingsInvoker.getKeyCode(this.mc.gameSettings.bo)));
        wj_0.b(movementInput, auk_2.a((Boolean)Ba.b(this.H)) ? KeyboardInvoker.a(GameSettingsInvoker.getKeyCode(this.mc.gameSettings.A)) : GameSettingsInvoker.e(this.mc.gameSettings.A));
        if (wj_0.a(movementInput) && !ModuleInvoker.isEnable(ModuleRegistry.FASTSNEAK).x()) {
            wj_0.a(movementInput, wj_0.b(movementInput) * 0.3f);
            wj_0.b(movementInput, wj_0.c(movementInput) * 0.3f);
        }
        ChestStealer chestStealer = (ChestStealer)ModuleInvoker.isEnable(ModuleRegistry.CHESTSTEALER);
        UhcCrafts uhcCrafts = (UhcCrafts)ModuleInvoker.isEnable(ModuleRegistry.UHCCRAFTS);
        GuiMoveUpdateEvent guiMoveUpdateEvent = new GuiMoveUpdateEvent();
        EventManagerInvoker.call(guiMoveUpdateEvent);
        if (ty_2.a(chestStealer) || alu_0.b(uhcCrafts) || arw_1.a(guiMoveUpdateEvent)) {
            wj_0.a(movementInput, 0.0f);
            wj_0.b(movementInput, 0.0f);
        }
    }

    @Override
    public void o() {
        this.a(aCM.d() ? aOK.a : aOK.d);
    }

    static {
        I = a1c.a(-1978111721666521221L, 5478353297174363451L, MethodHandles.lookup().lookupClass()).a(179321584349718L);
        L = new HashMap(13);
        long l4 = I ^ 0x225B031F84E8L;
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

    @EventTarget
    public void a(TickUpdateEvent tickUpdateEvent) {
        this.a(aCM.d() ? aOK.c : aOK.b);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(GuiMove.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

