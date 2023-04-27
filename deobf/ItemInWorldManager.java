/*
 * Decompiled with CFR 0.152.
 */
package deobf;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.EntityPlayerInvoker;
import cc.novoline.invoke.ServerInvoker;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packts.S23PacketBlockChange;
import net.minecraft.network.packts.S38PacketPlayerListItem;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.IBlockState;
import net.LC;
import net.Material;
import net.World;
import net.WorldServer;
import net.a6O;
import net.a6w_0;
import net.aHP;
import net.aV8;
import net.act_2;
import net.aek_1;
import net.ar3_0;
import net.aux__1;
import net.fs_1;
import net.minecraft.world.GameType;
import net.qv_0;
import net.rs_1;
import net.vz_1;

public class ItemInWorldManager {
    private boolean k;
    private int f;
    private BlockPos b;
    private int g;
    private int i = -1;
    private int d;
    public EntityPlayerMP e;
    public World a;
    private boolean h;
    private BlockPos c;
    private GameType j = GameType.NOT_SET;

    public boolean a() {
        return this.j.c();
    }

    public void c() {
        this.k = false;
        aV8.b(this.a, EntityPlayerInvoker.B(this.e), this.b, -1);
    }

    public void a(BlockPos blockPos, EnumFacing enumFacing) {
        if (this.a()) {
            if (!aV8.a(this.a, null, blockPos, enumFacing)) {
                this.c(blockPos);
            }
        } else {
            Block block = BlockStateInvoker.getBlock(aV8.q(this.a, blockPos));
            if (ar3_0.c(this.j)) {
                if (this.j == GameType.SPECTATOR) {
                    return;
                }
                if (!EntityPlayerInvoker.G(this.e)) {
                    ItemStack itemStack = EntityPlayerInvoker.H(this.e);
                    return;
                }
            }
            aV8.a(this.a, null, blockPos, enumFacing);
            this.d = this.g;
            float f = 1.0f;
            if (BlocksInvoker.getBlockState(block) != Material.air) {
                BlocksInvoker.a(block, this.a, blockPos, this.e);
                f = BlocksInvoker.a(block, this.e, this.e.worldObj, blockPos);
            }
            if (BlocksInvoker.getBlockState(block) != Material.air) {
                float f2 = f - 1.0f;
                int cfr_ignored_1 = f2 == 0.0f ? 0 : (f2 > 0.0f ? 1 : -1);
                this.c(blockPos);
            } else {
                this.k = true;
                this.b = blockPos;
                int n = (int)(f * 10.0f);
                aV8.b(this.a, EntityPlayerInvoker.B(this.e), blockPos, n);
                this.i = n;
            }
        }
    }

    public boolean a(EntityPlayer entityPlayer, World world, ItemStack itemStack) {
        if (this.j == GameType.SPECTATOR) {
            return false;
        }
        int n = itemStack.a;
        int n2 = act_2.c(itemStack);
        ItemStack itemStack2 = act_2.a(itemStack, world, entityPlayer);
        if (itemStack2 != itemStack || itemStack2.a != n || act_2.A(itemStack2) > 0 || act_2.c(itemStack2) != n2) {
            entityPlayer.inventory.b[entityPlayer.inventory.a] = itemStack2;
            if (this.a()) {
                itemStack2.a = n;
                if (act_2.y(itemStack2)) {
                    act_2.a(itemStack2, n2);
                }
            }
            if (itemStack2.a == 0) {
                entityPlayer.inventory.b[entityPlayer.inventory.a] = null;
            }
            if (!a6w_0.p(entityPlayer)) {
                EntityPlayerInvoker.a((EntityPlayerMP)entityPlayer, entityPlayer.bp);
            }
            return true;
        }
        return false;
    }

    public void b(BlockPos blockPos) {
        if (blockPos.equals(this.b)) {
            int n = this.g - this.d;
            Block block = BlockStateInvoker.getBlock(aV8.q(this.a, blockPos));
            if (BlocksInvoker.getBlockState(block) != Material.air) {
                float f = BlocksInvoker.a(block, this.e, this.e.worldObj, blockPos) * (float)(n + 1);
                if (f >= 0.7f) {
                    this.k = false;
                    aV8.b(this.a, EntityPlayerInvoker.B(this.e), blockPos, -1);
                    this.c(blockPos);
                } else if (!this.h) {
                    this.k = false;
                    this.h = true;
                    this.c = blockPos;
                    this.f = this.d;
                }
            }
        }
    }

    private boolean a(BlockPos blockPos) {
        IBlockState iBlockState = aV8.q(this.a, blockPos);
        BlocksInvoker.a(BlockStateInvoker.getBlock(iBlockState), this.a, blockPos, iBlockState, this.e);
        boolean bl = aV8.j(this.a, blockPos);
        BlocksInvoker.c(BlockStateInvoker.getBlock(iBlockState), this.a, blockPos, iBlockState);
        return bl;
    }

