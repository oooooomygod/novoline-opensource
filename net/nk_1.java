/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.EnumDifficulty;
import net.B7;
import net.EF;
import net.Item;
import net.Items;
import net.Ma;
import net.World;
import net.a5_0;
import net.aV8;
import net.abb_0;
import net.ny_1;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.nK
 */
public class nk_1
extends ny_1 {
    public nk_1(World world) {
        super(world);
        this.S = true;
    }

    @Override
    protected String f() {
        return this.e() > 1 ? EF.b : EF.a;
    }

    @Override
    protected void o() {
        this.bD *= 0.9f;
    }

    @Override
    protected ny_1 j() {
        return new nk_1(this.worldObj);
    }

    @Override
    public int O() {
        return this.e() * 3;
    }

    @Override
    protected void b(boolean bl, int n) {
        Item item = this.j();
        if (this.e() > 1) {
            int n2 = a5_0.a(this.Q, 4) - 2;
            n2 += a5_0.a(this.Q, n + 1);
            for (int i = 0; i < n2; ++i) {
                this.a(item, 1);
            }
        }
    }

    @Override
    protected boolean d() {
        return true;
    }

    @Override
    protected void H() {
        super.H();
        Ma.a(this.a(abb_0.e), 0.2f);
    }

    @Override
    protected int g() {
        return super.g() * 4;
    }

    @Override
    protected boolean k() {
        return true;
    }

    @Override
    public int d(float f) {
        return 0xF000F0;
    }

    @Override
    protected Item j() {
        return Items.magma_cream;
    }

    @Override
    public float b(float f) {
        return 1.0f;
    }

    @Override
    protected int i() {
        return super.i() + 2;
    }

    @Override
    protected void a() {
        this.motionY = 0.22f + (float)this.e() * 0.05f;
        this.p = true;
    }

    @Override
    public void b(float f, float f2) {
    }

    @Override
    public boolean B() {
        return aV8.p(this.worldObj) != EnumDifficulty.PEACEFUL;
    }

    @Override
    public boolean Y() {
        return aV8.a(this.worldObj, this.getEntityBoundingBox(), this) && ListInvoker.isEmpty(aV8.b(this.worldObj, this, this.getEntityBoundingBox())) && !aV8.b(this.worldObj, this.getEntityBoundingBox());
    }

    @Override
    protected void l() {
        this.motionY = 0.42f + (float)this.e() * 0.1f;
        this.p = true;
    }

    @Override
    protected B7 h() {
        return B7.FLAME;
    }

    @Override
    public boolean ag() {
        return false;
    }
}

