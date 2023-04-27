/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import net.minecraft.inventory.Container;
import deobf.EntityPlayer;
import deobf.IChatComponent;
import deobf.ITickable;
import deobf.TileEntity;
import java.util.Random;


public class a6D
extends TileEntity
implements ITickable,
dv_1 {
    public float r;
    public float k;
    public float t;
    public float j;
    public int o;
    public float m;
    public float s;
    private String q;
    public float p;
    public float l;
    private static Random i = new Random();
    public float n;

    @Override
    public boolean e() {
        return this.q != null && !StringInvoker.g(this.q);
    }

    @Override
    public void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        if (tn_0.a(nBTTagCompound, WV.b, 8)) {
            this.q = tn_0.m(nBTTagCompound, WV.d);
        }
    }

    @Override
    public void b() {
        float f;
        this.j = this.p;
        this.m = this.r;
        EntityPlayer entityPlayer = aV8.b(this.e, (float)amv_2.j(this.g) + 0.5f, (float)amv_2.h(this.g) + 0.5f, (float)amv_2.i(this.g) + 0.5f, 3.0);
        double d = entityPlayer.posX - (double)((float)amv_2.j(this.g) + 0.5f);
        double d2 = entityPlayer.posZ - (double)((float)amv_2.i(this.g) + 0.5f);
        this.l = (float)MathHelper.c(d2, d);
        this.p += 0.1f;
        if (this.p < 0.5f || a5_0.a(i, 40) == 0) {
            float f2 = this.n;
            do {
                this.n += (float)(a5_0.a(i, 4) - a5_0.a(i, 4));
            } while (f2 == this.n);
        }
        while (this.r >= (float)Math.PI) {
            this.r -= (float)Math.PI * 2;
        }
        while (this.r < (float)(-Math.PI)) {
            this.r += (float)Math.PI * 2;
        }
        while (this.l >= (float)Math.PI) {
            this.l -= (float)Math.PI * 2;
        }
        while (this.l < (float)(-Math.PI)) {
            this.l += (float)Math.PI * 2;
        }
        for (f = this.l - this.r; f >= (float)Math.PI; f -= (float)Math.PI * 2) {
        }
        while (f < (float)(-Math.PI)) {
            f += (float)Math.PI * 2;
        }
        this.r += f * 0.4f;
        this.p = MathHelper.b(this.p, 0.0f, 1.0f);
        ++this.o;
        this.s = this.t;
        float f3 = (this.n - this.t) * 0.4f;
        float f4 = 0.2f;
        f3 = MathHelper.b(f3, -f4, f4);
        this.k += (f3 - this.k) * 0.9f;
        this.t += this.k;
    }

    @Override
    public String getName() {
        return this.e() ? this.q : WV.c;
    }

    @Override
    public String b() {
        return WV.a;
    }

    public void a(String string) {
        this.q = string;
    }

    @Override
    public Container a(aSK aSK2, EntityPlayer entityPlayer) {
        return new aad_1(aSK2, this.e, this.g);
    }

    @Override
    public void c(NBTTagCompound nBTTagCompound) {
        super.c(nBTTagCompound);
        if (this.e()) {
            tn_0.a(nBTTagCompound, WV.e, this.q);
        }
    }

    @Override
    public IChatComponent getDisplayName() {
        return this.e() ? new ChatComponentText(this.getName()) : new aoz_1(this.getName(), new Object[0]);
    }
}

