/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import net.minecraft.util.DamageSource;
import deobf.EntityPlayer;
import deobf.EnumDifficulty;
import net.minecraft.item.ItemStack;

public class aX4 {
    private int d = 20;
    private float b;
    private int a;
    private float c = 5.0f;
    private int e = 20;

    public float c() {
        return this.c;
    }

    public int a() {
        return this.d;
    }

    public void a(EntityPlayer entityPlayer) {
        EnumDifficulty enumDifficulty = aV8.p(entityPlayer.worldObj);
        this.d = this.e;
        if (this.b > 4.0f) {
            this.b -= 4.0f;
            if (this.c > 0.0f) {
                this.c = MathInvoker.b(this.c - 1.0f, 0.0f);
            } else if (enumDifficulty != EnumDifficulty.PEACEFUL) {
                this.e = MathInvoker.max(this.e - 1, 0);
            }
        }
        if (J9.c(aV8.k(entityPlayer.worldObj), aNH.b) && this.e >= 18 && a6w_0.a(entityPlayer)) {
            ++this.a;
            if (this.a >= 80) {
                a6w_0.a(entityPlayer, 1.0f);
                this.b(3.0f);
                this.a = 0;
            }
        } else if (this.e <= 0) {
            ++this.a;
            if (this.a >= 80) {
                if (a6w_0.z(entityPlayer) > 10.0f || enumDifficulty == EnumDifficulty.HARD || a6w_0.z(entityPlayer) > 1.0f && enumDifficulty == EnumDifficulty.NORMAL) {
                    a6w_0.a(entityPlayer, DamageSource.e, 1.0f);
                }
                this.a = 0;
            }
        } else {
            this.a = 0;
        }
    }

    public void b(float f) {
        this.b = MathInvoker.a(this.b + f, 40.0f);
    }

    public int b() {
        return this.e;
    }

    public void b(NBTTagCompound nBTTagCompound) {
        if (tn_0.a(nBTTagCompound, aNH.h, 99)) {
            this.e = tn_0.g(nBTTagCompound, aNH.i);
            this.a = tn_0.g(nBTTagCompound, aNH.d);
            this.c = tn_0.k(nBTTagCompound, aNH.j);
            this.b = tn_0.k(nBTTagCompound, aNH.e);
        }
    }

    public void a(int n, float f) {
        this.e = MathInvoker.b(n + this.e, 20);
        this.c = MathInvoker.a(this.c + (float)n * f * 2.0f, (float)this.e);
    }

    public boolean d() {
        return this.e < 20;
    }

    public void a(float f) {
        this.c = f;
    }

    public void a(NBTTagCompound nBTTagCompound) {
        tn_0.b(nBTTagCompound, aNH.f, this.e);
        tn_0.b(nBTTagCompound, aNH.c, this.a);
        tn_0.a(nBTTagCompound, aNH.a, this.c);
        tn_0.a(nBTTagCompound, aNH.g, this.b);
    }

    public void a(int n) {
        this.e = n;
    }

    public void a(LA lA, ItemStack itemStack) {
        this.a(qe_1.b(lA, itemStack), qe_1.a(lA, itemStack));
    }
}

