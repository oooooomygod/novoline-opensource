/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import net.minecraft.item.ItemStack;
import net.minecraft.network.packts.C08PacketPlayerBlockPlacement;
import net.minecraft.block.BlockPos;

public class C08PacketPlayerBlockPlacementInvoker {
    public static ItemStack e(C08PacketPlayerBlockPlacement c08PacketPlayerBlockPlacement) {
        return c08PacketPlayerBlockPlacement.d();
    }

    public static float c(C08PacketPlayerBlockPlacement c08PacketPlayerBlockPlacement) {
        return c08PacketPlayerBlockPlacement.c();
    }

    public static float f(C08PacketPlayerBlockPlacement c08PacketPlayerBlockPlacement) {
        return c08PacketPlayerBlockPlacement.a();
    }

    public static BlockPos a(C08PacketPlayerBlockPlacement c08PacketPlayerBlockPlacement) {
        return c08PacketPlayerBlockPlacement.f();
    }

    public static float d(C08PacketPlayerBlockPlacement c08PacketPlayerBlockPlacement) {
        return c08PacketPlayerBlockPlacement.e();
    }

    public static int b(C08PacketPlayerBlockPlacement c08PacketPlayerBlockPlacement) {
        return c08PacketPlayerBlockPlacement.b();
    }
}

