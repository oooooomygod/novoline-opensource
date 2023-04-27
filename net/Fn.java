/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  tv.twitch.chat.ChatEvent
 */
package net;

import net.aA2;
import net.vg_1;
import tv.twitch.chat.ChatEvent;

class Fn {
    static int[] c;
    static int[] b;
    static int[] a;

    static {
        a = new int[ChatEvent.values().length];
        try {
            Fn.a[ChatEvent.TTV_CHAT_JOINED_CHANNEL.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            Fn.a[ChatEvent.TTV_CHAT_LEFT_CHANNEL.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        c = new int[aA2.values().length];
        try {
            Fn.c[aA2.Connected.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            Fn.c[aA2.Connecting.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            Fn.c[aA2.Created.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            Fn.c[aA2.Disconnected.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            Fn.c[aA2.Disconnecting.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        b = new int[vg_1.values().length];
        try {
            Fn.b[vg_1.None.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            Fn.b[vg_1.Url.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            Fn.b[vg_1.TextureAtlas.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

