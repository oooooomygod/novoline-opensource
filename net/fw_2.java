/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.InventoryInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityPlayer;
import deobf.IBlockAccess;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import deobf.TileEntity;
import java.util.Random;

/*
 * Renamed from net.fw
 */
public class fw_2
extends ft_2 {
    public static js_0 P = a7X.a(Ew.c, 0, 15);
    public static JC<atY> Q = xu_0.a(Ew.b, atY.class);

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        if (!aV8.a((IBlockAccess)world, amv_2.g(blockPos))) {
            this.a(world, blockPos, iBlockState, 0);
            aV8.j(world, blockPos);
        }
    }

    @Override
    public Item d(World world, BlockPos blockPos) {
        a6A a6A2 = this.a(world, blockPos);
        return aBL.c(a6A2) != null ? aBL.c(a6A2) : Items.flower_pot;
    }

    @Override
    public IBlockState a(IBlockState iBlockState, IBlockAccess iBlockAccess, BlockPos blockPos) {
        a6A a6A2;
        Item item;
        atY atY2 = atY.EMPTY;
        TileEntity tileEntity = aG3.a(iBlockAccess, blockPos);
        if (tileEntity instanceof a6A && (item = aBL.c(a6A2 = (a6A)tileEntity)) instanceof ItemBlock) {
            int n = aBL.a(a6A2);
            Block block = Block.a(item);
            if (block == Blocks.sapling) {
                switch (aER.a(n)) {
                    case OAK: {
                        atY2 = atY.OAK_SAPLING;
                        break;
                    }
                    case SPRUCE: {
                        atY2 = atY.SPRUCE_SAPLING;
                        break;
                    }
                    case BIRCH: {
                        atY2 = atY.BIRCH_SAPLING;
                        break;
                    }
                    case JUNGLE: {
                        atY2 = atY.JUNGLE_SAPLING;
                        break;
                    }
                    case ACACIA: {
                        atY2 = atY.ACACIA_SAPLING;
                        break;
                    }
                    case DARK_OAK: {
                        atY2 = atY.DARK_OAK_SAPLING;
                        break;
                    }
                    default: {
                        atY2 = atY.EMPTY;
                        break;
                    }
                }
            } else if (block == Blocks.bN) {
                switch (n) {
                    case 0: {
                        atY2 = atY.DEAD_BUSH;
                        break;
                    }
                    case 2: {
                        atY2 = atY.FERN;
                        break;
                    }
                    default: {
                        atY2 = atY.EMPTY;
                        break;
                    }
                }
            } else if (block == Blocks.G) {
                atY2 = atY.DANDELION;
            } else if (block == Blocks.bY) {
                switch (akg_0.b[aj4.a(atA.RED, n).ordinal()]) {
                    case 1: {
                        atY2 = atY.POPPY;
                        break;
                    }
                    case 2: {
                        atY2 = atY.BLUE_ORCHID;
                        break;
                    }
                    case 3: {
                        atY2 = atY.ALLIUM;
                        break;
                    }
                    case 4: {
                        atY2 = atY.HOUSTONIA;
                        break;
                    }
                    case 5: {
                        atY2 = atY.RED_TULIP;
                        break;
                    }
                    case 6: {
                        atY2 = atY.ORANGE_TULIP;
                        break;
                    }
                    case 7: {
                        atY2 = atY.WHITE_TULIP;
                        break;
                    }
                    case 8: {
                        atY2 = atY.PINK_TULIP;
                        break;
                    }
                    case 9: {
                        atY2 = atY.OXEYE_DAISY;
                        break;
                    }
                    default: {
                        atY2 = atY.EMPTY;
                        break;
                    }
                }
            } else if (block == Blocks.bn) {
                atY2 = atY.MUSHROOM_RED;
            } else if (block == Blocks.A) {
                atY2 = atY.MUSHROOM_BROWN;
            } else if (block == Blocks.ca) {
                atY2 = atY.DEAD_BUSH;
            } else if (block == Blocks.a9) {
                atY2 = atY.CACTUS;
            }
        }
        return BlockStateInvoker.a(iBlockState, Q, (Comparable)((Object)atY2));
    }

    @Override
    public int a(IBlockAccess iBlockAccess, BlockPos blockPos, int n) {
        Item item;
        TileEntity tileEntity = aG3.a(iBlockAccess, blockPos);
        if (tileEntity instanceof a6A && (item = aBL.c((a6A)tileEntity)) instanceof ItemBlock) {
            return Block.a(item).a(iBlockAccess, blockPos, n);
        }
        return 0xFFFFFF;
    }

    @Override
    protected a42 s() {
        return new a42(this, Q, P);
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return Items.flower_pot;
    }

    @Override
    public a5w_0 K() {
        return a5w_0.CUTOUT;
    }

    @Override
    public int g(World world, BlockPos blockPos) {
        a6A a6A2 = this.a(world, blockPos);
        return aBL.c(a6A2) != null ? aBL.a(a6A2) : 0;
    }

    @Override
    public int d(IBlockState iBlockState) {
        return P8.b((Integer)BlockStateInvoker.b(iBlockState, P));
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public int q() {
        return 3;
    }

    public fw_2() {
        super(Material.I);
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), Q, (Comparable)((Object)atY.EMPTY)), P, P8.d(0)));
        this.o();
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer) {
        super.a(world, blockPos, iBlockState, entityPlayer);
        if (aSY.a(entityPlayer.abilities)) {
            a6A a6A2 = this.a(world, blockPos);
            aBL.a(a6A2, null, 0);
        }
    }

    private boolean a(Block block, int n) {
        return block == Blocks.G || block == Blocks.bY || block == Blocks.a9 || block == Blocks.A || block == Blocks.bn || block == Blocks.sapling || block == Blocks.ca || block == Blocks.bN && n == aW5.a(a4b.FERN);
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        ItemStack itemStack = InventoryInvoker.g(entityPlayer.inventory);
        if (act_2.k(itemStack) instanceof ItemBlock) {
            this.a(world, blockPos);
            return false;
        }
        return false;
    }

    private a6A a(World world, BlockPos blockPos) {
        TileEntity tileEntity = aV8.z(world, blockPos);
        return tileEntity instanceof a6A ? (a6A)tileEntity : null;
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public TileEntity a(World world, int n) {
        Block block = null;
        int n2 = 0;
        switch (n) {
            case 1: {
                block = Blocks.bY;
                n2 = aj4.a(dq_1.POPPY);
                break;
            }
            case 2: {
                block = Blocks.G;
                break;
            }
            case 3: {
                block = Blocks.sapling;
                n2 = aER.b(F3.OAK);
                break;
            }
            case 4: {
                block = Blocks.sapling;
                n2 = aER.b(F3.SPRUCE);
                break;
            }
            case 5: {
                block = Blocks.sapling;
                n2 = aER.b(F3.BIRCH);
                break;
            }
            case 6: {
                block = Blocks.sapling;
                n2 = aER.b(F3.JUNGLE);
                break;
            }
            case 7: {
                block = Blocks.bn;
                break;
            }
            case 8: {
                block = Blocks.A;
                break;
            }
            case 9: {
                block = Blocks.a9;
                break;
            }
            case 10: {
                block = Blocks.ca;
                break;
            }
            case 11: {
                block = Blocks.bN;
                n2 = aW5.a(a4b.FERN);
                break;
            }
            case 12: {
                block = Blocks.sapling;
                n2 = aER.b(F3.ACACIA);
                break;
            }
            case 13: {
                block = Blocks.sapling;
                n2 = aER.b(F3.DARK_OAK);
            }
        }
        return new a6A(px_0.a(block), n2);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState) {
        a6A a6A2 = this.a(world, blockPos);
        if (aBL.c(a6A2) != null) {
            fw_2.a(world, blockPos, new ItemStack(aBL.c(a6A2), 1, aBL.a(a6A2)));
        }
        super.a(world, blockPos, iBlockState);
    }

    @Override
    public void o() {
        this.a(0.3125f, 0.0f, 0.3125f, 0.6875f, 0.375f, 0.6875f);
    }

    @Override
    public String C() {
        return ahq_0.b(Ew.a);
    }

    @Override
    public boolean e(World world, BlockPos blockPos) {
        return super.e(world, blockPos) && aV8.a((IBlockAccess)world, amv_2.g(blockPos));
    }
}

