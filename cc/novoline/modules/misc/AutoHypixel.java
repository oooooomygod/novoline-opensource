/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.misc;

import cc.novoline.events.EventTarget;
import cc.novoline.events.State;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.events.PacketEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.NotificationManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.PacketEventInvoker;
import cc.novoline.invoke.ScriptInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.modules.AbstractModule;
import deobf.Entity;
import deobf.EntityPlayer;
import cc.novoline.modules.EnumModuleType;
import deobf.EnumPlayerType;
import deobf.IntProperty;
import deobf.Packet;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import net.minecraft.network.packts.C01PacketChatMessage;
import net.minecraft.network.packts.S02PacketChat;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import net.Ba;
import net.BooleanProperty;
import net.ListProperty;
import net.ModuleManager;
import net.NotificationType;
import net.P8;
import net.UhcCrafts;
import net.a1c;
import net.a6w_0;
import net.a8F;
import net.aBO;
import net.aL0;
import net.aU0;
import net.aci_0;
import net.adt_2;
import net.ag3_0;
import net.agz_1;
import net.anw_0;
import net.as6_0;
import net.asp_2;
import net.auk_2;
import net.ava_0;
import net.awo_1;
import net.ayj_0;
import net.dz_0;
import net.ue_2;
import org.checkerframework.checker.nullness.qual.NonNull;

