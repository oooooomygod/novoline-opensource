/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.EntityPlayerMP;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import deobf.Vec3;
import java.util.Set;
import java.util.UUID;

/*
 * Renamed from net.nN
 */
public class nn_0
extends ne_2 {
    private static AttributeModifier bJ;
    private static UUID bI;
    private static Set<Block> bK;
    private boolean bH;

    @Override
    protected Item j() {
        return Items.ender_pearl;
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        IBlockState iBlockState = this.a();
        tn_0.a(nBTTagCompound, al8_0.f, (short)BlocksInvoker.v(BlockStateInvoker.getBlock(iBlockState)));
        tn_0.a(nBTTagCompound, al8_0.n, (short)BlocksInvoker.c(BlockStateInvoker.getBlock(iBlockState), iBlockState));
    }

    private boolean c(EntityPlayer entityPlayer) {
        ItemStack itemStack = entityPlayer.inventory.d[3];
        if (act_2.k(itemStack) == px_0.a(Blocks.ap)) {
            return false;
        }
        Vec3 vec3 = aNE.b(entityPlayer.a(1.0f));
        Vec3 vec32 = new Vec3(this.posX - entityPlayer.posX, this.getEntityBoundingBox().a + (double)(this.n / 2.0f) - (entityPlayer.posY + (double)entityPlayer.w()), this.posZ - entityPlayer.posZ);
        double d = aNE.c(vec32);
        double d2 = aNE.c(vec3, vec32 = aNE.b(vec32));
        return d2 > 1.0 - 0.025 / d && entityPlayer.a((Entity)this);
    }

    public boolean v() {
        return aom_0.g(this.l, 18) > 0;
    }

    @Override
    public void onLivingUpdate() {
        if (this.worldObj.isRemote) {
            int n = 0;
            while (true) {
                aV8.a(this.worldObj, B7.PORTAL, this.posX + (a5_0.c(this.Q) - 0.5) * (double)this.width, this.posY + a5_0.c(this.Q) * (double)this.n - 0.25, this.posZ + (a5_0.c(this.Q) - 0.5) * (double)this.width, (a5_0.c(this.Q) - 0.5) * 2.0, -a5_0.c(this.Q), (a5_0.c(this.Q) - 0.5) * 2.0, new int[0]);
                ++n;
            }
        }
        this.isJumping = false;
        super.onLivingUpdate();
    }

    static AttributeModifier c() {
        return bJ;
    }

    @Override
    protected void b(boolean bl, int n) {
        Item item = this.j();
        int n2 = a5_0.a(this.Q, 2 + n);
        for (int i = 0; i < n2; ++i) {
            this.a(item, 1);
        }
    }

    @Override
    protected String ac() {
        return this.v() ? al8_0.c : al8_0.m;
    }

    public IBlockState a() {
        return BlocksInvoker.b(aom_0.e(this.l, 16) & 0xFFFF);
    }

    @Override
    protected String C() {
        return al8_0.i;
    }

    public void k(boolean bl) {
        aom_0.b(this.l, 18, axt_2.a((byte)1));
    }

    public void a(IBlockState iBlockState) {
        aom_0.b(this.l, 16, aWT.b((short)(BlocksInvoker.a(iBlockState) & 0xFFFF)));
    }

    static Set b() {
        return bK;
    }

    @Override
    protected void g() {
        super.g();
        aom_0.a(this.l, 16, aWT.b((short)0));
        aom_0.a(this.l, 17, axt_2.a((byte)0));
        aom_0.a(this.l, 18, axt_2.a((byte)0));
    }

    @Override
    public float w() {
        return 2.55f;
    }

    @Override
    protected void H() {
        super.H();
        Ma.a(this.a(abb_0.b), 40.0);
        Ma.a(this.a(abb_0.e), 0.3f);
        Ma.a(this.a(abb_0.f), 7.0);
        Ma.a(this.a(abb_0.c), 64.0);
    }

    @Override
    protected String d() {
        return al8_0.d;
    }

    static {
        bI = awc_1.a(al8_0.k);
        bJ = ow_0.a(new AttributeModifier(bI, al8_0.b, 0.15f, 0), false);
        bK = axe_2.d();
        aS0.b(bK, Blocks.grass);
        aS0.b(bK, Blocks.dirt);
        aS0.b(bK, Blocks.sand);
        aS0.b(bK, Blocks.gravel);
        aS0.b(bK, Blocks.G);
        aS0.b(bK, Blocks.bY);
        aS0.b(bK, Blocks.A);
        aS0.b(bK, Blocks.bn);
        aS0.b(bK, Blocks.Y);
        aS0.b(bK, Blocks.a9);
        aS0.b(bK, Blocks.T);
        aS0.b(bK, Blocks.ap);
        aS0.b(bK, Blocks.aQ);
        aS0.b(bK, Blocks.aE);
    }

    protected boolean c(Entity entity) {
        Vec3 vec3 = new Vec3(this.posX - entity.posX, this.getEntityBoundingBox().a + (double)(this.n / 2.0f) - entity.posY + (double)entity.w(), this.posZ - entity.posZ);
        vec3 = aNE.b(vec3);
        double d = 16.0;
        double d2 = this.posX + (a5_0.c(this.Q) - 0.5) * 8.0 - vec3.xCoord * d;
        double d3 = this.posY + (double)(a5_0.a(this.Q, 16) - 8) - vec3.yCoord * d;
        double d4 = this.posZ + (a5_0.c(this.Q) - 0.5) * 8.0 - vec3.zCoord * d;
        return this.a(d2, d3, d4);
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        super.g(nBTTagCompound);
        IBlockState iBlockState = tn_0.a(nBTTagCompound, al8_0.g, 8) ? BlocksInvoker.a(BlocksInvoker.a(tn_0.m(nBTTagCompound, al8_0.j)), tn_0.o(nBTTagCompound, al8_0.a) & 0xFFFF) : BlocksInvoker.a(BlocksInvoker.a(tn_0.o(nBTTagCompound, al8_0.e)), tn_0.o(nBTTagCompound, al8_0.o) & 0xFFFF);
        this.a(iBlockState);
    }

    static boolean a(nn_0 nn_02, EntityPlayer entityPlayer) {
        return nn_02.c(entityPlayer);
    }

    @Override
    public boolean a(DamageSource damageSource, float f) {
        if (this.a(damageSource)) {
            return false;
        }
        if (aDJ.d(damageSource) == null || !(aDJ.d(damageSource) instanceof ni_2)) {
            if (!this.worldObj.isRemote) {
                this.k(true);
            }
            if (damageSource instanceof aed_1 && aDJ.d(damageSource) instanceof EntityPlayer) {
                if (aDJ.d(damageSource) instanceof EntityPlayerMP && Uf.d(((EntityPlayerMP)aDJ.d((DamageSource)damageSource)).bX)) {
                    this.k(false);
                } else {
                    this.bH = true;
                }
            }
            if (damageSource instanceof aea_2) {
                this.bH = false;
                int n = 0;
                while (true) {
                    if (this.u()) {
                        return true;
                    }
                    ++n;
                }
            }
        }
        boolean bl = super.a(damageSource, f);
        if (aDJ.i(damageSource) && a5_0.a(this.Q, 10) != 0) {
            this.u();
        }
        return bl;
    }

    public nn_0(World world) {
        super(world);
        this.c(0.6f, 2.9f);
        this.U = 1.0f;
        aMS.a(this.bx, 0, new _X(this));
        aMS.a(this.bx, 2, new _r_0(this, 1.0, false));
        aMS.a(this.bx, 7, new _J(this, 1.0));
        aMS.a(this.bx, 8, new aly_2(this, EntityPlayer.class, 8.0f));
        aMS.a(this.bx, 8, new _A(this));
        aMS.a(this.bx, 10, new alv_1(this));
        aMS.a(this.bx, 11, new alv_0(this));
        aMS.a(this.bv, 1, new _9((nu_1)this, false, new Class[0]));
        aMS.a(this.bv, 2, new __(this));
        aMS.a(this.bv, 3, new _m_0<ni_2>(this, ni_2.class, 10, true, false, new ahc_1(this)));
    }

    protected boolean u() {
        double d = this.posX + (a5_0.c(this.Q) - 0.5) * 64.0;
        double d2 = this.posY + (double)(a5_0.a(this.Q, 64) - 32);
        double d3 = this.posZ + (a5_0.c(this.Q) - 0.5) * 64.0;
        return this.a(d, d2, d3);
    }

    static boolean a(nn_0 nn_02, boolean bl) {
        nn_02.bH = bl;
        return nn_02.bH;
    }

    @Override
    protected void f() {
        float f;
        if (this.am()) {
            this.a(DamageSource.f, 1.0f);
        }
        if (this.v() && !this.bH && a5_0.a(this.Q, 100) == 0) {
            this.k(false);
        }
        if (aV8.t(this.worldObj) && (f = this.b(1.0f)) > 0.5f && aV8.w(this.worldObj, new BlockPos(this)) && a5_0.e(this.Q) * 30.0f < (f - 0.4f) * 2.0f) {
            this.c((EntityLivingBase)null);
            this.k(false);
            this.bH = false;
            this.u();
        }
        super.f();
    }

    protected boolean a(double d, double d2, double d3) {
        double d4 = this.posX;
        double d5 = this.posY;
        double d6 = this.posZ;
        this.posX = d;
        this.posY = d2;
        this.posZ = d3;
        BlockPos blockPos = new BlockPos(this.posX, this.posY, this.posZ);
        if (aV8.isBlockLoaded(this.worldObj, blockPos)) {
            while (amv_2.h(blockPos) > 0) {
                BlockPos blockPos2 = amv_2.g(blockPos);
                Block block = BlockStateInvoker.getBlock(aV8.q(this.worldObj, blockPos2));
                if (akm_1.d(BlocksInvoker.getBlockState(block))) continue;
                this.posY -= 1.0;
                blockPos = blockPos2;
            }
            super.a(this.posX, this.posY, this.posZ);
            if (!ListInvoker.isEmpty(aV8.b(this.worldObj, this, this.getEntityBoundingBox())) || !aV8.b(this.worldObj, this.getEntityBoundingBox())) {
                // empty if block
            }
        }
        this.j(d4, d5, d6);
        return false;
    }
}

