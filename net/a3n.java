/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.MCInvoker;
import deobf.TimerUtil;
import deobf.Vec3;
import java.util.ArrayList;
import java.util.List;

public class a3n {
    private BlockPos c;
    private EnumFacing a;
    private static List<Block> b = a7r_0.a(new Block[]{Blocks.J, Blocks.air, Blocks.water, Blocks.c, Blocks.flowing_water, Blocks.lava, Blocks.ck, Blocks.aA, Blocks.flowing_lava, Blocks.R, Blocks.bw, Blocks.g, Blocks.aq});

    public static double a(Vec3 vec3, Vec3 vec32) {
        double d = MathInvoker.a(aNE.e(vec3) - aNE.e(vec32));
        double d2 = MathInvoker.a(aNE.a(vec3) - aNE.a(vec32));
        double d3 = MathInvoker.a(aNE.d(vec3) - aNE.d(vec32));
        return MathInvoker.d(d * d + d2 * d2 + d3 * d3);
    }

    public static double a(double ... dArray) {
        TimerUtil.e();
        double d = dArray[0];
        double[] dArray2 = dArray;
        int n = dArray2.length;
        int n2 = 0;
        if (n2 < n) {
            double d2 = dArray2[n2];
            if (d2 < d) {
                d = d2;
            }
            ++n2;
        }
        return d;
    }

    public EnumFacing b() {
        return this.a;
    }

    private static boolean a(BlockPos blockPos) {
        TimerUtil.e();
        return !ListInvoker.contains(b, BlockStateInvoker.getBlock(BlockInvoker.getMaterial(MCInvoker.f().world, blockPos)));
    }

    public static a3n c(BlockPos blockPos) {
        TimerUtil.e();
        int n = 5;
        ArrayList arrayList = new ArrayList();
        int n2 = -n;
        int n3 = 0;
        int n4 = -n;
        Object object = new BlockPos(amv_2.j(blockPos) - n2, amv_2.h(blockPos) - n3, amv_2.i(blockPos) - n4);
        Object object2 = BlockStateInvoker.getBlock(BlockInvoker.getMaterial(MCInvoker.f().world, (BlockPos)object));
        if (BlocksInvoker.g((Block)object2) && BlocksInvoker.l((Block)object2) && object2 != Blocks.air) {
            ListInvoker.add(arrayList, object);
        }
        ++n4;
        ++n3;
        ++n2;
        if (ListInvoker.size(arrayList) > 0) {
            BlockPos blockPos2 = (BlockPos)ListInvoker.get((List)aMF.a(aMF.a(ListInvoker.stream(arrayList), aN_.a(arg_0 -> a3n.lambda$getBlockDataNew$0(blockPos, arg_0))), aB0.a()), 0);
            Vec3 vec3 = new Vec3((double)amv_2.j(blockPos2) + 0.5, (double)amv_2.h(blockPos2) + 0.5, (double)amv_2.i(blockPos2) + 0.5);
            Vec3 vec32 = new Vec3(aNE.e(vec3), aNE.a(vec3), aNE.d(vec3) + 0.5);
            object = new Vec3(aNE.e(vec3), aNE.a(vec3), aNE.d(vec3) - 0.5);
            object2 = new Vec3(aNE.e(vec3) - 0.5, aNE.a(vec3), aNE.d(vec3));
            Vec3 vec33 = new Vec3(aNE.e(vec3) + 0.5, aNE.a(vec3), aNE.d(vec3));
            Vec3 vec34 = new Vec3(aNE.e(vec3), aNE.a(vec3) + 0.5, aNE.d(vec3));
            Vec3 vec35 = new Vec3((double)amv_2.j(blockPos) + 0.5, (double)amv_2.h(blockPos) + 0.5, (double)amv_2.i(blockPos) + 0.5);
            double d = a3n.a(vec35, vec32);
            double d2 = a3n.a(vec35, (Vec3)object);
            double d3 = a3n.a(vec35, (Vec3)object2);
            double d4 = a3n.a(vec35, vec33);
            double d5 = a3n.a(vec35, vec34);
            EnumFacing enumFacing = null;
            double d6 = a3n.a(d, d2, d3, d4, d5);
            if (d6 == d) {
                enumFacing = EnumFacing.SOUTH;
            } else if (d6 == d2) {
                enumFacing = EnumFacing.NORTH;
            } else if (d6 == d5) {
                enumFacing = EnumFacing.UP;
            } else if (d6 == d3) {
                enumFacing = EnumFacing.WEST;
            } else if (d6 == d4) {
                enumFacing = EnumFacing.EAST;
            }
            return new a3n(blockPos2, enumFacing);
        }
        return null;
    }

