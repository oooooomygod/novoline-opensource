/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package cc.novoline.modules.binds;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.NotificationManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.ModuleHolder;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Iterator;
import java.util.Map;
import net.ConfigurationOptions;
import net.FG;
import net.GE;
import net.H8;
import net.ModuleArrayMap;
import net.ModuleManager;
import net.NotificationType;
import net.OU;
import net.a4a_0;
import net.a4r_0;
import net.a68;
import net.aHV;
import net.aS0;
import net.aVH;
import net.ad__0;
import net.ae6_0;
import net.aen_2;
import net.aev_1;
import net.ah__0;
import net.aio_2;
import net.ake_0;
import net.ake_1;
import net.akk_0;
import net.aoc_1;
import net.asg_0;
import net.asq_0;
import net.auh_2;
import net.dz_0;
import net.ki_0;
import net.pb_1;
import net.wc_1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BindManager {
    private ModuleManager moduleManager;
    private int b;
    private Path c;
    private static ConfigurationOptions DEFAULT_OPTIONS;

    @NotNull
    public Path f() {
        auh_2.b();
        if (this.c == null) {
            this.c = ah__0.a(NovolineInvoker.c(aen_2.d(this.moduleManager)), OU.f);
            return this.c;
        }
        return this.c;
    }

    @NotNull
    private ConfigurationOptions b() {
        auh_2.b();
        if (DEFAULT_OPTIONS == null) {
            ConfigurationOptions configurationOptions = aVH.a();
            asq_0.a(aVH.c(configurationOptions), ake_0.a(ae6_0.class), (GE)new a4r_0());
            DEFAULT_OPTIONS = configurationOptions;
            return DEFAULT_OPTIONS;
        }
        return DEFAULT_OPTIONS;
    }

    public boolean c() {
        auh_2.b();
        boolean bl = false;
        try {
            Path path = this.a();
            return false;
        }
        catch (Throwable throwable) {
            NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), OU.c, 5000, NotificationType.ERROR);
            LoggerInvoker.b(NovolineInvoker.getLogger(), OU.g, throwable);
            return false;
        }
    }

    public void e() {
        auh_2.b();
        ModuleArrayMap moduleArrayMap = aen_2.c(this.moduleManager);
        Map<String, ae6_0> map = this.d();
        Iterator iterator = aS0.f(MapInvoker.b(map));
        if (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            String string = (String)FG.b(entry);
            ae6_0 ae6_02 = (ae6_0)FG.a(entry);
            ObjectIterator objectIterator = pb_1.b(moduleArrayMap.entrySet());
            if (dz_0.c((Iterator)objectIterator)) {
                Map.Entry entry2 = (Map.Entry)dz_0.b((Iterator)objectIterator);
                if (StringInvoker.d((String)FG.b(entry2), string)) {
                    wc_1.a(akk_0.b((ModuleHolder)FG.a(entry2)), ae6_02);
                }
                ListInvoker.b(new ListInvoker[1]);
            }
        }
    }

    @NotNull
    private @NotNull Map<@NotNull String, @NotNull ae6_0> d() {
        ad__0 ad__02;
        auh_2.b();
        Path path = this.f();
        if (aev_1.d(path, new LinkOption[0])) {
            LoggerInvoker.f(NovolineInvoker.getLogger(), OU.a);
            return asg_0.c();
        }
        ConfigurationOptions configurationOptions = this.b();
        ake_1 ake_12 = aio_2.c((H8)aio_2.a((H8)aio_2.a(a4a_0.c(), configurationOptions), path));
        try {
            ad__02 = a4a_0.a(ake_12, configurationOptions);
        }
        catch (IOException iOException) {
            LoggerInvoker.a(NovolineInvoker.getLogger(), OU.h, iOException);
            return asg_0.c();
        }
        Map map = asg_0.c();
        try {
            map = (Map)ki_0.a(ad__02, new aHV(this));
            if (map == null) {
                return asg_0.c();
            }
            return map;
        }
        catch (a68 a682) {
            LoggerInvoker.a(NovolineInvoker.getLogger(), OU.j, a682);
            return map;
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    private static ae6_0 lambda$save$0(Map.Entry entry) {
        return (ae6_0)aoc_1.a(wc_1.h(akk_0.b((ModuleHolder)FG.a(entry))));
    }

    public BindManager(@NotNull ModuleManager moduleManager, int n) {
        this.moduleManager = moduleManager;
        this.b = n;
    }

    @Nullable
    private Path a() {
        auh_2.b();
        Path path = this.f();
        if (aev_1.d(path, new LinkOption[0])) {
            try {
                aev_1.c(path, new FileAttribute[0]);
            }
            catch (IOException iOException) {
                LoggerInvoker.b(NovolineInvoker.getLogger(), OU.e, iOException);
                return null;
            }
        }
        return path;
    }
}

