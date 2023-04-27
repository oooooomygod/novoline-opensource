/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.CopyOption;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.Callable;
import net.FX;
import net.UY;
import net.a61;
import net.aL0;
import net.aev_1;
import net.ah__0;
import net.akg_1;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.aFk
 */
public class afk_0 {
    public static @NonNull Callable<BufferedWriter> b(@NonNull Path path, @NonNull Charset charset) {
        UY.a((Object)path, a61.e);
        return () -> afk_0.lambda$createAtomicWriterFactory$0(path, charset);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    private static @NonNull Path a(@NonNull Path path, @NonNull String string) {
        String string2 = aL0.a(aL0.a(aL0.a(new StringBuilder(), SystemInvoker.nanoTime()), StringInvoker.a((String)UY.a((Object)string, a61.d), a61.a, a61.b)), a61.c).toString();
        return ah__0.a(path, string2);
    }

    private static BufferedWriter lambda$createAtomicWriterFactory$0(Path path, Charset charset) throws Exception {
        return afk_0.a(path, charset);
    }

    public static @NonNull BufferedWriter a(@NonNull Path path, @NonNull Charset charset) throws IOException {
        akg_1.b();
        path = ah__0.a(path);
        Path path2 = afk_0.a(ah__0.b(path), ah__0.c(path).toString());
        if (aev_1.b(path, new LinkOption[0])) {
            aev_1.b(path, path2, new CopyOption[]{StandardCopyOption.COPY_ATTRIBUTES, StandardCopyOption.REPLACE_EXISTING});
        }
        BufferedWriter bufferedWriter = aev_1.a(path2, charset, new OpenOption[0]);
        BufferedWriter bufferedWriter2 = new BufferedWriter(new FX(path2, path, bufferedWriter));
        ListInvoker.b(new ListInvoker[5]);
        return bufferedWriter2;
    }

    private afk_0() {
    }
}

