/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.move;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.SneakEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import net.minecraft.util.MovingObjectPosition;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import deobf.Vec3;
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
import net.UhcCrafts;
import net.a1c;
import net.aNE;
import net.ae4_0;
import net.asp_2;
import net.auk_2;
import net.xo_0;
import org.checkerframework.checker.nullness.qual.NonNull;

public class SafeWalk
extends AbstractModule {
    @Property(value="void-check")
    private BooleanProperty J;
    private static String[] M;
    @Property(value="auto-sneak")
    private BooleanProperty H;
    private static Map N;
    private static String[] L;
    @Property(value="ground-check")
    private BooleanProperty I;
    private static long K;

    public boolean b() {
        UhcCrafts.d();
        return !auk_2.a((Boolean)Ba.b(this.J)) || !PlayerInvoker.T(this.mc.player);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_5" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = SafeWalk.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x486E;
        if (M[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])N.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                N.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_5", exception);
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

    public boolean c() {
        UhcCrafts.d();
        return !auk_2.a((Boolean)Ba.b(this.I)) || this.mc.player.onGround;
    }

    private MovingObjectPosition a() {
        UhcCrafts.d();
        Vec3 vec3 = new Vec3(this.mc.player.posX, this.mc.player.posY + (double)PlayerInvoker.X(this.mc.player), this.mc.player.posZ);
        Vec3 vec32 = ae4_0.a(90.0f, this.mc.player.rotationYaw);
        double d = PlayerInvoker.M(this.mc.player);
        Vec3 vec33 = aNE.a(vec3, vec32.xCoord * d, vec32.yCoord * (double)(auk_2.a((Boolean)Ba.b(this.J)) ? 999 : 2), vec32.zCoord * d);
        return BlockInvoker.a(this.mc.world, vec3, vec33, false, false, false);
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
    public void a(SneakEvent sneakEvent) {
        UhcCrafts.d();
        if (auk_2.a((Boolean)Ba.b(this.H)) && this.c() && this.a() == null) {
            xo_0.a(sneakEvent, true);
        }
    }

    static {
        K = a1c.a(4110918637577820648L, 219356307079215754L, MethodHandles.lookup().lookupClass()).a(275280698071543L);
        N = new HashMap(13);
        long l4 = K ^ 0x334EF4CC8F18L;
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

    public SafeWalk(@NonNull int n, ModuleManager moduleManager, EnumModuleType enumModuleType, short s, String string, String string2, int n2) {
        long l4 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ K;
        long l5 = l4 ^ 0x78BB48DCE8ECL;
        int n3 = (int)(l5 >>> 48);
        int n4 = (int)(l5 << 16 >>> 48);
        int n5 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n3, enumModuleType, string, (char)n4, n5, string2);
        this.H = asp_2.c();
        this.J = asp_2.c();
        this.I = asp_2.c();
        ManagerInvoker.put(new Setting((String)((Object)SafeWalk.b("j", (int)32213, (long)(0x4567D8614C18D06L ^ l4))), (String)((Object)SafeWalk.b("j", (int)30801, (long)(0x591B3EDA673C8880L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.H));
        ManagerInvoker.put(new Setting((String)((Object)SafeWalk.b("j", (int)19110, (long)(0x38D742D1EC73BA71L ^ l4))), (String)((Object)SafeWalk.b("j", (int)9611, (long)(0x7B39647C4491D55BL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.I));
        ManagerInvoker.put(new Setting((String)((Object)SafeWalk.b("j", (int)30827, (long)(0x50DA9D64EF3988B9L ^ l4))), (String)((Object)SafeWalk.b("j", (int)8060, (long)(0xABD561BF05F6FAAL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.J));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(SafeWalk.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

