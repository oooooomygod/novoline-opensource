/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package net;

import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import com.google.common.base.Splitter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.NoSuchFileException;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import net.ConfigurationOptions;
import net.a21;
import net.a4e_0;
import net.a6H;
import net.a7c_0;
import net.aFP;
import net.aLS;
import net.aVH;
import net.aWR;
import net.ad5_0;
import net.ad__0;
import net.amk_2;
import net.amx_2;
import net.auq_0;
import net.dz_0;
import net.hi_0;
import net.ki_0;
import net.ms_0;
import net.ph_0;
import net.s5_0;
import net.vq_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from net.akG
 */
public abstract class akg_1<NodeType extends ad__0>
implements vq_0<NodeType> {
    @NotNull
    private a6H e;
    @Nullable
    protected Callable<BufferedReader> g;
    @NotNull
    private s5_0[] i;
    public static String d = "\n";
    private static int[] f;
    @Nullable
    protected Callable<BufferedWriter> b;
    protected static Splitter c;
    protected static String a;
    @NotNull
    private ConfigurationOptions h;

    protected abstract void a(NodeType var1, BufferedReader var2) throws IOException;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @NotNull
    public NodeType b(@NotNull ConfigurationOptions var1_1) throws IOException {
        akg_1.b();
        if (this.g == null) {
            throw new IOException(ad5_0.b);
        }
        try {
            try {
                var3_2 = (BufferedReader)a21.a(this.g);
                var4_5 = null;
                if (this.e != a6H.PRESERVE && this.e != a6H.NONE) ** GOTO lbl17
                v0 = this.i;
                var5_6 = aFP.a(var3_2, v0);
                if (var5_6 != null && StringInvoker.c((String)var5_6) > 0) {
                    var1_1 = aVH.a(var1_1, (String)var5_6);
                }
lbl17:
                // 4 sources

                var5_6 = ph_0.a(this, var1_1);
                this.a(var5_6, var3_2);
                var6_8 = var5_6;
                try {
                    auq_0.a(var3_2);
                    return (NodeType)var6_8;
                }
                catch (Throwable var7_9) {
                    aWR.a(var4_5, var7_9);
                    auq_0.a(var3_2);
                }
                return (NodeType)var6_8;
                catch (Throwable var5_7) {
                    var4_5 = var5_7;
                    try {
                        throw var5_7;
                    }
                    catch (Throwable var8_10) {
                        try {
                            auq_0.a(var3_2);
                            throw var8_10;
                        }
                        catch (Throwable var9_11) {
                            aWR.a(var4_5, var9_11);
                            auq_0.a(var3_2);
                        }
                        throw var8_10;
                    }
                }
            }
            catch (FileNotFoundException | NoSuchFileException var3_3) {
                return (NodeType)ph_0.a(this, var1_1);
            }
        }
        catch (Exception var3_4) {
            if (var3_4 instanceof IOException == false) throw new IOException(var3_4);
            throw (IOException)var3_4;
        }
    }

    protected akg_1(@NotNull hi_0<?> hi_02, @NotNull s5_0[] s5_0Array) {
        this.g = aLS.c(hi_02);
        this.b = aLS.b(hi_02);
        this.e = aLS.a(hi_02);
        this.i = s5_0Array;
        this.h = hi_02.c();
    }

    protected void a(Writer writer) throws IOException {
    }

    static {
        c = amx_2.a(ad5_0.a);
        akg_1.b(null);
        a = SystemInvoker.a();
    }

    @Override
    public boolean e() {
        return this.b != null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(@NotNull ad__0 ad__02) throws IOException {
        akg_1.b();
        if (this.b == null) {
            throw new IOException(ad5_0.c);
        }
        try {
            Writer writer = (Writer)a21.a(this.b);
            Throwable throwable = null;
            try {
                String string;
                this.a(writer);
                if (this.e != a6H.NONE && !StringInvoker.g(string = aVH.a(ki_0.j(ad__02)))) {
                    Iterator iterator = ms_0.a(amk_2.a(this.c(), (Collection)a7c_0.a(amx_2.b(c, string))));
                    if (dz_0.c(iterator)) {
                        String string2 = (String)dz_0.b(iterator);
                        a4e_0.a(writer, string2);
                        a4e_0.a(writer, a);
                    }
                    a4e_0.a(writer, a);
                }
                this.a(ad__02, writer);
                return;
            }
            catch (Throwable throwable2) {
                throwable = throwable2;
                throw throwable2;
            }
            finally {
                try {
                    a4e_0.a(writer);
                }
                catch (Throwable throwable3) {
                    aWR.a(throwable, throwable3);
                    a4e_0.a(writer);
                }
            }
        }
        catch (Exception exception) {
            if (!(exception instanceof IOException)) throw new IOException(exception);
            throw (IOException)exception;
        }
    }

    protected abstract void a(ad__0 var1, Writer var2) throws IOException;

    @Override
    @NotNull
    public s5_0 c() {
        return this.i[0];
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public static int[] b() {
        return f;
    }

    @Override
    @NotNull
    public ConfigurationOptions d() {
        return this.h;
    }

    public static void b(int[] nArray) {
        f = nArray;
    }

    @Override
    public boolean a() {
        return this.g != null;
    }
}

