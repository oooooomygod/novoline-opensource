/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import deobf.Entity;
import deobf.Vec3;
import net.minecraft.block.BlockPos;
import deobf.EnumFacing;
import net.I;
import net.aIK;
import net.aL0;

public class MovingObjectPosition {
    public Vec3 b;
    public EnumFacing facing;
    private BlockPos e;
    public I typeOfHit;
    public Entity entityHit;

    public MovingObjectPosition(Entity entity, Vec3 vec3) {
        this.typeOfHit = I.ENTITY;
        this.entityHit = entity;
        this.b = vec3;
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aIK.b), (Object)this.typeOfHit), aIK.c), this.e), aIK.a), this.facing), aIK.e), this.b), aIK.d), this.entityHit), '}').toString();
    }

    public BlockPos a() {
        return this.e;
    }

    public MovingObjectPosition(I i, Vec3 vec3, EnumFacing enumFacing, BlockPos blockPos) {
        this.typeOfHit = i;
        this.e = blockPos;
        this.facing = enumFacing;
        this.b = new Vec3(vec3.xCoord, vec3.yCoord, vec3.zCoord);
    }

    public MovingObjectPosition(Vec3 vec3, EnumFacing enumFacing, BlockPos blockPos) {
        this(I.BLOCK, vec3, enumFacing, blockPos);
    }

    public MovingObjectPosition(Entity entity) {
        this(entity, new Vec3(entity.posX, entity.posY, entity.posZ));
    }

    public MovingObjectPosition(Vec3 vec3, EnumFacing enumFacing) {
        this(I.BLOCK, vec3, enumFacing, BlockPos.m);
    }
}

