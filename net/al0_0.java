/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.MCInvoker;

/*
 * Renamed from net.al0
 */
class al0_0
extends Thread {
    al0_0(String string) {
        super(string);
    }

    @Override
    public void run() {
        MCInvoker.g();
    }
}

