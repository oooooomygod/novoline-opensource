/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultiset
 *  com.google.common.collect.Multiset
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockPos;
import net.minecraft.block.BlockStone;
import net.minecraft.init.Blocks;
import deobf.Chunk;
import deobf.Entity;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import deobf.Packet;
import java.util.List;


public class ItemMap
extends lf_0 {
    public static wp_1 a(int n, World world) {
        String string = aL0.c(aL0.a(new StringBuilder(), aKI.g), n).toString();
        wp_1 wp_12 = (wp_1)aV8.a(world, wp_1.class, string);
        wp_12 = new wp_1(string);
        aV8.a(world, string, wp_12);
        return wp_12;
    }

    @Override
    public void a(ItemStack itemStack, EntityPlayer entityPlayer, List<String> list, boolean bl) {
        this.a(itemStack, entityPlayer.worldObj);
        ListInvoker.add(list, aKI.m);
    }

    public void a(World world, Entity entity, wp_1 wp_12) {
        if (qq_2.j(world.d) == wp_12.j && entity instanceof EntityPlayer) {
            int n = 1 << wp_12.c;
            int n2 = wp_12.g;
            int n3 = wp_12.f;
            int n4 = MathHelper.floor_double(entity.posX - (double)n2) / n + 64;
            int n5 = MathHelper.floor_double(entity.posZ - (double)n3) / n + 64;
            int n6 = 128 / n;
            if (qq_2.e(world.d)) {
                n6 /= 2;
            }
            aBN aBN2 = sl_2.a(wp_12, (EntityPlayer)entity);
            ++aBN2.f;
            for (int i = n4 - n6 + 1; i < n4 + n6; ++i) {
                if ((i & 0xF) != (aBN2.f & 0xF)) {
                    // empty if block
                }
                double d = 0.0;
                for (int j = n5 - n6 - 1; j < n5 + n6; ++j) {
                    byte by;
                    MapColor mapColor;
                    int n7;
                    int n8;
                    if (j < -1 || i >= 128 || j >= 128) continue;
                    int n9 = i - n4;
                    int n10 = j - n5;
                    boolean bl = n9 * n9 + n10 * n10 > (n6 - 2) * (n6 - 2);
                    int n11 = (n2 / n + i - 64) * n;
                    int n12 = (n3 / n + j - 64) * n;
                    HashMultiset hashMultiset = aOJ.a();
                    Chunk chunk = aV8.x(world, new BlockPos(n11, 0, n12));
                    if (aqp_2.o(chunk)) continue;
                    int n13 = n11 & 0xF;
                    int n14 = n12 & 0xF;
                    int n15 = 0;
                    double d2 = 0.0;
                    if (qq_2.e(world.d)) {
                        int n16 = n11 + n12 * 231871;
                        if (((n16 = n16 * n16 * 31287121 + n16 * 11) >> 20 & 1) == 0) {
                            JO.a((Multiset)hashMultiset, BlocksInvoker.b(Blocks.dirt, BlockStateInvoker.a(BlocksInvoker.t(Blocks.dirt), BlockDirt.Q, (Comparable)((Object)a6s_0.DIRT))), 10);
                        } else {
                            JO.a((Multiset)hashMultiset, BlocksInvoker.b(Blocks.stone, BlockStateInvoker.a(BlocksInvoker.t(Blocks.stone), BlockStone.P, (Comparable)((Object)UI.STONE))), 100);
                        }
                        d2 = 100.0;
                    } else {
                        z6_0 z6_02 = new z6_0();
                        for (int k = 0; k < n; ++k) {
                            for (n8 = 0; n8 < n; ++n8) {
                                int n17 = aqp_2.b(chunk, k + n13, n8 + n14) + 1;
                                IBlockState iBlockState = BlocksInvoker.t(Blocks.air);
                                if (n17 > 1) {
                                    if (BlocksInvoker.b(BlockStateInvoker.getBlock(iBlockState = aqp_2.b(chunk, ain_1.a(z6_02, k + n13, --n17, n8 + n14))), iBlockState) == MapColor.q) {
                                        // empty if block
                                    }
                                    if (akm_1.f(BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(iBlockState)))) {
                                        Block block;
                                        n7 = n17 - 1;
                                        do {
                                            block = aqp_2.b(chunk, k + n13, n7--, n8 + n14);
                                            ++n15;
                                        } while (akm_1.f(BlocksInvoker.getBlockState(block)));
                                    }
                                }
                                d2 += (double)n17 / (double)(n * n);
                                JO.a((Multiset)hashMultiset, BlocksInvoker.b(BlockStateInvoker.getBlock(iBlockState), iBlockState));
                            }
                        }
                    }
                    n15 /= n * n;
                    double d3 = (d2 - d) * 4.0 / (double)(n + 4) + ((double)(i + j & 1) - 0.5) * 0.4;
                    n8 = 1;
                    if (d3 > 0.6) {
                        n8 = 2;
                    }
                    if (d3 < -0.6) {
                        n8 = 0;
                    }
                    if ((mapColor = (MapColor)DZ.a((Iterable)a5A.a((Multiset)hashMultiset), MapColor.q)) == MapColor.b) {
                        d3 = (double)n15 * 0.1 + (double)(i + j & 1) * 0.2;
                        n8 = 1;
                        if (d3 < 0.5) {
                            n8 = 2;
                        }
                        if (d3 > 0.9) {
                            n8 = 0;
                        }
                    }
                    d = d2;
                    if (n9 * n9 + n10 * n10 >= n6 * n6 || (i + j & 1) == 0 || (by = wp_12.d[i + j * 128]) == (n7 = (int)((byte)(mapColor.p * 4 + n8)))) continue;
                    wp_12.d[i + j * 128] = n7;
                    sl_2.a(wp_12, i, j);
                }
            }
        }
    }

    @Override
    public void a(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        if (act_2.b(itemStack) && tn_0.c(act_2.a(itemStack), aKI.j)) {
            wp_1 wp_12 = Items.filled_map.a(itemStack, world);
            act_2.a(itemStack, aV8.a(world, aKI.i));
            wp_1 wp_13 = new wp_1(aL0.c(aL0.a(new StringBuilder(), aKI.c), act_2.c(itemStack)).toString());
            wp_13.c = (byte)(wp_12.c + 1);
            if (wp_13.c > 4) {
                wp_13.c = (byte)4;
            }
            sl_2.a(wp_13, wp_12.g, wp_12.f, wp_13.c);
            wp_13.j = wp_12.j;
            sl_2.a(wp_13);
            aV8.a(world, aL0.c(aL0.a(new StringBuilder(), aKI.f), act_2.c(itemStack)).toString(), wp_13);
        }
    }

    @Override
    public void a(ItemStack itemStack, World world, Entity entity, int n, boolean bl) {
        if (!world.isRemote) {
            wp_1 wp_12 = this.a(itemStack, world);
            if (entity instanceof EntityPlayer) {
                EntityPlayer entityPlayer = (EntityPlayer)entity;
                sl_2.a(wp_12, entityPlayer, itemStack);
            }
            this.a(world, entity, wp_12);
        }
    }

    public wp_1 a(ItemStack itemStack, World world) {
        String string = aL0.c(aL0.a(new StringBuilder(), aKI.k), act_2.c(itemStack)).toString();
        wp_1 wp_12 = (wp_1)aV8.a(world, wp_1.class, string);
        if (!world.isRemote) {
            act_2.a(itemStack, aV8.a(world, aKI.b));
            string = aL0.c(aL0.a(new StringBuilder(), aKI.d), act_2.c(itemStack)).toString();
            wp_12 = new wp_1(string);
            wp_12.c = (byte)3;
            sl_2.a(wp_12, uv_2.v(aV8.s(world)), uv_2.q(aV8.s(world)), wp_12.c);
            wp_12.j = (byte)qq_2.j(world.d);
            sl_2.a(wp_12);
            aV8.a(world, string, wp_12);
        }
        return wp_12;
    }

    protected ItemMap() {
        this.a(true);
    }

    @Override
    public Packet a(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        return sl_2.a(this.a(itemStack, world), itemStack, world, entityPlayer);
    }
}

