/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.combat;

import cc.novoline.events.EventTarget;
import cc.novoline.events.State;
import cc.novoline.events.events.LoadWorldEvent;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.events.MoveEvent;
import cc.novoline.events.events.PacketEvent;
import cc.novoline.events.events.SettingEvent;
import cc.novoline.events.events.TickUpdateEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.MoveInoker;
import cc.novoline.invoke.PacketEventInvoker;
import cc.novoline.invoke.PlayerControllerInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.configurations.annotation.Property;
import cc.novoline.modules.player.Scaffold;
import cc.novoline.modules.exploits.Blink;
import cc.novoline.modules.move.Speed;
import deobf.*;
import net.minecraft.network.packts.C02PacketUseEntity;
import net.minecraft.network.packts.C02PacketUseEntity$Action;
import net.minecraft.network.packts.C03PacketPlayer;
import net.minecraft.network.packts.C04PacketPlayerPosition;
import net.minecraft.network.packts.C0APacketAnimation;
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
import net.Hr;
import net.KillAura;
import net.MathHelper;
import net.ModuleManager;
import net.NotificationType;
import net.P8;
import net.StringProperty;
import net.a1c;
import net.aCM;
import net.aEI;
import net.aL0;
import net.adt_2;
import net.afm_0;
import net.asp_2;
import net.atH;
import net.auk_2;
import net.ka_0;
import net.wj_0;
import org.checkerframework.checker.nullness.qual.NonNull;

