/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.Render2DEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import deobf.Entity;
import deobf.EntityPlayer;
import cc.novoline.modules.EnumModuleType;
import deobf.EnumPlayerType;
import cc.novoline.modules.visual.HUD;
import deobf.IChatComponent;
import deobf.IntProperty;
import net.minecraft.item.ItemStack;
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

import org.checkerframework.checker.nullness.qual.NonNull;

public class Arrows
extends AbstractModule {
    @Property(value="radius")
    private IntProperty U;
    @Property(value="color-type")
    private StringProperty R;
    private boolean P;
    private int M;
    private static Map bb;
    private static String[] ab;
    @Property(value="alpha")
    private IntProperty K;
    private static long Y;
    @Property(value="rainbow-type")
    private StringProperty J;
    private static double O;
    @Property(value="targets")
    private ListProperty<String> L;
    private static int I = 90;
    private static String[] Z;
    @Property(value="only_invisible")
    private BooleanProperty W;
    private static float V = 360.0f;
    @Property(value="alpha-type")
    private StringProperty X;
    @Property(value="filters")
    private ListProperty<String> S;
    @Property(value="targets-only")
    private BooleanProperty T;
    private static double N;
    private static float Q = 255.0f;
    @Property(value="color")
    private eu_0 H;

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x5B69;
        if (ab[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])bb.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                bb.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_0", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return ab[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = Arrows.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    public boolean a(Entity entity) {
        HUD.t();
        if (ayj_0.a(entity) && PlayerInvoker.aa(this.mc.player) > 0.0f && !a8F.a(NovolineInvoker.A(this.novoline), entity.getName(), EnumPlayerType.FRIEND)) {
            if (entity instanceof ne_2 || entity instanceof ny_1 || entity instanceof np_1) {
                return ava_0.b(this.L, GX.b) && (!ayj_0.L(entity) || ava_0.b(this.L, GX.j));
            }
            if (entity instanceof n5_0 || entity instanceof nz_0) {
                return ava_0.b(this.L, GX.p) && (!ayj_0.L(entity) || ava_0.b(this.L, GX.h));
            }
            if (entity instanceof EntityPlayer) {
                return !(!ava_0.b(this.L, GX.o) || entity == this.mc.player || ava_0.b(this.S, GX.f) && pl_1.b(entity) || ayj_0.L(entity) && !ava_0.b(this.L, GX.a) || this.a((ICommandSender)entity));
            }
        }
        return false;
    }

    public Arrows(@NonNull int n, ModuleManager moduleManager, char c, EnumModuleType enumModuleType, short s, String string) {
        long l4 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)s << 48 >>> 48) ^ Y;
        long l5 = l4 ^ 0x1BCCDC09E680L;
        int n2 = (int)(l5 >>> 56);
        long l6 = l5 << 8 >>> 8;
        super((byte)n2, moduleManager, l6, enumModuleType, string);
        this.W = asp_2.d();
        this.U = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(150)), P8.d(55)), P8.d(165));
        this.H = asp_2.b(P8.d(-16776961));
        this.L = ava_0.a(asp_2.a(Arrows.b("m", (int)21243, (long)(0x26F5CBE5521C4837L ^ l4))), new String[]{Arrows.b("m", (int)22639, (long)(0x13CFB0FA41CF42BFL ^ l4)), Arrows.b("m", (int)28644, (long)(0x6088357BE7517525L ^ l4)), Arrows.b("m", (int)18375, (long)(0x79E1198022585D11L ^ l4))});
        this.S = ava_0.a(asp_2.a(Arrows.b("m", (int)32585, (long)(0x471CFE5E6E86E5B4L ^ l4))), new String[]{Arrows.b("m", (int)7275, (long)(0x778A1D74D62586BAL ^ l4))});
        this.T = asp_2.c();
        this.R = StringPropertyInvoker.b(asp_2.a((String)((Object)Arrows.b("m", (int)30970, (long)(0x582B01E9B734E22FL ^ l4)))), new String[]{Arrows.b("m", (int)2981, (long)(0x174A0DFF4DC5917BL ^ l4)), Arrows.b("m", (int)10449, (long)(0x3CBEF189B91EB209L ^ l4)), Arrows.b("m", (int)14475, (long)(0x7D0DD3F4BFC5A277L ^ l4))});
        this.J = StringPropertyInvoker.b(asp_2.a((String)((Object)Arrows.b("m", (int)2981, (long)(0x174A0DFF4DC5917BL ^ l4)))), new String[]{Arrows.b("m", (int)2981, (long)(0x174A0DFF4DC5917BL ^ l4)), Arrows.b("m", (int)20277, (long)(0x3DA270BB81C7D5F1L ^ l4))});
        this.X = StringPropertyInvoker.b(asp_2.a((String)((Object)Arrows.b("m", (int)22333, (long)(0x6BE0EAAA5248CDF8L ^ l4)))), new String[]{Arrows.b("m", (int)25552, (long)(0x1EEC1ADB3B2F91BL ^ l4)), Arrows.b("m", (int)19216, (long)(0x7143CD82641F51D7L ^ l4)), Arrows.b("m", (int)2981, (long)(0x174A0DFF4DC5917BL ^ l4))});
        this.K = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(255)), P8.d(0)), P8.d(255));
        this.M = 1;
        ManagerInvoker.put(new Setting((String)((Object)Arrows.b("m", (int)16089, (long)(0x679F10BDBCE1A40EL ^ l4))), (String)((Object)Arrows.b("m", (int)16995, (long)(0xE42CAE95EBB58B7L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.W));
        ManagerInvoker.put(new Setting((String)((Object)Arrows.b("m", (int)4592, (long)(0x5C99612CA22A0B33L ^ l4))), (String)((Object)Arrows.b("m", (int)890, (long)(0x4AA0D084555F99B0L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.T));
        ManagerInvoker.put(new Setting((String)((Object)Arrows.b("m", (int)10147, (long)(0x51DDB9ABCD4DBD6DL ^ l4))), (String)((Object)Arrows.b("m", (int)20424, (long)(0x605FF50958AA551BL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.U, 5.0));
        ManagerInvoker.put(new Setting((String)((Object)Arrows.b("m", (int)6203, (long)(0x2B3B2B9FB5E502F3L ^ l4))), (String)((Object)Arrows.b("m", (int)31895, (long)(0x1EF1FD5C296E6658L ^ l4))), SettingType.SELECTBOX, (AbstractModule)this, this.L));
        ManagerInvoker.put(new Setting((String)((Object)Arrows.b("m", (int)2521, (long)(0x1CDE1DEBD8421303L ^ l4))), (String)((Object)Arrows.b("m", (int)2653, (long)(0x25EFB8F227D79086L ^ l4))), SettingType.SELECTBOX, (AbstractModule)this, this.S, this::lambda$new$0));
        ManagerInvoker.put(new Setting((String)((Object)Arrows.b("m", (int)8020, (long)(0x253EE2A09CC28586L ^ l4))), (String)((Object)Arrows.b("m", (int)27521, (long)(0x14088697436E714CL ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.R));
        ManagerInvoker.put(new Setting((String)((Object)Arrows.b("m", (int)3451, (long)(0x1AE4409C546897BDL ^ l4))), (String)((Object)Arrows.b("m", (int)4507, (long)(0x41E82F96A938B5BL ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.J, this::lambda$new$1));
        ManagerInvoker.put(new Setting((String)((Object)Arrows.b("m", (int)8986, (long)(0x3676E54345FEB9C3L ^ l4))), (String)((Object)Arrows.b("m", (int)17101, (long)(0x5DD8A16E2290D810L ^ l4))), SettingType.COLOR_PICKER, (AbstractModule)this, this.H, null));
        ManagerInvoker.put(new Setting((String)((Object)Arrows.b("m", (int)24547, (long)(0x5B8E6E7AD35FC521L ^ l4))), (String)((Object)Arrows.b("m", (int)26496, (long)(0x336A87FB5434FD5FL ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.X));
        ManagerInvoker.put(new Setting((String)((Object)Arrows.b("m", (int)14099, (long)(0x4A7BA87A53AADCFL ^ l4))), (String)((Object)Arrows.b("m", (int)18150, (long)(0x74933D0F7DB0DC2FL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.K, 5.0, this::lambda$new$2));
    }

    static {
        Y = a1c.a(7998240849078129742L, -5574187077500010594L, MethodHandles.lookup().lookupClass()).a(254989397315061L);
        bb = new HashMap(13);
        long l4 = Y ^ 0x238D6EC66DBL;
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

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_0" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private Vec3 a(float f, float f2) {
        float f3 = MathHelper.b(MathInvoker.o(-f2) - 3.1415927410125732);
        float f4 = MathHelper.h(MathInvoker.o(-f2) - 3.1415927410125732);
        float f5 = -MathHelper.b(MathInvoker.o(-f));
        float f6 = MathHelper.h(MathInvoker.o(-f));
        return new Vec3(f4 * f5, f6, f3 * f5);
    }

    private static boolean a(EntityPlayer entityPlayer) {
        HUD.j();
        ItemStack[] itemStackArray = entityPlayer.inventory.d;
        return itemStackArray[0] != null || itemStackArray[1] != null || itemStackArray[2] != null || itemStackArray[3] != null;
    }

    private Boolean lambda$new$2() {
        return auk_2.b(StringPropertyInvoker.isMode(this.X, GX.e));
    }

    private Boolean lambda$new$0() {
        return auk_2.b(ava_0.b(this.L, GX.c));
    }

    private boolean a(ICommandSender iCommandSender) {
        HUD.t();
        IChatComponent iChatComponent = alj_1.c(iCommandSender);
        String string = aBO.a(iChatComponent);
        aBO.d(iChatComponent);
        boolean bl = !StringInvoker.a(StringInvoker.b(string, 0, StringInvoker.c(string) - 2), (CharSequence)GX.q);
        StringInvoker.a(StringInvoker.a(string, StringInvoker.c(string) - 2), (CharSequence)GX.r);
        if (!aCM.d() || aCM.a(abb_2.BW)) {
            // empty if block
        }
        return false;
    }

    private static double lambda$onRender$3(float f, Entity entity) {
        return MathInvoker.o(((ae4_0.a(entity.posX, entity.posZ) + 360.0f) % 360.0f - f + 360.0f) % 360.0f - 90.0f);
    }

    private Boolean lambda$new$1() {
        return auk_2.b(StringPropertyInvoker.isMode(this.R, GX.m));
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
     * Exception decompiling
     */
    @EventTarget
    public void a(Render2DEvent var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getString(SwitchStringRewriter.java:404)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.access$600(SwitchStringRewriter.java:53)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:368)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:26)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewriteComplex(SwitchStringRewriter.java:201)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:73)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:881)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Arrows.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

