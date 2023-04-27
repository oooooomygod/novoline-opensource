/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.misc;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.SpawnCheckEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.modules.AbstractModule;
import deobf.EntityPlayer;
import cc.novoline.modules.EnumModuleType;
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

import org.checkerframework.checker.nullness.qual.NonNull;

public class Optimization
extends AbstractModule {
    @Property(value="no-render-item")
    private static BooleanProperty N;
    private static boolean H;
    private static String[] Q;
    @Property(value="remove-armor-stands")
    private BooleanProperty L;
    @Property(value="fast-block-lightning")
    private static BooleanProperty O;
    @Property(value="fast-entity-lightning")
    private static BooleanProperty K;
    @Property(value="remove-bots")
    private BooleanProperty M;
    @Property(value="static-particle-color")
    private static BooleanProperty I;
    private static String[] R;
    private static long P;
    private static Map S;
    @Property(value="remove-entity-frames")
    private BooleanProperty J;

    public Optimization(@NonNull ModuleManager moduleManager, int n, int n2, EnumModuleType enumModuleType, String string) {
        long l4 = ((long)n << 32 | (long)n2 << 32 >>> 32) ^ P;
        long l5 = l4 ^ 0x2F386FDEFCAAL;
        int n3 = (int)(l5 >>> 56);
        long l6 = l5 << 8 >>> 8;
        super((byte)n3, moduleManager, l6, enumModuleType, string);
        this.L = asp_2.c();
        this.J = asp_2.c();
        this.M = asp_2.c();
        ManagerInvoker.put(new Setting((String)((Object)Optimization.b("v", (int)5600, (long)(0x63471ACFBEA1BED1L ^ l4))), (String)((Object)Optimization.b("v", (int)26122, (long)(0x10FBA78FF3E3CD3CL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.L));
        ManagerInvoker.put(new Setting((String)((Object)Optimization.b("v", (int)13835, (long)(0x37AE464E463E1D35L ^ l4))), (String)((Object)Optimization.b("v", (int)19668, (long)(0x27EB095D08E7E7E0L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.J));
        ManagerInvoker.put(new Setting((String)((Object)Optimization.b("v", (int)26367, (long)(0x30D2CE48570C4DC8L ^ l4))), (String)((Object)Optimization.b("v", (int)27027, (long)(0x1A686FB72080C2A1L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.M));
        ManagerInvoker.put(new Setting((String)((Object)Optimization.b("v", (int)19101, (long)(0x54A9488D333561A2L ^ l4))), (String)((Object)Optimization.b("v", (int)29368, (long)(0x22414F6E9CE9598DL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, N));
        ManagerInvoker.put(new Setting((String)((Object)Optimization.b("v", (int)18459, (long)(0x289C4A894E6CE328L ^ l4))), (String)((Object)Optimization.b("v", (int)30453, (long)(0x1B8E1C857C8ADDC5L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, I));
        ManagerInvoker.put(new Setting((String)((Object)Optimization.b("v", (int)4489, (long)(0x564FB928F11ABAB2L ^ l4))), (String)((Object)Optimization.b("v", (int)21908, (long)(0x203DE9E43934FEAEL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, K));
        ManagerInvoker.put(new Setting((String)((Object)Optimization.b("v", (int)20940, (long)(0x2ACFC16E85CC7AF4L ^ l4))), (String)((Object)Optimization.b("v", (int)22605, (long)(0x5CBDB8EE92647374L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, O));
    }

    public static boolean a() {
        UhcCrafts.d();
        return H && auk_2.a((Boolean)Ba.b(K));
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x70AC;
        if (R[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])S.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                S.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_L", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return R[n2];
    }

    static {
        P = a1c.a(-7862624258709825195L, -2970628902992512469L, MethodHandles.lookup().lookupClass()).a(240632987138844L);
        S = new HashMap(13);
        long l4 = P ^ 0x5A1EB686D454L;
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
    public void a(SpawnCheckEvent spawnCheckEvent) {
        UhcCrafts.d();
        if (auk_2.a((Boolean)Ba.b(this.M)) && nr_0.a(spawnCheckEvent) instanceof EntityPlayer && StringInvoker.e(nr_0.a(spawnCheckEvent).getName(), anl_1.a)) {
            BlockInvoker.b(this.mc.world, nr_0.a(spawnCheckEvent));
        }
        if (auk_2.a((Boolean)Ba.b(this.J)) && nr_0.a(spawnCheckEvent) instanceof no_2 || auk_2.a((Boolean)Ba.b(this.L)) && nr_0.a(spawnCheckEvent) instanceof ol_2) {
            BlockInvoker.b(this.mc.world, nr_0.a(spawnCheckEvent));
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_L" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    public static boolean c() {
        UhcCrafts.d();
        return H && auk_2.a((Boolean)Ba.b(N));
    }

    @Override
    public void w() {
        H = false;
    }

    public static boolean b() {
        UhcCrafts.d();
        return H && auk_2.a((Boolean)Ba.b(O));
    }

    @Override
    public void o() {
        H = true;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = Optimization.b(n, l4);
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

    public static boolean e() {
        UhcCrafts.d();
        return H && auk_2.a((Boolean)Ba.b(I));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Optimization.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

