/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import net.DS;
import net.ResourceLocation;

class BU
extends URLStreamHandler {
    ResourceLocation a;

    BU(ResourceLocation resourceLocation) {
        this.a = resourceLocation;
    }

    @Override
    protected URLConnection openConnection(URL uRL) {
        return new DS(this, uRL);
    }
}

