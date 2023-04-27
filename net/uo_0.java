/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.net.URL;

/*
 * Renamed from net.Uo
 */
public class uo_0 {
    public static URL a(ClassLoader classLoader, String string) {
        return classLoader.getResource(string);
    }

    public static ClassLoader a() {
        return ClassLoader.getSystemClassLoader();
    }
}

