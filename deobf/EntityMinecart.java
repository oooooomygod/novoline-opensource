/*
 * Decompiled with CFR 0.152.
 */
package deobf;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ProfilerInvoker;
import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import net.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import deobf.Vec3;
import java.util.Iterator;


public abstract class EntityMinecart
extends Entity
implements arf_2 {
    private double am;
    private double ao;
    private int as;
    private double at;
    private double al;
    private static int[][][] ak = new int[][][]{new int[][]{{0, 0, -1}, {0, 0, 1}}, new int[][]{{-1, 0, 0}, {1, 0, 0}}, new int[][]{{-1, -1, 0}, {1, 0, 0}}, new int[][]{{-1, 0, 0}, {1, -1, 0}}, new int[][]{{0, 0, -1}, {0, -1, 1}}, new int[][]{{0, -1, -1}, {0, 0, 1}}, new int[][]{{0, 0, 1}, {1, 0, 0}}, new int[][]{{0, 0, 1}, {-1, 0, 0}}, new int[][]{{0, 0, -1}, {-1, 0, 0}}, new int[][]{{0, 0, -1}, {1, 0, 0}}};
    private double aq;
    private double ap;
    private double au;
    private String aj;
    private boolean ar;
    private double an;

    @Override
    public boolean e() {
        return this.aj != null;
    }

    @Override
    public void a(String string) {
        this.aj = string;
    }

    public void a(int n, int n2, int n3, boolean bl) {
    }

    public void h(boolean bl) {
        aom_0.b(this.t(), 22, axt_2.a((byte)1));
    }

    public static EntityMinecart a(World world, double d, double d2, double d3, anf_0 anf_02) {
        switch (anf_02) {
            case CHEST: {
                return new o2_0(world, d, d2, d3);
            }
            case FURNACE: {
                return new o4_0(world, d, d2, d3);
            }
            case TNT: {
                return new o5_0(world, d, d2, d3);
            }
            case SPAWNER: {
                return new oo_2(world, d, d2, d3);
            }
            case HOPPER: {
                return new ol_1(world, d, d2, d3);
            }
            case COMMAND_BLOCK: {
                return new on_2(world, d, d2, d3);
            }
        }
        return new ou_1(world, d, d2, d3);
    }

    public Vec3 a(double d, double d2, double d3, double d4) {
        IBlockState iBlockState;
        int n;
        int n2;
        int n3 = MathHelper.floor_double(d);
        if (ask_1.a(this.worldObj, new BlockPos(n3, (n2 = MathHelper.floor_double(d2)) - 1, n = MathHelper.floor_double(d3)))) {
            --n2;
        }
        if (ask_1.a(iBlockState = aV8.q(this.worldObj, new BlockPos(n3, n2, n)))) {
            az_1 az_12 = (az_1)((Object)BlockStateInvoker.b(iBlockState, ask_1.a((g9_0)BlockStateInvoker.getBlock(iBlockState))));
            d2 = n2;
            if (amm_1.b(az_12)) {
                d2 = n2 + 1;
            }
            int[][] nArray = ak[amm_1.a(az_12)];
            double d5 = nArray[1][0] - nArray[0][0];
            double d6 = nArray[1][2] - nArray[0][2];
            double d7 = MathInvoker.d(d5 * d5 + d6 * d6);
            if (nArray[0][1] != 0 && MathHelper.floor_double(d += (d5 /= d7) * d4) - n3 == nArray[0][0] && MathHelper.floor_double(d3 += (d6 /= d7) * d4) - n == nArray[0][2]) {
                d2 += (double)nArray[0][1];
            } else if (nArray[1][1] != 0 && MathHelper.floor_double(d) - n3 == nArray[1][0] && MathHelper.floor_double(d3) - n == nArray[1][2]) {
                d2 += (double)nArray[1][1];
            }
            return this.a(d, d2, d3);
        }
        return null;
    }

    @Override
    public void u() {
        this.h(-this.h());
        this.c(10);
        this.a(this.g() + this.g() * 10.0f);
    }

    public void i(int n) {
        aom_0.b(this.t(), 21, P8.d(n));
        this.h(true);
    }

    @Override
    public String getName() {
        return this.aj != null ? this.aj : super.getName();
    }

    public void c(int n) {
        aom_0.b(this.l, 17, P8.d(n));
    }

    @Override
    public void j(double d, double d2, double d3) {
        this.posX = d;
        this.posY = d2;
        this.posZ = d3;
        float f = this.width / 2.0f;
        float f2 = this.n;
        this.a(new rm_2(d - (double)f, d2, d3 - (double)f, d + (double)f, d2 + (double)f2, d3 + (double)f));
    }

    protected double j() {
        return 0.4;
    }

    @Override
    protected void g(NBTTagCompound nBTTagCompound) {
        if (tn_0.c(nBTTagCompound, xe_0.c)) {
            tn_0.g(nBTTagCompound, xe_0.l);
            if (tn_0.a(nBTTagCompound, xe_0.q, 8)) {
                BlocksInvoker.a(tn_0.m(nBTTagCompound, xe_0.j));
                this.a(BlocksInvoker.t(Blocks.air));
            } else {
                BlocksInvoker.a(tn_0.g(nBTTagCompound, xe_0.k));
                this.a(BlocksInvoker.t(Blocks.air));
            }
            this.i(tn_0.g(nBTTagCompound, xe_0.i));
        }
        if (tn_0.a(nBTTagCompound, xe_0.e, 8) && !StringInvoker.g(tn_0.m(nBTTagCompound, xe_0.f))) {
            this.aj = tn_0.m(nBTTagCompound, xe_0.n);
        }
    }

    public IBlockState f() {
        return !this.m() ? this.k() : BlocksInvoker.b(aom_0.h(this.t(), 20));
    }

    @Override
    public String y() {
        return this.aj;
    }

    @Override
    public void E() {
        super.E();
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        if (this.m()) {
            tn_0.a(nBTTagCompound, xe_0.h, true);
            IBlockState iBlockState = this.f();
            ResourceLocation cfr_ignored_0 = (ResourceLocation)a82.b(Block.m, BlockStateInvoker.getBlock(iBlockState));
            tn_0.a(nBTTagCompound, xe_0.g, xe_0.m);
            tn_0.b(nBTTagCompound, xe_0.o, BlocksInvoker.c(BlockStateInvoker.getBlock(iBlockState), iBlockState));
            tn_0.b(nBTTagCompound, xe_0.b, this.a());
        }
        if (this.aj != null && !StringInvoker.g(this.aj)) {
            tn_0.a(nBTTagCompound, xe_0.a, this.aj);
        }
    }

    @Override
    public boolean N() {
        return !this.isDead;
    }

    @Override
    public boolean W() {
        return true;
    }

    public void a(IBlockState iBlockState) {
        aom_0.b(this.t(), 20, P8.d(BlocksInvoker.a(iBlockState)));
        this.h(true);
    }

    public int h() {
        return aom_0.h(this.l, 18);
    }

    @Override
    public rm_2 as() {
        return null;
    }

    public IBlockState k() {
        return BlocksInvoker.t(Blocks.air);
    }

    @Override
    public boolean a(DamageSource damageSource, float f) {
        if (!this.worldObj.isRemote && !this.isDead) {
            if (this.a(damageSource)) {
                return false;
            }
            this.h(-this.h());
            this.c(10);
            this.k();
            this.a(this.g() + f * 10.0f);
            boolean bl = aDJ.d(damageSource) instanceof EntityPlayer && aSY.a(((EntityPlayer)aDJ.d((DamageSource)damageSource)).abilities);
            if (this.g() > 40.0f) {
                if (this.h != null) {
                    this.h.mountEntity(null);
                }
                if (!this.e()) {
                    this.E();
                } else {
                    this.a(damageSource);
                }
            }
            return true;
        }
        return true;
    }

    public boolean m() {
        return aom_0.g(this.t(), 22) == 1;
    }

    protected void e() {
        if (this.h != null) {
            this.motionX *= (double)0.997f;
            this.motionY *= 0.0;
            this.motionZ *= (double)0.997f;
        } else {
            this.motionX *= (double)0.96f;
            this.motionY *= 0.0;
            this.motionZ *= (double)0.96f;
        }
    }

    public float g() {
        return aom_0.a(this.l, 19);
    }

    public int n() {
        return aom_0.h(this.l, 17);
    }

    @Override
    public void a(double d, double d2, double d3, float f, float f2, int n, boolean bl) {
        this.an = d;
        this.ao = d2;
        this.ap = d3;
        this.al = f;
        this.aq = f2;
        this.as = n + 2;
        this.motionX = this.au;
        this.motionY = this.am;
        this.motionZ = this.at;
    }

    @Override
    public double i() {
        return 0.0;
    }

    protected void a(BlockPos blockPos, IBlockState iBlockState) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        this.fallDistance = 0.0f;
        Vec3 vec3 = this.a(this.posX, this.posY, this.posZ);
        this.posY = amv_2.h(blockPos);
        g9_0 g9_02 = (g9_0)BlockStateInvoker.getBlock(iBlockState);
        if (g9_02 == Blocks.bg) {
            auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, g0_0.Q));
        }
        az_1 az_12 = (az_1)((Object)BlockStateInvoker.b(iBlockState, ask_1.a(g9_02)));
        switch (az_12) {
            case ASCENDING_EAST: {
                this.motionX -= 0.0078125;
                this.posY += 1.0;
                break;
            }
            case ASCENDING_WEST: {
                this.motionX += 0.0078125;
                this.posY += 1.0;
                break;
            }
            case ASCENDING_NORTH: {
                this.motionZ += 0.0078125;
                this.posY += 1.0;
                break;
            }
            case ASCENDING_SOUTH: {
                this.motionZ -= 0.0078125;
                this.posY += 1.0;
            }
        }
        int[][] nArray = ak[amm_1.a(az_12)];
        double d9 = nArray[1][0] - nArray[0][0];
        double d10 = nArray[1][2] - nArray[0][2];
        double d11 = MathInvoker.d(d9 * d9 + d10 * d10);
        double d12 = this.motionX * d9 + this.motionZ * d10;
        if (d12 < 0.0) {
            d9 = -d9;
            d10 = -d10;
        }
        if ((d8 = MathInvoker.d(this.motionX * this.motionX + this.motionZ * this.motionZ)) > 2.0) {
            d8 = 2.0;
        }
        this.motionX = d8 * d9 / d11;
        this.motionZ = d8 * d10 / d11;
        if (this.h instanceof EntityLivingBase && (d7 = (double)((EntityLivingBase)this.h).moveForward) > 0.0) {
            d6 = -MathHelper.h(this.h.rotationYaw * (float)Math.PI / 180.0f);
            d5 = MathHelper.b(this.h.rotationYaw * (float)Math.PI / 180.0f);
            d4 = this.motionX * this.motionX + this.motionZ * this.motionZ;
            if (d4 < 0.01) {
                this.motionX += d6 * 0.1;
                this.motionZ += d5 * 0.1;
            }
        }
        if ((d7 = MathInvoker.d(this.motionX * this.motionX + this.motionZ * this.motionZ)) < 0.03) {
            this.motionX *= 0.0;
            this.motionY *= 0.0;
            this.motionZ *= 0.0;
        } else {
            this.motionX *= 0.5;
            this.motionY *= 0.0;
            this.motionZ *= 0.5;
        }
        d6 = (double)amv_2.j(blockPos) + 0.5 + (double)nArray[0][0] * 0.5;
        d5 = (double)amv_2.i(blockPos) + 0.5 + (double)nArray[0][2] * 0.5;
        d4 = (double)amv_2.j(blockPos) + 0.5 + (double)nArray[1][0] * 0.5;
        double d13 = (double)amv_2.i(blockPos) + 0.5 + (double)nArray[1][2] * 0.5;
        d9 = d4 - d6;
        d10 = d13 - d5;
        if (d9 == 0.0) {
            this.posX = (double)amv_2.j(blockPos) + 0.5;
            d7 = this.posZ - (double)amv_2.i(blockPos);
        } else if (d10 == 0.0) {
            this.posZ = (double)amv_2.i(blockPos) + 0.5;
            d7 = this.posX - (double)amv_2.j(blockPos);
        } else {
            d3 = this.posX - d6;
            d2 = this.posZ - d5;
            d7 = (d3 * d9 + d2 * d10) * 2.0;
        }
        this.posX = d6 + d9 * d7;
        this.posZ = d5 + d10 * d7;
        this.j(this.posX, this.posY, this.posZ);
        d3 = this.motionX;
        d2 = this.motionZ;
        if (this.h != null) {
            d3 *= 0.75;
            d2 *= 0.75;
        }
        double d14 = this.j();
        d3 = MathHelper.b(d3, -d14, d14);
        d2 = MathHelper.b(d2, -d14, d14);
        this.moveEntity(d3, 0.0, d2);
        if (nArray[0][1] != 0 && MathHelper.floor_double(this.posX) - amv_2.j(blockPos) == nArray[0][0] && MathHelper.floor_double(this.posZ) - amv_2.i(blockPos) == nArray[0][2]) {
            this.j(this.posX, this.posY + (double)nArray[0][1], this.posZ);
        } else if (nArray[1][1] != 0 && MathHelper.floor_double(this.posX) - amv_2.j(blockPos) == nArray[1][0] && MathHelper.floor_double(this.posZ) - amv_2.i(blockPos) == nArray[1][2]) {
            this.j(this.posX, this.posY + (double)nArray[1][1], this.posZ);
        }
        this.e();
        Vec3 vec32 = this.a(this.posX, this.posY, this.posZ);
        double d15 = (vec3.yCoord - vec32.yCoord) * 0.05;
        d8 = MathInvoker.d(this.motionX * this.motionX + this.motionZ * this.motionZ);
        if (d8 > 0.0) {
            this.motionX = this.motionX / d8 * (d8 + d15);
            this.motionZ = this.motionZ / d8 * (d8 + d15);
        }
        this.j(this.posX, vec32.yCoord, this.posZ);
        int n = MathHelper.floor_double(this.posX);
        int n2 = MathHelper.floor_double(this.posZ);
        if (n != amv_2.j(blockPos) || n2 != amv_2.i(blockPos)) {
            d8 = MathInvoker.d(this.motionX * this.motionX + this.motionZ * this.motionZ);
            this.motionX = d8 * (double)(n - amv_2.j(blockPos));
            this.motionZ = d8 * (double)(n2 - amv_2.i(blockPos));
        }
        if ((d = MathInvoker.d(this.motionX * this.motionX + this.motionZ * this.motionZ)) > 0.01) {
            double d16 = 0.06;
            this.motionX += this.motionX / d * d16;
            this.motionZ += this.motionZ / d * d16;
        } else if (az_12 == az_1.EAST_WEST) {
            if (BlocksInvoker.x(BlockStateInvoker.getBlock(aV8.q(this.worldObj, amv_2.d(blockPos))))) {
                this.motionX = 0.02;
            } else if (BlocksInvoker.x(BlockStateInvoker.getBlock(aV8.q(this.worldObj, amv_2.f(blockPos))))) {
                this.motionX = -0.02;
            }
        } else if (az_12 == az_1.NORTH_SOUTH) {
            if (BlocksInvoker.x(BlockStateInvoker.getBlock(aV8.q(this.worldObj, amv_2.a(blockPos))))) {
                this.motionZ = 0.02;
            } else if (BlocksInvoker.x(BlockStateInvoker.getBlock(aV8.q(this.worldObj, amv_2.b(blockPos))))) {
                this.motionZ = -0.02;
            }
        }
    }

    public abstract anf_0 d();

    public int a() {
        return !this.m() ? this.i() : aom_0.h(this.t(), 21);
    }

    @Override
    public void e(Entity entity) {
        if (!(this.worldObj.isRemote || entity.H || this.H || entity == this.h)) {
            double d;
            double d2;
            double d3;
            if (entity instanceof EntityLivingBase && !(entity instanceof EntityPlayer) && !(entity instanceof nf_2) && this.d() == anf_0.RIDEABLE && this.motionX * this.motionX + this.motionZ * this.motionZ > 0.01 && this.h == null && entity.r == null) {
                entity.mountEntity(this);
            }
            if ((d3 = (d2 = entity.posX - this.posX) * d2 + (d = entity.posZ - this.posZ) * d) >= (double)1.0E-4f) {
                d3 = MathHelper.e(d3);
                d2 /= d3;
                d /= d3;
                double d4 = 1.0 / d3;
                if (d4 > 1.0) {
                    d4 = 1.0;
                }
                d2 *= d4;
                d *= d4;
                d2 *= (double)0.1f;
                d *= (double)0.1f;
                d2 *= (double)(1.0f - this.X);
                d *= (double)(1.0f - this.X);
                d2 *= 0.5;
                d *= 0.5;
                if (entity instanceof EntityMinecart) {
                    Vec3 vec3;
                    double d5 = entity.posX - this.posX;
                    double d6 = entity.posZ - this.posZ;
                    Vec3 vec32 = aNE.b(new Vec3(d5, 0.0, d6));
                    double d7 = MathInvoker.a(aNE.c(vec32, vec3 = aNE.b(new Vec3(MathHelper.cos(this.rotationYaw * (float)Math.PI / 180.0f), 0.0, MathHelper.sin(this.rotationYaw * (float)Math.PI / 180.0f)))));
                    if (d7 < (double)0.8f) {
                        return;
                    }
                    double d8 = entity.motionX + this.motionX;
                    double d9 = entity.motionZ + this.motionZ;
                    if (((EntityMinecart)entity).d() == anf_0.FURNACE && this.d() != anf_0.FURNACE) {
                        this.motionX *= (double)0.2f;
                        this.motionZ *= (double)0.2f;
                        this.b(entity.motionX - d2, 0.0, entity.motionZ - d);
                        entity.motionX *= (double)0.95f;
                        entity.motionZ *= (double)0.95f;
                    } else if (((EntityMinecart)entity).d() != anf_0.FURNACE && this.d() == anf_0.FURNACE) {
                        entity.motionX *= (double)0.2f;
                        entity.motionZ *= (double)0.2f;
                        entity.b(this.motionX + d2, 0.0, this.motionZ + d);
                        this.motionX *= (double)0.95f;
                        this.motionZ *= (double)0.95f;
                    } else {
                        this.motionX *= (double)0.2f;
                        this.motionZ *= (double)0.2f;
                        this.b((d8 /= 2.0) - d2, 0.0, (d9 /= 2.0) - d);
                        entity.motionX *= (double)0.2f;
                        entity.motionZ *= (double)0.2f;
                        entity.b(d8 + d2, 0.0, d9 + d);
                    }
                } else {
                    this.b(-d2, 0.0, -d);
                    entity.b(d2 / 4.0, 0.0, d / 4.0);
                }
            }
        }
    }

    public EntityMinecart(World world, double d, double d2, double d3) {
        this(world);
        this.j(d, d2, d3);
        this.motionX = 0.0;
        this.motionY = 0.0;
        this.motionZ = 0.0;
        this.prevPosX = d;
        this.prevPosY = d2;
        this.prevPosZ = d3;
    }

    public EntityMinecart(World world) {
        super(world);
        this.P = true;
        this.c(0.98f, 0.7f);
    }

    @Override
    public IChatComponent getDisplayName() {
        if (this.e()) {
            ChatComponentText chatComponentText = new ChatComponentText(this.aj);
            HX.a(axq_2.b(chatComponentText), this.h());
            HX.a(axq_2.b(chatComponentText), this.J().toString());
            return chatComponentText;
        }
        aoz_1 aoz_12 = new aoz_1(this.getName(), new Object[0]);
        HX.a(aIW.a(aoz_12), this.h());
        HX.a(aIW.a(aoz_12), this.J().toString());
        return aoz_12;
    }

    @Override
    public void e(double d, double d2, double d3) {
        this.au = this.motionX = d;
        this.am = this.motionY = d2;
        this.at = this.motionZ = d3;
    }

    @Override
    protected boolean p() {
        return false;
    }

    @Override
    public rm_2 l(Entity entity) {
        return entity.W() ? entity.getEntityBoundingBox() : null;
    }

    public void a(DamageSource damageSource) {
        this.E();
        if (J9.c(aV8.k(this.worldObj), xe_0.d)) {
            ItemStack itemStack = new ItemStack(Items.minecart, 1);
            if (this.aj != null) {
                act_2.a(itemStack, this.aj);
            }
            this.a(itemStack, 0.0f);
        }
    }

    @Override
    public void onUpdate() {
        int n;
        int n2;
        if (this.n() > 0) {
            this.c(this.n() - 1);
        }
        if (this.g() > 0.0f) {
            this.a(this.g() - 1.0f);
        }
        if (this.posY < -64.0) {
            this.Y();
        }
        if (!this.worldObj.isRemote && this.worldObj instanceof WorldServer) {
            ProfilerInvoker.startSection(this.worldObj.A, xe_0.p);
            MinecraftServer minecraftServer = a3V.m((WorldServer)this.worldObj);
            n2 = this.P();
            if (this.inPortal) {
                if (ServerInvoker.M(minecraftServer)) {
                    if (this.r == null && this.F++ >= n2) {
                        this.F = n2;
                        this.timeUntilPortal = this.L();
                        n = qq_2.j(this.worldObj.d) == -1 ? 0 : -1;
                        this.f(n);
                    }
                    this.inPortal = false;
                }
            } else {
                if (this.F > 0) {
                    this.F -= 4;
                }
                if (this.F < 0) {
                    this.F = 0;
                }
            }
            if (this.timeUntilPortal > 0) {
                --this.timeUntilPortal;
            }
            ProfilerInvoker.endSection(this.worldObj.A);
        }
        if (this.worldObj.isRemote) {
            if (this.as > 0) {
                double d = this.posX + (this.an - this.posX) / (double)this.as;
                double d2 = this.posY + (this.ao - this.posY) / (double)this.as;
                double d3 = this.posZ + (this.ap - this.posZ) / (double)this.as;
                double d4 = MathHelper.j(this.al - (double)this.rotationYaw);
                this.rotationYaw = (float)((double)this.rotationYaw + d4 / (double)this.as);
                this.rotationPitch = (float)((double)this.rotationPitch + (this.aq - (double)this.rotationPitch) / (double)this.as);
                --this.as;
                this.j(d, d2, d3);
            } else {
                this.j(this.posX, this.posY, this.posZ);
            }
            this.d(this.rotationYaw, this.rotationPitch);
        } else {
            double d;
            BlockPos blockPos;
            IBlockState iBlockState;
            this.prevPosX = this.posX;
            this.prevPosY = this.posY;
            this.prevPosZ = this.posZ;
            this.motionY -= (double)0.04f;
            int n3 = MathHelper.floor_double(this.posX);
            if (ask_1.a(this.worldObj, new BlockPos(n3, (n2 = MathHelper.floor_double(this.posY)) - 1, n = MathHelper.floor_double(this.posZ)))) {
                --n2;
            }
            if (ask_1.a(iBlockState = aV8.q(this.worldObj, blockPos = new BlockPos(n3, n2, n)))) {
                this.a(blockPos, iBlockState);
                if (BlockStateInvoker.getBlock(iBlockState) == Blocks.bc) {
                    this.a(n3, n2, n, auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, g0_0.Q)));
                }
            } else {
                this.c();
            }
            this.U();
            this.rotationPitch = 0.0f;
            double d5 = this.prevPosX - this.posX;
            double d6 = this.prevPosZ - this.posZ;
            if (d5 * d5 + d6 * d6 > 0.001) {
                this.rotationYaw = (float)(MathHelper.c(d6, d5) * 180.0 / Math.PI);
                if (this.ar) {
                    this.rotationYaw += 180.0f;
                }
            }
            if ((d = (double)MathHelper.a(this.rotationYaw - this.prevRotationYaw)) < -170.0 || d >= 170.0) {
                this.rotationYaw += 180.0f;
                this.ar = !this.ar;
            }
            this.d(this.rotationYaw, this.rotationPitch);
            Iterator iterator = ListInvoker.iterator(aV8.a(this.worldObj, (Entity)this, h__0.d(this.getEntityBoundingBox(), 0.2f, 0.0, 0.2f)));
            while (dz_0.c(iterator)) {
                Entity entity = (Entity)dz_0.b(iterator);
                if (entity == this.h || !entity.W() || !(entity instanceof EntityMinecart)) continue;
                entity.e(this);
            }
            if (this.h != null && this.h.isDead) {
                if (this.h.r == this) {
                    this.h.r = null;
                }
                this.h = null;
            }
            this.G();
        }
    }

    protected void c() {
        double d = this.j();
        this.motionX = MathHelper.b(this.motionX, -d, d);
        this.motionZ = MathHelper.b(this.motionZ, -d, d);
        if (this.onGround) {
            this.motionX *= 0.5;
            this.motionY *= 0.5;
            this.motionZ *= 0.5;
        }
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        if (!this.onGround) {
            this.motionX *= (double)0.95f;
            this.motionY *= (double)0.95f;
            this.motionZ *= (double)0.95f;
        }
    }

    public void a(float f) {
        aom_0.b(this.l, 19, axx_1.a(f));
    }

    @Override
    protected void g() {
        aom_0.a(this.l, 17, P8.d(0));
        aom_0.a(this.l, 18, P8.d(1));
        aom_0.a(this.l, 19, axx_1.a(0.0f));
        aom_0.a(this.l, 20, P8.d(0));
        aom_0.a(this.l, 21, P8.d(6));
        aom_0.a(this.l, 22, axt_2.a((byte)0));
    }

    public Vec3 a(double d, double d2, double d3) {
        IBlockState iBlockState;
        int n;
        int n2;
        int n3 = MathHelper.floor_double(d);
        if (ask_1.a(this.worldObj, new BlockPos(n3, (n2 = MathHelper.floor_double(d2)) - 1, n = MathHelper.floor_double(d3)))) {
            --n2;
        }
        if (ask_1.a(iBlockState = aV8.q(this.worldObj, new BlockPos(n3, n2, n)))) {
            double d4;
            az_1 az_12 = (az_1)((Object)BlockStateInvoker.b(iBlockState, ask_1.a((g9_0)BlockStateInvoker.getBlock(iBlockState))));
            int[][] nArray = ak[amm_1.a(az_12)];
            double d5 = (double)n3 + 0.5 + (double)nArray[0][0] * 0.5;
            double d6 = (double)n2 + 0.0625 + (double)nArray[0][1] * 0.5;
            double d7 = (double)n + 0.5 + (double)nArray[0][2] * 0.5;
            double d8 = (double)n3 + 0.5 + (double)nArray[1][0] * 0.5;
            double d9 = (double)n2 + 0.0625 + (double)nArray[1][1] * 0.5;
            double d10 = (double)n + 0.5 + (double)nArray[1][2] * 0.5;
            double d11 = d8 - d5;
            double d12 = (d9 - d6) * 2.0;
            double d13 = d10 - d7;
            if (d11 == 0.0) {
                d4 = d3 - (double)n;
            } else if (d13 == 0.0) {
                d4 = d - (double)n3;
            } else {
                double d14 = d - d5;
                double d15 = d3 - d7;
                d4 = (d14 * d11 + d15 * d13) * 2.0;
            }
            d = d5 + d11 * d4;
            d2 = d6 + d12 * d4;
            d3 = d7 + d13 * d4;
            if (d12 < 0.0) {
                d2 += 1.0;
            }
            if (d12 > 0.0) {
                d2 += 0.5;
            }
            return new Vec3(d, d2, d3);
        }
        return null;
    }

    public void h(int n) {
        aom_0.b(this.l, 18, P8.d(n));
    }

    public int i() {
        return 6;
    }
}

