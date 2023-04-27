/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.MCInvoker;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import net.BU;
import net.j6_0;

class DS
extends URLConnection {
    BU a;

    @Override
    public void connect() throws IOException {
    }

    DS(BU bU, URL uRL) {
        this.a = bU;
        super(uRL);
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return j6_0.b(MCInvoker.x(MCInvoker.f()), this.a.a).a();
    }
}

