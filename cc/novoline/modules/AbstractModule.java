/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.Cache
 *  com.google.common.reflect.TypeToken
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package cc.novoline.modules;

import cc.novoline.Initializer;
import cc.novoline.Novoline;
import cc.novoline.events.events.ModuleUpdateEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.EventManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.NotificationManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.utils.Timer;
import com.google.common.cache.Cache;
import com.google.common.reflect.TypeToken;
import cc.novoline.modules.visual.HUD;
import deobf.IChatComponent;
import deobf.ModuleRegistry;
import deobf.Packet;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import deobf.TypeSerializerCollection;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.Minecraft;
import net.Ba;
import net.BooleanProperty;
import net.ChatComponentText;
import net.Config;
import net.DelsyConfig;
import net.EQ;
import net.GE;
import net.GW;
import net.ModuleManager;
import net.NotificationType;
import net.P8;
import net.StringProperty;
import net._j_0;
import net.a0_0;
import net.a1c;
import net.a4a_0;
import net.a7n_0;
import net.a7r_0;
import net.aGf;
import net.aL0;
import net.aLY;
import net.aM4;
import net.aMF;
import net.aVH;
import net.aa2_0;
import net.aar_1;
import net.abl_1;
import net.ae6_0;
import net.ah__0;
import net.ake_0;
import net.ao5_0;
import net.aoc_1;
import net.aod_2;
import net.ara_2;
import net.asp_2;
import net.asq_0;
import net.ast_0;
import net.atz_0;
import net.auk_2;
import net.ax4_0;
import net.axa_0;
import net.azo_1;
import net.cw_2;
import net.kp_1;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import net.skidunion.Protection;

@DelsyConfig
public class AbstractModule {
    protected ModuleManager moduleManager;
    private static String[] fb;
    public Color u;
    protected Config m;
    private static String[] gb;
    protected Minecraft mc;
    protected Runnable k;
    public Color A;
    public double q;
    public Runnable e;
    protected String o;
    protected String j;
    public Runnable s;
    public Runnable D;
    protected EQ G;
    private Cache<Class<? extends AbstractModule>, AbstractModule> y;
    private ax4_0 v;
    protected Runnable i;
    @Property(value="enabled")
    protected BooleanProperty n;
    protected Initializer c;
    protected int a;
    public double w;
    protected String name;
    protected Logger x;
    private static Map hb;
    protected Novoline novoline;
    protected EnumModuleType l;
    private static int p;
    public Timer F;
    private static long db;
    @Property(value="hidden")
    protected BooleanProperty h;
    protected String g;
    private Timer z;
    public Runnable B;
    private Timer C;
    @Property(value="display-name")
    protected StringProperty f;
    private double E;

    public void B() {
        EventManagerInvoker.b(this);
        this.w();
        _j_0.c(this.v);
        abl_1.b(this.C);
        abl_1.b(this.F);
    }

    public Config l() {
        return this.m;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a00" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    public void o() {
    }

    public boolean x() {
        return auk_2.a((Boolean)Ba.b(this.n));
    }

    public void a(Runnable runnable) {
        _j_0.a(this.v, this.w, this.q, 0.025, runnable, 200L, 100L);
    }

    public void a(ae6_0 ae6_02) {
        aoc_1.a(this.G, ae6_02);
    }

    public void a(boolean bl) {
        Ba.a(this.h, auk_2.b(bl));
        HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        cw_2.z(hUD);
    }

    @NotNull
    public String t() {
        return this.name;
    }

    public Timer y() {
        return this.C;
    }

    public Timer h() {
        return this.z;
    }

    protected AbstractModule(@NotNull ModuleManager moduleManager, @NotNull String string, @NotNull long l4, @NotNull String string2, @NotNull int n, @Nullable int n2, @NotNull EnumModuleType enumModuleType, @Nullable String string3) {
        long l5 = (l4 << 32 | (long)n2 << 32 >>> 32) ^ db;
        long l6 = l5 ^ 0x10E07BC9D713L;
        int n3 = (int)(l6 >>> 48);
        int n4 = (int)(l6 << 16 >>> 48);
        int n5 = (int)(l6 << 32 >>> 32);
        this(moduleManager, (short)n3, string, string2, n, enumModuleType, string3, (char)n4, null, n5);
    }

