/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.File;
import java.nio.file.Path;

/*
 * Renamed from net.ah_
 */
public class ah__0 {
    public static Path b(Path path, String string) {
        return path.resolveSibling(string);
    }

    public static Path b(Path path) {
        return path.getParent();
    }

    public static Path a(Path path) {
        return path.toAbsolutePath();
    }

    public static Path a(Path path, String string) {
        return path.resolve(string);
    }

    public static Path c(Path path) {
        return path.getFileName();
    }

    public static File d(Path path) {
        return path.toFile();
    }
}

