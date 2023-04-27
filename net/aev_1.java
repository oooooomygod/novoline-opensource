/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.CopyOption;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.List;
import java.util.stream.Stream;

/*
 * Renamed from net.aeV
 */
public class aev_1 {
    private static int[] b;

    public static BufferedReader a(Path path, Charset charset) {
        return Files.newBufferedReader(path, charset);
    }

    public static Stream a(Path path, FileVisitOption[] fileVisitOptionArray) {
        return Files.walk(path, fileVisitOptionArray);
    }

    public static boolean a(Path path) {
        return Files.deleteIfExists(path);
    }

    public static BufferedWriter a(Path path, Charset charset, OpenOption[] openOptionArray) {
        return Files.newBufferedWriter(path, charset, openOptionArray);
    }

    public static Path a(Path path, FileAttribute[] fileAttributeArray) {
        return Files.createDirectory(path, fileAttributeArray);
    }

    public static Path c(Path path, FileAttribute[] fileAttributeArray) {
        return Files.createFile(path, fileAttributeArray);
    }

    public static long a(InputStream inputStream, Path path, CopyOption[] copyOptionArray) {
        return Files.copy(inputStream, path, copyOptionArray);
    }

    public static Path b(Path path, FileAttribute[] fileAttributeArray) {
        return Files.createDirectories(path, fileAttributeArray);
    }

    public static Stream d(Path path) {
        return Files.lines(path);
    }

    public static byte[] e(Path path) {
        return Files.readAllBytes(path);
    }

    public static boolean c(Path path, LinkOption[] linkOptionArray) {
        return Files.isDirectory(path, linkOptionArray);
    }

    public static void b(Path path) {
        Files.delete(path);
    }

    public static Path a(Path path, byte[] byArray, OpenOption[] openOptionArray) {
        return Files.write(path, byArray, openOptionArray);
    }

    public static boolean d(Path path, LinkOption[] linkOptionArray) {
        return Files.notExists(path, linkOptionArray);
    }

    public static int[] b() {
        return b;
    }

    public static boolean b(Path path, LinkOption[] linkOptionArray) {
        return Files.exists(path, linkOptionArray);
    }

    public static Path a(Path path, Path path2, CopyOption[] copyOptionArray) {
        return Files.move(path, path2, copyOptionArray);
    }

    public static Path b(Path path, Path path2, CopyOption[] copyOptionArray) {
        return Files.copy(path, path2, copyOptionArray);
    }

    public static boolean a(Path path, LinkOption[] linkOptionArray) {
        return Files.isRegularFile(path, linkOptionArray);
    }

    static {
        if (aev_1.b() != null) {
            aev_1.b(new int[2]);
        }
    }

    public static List c(Path path) {
        return Files.readAllLines(path);
    }

    public static void b(int[] nArray) {
        b = nArray;
    }
}

