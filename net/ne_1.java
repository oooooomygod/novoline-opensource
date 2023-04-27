/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.MathInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import java.util.Map;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.nE
 */
public class ne_1
extends n5_0 {
    private int bP;
    private _k_0 bR;
    private adb_1 bS = new adb_1(new aaf_2(this), 2, 1);
    private static Map<YZ, float[]> bQ = MapsInvoker.a(YZ.class);

    public float c(float f) {
        return this.bP <= 0 ? 0.0f : (this.bP >= 4 && this.bP <= 36 ? 1.0f : (this.bP < 4 ? ((float)this.bP - f) / 4.0f : -((float)(this.bP - 40) - f) / 4.0f));
    }

    public static YZ a(Random random) {
        int n = a5_0.a(random, 100);
        return n < 5 ? YZ.BLACK : (n < 10 ? YZ.GRAY : (n < 15 ? YZ.SILVER : (n < 18 ? YZ.BROWN : (a5_0.a(random, 500) == 0 ? YZ.PINK : YZ.WHITE))));
    }

    @Override
    public float w() {
        return 0.95f * this.n;
    }

    @Override
    protected void H() {
        super.H();
        Ma.a(this.a(abb_0.b), 8.0);
        Ma.a(this.a(abb_0.e), 0.23f);
    }

    @Override
    public void onLivingUpdate() {
        if (this.worldObj.isRemote) {
            this.bP = MathInvoker.max(0, this.bP - 1);
        }
        super.onLivingUpdate();
    }

    private YZ a(n5_0 n5_02, n5_0 n5_03) {
        int n = my_2.c(((ne_1)n5_02).e());
        int n2 = my_2.c(((ne_1)n5_03).e());
        act_2.a(aVF.b(this.bS, 0), n);
        act_2.a(aVF.b(this.bS, 1), n2);
        ItemStack itemStack = am5_0.b(am5_0.c(), this.bS, ((ne_1)n5_02).worldObj);
        int n3 = act_2.k(itemStack) == Items.dye ? act_2.c(itemStack) : (a5_0.a(this.worldObj.o) ? n : n2);
        return my_2.b(n3);
    }

    @Override
    protected void g() {
        super.g();
        aom_0.a(this.l, 16, axt_2.a((byte)0));
    }

    @Override
    protected String ac() {
        return IM.e;
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        super.g(nBTTagCompound);
        this.l(tn_0.c(nBTTagCompound, IM.g));
        this.a(my_2.a(tn_0.e(nBTTagCompound, IM.f)));
    }

    @Override
    protected String C() {
        return IM.c;
    }

    @Override
    protected void f() {
        this.bP = VS.a(this.bR);
        super.f();
    }

    public void l(boolean bl) {
        byte by = aom_0.g(this.l, 16);
        aom_0.b(this.l, 16, axt_2.a((byte)(by | 0x10)));
    }

    @Override
    protected Item j() {
        return px_0.a(Blocks.b_);
    }

    static {
        MapInvoker.c(bQ, YZ.WHITE, new float[]{1.0f, 1.0f, 1.0f});
        MapInvoker.c(bQ, YZ.ORANGE, new float[]{0.85f, 0.5f, 0.2f});
        MapInvoker.c(bQ, YZ.MAGENTA, new float[]{0.7f, 0.3f, 0.85f});
        MapInvoker.c(bQ, YZ.LIGHT_BLUE, new float[]{0.4f, 0.6f, 0.85f});
        MapInvoker.c(bQ, YZ.YELLOW, new float[]{0.9f, 0.9f, 0.2f});
        MapInvoker.c(bQ, YZ.LIME, new float[]{0.5f, 0.8f, 0.1f});
        MapInvoker.c(bQ, YZ.PINK, new float[]{0.95f, 0.5f, 0.65f});
        MapInvoker.c(bQ, YZ.GRAY, new float[]{0.3f, 0.3f, 0.3f});
        MapInvoker.c(bQ, YZ.SILVER, new float[]{0.6f, 0.6f, 0.6f});
        MapInvoker.c(bQ, YZ.CYAN, new float[]{0.3f, 0.5f, 0.6f});
        MapInvoker.c(bQ, YZ.PURPLE, new float[]{0.5f, 0.25f, 0.7f});
        MapInvoker.c(bQ, YZ.BLUE, new float[]{0.2f, 0.3f, 0.7f});
        MapInvoker.c(bQ, YZ.BROWN, new float[]{0.4f, 0.3f, 0.2f});
        MapInvoker.c(bQ, YZ.GREEN, new float[]{0.4f, 0.5f, 0.2f});
        MapInvoker.c(bQ, YZ.RED, new float[]{0.6f, 0.2f, 0.2f});
        MapInvoker.c(bQ, YZ.BLACK, new float[]{0.1f, 0.1f, 0.1f});
    }

    @Override
    public void a(byte by) {
        if (by == 10) {
            this.bP = 40;
        } else {
            super.a(by);
        }
    }

    @Override
    protected void a(BlockPos blockPos, Block block) {
        this.a(IM.h, 0.15f, 1.0f);
    }

    public float a(float f) {
        if (this.bP > 4 && this.bP <= 36) {
            float f2 = ((float)(this.bP - 4) - f) / 32.0f;
            return 0.62831855f + 0.2199115f * MathHelper.sin(f2 * 28.7f);
        }
        return this.bP > 0 ? 0.62831855f : this.rotationPitch / 57.295776f;
    }

    public void a(YZ yZ) {
        byte by = aom_0.g(this.l, 16);
        aom_0.b(this.l, 16, axt_2.a((byte)(by & 0xF0 | my_2.a(yZ) & 0xF)));
    }

    public static float[] b(YZ yZ) {
        return (float[])MapInvoker.c(bQ, yZ);
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        tn_0.a(nBTTagCompound, IM.b, this.d());
        tn_0.a(nBTTagCompound, IM.d, (byte)my_2.a(this.e()));
    }

    public boolean d() {
        return (aom_0.g(this.l, 16) & 0x10) != 0;
    }

    public YZ e() {
        return my_2.a(aom_0.g(this.l, 16) & 0xF);
    }

    @Override
    protected void b(boolean bl, int n) {
        if (!this.d()) {
            this.a(new ItemStack(px_0.a(Blocks.b_), 1, my_2.a(this.e())), 0.0f);
        }
        int n2 = a5_0.a(this.Q, 2) + 1 + a5_0.a(this.Q, 1 + n);
        for (int i = 0; i < n2; ++i) {
            if (this.ag()) {
                this.a(Items.cooked_mutton, 1);
                continue;
            }
            this.a(Items.mutton, 1);
        }
    }

    public ne_1(World world) {
        super(world);
        this.bR = new _k_0(this);
        this.c(0.9f, 1.3f);
        afv_0.b((F_)this.Z(), true);
        aMS.a(this.bx, 0, new _X(this));
        aMS.a(this.bx, 1, new _e_0(this, 1.25));
        aMS.a(this.bx, 2, new _h_0(this, 1.0));
        aMS.a(this.bx, 3, new _b_0(this, 1.1, Items.wheat, false));
        aMS.a(this.bx, 4, new _D(this, 1.1));
        aMS.a(this.bx, 5, this.bR);
        aMS.a(this.bx, 6, new _J(this, 1.0));
        aMS.a(this.bx, 7, new aly_2(this, EntityPlayer.class, 6.0f));
        aMS.a(this.bx, 8, new _A(this));
        aVF.a(this.bS, 0, new ItemStack(Items.dye, 1, 0));
        aVF.a(this.bS, 1, new ItemStack(Items.dye, 1, 0));
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        ItemStack itemStack = InventoryInvoker.g(entityPlayer.inventory);
        if (act_2.k(itemStack) == Items.shears && !this.d() && !this.j()) {
            if (!this.worldObj.isRemote) {
                this.l(true);
                int n = 1 + a5_0.a(this.Q, 3);
                for (int i = 0; i < n; ++i) {
                    og_0 og_02 = this.a(new ItemStack(px_0.a(Blocks.b_), 1, my_2.a(this.e())), 1.0f);
                    og_02.motionY += (double)(a5_0.e(this.Q) * 0.05f);
                    og_02.motionX += (double)((a5_0.e(this.Q) - a5_0.e(this.Q)) * 0.1f);
                    og_02.motionZ += (double)((a5_0.e(this.Q) - a5_0.e(this.Q)) * 0.1f);
                }
            }
            act_2.damageItem(itemStack, 1, entityPlayer);
            this.a(IM.a, 1.0f, 1.0f);
        }
        return super.a(entityPlayer);
    }

    @Override
    public void n() {
        this.l(false);
        if (this.j()) {
            this.j(60);
        }
    }

    @Override
    public ne_1 a(n4_0 n4_02) {
        ne_1 ne_12 = (ne_1)n4_02;
        ne_1 ne_13 = new ne_1(this.worldObj);
        ne_13.a(this.a(this, ne_12));
        return ne_13;
    }

    @Override
    protected String d() {
        return IM.i;
    }

    @Override
    public amk_0 a(ach_0 ach_02, amk_0 amk_02) {
        amk_02 = super.a(ach_02, amk_02);
        this.a(ne_1.a(this.worldObj.o));
        return amk_02;
    }
}