    public void a(GameType gameType) {
        if (this.j == GameType.NOT_SET) {
            this.j = gameType;
        }
        this.b(this.j);
    }

    public GameType b() {
        return this.j;
    }

    public boolean d() {
        return ar3_0.d(this.j);
    }

    public void b(GameType gameType) {
        this.j = gameType;
        ar3_0.a(gameType, this.e.abilities);
        EntityPlayerInvoker.w(this.e);
        aek_1.a(ServerInvoker.R(this.e.b7), new S38PacketPlayerListItem(aux__1.UPDATE_GAME_MODE, this.e));
    }

    public boolean c(BlockPos blockPos) {
        if (this.j.c() && EntityPlayerInvoker.i(this.e) != null && act_2.k(EntityPlayerInvoker.i(this.e)) instanceof LC) {
            return false;
        }
        IBlockState iBlockState = aV8.q(this.a, blockPos);
        TileEntity tileEntity = aV8.z(this.a, blockPos);
        if (ar3_0.c(this.j)) {
            if (this.j == GameType.SPECTATOR) {
                return false;
            }
            if (!EntityPlayerInvoker.G(this.e)) {
                ItemStack itemStack = EntityPlayerInvoker.H(this.e);
                return false;
            }
        }
        aV8.a(this.a, (EntityPlayer)this.e, 2001, blockPos, BlocksInvoker.a(iBlockState));
        boolean bl = this.a(blockPos);
        if (this.a()) {
            qv_0.a(this.e.playerNetServerHandler, new S23PacketBlockChange(this.a, blockPos));
        } else {
            ItemStack itemStack = EntityPlayerInvoker.H(this.e);
            EntityPlayerInvoker.a(this.e, BlockStateInvoker.getBlock(iBlockState));
            act_2.a(itemStack, this.a, BlockStateInvoker.getBlock(iBlockState), blockPos, this.e);
            if (itemStack.a == 0) {
                EntityPlayerInvoker.u(this.e);
            }
            BlocksInvoker.a(BlockStateInvoker.getBlock(iBlockState), this.a, this.e, blockPos, iBlockState, tileEntity);
        }
        return bl;
    }

    public void e() {
        ++this.g;
        if (this.h) {
            int n = this.g - this.f;
            Block block = BlockStateInvoker.getBlock(aV8.q(this.a, this.c));
            if (BlocksInvoker.getBlockState(block) == Material.air) {
                this.h = false;
            } else {
                float f = BlocksInvoker.a(block, this.e, this.e.worldObj, this.c) * (float)(n + 1);
                int n2 = (int)(f * 10.0f);
                if (n2 != this.i) {
                    aV8.b(this.a, EntityPlayerInvoker.B(this.e), this.c, n2);
                    this.i = n2;
                }
                if (f >= 1.0f) {
                    this.h = false;
                    this.c(this.c);
                }
            }
        } else if (this.k) {
            Block block = BlockStateInvoker.getBlock(aV8.q(this.a, this.b));
            if (BlocksInvoker.getBlockState(block) == Material.air) {
                aV8.b(this.a, EntityPlayerInvoker.B(this.e), this.b, -1);
                this.i = -1;
                this.k = false;
            } else {
                int n = this.g - this.d;
                float f = BlocksInvoker.a(block, this.e, this.e.worldObj, this.c) * (float)(n + 1);
                int n3 = (int)(f * 10.0f);
                if (n3 != this.i) {
                    aV8.b(this.a, EntityPlayerInvoker.B(this.e), this.b, n3);
                    this.i = n3;
                }
            }
        }
    }

    public ItemInWorldManager(World world) {
        this.b = BlockPos.m;
        this.c = BlockPos.m;
        this.a = world;
    }

    public void a(WorldServer worldServer) {
        this.a = worldServer;
    }

    public boolean a(EntityPlayer entityPlayer, World world, ItemStack itemStack, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3) {
        IBlockState iBlockState;
        if (this.j == GameType.SPECTATOR) {
            TileEntity tileEntity = aV8.z(world, blockPos);
            if (tileEntity instanceof aHP) {
                Block block = BlockStateInvoker.getBlock(aV8.q(world, blockPos));
                aHP aHP2 = (aHP)((Object)tileEntity);
                if (aHP2 instanceof a6O && block instanceof fs_1) {
                    aHP2 = vz_1.a((fs_1)block, world, blockPos);
                }
                a6w_0.a(entityPlayer, aHP2);
                return true;
            }
            if (tileEntity instanceof rs_1) {
                a6w_0.a(entityPlayer, (rs_1)((Object)tileEntity));
                return true;
            }
            return false;
        }
        return (!a6w_0.N(entityPlayer) || a6w_0.d(entityPlayer) == null) && BlocksInvoker.a(BlockStateInvoker.getBlock(iBlockState = aV8.q(world, blockPos)), world, blockPos, iBlockState, entityPlayer, enumFacing, f, f2, f3);
    }
}

