/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.reflect.TypeToken
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.jetbrains.annotations.NotNull
 */
package cc.novoline.modules.configurations;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.visual.HUD;
import com.google.common.reflect.TypeToken;
import cc.novoline.modules.visual.ClickGui;
import deobf.*;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.invoke.MethodHandles;
import java.nio.file.CopyOption;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import net.ConfigurationOptions;
import net.DelsyConfig;
import net.FG;
import net.GE;
import net.H8;
import net.MD;
import net.ModuleArrayMap;
import net.ModuleManager;
import net.PT;
import net.a09;
import net.a1c;
import net.a4E;
import net.a4a_0;
import net.a68;
import net.a7n_0;
import net.a7r_0;
import net.aB0;
import net.aL0;
import net.aMF;
import net.aOQ;
import net.aS0;
import net.aSf;
import net.aVH;
import net.aam_0;
import net.ad__0;
import net.aen_2;
import net.aev_1;
import net.ah__0;
import net.aio_2;
import net.ajg;
import net.aka_1;
import net.ake_0;
import net.ake_1;
import net.akk_0;
import net.ar7_0;
import net.ara_2;
import net.asg_0;
import net.asl_0;
import net.asq_0;
import net.awx_1;
import net.db_0;
import net.dz_0;
import net.ki_0;
import net.pb_1;
import net.pg_0;
import net.uw_0;
import net.wc_1;
import net.x5_0;
import net.xt_1;
import net.ym_1;
import net.yz_1;
import net.z4_0;
import org.jetbrains.annotations.NotNull;

public class ConfigManager {
    public boolean c;
    private static long g = a1c.a(-7978780782069323316L, 8810260804888415986L, MethodHandles.lookup().lookupClass()).a(170615839794006L);
    private static String d = ".novo";
    private static boolean e;
    private static ConfigurationOptions b;
    private ModuleManager a;
    private int f;

    public boolean c(@NotNull String string) throws IOException, a68 {
        ad__0 ad__02;
        long l4 = g ^ 0x60ADB2E44C8CL;
        long l5 = l4 ^ 0x3F52D7F2F0ECL;
        int n = (int)(l5 >>> 32);
        int n2 = (int)(l5 << 32 >>> 48);
        int n3 = (int)(l5 << 48 >>> 48);
        ConfigManager.c();
        Path path = this.b(string);
        if (aev_1.d(path, new LinkOption[0])) {
            aev_1.c(path, new FileAttribute[0]);
        }
        ConfigurationOptions configurationOptions = this.d(n, (char)n2, (char)n3);
        ake_1 ake_12 = aio_2.c((H8)aio_2.a((H8)aio_2.a(a4a_0.c(), configurationOptions), path));
        try {
            ad__02 = a4a_0.a(ake_12, configurationOptions);
        }
        catch (IOException iOException) {
            throw new yz_1(iOException);
        }
        ar7_0 ar7_02 = xt_1.a(this, string);
        ki_0.a(ad__02, ake_0.a(ar7_0.class), ar7_02);
        a4a_0.a(ake_12, ad__02);
        if (ListInvoker.b() != null) {
            ConfigManager.b(false);
        }
        return true;
    }

