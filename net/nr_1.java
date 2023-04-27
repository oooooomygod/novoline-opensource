/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.InventoryInvoker;
import net.minecraft.init.Blocks;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.nR
 */
public class nr_1
extends na_2 {
    @Override
    public boolean a(EntityPlayer entityPlayer) {
        ItemStack itemStack = InventoryInvoker.g(entityPlayer.inventory);
        if (act_2.k(itemStack) == Items.bowl && this.e() >= 0) {
            if (itemStack.a == 1) {
                InventoryInvoker.a(entityPlayer.inventory, entityPlayer.inventory.a, new ItemStack(Items.mushroom_stew));
                return true;
            }
            if (InventoryInvoker.b(entityPlayer.inventory, new ItemStack(Items.mushroom_stew)) && !aSY.a(entityPlayer.abilities)) {
                InventoryInvoker.a(entityPlayer.inventory, entityPlayer.inventory.a, 1);
                return true;
            }
        }
        if (act_2.k(itemStack) == Items.shears && this.e() >= 0) {
            this.E();
            aV8.a(this.worldObj, B7.EXPLOSION_LARGE, this.posX, this.posY + (double)(this.n / 2.0f), this.posZ, 0.0, 0.0, 0.0, new int[0]);
            if (!this.worldObj.isRemote) {
                na_2 na_22 = new na_2(this.worldObj);
                na_22.c(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
                na_22.i(this.a());
                na_22.aD = this.aD;
                if (this.e()) {
                    na_22.a(this.y());
                }
                aV8.b(this.worldObj, na_22);
                int n = 0;
                while (true) {
                    aV8.b(this.worldObj, new og_0(this.worldObj, this.posX, this.posY + (double)this.n, this.posZ, new ItemStack(Blocks.bn)));
                    ++n;
                }
            }
            return true;
        }
        return super.a(entityPlayer);
    }

    public nr_1(World world) {
        super(world);
        this.c(0.9f, 1.3f);
        this.bO = Blocks.aE;
    }

    @Override
    public nr_1 a(n4_0 n4_02) {
        return new nr_1(this.worldObj);
    }
}

