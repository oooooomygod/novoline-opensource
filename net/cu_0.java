/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Entity;
import deobf.MCInvoker;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.Cu
 */
public class cu_0 {
    private static int a;
    private static int b;

    private static int d(BlockPos blockPos, BlockPos blockPos2) {
        return amv_2.j(blockPos) - amv_2.j(blockPos2);
    }

    private static int a(BlockPos blockPos, BlockPos blockPos2) {
        return amv_2.i(blockPos) - amv_2.i(blockPos2);
    }

    public static List<agb_1> a(Entity entity, Entity entity2) {
        aMK.f();
        ObjectArrayList objectArrayList = new ObjectArrayList();
        double d = 2.0;
        double d2 = MathInvoker.b(MathInvoker.b(entity2.posX - entity.posX, 2.0) + MathInvoker.b(entity2.posY - entity.posY, 2.0) + MathInvoker.b(entity2.posZ - entity.posZ, 2.0), 0.5);
        double d3 = d2 / d;
        double d4 = (entity2.posX - entity.posX) / d3;
        double d5 = (entity2.posY - entity.posY) / d3;
        double d6 = (entity2.posZ - entity.posZ) / d3;
        double d7 = 0.0;
        double d8 = 0.0;
        double d9 = 0.0;
        double d10 = d3;
        d3 = d10 - 1.0;
        if (d10 <= 0.0) {
            ListInvoker.b(new ListInvoker[2]);
        }
        agb_1 agb_12 = new agb_1((int)(entity.posX + (d7 += d4)), (int)(entity.posY + (d8 += d5)), (int)(entity.posZ + (d9 += d6)));
        ListInvoker.add((List)objectArrayList, agb_12);
        return (List)aMF.a(aMF.e(ListInvoker.stream((List)objectArrayList)), aB0.a(ObjectArrayList::new));
    }

    public static ArrayList<aMK> a(aMK aMK2, aMK aMK3) {
        aMK.f();
        if (!cu_0.a(new BlockPos(aks_0.a(aMK2)))) {
            aMK2 = aks_0.a(aMK2, 0.0, 1.0, 0.0);
        }
        KO kO = new KO(aMK2, aMK3);
        ze_2.a(kO);
        int n = 0;
        aMK aMK4 = null;
        aMK aMK5 = null;
        ArrayList<aMK> arrayList = new ArrayList<aMK>();
        ArrayList arrayList2 = ze_2.b(kO);
        Iterator iterator = akr_1.a(arrayList2);
        if (dz_0.c(iterator)) {
            aMK aMK6 = (aMK)dz_0.b(iterator);
            if (aMK4 != null) {
                akr_1.a(arrayList, aks_0.a(aMK4, 0.5, 0.0, 0.5));
            }
            akr_1.a(arrayList, aks_0.a(aMK6, 0.5, 0.0, 0.5));
            aMK5 = aMK6;
            boolean bl = true;
            if (aks_0.a(aMK6, aMK5) > 25.0) {
                bl = false;
            }
            double d = MathInvoker.a(aks_0.b(aMK5), aks_0.b(aMK6));
            double d2 = MathInvoker.a(aks_0.e(aMK5), aks_0.e(aMK6));
            double d3 = MathInvoker.a(aks_0.d(aMK5), aks_0.d(aMK6));
            double d4 = MathInvoker.d(aks_0.b(aMK5), aks_0.b(aMK6));
            double d5 = MathInvoker.d(aks_0.e(aMK5), aks_0.e(aMK6));
            double d6 = MathInvoker.d(aks_0.d(aMK5), aks_0.d(aMK6));
            int n2 = (int)d;
            if ((double)n2 <= d4) {
                int n3 = (int)d2;
                if ((double)n3 <= d5) {
                    int n4 = (int)d3;
                    if ((double)n4 <= d6) {
                        if (!ze_2.a(n2, n3, n4, false)) {
                            bl = false;
                        }
                        ++n4;
                    }
                    ++n3;
                }
                ++n2;
            }
            aMK4 = aMK6;
            ++n;
        }
        return arrayList;
    }

