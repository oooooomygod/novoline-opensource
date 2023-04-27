/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.script;

import deobf.Entity;
import deobf.EntityLivingBase;
import net.minecraft.item.ItemStack;
import java.util.UUID;
import net.atn_0;
import net.ayj_0;
import net.skidunion.annotations;

public class ScriptEntity {
    @annotations
    public double getPrevPosX(Entity entity) {
        return entity.prevPosX;
    }

    @annotations
    public double getX(Entity entity) {
        return entity.posX;
    }

    @annotations
    public double getPrevPosZ(Entity entity) {
        return entity.prevPosZ;
    }

    @annotations
    public double getHealth(Entity entity) {
        return atn_0.c((EntityLivingBase)entity);
    }

    @annotations
    public boolean isDead(Entity entity) {
        return entity.isDead;
    }

    @annotations
    public double getY(Entity entity) {
        return entity.posY;
    }

    @annotations
    public double getEyeHeight(Entity entity) {
        return ayj_0.n(entity);
    }

    @annotations
    public double getZ(Entity entity) {
        return entity.posZ;
    }

    @annotations
    public double getPrevPosY(Entity entity) {
        return entity.prevPosY;
    }

    @annotations
    public String getName(Entity entity) {
        return ayj_0.x(entity);
    }

    @annotations
    public ItemStack getHeldItem(EntityLivingBase entityLivingBase) {
        return atn_0.z(entityLivingBase);
    }

    @annotations
    public UUID getUUID(Entity entity) {
        return ayj_0.R(entity);
    }
}

