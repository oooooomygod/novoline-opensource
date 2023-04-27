/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.player;

import cc.novoline.events.EventTarget;
import cc.novoline.events.State;
import cc.novoline.events.events.CollideWithBlockEvent;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.events.MoveEvent;
import cc.novoline.events.events.PacketEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.MoveInoker;
import cc.novoline.invoke.PacketEventInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.exploits.Blink;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import net.minecraft.network.packts.C03PacketPlayer;
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

public class Freecam
extends AbstractModule {
    private static Map N;
    private static long K;
    private oj_2 H;
    private static String[] M;
    @Property(value="freecam-speed")
    private FloatProperty J;
    private static String[] L;
    public static boolean I;

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x750D;
        if (M[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])N.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                N.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_S", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return M[n2];
    }

    @Override
    public void o() {
        ChestStealer.d();
        if (this.mc.player == null) {
            return;
        }
        this.a(Blink.class);
        I = true;
        this.H = new oj_2(this.mc.world, PlayerInvoker.f(this.mc.player));
        this.H.inventory = this.mc.player.inventory;
        this.H.bp = this.mc.player.bp;
        ax0_0.a(this.H, this.mc.player.posX, this.mc.player.posY, this.mc.player.posZ, this.mc.player.rotationYaw, this.mc.player.rotationPitch);
        this.H.aP = this.mc.player.aP;
        ax0_0.a(this.H, PlayerInvoker.ad(this.mc.player));
        BlockInvoker.a(this.mc.world, ax0_0.b(this.H), this.H);
    }

    public Freecam(@NonNull ModuleManager moduleManager, EnumModuleType enumModuleType, int n, byte by, String string, int n2) {
        long l4 = ((long)n << 32 | (long)by << 56 >>> 32 | (long)n2 << 40 >>> 40) ^ K;
        long l5 = l4 ^ 0x2F0E32987F8EL;
        int n3 = (int)(l5 >>> 56);
        long l6 = l5 << 8 >>> 8;
        super((byte)n3, moduleManager, l6, enumModuleType, string);
        this.J = (FloatProperty)a9V.a((FloatProperty)a9V.b(asp_2.a(axx_1.a(4.0f)), axx_1.a(0.5f)), axx_1.a(5.0f));
        ManagerInvoker.put(new Setting((String)((Object)Freecam.b("w", (int)25626, (long)(0x5E7EA49E0324C9ADL ^ l4))), (String)((Object)Freecam.b("w", (int)29453, (long)(0x79F4F0E78E1CDEBBL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.J, 0.5));
    }

    @EventTarget
    public void a(BZ bZ) {
        alo_2.a(bZ, true);
    }

    public oj_2 a() {
        return this.H;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = Freecam.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    static {
        K = a1c.a(4516854840261395983L, 8080522640197609274L, MethodHandles.lookup().lookupClass()).a(134786284642522L);
        N = new HashMap(13);
        long l4 = K ^ 0x53684F0AFA68L;
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
        ChestStealer.j();
        if (this.H != null) {
            PlayerInvoker.a(this.mc.player, this.H.posX, this.H.posY, this.H.posZ, this.H.rotationYaw, this.H.rotationPitch);
            BlockInvoker.c(this.mc.world, ax0_0.b(this.H));
        }
        this.mc.player.H = false;
        I = false;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_S" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    @EventTarget
    public void a(MotionUpdateEvent motionUpdateEvent) {
        if (EventInvoker.getState(motionUpdateEvent).equals((Object)cc.novoline.events.type.State.PRE)) {
            this.mc.player.H = true;
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
    public void a(CollideWithBlockEvent collideWithBlockEvent) {
        A_.a(collideWithBlockEvent, null);
    }

    @EventTarget
    public void a(MoveEvent moveEvent) {
        ChestStealer.d();
        float f = axx_1.a((Float)a9V.a(this.J));
        if (wj_0.d(PlayerInvoker.j(this.mc.player))) {
            this.mc.player.motionY = f;
            MoveInoker.setY(moveEvent, this.mc.player.motionY);
        }
        if (wj_0.a(PlayerInvoker.j(this.mc.player))) {
            this.mc.player.motionY = -f;
            MoveInoker.setY(moveEvent, this.mc.player.motionY);
        }
        this.mc.player.motionY = 0.0;
        MoveInoker.setY(moveEvent, 0.0);
        MoveInoker.setSpeed(moveEvent, f);
    }

    @EventTarget
    public void a(PacketEvent packetEvent) {
        ChestStealer.d();
        if (PacketEventInvoker.getState(packetEvent).equals((Object)State.OUTGOING) && PacketEventInvoker.c(packetEvent) instanceof C03PacketPlayer) {
            PacketEventInvoker.setCancelled(packetEvent, true);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Freecam.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