    public String d(@NotNull String string) throws IOException, a68 {
        ad__0 ad__02;
        long l4 = g ^ 0xA934C6BC966L;
        long l5 = l4 ^ 0x556C297D7506L;
        int n = (int)(l5 >>> 32);
        int n2 = (int)(l5 << 32 >>> 48);
        int n3 = (int)(l5 << 48 >>> 48);
        ConfigManager.g();
        Path path = this.b(string);
        StringWriter stringWriter = new StringWriter();
        ConfigurationOptions configurationOptions = this.d(n, (char)n2, (char)n3);
        ake_1 ake_12 = aio_2.c((H8)aio_2.a((H8)aio_2.a((H8)aio_2.a(a4a_0.c(), configurationOptions), path), () -> ConfigManager.lambda$saveToString$0(stringWriter)));
        try {
            ad__02 = a4a_0.a(ake_12, configurationOptions);
        }
        catch (IOException iOException) {
            throw new yz_1(iOException);
        }
        ar7_0 ar7_02 = xt_1.a(this, string);
        ki_0.a(ad__02, ake_0.a(ar7_0.class), ar7_02);
        a4a_0.a(ake_12, ad__02);
        String string2 = stringWriter.toString();
        ListInvoker.b(new ListInvoker[5]);
        return string2;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @NotNull
    public Path e() {
        Path path = NovolineInvoker.c(aen_2.d(this.a));
        ConfigManager.g();
        Path path2 = ah__0.a(path, aam_0.r);
        if (aev_1.a(path2, new LinkOption[0])) {
            block7: {
                boolean bl = false;
                int n = 1;
                try {
                    aev_1.a(path2, ah__0.a(path, aL0.c(aL0.a(new StringBuilder(), aam_0.f), n).toString()), new CopyOption[0]);
                    bl = true;
                    break block7;
                }
                catch (FileAlreadyExistsException fileAlreadyExistsException) {
                }
                catch (IOException iOException) {
                    LoggerInvoker.a(NovolineInvoker.getLogger(), aam_0.l, iOException);
                }
                ++n;
            }
            LoggerInvoker.f(NovolineInvoker.getLogger(), aam_0.o);
        }
        if (aev_1.d(path2, new LinkOption[0])) {
            try {
                aev_1.b(path2, new FileAttribute[0]);
            }
            catch (IOException iOException) {
                LoggerInvoker.a(NovolineInvoker.getLogger(), aam_0.j, iOException);
                a4E.b(iOException);
            }
        }
        return path2;
    }

    public static boolean c() {
        return e;
    }

    @NotNull
    public Path b(@NotNull String string) {
        asl_0.a(string, aam_0.g);
        return ah__0.a(this.e(), aL0.a(aL0.a(new StringBuilder(), string), aam_0.m).toString());
    }

    public ConfigManager(@NotNull ModuleManager moduleManager, int n) {
        this.a = moduleManager;
        this.f = n;
    }

    private static boolean lambda$getConfigs$2(String string) {
        return StringInvoker.c(string, aam_0.a);
    }

    /*
     * WARNING - void declaration
     */
    public void a(@NotNull Path path, boolean bl, EnumModuleType[] enumModuleTypeArray) throws IOException, a68 {
        ModuleHolder moduleHolder;
        ad__0 ad__02;
        long l4 = g ^ 0x66AE26329AB6L;
        long l5 = l4 ^ 0x3951432426D6L;
        int n = (int)(l5 >>> 32);
        int n2 = (int)(l5 << 32 >>> 48);
        int n3 = (int)(l5 << 48 >>> 48);
        ConfigManager.g();
        if (aev_1.d(path, new LinkOption[0])) {
            throw new FileNotFoundException(aam_0.d);
        }
        ConfigurationOptions configurationOptions = this.d(n, (char)n2, (char)n3);
        ake_1 ake_12 = aio_2.c((H8)aio_2.a((H8)aio_2.a(a4a_0.c(), configurationOptions), path));
        try {
            ad__02 = a4a_0.a(ake_12, configurationOptions);
        }
        catch (IOException iOException) {
            throw new yz_1(iOException);
        }
        ar7_0 ar7_02 = (ar7_0)ki_0.a(ad__02, ake_0.a(ar7_0.class));
        if (ar7_02 == null) {
            return;
        }
        if (ar7_02.b() != this.f) {
            throw new PT();
        }
        ModuleArrayMap moduleArrayMap = aen_2.c(this.a);
        Object object = uw_0.b(moduleArrayMap.values());
        if (dz_0.c((Iterator)object)) {
            moduleHolder = (ModuleHolder)dz_0.b((Iterator)object);
            if (ListInvoker.contains(a7r_0.a((Object[])enumModuleTypeArray), (Object)wc_1.d(akk_0.b(moduleHolder)))) {
                wc_1.b(akk_0.b(moduleHolder), false);
            }
        }
        if (dz_0.c((Iterator)((Object)(moduleHolder = pb_1.b(xt_1.a(ar7_02).entrySet()))))) {
            Iterator iterator;
            Map.Entry entry = (Map.Entry)dz_0.b((Iterator)((Object)moduleHolder));
            String string = (String)FG.b(entry);
            ModuleHolder moduleHolder2 = (ModuleHolder)FG.a(entry);
            if (ListInvoker.contains(a7r_0.a((Object[])enumModuleTypeArray), (Object)wc_1.d(akk_0.b(moduleHolder2))) && (object = (pg_0)moduleArrayMap.get(string)) != null && dz_0.c(iterator = aS0.f(MapInvoker.b(ajg.e((pg_0)object))))) {
                Map.Entry entry2 = (Map.Entry)dz_0.b(iterator);
                String string2 = (String)FG.b(entry2);
                aka_1 aka_12 = (aka_1)FG.a(entry2);
                try {
                    void var20_23;
                    x5_0.a(aka_12, akk_0.b(moduleHolder2), ajg.c((pg_0)object), bl);
                    ++var20_23;
                }
                catch (Throwable throwable) {
                    void var21_25;
                    LoggerInvoker.b(NovolineInvoker.getLogger(), aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aam_0.p), string2), aam_0.k), ajg.d((pg_0)object)).toString(), throwable);
                    ++var21_25;
                }
            }
        }
    }

    public static boolean g() {
        ConfigManager.c();
        return true;
    }

    public int a() {
        return this.f;
    }

    @NotNull
    public ModuleManager h() {
        return this.a;
    }

    public boolean a(@NotNull String string) throws IOException {
        ConfigManager.c();
        Path path = this.b(string);
        if (aev_1.d(path, new LinkOption[0])) {
            throw new FileNotFoundException();
        }
        aev_1.a(path);
        return true;
    }

    @NotNull
    private ConfigurationOptions d(int n, char c, char c2) {
        long l4 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)c2 << 48 >>> 48) ^ g;
        long l5 = l4 ^ 0x4043E7671784L;
        int n2 = (int)(l5 >>> 32);
        int n3 = (int)(l5 << 32 >>> 48);
        int n4 = (int)(l5 << 48 >>> 48);
        ConfigManager.g();
        if (b == null) {
            ConfigurationOptions configurationOptions = aVH.a(aVH.a(), new aSf());
            TypeSerializerCollection typeSerializerCollection = aOQ.b();
            asq_0.a(typeSerializerCollection, new a09(this), (GE)new ym_1());
            asq_0.a(typeSerializerCollection, ake_0.a(ModuleArrayMap.class), (GE)new awx_1(n2, (char)n3, (short)n4, this.a));
            asq_0.a(typeSerializerCollection, ConfigManager::lambda$defaultOptions$4, (GE)new a7n_0(this.a));
            typeSerializerCollection = asq_0.a(aOQ.a(), typeSerializerCollection);
            b = configurationOptions = aVH.a(configurationOptions, typeSerializerCollection);
            return b;
        }
        return b;
    }

    private static boolean lambda$defaultOptions$4(TypeToken typeToken) {
        boolean bl;
        ConfigManager.g();
        Class clazz = ake_0.b(typeToken);
        do {
            if (bl = ara_2.c(clazz, DelsyConfig.class)) continue;
            clazz = ara_2.a(clazz);
        } while (!bl && clazz != null && ara_2.a(clazz) != null);
        return bl;
    }

    private static BufferedWriter lambda$saveToString$0(StringWriter stringWriter) throws Exception {
        return new BufferedWriter(stringWriter);
    }

    public static String f() {
        return aam_0.i;
    }

    private static String lambda$getConfigs$3(String string) {
        return StringInvoker.b(string, 0, StringInvoker.c(string) - StringInvoker.c(aam_0.q));
    }

    public void a(@NotNull String string, boolean bl, EnumModuleType[] enumModuleTypeArray) throws IOException, a68 {
        Path path = this.b(string);
        this.a(path, bl, enumModuleTypeArray);
        ClickGui clickGui = (ClickGui)ModuleInvoker.isEnable(ModuleRegistry.CLICKGUI);
        HUD cfr_ignored_0 = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        z4_0.a(clickGui, db_0.b((Double)MD.b(z4_0.n(clickGui))));
        this.c = true;
    }

    public void a(@NotNull String string, boolean bl) throws IOException, a68 {
        Path path = this.b(string);
        ConfigManager.c();
        this.a(path, bl);
        ClickGui clickGui = (ClickGui)ModuleInvoker.isEnable(ModuleRegistry.CLICKGUI);
        HUD cfr_ignored_0 = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        if (StringPropertyInvoker.isMode(z4_0.d(clickGui), aam_0.h)) {
            z4_0.a(clickGui, db_0.b((Double)MD.b(z4_0.t(clickGui))));
        }
        z4_0.a(clickGui, db_0.b((Double)MD.b(z4_0.n(clickGui))));
        this.c = true;
    }

    private static boolean lambda$getConfigs$1(Path path) {
        return aev_1.a(path, new LinkOption[0]);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        if (!ConfigManager.c()) {
            ConfigManager.b(true);
        }
        int n = -1;
        char[] cArray = "\u000bV$|\u001c".toCharArray();
        int n2 = 0;
        int n3 = 100;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x41));
            n3 = n3;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void a(@NotNull Path path, boolean bl) throws IOException, a68 {
        ModuleHolder moduleHolder;
        ad__0 ad__02;
        long l4 = g ^ 0x31434328A04AL;
        long l5 = l4 ^ 0x6EBC263E1C2AL;
        int n = (int)(l5 >>> 32);
        int n2 = (int)(l5 << 32 >>> 48);
        int n3 = (int)(l5 << 48 >>> 48);
        ConfigManager.c();
        if (aev_1.d(path, new LinkOption[0])) {
            throw new FileNotFoundException(aam_0.b);
        }
        ConfigurationOptions configurationOptions = this.d(n, (char)n2, (char)n3);
        ake_1 ake_12 = aio_2.c((H8)aio_2.a((H8)aio_2.a(a4a_0.c(), configurationOptions), path));
        try {
            ad__02 = a4a_0.a(ake_12, configurationOptions);
        }
        catch (IOException iOException) {
            throw new yz_1(iOException);
        }
        ar7_0 ar7_02 = (ar7_0)ki_0.a(ad__02, ake_0.a(ar7_0.class));
        if (ar7_02 == null) {
            return;
        }
        if (ar7_02.b() != this.f) {
            throw new PT();
        }
        ModuleArrayMap moduleArrayMap = aen_2.c(this.a);
        Object object = uw_0.b(moduleArrayMap.values());
        if (dz_0.c((Iterator)object)) {
            moduleHolder = (ModuleHolder)dz_0.b((Iterator)object);
            wc_1.b(akk_0.b(moduleHolder), false);
        }
        if (dz_0.c((Iterator)((Object)(moduleHolder = pb_1.b(xt_1.a(ar7_02).entrySet()))))) {
            Iterator iterator;
            Map.Entry entry = (Map.Entry)dz_0.b((Iterator)((Object)moduleHolder));
            String string = (String)FG.b(entry);
            ModuleHolder moduleHolder2 = (ModuleHolder)FG.a(entry);
            object = (pg_0)moduleArrayMap.get(string);
            if (object != null && dz_0.c(iterator = aS0.f(MapInvoker.b(ajg.e((pg_0)object))))) {
                Map.Entry entry2 = (Map.Entry)dz_0.b(iterator);
                String string2 = (String)FG.b(entry2);
                aka_1 aka_12 = (aka_1)FG.a(entry2);
                try {
                    void var19_22;
                    x5_0.a(aka_12, akk_0.b(moduleHolder2), ajg.c((pg_0)object), bl);
                    ++var19_22;
                }
                catch (Throwable throwable) {
                    void var20_24;
                    LoggerInvoker.b(NovolineInvoker.getLogger(), aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aam_0.e), string2), aam_0.c), ajg.d((pg_0)object)).toString(), throwable);
                    ++var20_24;
                }
            }
        }
    }

    @NotNull
    public @NotNull List<@NotNull String> b() {
        Stream stream;
        try {
            stream = aev_1.a(this.e(), new FileVisitOption[0]);
        }
        catch (IOException iOException) {
            LoggerInvoker.a(NovolineInvoker.getLogger(), aam_0.n, iOException);
            return asg_0.e();
        }
        return (List)aMF.a(aMF.a(aMF.b(aMF.a(aMF.a(aMF.b(stream, ConfigManager::lambda$getConfigs$1), Path::getFileName), Path::toString), ConfigManager::lambda$getConfigs$2), ConfigManager::lambda$getConfigs$3), aB0.a(ObjectArrayList::new));
    }

    public static void b(boolean bl) {
        e = bl;
    }
}

