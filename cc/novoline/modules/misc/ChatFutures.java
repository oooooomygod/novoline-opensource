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
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.PacketEventInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import deobf.IntProperty;
import deobf.MCInvoker;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import deobf.TimerUtil;
import net.minecraft.network.packts.C01PacketChatMessage;
import net.minecraft.network.packts.S45PacketTitle;
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
import net.ModuleManager;
import net.P8;
import net.Q2;
import net.StringProperty;
import net.UhcCrafts;
import net.a1c;
import net.aBO;
import net.aCM;
import net.aL0;
import net.aco_0;
import net.adt_2;
import net.asp_2;
import net.auk_2;
import net.avj_1;
import net.qh_1;
import net.uq_1;
import org.checkerframework.checker.nullness.qual.NonNull;

public class ChatFutures
extends AbstractModule {
    private static String[] R;
    @Property(value="delay")
    private IntProperty K;
    private static long Q;
    @Property(value="auto-gg-message")
    private StringProperty N;
    @Property(value="filter-bypass")
    private BooleanProperty L;
    @Property(value="auto-gg")
    private BooleanProperty I;
    @Property(value="text")
    private StringProperty H;
    private TimerUtil M;
    private TimerUtil O;
    @Property(value="mode")
    private StringProperty J;
    @Property(value="spammer")
    private BooleanProperty P;
    private static Map T;
    private static String[] S;

    @EventTarget
    public void a(MotionUpdateEvent motionUpdateEvent) {
        UhcCrafts.d();
        if (EventInvoker.getState(motionUpdateEvent).equals((Object)cc.novoline.events.type.State.PRE) && auk_2.a((Boolean)Ba.b(this.P)) && qh_1.c(this.O, P8.b((Integer)adt_2.a(this.K)))) {
            if (StringInvoker.e((String)StringPropertyInvoker.b(this.H), uq_1.M) || StringInvoker.e((String)StringPropertyInvoker.b(this.H), uq_1.h)) {
                this.b(new C01PacketChatMessage((String)StringPropertyInvoker.b(this.H)));
            }
            this.a(new C01PacketChatMessage(aL0.a(aL0.a(new StringBuilder(), aCM.d() && !MCInvoker.k(this.mc) ? uq_1.x : uq_1.f), (String)StringPropertyInvoker.b(this.H)).toString()));
            qh_1.b(this.O);
        }
    }

    private int b() {
        UhcCrafts.d();
        String string = aBO.a(PlayerInvoker.Z(this.mc.player));
        return StringInvoker.a(string, (CharSequence)uq_1.g) || StringInvoker.a(string, (CharSequence)uq_1.p) ? 1050 : 3050;
    }

    static {
        Q = a1c.a(8907393777130228454L, 6387438513724499442L, MethodHandles.lookup().lookupClass()).a(59953105243475L);
        T = new HashMap(13);
        long l4 = Q ^ 0x75BDA6AB00B4L;
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

    private boolean a(String string, String[] stringArray) {
        UhcCrafts.d();
        return StringInvoker.a(string, (CharSequence)uq_1.E) && stringArray.length < 3;
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x5B9E;
        if (S[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])T.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                T.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_x", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return S[n2];
    }

    public ChatFutures(@NonNull ModuleManager moduleManager, int n, EnumModuleType enumModuleType, String string, String string2, char c, char c2) {
        long l4 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)c2 << 48 >>> 48) ^ Q;
        long l5 = l4 ^ 0xB35F8A400D2L;
        int n2 = (int)(l5 >>> 48);
        int n3 = (int)(l5 << 16 >>> 48);
        int n4 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n2, enumModuleType, string, (char)n3, n4, string2);
        this.O = new TimerUtil();
        this.M = new TimerUtil();
        this.L = asp_2.c();
        this.P = asp_2.c();
        this.J = StringPropertyInvoker.b(asp_2.a((String)((Object)ChatFutures.b("w", (int)23989, (long)(0x3FB5980B9B5BD6AEL ^ l4)))), new String[]{ChatFutures.b("w", (int)29731, (long)(0x6A4ADA53CCB87F2DL ^ l4)), ChatFutures.b("w", (int)22010, (long)(0x37C0B0B5679DDEE9L ^ l4))});
        this.H = asp_2.a((String)((Object)ChatFutures.b("w", (int)1629, (long)(0x7DED47439B520D54L ^ l4))));
        this.K = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(3000)), P8.d(100)), P8.d(15000));
        this.I = asp_2.d();
        this.N = asp_2.a((String)((Object)ChatFutures.b("w", (int)2370, (long)(0x524B724146C2824FL ^ l4))));
        ManagerInvoker.put(new Setting((String)((Object)ChatFutures.b("w", (int)23264, (long)(0x7D84ACE9659451F6L ^ l4))), (String)((Object)ChatFutures.b("w", (int)98, (long)(0x6FD3610319B40B7BL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.L));
        UhcCrafts.d();
        ManagerInvoker.put(new Setting((String)((Object)ChatFutures.b("w", (int)21499, (long)(0x2CA721310ABE58E7L ^ l4))), (String)((Object)ChatFutures.b("w", (int)14255, (long)(0x469C624425EBCB7L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.J, this.L::get));
        ManagerInvoker.put(new Setting((String)((Object)ChatFutures.b("w", (int)26388, (long)(0x129CC12FE8916C00L ^ l4))), (String)((Object)ChatFutures.b("w", (int)9101, (long)(0x4B234AFB8B36289CL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.P));
        ManagerInvoker.put(new Setting((String)((Object)ChatFutures.b("w", (int)21308, (long)(0x60FC2124E0785826L ^ l4))), (String)((Object)ChatFutures.b("w", (int)14980, (long)(0x1202BEF3960EB196L ^ l4))), SettingType.TEXTBOX, (AbstractModule)this, (String)((Object)ChatFutures.b("w", (int)30182, (long)(0x21436F1B8192FEE9L ^ l4))), this.H, this.P::get));
        ManagerInvoker.put(new Setting((String)((Object)ChatFutures.b("w", (int)9166, (long)(0x7BA9AD31262028D9L ^ l4))), (String)((Object)ChatFutures.b("w", (int)31108, (long)(0x1E9C4E8D2AEB728CL ^ l4))), SettingType.SLIDER, this, this.K, 100.0, (String)((Object)ChatFutures.b("w", (int)29105, (long)(0x105E3C41E1D97AAFL ^ l4))), this.P::get));
        ManagerInvoker.put(new Setting((String)((Object)ChatFutures.b("w", (int)13285, (long)(0x4C3DBF096D19B8E9L ^ l4))), (String)((Object)ChatFutures.b("w", (int)27684, (long)(0x2F64C98FA9E86734L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.I));
        ManagerInvoker.put(new Setting((String)((Object)ChatFutures.b("w", (int)15580, (long)(0x26C32A958855B7C1L ^ l4))), (String)((Object)ChatFutures.b("w", (int)8978, (long)(0x19D29C8FB9382807L ^ l4))), SettingType.TEXTBOX, (AbstractModule)this, (String)((Object)ChatFutures.b("w", (int)15339, (long)(0x1F3F4EF7D72BB0F4L ^ l4))), this.N, this.I::get));
        ListInvoker.b(new ListInvoker[3]);
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

    private void a(PacketEvent packetEvent) {
        S45PacketTitle s45PacketTitle;
        UhcCrafts.d();
        if (PacketEventInvoker.c(packetEvent) instanceof S45PacketTitle && aBO.d(avj_1.e(s45PacketTitle = (S45PacketTitle)PacketEventInvoker.c(packetEvent))).equals(uq_1.k) && qh_1.c(this.M, this.b())) {
            if (StringInvoker.e((String)StringPropertyInvoker.b(this.N), uq_1.n)) {
                this.b(new C01PacketChatMessage((String)StringPropertyInvoker.b(this.N)));
            }
            String string = uq_1.K;
            if (aCM.d() && !aCM.a(Q2.ALL)) {
                string = uq_1.b;
            }
            if (StringInvoker.e(StringInvoker.i(string = aL0.a(aL0.a(new StringBuilder(), string), (String)StringPropertyInvoker.b(this.N)).toString()), uq_1.F)) {
                this.b(new C01PacketChatMessage(string));
            }
            this.a(new C01PacketChatMessage(string));
        }
    }

    private boolean b(String string, String[] stringArray) {
        UhcCrafts.d();
        return StringInvoker.a(string, (CharSequence)this.mc.player.getName()) && !stringArray[0].equals(this.mc.player.getName()) && (StringInvoker.a(string, (CharSequence)uq_1.J) || StringInvoker.a(string, (CharSequence)uq_1.a));
    }

    @EventTarget
    public void b(PacketEvent packetEvent) {
        block8: {
            block7: {
                C01PacketChatMessage c01PacketChatMessage;
                String string;
                UhcCrafts.d();
                if (!PacketEventInvoker.getState(packetEvent).equals((Object)State.OUTGOING)) break block7;
                if (!(PacketEventInvoker.c(packetEvent) instanceof C01PacketChatMessage)) break block8;
                if (auk_2.a((Boolean)Ba.b(this.L)) && !StringInvoker.e(string = aco_0.a(c01PacketChatMessage = (C01PacketChatMessage)PacketEventInvoker.c(packetEvent)), uq_1.O) && !StringInvoker.e(string, uq_1.i)) {
                    char[] cArray;
                    int n;
                    int n2;
                    StringBuilder stringBuilder = new StringBuilder();
                    if (StringPropertyInvoker.isMode(this.J, uq_1.S)) {
                        string = StringInvoker.a(string, (CharSequence)uq_1.r, (CharSequence)uq_1.s);
                        string = StringInvoker.a(string, (CharSequence)uq_1.I, (CharSequence)uq_1.D);
                        string = StringInvoker.a(string, (CharSequence)uq_1.e, (CharSequence)uq_1.N);
                        string = StringInvoker.a(string, (CharSequence)uq_1.y, (CharSequence)uq_1.u);
                        string = StringInvoker.a(string, (CharSequence)uq_1.T, (CharSequence)uq_1.H);
                        string = StringInvoker.a(string, (CharSequence)uq_1.d, (CharSequence)uq_1.B);
                        string = StringInvoker.a(string, (CharSequence)uq_1.c, (CharSequence)uq_1.G);
                        string = StringInvoker.a(string, (CharSequence)uq_1.j, (CharSequence)uq_1.L);
                        string = StringInvoker.a(string, (CharSequence)uq_1.A, (CharSequence)uq_1.t);
                        string = StringInvoker.a(string, (CharSequence)uq_1.R, (CharSequence)uq_1.m);
                        string = StringInvoker.a(string, (CharSequence)uq_1.q, (CharSequence)uq_1.w);
                        string = StringInvoker.a(string, (CharSequence)uq_1.v, (CharSequence)uq_1.Q);
                        string = StringInvoker.a(string, (CharSequence)uq_1.z, (CharSequence)uq_1.o);
                        aco_0.a(c01PacketChatMessage, string);
                    }
                    if ((n2 = 0) < (n = (cArray = StringInvoker.f(string)).length)) {
                        char c = cArray[n2];
                        aL0.a(aL0.a(stringBuilder, c), uq_1.P);
                        ++n2;
                    }
                    aco_0.a(c01PacketChatMessage, stringBuilder.toString());
                }
                qh_1.b(this.M);
            }
            if (auk_2.a((Boolean)Ba.b(this.I))) {
                this.a(packetEvent);
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
            throw new RuntimeException("net/a_x" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private int a() {
        UhcCrafts.d();
        String string = aBO.a(PlayerInvoker.Z(this.mc.player));
        return StringInvoker.a(string, (CharSequence)uq_1.l) || StringInvoker.a(string, (CharSequence)uq_1.C) ? 1050 : 3050;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = ChatFutures.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ChatFutures.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

