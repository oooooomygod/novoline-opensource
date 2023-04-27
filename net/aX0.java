/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.PlayerControllerInvoker;
import net.minecraft.inventory.Container;
import deobf.ICrafting;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.client.Minecraft;

public class aX0
implements ICrafting {
    private Minecraft a;

    @Override
    public void a(Container container, int n, ItemStack itemStack) {
        PlayerControllerInvoker.a(this.a.playerController, itemStack, n);
    }

    @Override
    public void a(Container container, List<ItemStack> list) {
    }

    public aX0(Minecraft minecraft) {
        this.a = minecraft;
    }

    @Override
    public void a(Container container, rs_1 rs_12) {
    }

    @Override
    public void a(Container container, int n, int n2) {
    }
}

