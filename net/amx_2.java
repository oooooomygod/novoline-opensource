/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 */
package net;

import com.google.common.base.Splitter;
import java.util.List;

/*
 * Renamed from net.amx
 */
public class amx_2 {
    public static Splitter a(String string) {
        return Splitter.on((String)string);
    }

    public static Splitter a(Splitter splitter, int n) {
        return splitter.limit(n);
    }

    public static Splitter a(Splitter splitter) {
        return splitter.omitEmptyStrings();
    }

    public static List a(Splitter splitter, CharSequence charSequence) {
        return splitter.splitToList(charSequence);
    }

    public static Splitter a(char c) {
        return Splitter.on((char)c);
    }

    public static Iterable b(Splitter splitter, CharSequence charSequence) {
        return splitter.split(charSequence);
    }
}