    public static a3n b(BlockPos blockPos) {
        TimerUtil.e();
        if (a3n.a(amv_2.a(blockPos, 0, 1, 0))) {
            return new a3n(amv_2.a(blockPos, 0, 1, 0), EnumFacing.DOWN);
        }
        if (a3n.a(amv_2.a(blockPos, 0, 0, 1))) {
            return new a3n(amv_2.a(blockPos, 0, 0, 1), EnumFacing.NORTH);
        }
        if (a3n.a(amv_2.a(blockPos, 0, 1, 1))) {
            return new a3n(amv_2.a(blockPos, 0, 1, 1), EnumFacing.DOWN);
        }
        if (a3n.a(amv_2.a(blockPos, -1, 0, 0))) {
            return new a3n(amv_2.a(blockPos, -1, 0, 0), EnumFacing.EAST);
        }
        if (a3n.a(amv_2.a(blockPos, -1, 1, 0))) {
            return new a3n(amv_2.a(blockPos, -1, 1, 0), EnumFacing.DOWN);
        }
        if (a3n.a(amv_2.a(blockPos, 1, 0, 0))) {
            return new a3n(amv_2.a(blockPos, 1, 0, 0), EnumFacing.WEST);
        }
        if (a3n.a(amv_2.a(blockPos, 1, 1, 0))) {
            return new a3n(amv_2.a(blockPos, 1, 1, 0), EnumFacing.DOWN);
        }
        if (a3n.a(amv_2.a(blockPos, 0, 0, -1))) {
            return new a3n(amv_2.a(blockPos, 0, 0, -1), EnumFacing.SOUTH);
        }
        if (a3n.a(amv_2.a(blockPos, 0, 1, -1))) {
            return new a3n(amv_2.a(blockPos, 0, 1, -1), EnumFacing.DOWN);
        }
        BlockPos blockPos2 = amv_2.a(blockPos, -1, 0, 0);
        if (a3n.a(amv_2.a(blockPos2, -1, 0, 0))) {
            return new a3n(amv_2.a(blockPos2, -1, 0, 0), EnumFacing.EAST);
        }
        if (a3n.a(amv_2.a(blockPos2, -1, 1, 0))) {
            return new a3n(amv_2.a(blockPos2, -1, 1, 0), EnumFacing.DOWN);
        }
        if (a3n.a(amv_2.a(blockPos2, 1, 0, 0))) {
            return new a3n(amv_2.a(blockPos2, 1, 0, 0), EnumFacing.WEST);
        }
        if (a3n.a(amv_2.a(blockPos2, 1, 1, 0))) {
            return new a3n(amv_2.a(blockPos2, 1, 1, 0), EnumFacing.DOWN);
        }
        if (a3n.a(amv_2.a(blockPos2, 0, 0, -1))) {
            return new a3n(amv_2.a(blockPos2, 0, 0, -1), EnumFacing.SOUTH);
        }
        if (a3n.a(amv_2.a(blockPos2, 0, 1, -1))) {
            return new a3n(amv_2.a(blockPos2, 0, 1, -1), EnumFacing.DOWN);
        }
        if (a3n.a(amv_2.a(blockPos2, 0, 0, 1))) {
            return new a3n(amv_2.a(blockPos2, 0, 0, 1), EnumFacing.NORTH);
        }
        if (a3n.a(amv_2.a(blockPos2, 0, 1, 1))) {
            return new a3n(amv_2.a(blockPos2, 0, 1, 1), EnumFacing.DOWN);
        }
        BlockPos blockPos3 = amv_2.a(blockPos, 1, 0, 0);
        if (a3n.a(amv_2.a(blockPos3, -1, 0, 0))) {
            return new a3n(amv_2.a(blockPos3, -1, 0, 0), EnumFacing.EAST);
        }
        if (a3n.a(amv_2.a(blockPos3, -1, 1, 0))) {
            return new a3n(amv_2.a(blockPos3, -1, 1, 0), EnumFacing.DOWN);
        }
        if (a3n.a(amv_2.a(blockPos3, 1, 0, 0))) {
            return new a3n(amv_2.a(blockPos3, 1, 0, 0), EnumFacing.WEST);
        }
        if (a3n.a(amv_2.a(blockPos3, 1, 1, 0))) {
            return new a3n(amv_2.a(blockPos3, 1, 1, 0), EnumFacing.DOWN);
        }
        if (a3n.a(amv_2.a(blockPos3, 0, 0, -1))) {
            return new a3n(amv_2.a(blockPos3, 0, 0, -1), EnumFacing.SOUTH);
        }
        if (a3n.a(amv_2.a(blockPos3, 0, 1, -1))) {
            return new a3n(amv_2.a(blockPos3, 0, 1, -1), EnumFacing.DOWN);
        }
        if (a3n.a(amv_2.a(blockPos3, 0, 0, 1))) {
            return new a3n(amv_2.a(blockPos3, 0, 0, 1), EnumFacing.NORTH);
        }
        if (a3n.a(amv_2.a(blockPos3, 0, 1, 1))) {
            return new a3n(amv_2.a(blockPos3, 0, 1, 1), EnumFacing.DOWN);
        }
        BlockPos blockPos4 = amv_2.a(blockPos, 0, 0, -1);
        if (a3n.a(amv_2.a(blockPos4, -1, 0, 0))) {
            return new a3n(amv_2.a(blockPos4, -1, 0, 0), EnumFacing.EAST);
        }
        if (a3n.a(amv_2.a(blockPos, -1, 1, 0))) {
            return new a3n(amv_2.a(blockPos4, -1, 1, 0), EnumFacing.DOWN);
        }
        if (a3n.a(amv_2.a(blockPos4, 1, 0, 0))) {
            return new a3n(amv_2.a(blockPos4, 1, 0, 0), EnumFacing.WEST);
        }
        if (a3n.a(amv_2.a(blockPos4, 1, 1, 0))) {
            return new a3n(amv_2.a(blockPos4, 1, 1, 0), EnumFacing.DOWN);
        }
        if (a3n.a(amv_2.a(blockPos4, 0, 0, -1))) {
            return new a3n(amv_2.a(blockPos4, 0, 0, -1), EnumFacing.SOUTH);
        }
        if (a3n.a(amv_2.a(blockPos4, 0, 1, -1))) {
            return new a3n(amv_2.a(blockPos4, 0, 1, -1), EnumFacing.DOWN);
        }
        if (a3n.a(amv_2.a(blockPos4, 0, 0, 1))) {
            return new a3n(amv_2.a(blockPos4, 0, 0, 1), EnumFacing.NORTH);
        }
        if (a3n.a(amv_2.a(blockPos4, 0, 1, 1))) {
            return new a3n(amv_2.a(blockPos4, 0, 1, 1), EnumFacing.DOWN);
        }
        BlockPos blockPos5 = amv_2.a(blockPos, 0, 0, 1);
        if (a3n.a(amv_2.a(blockPos5, -1, 0, 0))) {
            return new a3n(amv_2.a(blockPos5, -1, 0, 0), EnumFacing.EAST);
        }
        if (a3n.a(amv_2.a(blockPos5, -1, 1, 0))) {
            return new a3n(amv_2.a(blockPos5, -1, 1, 0), EnumFacing.DOWN);
        }
        if (a3n.a(amv_2.a(blockPos5, 1, 0, 0))) {
            return new a3n(amv_2.a(blockPos5, 1, 0, 0), EnumFacing.WEST);
        }
        if (a3n.a(amv_2.a(blockPos5, 1, 1, 0))) {
            return new a3n(amv_2.a(blockPos5, 1, 1, 0), EnumFacing.DOWN);
        }
        if (a3n.a(amv_2.a(blockPos5, 0, 0, -1))) {
            return new a3n(amv_2.a(blockPos5, 0, 0, -1), EnumFacing.SOUTH);
        }
        if (a3n.a(amv_2.a(blockPos5, 0, 1, -1))) {
            return new a3n(amv_2.a(blockPos5, 0, 1, -1), EnumFacing.DOWN);
        }
        if (a3n.a(amv_2.a(blockPos5, 0, 0, 1))) {
            return new a3n(amv_2.a(blockPos5, 0, 0, 1), EnumFacing.NORTH);
        }
        if (a3n.a(amv_2.a(blockPos5, 0, 1, 1))) {
            return new a3n(amv_2.a(blockPos5, 0, 1, 1), EnumFacing.DOWN);
        }
        return null;
    }

