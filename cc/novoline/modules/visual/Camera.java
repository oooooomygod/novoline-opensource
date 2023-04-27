/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.visual;

import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.MouseInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import deobf.IntProperty;
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
import net.ModuleManager;
import net.P8;
import net.StringProperty;
import net.a1c;
import net.aQ6;
import net.adt_2;
import net.asp_2;
import net.auk_2;
import org.checkerframework.checker.nullness.qual.NonNull;

public class Camera
extends AbstractModule {
    @Property(value="rotate-camera")
    private BooleanProperty M;
    private static Map S;
    @Property(value="no-hurt-cam")
    BooleanProperty J;
    private static String[] Q;
    @Property(value="amount")
    private IntProperty I;
    private boolean L;
    @Property(value="view-clip")
    BooleanProperty N;
    @Property(value="smooth-zoom")
    private BooleanProperty H;
    @Property(value="mc-lock")
    BooleanProperty K;
    private static String[] R;
    @Property(value="camera-button")
    private StringProperty O;
    private static long P;

    public boolean g() {
        HUD.j();
        return this.x() && auk_2.a((Boolean)Ba.b(this.H));
    }

    public boolean a() {
        HUD.j();
        return this.x() && auk_2.a((Boolean)Ba.b(this.K)) && MouseInvoker.c(this.e());
    }

    public BooleanProperty d() {
        return this.N;
    }

    public BooleanProperty b() {
        return this.J;
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

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = Camera.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    public Camera(@NonNull ModuleManager moduleManager, int n, EnumModuleType enumModuleType, String string, int n2, char c) {
        long l4 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)c << 48 >>> 48) ^ P;
        long l5 = l4 ^ 0x2460340EF70EL;
        int n3 = (int)(l5 >>> 56);
        long l6 = l5 << 8 >>> 8;
        super((byte)n3, moduleManager, l6, enumModuleType, string);
        this.K = asp_2.a(auk_2.b(true));
        this.N = asp_2.a(auk_2.b(true));
        this.J = asp_2.a(auk_2.b(true));
        this.I = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(1)), P8.d(1)), P8.d(10));
        this.H = asp_2.c();
        this.O = StringPropertyInvoker.b(asp_2.a((String)((Object)Camera.b("z", (int)27916, (long)(0x6CEC36F8682C305FL ^ l4)))), new String[]{Camera.b("z", (int)9018, (long)(0x3ADAC5C0F5E47E6DL ^ l4)), Camera.b("z", (int)24721, (long)(0x25508B965DCDBDC3L ^ l4)), Camera.b("z", (int)361, (long)(0x6AC60975731FDC37L ^ l4)), Camera.b("z", (int)10531, (long)(0x3E584402EC76747FL ^ l4))});
        this.M = asp_2.c();
        ManagerInvoker.put(new Setting((String)((Object)Camera.b("z", (int)23905, (long)(0x6D4C3A49D8B8003BL ^ l4))), (String)((Object)Camera.b("z", (int)16838, (long)(0x55E9EE2A8A409C96L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.H));
        ManagerInvoker.put(new Setting((String)((Object)Camera.b("z", (int)15837, (long)(0x5202A618F887E088L ^ l4))), (String)((Object)Camera.b("z", (int)18370, (long)(0x59601451057E1A84L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.N));
        ManagerInvoker.put(new Setting((String)((Object)Camera.b("z", (int)11004, (long)(0x241056F2191077AAL ^ l4))), (String)((Object)Camera.b("z", (int)18351, (long)(0x3E4947E4D3911AFBL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.J));
        ManagerInvoker.put(new Setting((String)((Object)Camera.b("z", (int)292, (long)(0x44886C965562DC79L ^ l4))), (String)((Object)Camera.b("z", (int)2068, (long)(0x39FFD082901ED54CL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.K));
        ManagerInvoker.put(new Setting((String)((Object)Camera.b("z", (int)6817, (long)(0x3D57E50EF4C847F0L ^ l4))), (String)((Object)Camera.b("z", (int)29407, (long)(0x4789B999038B2F86L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.O, this.K::get));
        ManagerInvoker.put(new Setting((String)((Object)Camera.b("z", (int)26450, (long)(0x7622E9884C6BA0DL ^ l4))), (String)((Object)Camera.b("z", (int)19584, (long)(0x265D8D2C41C091DBL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.M, this.K::get));
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0xD6D;
        if (R[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])S.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                S.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_Y", exception);
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

    private int e() {
        HUD.j();
        if (StringPropertyInvoker.isMode(this.O, aQ6.b)) {
            return 4;
        }
        if (StringPropertyInvoker.isMode(this.O, aQ6.c)) {
            return 3;
        }
        if (StringPropertyInvoker.isMode(this.O, aQ6.a)) {
            return 1;
        }
        return 2;
    }

    public BooleanProperty f() {
        return this.H;
    }

    public BooleanProperty c() {
        return this.M;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_Y" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    static {
        P = a1c.a(-4798791559913664239L, 4901286411110475994L, MethodHandles.lookup().lookupClass()).a(200441924239931L);
        S = new HashMap(13);
        long l4 = P ^ 0x769AE9102232L;
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
            return MethodHandles.lookup().findStatic(Camera.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

