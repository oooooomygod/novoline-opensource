/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import deobf.Packet;
import net.minecraft.network.packts.S34PacketMaps;

public class aBN {
    public int f;
    private int b;
    wp_1 a;
    private int g;
    private boolean i;
    private int d;
    private int e;
    public EntityPlayer c;
    private int h;

    public aBN(wp_1 wp_12, EntityPlayer entityPlayer) {
        this.a = wp_12;
        this.i = true;
        this.h = 0;
        this.g = 0;
        this.b = 127;
        this.e = 127;
        this.c = entityPlayer;
    }

    public Packet a(ItemStack itemStack) {
        if (this.i) {
            this.i = false;
            return new S34PacketMaps(act_2.c(itemStack), this.a.c, this.a.e.values(), this.a.d, this.h, this.g, this.b + 1 - this.h, this.e + 1 - this.g);
        }
        return this.d++ % 5 == 0 ? new S34PacketMaps(act_2.c(itemStack), this.a.c, this.a.e.values(), this.a.d, 0, 0, 0, 0) : null;
    }

    public void a(int n, int n2) {
        if (this.i) {
            this.h = MathInvoker.b(this.h, n);
            this.g = MathInvoker.b(this.g, n2);
            this.b = MathInvoker.max(this.b, n);
            this.e = MathInvoker.max(this.e, n2);
        } else {
            this.i = true;
            this.h = n;
            this.g = n2;
            this.b = n;
            this.e = n2;
        }
    }
}

