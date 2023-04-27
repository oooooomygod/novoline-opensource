/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.ViaAPI
 *  com.viaversion.viaversion.api.command.ViaCommandSender
 *  com.viaversion.viaversion.api.configuration.ConfigurationProvider
 *  com.viaversion.viaversion.api.configuration.ViaVersionConfig
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.platform.PlatformTask
 *  com.viaversion.viaversion.api.platform.UnsupportedSoftware
 *  com.viaversion.viaversion.api.platform.ViaPlatform
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.StringInvoker;
import com.viaversion.viaversion.api.ViaAPI;
import com.viaversion.viaversion.api.command.ViaCommandSender;
import com.viaversion.viaversion.api.configuration.ConfigurationProvider;
import com.viaversion.viaversion.api.configuration.ViaVersionConfig;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.platform.PlatformTask;
import com.viaversion.viaversion.api.platform.UnsupportedSoftware;
import com.viaversion.viaversion.api.platform.ViaPlatform;
import com.viaversion.viaversion.libs.gson.JsonObject;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.io.File;
import java.nio.file.Path;
import java.util.Collection;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import net.W8;
import net.aWR;
import net.abs_0;
import net.ac6;
import net.ae2_0;
import net.ah__0;
import net.aog_2;
import net.avs_0;
import net.avs_1;
import net.er_0;
import net.fc_0;
import net.fo_0;
import net.z5_0;
import net.zq_2;

/*
 * Renamed from net.pw
 */
public class pw_2
implements ViaPlatform<UUID> {
    private ViaAPI<UUID> d;
    private static int[] b;
    private abs_0 e;
    private Logger a = new W8(LogManagerInvoker.a(fc_0.f));
    private File c;

    public boolean disconnect(UserConnection userConnection, String string) {
        return super.disconnect(userConnection, string);
    }

    private <T extends Future<?>> GenericFutureListener<T> a() {
        return pw_2::lambda$errorLogger$3;
    }

    public PlatformTask<?> runSync(Runnable runnable, long l4) {
        return new aog_2((java.util.concurrent.Future<?>)ac6.a(er_0.a(fo_0.e(fo_0.a()), () -> this.lambda$runSync$1(runnable), l4 * 50L, TimeUnit.MILLISECONDS), this.a()));
    }

    public File getDataFolder() {
        return this.c;
    }

    public aog_2 b(Runnable runnable) {
        return new aog_2(avs_1.a(avs_1.a(runnable, (Executor)fo_0.c(fo_0.a())), pw_2::lambda$runAsync$0));
    }

    public boolean kickPlayer(UUID uUID, String string) {
        return false;
    }

    public String getPlatformVersion() {
        return StringInvoker.a(47);
    }

    public PlatformTask<?> runRepeatingSync(Runnable runnable, long l4) {
        pw_2.b();
        aog_2 aog_22 = new aog_2((java.util.concurrent.Future<?>)ac6.a(er_0.a(fo_0.e(fo_0.a()), () -> this.lambda$runRepeatingSync$2(runnable), 0L, l4 * 50L, TimeUnit.MILLISECONDS), this.a()));
        if (ListInvoker.b() != null) {
            pw_2.b(new int[2]);
        }
        return aog_22;
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public boolean isProxy() {
        return super.isProxy();
    }

    public ViaVersionConfig getConf() {
        return this.e;
    }

    public void sendMessage(UUID uUID, String string) {
    }

    static {
        if (pw_2.b() != null) {
            pw_2.b(new int[4]);
        }
    }

    public String getPlatformName() {
        return fc_0.a;
    }

    private static Void lambda$runAsync$0(Throwable throwable) {
        pw_2.b();
        if (!(throwable instanceof CancellationException)) {
            aWR.c(throwable);
        }
        return null;
    }

    public String getPluginVersion() {
        return fc_0.d;
    }

    public pw_2(File file) {
        Path path = ah__0.a(zq_2.g(file), fc_0.e);
        pw_2.b();
        this.e = new abs_0(ah__0.d(ah__0.a(path, fc_0.c)));
        this.c = ah__0.d(path);
        this.d = new avs_0();
        ListInvoker.b(new ListInvoker[1]);
    }

    private static void lambda$errorLogger$3(Future future) throws Exception {
        pw_2.b();
        if (!ae2_0.a(future) && ae2_0.b(future) != null) {
            aWR.c(ae2_0.b(future));
        }
    }

    public aog_2 a(Runnable runnable) {
        return new aog_2((java.util.concurrent.Future<?>)ae2_0.a(er_0.a(fo_0.e(fo_0.a()), runnable), this.a()));
    }

    public static int[] b() {
        return b;
    }

    public boolean isPluginEnabled() {
        return true;
    }

    public void onReload() {
        z5_0.a(this.a, fc_0.b);
    }

    public boolean isOldClientsAllowed() {
        return true;
    }

    public ViaCommandSender[] getOnlinePlayers() {
        return new ViaCommandSender[0];
    }

    public Collection<UnsupportedSoftware> getUnsupportedSoftwareClasses() {
        return super.getUnsupportedSoftwareClasses();
    }

    private aog_2 lambda$runSync$1(Runnable runnable) throws Exception {
        return this.a(runnable);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public ViaAPI<UUID> getApi() {
        return this.d;
    }

    public JsonObject getDump() {
        return new JsonObject();
    }

    public Logger getLogger() {
        return this.a;
    }

    private void lambda$runRepeatingSync$2(Runnable runnable) {
        this.a(runnable);
    }

    public ConfigurationProvider getConfigurationProvider() {
        return this.e;
    }
}