    protected AbstractModule(@NotNull char c, @NotNull int n, @NotNull ModuleManager moduleManager, char c2, @NotNull String string, @NotNull EnumModuleType enumModuleType) {
        long l4 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)c2 << 48 >>> 48) ^ db;
        long l5 = l4 ^ 0x1FCA0A291C9BL;
        int n2 = (int)(l5 >>> 48);
        int n3 = (int)(l5 << 16 >>> 48);
        int n4 = (int)(l5 << 32 >>> 32);
        this(moduleManager, (short)n2, string, string, 0, enumModuleType, null, (char)n3, null, n4);
    }

    protected void a(@Nullable ao5_0 ao5_02, boolean bl) {
        IChatComponent iChatComponent;
        AbstractModule.c();
        if (ao5_02 != null) {
            iChatComponent = aar_1.a(ao5_02, a0_0.i);
            iChatComponent = ao5_02;
        }
        iChatComponent = a0_0.h;
        PlayerInvoker.b(this.mc.player, iChatComponent);
    }

    protected AbstractModule(@NotNull long l4, @NotNull ModuleManager moduleManager, @NotNull String string, @NotNull @Nullable EnumModuleType enumModuleType, @Nullable String string2) {
        long l5 = (l4 = db ^ l4) ^ 0x56E7ABAC94CFL;
        int n = (int)(l5 >>> 48);
        int n2 = (int)(l5 << 16 >>> 48);
        int n3 = (int)(l5 << 32 >>> 32);
        this(moduleManager, (short)n, string, string, 0, enumModuleType, string2, (char)n2, null, n3);
    }

    protected void a(Object ... objectArray) {
        if (atz_0.a(this.c)) {
            String string = a7r_0.b(objectArray);
            String string2 = axa_0.c;
            kp_1.a(GW.f(this.mc.ingameGUI), new ChatComponentText(aL0.a(aL0.a(new StringBuilder(), string2), string).toString()));
        }
    }

    public void c(@NotNull String string) {
        this.g = string;
    }

    protected void a(String string, String string2, NotificationType notificationType) {
        this.a(string, string2, 2000, notificationType);
    }

    protected AbstractModule(@NotNull short s, @NotNull ModuleManager moduleManager, @NotNull String string, @Nullable EnumModuleType enumModuleType, @Nullable short s3, int n, String string2, String string3) {
        long l4 = ((long)s << 48 | (long)s3 << 48 >>> 16 | (long)n << 32 >>> 32) ^ db;
        long l5 = l4 ^ 0x471EB1ED17FAL;
        int n2 = (int)(l5 >>> 48);
        int n3 = (int)(l5 << 16 >>> 48);
        int n4 = (int)(l5 << 32 >>> 32);
        this(moduleManager, (short)n2, string, string, 0, enumModuleType, string2, (char)n3, string3, n4);
    }

    protected void b(@NotNull Packet<?> packet) {
        AbstractModule.v();
        if (this.mc.player != null) {
            this.mc.player.connection.a(packet);
        }
    }

    protected void checkModule(Class<? extends AbstractModule> ... classArray) {
        Class<? extends AbstractModule>[] classArray2 = classArray;
        AbstractModule.v();
        int n = classArray2.length;
        int n2 = 0;
        if (n2 < n) {
            Class<? extends AbstractModule> clazz = classArray2[n2];
            AbstractModule abstractModule = this.b(clazz);
            if (abstractModule.x()) {
                abstractModule.d();
                this.a(this.r(), aL0.a(aL0.a(new StringBuilder(), abstractModule.name), axa_0.j).toString(), 1000, NotificationType.WARNING);
            }
            ++n2;
        }
    }

    public boolean d() {
        AbstractModule.v();
        if (auk_2.a((Boolean)Ba.b(this.n))) {
            this.b(false);
            EventManagerInvoker.call(new ModuleUpdateEvent());
            return false;
        }
        this.b(true);
        EventManagerInvoker.call(new ModuleUpdateEvent());
        return true;
    }

    @NotNull
    public String u() {
        AbstractModule.c();
        return this.o == null ? axa_0.d : this.o;
    }

    public void a() {
        EventManagerInvoker.a(this);
        this.o();
        _j_0.a(this.v, 0.05);
        abl_1.b(this.C);
        abl_1.b(this.F);
        this.E = 0.0;
    }

    public boolean m() {
        AbstractModule.v();
        return P8.a(Protection.q) < 3;
    }

    private static boolean lambda$isEnabled$2(ModuleRegistry moduleRegistry) {
        return ModuleInvoker.isEnable(moduleRegistry).x();
    }

    static {
        db = a1c.a(-7562565290264013171L, 9074381591632221460L, MethodHandles.lookup().lookupClass()).a(128043755280660L);
        hb = new HashMap(13);
        AbstractModule.b(0);
        long l4 = db ^ 0x6E69B7BA5519L;
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

    protected boolean a(ModuleRegistry ... moduleRegistryArray) {
        return aMF.c(a7r_0.e((Object[])moduleRegistryArray), AbstractModule::lambda$isEnabled$2);
    }

    @NotNull
    public EnumModuleType s() {
        return this.l;
    }

    public void a(double d) {
        this.E = d;
    }

    public boolean k() {
        return auk_2.a((Boolean)Ba.b(this.h));
    }

    protected AbstractModule(@NotNull int n, @NotNull char c, @NotNull ModuleManager moduleManager, @NotNull char c2, @NotNull @Nullable String string, @NotNull @Nullable String string2, @NotNull EnumModuleType enumModuleType, @Nullable String string3, @Nullable String string4) {
        long l4 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)c2 << 48 >>> 48) ^ db;
        long l5 = l4 ^ 0x2F7DB846E015L;
        int n2 = (int)(l5 >>> 48);
        int n3 = (int)(l5 << 16 >>> 48);
        int n4 = (int)(l5 << 32 >>> 32);
        this(moduleManager, (short)n2, string, string2, 0, enumModuleType, string3, (char)n3, string4, n4);
    }

    protected AbstractModule(@NotNull ModuleManager moduleManager, @NotNull char c, @NotNull String string, @NotNull String string2, @NotNull int n, char c2, int n2, @NotNull EnumModuleType enumModuleType) {
        long l4 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)c2 << 48 >>> 48) ^ db;
        long l5 = l4 ^ 0x240F818F4C6BL;
        int n3 = (int)(l5 >>> 48);
        int n4 = (int)(l5 << 16 >>> 48);
        int n5 = (int)(l5 << 32 >>> 32);
        this(moduleManager, (short)n3, string, string2, n2, enumModuleType, null, (char)n4, null, n5);
    }

    protected void a(@Nullable ao5_0 ao5_02) {
        this.a(ao5_02, false);
    }

    private static aGf a(aGf aGf2) {
        return aGf2;
    }

    protected void a(@NotNull Packet<?> packet) {
        AbstractModule.v();
        if (this.mc.player != null) {
            this.mc.player.connection.b(packet);
        }
    }

    private AbstractModule lambda$getModule$1(Class clazz) throws Exception {
        return this.moduleManager.a(clazz);
    }

    @NotNull
    public String A() {
        return this.g;
    }

    public void b(boolean bl) {
        AbstractModule.c();
        if (auk_2.a((Boolean)Ba.b(this.n)) != bl) {
            Ba.a(this.n, auk_2.b(bl));
            if (bl) {
                this.a();
            }
            this.B();
        }
    }

    public AbstractModule(@NotNull byte by, @NotNull ModuleManager moduleManager, @NotNull long l4, @NotNull EnumModuleType enumModuleType, @NotNull String string) {
        long l5 = ((long)by << 56 | l4 << 8 >>> 8) ^ db;
        long l6 = l5 ^ 0x34A3E8522E6L;
        int n = (int)(l6 >>> 48);
        int n2 = (int)(l6 << 16 >>> 48);
        int n3 = (int)(l6 << 32 >>> 32);
        this(moduleManager, (short)n, string, string, 0, enumModuleType, null, (char)n2, null, n3);
    }

    protected void a(@NotNull TypeSerializerCollection typeSerializerCollection) {
    }

    public void b(String string) {
        StringPropertyInvoker.b(this.f, string);
    }

    @NotNull
    public Logger j() {
        return this.x;
    }

    public static void b(int n) {
        p = n;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = AbstractModule.a(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    public EQ n() {
        return this.G;
    }

    /*
     * Exception decompiling
     */
    protected void a(String var1_1) {
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

    private static boolean lambda$new$0(TypeToken typeToken) {
        boolean bl;
        AbstractModule.c();
        Class clazz = ake_0.b(typeToken);
        do {
            if (bl = ara_2.c(clazz, DelsyConfig.class)) continue;
            clazz = ara_2.a(clazz);
        } while (!bl && clazz != null && ara_2.a(clazz) != null);
        return bl;
    }

    protected AbstractModule(@NotNull int n, @NotNull int n2, @NotNull int n3, @NotNull ModuleManager moduleManager, @NotNull @Nullable String string, @NotNull String string2, @NotNull EnumModuleType enumModuleType, @Nullable String string3) {
        long l4 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ db;
        long l5 = l4 ^ 0x74BD73CCEC51L;
        int n4 = (int)(l5 >>> 48);
        int n5 = (int)(l5 << 16 >>> 48);
        int n6 = (int)(l5 << 32 >>> 32);
        this(moduleManager, (short)n4, string, string2, 0, enumModuleType, string3, (char)n5, null, n6);
    }

    @NotNull
    public <Module extends AbstractModule> Module b(Class<? extends Module> clazz) {
        try {
            return (Module)((AbstractModule)aLY.a(this.y, clazz, () -> this.lambda$getModule$1(clazz)));
        }
        catch (ExecutionException executionException) {
            throw new RuntimeException(executionException);
        }
    }

    private static String a(byte[] byArray) {
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

    public static int v() {
        AbstractModule.c();
        return 55;
    }

    protected void a(String string, String string2, int n, NotificationType notificationType) {
        NotificationManagerInvoker.a(NovolineInvoker.getNotificationManager(this.novoline), string, string2, n, notificationType);
    }

    private static String a(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x6658;
        if (gb[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])hb.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                hb.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a00", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return gb[n2];
    }

    protected void d(@NotNull String string) {
        this.a(azo_1.a(string));
    }

    @NotNull
    public Novoline q() {
        return this.novoline;
    }

    protected AbstractModule(@NotNull ModuleManager moduleManager, @NotNull short s, @NotNull String string, String string2, @NotNull int n, @Nullable EnumModuleType enumModuleType, @Nullable String string3, char c, String string4, int n2) {
        long l4 = ((long)s << 48 | (long)c << 48 >>> 16 | (long)n2 << 32 >>> 32) ^ db;
        this.c = atz_0.a();
        this.k = this.c.d;
        this.i = this.c.a;
        this.x = LogManager.getLogger();
        this.F = new Timer();
        this.n = asp_2.c();
        this.h = asp_2.c();
        this.f = asp_2.a("");
        this.G = asp_2.a(ast_0.a(0));
        this.z = new Timer();
        AbstractModule.v();
        this.C = new Timer();
        this.v = new ax4_0();
        this.w = 0.0;
        this.q = 0.0;
        this.E = 0.0;
        this.u = new Color(255, 0, 0);
        this.A = new Color(0, 255, 255);
        this.y = aM4.a(aM4.a(aM4.c(), 1L, TimeUnit.MINUTES));
        this.moduleManager = moduleManager;
        this.novoline = moduleManager.getNovoline();
        this.mc = NovolineInvoker.d(this.novoline);
        this.name = string;
        this.l = enumModuleType;
        this.a = n;
        this.j = string3;
        this.g = string2;
        ManagerInvoker.put(new Setting((String)((Object)AbstractModule.a("j", (int)22388, (long)(0x23306CDB0AE534FDL ^ l4))), (String)((Object)AbstractModule.a("j", (int)23603, (long)(0x1CDE336F5D073FB9L ^ l4))), SettingType.BINDABLE, this, this.G));
        this.m = aa2_0.a(ah__0.a(NovolineInvoker.c(this.novoline), aL0.a(aL0.a(new StringBuilder(), string4), (String)((Object)AbstractModule.a("j", (int)15664, (long)(0x4791688D6815EBBL ^ l4)))).toString()));
        TypeSerializerCollection typeSerializerCollection = aVH.c(a4a_0.c(aa2_0.b(this.m)));
        asq_0.a(typeSerializerCollection, AbstractModule::lambda$new$0, (GE)new a7n_0(moduleManager));
        this.a(typeSerializerCollection);
        try {
            aa2_0.d(this.m);
        }
        catch (aGf aGf2) {
            aGf2.printStackTrace();
        }
    }

    @NotNull
    public String r() {
        String string = (String)StringPropertyInvoker.b(this.f);
        AbstractModule.v();
        HUD cfr_ignored_0 = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        return string == null || StringInvoker.g(string) ? this.g : string;
    }

    public double e() {
        return this.E;
    }

    @Nullable
    public String z() {
        return this.j;
    }

    protected void i() {
        PlayerInvoker.b(this.mc.player, azo_1.a());
    }

    protected AbstractModule(@NotNull ModuleManager moduleManager, @NotNull char c, @NotNull EnumModuleType enumModuleType, @NotNull String string, char c2, int n, @NotNull String string2) {
        long l4 = ((long)c << 48 | (long)c2 << 48 >>> 16 | (long)n << 32 >>> 32) ^ db;
        long l5 = l4 ^ 0x50F48ED95582L;
        int n2 = (int)(l5 >>> 48);
        int n3 = (int)(l5 << 16 >>> 48);
        int n4 = (int)(l5 << 32 >>> 32);
        this(moduleManager, (short)n2, string, string2, 0, enumModuleType, null, (char)n3, null, n4);
    }

    protected void a(String string, int n, NotificationType notificationType) {
        this.a(aod_2.d(StringInvoker.i(notificationType.name())), string, 2000, notificationType);
    }

    public void w() {
    }

    public int g() {
        return this.a;
    }

    public float f() {
        switch (this.l) {
            case COMBAT: {
                return 0.9f;
            }
            case MOVEMENT: {
                return 0.55f;
            }
            case VISUALS: {
                return 0.45f;
            }
            case PLAYER: {
                return 0.1f;
            }
        }
        return 0.0f;
    }

    protected void a(@NotNull String string, boolean bl) {
        this.a(azo_1.a(string), bl);
    }

    protected <M extends AbstractModule> void a(@NotNull Class<? extends M> clazz) {
        AbstractModule.c();
        M m3 = this.b(clazz);
        if (((AbstractModule)m3).x()) {
            this.a(aL0.a(aL0.a(new StringBuilder(), ((AbstractModule)m3).t()), axa_0.l).toString(), 1000, NotificationType.WARNING);
            ((AbstractModule)m3).d();
        }
    }

    @NotNull
    public String b() {
        AbstractModule.v();
        String string = aL0.a(aL0.a(new StringBuilder(), this.r()), this.u()).toString();
        HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        String string2 = StringInvoker.i((String)StringPropertyInvoker.b(cw_2.c(hUD)));
        int n = -1;
        switch (string2.hashCode()) {
            case 93508654: {
                if (!string2.equals(axa_0.g)) break;
                n = 0;
                ListInvoker.b(new ListInvoker[2]);
            }
            case 103164673: {
                if (!string2.equals(axa_0.o)) break;
                n = 1;
            }
            case 111499426: {
                if (!string2.equals(axa_0.p)) break;
                n = 2;
            }
        }
        return string;
    }

    public static int c() {
        return p;
    }

    public ax4_0 p() {
        return this.v;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AbstractModule.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

