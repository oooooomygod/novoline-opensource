/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.Packet;
import net.minecraft.network.packts.S08PacketPlayerPosLook;
import net.skidunion.annotations;

/*
 * Renamed from net.ar4
 */
public class ar4_0
implements xz_2 {
    private static String[] b;
    private S08PacketPlayerPosLook c;

    @annotations
    public void setPitch(float f) {
        this.c.a(f);
    }

    @Override
    @annotations
    public Packet getPacket() {
        return this.c;
    }

    public ar4_0(S08PacketPlayerPosLook s08PacketPlayerPosLook) {
        ar4_0.b();
        this.c = s08PacketPlayerPosLook;
        ListInvoker.b(new ListInvoker[3]);
    }

    public static String[] b() {
        return b;
    }

    @annotations
    public void setYaw(float f) {
        this.c.b(f);
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    @Override
    @annotations
    public String getName() {
        return azq_2.a;
    }

    static {
        if (ar4_0.b() != null) {
            ar4_0.b(new String[2]);
        }
    }
}