    public static a3n d(BlockPos blockPos) {
        TimerUtil.e();
        if (a3n.a(amv_2.a(blockPos, 0, -1, 0))) {
            return new a3n(amv_2.a(blockPos, 0, -1, 0), EnumFacing.UP);
        }
        if (a3n.a(amv_2.a(blockPos, -1, 0, 0))) {
            return new a3n(amv_2.a(blockPos, -1, 0, 0), EnumFacing.EAST);
        }
        if (a3n.a(amv_2.a(blockPos, 1, 0, 0))) {
            return new a3n(amv_2.a(blockPos, 1, 0, 0), EnumFacing.WEST);
        }
        if (a3n.a(amv_2.a(blockPos, 0, 0, 1))) {
            return new a3n(amv_2.a(blockPos, 0, 0, 1), EnumFacing.NORTH);
        }
        if (a3n.a(amv_2.a(blockPos, 0, 0, -1))) {
            return new a3n(amv_2.a(blockPos, 0, 0, -1), EnumFacing.SOUTH);
        }
        BlockPos blockPos2 = amv_2.a(blockPos, -1, 0, 0);
        if (a3n.a(amv_2.a(blockPos2, 0, -1, 0))) {
            return new a3n(amv_2.a(blockPos2, 0, -1, 0), EnumFacing.UP);
        }
        if (a3n.a(amv_2.a(blockPos2, -1, 0, 0))) {
            return new a3n(amv_2.a(blockPos2, -1, 0, 0), EnumFacing.EAST);
        }
        if (a3n.a(amv_2.a(blockPos2, 1, 0, 0))) {
            return new a3n(amv_2.a(blockPos2, 1, 0, 0), EnumFacing.WEST);
        }
        if (a3n.a(amv_2.a(blockPos2, 0, 0, 1))) {
            return new a3n(amv_2.a(blockPos2, 0, 0, 1), EnumFacing.NORTH);
        }
        if (a3n.a(amv_2.a(blockPos2, 0, 0, -1))) {
            return new a3n(amv_2.a(blockPos2, 0, 0, -1), EnumFacing.SOUTH);
        }
        BlockPos blockPos3 = amv_2.a(blockPos, 1, 0, 0);
        if (a3n.a(amv_2.a(blockPos3, 0, -1, 0))) {
            return new a3n(amv_2.a(blockPos3, 0, -1, 0), EnumFacing.UP);
        }
        if (a3n.a(amv_2.a(blockPos3, -1, 0, 0))) {
            return new a3n(amv_2.a(blockPos3, -1, 0, 0), EnumFacing.EAST);
        }
        if (a3n.a(amv_2.a(blockPos3, 1, 0, 0))) {
            return new a3n(amv_2.a(blockPos3, 1, 0, 0), EnumFacing.WEST);
        }
        if (a3n.a(amv_2.a(blockPos3, 0, 0, 1))) {
            return new a3n(amv_2.a(blockPos3, 0, 0, 1), EnumFacing.NORTH);
        }
        if (a3n.a(amv_2.a(blockPos3, 0, 0, -1))) {
            return new a3n(amv_2.a(blockPos3, 0, 0, -1), EnumFacing.SOUTH);
        }
        BlockPos blockPos4 = amv_2.a(blockPos, 0, 0, 1);
        if (a3n.a(amv_2.a(blockPos4, 0, -1, 0))) {
            return new a3n(amv_2.a(blockPos4, 0, -1, 0), EnumFacing.UP);
        }
        if (a3n.a(amv_2.a(blockPos4, -1, 0, 0))) {
            return new a3n(amv_2.a(blockPos4, -1, 0, 0), EnumFacing.EAST);
        }
        if (a3n.a(amv_2.a(blockPos4, 1, 0, 0))) {
            return new a3n(amv_2.a(blockPos4, 1, 0, 0), EnumFacing.WEST);
        }
        if (a3n.a(amv_2.a(blockPos4, 0, 0, 1))) {
            return new a3n(amv_2.a(blockPos4, 0, 0, 1), EnumFacing.NORTH);
        }
        if (a3n.a(amv_2.a(blockPos4, 0, 0, -1))) {
            return new a3n(amv_2.a(blockPos4, 0, 0, -1), EnumFacing.SOUTH);
        }
        BlockPos blockPos5 = amv_2.a(blockPos, 0, 0, -1);
        if (a3n.a(amv_2.a(blockPos5, 0, -1, 0))) {
            return new a3n(amv_2.a(blockPos5, 0, -1, 0), EnumFacing.UP);
        }
        if (a3n.a(amv_2.a(blockPos5, -1, 0, 0))) {
            return new a3n(amv_2.a(blockPos5, -1, 0, 0), EnumFacing.EAST);
        }
        if (a3n.a(amv_2.a(blockPos5, 1, 0, 0))) {
            return new a3n(amv_2.a(blockPos5, 1, 0, 0), EnumFacing.WEST);
        }
        if (a3n.a(amv_2.a(blockPos5, 0, 0, 1))) {
            return new a3n(amv_2.a(blockPos5, 0, 0, 1), EnumFacing.NORTH);
        }
        if (a3n.a(amv_2.a(blockPos5, 0, 0, -1))) {
            return new a3n(amv_2.a(blockPos5, 0, 0, -1), EnumFacing.SOUTH);
        }
        amv_2.a(blockPos, -2, 0, 0);
        if (a3n.a(amv_2.a(blockPos2, 0, -1, 0))) {
            return new a3n(amv_2.a(blockPos2, 0, -1, 0), EnumFacing.UP);
        }
        if (a3n.a(amv_2.a(blockPos2, -1, 0, 0))) {
            return new a3n(amv_2.a(blockPos2, -1, 0, 0), EnumFacing.EAST);
        }
        if (a3n.a(amv_2.a(blockPos2, 1, 0, 0))) {
            return new a3n(amv_2.a(blockPos2, 1, 0, 0), EnumFacing.WEST);
        }
        if (a3n.a(amv_2.a(blockPos2, 0, 0, 1))) {
            return new a3n(amv_2.a(blockPos2, 0, 0, 1), EnumFacing.NORTH);
        }
        if (a3n.a(amv_2.a(blockPos2, 0, 0, -1))) {
            return new a3n(amv_2.a(blockPos2, 0, 0, -1), EnumFacing.SOUTH);
        }
        amv_2.a(blockPos, 2, 0, 0);
        if (a3n.a(amv_2.a(blockPos3, 0, -1, 0))) {
            return new a3n(amv_2.a(blockPos3, 0, -1, 0), EnumFacing.UP);
        }
        if (a3n.a(amv_2.a(blockPos3, -1, 0, 0))) {
            return new a3n(amv_2.a(blockPos3, -1, 0, 0), EnumFacing.EAST);
        }
        if (a3n.a(amv_2.a(blockPos3, 1, 0, 0))) {
            return new a3n(amv_2.a(blockPos3, 1, 0, 0), EnumFacing.WEST);
        }
        if (a3n.a(amv_2.a(blockPos3, 0, 0, 1))) {
            return new a3n(amv_2.a(blockPos3, 0, 0, 1), EnumFacing.NORTH);
        }
        if (a3n.a(amv_2.a(blockPos3, 0, 0, -1))) {
            return new a3n(amv_2.a(blockPos3, 0, 0, -1), EnumFacing.SOUTH);
        }
        amv_2.a(blockPos, 0, 0, 2);
        if (a3n.a(amv_2.a(blockPos4, 0, -1, 0))) {
            return new a3n(amv_2.a(blockPos4, 0, -1, 0), EnumFacing.UP);
        }
        if (a3n.a(amv_2.a(blockPos4, -1, 0, 0))) {
            return new a3n(amv_2.a(blockPos4, -1, 0, 0), EnumFacing.EAST);
        }
        if (a3n.a(amv_2.a(blockPos4, 1, 0, 0))) {
            return new a3n(amv_2.a(blockPos4, 1, 0, 0), EnumFacing.WEST);
        }
        if (a3n.a(amv_2.a(blockPos4, 0, 0, 1))) {
            return new a3n(amv_2.a(blockPos4, 0, 0, 1), EnumFacing.NORTH);
        }
        if (a3n.a(amv_2.a(blockPos4, 0, 0, -1))) {
            return new a3n(amv_2.a(blockPos4, 0, 0, -1), EnumFacing.SOUTH);
        }
        amv_2.a(blockPos, 0, 0, -2);
        if (a3n.a(amv_2.a(blockPos5, 0, -1, 0))) {
            return new a3n(amv_2.a(blockPos5, 0, -1, 0), EnumFacing.UP);
        }
        if (a3n.a(amv_2.a(blockPos5, -1, 0, 0))) {
            return new a3n(amv_2.a(blockPos5, -1, 0, 0), EnumFacing.EAST);
        }
        if (a3n.a(amv_2.a(blockPos5, 1, 0, 0))) {
            return new a3n(amv_2.a(blockPos5, 1, 0, 0), EnumFacing.WEST);
        }
        if (a3n.a(amv_2.a(blockPos5, 0, 0, 1))) {
            return new a3n(amv_2.a(blockPos5, 0, 0, 1), EnumFacing.NORTH);
        }
        if (a3n.a(amv_2.a(blockPos5, 0, 0, -1))) {
            return new a3n(amv_2.a(blockPos5, 0, 0, -1), EnumFacing.SOUTH);
        }
        BlockPos blockPos6 = amv_2.a(blockPos, 0, -1, 0);
        if (a3n.a(amv_2.a(blockPos6, 0, -1, 0))) {
            return new a3n(amv_2.a(blockPos6, 0, -1, 0), EnumFacing.UP);
        }
        if (a3n.a(amv_2.a(blockPos6, -1, 0, 0))) {
            return new a3n(amv_2.a(blockPos6, -1, 0, 0), EnumFacing.EAST);
        }
        if (a3n.a(amv_2.a(blockPos6, 1, 0, 0))) {
            return new a3n(amv_2.a(blockPos6, 1, 0, 0), EnumFacing.WEST);
        }
        if (a3n.a(amv_2.a(blockPos6, 0, 0, 1))) {
            return new a3n(amv_2.a(blockPos6, 0, 0, 1), EnumFacing.NORTH);
        }
        if (a3n.a(amv_2.a(blockPos6, 0, 0, -1))) {
            return new a3n(amv_2.a(blockPos6, 0, 0, -1), EnumFacing.SOUTH);
        }
        BlockPos blockPos7 = amv_2.a(blockPos6, 1, 0, 0);
        if (a3n.a(amv_2.a(blockPos7, 0, -1, 0))) {
            return new a3n(amv_2.a(blockPos7, 0, -1, 0), EnumFacing.UP);
        }
        if (a3n.a(amv_2.a(blockPos7, -1, 0, 0))) {
            return new a3n(amv_2.a(blockPos7, -1, 0, 0), EnumFacing.EAST);
        }
        if (a3n.a(amv_2.a(blockPos7, 1, 0, 0))) {
            return new a3n(amv_2.a(blockPos7, 1, 0, 0), EnumFacing.WEST);
        }
        if (a3n.a(amv_2.a(blockPos7, 0, 0, 1))) {
            return new a3n(amv_2.a(blockPos7, 0, 0, 1), EnumFacing.NORTH);
        }
        if (a3n.a(amv_2.a(blockPos7, 0, 0, -1))) {
            return new a3n(amv_2.a(blockPos7, 0, 0, -1), EnumFacing.SOUTH);
        }
        BlockPos blockPos8 = amv_2.a(blockPos6, -1, 0, 0);
        if (a3n.a(amv_2.a(blockPos8, 0, -1, 0))) {
            return new a3n(amv_2.a(blockPos8, 0, -1, 0), EnumFacing.UP);
        }
        if (a3n.a(amv_2.a(blockPos8, -1, 0, 0))) {
            return new a3n(amv_2.a(blockPos8, -1, 0, 0), EnumFacing.EAST);
        }
        if (a3n.a(amv_2.a(blockPos8, 1, 0, 0))) {
            return new a3n(amv_2.a(blockPos8, 1, 0, 0), EnumFacing.WEST);
        }
        if (a3n.a(amv_2.a(blockPos8, 0, 0, 1))) {
            return new a3n(amv_2.a(blockPos8, 0, 0, 1), EnumFacing.NORTH);
        }
        if (a3n.a(amv_2.a(blockPos8, 0, 0, -1))) {
            return new a3n(amv_2.a(blockPos8, 0, 0, -1), EnumFacing.SOUTH);
        }
        BlockPos blockPos9 = amv_2.a(blockPos6, 0, 0, 1);
        if (a3n.a(amv_2.a(blockPos9, 0, -1, 0))) {
            return new a3n(amv_2.a(blockPos9, 0, -1, 0), EnumFacing.UP);
        }
        if (a3n.a(amv_2.a(blockPos9, -1, 0, 0))) {
            return new a3n(amv_2.a(blockPos9, -1, 0, 0), EnumFacing.EAST);
        }
        if (a3n.a(amv_2.a(blockPos9, 1, 0, 0))) {
            return new a3n(amv_2.a(blockPos9, 1, 0, 0), EnumFacing.WEST);
        }
        if (a3n.a(amv_2.a(blockPos9, 0, 0, 1))) {
            return new a3n(amv_2.a(blockPos9, 0, 0, 1), EnumFacing.NORTH);
        }
        if (a3n.a(amv_2.a(blockPos9, 0, 0, -1))) {
            return new a3n(amv_2.a(blockPos9, 0, 0, -1), EnumFacing.SOUTH);
        }
        BlockPos blockPos10 = amv_2.a(blockPos6, 0, 0, -1);
        if (a3n.a(amv_2.a(blockPos10, 0, -1, 0))) {
            return new a3n(amv_2.a(blockPos10, 0, -1, 0), EnumFacing.UP);
        }
        if (a3n.a(amv_2.a(blockPos10, -1, 0, 0))) {
            return new a3n(amv_2.a(blockPos10, -1, 0, 0), EnumFacing.EAST);
        }
        if (a3n.a(amv_2.a(blockPos10, 1, 0, 0))) {
            return new a3n(amv_2.a(blockPos10, 1, 0, 0), EnumFacing.WEST);
        }
        if (a3n.a(amv_2.a(blockPos10, 0, 0, 1))) {
            return new a3n(amv_2.a(blockPos10, 0, 0, 1), EnumFacing.NORTH);
        }
        if (a3n.a(amv_2.a(blockPos10, 0, 0, -1))) {
            return new a3n(amv_2.a(blockPos10, 0, 0, -1), EnumFacing.SOUTH);
        }
        return null;
    }

    public BlockPos a() {
        return this.c;
    }

    public static double a(BlockPos blockPos, BlockPos blockPos2) {
        double d = MathInvoker.a(amv_2.j(blockPos) - amv_2.j(blockPos2));
        double d2 = MathInvoker.a(amv_2.h(blockPos) - amv_2.h(blockPos2));
        double d3 = MathInvoker.a(amv_2.i(blockPos) - amv_2.i(blockPos2));
        return MathInvoker.d(d * d + d2 * d2 + d3 * d3);
    }

    public a3n(BlockPos blockPos, EnumFacing enumFacing) {
        this.c = blockPos;
        this.a = enumFacing;
    }

    private static double lambda$getBlockDataNew$0(BlockPos blockPos, BlockPos blockPos2) {
        return a3n.a(blockPos, blockPos2);
    }
}

