/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.NBTInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.ITileEntityProvider;
import net.minecraft.item.ItemStack;
import deobf.NBTBase;
import deobf.TileEntity;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Renamed from net.oQ
 */
public class oq_1
extends Entity {
    private float aj = 2.0f;
    private int ao = 40;
    public boolean an = true;
    private boolean al;
    public NBTTagCompound ak;
    private IBlockState ap;
    public int am;
    private boolean aq;

    @Override
    protected void g() {
    }

    @Override
    public boolean f() {
        return false;
    }

    public oq_1(World world, double d, double d2, double d3, IBlockState iBlockState) {
        super(world);
        this.ap = iBlockState;
        this.P = true;
        this.c(0.98f, 0.98f);
        this.j(d, d2, d3);
        this.motionX = 0.0;
        this.motionY = 0.0;
        this.motionZ = 0.0;
        this.prevPosX = d;
        this.prevPosY = d2;
        this.prevPosZ = d3;
    }

    public World b() {
        return this.worldObj;
    }

    @Override
    public void b(float f, float f2) {
        Block block = BlockStateInvoker.getBlock(this.ap);
        if (this.al) {
            int n = MathHelper.c(f - 1.0f);
            ArrayList arrayList = my_0.a((Iterable)aV8.a(this.worldObj, (Entity)this, this.getEntityBoundingBox()));
            boolean bl = block == Blocks.J;
            DamageSource damageSource = DamageSource.u;
            Iterator iterator = ListInvoker.iterator(arrayList);
            while (dz_0.c(iterator)) {
                Entity entity = (Entity)dz_0.b(iterator);
                entity.a(damageSource, (float)MathInvoker.b(MathHelper.f((float)n * this.aj), this.ao));
            }
            if ((double)a5_0.e(this.Q) < (double)0.05f + (double)n * 0.05) {
                int n2 = P8.b((Integer)BlockStateInvoker.b(this.ap, gc_2.R));
                if (++n2 > 2) {
                    this.aq = true;
                } else {
                    this.ap = BlockStateInvoker.a(this.ap, gc_2.R, P8.d(n2));
                }
            }
        }
    }

    @Override
    public void onUpdate() {
        Block block = BlockStateInvoker.getBlock(this.ap);
        if (BlocksInvoker.getBlockState(block) == Material.air) {
            this.E();
        } else {
            BlockPos blockPos;
            this.prevPosX = this.posX;
            this.prevPosY = this.posY;
            this.prevPosZ = this.posZ;
            if (this.am++ == 0) {
                blockPos = new BlockPos(this);
                if (BlockStateInvoker.getBlock(aV8.q(this.worldObj, blockPos)) == block) {
                    aV8.j(this.worldObj, blockPos);
                } else if (!this.worldObj.isRemote) {
                    this.E();
                    return;
                }
            }
            this.motionY -= (double)0.04f;
            this.moveEntity(this.motionX, this.motionY, this.motionZ);
            this.motionX *= (double)0.98f;
            this.motionY *= (double)0.98f;
            this.motionZ *= (double)0.98f;
            if (!this.worldObj.isRemote) {
                blockPos = new BlockPos(this);
                if (this.onGround) {
                    this.motionX *= (double)0.7f;
                    this.motionZ *= (double)0.7f;
                    this.motionY *= -0.5;
                    if (BlockStateInvoker.getBlock(aV8.q(this.worldObj, blockPos)) != Blocks.aR) {
                        this.E();
                        if (!this.aq) {
                            if (aV8.a(this.worldObj, block, blockPos, true, EnumFacing.UP, null, null) && !kc_0.a(this.worldObj, amv_2.g(blockPos)) && aV8.a(this.worldObj, blockPos, this.ap, 3)) {
                                if (block instanceof BlockFalling) {
                                    kc_0.a((BlockFalling)block, this.worldObj, blockPos);
                                }
                                if (this.ak != null && block instanceof ITileEntityProvider) {
                                    TileEntity tileEntity = aV8.z(this.worldObj, blockPos);
                                    NBTTagCompound nBTTagCompound = new NBTTagCompound();
                                    tileEntity.c(nBTTagCompound);
                                    Iterator iterator = aS0.f(tn_0.c(this.ak));
                                    while (dz_0.c(iterator)) {
                                        String string = (String)dz_0.b(iterator);
                                        NBTBase nBTBase = tn_0.h(this.ak, string);
                                        if (string.equals(a3d_0.m) || string.equals(a3d_0.f) || string.equals(a3d_0.l)) continue;
                                        tn_0.a(nBTTagCompound, string, a5N.a(nBTBase));
                                    }
                                    tileEntity.a(nBTTagCompound);
                                    NBTInvoker.k(tileEntity);
                                }
                            } else if (this.an && J9.c(aV8.k(this.worldObj), a3d_0.y)) {
                                this.a(new ItemStack(block, 1, BlocksInvoker.a(block, this.ap)), 0.0f);
                            }
                        }
                    }
                } else if (this.am > 100 && !this.worldObj.isRemote && (amv_2.h(blockPos) < 1 || amv_2.h(blockPos) > 256) || this.am > 600) {
                    if (this.an && J9.c(aV8.k(this.worldObj), a3d_0.t)) {
                        this.a(new ItemStack(block, 1, BlocksInvoker.a(block, this.ap)), 0.0f);
                    }
                    this.E();
                }
            }
        }
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        Block block = this.ap != null ? BlockStateInvoker.getBlock(this.ap) : Blocks.air;
        ResourceLocation cfr_ignored_0 = (ResourceLocation)a82.b(Block.m, block);
        tn_0.a(nBTTagCompound, a3d_0.g, a3d_0.e);
        tn_0.a(nBTTagCompound, a3d_0.j, (byte)BlocksInvoker.c(block, this.ap));
        tn_0.a(nBTTagCompound, a3d_0.a, (byte)this.am);
        tn_0.a(nBTTagCompound, a3d_0.o, this.an);
        tn_0.a(nBTTagCompound, a3d_0.k, this.al);
        tn_0.a(nBTTagCompound, a3d_0.i, this.aj);
        tn_0.b(nBTTagCompound, a3d_0.h, this.ao);
        if (this.ak != null) {
            tn_0.a(nBTTagCompound, a3d_0.q, (NBTBase)this.ak);
        }
    }

    @Override
    protected void g(NBTTagCompound nBTTagCompound) {
        int n = tn_0.e(nBTTagCompound, a3d_0.b) & 0xFF;
        this.ap = tn_0.a(nBTTagCompound, a3d_0.w, 8) ? BlocksInvoker.a(BlocksInvoker.a(tn_0.m(nBTTagCompound, a3d_0.A)), n) : (tn_0.a(nBTTagCompound, a3d_0.x, 99) ? BlocksInvoker.a(BlocksInvoker.a(tn_0.g(nBTTagCompound, a3d_0.n)), n) : BlocksInvoker.a(BlocksInvoker.a(tn_0.e(nBTTagCompound, a3d_0.B) & 0xFF), n));
        this.am = tn_0.e(nBTTagCompound, a3d_0.v) & 0xFF;
        Block block = BlockStateInvoker.getBlock(this.ap);
        if (tn_0.a(nBTTagCompound, a3d_0.p, 99)) {
            this.al = tn_0.c(nBTTagCompound, a3d_0.C);
            this.aj = tn_0.k(nBTTagCompound, a3d_0.c);
            this.ao = tn_0.g(nBTTagCompound, a3d_0.u);
        } else if (block == Blocks.J) {
            this.al = true;
        }
        if (tn_0.a(nBTTagCompound, a3d_0.D, 99)) {
            this.an = tn_0.c(nBTTagCompound, a3d_0.s);
        }
        if (tn_0.a(nBTTagCompound, a3d_0.d, 10)) {
            this.ak = tn_0.d(nBTTagCompound, a3d_0.r);
        }
        if (BlocksInvoker.getBlockState(block) == Material.air) {
            this.ap = aav_1.a(Blocks.sand);
        }
    }

    public void h(boolean bl) {
        this.al = bl;
    }

    @Override
    public void a(CrashReportCategory crashReportCategory) {
        super.a(crashReportCategory);
        if (this.ap != null) {
            Block block = BlockStateInvoker.getBlock(this.ap);
            CrashReportCategoryInvoker.addCrashSection(crashReportCategory, a3d_0.E, P8.d(BlocksInvoker.v(block)));
            CrashReportCategoryInvoker.addCrashSection(crashReportCategory, a3d_0.z, P8.d(BlocksInvoker.c(block, this.ap)));
        }
    }

    public IBlockState a() {
        return this.ap;
    }

    @Override
    protected boolean p() {
        return false;
    }

    @Override
    public boolean N() {
        return !this.isDead;
    }

    public oq_1(World world) {
        super(world);
    }
}

