/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.typesafe.config.ConfigException
 *  org.apache.logging.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
package cc.novoline.modules;

import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.modules.AbstractModule;
import com.typesafe.config.ConfigException;
import deobf.TypeSerializerCollection;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import net.ConfigurationOptions;
import net.GE;
import net.H8;
import net.a4a_0;
import net.a9;
import net.aGf;
import net.aL0;
import net.aOQ;
import net.aSf;
import net.aVH;
import net.aWR;
import net.ad__0;
import net.aev_1;
import net.ah__0;
import net.aio_2;
import net.ake_1;
import net.anf_2;
import net.asq_0;
import net.ki_0;
import net.vi_1;
import net.ym_1;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class Config {
    private ad__0 a;
    private Path c;
    private ake_1 d;
    private static Logger b = LogManagerInvoker.c();

    public void a(@NotNull ad__0 ad__02) {
        this.a = ad__02;
    }

    @NotNull
    public ad__0 a(String string) {
        AbstractModule.c();
        ad__0 ad__02 = this.e();
        if (string == null || StringInvoker.g(StringInvoker.h(string))) {
            throw new IllegalArgumentException(a9.a);
        }
        return ki_0.a(ad__02, new Object[]{string});
    }

    @NotNull
    public static Config a(@NotNull Path path) {
        return new Config(path);
    }

    @NotNull
    public ad__0 e() {
        AbstractModule.v();
        if (this.a == null) {
            throw new IllegalStateException(a9.i);
        }
        return this.a;
    }

    private Config(@NotNull Path path) {
        this.c = path;
        this.d = aio_2.c((H8)aio_2.a((H8)aio_2.a(a4a_0.c(), this.a()), this.c));
    }

    @NotNull
    private ConfigurationOptions a() {
        ConfigurationOptions configurationOptions = aVH.a(aVH.a(), new aSf());
        TypeSerializerCollection typeSerializerCollection = aOQ.b();
        asq_0.a(typeSerializerCollection, new vi_1(this), (GE)new ym_1());
        typeSerializerCollection = asq_0.a(aOQ.a(), typeSerializerCollection);
        configurationOptions = aVH.a(configurationOptions, typeSerializerCollection);
        return configurationOptions;
    }

    @NotNull
    public ake_1 c() {
        return this.d;
    }

    public void b() throws IOException {
        try {
            a4a_0.a(this.d, this.e());
            return;
        }
        catch (IOException iOException) {
            throw new IOException(a9.c, iOException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void d() throws aGf {
        AbstractModule.v();
        Path path = this.c;
        try {
            if (aev_1.d(path, new LinkOption[0])) {
                try {
                    Path path2 = ah__0.b(path);
                    if (path2 != null) {
                        aev_1.b(path2, new FileAttribute[0]);
                    }
                    aev_1.c(path, new FileAttribute[0]);
                }
                catch (IOException iOException) {
                    throw new IOException(aL0.a(aL0.a(new StringBuilder(), a9.d), ah__0.c(path)).toString(), iOException);
                }
            }
            if (!aev_1.c(path, new LinkOption[0])) {
                this.a = a4a_0.b(this.d);
                return;
            }
            try {
                aev_1.a(path, ah__0.b(path, aL0.c(aL0.a(aL0.a(new StringBuilder(), ah__0.c(path)), a9.e), MathInvoker.a(anf_2.c(anf_2.c()))).toString()), new CopyOption[]{StandardCopyOption.REPLACE_EXISTING});
                aev_1.c(path, new FileAttribute[0]);
                this.d();
                return;
            }
            catch (IOException iOException) {
                throw new aGf(a9.b, iOException);
            }
        }
        catch (Throwable throwable) {
            if (!(aWR.a(throwable) instanceof ConfigException)) {
                throw new aGf(a9.g, throwable);
            }
            try {
                aev_1.a(path, ah__0.b(path, aL0.c(aL0.a(aL0.a(new StringBuilder(), ah__0.c(path)), a9.f), MathInvoker.a(anf_2.c(anf_2.c()))).toString()), new CopyOption[]{StandardCopyOption.REPLACE_EXISTING});
                aev_1.c(path, new FileAttribute[0]);
                this.d();
                return;
            }
            catch (IOException iOException) {
                throw new aGf(a9.h, iOException);
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

