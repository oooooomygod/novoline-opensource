/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ThreadInvoker;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.aMm
 */
class amm_0
extends Thread {
    Minecraft a;

    @Override
    public void run() {
        while (this.a.Q) {
            try {
                ThreadInvoker.sleep(Integer.MAX_VALUE);
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    amm_0(Minecraft minecraft, String string) {
        this.a = minecraft;
        super(string);
    }
}