public class Criticals
extends AbstractModule {
    private static String[] N;
    private boolean I;
    @Property(value="fight-check")
    private BooleanProperty K;
    private static Map P;
    private boolean J;
    private static String[] O;
    private static long M;
    @Property(value="mode")
    private StringProperty L;
    @Property(value="spoof-tick")
    private IntProperty H;

    @EventTarget
    public void a(MoveEvent moveEvent) {
        KillAura.w();
        if (StringPropertyInvoker.isMode(this.L, aEI.h) && this.b()) {
            if (ModuleInvoker.isEnable(ModuleRegistry.LONGJUMP).x() || ModuleInvoker.isEnable(ModuleRegistry.SPEED).x() || ModuleInvoker.isEnable(ModuleRegistry.SCAFFOLD).x() || ModuleInvoker.isEnable(ModuleRegistry.FLY).x()) {
                return;
            }
            this.mc.player.motionY = 0.419999986886978;
            MoveInoker.setY(moveEvent, 0.419999986886978);
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a0K" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    public boolean b() {
        KillAura.w();
        Blink blink = (Blink)ModuleInvoker.isEnable(ModuleRegistry.BLINK);
        Speed speed = (Speed)ModuleInvoker.isEnable(ModuleRegistry.SPEED);
        Scaffold scaffold = (Scaffold)ModuleInvoker.isEnable(ModuleRegistry.SCAFFOLD);
        KillAura killAura = (KillAura)ModuleInvoker.isEnable(ModuleRegistry.KILLAURA);
        return !(!this.x() || !atH.m(killAura) || !atH.a(killAura, atH.a(killAura)) || PlayerControllerInvoker.c(this.mc.playerController) || !this.mc.player.onGround || PlayerInvoker.ak(this.mc.player) || this.mc.player.prevPosY - this.mc.player.posY != 0.0 || PlayerInvoker.ac(this.mc.player) || PlayerInvoker.Q(this.mc.player) || wj_0.d(PlayerInvoker.j(this.mc.player)) || blink.x() || speed.x() && PlayerInvoker.q(this.mc.player) || aCM.d() && scaffold.x());
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

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x245C;
        if (O[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])P.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                P.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a0K", exception);
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

    @Override
    public void w() {
        this.J = false;
        this.I = false;
    }

    @Override
    public void o() {
        this.a((String)StringPropertyInvoker.b(this.L));
    }

    static {
        M = a1c.a(-6404898555731877129L, -6887973886660388062L, MethodHandles.lookup().lookupClass()).a(268876230005117L);
        P = new HashMap(13);
        long l4 = M ^ 0x2F7DAA8D32A9L;
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

    @EventTarget
    public void a(PacketEvent packetEvent) {
        KillAura.w();
        if (PacketEventInvoker.getState(packetEvent).equals((Object)State.OUTGOING)) {
            C02PacketUseEntity c02PacketUseEntity;
            if (StringPropertyInvoker.isMode(this.L, aEI.j) && this.b() && PacketEventInvoker.c(packetEvent) instanceof C0APacketAnimation && this.a()) {
                double d = this.mc.player.posX;
                double d2 = this.mc.player.posY;
                double d3 = this.mc.player.posZ;
                if (aCM.d()) {
                    this.a(new C04PacketPlayerPosition(d, d2 + MathHelper.a(5.0E-4, 7.0E-4), d3, false));
                    this.a(new C04PacketPlayerPosition(d, d2 + MathHelper.a(2.0E-4, 3.0E-4), d3, false));
                }
                double d4 = MathHelper.a(0.004, 0.005);
                this.a(new C04PacketPlayerPosition(d, d2 + 0.0625 + d4, d3, false));
                this.a(new C04PacketPlayerPosition(d, d2 + 0.015625 + d4, d3, false));
            }
            if (PacketEventInvoker.c(packetEvent) instanceof C02PacketUseEntity && Hr.a(c02PacketUseEntity = (C02PacketUseEntity)PacketEventInvoker.c(packetEvent)) == C02PacketUseEntity$Action.ATTACK) {
                this.J = true;
            }
            if (PacketEventInvoker.c(packetEvent) instanceof C03PacketPlayer) {
                C03PacketPlayer c03PacketPlayer = (C03PacketPlayer)PacketEventInvoker.c(packetEvent);
                if (StringPropertyInvoker.isMode(this.L, aEI.i)) {
                    if (this.a(ModuleRegistry.SPEED, ModuleRegistry.LONGJUMP, ModuleRegistry.FLY, ModuleRegistry.SCAFFOLD)) {
                        this.J = false;
                        this.I = false;
                        return;
                    }
                    if (!this.mc.player.onGround && this.mc.player.motionY < 0.0 && PlayerInvoker.a(this.mc.player, -this.mc.player.motionY)) {
                        ka_0.b(c03PacketPlayer, true);
                    }
                    if (!this.mc.player.onGround) {
                        this.I = true;
                    }
                    if (this.I && this.mc.player.b <= P8.b((Integer)adt_2.a(this.H)) && (!auk_2.a((Boolean)Ba.b(this.K)) || this.J)) {
                        ka_0.b(c03PacketPlayer, false);
                    }
                    this.J = false;
                    this.I = false;
                }
            }
        }
    }

    @EventTarget
    public void a(LoadWorldEvent loadWorldEvent) {
        this.J = false;
        this.I = false;
    }

    public Criticals(@NonNull ModuleManager moduleManager, long l4, EnumModuleType enumModuleType, String string, char c) {
        long l5 = (l4 << 16 | (long)c << 48 >>> 48) ^ M;
        long l6 = l5 ^ 0x2A1BD5157B80L;
        int n = (int)(l6 >>> 56);
        long l7 = l6 << 8 >>> 8;
        super((byte)n, moduleManager, l7, enumModuleType, string);
        this.L = StringPropertyInvoker.b(asp_2.a((String)((Object)Criticals.b("d", (int)31006, (long)(0x521BFD7B822201F5L ^ l5)))), new String[]{Criticals.b("d", (int)15920, (long)(0x7B83B0FA2A0AC6D1L ^ l5)), Criticals.b("d", (int)23196, (long)(0x1AECE02633022270L ^ l5)), Criticals.b("d", (int)3674, (long)(0x1FF0F1A935FA76BAL ^ l5)), Criticals.b("d", (int)27315, (long)(0x49E29A5B88FD925EL ^ l5))});
        this.H = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(30)), P8.d(5)), P8.d(30));
        this.K = asp_2.c();
        ManagerInvoker.put(new Setting((String)((Object)Criticals.b("d", (int)17792, (long)(0x5A1A5EB87ACABD6EL ^ l5))), (String)((Object)Criticals.b("d", (int)7603, (long)(0x3E27F7E3C83CE55CL ^ l5))), SettingType.COMBOBOX, (AbstractModule)this, this.L));
        ManagerInvoker.put(new Setting((String)((Object)Criticals.b("d", (int)27060, (long)(0x2D7FE5F51B641157L ^ l5))), (String)((Object)Criticals.b("d", (int)26332, (long)(0x323E74C155E91E35L ^ l5))), SettingType.SLIDER, (AbstractModule)this, this.H, 1.0, this::lambda$new$0));
        ManagerInvoker.put(new Setting((String)((Object)Criticals.b("d", (int)14724, (long)(0x4E2BA840DC00C16CL ^ l5))), (String)((Object)Criticals.b("d", (int)16016, (long)(0x3571C3481C1A467AL ^ l5))), SettingType.CHECKBOX, (AbstractModule)this, this.K));
    }

    @EventTarget
    public void a(TickUpdateEvent tickUpdateEvent) {
        this.a((String)StringPropertyInvoker.b(this.L));
    }

    public StringProperty c() {
        return this.L;
    }

    private Boolean lambda$new$0() {
        return auk_2.b(StringPropertyInvoker.isMode(this.L, aEI.a));
    }

    public void a(SettingEvent settingEvent) {
        KillAura.w();
        if ((settingEvent == null || afm_0.b(settingEvent).equals(aEI.k)) && (StringPropertyInvoker.isMode(this.L, aEI.g) || StringPropertyInvoker.isMode(this.L, aEI.f))) {
            this.a(this.r(), aL0.a(aL0.a(aL0.a(new StringBuilder(), aEI.b), StringInvoker.a((String)StringPropertyInvoker.b(this.L))), aEI.d).toString(), 3500, NotificationType.WARNING);
            StringPropertyInvoker.b(this.L, aEI.c);
        }
    }

    @EventTarget
    public void a(MotionUpdateEvent motionUpdateEvent) {
        KillAura.w();
        if (EventInvoker.getState(motionUpdateEvent) == cc.novoline.events.type.State.PRE && StringPropertyInvoker.isMode(this.L, aEI.e) && this.b()) {
            KillAura killAura = (KillAura)ModuleInvoker.isEnable(ModuleRegistry.KILLAURA);
            EntityLivingBase entityLivingBase = (EntityLivingBase)atH.a(killAura);
            if (entityLivingBase.a8 == 9) {
                EventInvoker.b(motionUpdateEvent, EventInvoker.e(motionUpdateEvent) + 0.03125 + MathHelper.a(4.0E-4, 5.0E-4));
                EventInvoker.b(motionUpdateEvent, false);
            }
            if (entityLivingBase.a8 == 8) {
                EventInvoker.b(motionUpdateEvent, EventInvoker.e(motionUpdateEvent) + MathHelper.a(4.0E-4, 5.0E-4));
                EventInvoker.b(motionUpdateEvent, false);
            }
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = Criticals.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private boolean a() {
        KillAura killAura = (KillAura)ModuleInvoker.isEnable(ModuleRegistry.KILLAURA);
        KillAura.w();
        Entity entity = atH.a(killAura);
        return entity.hurtResistantTime > 2 && entity.hurtResistantTime <= 4 || entity.hurtResistantTime >= 17;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Criticals.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

