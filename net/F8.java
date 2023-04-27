/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.PacketBufferInvoker;
import net.minecraft.item.ItemStack;
import deobf.NBTTagList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class F8
extends ArrayList<ahh_0> {
    private boolean a(ItemStack itemStack, ItemStack itemStack2) {
        return act_2.d(itemStack, itemStack2) && (!act_2.b(itemStack2) || act_2.b(itemStack) && S1.a(act_2.a(itemStack2), act_2.a(itemStack), false));
    }

    public F8() {
    }

    public F8(NBTTagCompound nBTTagCompound) {
        this.a(nBTTagCompound);
    }

    public static F8 a(PacketBuffer packetBuffer) throws IOException {
        F8 f8 = new F8();
        int n = PacketBufferInvoker.l(packetBuffer) & 0xFF;
        for (int i = 0; i < n; ++i) {
            ItemStack itemStack = PacketBufferInvoker.g(packetBuffer);
            ItemStack itemStack2 = PacketBufferInvoker.g(packetBuffer);
            ItemStack itemStack3 = null;
            if (PacketBufferInvoker.i(packetBuffer)) {
                itemStack3 = PacketBufferInvoker.g(packetBuffer);
            }
            PacketBufferInvoker.i(packetBuffer);
            int n2 = PacketBufferInvoker.p(packetBuffer);
            int n3 = PacketBufferInvoker.p(packetBuffer);
            ahh_0 ahh_02 = new ahh_0(itemStack, itemStack3, itemStack2, n2, n3);
            aEU.a(ahh_02);
            f8.add(ahh_02);
        }
        return f8;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public NBTTagCompound a() {
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        NBTTagList nBTTagList = new NBTTagList();
        Iterator iterator = this.iterator();
        while (dz_0.c(iterator)) {
            ahh_0 ahh_02;
            ahh_0 ahh_03 = ahh_02 = (ahh_0)dz_0.b(iterator);
            kv_0.a(nBTTagList, aEU.j(ahh_03));
        }
        tn_0.a(nBTTagCompound, aUP.b, nBTTagList);
        return nBTTagCompound;
    }

    public void b(PacketBuffer packetBuffer) {
        PacketBufferInvoker.c(packetBuffer, (byte)(this.size() & 0xFF));
        Iterator iterator = this.iterator();
        while (dz_0.c(iterator)) {
            ahh_0 ahh_02;
            ahh_0 ahh_03 = ahh_02 = (ahh_0)dz_0.b(iterator);
            PacketBufferInvoker.a(packetBuffer, aEU.e(ahh_03));
            PacketBufferInvoker.a(packetBuffer, aEU.g(ahh_03));
            ItemStack itemStack = aEU.f(ahh_03);
            PacketBufferInvoker.a(packetBuffer, true);
            PacketBufferInvoker.a(packetBuffer, itemStack);
            PacketBufferInvoker.a(packetBuffer, aEU.c(ahh_03));
            PacketBufferInvoker.e(packetBuffer, aEU.h(ahh_03));
            PacketBufferInvoker.e(packetBuffer, aEU.b(ahh_03));
        }
    }

    public ahh_0 a(ItemStack itemStack, ItemStack itemStack2, int n) {
        if (n < this.size()) {
            ahh_0 ahh_02 = (ahh_0)this.get(n);
            return !this.a(itemStack, aEU.e(ahh_02)) || aEU.k(ahh_02) && (!aEU.k(ahh_02) || !this.a(itemStack2, aEU.f(ahh_02))) || itemStack.a < aEU.e((ahh_0)ahh_02).a || aEU.k(ahh_02) && itemStack2.a < aEU.f((ahh_0)ahh_02).a ? null : ahh_02;
        }
        for (int i = 0; i < this.size(); ++i) {
            ahh_0 ahh_03 = (ahh_0)this.get(i);
            if (!this.a(itemStack, aEU.e(ahh_03)) || itemStack.a < aEU.e((ahh_0)ahh_03).a) continue;
            if (!aEU.k(ahh_03)) {
                // empty if block
            }
            if (!aEU.k(ahh_03) || !this.a(itemStack2, aEU.f(ahh_03)) || itemStack2.a < aEU.f((ahh_0)ahh_03).a) continue;
            return ahh_03;
        }
        return null;
    }

    public void a(NBTTagCompound nBTTagCompound) {
        NBTTagList nBTTagList = tn_0.c(nBTTagCompound, aUP.a, 10);
        for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
            NBTTagCompound nBTTagCompound2 = kv_0.g(nBTTagList, i);
            this.add(new ahh_0(nBTTagCompound2));
        }
    }
}

