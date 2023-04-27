/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.modules.exploits.NoFall;
import net.minecraft.network.packts.C08PacketPlayerBlockPlacement;
import net.minecraft.network.packts.C09PacketHeldItemChange;

/*
 * Renamed from net.aUm
 */
class aum_0
extends FutureTask {
    NoFall a;

    @Override
    public void f() {
        NoFall.b(this.a, new C08PacketPlayerBlockPlacement(InventoryInvoker.c(NoFall.c((NoFall)this.a).player.inventory, NoFall.b(this.a))));
        NoFall.a(this.a, new C09PacketHeldItemChange(NoFall.a((NoFall)this.a).player.inventory.a));
    }

    aum_0(NoFall noFall, int n, ag3_0 ag3_02) {
        this.a = noFall;
        super(n, ag3_02);
    }

    @Override
    public void b() {
    }
}

