/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.IBlockAccess;
import net.minecraft.util.MovingObjectPosition;
import deobf.Vec3;
import java.util.List;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.hn
 */
public class hn_2
extends Block {
    private Block T;
    private static int[][] Q;
    private boolean W;
    private int V;
    public static JC<sv_1> P;
    public static JC<JA> U;
    private IBlockState S;
    public static jw_0 R;

    static {
        R = au_2.a(azr_1.c, cs_1.HORIZONTAL);
        U = xu_0.a(azr_1.a, JA.class);
        P = xu_0.a(azr_1.b, sv_1.class);
        Q = new int[][]{{4, 5}, {5, 7}, {6, 7}, {4, 6}, {0, 1}, {1, 3}, {2, 3}, {0, 2}};
    }

    @Override
    public boolean a(IBlockState iBlockState, boolean bl) {
        return this.T.a(iBlockState, bl);
    }

    public boolean d(IBlockAccess iBlockAccess, BlockPos blockPos) {
        IBlockState iBlockState;
        Block block;
        IBlockState iBlockState2 = aG3.c(iBlockAccess, blockPos);
        EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState2, R));
        JA jA = (JA)((Object)BlockStateInvoker.b(iBlockState2, U));
        boolean bl = jA == JA.TOP;
        float f = 0.5f;
        float f2 = 1.0f;
        f = 0.0f;
        f2 = 0.5f;
        float f3 = 0.0f;
        float f4 = 1.0f;
        float f5 = 0.0f;
        float f6 = 0.5f;
        boolean bl2 = true;
        if (enumFacing == EnumFacing.EAST) {
            f3 = 0.5f;
            f6 = 1.0f;
            IBlockState iBlockState3 = aG3.c(iBlockAccess, amv_2.f(blockPos));
            Block block2 = BlockStateInvoker.getBlock(iBlockState3);
            if (hn_2.a(block2) && jA == BlockStateInvoker.b(iBlockState3, U)) {
                EnumFacing enumFacing2 = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState3, R));
                if (enumFacing2 == EnumFacing.NORTH && !hn_2.a(iBlockAccess, amv_2.b(blockPos), iBlockState2)) {
                    f6 = 0.5f;
                    bl2 = false;
                } else if (enumFacing2 == EnumFacing.SOUTH && !hn_2.a(iBlockAccess, amv_2.a(blockPos), iBlockState2)) {
                    f5 = 0.5f;
                    bl2 = false;
                }
            }
        } else if (enumFacing == EnumFacing.WEST) {
            f4 = 0.5f;
            f6 = 1.0f;
            IBlockState iBlockState4 = aG3.c(iBlockAccess, amv_2.d(blockPos));
            Block block3 = BlockStateInvoker.getBlock(iBlockState4);
            if (hn_2.a(block3) && jA == BlockStateInvoker.b(iBlockState4, U)) {
                EnumFacing enumFacing3 = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState4, R));
                if (enumFacing3 == EnumFacing.NORTH && !hn_2.a(iBlockAccess, amv_2.b(blockPos), iBlockState2)) {
                    f6 = 0.5f;
                    bl2 = false;
                } else if (enumFacing3 == EnumFacing.SOUTH && !hn_2.a(iBlockAccess, amv_2.a(blockPos), iBlockState2)) {
                    f5 = 0.5f;
                    bl2 = false;
                }
            }
        } else if (enumFacing == EnumFacing.SOUTH) {
            f5 = 0.5f;
            f6 = 1.0f;
            IBlockState iBlockState5 = aG3.c(iBlockAccess, amv_2.b(blockPos));
            Block block4 = BlockStateInvoker.getBlock(iBlockState5);
            if (hn_2.a(block4) && jA == BlockStateInvoker.b(iBlockState5, U)) {
                EnumFacing enumFacing4 = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState5, R));
                if (enumFacing4 == EnumFacing.WEST && !hn_2.a(iBlockAccess, amv_2.f(blockPos), iBlockState2)) {
                    f4 = 0.5f;
                    bl2 = false;
                } else if (enumFacing4 == EnumFacing.EAST && !hn_2.a(iBlockAccess, amv_2.d(blockPos), iBlockState2)) {
                    f3 = 0.5f;
                    bl2 = false;
                }
            }
        } else if (enumFacing == EnumFacing.NORTH && hn_2.a(block = BlockStateInvoker.getBlock(iBlockState = aG3.c(iBlockAccess, amv_2.a(blockPos)))) && jA == BlockStateInvoker.b(iBlockState, U)) {
            EnumFacing enumFacing5 = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, R));
            if (enumFacing5 == EnumFacing.WEST && !hn_2.a(iBlockAccess, amv_2.f(blockPos), iBlockState2)) {
                f4 = 0.5f;
                bl2 = false;
            } else if (enumFacing5 == EnumFacing.EAST && !hn_2.a(iBlockAccess, amv_2.d(blockPos), iBlockState2)) {
                f3 = 0.5f;
                bl2 = false;
            }
        }
        this.a(f3, f, f5, f4, f2, f6);
        return bl2;
    }

    public void b(IBlockAccess iBlockAccess, BlockPos blockPos) {
        if (BlockStateInvoker.b(aG3.c(iBlockAccess, blockPos), U) == JA.TOP) {
            this.a(0.0f, 0.5f, 0.0f, 1.0f, 1.0f, 1.0f);
        } else {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        }
    }

    @Override
    public void c(World world, BlockPos blockPos, IBlockState iBlockState) {
        this.a(world, blockPos, this.S, Blocks.air);
        this.T.c(world, blockPos, this.S);
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        return this.T.a(world, blockPos, this.S, entityPlayer, EnumFacing.DOWN, 0.0f, 0.0f, 0.0f);
    }

    @Override
    public void d(World world, BlockPos blockPos, IBlockState iBlockState) {
        this.T.d(world, blockPos, iBlockState);
    }

    @Override
    public boolean e(World world, BlockPos blockPos) {
        return this.T.e(world, blockPos);
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public IBlockState a(IBlockState iBlockState, IBlockAccess iBlockAccess, BlockPos blockPos) {
        if (this.d(iBlockAccess, blockPos)) {
            switch (this.a(iBlockAccess, blockPos)) {
                case 0: {
                    iBlockState = BlockStateInvoker.a(iBlockState, P, (Comparable)((Object)sv_1.STRAIGHT));
                    break;
                }
                case 1: {
                    iBlockState = BlockStateInvoker.a(iBlockState, P, (Comparable)((Object)sv_1.INNER_RIGHT));
                    break;
                }
                case 2: {
                    iBlockState = BlockStateInvoker.a(iBlockState, P, (Comparable)((Object)sv_1.INNER_LEFT));
                }
            }
        } else {
            switch (this.c(iBlockAccess, blockPos)) {
                case 0: {
                    iBlockState = BlockStateInvoker.a(iBlockState, P, (Comparable)((Object)sv_1.STRAIGHT));
                    break;
                }
                case 1: {
                    iBlockState = BlockStateInvoker.a(iBlockState, P, (Comparable)((Object)sv_1.OUTER_RIGHT));
                    break;
                }
                case 2: {
                    iBlockState = BlockStateInvoker.a(iBlockState, P, (Comparable)((Object)sv_1.OUTER_LEFT));
                }
            }
        }
        return iBlockState;
    }

    public int a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        IBlockState iBlockState;
        Block block;
        IBlockState iBlockState2 = aG3.c(iBlockAccess, blockPos);
        EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState2, R));
        JA jA = (JA)((Object)BlockStateInvoker.b(iBlockState2, U));
        boolean bl = jA == JA.TOP;
        if (enumFacing == EnumFacing.EAST) {
            IBlockState iBlockState3 = aG3.c(iBlockAccess, amv_2.d(blockPos));
            Block block2 = BlockStateInvoker.getBlock(iBlockState3);
            if (hn_2.a(block2) && jA == BlockStateInvoker.b(iBlockState3, U)) {
                EnumFacing enumFacing2 = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState3, R));
                if (enumFacing2 == EnumFacing.NORTH && !hn_2.a(iBlockAccess, amv_2.a(blockPos), iBlockState2)) {
                    return 1;
                }
                if (enumFacing2 == EnumFacing.SOUTH && !hn_2.a(iBlockAccess, amv_2.b(blockPos), iBlockState2)) {
                    return 2;
                }
            }
        } else if (enumFacing == EnumFacing.WEST) {
            IBlockState iBlockState4 = aG3.c(iBlockAccess, amv_2.f(blockPos));
            Block block3 = BlockStateInvoker.getBlock(iBlockState4);
            if (hn_2.a(block3) && jA == BlockStateInvoker.b(iBlockState4, U)) {
                EnumFacing enumFacing3 = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState4, R));
                if (enumFacing3 == EnumFacing.NORTH && !hn_2.a(iBlockAccess, amv_2.a(blockPos), iBlockState2)) {
                    return 2;
                }
                if (enumFacing3 == EnumFacing.SOUTH && !hn_2.a(iBlockAccess, amv_2.b(blockPos), iBlockState2)) {
                    return 1;
                }
            }
        } else if (enumFacing == EnumFacing.SOUTH) {
            IBlockState iBlockState5 = aG3.c(iBlockAccess, amv_2.a(blockPos));
            Block block4 = BlockStateInvoker.getBlock(iBlockState5);
            if (hn_2.a(block4) && jA == BlockStateInvoker.b(iBlockState5, U)) {
                EnumFacing enumFacing4 = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState5, R));
                if (enumFacing4 == EnumFacing.WEST && !hn_2.a(iBlockAccess, amv_2.d(blockPos), iBlockState2)) {
                    return 2;
                }
                if (enumFacing4 == EnumFacing.EAST && !hn_2.a(iBlockAccess, amv_2.f(blockPos), iBlockState2)) {
                    return 1;
                }
            }
        } else if (enumFacing == EnumFacing.NORTH && hn_2.a(block = BlockStateInvoker.getBlock(iBlockState = aG3.c(iBlockAccess, amv_2.b(blockPos)))) && jA == BlockStateInvoker.b(iBlockState, U)) {
            EnumFacing enumFacing5 = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, R));
            if (enumFacing5 == EnumFacing.WEST && !hn_2.a(iBlockAccess, amv_2.d(blockPos), iBlockState2)) {
                return 1;
            }
            if (enumFacing5 == EnumFacing.EAST && !hn_2.a(iBlockAccess, amv_2.f(blockPos), iBlockState2)) {
                return 2;
            }
        }
        return 0;
    }

    @Override
    public IBlockState a(World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, int n, EntityLivingBase entityLivingBase) {
        IBlockState iBlockState = super.a(world, blockPos, enumFacing, f, f2, f3, n, entityLivingBase);
        iBlockState = BlockStateInvoker.a(BlockStateInvoker.a(iBlockState, R, (Comparable)((Object)atn_0.D(entityLivingBase))), P, (Comparable)((Object)sv_1.STRAIGHT));
        return enumFacing != EnumFacing.DOWN && (enumFacing == EnumFacing.UP || (double)f2 <= 0.5) ? BlockStateInvoker.a(iBlockState, U, (Comparable)((Object)JA.BOTTOM)) : BlockStateInvoker.a(iBlockState, U, (Comparable)((Object)JA.TOP));
    }

    @Override
    public int a(World world) {
        return this.T.a(world);
    }

    protected hn_2(IBlockState iBlockState) {
        super(BlockStateInvoker.getBlock((IBlockState)iBlockState).o);
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), R, (Comparable)((Object)EnumFacing.NORTH)), U, (Comparable)((Object)JA.BOTTOM)), P, (Comparable)((Object)sv_1.STRAIGHT)));
        this.T = BlockStateInvoker.getBlock(iBlockState);
        this.S = iBlockState;
        this.setHardness(this.T.K);
        this.a(this.T.s / 3.0f);
        this.a(this.T.l);
        this.a(255);
        this.a(CreativeTabs.m);
    }

    @Override
    public a5w_0 K() {
        return this.T.K();
    }

    public static boolean a(Block block) {
        return block instanceof hn_2;
    }

    @Override
    public rm_2 f(World world, BlockPos blockPos) {
        return this.T.f(world, blockPos);
    }

    @Override
    public void a(World world, BlockPos blockPos, EntityPlayer entityPlayer) {
        this.T.a(world, blockPos, entityPlayer);
    }

    public boolean e(IBlockAccess iBlockAccess, BlockPos blockPos) {
        IBlockState iBlockState;
        Block block;
        IBlockState iBlockState2 = aG3.c(iBlockAccess, blockPos);
        EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState2, R));
        JA jA = (JA)((Object)BlockStateInvoker.b(iBlockState2, U));
        boolean bl = jA == JA.TOP;
        float f = 0.5f;
        float f2 = 1.0f;
        f = 0.0f;
        f2 = 0.5f;
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = 0.5f;
        float f6 = 1.0f;
        boolean bl2 = false;
        if (enumFacing == EnumFacing.EAST) {
            IBlockState iBlockState3 = aG3.c(iBlockAccess, amv_2.d(blockPos));
            Block block2 = BlockStateInvoker.getBlock(iBlockState3);
            if (hn_2.a(block2) && jA == BlockStateInvoker.b(iBlockState3, U)) {
                EnumFacing enumFacing2 = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState3, R));
                if (enumFacing2 == EnumFacing.NORTH && !hn_2.a(iBlockAccess, amv_2.a(blockPos), iBlockState2)) {
                    f5 = 0.0f;
                    f6 = 0.5f;
                    bl2 = true;
                } else if (enumFacing2 == EnumFacing.SOUTH && !hn_2.a(iBlockAccess, amv_2.b(blockPos), iBlockState2)) {
                    f5 = 0.5f;
                    f6 = 1.0f;
                    bl2 = true;
                }
            }
        } else if (enumFacing == EnumFacing.WEST) {
            IBlockState iBlockState4 = aG3.c(iBlockAccess, amv_2.f(blockPos));
            Block block3 = BlockStateInvoker.getBlock(iBlockState4);
            if (hn_2.a(block3) && jA == BlockStateInvoker.b(iBlockState4, U)) {
                f3 = 0.5f;
                f4 = 1.0f;
                EnumFacing enumFacing3 = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState4, R));
                if (enumFacing3 == EnumFacing.NORTH && !hn_2.a(iBlockAccess, amv_2.a(blockPos), iBlockState2)) {
                    f5 = 0.0f;
                    f6 = 0.5f;
                    bl2 = true;
                } else if (enumFacing3 == EnumFacing.SOUTH && !hn_2.a(iBlockAccess, amv_2.b(blockPos), iBlockState2)) {
                    f5 = 0.5f;
                    f6 = 1.0f;
                    bl2 = true;
                }
            }
        } else if (enumFacing == EnumFacing.SOUTH) {
            IBlockState iBlockState5 = aG3.c(iBlockAccess, amv_2.a(blockPos));
            Block block4 = BlockStateInvoker.getBlock(iBlockState5);
            if (hn_2.a(block4) && jA == BlockStateInvoker.b(iBlockState5, U)) {
                f5 = 0.0f;
                f6 = 0.5f;
                EnumFacing enumFacing4 = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState5, R));
                if (enumFacing4 == EnumFacing.WEST && !hn_2.a(iBlockAccess, amv_2.d(blockPos), iBlockState2)) {
                    bl2 = true;
                } else if (enumFacing4 == EnumFacing.EAST && !hn_2.a(iBlockAccess, amv_2.f(blockPos), iBlockState2)) {
                    f3 = 0.5f;
                    f4 = 1.0f;
                    bl2 = true;
                }
            }
        } else if (enumFacing == EnumFacing.NORTH && hn_2.a(block = BlockStateInvoker.getBlock(iBlockState = aG3.c(iBlockAccess, amv_2.b(blockPos)))) && jA == BlockStateInvoker.b(iBlockState, U)) {
            EnumFacing enumFacing5 = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, R));
            if (enumFacing5 == EnumFacing.WEST && !hn_2.a(iBlockAccess, amv_2.d(blockPos), iBlockState2)) {
                bl2 = true;
            } else if (enumFacing5 == EnumFacing.EAST && !hn_2.a(iBlockAccess, amv_2.f(blockPos), iBlockState2)) {
                f3 = 0.5f;
                f4 = 1.0f;
                bl2 = true;
            }
        }
        this.a(f3, f, f5, f4, f2, f6);
        return bl2;
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        if (this.W) {
            this.a(0.5f * (float)(this.V % 2), 0.5f * (float)(this.V / 4 % 2), 0.5f * (float)(this.V / 2 % 2), 0.5f + 0.5f * (float)(this.V % 2), 0.5f + 0.5f * (float)(this.V / 4 % 2), 0.5f + 0.5f * (float)(this.V / 2 % 2));
        } else {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        }
    }

    public int c(IBlockAccess iBlockAccess, BlockPos blockPos) {
        IBlockState iBlockState;
        Block block;
        IBlockState iBlockState2 = aG3.c(iBlockAccess, blockPos);
        EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState2, R));
        JA jA = (JA)((Object)BlockStateInvoker.b(iBlockState2, U));
        boolean bl = jA == JA.TOP;
        if (enumFacing == EnumFacing.EAST) {
            IBlockState iBlockState3 = aG3.c(iBlockAccess, amv_2.f(blockPos));
            Block block2 = BlockStateInvoker.getBlock(iBlockState3);
            if (hn_2.a(block2) && jA == BlockStateInvoker.b(iBlockState3, U)) {
                EnumFacing enumFacing2 = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState3, R));
                if (enumFacing2 == EnumFacing.NORTH && !hn_2.a(iBlockAccess, amv_2.b(blockPos), iBlockState2)) {
                    return 1;
                }
                if (enumFacing2 == EnumFacing.SOUTH && !hn_2.a(iBlockAccess, amv_2.a(blockPos), iBlockState2)) {
                    return 2;
                }
            }
        } else if (enumFacing == EnumFacing.WEST) {
            IBlockState iBlockState4 = aG3.c(iBlockAccess, amv_2.d(blockPos));
            Block block3 = BlockStateInvoker.getBlock(iBlockState4);
            if (hn_2.a(block3) && jA == BlockStateInvoker.b(iBlockState4, U)) {
                EnumFacing enumFacing3 = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState4, R));
                if (enumFacing3 == EnumFacing.NORTH && !hn_2.a(iBlockAccess, amv_2.b(blockPos), iBlockState2)) {
                    return 2;
                }
                if (enumFacing3 == EnumFacing.SOUTH && !hn_2.a(iBlockAccess, amv_2.a(blockPos), iBlockState2)) {
                    return 1;
                }
            }
        } else if (enumFacing == EnumFacing.SOUTH) {
            IBlockState iBlockState5 = aG3.c(iBlockAccess, amv_2.b(blockPos));
            Block block4 = BlockStateInvoker.getBlock(iBlockState5);
            if (hn_2.a(block4) && jA == BlockStateInvoker.b(iBlockState5, U)) {
                EnumFacing enumFacing4 = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState5, R));
                if (enumFacing4 == EnumFacing.WEST && !hn_2.a(iBlockAccess, amv_2.f(blockPos), iBlockState2)) {
                    return 2;
                }
                if (enumFacing4 == EnumFacing.EAST && !hn_2.a(iBlockAccess, amv_2.d(blockPos), iBlockState2)) {
                    return 1;
                }
            }
        } else if (enumFacing == EnumFacing.NORTH && hn_2.a(block = BlockStateInvoker.getBlock(iBlockState = aG3.c(iBlockAccess, amv_2.a(blockPos)))) && jA == BlockStateInvoker.b(iBlockState, U)) {
            EnumFacing enumFacing5 = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, R));
            if (enumFacing5 == EnumFacing.WEST && !hn_2.a(iBlockAccess, amv_2.f(blockPos), iBlockState2)) {
                return 1;
            }
            if (enumFacing5 == EnumFacing.EAST && !hn_2.a(iBlockAccess, amv_2.d(blockPos), iBlockState2)) {
                return 2;
            }
        }
        return 0;
    }

    @Override
    public IBlockState c(int n) {
        IBlockState iBlockState = BlockStateInvoker.a(this.m(), U, (Comparable)((Object)((n & 4) > 0 ? JA.TOP : JA.BOTTOM)));
        iBlockState = BlockStateInvoker.a(iBlockState, R, (Comparable)((Object)SJ.a(5 - (n & 3))));
        return iBlockState;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, rm_2 rm_22, List<rm_2> list, Entity entity) {
        this.b((IBlockAccess)world, blockPos);
        super.a(world, blockPos, iBlockState, rm_22, list, entity);
        this.d((IBlockAccess)world, blockPos);
        super.a(world, blockPos, iBlockState, rm_22, list, entity);
        if (this.e((IBlockAccess)world, blockPos)) {
            super.a(world, blockPos, iBlockState, rm_22, list, entity);
        }
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public void b(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        this.T.b(world, blockPos, iBlockState, random);
    }

    @Override
    public void a(World world, BlockPos blockPos, Entity entity) {
        this.T.a(world, blockPos, entity);
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        if (BlockStateInvoker.b(iBlockState, U) == JA.TOP) {
            n |= 4;
        }
        return n |= 5 - SJ.i((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, R)));
    }

    @Override
    public Vec3 a(World world, BlockPos blockPos, Entity entity, Vec3 vec3) {
        return this.T.a(world, blockPos, entity, vec3);
    }

    @Override
    protected a42 s() {
        return new a42(this, R, U, P);
    }

    @Override
    public int b(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return this.T.b(iBlockAccess, blockPos);
    }

    @Override
    public float a(Entity entity) {
        return this.T.a(entity);
    }

    public static boolean a(IBlockAccess iBlockAccess, BlockPos blockPos, IBlockState iBlockState) {
        IBlockState iBlockState2 = aG3.c(iBlockAccess, blockPos);
        Block block = BlockStateInvoker.getBlock(iBlockState2);
        return hn_2.a(block) && BlockStateInvoker.b(iBlockState2, U) == BlockStateInvoker.b(iBlockState, U) && BlockStateInvoker.b(iBlockState2, R) == BlockStateInvoker.b(iBlockState, R);
    }

    @Override
    public MovingObjectPosition a(World world, BlockPos blockPos, Vec3 vec3, Vec3 vec32) {
        MovingObjectPosition[] movingObjectPositionArray = new MovingObjectPosition[8];
        IBlockState iBlockState = aV8.q(world, blockPos);
        int n = SJ.j((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, R)));
        boolean bl = BlockStateInvoker.b(iBlockState, U) == JA.TOP;
        int[] nArray = Q[n + 4];
        this.W = true;
        int n2 = 0;
        while (true) {
            this.V = ++n2;
            if (a7r_0.c(nArray, n2) >= 0) continue;
            movingObjectPositionArray[n2] = super.a(world, blockPos, vec3, vec32);
        }
    }

    @Override
    public boolean A() {
        return this.T.A();
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        this.T.a(world, blockPos, iBlockState, random);
    }

    @Override
    public MapColor g(IBlockState iBlockState) {
        return this.T.g(this.S);
    }

    @Override
    public void a(World world, BlockPos blockPos, aw0_0 aw0_02) {
        this.T.a(world, blockPos, aw0_02);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState) {
        this.T.a(world, blockPos, this.S);
    }
}

