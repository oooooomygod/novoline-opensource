/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Packet;
import net.minecraft.network.packts.C0FPacketConfirmTransaction;
import net.skidunion.annotations;

public class aW0
implements xz_2 {
    private C0FPacketConfirmTransaction a;

    @annotations
    public void setTransactionID(short s) {
        a2_0.a(this.a, s);
    }

    @annotations
    public boolean isAccepted() {
        return this.a.c();
    }

    @Override
    @annotations
    public String getName() {
        return akf_1.a;
    }

    @annotations
    public short getTransactionID() {
        return a2_0.a(this.a);
    }

    public aW0(C0FPacketConfirmTransaction c0FPacketConfirmTransaction) {
        this.a = c0FPacketConfirmTransaction;
    }

    @annotations
    public void setWindowID(int n) {
        a2_0.a(this.a, n);
    }

    @annotations
    public int getWindowID() {
        return a2_0.b(this.a);
    }

    @annotations
    public void setAccepted(boolean bl) {
        this.a.a(true);
    }

    @Override
    @annotations
    public Packet getPacket() {
        return this.a;
    }
}

