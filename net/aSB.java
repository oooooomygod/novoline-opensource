/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 */
package net;

import com.google.common.base.Joiner;

public class aSB {
    public static Joiner a(char c) {
        return Joiner.on((char)c);
    }

    public static String a(Joiner joiner, Iterable iterable) {
        return joiner.join(iterable);
    }

    public static Joiner a(String string) {
        return Joiner.on((String)string);
    }

    public static StringBuilder a(Joiner joiner, StringBuilder stringBuilder, Iterable iterable) {
        return joiner.appendTo(stringBuilder, iterable);
    }
}

