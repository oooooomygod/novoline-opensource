/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import deobf.EnumCreateEntityType;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Chunk;
import deobf.Entity;
import deobf.TileEntity;
import java.util.List;
import java.util.Random;

/*
 * Renamed from net.jp
 */
public class jp_2
extends Chunk {
    @Override
    public boolean e(int n, int n2) {
        return n == this.f && n2 == this.v;
    }

    @Override
    public boolean a(int n, int n2) {
        return true;
    }

    @Override
    public int a(BlockPos blockPos, int n) {
        return 0;
    }

    @Override
    public void b(BlockPos blockPos) {
    }

    @Override
    public int d(int n, int n2) {
        return 0;
    }

    public jp_2(World world, int n, int n2) {
        super(world, n, n2);
    }

    @Override
    public boolean e(boolean bl) {
        return false;
    }

    @Override
    public Block c(BlockPos blockPos) {
        return Blocks.air;
    }

    @Override
    public void o() {
    }

    @Override
    public void a(TileEntity tileEntity) {
    }

    @Override
    public void a(YG yG, BlockPos blockPos, int n) {
    }

    @Override
    public void a(Entity entity, int n) {
    }

    @Override
    public void b(Entity entity) {
    }

    @Override
    public void a() {
    }

    @Override
    public boolean g(BlockPos blockPos) {
        return false;
    }

    @Override
    public boolean r() {
        return true;
    }

    @Override
    public void g() {
    }

    @Override
    public Random a(long l4) {
        return new Random(aV8.w(this.m()) + (long)(this.f * this.f * 4987142) + (long)(this.f * 5947611) + (long)(this.v * this.v) * 4392871L + (long)(this.v * 389711) ^ l4);
    }

    @Override
    public void a(Entity entity, rm_2 rm_22, List<Entity> list, Predicate<? super Entity> predicate) {
    }

    @Override
    public void j() {
    }

    @Override
    public <T extends Entity> void a(Class<? extends T> clazz, rm_2 rm_22, List<T> list, Predicate<? super T> predicate) {
    }

    @Override
    public void a(Entity entity) {
    }

    @Override
    public int i(BlockPos blockPos) {
        return 255;
    }

    @Override
    public void l() {
    }

    @Override
    public int h(BlockPos blockPos) {
        return 0;
    }

    @Override
    public int a(YG yG, BlockPos blockPos) {
        return yG.defaultLightValue;
    }

    @Override
    public TileEntity a(BlockPos blockPos, EnumCreateEntityType enumCreateEntityType) {
        return null;
    }

    @Override
    public void a(BlockPos blockPos, TileEntity tileEntity) {
    }
}

