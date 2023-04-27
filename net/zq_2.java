/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.net.URI;
import java.nio.file.Path;

/*
 * Renamed from net.zq
 */
public class zq_2 {
    private static int b;

    public static int b() {
        return b;
    }

    public static boolean a(File file) {
        return file.mkdirs();
    }

    public static String c(File file) {
        return file.getParent();
    }

    public static File b(File file) {
        return file.getParentFile();
    }

    public static URI l(File file) {
        return file.toURI();
    }

    public static String[] o(File file) {
        return file.list();
    }

    public static boolean f(File file) {
        return file.delete();
    }

    public static long n(File file) {
        return file.length();
    }

    public static boolean e(File file) {
        return file.canRead();
    }

    public static boolean r(File file) {
        return file.isDirectory();
    }

    public static long k(File file) {
        return file.lastModified();
    }

    public static void s(File file) {
        file.deleteOnExit();
    }

    public static File[] a(File file, FileFilter fileFilter) {
        return file.listFiles(fileFilter);
    }

    public static boolean a(File file, File file2) {
        return file.renameTo(file2);
    }

    public static boolean p(File file) {
        return file.mkdir();
    }

    static {
        if (zq_2.b() == 0) {
            zq_2.b(45);
        }
    }

    public static boolean d(File file) {
        return file.isFile();
    }

    public static int a() {
        zq_2.b();
        return 21;
    }

    public static boolean m(File file) {
        return file.exists();
    }

    public static void b(int n) {
        b = n;
    }

    public static File[] a(File file, FilenameFilter filenameFilter) {
        return file.listFiles(filenameFilter);
    }

    public static String j(File file) {
        return file.getAbsolutePath();
    }

    public static boolean i(File file) {
        return file.createNewFile();
    }

    public static File[] h(File file) {
        return file.listFiles();
    }

    public static String q(File file) {
        return file.getName();
    }

    public static Path g(File file) {
        return file.toPath();
    }
}