    private static int b(@NonNull Entity entity, @NonNull Entity entity2) {
        return (int)MathInvoker.a(entity.posZ - entity2.posZ);
    }

    private static int b(BlockPos blockPos, BlockPos blockPos2) {
        return amv_2.h(blockPos) - amv_2.h(blockPos2);
    }

    public static List<agb_1> c(BlockPos blockPos, BlockPos blockPos2) {
        int n;
        int n2;
        int n3;
        aMK.f();
        ObjectArrayList objectArrayList = new ObjectArrayList();
        double d = 10.0;
        if (cu_0.d(blockPos, blockPos2) > 0 && (n3 = 0) <= cu_0.d(blockPos, blockPos2) && !cu_0.a(new agb_1(amv_2.j(blockPos) - n3, amv_2.h(blockPos), amv_2.i(blockPos)))) {
            double d2 = (double)n3 % d - 0.0;
            int cfr_ignored_6 = d2 == 0.0 ? 0 : (d2 > 0.0 ? 1 : -1);
            ListInvoker.add((List)objectArrayList, new agb_1(amv_2.j(blockPos) - n3, amv_2.h(blockPos), amv_2.i(blockPos)));
            if ((double)n3 == (double)cu_0.d(blockPos, blockPos2) - ((double)cu_0.d(blockPos, blockPos2) - (double)((int)((double)cu_0.d(blockPos, blockPos2) / d)) * d)) {
                if (cu_0.a(blockPos, blockPos2) > 0 && (n2 = 0) <= cu_0.a(blockPos, blockPos2) && !cu_0.a(new agb_1(amv_2.j(blockPos) - n3, amv_2.h(blockPos), amv_2.i(blockPos) - n2))) {
                    double d3 = (double)n2 % d - 0.0;
                    int cfr_ignored_7 = d3 == 0.0 ? 0 : (d3 > 0.0 ? 1 : -1);
                    ListInvoker.add((List)objectArrayList, new agb_1(amv_2.j(blockPos) - n3, amv_2.h(blockPos), amv_2.i(blockPos) - n2));
                    if ((double)n2 == (double)cu_0.a(blockPos, blockPos2) - ((double)cu_0.a(blockPos, blockPos2) - (double)((int)((double)cu_0.a(blockPos, blockPos2) / d)) * d)) {
                        if (cu_0.b(blockPos, blockPos2) > 0 && (n = 0) <= cu_0.b(blockPos, blockPos2)) {
                            if (cu_0.a(new agb_1(amv_2.j(blockPos) - n3, amv_2.h(blockPos) - n, amv_2.i(blockPos) - n2))) {
                                // empty if block
                            }
                            int cfr_ignored_8 = n % 2;
                            ListInvoker.add((List)objectArrayList, new agb_1(amv_2.j(blockPos) - n3, amv_2.h(blockPos) - n, amv_2.i(blockPos) - n2));
                            ++n;
                        }
                        if ((n = 0) >= cu_0.b(blockPos, blockPos2)) {
                            if (cu_0.a(new agb_1(amv_2.j(blockPos) - n3, amv_2.h(blockPos) - n, amv_2.i(blockPos) - n2))) {
                                // empty if block
                            }
                            int cfr_ignored_9 = n % 2;
                            ListInvoker.add((List)objectArrayList, new agb_1(amv_2.j(blockPos) - n3, amv_2.h(blockPos) - n, amv_2.i(blockPos) - n2));
                            --n;
                        }
                    }
                    ++n2;
                }
                if ((n2 = 0) >= cu_0.a(blockPos, blockPos2) && !cu_0.a(new agb_1(amv_2.j(blockPos) - n3, amv_2.h(blockPos), amv_2.i(blockPos) - n2))) {
                    double d4 = (double)n2 % d - 0.0;
                    int cfr_ignored_10 = d4 == 0.0 ? 0 : (d4 > 0.0 ? 1 : -1);
                    ListInvoker.add((List)objectArrayList, new agb_1(amv_2.j(blockPos) - n3, amv_2.h(blockPos), amv_2.i(blockPos) - n2));
                    if ((double)n2 == (double)cu_0.a(blockPos, blockPos2) - ((double)cu_0.a(blockPos, blockPos2) - (double)((int)((double)cu_0.a(blockPos, blockPos2) / d)) * d)) {
                        if (cu_0.b(blockPos, blockPos2) > 0 && (n = 0) <= cu_0.b(blockPos, blockPos2)) {
                            if (cu_0.a(new agb_1(amv_2.j(blockPos) - n3, amv_2.h(blockPos) - n, amv_2.i(blockPos) - n2))) {
                                // empty if block
                            }
                            int cfr_ignored_11 = n % 2;
                            ListInvoker.add((List)objectArrayList, new agb_1(amv_2.j(blockPos) - n3, amv_2.h(blockPos) - n, amv_2.i(blockPos) - n2));
                            ++n;
                        }
                        if ((n = 0) >= cu_0.b(blockPos, blockPos2)) {
                            if (cu_0.a(new agb_1(amv_2.j(blockPos) - n3, amv_2.h(blockPos) - n, amv_2.i(blockPos) - n2))) {
                                // empty if block
                            }
                            int cfr_ignored_12 = n % 2;
                            ListInvoker.add((List)objectArrayList, new agb_1(amv_2.j(blockPos) - n3, amv_2.h(blockPos) - n, amv_2.i(blockPos) - n2));
                            --n;
                        }
                    }
                    --n2;
                }
            }
            ++n3;
        }
        if ((n3 = 0) >= cu_0.d(blockPos, blockPos2) && !cu_0.a(new agb_1(amv_2.j(blockPos) - n3, amv_2.h(blockPos), amv_2.i(blockPos)))) {
            double d5 = (double)n3 % d - 0.0;
            int cfr_ignored_13 = d5 == 0.0 ? 0 : (d5 > 0.0 ? 1 : -1);
            ListInvoker.add((List)objectArrayList, new agb_1(amv_2.j(blockPos) - n3, amv_2.h(blockPos), amv_2.i(blockPos)));
            if ((double)n3 == (double)cu_0.d(blockPos, blockPos2) - ((double)cu_0.d(blockPos, blockPos2) - (double)((int)((double)cu_0.d(blockPos, blockPos2) / d)) * d)) {
                if (cu_0.a(blockPos, blockPos2) > 0 && (n2 = 0) <= cu_0.a(blockPos, blockPos2) && !cu_0.a(new agb_1(amv_2.j(blockPos) - n3, amv_2.h(blockPos), amv_2.i(blockPos) - n2))) {
                    double d6 = (double)n2 % d - 0.0;
                    int cfr_ignored_14 = d6 == 0.0 ? 0 : (d6 > 0.0 ? 1 : -1);
                    ListInvoker.add((List)objectArrayList, new agb_1(amv_2.j(blockPos) - n3, amv_2.h(blockPos), amv_2.i(blockPos) - n2));
                    if ((double)n2 == (double)cu_0.a(blockPos, blockPos2) - ((double)cu_0.a(blockPos, blockPos2) - (double)((int)((double)cu_0.a(blockPos, blockPos2) / d)) * d)) {
                        if (cu_0.b(blockPos, blockPos2) > 0 && (n = 0) <= cu_0.b(blockPos, blockPos2)) {
                            if (cu_0.a(new agb_1(amv_2.j(blockPos) - n3, amv_2.h(blockPos) - n, amv_2.i(blockPos) - n2))) {
                                // empty if block
                            }
                            int cfr_ignored_15 = n % 2;
                            ListInvoker.add((List)objectArrayList, new agb_1(amv_2.j(blockPos) - n3, amv_2.h(blockPos) - n, amv_2.i(blockPos) - n2));
                            ++n;
                        }
                        if ((n = 0) >= cu_0.b(blockPos, blockPos2)) {
                            if (cu_0.a(new agb_1(amv_2.j(blockPos) - n3, amv_2.h(blockPos) - n, amv_2.i(blockPos) - n2))) {
                                // empty if block
                            }
                            int cfr_ignored_16 = n % 2;
                            ListInvoker.add((List)objectArrayList, new agb_1(amv_2.j(blockPos) - n3, amv_2.h(blockPos) - n, amv_2.i(blockPos) - n2));
                            --n;
                        }
                    }
                    ++n2;
                }
                if ((n2 = 0) >= cu_0.a(blockPos, blockPos2) && !cu_0.a(new agb_1(amv_2.j(blockPos) - n3, amv_2.h(blockPos), amv_2.i(blockPos) - n2))) {
                    double d7 = (double)n2 % d - 0.0;
                    int cfr_ignored_17 = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
                    ListInvoker.add((List)objectArrayList, new agb_1(amv_2.j(blockPos) - n3, amv_2.h(blockPos), amv_2.i(blockPos) - n2));
                    if ((double)n2 == (double)cu_0.a(blockPos, blockPos2) - ((double)cu_0.a(blockPos, blockPos2) - (double)((int)((double)cu_0.a(blockPos, blockPos2) / d)) * d)) {
                        if (cu_0.b(blockPos, blockPos2) > 0 && (n = 0) <= cu_0.b(blockPos, blockPos2)) {
                            if (cu_0.a(new agb_1(amv_2.j(blockPos) - n3, amv_2.h(blockPos) - n, amv_2.i(blockPos) - n2))) {
                                // empty if block
                            }
                            int cfr_ignored_18 = n % 2;
                            ListInvoker.add((List)objectArrayList, new agb_1(amv_2.j(blockPos) - n3, amv_2.h(blockPos) - n, amv_2.i(blockPos) - n2));
                            ++n;
                        }
                        if ((n = 0) >= cu_0.b(blockPos, blockPos2)) {
                            if (cu_0.a(new agb_1(amv_2.j(blockPos) - n3, amv_2.h(blockPos) - n, amv_2.i(blockPos) - n2))) {
                                // empty if block
                            }
                            int cfr_ignored_19 = n % 2;
                            ListInvoker.add((List)objectArrayList, new agb_1(amv_2.j(blockPos) - n3, amv_2.h(blockPos) - n, amv_2.i(blockPos) - n2));
                            --n;
                        }
                    }
                    --n2;
                }
            }
            --n3;
        }
        return (List)aMF.a(aMF.e(ListInvoker.stream((List)objectArrayList)), aB0.a(ObjectArrayList::new));
    }

    public static boolean a(BlockPos blockPos) {
        aMK.f();
        Block block = BlockStateInvoker.getBlock(BlockInvoker.getMaterial(MCInvoker.f().world, new BlockPos(amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos))));
        return BlocksInvoker.getBlockState(block) == Material.air || BlocksInvoker.getBlockState(block) == Material.F || BlocksInvoker.getBlockState(block) == Material.f || block == Blocks.bm || block == Blocks.water || block == Blocks.flowing_water || block == Blocks.cj || block == Blocks.bp;
    }

    private static boolean a(agb_1 agb_12) {
        aMK.f();
        Block block = BlockInvoker.a(MCInvoker.f().world, sd_2.c(agb_12), sd_2.a(agb_12), sd_2.b(agb_12));
        return !(block instanceof BlockAir) && !(block instanceof BlockGrass) && !(block instanceof fg_1);
    }

    private static int c(@NonNull Entity entity, @NonNull Entity entity2) {
        return (int)MathInvoker.a(entity.posX - entity2.posX);
    }
}

