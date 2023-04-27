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
import cc.novoline.events.events.SpawnCheckEvent;
import cc.novoline.events.events.TickUpdateEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.PacketEventInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.exploits.Blink;
import deobf.Entity;
import deobf.EntityPlayer;
import cc.novoline.modules.EnumModuleType;
import deobf.INetHandlerPlayClient;
import deobf.ModuleRegistry;
import deobf.Packet;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import net.minecraft.network.packts.S0CPacketSpawnPlayer;
import net.minecraft.network.packts.S18PacketEntityTeleport;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import net.Ba;
import net.BooleanProperty;
import net.Freecam;
import net.GW;
import net.K8;
import net.KillAura;
import net.ModuleManager;
import net.Qc;
import net.a1c;
import net.a4Z;
import net.a6w_0;
import net.a9E;
import net.aAO;
import net.aB0;
import net.aBO;
import net.aCM;
import net.aDM;
import net.aMF;
import net.abb_2;
import net.ajy;
import net.asp_2;
import net.auk_2;
import net.ayj_0;
import net.dz_0;
import net.mo_0;
import net.nr_0;
import net.yd_2;
import org.checkerframework.checker.nullness.qual.NonNull;

public class AntiBot
extends AbstractModule {
    private static Map L;
    @Property(value="anti-staff")
    private BooleanProperty H;
    private static long I;
    private static String[] J;
    private static String[] K;

    private boolean lambda$entityPlayersList$0(Blink blink, Freecam freecam, EntityPlayer entityPlayer) {
        KillAura.w();
        return !entityPlayer.equals(this.mc.player) && !entityPlayer.equals(ajy.a(blink)) && !entityPlayer.equals(aAO.b(freecam));
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x767D;
        if (K[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])L.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                L.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a0C", exception);
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

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a0C" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    @EventTarget
    public void a(SpawnCheckEvent spawnCheckEvent) {
        KillAura.w();
        if (auk_2.a((Boolean)Ba.b(this.H)) && nr_0.b(spawnCheckEvent) == yd_2.ADD && nr_0.a(spawnCheckEvent) instanceof EntityPlayer && nr_0.a(spawnCheckEvent) != this.mc.player && aCM.c() > 40 && !aCM.a(abb_2.BW) && !aCM.a(abb_2.UHC) && PlayerInvoker.b(this.mc.player, nr_0.a(spawnCheckEvent)) < 16.0f && nr_0.a((SpawnCheckEvent)spawnCheckEvent).ticksExisted < 20) {
            BlockInvoker.b(this.mc.world, nr_0.a(spawnCheckEvent));
        }
    }

    static {
        I = a1c.a(8636936643256814475L, 289506191796885584L, MethodHandles.lookup().lookupClass()).a(141250143928441L);
        L = new HashMap(13);
        long l4 = I ^ 0x1B98D384F79AL;
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
        String string2 = AntiBot.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private boolean a(Entity entity) {
        KillAura.w();
        String string = aBO.a(ayj_0.P(entity));
        if (entity instanceof EntityPlayer) {
            EntityPlayer entityPlayer = (EntityPlayer)entity;
            return entityPlayer.bx < 150;
        }
        if (!StringInvoker.e(string, K8.d) && StringInvoker.c(string, K8.a)) {
            return true;
        }
        return StringInvoker.a(string, (CharSequence)K8.f);
    }

    private boolean a(EntityPlayer entityPlayer) {
        return ListInvoker.contains(a9E.a(GW.e(this.mc.ingameGUI)), aDM.a(a4Z.a(a6w_0.G(entityPlayer))));
    }

    @EventTarget
    public void a(TickUpdateEvent tickUpdateEvent) {
        EntityPlayer entityPlayer;
        Iterator iterator;
        KillAura.w();
        this.a(aCM.d() ? K8.i : K8.e);
        if (aCM.d() && !aCM.a(abb_2.LOBBY) && dz_0.c(iterator = ListInvoker.iterator(BlockInvoker.s(this.mc.world))) && (entityPlayer = (EntityPlayer)dz_0.b(iterator)) != this.mc.player && entityPlayer != null) {
            String string = aBO.a(a6w_0.w(entityPlayer));
            if (!this.a(entityPlayer) && !StringInvoker.a(StringInvoker.i(string), (CharSequence)K8.g) && StringInvoker.e(string, K8.b) && a6w_0.c(entityPlayer) && !this.a((Entity)entityPlayer) && a6w_0.i(entityPlayer)) {
                BlockInvoker.b(this.mc.world, entityPlayer);
            }
        }
    }

    private List<EntityPlayer> a() {
        Blink blink = (Blink)ModuleInvoker.isEnable(ModuleRegistry.BLINK);
        Freecam freecam = (Freecam)ModuleInvoker.isEnable(ModuleRegistry.FREECAM);
        return (List)aMF.a(aMF.b(ListInvoker.stream(BlockInvoker.s(this.mc.world)), arg_0 -> this.lambda$entityPlayersList$0(blink, freecam, arg_0)), aB0.a());
    }

    @EventTarget
    public void a(PacketEvent packetEvent) {
        KillAura.w();
        if (!(aCM.d() && aCM.a(abb_2.LOBBY) || !PacketEventInvoker.getState(packetEvent).equals((Object)State.INCOMING))) {
            Packet<INetHandlerPlayClient> packet;
            EntityPlayer entityPlayer;
            if (PacketEventInvoker.c(packetEvent) instanceof S18PacketEntityTeleport && (entityPlayer = (EntityPlayer)BlockInvoker.b(this.mc.world, Qc.e(packet = (S18PacketEntityTeleport)PacketEventInvoker.c(packetEvent)))) instanceof EntityPlayer && a6w_0.i(entityPlayer) && entityPlayer.ticksExisted > 3 && ListInvoker.contains(BlockInvoker.s(this.mc.world), entityPlayer) && !this.a(entityPlayer)) {
                BlockInvoker.b(this.mc.world, entityPlayer);
            }
            if (PacketEventInvoker.c(packetEvent) instanceof S0CPacketSpawnPlayer) {
                packet = (S0CPacketSpawnPlayer)PacketEventInvoker.c(packetEvent);
                entityPlayer = (EntityPlayer)BlockInvoker.b(this.mc.world, mo_0.a((S0CPacketSpawnPlayer)packet));
                double d = (double)mo_0.b((S0CPacketSpawnPlayer)packet) / 32.0;
                double d2 = (double)mo_0.g((S0CPacketSpawnPlayer)packet) / 32.0;
                double d3 = (double)mo_0.d((S0CPacketSpawnPlayer)packet) / 32.0;
                double d4 = this.mc.player.posX - d;
                double d5 = this.mc.player.posY - d2;
                double d6 = this.mc.player.posZ - d3;
                double d7 = MathInvoker.d(d4 * d4 + d5 * d5 + d6 * d6);
                if (ListInvoker.contains(BlockInvoker.s(this.mc.world), entityPlayer) && d7 <= 17.0 && !entityPlayer.equals(this.mc.player) && d != this.mc.player.posX && d2 != this.mc.player.posY && d3 != this.mc.player.posZ) {
                    BlockInvoker.b(this.mc.world, entityPlayer);
                }
            }
        }
    }

    @Override
    public void o() {
        this.a(aCM.d() ? K8.h : K8.c);
    }

    public AntiBot(@NonNull ModuleManager moduleManager, EnumModuleType enumModuleType, String string, String string2, int n, int n2, int n3) {
        long l4 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ I;
        long l5 = l4 ^ 0x7F60E6854C79L;
        int n4 = (int)(l5 >>> 48);
        int n5 = (int)(l5 << 16 >>> 48);
        int n6 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n4, enumModuleType, string, (char)n5, n6, string2);
        this.H = asp_2.d();
        ManagerInvoker.put(new Setting((String)((Object)AntiBot.b("s", (int)12041, (long)(0x4C94F1326A56455CL ^ l4))), (String)((Object)AntiBot.b("s", (int)13687, (long)(0x1ACFE5340916DF23L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.H));
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AntiBot.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

