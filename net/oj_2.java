/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net;

import cc.novoline.invoke.MathInvoker;
import com.mojang.authlib.GameProfile;
import net.minecraft.block.BlockPos;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.util.DamageSource;
import deobf.IChatComponent;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;

/*
 * Renamed from net.oj
 */
public class oj_2
extends AbstractClientPlayer {
    private int bY;
    private boolean b0;
    private double bW;
    private double bZ;
    private double b1;
    private double b2;
    private double bX;

    @Override
    public boolean a(int n, String string) {
        return false;
    }

    @Override
    public void addChatComponentMessage(IChatComponent iChatComponent) {
        kp_1.a(GW.f(MCInvoker.f().ingameGUI), iChatComponent);
    }

    @Override
    public BlockPos e() {
        return new BlockPos(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5);
    }

    public oj_2(World world, GameProfile gameProfile) {
        super(world, gameProfile);
        this.U = 0.0f;
        this.H = true;
        this.bJ = 0.25f;
        this.I = 10.0;
    }

    @Override
    public void c(int n, ItemStack itemStack) {
        this.inventory.b[this.inventory.a] = itemStack;
    }

    @Override
    public boolean a(DamageSource damageSource, float f) {
        return true;
    }

    @Override
    public void a(double d, double d2, double d3, float f, float f2, int n, boolean bl) {
        this.bX = d;
        this.bW = d2;
        this.bZ = d3;
        this.b2 = f;
        this.b1 = f2;
        this.bY = n;
    }

    @Override
    public void onUpdate() {
        this.bJ = 0.0f;
        super.onUpdate();
        this.aM = this.aq;
        double d = this.posX - this.prevPosX;
        double d2 = this.posZ - this.prevPosZ;
        float f = MathHelper.e(d * d + d2 * d2) * 4.0f;
        if (f > 1.0f) {
            f = 1.0f;
        }
        this.aq += (f - this.aq) * 0.4f;
        this.aU += this.aq;
        if (!this.b0 && this.aC() && this.inventory.b[this.inventory.a] != null) {
            ItemStack itemStack = this.inventory.b[this.inventory.a];
            this.a(this.inventory.b[this.inventory.a], px_0.e(act_2.k(itemStack), itemStack));
            this.b0 = true;
        } else if (this.b0 && !this.aC()) {
            this.f();
            this.b0 = false;
        }
    }

    @Override
    public void onLivingUpdate() {
        if (this.bY > 0) {
            double d;
            double d2 = this.posX + (this.bX - this.posX) / (double)this.bY;
            double d3 = this.posY + (this.bW - this.posY) / (double)this.bY;
            double d4 = this.posZ + (this.bZ - this.posZ) / (double)this.bY;
            for (d = this.b2 - (double)this.rotationYaw; d < -180.0; d += 360.0) {
            }
            while (d >= 180.0) {
                d -= 360.0;
            }
            this.rotationYaw = (float)((double)this.rotationYaw + d / (double)this.bY);
            this.rotationPitch = (float)((double)this.rotationPitch + (this.b1 - (double)this.rotationPitch) / (double)this.bY);
            --this.bY;
            this.j(d2, d3, d4);
            this.d(this.rotationYaw, this.rotationPitch);
        }
        this.bn = this.bO;
        this.e();
        float f = MathHelper.e(this.motionX * this.motionX + this.motionZ * this.motionZ);
        float f2 = (float)MathInvoker.b(-this.motionY * (double)0.2f) * 15.0f;
        if (f > 0.1f) {
            f = 0.1f;
        }
        if (!this.onGround || this.a() <= 0.0f) {
            f = 0.0f;
        }
        if (this.onGround || this.a() <= 0.0f) {
            f2 = 0.0f;
        }
        this.bO += (f - this.bO) * 0.4f;
        this.ap += (f2 - this.ap) * 0.8f;
    }
}

