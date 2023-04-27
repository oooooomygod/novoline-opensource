/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.LoggerInvoker;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import net.ResourceLocation;
import net.YX;
import net.a0r_0;
import net.aL0;
import net.ch_2;

class a8Y
extends InputStream {
    private String c;
    private boolean a = false;
    private InputStream b;

    public a8Y(InputStream inputStream, ResourceLocation resourceLocation, String string) {
        this.b = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ch_2.a(new Exception(), new PrintStream(byteArrayOutputStream));
        this.c = aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), a0r_0.c), resourceLocation), a0r_0.b), string), a0r_0.a), byteArrayOutputStream.toString()).toString();
    }

    protected void finalize() throws Throwable {
        if (!this.a) {
            LoggerInvoker.warn(YX.a(), this.c);
        }
        super.finalize();
    }

    @Override
    public int read() throws IOException {
        return this.b.read();
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    @Override
    public void close() throws IOException {
        this.b.close();
        this.a = true;
    }
}

