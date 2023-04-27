/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.script;

import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ObjectMouseOverInvoker;
import cc.novoline.invoke.PlayerControllerInvoker;
import cc.novoline.invoke.PlayerInvoker;
import deobf.Entity;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.block.Block;
import deobf.EnumFacing;
import net.I;
import net.K;
import net.P8;
import net.aBO;
import net.aNE;
import net.act_2;
import net.axx_1;
import net.db_0;
import net.px_0;
import net.skidunion.annotations;

public class ScriptPlayer {
    Minecraft mc = MCInvoker.f();

    @annotations
    public Entity getEntity() {
        return this.mc.player;
    }

    @annotations
    public Block getBlock() {
        ScriptWorld.b();
        if (this.mc.objectMouseOver != null) {
            if (this.mc.objectMouseOver.typeOfHit == I.BLOCK) {
                return BlockInvoker.getMaterial(this.mc.world, ObjectMouseOverInvoker.getBlockPos(this.mc.objectMouseOver)).b();
            }
            return null;
        }
        return null;
    }

    @annotations
    public boolean isDead() {
        return this.mc.player.isDead;
    }

    @annotations
    public Number getPitch() {
        return axx_1.a(this.mc.player.rotationPitch);
    }

    @annotations
    public Number hurtResistantTime() {
        return P8.d(this.mc.player.hurtResistantTime);
    }

    @annotations
    public Number getCursorY() {
        ScriptWorld.b();
        if (this.mc.objectMouseOver != null) {
            return db_0.a(aNE.a(this.mc.objectMouseOver.b));
        }
        return null;
    }

    @annotations
    public Number setZ(double d) {
        this.mc.player.posZ = d;
        return db_0.a(d);
    }

    @annotations
    public Number getFallDistance() {
        return axx_1.a(this.mc.player.fallDistance);
    }

    @annotations
    public Number getFoodLevel() {
        return P8.d(K.b(PlayerInvoker.a(this.mc.player)));
    }

    @annotations
    public boolean isInWater() {
        return this.mc.player.isInWater();
    }

    @annotations
    public Number getCursorZ() {
        ScriptWorld.b();
        if (this.mc.objectMouseOver != null) {
            return db_0.a(aNE.d(this.mc.objectMouseOver.b));
        }
        return null;
    }

    @annotations
    public boolean isOnGround() {
        return this.mc.player.onGround;
    }

    @annotations
    public Number getPrevPosZ() {
        return db_0.a(this.mc.player.prevPosZ);
    }

    @annotations
    public Number getMotionY() {
        return db_0.a(this.mc.player.motionY);
    }

    @annotations
    public Number setMotionZ(double d) {
        this.mc.player.motionZ = d;
        this.mc.player.motionY = d;
        return db_0.a(this.mc.player.motionY);
    }

    @annotations
    public void sendMessage(String string) {
        PlayerInvoker.b(this.mc.player, string);
    }

    @annotations
    public Number getLastTickDistance() {
        ScriptWorld.b();
        Double d = db_0.a(MathInvoker.e(this.mc.player.posX - this.mc.player.prevPosX, this.mc.player.posZ - this.mc.player.prevPosZ));
        if (ListInvoker.b() != null) {
            ScriptWorld.b(new int[2]);
        }
        return d;
    }

    @annotations
    public boolean isBurning() {
        return this.mc.player.ag();
    }

    @annotations
    public void setSneaking(boolean bl) {
        this.mc.player.e(bl);
    }

    @annotations
    public String getDisplayName() {
        return aBO.a(PlayerInvoker.Z(this.mc.player));
    }

    @annotations
    public void jump() {
        this.mc.player.l();
    }

    @annotations
    public boolean isInLava() {
        return this.mc.player.o();
    }

    @annotations
    public boolean isCollidedVertically() {
        return this.mc.player.v;
    }

    @annotations
    public Number getCursorX() {
        ScriptWorld.b();
        if (this.mc.objectMouseOver != null) {
            return db_0.a(aNE.e(this.mc.objectMouseOver.b));
        }
        return null;
    }

    @annotations
    public EnumFacing getFace() {
        ScriptWorld.b();
        if (this.mc.objectMouseOver != null) {
            if (this.mc.objectMouseOver.typeOfHit == I.BLOCK) {
                return this.mc.objectMouseOver.facing;
            }
            return null;
        }
        return null;
    }

    @annotations
    public String getTagCompound() {
        return act_2.a(this.mc.player.ah()).toString();
    }

    @annotations
    public void setSprinting(boolean bl) {
        this.mc.player.setSprinting(bl);
    }

    @annotations
    public Number getPrevPosY() {
        return db_0.a(this.mc.player.prevPosZ);
    }

