/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Renamed from net.ow
 */
public class ow_1 {
    private static String b;

    public static Pattern c(String string) {
        return Pattern.compile(string);
    }

    public static void b(String string) {
        b = string;
    }

    public static Matcher a(Pattern pattern, CharSequence charSequence) {
        return pattern.matcher(charSequence);
    }

    public static String a(String string) {
        return Pattern.quote(string);
    }

    public static String a(Pattern pattern) {
        return pattern.pattern();
    }

    public static String b() {
        return b;
    }

    static {
        if (ow_1.b() != null) {
            ow_1.b("y7XQN");
        }
    }
}

