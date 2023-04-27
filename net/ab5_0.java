/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;
import deobf.Packet;
import net.minecraft.network.packts.C0EPacketClickWindow;
import net.skidunion.annotations;

/*
 * Renamed from net.ab5
 */
public class ab5_0
implements xz_2 {
    private C0EPacketClickWindow a;

    @annotations
    public int getUsedButton() {
        return this.a.k();
    }

    @annotations
    public int getWindowId() {
        return this.a.j();
    }

    @annotations
    public void setClickedItem(ItemStack itemStack) {
        this.a.a(itemStack);
    }

    @Override
    @annotations
    public String getName() {
        return yk_0.a;
    }

    @Override
    @annotations
    public Packet getPacket() {
        return this.a;
    }

    @annotations
    public void setSlotId(int n) {
        this.a.b(n);
    }

    @annotations
    public int getSlotId() {
        return this.a.l();
    }

    @annotations
    public void setMode(int n) {
        this.a.d(n);
    }

    @annotations
    public ItemStack getClickedItem() {
        return this.a.h();
    }

    @annotations
    public void setActionNumber(short s) {
        this.a.a(s);
    }

    @annotations
    public short getActionNumber() {
        return this.a.i();
    }

    @annotations
    public void setUsedButton(int n) {
        this.a.c(n);
    }

    @annotations
    public int getMode() {
        return this.a.a();
    }

    @annotations
    public void setWindowId(int n) {
        this.a.a(n);
    }

    public ab5_0(C0EPacketClickWindow c0EPacketClickWindow) {
        this.a = c0EPacketClickWindow;
    }
}

