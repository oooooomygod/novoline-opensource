/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ObjectMouseOverInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Entity;
import deobf.EntityBoat;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import deobf.Vec3;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from net.Lr
 */
public class lr_0
extends Item {
    public lr_0() {
        this.c = 1;
        this.a(CreativeTabs.f);
    }

    @Override
    public ItemStack b(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        Entity entity;
        float f = 1.0f;
        float f2 = entityPlayer.prevRotationPitch + (entityPlayer.rotationPitch - entityPlayer.prevRotationPitch) * f;
        float f3 = entityPlayer.prevRotationYaw + (entityPlayer.rotationYaw - entityPlayer.prevRotationYaw) * f;
        double d = entityPlayer.prevPosX + (entityPlayer.posX - entityPlayer.prevPosX) * (double)f;
        double d2 = entityPlayer.prevPosY + (entityPlayer.posY - entityPlayer.prevPosY) * (double)f + (double)a6w_0.q(entityPlayer);
        double d3 = entityPlayer.prevPosZ + (entityPlayer.posZ - entityPlayer.prevPosZ) * (double)f;
        Vec3 vec3 = new Vec3(d, d2, d3);
        float f4 = MathHelper.cos(-f3 * ((float)Math.PI / 180) - (float)Math.PI);
        float f5 = MathHelper.sin(-f3 * ((float)Math.PI / 180) - (float)Math.PI);
        float f6 = -MathHelper.cos(-f2 * ((float)Math.PI / 180));
        float f7 = MathHelper.sin(-f2 * ((float)Math.PI / 180));
        float f8 = f5 * f6;
        float f9 = f4 * f6;
        double d4 = 5.0;
        Vec3 vec32 = aNE.a(vec3, (double)f8 * d4, (double)f7 * d4, (double)f9 * d4);
        MovingObjectPosition movingObjectPosition = aV8.a(world, vec3, vec32, true);
        Vec3 vec33 = a6w_0.c(entityPlayer, f);
        float f10 = 1.0f;
        List list = aV8.a(world, (Entity)entityPlayer, h__0.d(h__0.a(a6w_0.E(entityPlayer), vec33.xCoord * d4, vec33.yCoord * d4, vec33.zCoord * d4), f10, f10, f10));
        Object object = ListInvoker.iterator(list);
        while (dz_0.c((Iterator)object)) {
            entity = (Entity)dz_0.b((Iterator)object);
            if (!ayj_0.z(entity)) continue;
            float f11 = ayj_0.F(entity);
            rm_2 rm_22 = h__0.d(ayj_0.u(entity), f11, f11, f11);
            if (!h__0.a(rm_22, vec3)) continue;
        }
        if (movingObjectPosition.typeOfHit == I.BLOCK) {
            object = ObjectMouseOverInvoker.getBlockPos(movingObjectPosition);
            if (BlockStateInvoker.getBlock(aV8.q(world, (BlockPos)object)) == Blocks.cm) {
                object = amv_2.g((BlockPos)object);
            }
            entity = new EntityBoat(world, (float)amv_2.j((BlockPos)object) + 0.5f, (float)amv_2.h((BlockPos)object) + 1.0f, (float)amv_2.i((BlockPos)object) + 0.5f);
            ((EntityBoat)entity).rotationYaw = ((MathHelper.floor_double((double)(entityPlayer.rotationYaw * 4.0f / 360.0f) + 0.5) & 3) - 1) * 90;
            if (!ListInvoker.isEmpty(aV8.b(world, entity, h__0.d(qb_0.d((EntityBoat)entity), -0.1, -0.1, -0.1)))) {
                return itemStack;
            }
            if (!world.isRemote) {
                aV8.b(world, entity);
            }
            if (!aSY.a(entityPlayer.abilities)) {
                --itemStack.a;
            }
            a6w_0.a(entityPlayer, aop_1.p[Item.b(this)]);
        }
        return itemStack;
    }
}

