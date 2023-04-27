/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.LanguageManager;
import java.security.PublicKey;
import java.util.List;
import java.util.SortedSet;
import java.util.jar.JarFile;

import net.skidunion.Protection;

/*
 * Renamed from net.ad2
 */
public class ad2_0 {
    public static void a(LanguageManager languageManager, aeb_0 aeb_02) {
        languageManager.a(aeb_02);
    }

    public static boolean isCurrentLanguageBidirectional(LanguageManager languageManager) {
        return languageManager.a();
    }

    public static SortedSet c(LanguageManager languageManager) {
        return languageManager.c();
    }

    public static aeb_0 d(LanguageManager languageManager) {
        return languageManager.b();
    }

    public static void a(LanguageManager languageManager, Protection protection, JarFile jarFile, PublicKey publicKey) {
        languageManager.a(protection, jarFile, publicKey);
    }

    public static void a(LanguageManager languageManager, List list) {
        languageManager.a(list);
    }

    public static boolean b(LanguageManager languageManager) {
        return languageManager.d();
    }
}

