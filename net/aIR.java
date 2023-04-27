/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.nio.file.FileSystem;
import java.util.Set;

public class aIR {
    public static Set a(FileSystem fileSystem) {
        return fileSystem.supportedFileAttributeViews();
    }

    public static Iterable b(FileSystem fileSystem) {
        return fileSystem.getFileStores();
    }
}

