/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.IOUtils
 */
package cc.novoline.invoke;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.List;
import org.apache.commons.io.IOUtils;

public class IOUtilsInvoker {
    private static boolean b;

    public static boolean c() {
        IOUtilsInvoker.b();
        return true;
    }

    public static String c(InputStream inputStream) {
        return IOUtils.toString((InputStream)inputStream);
    }

    public static void closeQuietly(InputStream inputStream) {
        IOUtils.closeQuietly((InputStream)inputStream);
    }

    public static String a(Reader reader) {
        return IOUtils.toString((Reader)reader);
    }

    public static byte[] a(InputStream inputStream) {
        return IOUtils.toByteArray((InputStream)inputStream);
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static void a(Writer writer) {
        IOUtils.closeQuietly((Writer)writer);
    }

    public static boolean b() {
        return b;
    }

    public static List a(InputStream inputStream, Charset charset) {
        return IOUtils.readLines((InputStream)inputStream, (Charset)charset);
    }

    public static void a(Closeable closeable) {
        IOUtils.closeQuietly((Closeable)closeable);
    }

    public static void b(Reader reader) {
        IOUtils.closeQuietly((Reader)reader);
    }

    public static void a(OutputStream outputStream) {
        IOUtils.closeQuietly((OutputStream)outputStream);
    }

    public static String b(InputStream inputStream, Charset charset) {
        return IOUtils.toString((InputStream)inputStream, (Charset)charset);
    }

    static {
        if (!IOUtilsInvoker.c()) {
            IOUtilsInvoker.b(true);
        }
    }
}