    @annotations
    public Number getBaseMoveSpeed() {
        return db_0.a(PlayerInvoker.M(this.mc.player));
    }

    @annotations
    public boolean isMoving() {
        return this.mc.player.isMoving();
    }

    @annotations
    public ItemStack getHeldItem() {
        return this.mc.player.ah();
    }

    @annotations
    public void leftClick() {
        MCInvoker.s(this.mc);
    }

    @annotations
    public Number getSpeed() {
        return db_0.a(PlayerInvoker.r(this.mc.player));
    }

    @annotations
    public void setSpeed(double d) {
        this.mc.player.setSpeed(d);
    }

    @annotations
    public String getName() {
        return this.mc.player.getName();
    }

    @annotations
    public boolean isSprinting() {
        return this.mc.player.isSneaking();
    }

    @annotations
    public Number ticksExisted() {
        return P8.d(this.mc.player.ticksExisted);
    }

    @annotations
    public void setRenderViewEntity(Entity entity) {
        this.mc.a(entity);
    }

    @annotations
    public UUID getUUID() {
        return PlayerInvoker.D(this.mc.player);
    }

    @annotations
    public Number setMotionY(double d) {
        this.mc.player.motionY = d;
        return db_0.a(d);
    }

    @annotations
    public Number getYaw() {
        return axx_1.a(this.mc.player.rotationYaw);
    }

    @annotations
    public Number setY(double d) {
        this.mc.player.posY = d;
        return db_0.a(d);
    }

    @annotations
    public boolean isCollidedHorizontally() {
        return this.mc.player.g;
    }

    @annotations
    public void rightClick() {
        MCInvoker.g(this.mc);
    }

    @annotations
    public void setYaw(float f) {
        this.mc.player.rotationYaw = f;
    }

    @annotations
    public Number getMotionX() {
        return db_0.a(this.mc.player.motionX);
    }

    @annotations
    public Number getMotionZ() {
        return db_0.a(this.mc.player.motionZ);
    }

    @annotations
    public void swingItem() {
        this.mc.player.Z();
    }

    @annotations
    public void attackEntity(Entity entity) {
        PlayerControllerInvoker.a(this.mc.playerController, this.mc.player, entity);
    }

    @annotations
    public Number setX(double d) {
        this.mc.player.posX = d;
        return db_0.a(d);
    }

    @annotations
    public Number getDistanceToEntity2D(Entity entity) {
        return db_0.a(PlayerInvoker.d(this.mc.player, entity));
    }

    @annotations
    public Number getDistanceToEntity(Entity entity) {
        return axx_1.a(PlayerInvoker.b(this.mc.player, entity));
    }

    @annotations
    public Number getHealth() {
        return axx_1.a(PlayerInvoker.aa(this.mc.player));
    }

    @annotations
    public Number getY() {
        return db_0.a(this.mc.player.posY);
    }

    @annotations
    public boolean isSneaking() {
        return this.mc.player.isSneaking();
    }

    @annotations
    public Number getHurtTime() {
        return P8.d(this.mc.player.a8);
    }

    @annotations
    public void setSlot(int n) {
        this.mc.player.inventory.a = n;
    }

    @annotations
    public Number getSlot() {
        return P8.d(this.mc.player.inventory.a);
    }

    @annotations
    public Number setMotionX(double d) {
        this.mc.player.motionX = d;
        this.mc.player.motionY = d;
        return db_0.a(this.mc.player.motionY);
    }

    @annotations
    public String getHeldItemName() {
        return px_0.c(act_2.k(this.mc.player.ah()));
    }

    @annotations
    public String getHeldItemDisplayName() {
        return this.mc.player.ah().r();
    }

    @annotations
    public Number getX() {
        return db_0.a(this.mc.player.posX);
    }

    @annotations
    public void setPosition(double d, double d2, double d3) {
        this.mc.player.j(d, d2, d3);
    }

    @annotations
    public double[] getLookVector() {
        if (this.mc.objectMouseOver != null) {
            return new double[]{aNE.e(this.mc.objectMouseOver.b), aNE.a(this.mc.objectMouseOver.b), aNE.d(this.mc.objectMouseOver.b)};
        }
        return null;
    }

    @annotations
    public Number getZ() {
        return db_0.a(this.mc.player.posZ);
    }

    @annotations
    public void setPitch(float f) {
        this.mc.player.rotationPitch = f;
    }

    @annotations
    public boolean isRiding() {
        return this.mc.player.isRiding();
    }

    @annotations
    public boolean isUsingItem() {
        return this.mc.player.isUsingItem();
    }

    @annotations
    public Number getPrevPosX() {
        return db_0.a(this.mc.player.prevPosX);
    }
}

