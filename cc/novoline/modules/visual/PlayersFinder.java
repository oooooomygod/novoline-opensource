/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.visual;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.SpawnCheckEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.*;
import net.*;
import org.checkerframework.checker.nullness.qual.NonNull;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import java.lang.invoke.*;
import java.util.HashMap;
import java.util.Map;

public class PlayersFinder
extends AbstractModule {
    private static String[] J;
    private static long I;
    private static String[] K;
    private static Map L;
    @Property(value="additional_y")
    private IntProperty H;

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = PlayersFinder.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
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
        I = a1c.a(-3526090706041054234L, -8582483449440713290L, MethodHandles.lookup().lookupClass()).a(27836316878714L);
        L = new HashMap(13);
        long l4 = I ^ 0x72F6CA189E63L;
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

    public boolean a(Entity entity) {
        return StringInvoker.a(aBO.a(ayj_0.P(entity)), (CharSequence)a0V.d);
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x5F0B;
        if (K[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])L.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                L.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_2", exception);
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

    public PlayersFinder(@NonNull ModuleManager moduleManager, char c, int n, EnumModuleType enumModuleType, int n2, String string) {
        long l4 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ I;
        long l5 = l4 ^ 0x4EEFBA708E77L;
        int n3 = (int)(l5 >>> 56);
        long l6 = l5 << 8 >>> 8;
        super((byte)n3, moduleManager, l6, enumModuleType, string);
        this.H = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(10)), P8.d(10)), P8.d(90));
        ManagerInvoker.put(new Setting((String)((Object)PlayersFinder.b("x", (int)15907, (long)(0x249E5C39A4F5C86BL ^ l4))), (String)((Object)PlayersFinder.b("x", (int)10226, (long)(0x1F78D007BD6B51BBL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.H, 5.0));
    }

    @EventTarget
    public void a(SpawnCheckEvent spawnCheckEvent) {
        UhcCrafts.d();
        if (nr_0.a(spawnCheckEvent) instanceof EntityPlayer && ayj_0.B(nr_0.a(spawnCheckEvent)) != PlayerInvoker.O(this.mc.player) && !this.a(nr_0.a(spawnCheckEvent))) {
            int n = (int)nr_0.a((SpawnCheckEvent)spawnCheckEvent).posX;
            int n2 = (int)nr_0.a((SpawnCheckEvent)spawnCheckEvent).posY;
            int n3 = (int)nr_0.a((SpawnCheckEvent)spawnCheckEvent).posZ;
            String string = MCInvoker.k(this.mc) ? a0V.f : a0V.g;
            String string2 = StringInvoker.i(nr_0.a(spawnCheckEvent).getName());
            ChatComponentText chatComponentText = new ChatComponentText(a0V.a);
            ChatComponentText chatComponentText2 = new ChatComponentText(a0V.e);
            ChatComponentText chatComponentText3 = new ChatComponentText(string2);
            chatComponentText3 = (ChatComponentText)axq_2.a(chatComponentText3, HX.a(axq_2.b(chatComponentText3), new amn_0(H6.SHOW_TEXT, new ChatComponentText(aL0.a(aL0.a(new StringBuilder(), string), string2).toString()))));
            chatComponentText3 = (ChatComponentText)axq_2.a(chatComponentText3, HX.a(axq_2.b(chatComponentText3), new awv_1(k_0.RUN_COMMAND, aL0.a(aL0.a(new StringBuilder(), string), string2).toString())));
            ChatComponentText chatComponentText4 = new ChatComponentText(a0V.i);
            ChatComponentText chatComponentText5 = new ChatComponentText(aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), a0V.c), n), a0V.b), n2), a0V.j), n3).toString());
            String string3 = aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), string), n), a0V.k), n2), a0V.h), n3).toString();
            chatComponentText5 = (ChatComponentText)axq_2.a(chatComponentText5, HX.a(axq_2.b(chatComponentText5), new amn_0(H6.SHOW_TEXT, new ChatComponentText(string3))));
            chatComponentText5 = (ChatComponentText)axq_2.a(chatComponentText5, HX.a(axq_2.b(chatComponentText5), new awv_1(k_0.RUN_COMMAND, string3)));
            aBO.a(aBO.a(aBO.a(axq_2.a(chatComponentText, chatComponentText2), chatComponentText3), chatComponentText4), chatComponentText5);
            kp_1.a(GW.f(this.mc.ingameGUI), chatComponentText);
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_2" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(PlayersFinder.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

