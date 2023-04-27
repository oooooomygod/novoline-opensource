/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.EntityPlayerInvoker;
import deobf.EntityPlayer;
import deobf.EnumFacing;
import deobf.ItemInWorldManager;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packts.S2BPacketChangeGameState;

/*
 * Renamed from net.arX
 */
public class arx_1
extends ItemInWorldManager {
    private boolean o;
    private int l;
    private int n;
    private boolean m;

    @Override
    public boolean a(EntityPlayer entityPlayer, World world, ItemStack itemStack, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3) {
        if (this.m) {
            this.a();
            return false;
        }
        return super.a(entityPlayer, world, itemStack, blockPos, enumFacing, f, f2, f3);
    }

    @Override
    public boolean c(BlockPos blockPos) {
        return !this.m && super.c(blockPos);
    }

    @Override
    public void a(BlockPos blockPos, EnumFacing enumFacing) {
        if (this.m) {
            this.a();
        } else {
            super.a(blockPos, enumFacing);
        }
    }

    @Override
    public boolean a(EntityPlayer entityPlayer, World world, ItemStack itemStack) {
        if (this.m) {
            this.a();
            return false;
        }
        return super.a(entityPlayer, world, itemStack);
    }

    private void a() {
        if (this.n > 100) {
            EntityPlayerInvoker.a(this.e, new aoz_1(abp_1.c, new Object[0]));
            this.n = 0;
        }
    }

    @Override
    public void e() {
        super.e();
        ++this.l;
        long l4 = aV8.d(this.a);
        long l5 = l4 / 24000L + 1L;
        if (!this.o && this.l > 20) {
            this.o = true;
            qv_0.a(this.e.playerNetServerHandler, new S2BPacketChangeGameState(5, 0.0f));
        }
        boolean bl = this.m = l4 > 120500L;
        if (this.m) {
            ++this.n;
        }
        if (l4 % 24000L == 500L) {
            if (l5 <= 6L) {
                EntityPlayerInvoker.a(this.e, new aoz_1(aL0.a(aL0.a(new StringBuilder(), abp_1.a), l5).toString(), new Object[0]));
            }
        } else if (l5 == 1L) {
            if (l4 == 100L) {
                qv_0.a(this.e.playerNetServerHandler, new S2BPacketChangeGameState(5, 101.0f));
            } else if (l4 == 175L) {
                qv_0.a(this.e.playerNetServerHandler, new S2BPacketChangeGameState(5, 102.0f));
            } else if (l4 == 250L) {
                qv_0.a(this.e.playerNetServerHandler, new S2BPacketChangeGameState(5, 103.0f));
            }
        } else if (l5 == 5L && l4 % 24000L == 22000L) {
            EntityPlayerInvoker.a(this.e, new aoz_1(abp_1.b, new Object[0]));
        }
    }

    public arx_1(World world) {
        super(world);
    }

    @Override
    public void b(BlockPos blockPos) {
        if (!this.m) {
            super.b(blockPos);
        }
    }
}