public class AutoHypixel
extends AbstractModule {
    @Property(value="auto-pit-list")
    private ListProperty<String> I;
    private static String[] P;
    @Property(value="auto-play")
    private BooleanProperty K;
    @Property(value="min-bounty")
    private IntProperty H;
    private static Map Q;
    @Property(value="reconnect")
    private BooleanProperty M;
    @Property(value="delay")
    private IntProperty J;
    private static String[] O;
    private static long N;
    private List<Entity> L;

    private void d(PacketEvent packetEvent) {
        S02PacketChat s02PacketChat;
        String string;
        UhcCrafts.d();
        if (PacketEventInvoker.c(packetEvent) instanceof S02PacketChat && StringInvoker.a(string = aBO.d(ue_2.c(s02PacketChat = (S02PacketChat)PacketEventInvoker.c(packetEvent))), (CharSequence)awo_1.e)) {
            this.b(new C01PacketChatMessage(awo_1.E));
        }
    }

    private Boolean lambda$new$0() {
        return auk_2.b(ava_0.b(this.I, awo_1.r));
    }

    static void a(AutoHypixel autoHypixel, Packet packet) {
        autoHypixel.a(packet);
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

    private static ScriptException a(ScriptException scriptException) {
        return scriptException;
    }

    private void a(PacketEvent packetEvent) {
        S02PacketChat s02PacketChat;
        String string;
        UhcCrafts.d();
        if (PacketEventInvoker.c(packetEvent) instanceof S02PacketChat && StringInvoker.e(string = StringInvoker.g(ue_2.c(s02PacketChat = (S02PacketChat)PacketEventInvoker.c(packetEvent)).toString(), awo_1.c)[1], awo_1.f)) {
            String string2 = StringInvoker.g(string, awo_1.z)[0];
            NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), awo_1.B, P8.b((Integer)adt_2.a(this.J)) * 1000, NotificationType.INFO);
            aci_0.a(NovolineInvoker.i(NovolineInvoker.getInstance()), new aU0(this, P8.b((Integer)adt_2.a(this.J)) * 1000, ag3_0.TICK, string2));
        }
    }

    @EventTarget
    public void c(PacketEvent packetEvent) {
        UhcCrafts.d();
        if (PacketEventInvoker.getState(packetEvent).equals((Object)State.INCOMING)) {
            if (auk_2.a((Boolean)Ba.b(this.M))) {
                this.d(packetEvent);
            }
            if (auk_2.a((Boolean)Ba.b(this.K))) {
                this.a(packetEvent);
            }
            if (ava_0.b(this.I, awo_1.b)) {
                this.b(packetEvent);
            }
        }
    }

    private void b(PacketEvent packetEvent) {
        UhcCrafts.d();
        if (PacketEventInvoker.c(packetEvent) instanceof S02PacketChat) {
            S02PacketChat s02PacketChat = (S02PacketChat)PacketEventInvoker.c(packetEvent);
            String string = aBO.d(ue_2.c(s02PacketChat));
            if (StringInvoker.g(string, awo_1.w).length > 1) {
                return;
            }
            if (StringInvoker.a(string, (CharSequence)awo_1.x)) {
                String[] stringArray = StringInvoker.g(string, awo_1.i);
                ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
                ScriptEngine scriptEngine = agz_1.a(scriptEngineManager, awo_1.m);
                try {
                    this.b(new C01PacketChatMessage(ScriptInvoker.a(scriptEngine, StringInvoker.a(stringArray[1], (CharSequence)awo_1.d, (CharSequence)awo_1.a)).toString()));
                }
                catch (ScriptException scriptException) {
                    as6_0.b(scriptException);
                }
            }
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = AutoHypixel.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    public AutoHypixel(@NonNull char c, ModuleManager moduleManager, int n, EnumModuleType enumModuleType, short s, String string, String string2) {
        long l4 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48) ^ N;
        long l5 = l4 ^ 0xE986264B6A5L;
        int n2 = (int)(l5 >>> 48);
        int n3 = (int)(l5 << 16 >>> 48);
        int n4 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n2, enumModuleType, string, (char)n3, n4, string2);
        this.M = asp_2.c();
        this.K = asp_2.c();
        UhcCrafts.d();
        this.J = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(3)), P8.d(1)), P8.d(10));
        this.I = ava_0.a(asp_2.a(AutoHypixel.b("i", (int)32493, (long)(0x2CB917720FC32D70L ^ l4))), new String[]{AutoHypixel.b("i", (int)3484, (long)(0x66EC04727405DE0AL ^ l4)), AutoHypixel.b("i", (int)30255, (long)(0x5541DD487B5625B0L ^ l4))});
        this.H = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(500)), P8.d(50)), P8.d(5000));
        this.L = new CopyOnWriteArrayList<Entity>();
        ManagerInvoker.put(new Setting((String)((Object)AutoHypixel.b("i", (int)17075, (long)(0x43EE260BFD1127L ^ l4))), (String)((Object)AutoHypixel.b("i", (int)8681, (long)(0x3FFEFE1BD729F279L ^ l4))), SettingType.SELECTBOX, (AbstractModule)this, this.I));
        ManagerInvoker.put(new Setting((String)((Object)AutoHypixel.b("i", (int)10301, (long)(0x3D35F4A3F1CB7BACL ^ l4))), (String)((Object)AutoHypixel.b("i", (int)12224, (long)(0xF710DCEB75C7C53L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.H, 50.0, this::lambda$new$0));
        ManagerInvoker.put(new Setting((String)((Object)AutoHypixel.b("i", (int)26046, (long)(0x352FCF6795993620L ^ l4))), (String)((Object)AutoHypixel.b("i", (int)23055, (long)(0x225AF488B631899DL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.M));
        ManagerInvoker.put(new Setting((String)((Object)AutoHypixel.b("i", (int)10012, (long)(0xD67FC1B93067489L ^ l4))), (String)((Object)AutoHypixel.b("i", (int)26508, (long)(0x49E660685AAB3416L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.K));
        ManagerInvoker.put(new Setting((String)((Object)AutoHypixel.b("i", (int)15778, (long)(0x4A6BF1C1E897EE3EL ^ l4))), (String)((Object)AutoHypixel.b("i", (int)15899, (long)(0x425C085A33476D8CL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.J, 1.0, this.K::get));
        if (ListInvoker.b() != null) {
            UhcCrafts.e("nT8tF");
        }
    }

    @Override
    public void w() {
        UhcCrafts.d();
        if (!ListInvoker.isEmpty(this.L)) {
            ListInvoker.clear(this.L);
        }
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x3562;
        if (P[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])Q.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                Q.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_r", exception);
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

    @EventTarget
    public void a(MotionUpdateEvent motionUpdateEvent) {
        UhcCrafts.d();
        if (EventInvoker.getState(motionUpdateEvent).equals((Object)cc.novoline.events.type.State.PRE)) {
            Entity entity;
            Iterator iterator = ListInvoker.iterator(this.L);
            if (dz_0.c(iterator)) {
                entity = (Entity)dz_0.b(iterator);
                if (!ListInvoker.contains(BlockInvoker.s(this.mc.world), entity)) {
                    ListInvoker.remove(this.L, entity);
                    a8F.b(NovolineInvoker.A(this.novoline), entity.getName(), EnumPlayerType.TARGET);
                }
            }
            if (ava_0.b(this.I, awo_1.C)) {
                int n;
                String[] stringArray;
                String string;
                iterator = ListInvoker.iterator(BlockInvoker.s(this.mc.world));
                if (dz_0.c(iterator) && !(entity = (EntityPlayer)dz_0.b(iterator)).equals(this.mc.player)) {
                    string = aBO.d(a6w_0.w((EntityPlayer)entity));
                    ((EntityPlayer)entity).getName();
                    if (StringInvoker.a(string, (CharSequence)awo_1.A) && (stringArray = StringInvoker.g(string, awo_1.p)).length > 2 && (n = P8.a(StringInvoker.a(StringInvoker.a(stringArray[stringArray.length - 1], (CharSequence)awo_1.j, (CharSequence)awo_1.t), (CharSequence)awo_1.q, (CharSequence)awo_1.D))) >= P8.b((Integer)adt_2.a(this.H)) && !ListInvoker.contains(this.L, entity) && !a8F.a(NovolineInvoker.A(this.novoline), ((EntityPlayer)entity).getName(), EnumPlayerType.FRIEND)) {
                        ListInvoker.add(this.L, entity);
                        this.a(awo_1.k, aL0.a(aL0.a(aL0.a(aL0.c(aL0.a(aL0.a(aL0.a(new StringBuilder(), ((EntityPlayer)entity).getName()), awo_1.o), (Object)anw_0.GOLD), n), awo_1.n), (Object)anw_0.RESET), awo_1.h).toString(), 7000, NotificationType.INFO);
                    }
                }
                if (dz_0.c(iterator = ListInvoker.iterator(this.L))) {
                    entity = (Entity)dz_0.b(iterator);
                    if (a8F.a(NovolineInvoker.A(this.novoline), entity.getName(), EnumPlayerType.FRIEND)) {
                        ListInvoker.remove(this.L, entity);
                        a8F.b(NovolineInvoker.A(this.novoline), entity.getName(), EnumPlayerType.TARGET);
                    }
                    string = aBO.d(ayj_0.P(entity));
                    entity.getName();
                    a8F.c(NovolineInvoker.A(this.novoline), entity.getName(), EnumPlayerType.TARGET);
                    if (StringInvoker.a(string, (CharSequence)awo_1.g)) {
                        stringArray = StringInvoker.g(string, awo_1.l);
                        if (stringArray.length < 3) {
                            ListInvoker.remove(this.L, entity);
                            a8F.b(NovolineInvoker.A(this.novoline), entity.getName(), EnumPlayerType.TARGET);
                        }
                        if ((n = P8.a(StringInvoker.a(StringInvoker.a(stringArray[stringArray.length - 1], (CharSequence)awo_1.y, (CharSequence)awo_1.s), (CharSequence)awo_1.v, (CharSequence)awo_1.u))) < P8.b((Integer)adt_2.a(this.H))) {
                            ListInvoker.remove(this.L, entity);
                            a8F.b(NovolineInvoker.A(this.novoline), entity.getName(), EnumPlayerType.TARGET);
                        }
                    }
                    ListInvoker.remove(this.L, entity);
                    a8F.b(NovolineInvoker.A(this.novoline), entity.getName(), EnumPlayerType.TARGET);
                }
            }
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_r" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    static {
        N = a1c.a(5712600864866497236L, 2751456141555601982L, MethodHandles.lookup().lookupClass()).a(40168956188166L);
        Q = new HashMap(13);
        long l4 = N ^ 0x612CE15C8BCBL;
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
            return MethodHandles.lookup().findStatic(AutoHypixel.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

