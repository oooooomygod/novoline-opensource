/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.type.State;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.MouseInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import deobf.EntityPlayer;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
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

public class MCF
extends AbstractModule {
    private static long M = a1c.a(2326846941447191890L, -7502514283010806018L, MethodHandles.lookup().lookupClass()).a(119008091894883L);
    @Property(value="friend")
    private BooleanProperty K;
    private static Map P = new HashMap(13);
    @Property(value="pearl")
    private BooleanProperty H;
    private static String[] O;
    private boolean I;
    private static String[] N;
    @Property(value="down-place")
    private BooleanProperty L;
    @Property(value="tag-mode")
    private StringProperty J;

    public MCF(@NonNull ModuleManager moduleManager, int n, EnumModuleType enumModuleType, char c, char c2, String string, String string2) {
        long l4 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)c2 << 48 >>> 48) ^ M;
        long l5 = l4 ^ 0x6EE705EC027EL;
        int n2 = (int)(l5 >>> 48);
        int n3 = (int)(l5 << 16 >>> 48);
        int n4 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n2, enumModuleType, string, (char)n3, n4, string2);
        this.H = asp_2.d();
        this.K = asp_2.d();
        this.L = asp_2.c();
        this.J = StringPropertyInvoker.b(asp_2.a((String)((Object)MCF.b("c", (int)19168, (long)(0x17B6DB579213DA0AL ^ l4)))), new String[]{MCF.b("c", (int)30396, (long)(0x39C95057E40F665BL ^ l4)), MCF.b("c", (int)29489, (long)(0xD58ABD6864463D1L ^ l4))});
        this.I = true;
        ManagerInvoker.put(new Setting((String)((Object)MCF.b("c", (int)14077, (long)(0x467591F2AFF72616L ^ l4))), (String)((Object)MCF.b("c", (int)95, (long)(0x7C5F18803D4F10B7L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.K));
        ManagerInvoker.put(new Setting((String)((Object)MCF.b("c", (int)25332, (long)(0x3EE941EE12A37217L ^ l4))), (String)((Object)MCF.b("c", (int)3414, (long)(0xFC33D1A6C419DB2L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.J, this.K::get));
        ManagerInvoker.put(new Setting((String)((Object)MCF.b("c", (int)20190, (long)(0x3DF5500C9F695E3CL ^ l4))), (String)((Object)MCF.b("c", (int)25818, (long)(0x342901CACEFD743BL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.H));
        ManagerInvoker.put(new Setting((String)((Object)MCF.b("c", (int)26257, (long)(0x588AB873FD767674L ^ l4))), (String)((Object)MCF.b("c", (int)1007, (long)(0x3DB6381351131309L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.L));
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = MCF.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    static {
        long l4 = M ^ 0x5C0CEFF0ECF1L;
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

    private int b() {
        return PlayerInvoker.c(this.mc.player, Items.ender_pearl);
    }

    private void a(int n) {
        UhcCrafts.d();
        if (this.mc.player.inventory.a != this.b()) {
            this.b(new C09PacketHeldItemChange(n));
        }
    }

    public boolean a() {
        UhcCrafts.d();
        return this.x() && auk_2.a((Boolean)Ba.b(this.L));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_c" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    @EventTarget
    public void a(MotionUpdateEvent motionUpdateEvent) {
        block6: {
            block7: {
                block9: {
                    block8: {
                        UhcCrafts.d();
                        if (!EventInvoker.getState(motionUpdateEvent).equals((Object)State.PRE)) break block6;
                        if (!MouseInvoker.c(2)) break block7;
                        if (!this.I) break block6;
                        if (this.mc.objectMouseOver.entityHit != null && this.mc.objectMouseOver.entityHit instanceof EntityPlayer && auk_2.a((Boolean)Ba.b(this.K))) break block8;
                        if (this.b() == -1 || !auk_2.a((Boolean)Ba.b(this.H)) || auk_2.a((Boolean)Ba.b(this.L)) && this.mc.objectMouseOver.typeOfHit == net.I.BLOCK) break block9;
                        this.a(this.b());
                        this.a(new C08PacketPlayerBlockPlacement(InventoryInvoker.c(this.mc.player.inventory, this.b())));
                        this.a(this.mc.player.inventory.a);
                    }
                    if (auk_2.a((Boolean)Ba.b(this.K))) {
                        EntityPlayer entityPlayer = (EntityPlayer)this.mc.objectMouseOver.entityHit;
                        if (StringPropertyInvoker.isMode(this.J, d1_0.c)) {
                            PlayerInvoker.b(this.mc.player, aL0.a(aL0.a(new StringBuilder(), d1_0.d), entityPlayer.getName()).toString());
                        }
                        if (StringPropertyInvoker.isMode(this.J, d1_0.b)) {
                            PlayerInvoker.b(this.mc.player, aL0.a(aL0.a(new StringBuilder(), d1_0.a), entityPlayer.getName()).toString());
                        }
                    }
                }
                this.I = false;
            }
            this.I = true;
        }
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x42CD;
        if (O[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])P.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                P.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_c", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return O[n2];
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(MCF.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

