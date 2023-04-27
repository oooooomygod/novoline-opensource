/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.events.EventTarget;
import cc.novoline.events.State;
import cc.novoline.events.events.LoadWorldEvent;
import cc.novoline.events.events.PacketEvent;
import cc.novoline.events.events.PlayerUpdateEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.PacketEventInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import deobf.TimerUtil;
import net.minecraft.network.packts.C01PacketChatMessage;
import net.minecraft.network.packts.S02PacketChat;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;

import org.checkerframework.checker.nullness.qual.NonNull;

public class a0T
extends AbstractModule {
    private List<String> L;
    private int K;
    private Path J;
    private static long N = a1c.a(-2152959980230356513L, 6530236230211706778L, MethodHandles.lookup().lookupClass()).a(154501335868912L);
    private TimerUtil I;
    private List<String> H;
    private static Map Q = new HashMap(13);
    private static String[] P;
    @Property(value="sult-order")
    private StringProperty M;
    private static String[] O;

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x7457;
        if (P[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])Q.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                Q.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a0T", exception);
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

    @Override
    public void w() {
        ListInvoker.clear(this.L);
        this.K = 0;
    }

    private List<String> f() {
        File file = new File(this.J.toString());
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
        }
        catch (FileNotFoundException fileNotFoundException) {
            Uu.b(fileNotFoundException);
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        return (List)aMF.a(auq_0.b(bufferedReader), aB0.a());
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void o() {
        this.b();
    }

    @EventTarget
    public void a(PlayerUpdateEvent playerUpdateEvent) {
        KillAura.w();
        Iterator iterator = ListInvoker.iterator(this.L);
        if (dz_0.c(iterator)) {
            String string = (String)dz_0.b(iterator);
            if (qh_1.c(this.I, this.d())) {
                int n = StringPropertyInvoker.isMode(this.M, zr_2.c) ? anf_2.a(anf_2.c(), 0, ListInvoker.size(this.H)) : this.K;
                String string2 = StringInvoker.a((String)ListInvoker.get(this.H, n), (CharSequence)zr_2.e, (CharSequence)string);
                StringBuilder stringBuilder = new StringBuilder();
                int n2 = 0;
                char[] cArray = StringInvoker.f(string2);
                int n3 = cArray.length;
                if (n2 < n3) {
                    char c = cArray[n2];
                    aL0.a(stringBuilder, c);
                    aL0.a(stringBuilder, zr_2.j);
                    ++n2;
                }
                PlayerInvoker.b(this.mc.player, stringBuilder.toString());
                ListInvoker.remove(this.L, string);
                qh_1.b(this.I);
                ++this.K;
                if (this.K > ListInvoker.size(this.H) - 1) {
                    this.K = 0;
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
            throw new RuntimeException("net/a0T" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private void b() {
        block4: {
            KillAura.w();
            if (!aev_1.b(this.J, new LinkOption[0])) {
                try {
                    aev_1.c(this.J, new FileAttribute[0]);
                    break block4;
                }
                catch (IOException iOException) {
                    a4E.b(iOException);
                }
            }
            if (ListInvoker.isEmpty(this.f())) {
                this.e();
            }
            this.H = this.f();
        }
    }

    private boolean a(String string, String[] stringArray) {
        KillAura.w();
        return StringInvoker.a(string, (CharSequence)zr_2.f) && stringArray.length < 3;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = a0T.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private void e() {
        BufferedWriter bufferedWriter;
        block5: {
            File file = new File(this.J.toString());
            KillAura.w();
            FileWriter fileWriter = null;
            try {
                fileWriter = new FileWriter(file);
            }
            catch (IOException iOException) {
                a4E.b(iOException);
            }
            bufferedWriter = new BufferedWriter(fileWriter);
            abf_2.c(bufferedWriter);
            Iterator iterator = ListInvoker.iterator(this.H);
            if (!dz_0.c(iterator)) break block5;
            String string = (String)dz_0.b(iterator);
            abf_2.a(bufferedWriter, aL0.a(aL0.a(new StringBuilder(), string), zr_2.a).toString());
        }
        try {
            abf_2.a(bufferedWriter);
        }
        catch (IOException iOException) {
            a4E.b(iOException);
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
    public void a(PacketEvent packetEvent) {
        block8: {
            block7: {
                KillAura.w();
                if (PacketEventInvoker.getState(packetEvent) != State.INCOMING) break block7;
                if (!(PacketEventInvoker.c(packetEvent) instanceof S02PacketChat)) break block8;
                S02PacketChat s02PacketChat = (S02PacketChat)PacketEventInvoker.c(packetEvent);
                String string = aBO.a(ue_2.c(s02PacketChat));
                String string2 = aod_2.c(aBO.d(ue_2.c(s02PacketChat)));
                String[] stringArray = StringInvoker.g(string2, zr_2.k);
                if (StringInvoker.a(string, (CharSequence)zr_2.i)) {
                    if (aCM.a(abb_2.PIT) && this.a(string, stringArray)) {
                        ListInvoker.add(this.L, stringArray[0]);
                    }
                    if (aCM.a(abb_2.SW) && this.b(string, stringArray)) {
                        ListInvoker.add(this.L, stringArray[0]);
                    }
                }
            }
            if (PacketEventInvoker.c(packetEvent) instanceof C01PacketChatMessage) {
                qh_1.b(this.I);
            }
        }
    }

    private boolean b(String string, String[] stringArray) {
        KillAura.w();
        return StringInvoker.a(string, (CharSequence)this.mc.player.getName()) && !stringArray[0].equals(this.mc.player.getName()) && (StringInvoker.a(string, (CharSequence)zr_2.d) || StringInvoker.a(string, (CharSequence)zr_2.g));
    }

    private int d() {
        KillAura.w();
        String string = aBO.a(PlayerInvoker.Z(this.mc.player));
        return StringInvoker.a(string, (CharSequence)zr_2.b) || StringInvoker.a(string, (CharSequence)zr_2.h) ? 1050 : 3050;
    }

    public a0T(@NonNull ModuleManager moduleManager, byte by, EnumModuleType enumModuleType, String string, long l4) {
        long l5 = ((long)by << 56 | l4 << 8 >>> 8) ^ N;
        long l6 = l5 ^ 0x550D3B7AAA3AL;
        int n = (int)(l6 >>> 56);
        long l7 = l6 << 8 >>> 8;
        super((byte)n, moduleManager, l7, enumModuleType, string);
        this.M = StringPropertyInvoker.b(asp_2.a((String)((Object)a0T.b("k", (int)14598, (long)(0x1852296BF4E1405AL ^ l5)))), new String[]{a0T.b("k", (int)31638, (long)(0x768924775DC082CCL ^ l5)), a0T.b("k", (int)9861, (long)(0x426126898195FD4L ^ l5))});
        this.J = da_0.a(aL0.a(aL0.a(new StringBuilder(), NovolineInvoker.t(this.novoline)), (String)((Object)a0T.b("k", (int)12980, (long)(0x60CE6AA0B6A4BE9L ^ l5)))).toString(), new String[0]);
        this.L = new ArrayList<String>();
        this.I = new TimerUtil();
        this.K = 0;
        this.H = my_0.a(new String[]{a0T.b("k", (int)25189, (long)(0x7C0458D9E9CF9B37L ^ l5)), a0T.b("k", (int)32298, (long)(0x1464344A6B4C0775L ^ l5)), a0T.b("k", (int)26991, (long)(0x329B78995C41037L ^ l5)), a0T.b("k", (int)31555, (long)(0x5E2CF7C2CBE821DL ^ l5)), a0T.b("k", (int)3886, (long)(0x685FDA36217E7675L ^ l5)), a0T.b("k", (int)31019, (long)(0x3B5997F1E663807BL ^ l5)), a0T.b("k", (int)5629, (long)(0x3FC4097B1A5CECA9L ^ l5)), a0T.b("k", (int)12475, (long)(0xF3FC56B172849E8L ^ l5)), a0T.b("k", (int)26047, (long)(0x6896A7B46D869CE6L ^ l5))});
        ManagerInvoker.put(new Setting((String)((Object)a0T.b("k", (int)9016, (long)(0x1A6116DFCB3BDA6DL ^ l5))), (String)((Object)a0T.b("k", (int)5781, (long)(0x1F0A854DE4D66FC3L ^ l5))), SettingType.COMBOBOX, (AbstractModule)this, this.M));
        this.b();
    }

    @EventTarget
    public void a(LoadWorldEvent loadWorldEvent) {
        ListInvoker.clear(this.L);
        this.K = 0;
    }

    static {
        long l4 = N ^ 0x3097CE46F8F6L;
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
            return MethodHandles.lookup().findStatic(a0T.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

