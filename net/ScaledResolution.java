/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.GuiLogin;
import deobf.MCInvoker;
import net.minecraft.client.Minecraft;

public class ScaledResolution {
    private int a;
    private double e;
    private Minecraft c;
    private int f;
    private double d;
    private int b;

    public double i() {
        if (this.c.currentScreen instanceof AltRepositoryGUI || this.c.currentScreen instanceof GuiMainMenu || this.c.currentScreen instanceof GuiLogin) {
            return this.g();
        }
        switch (this.c.gameSettings.z) {
            case 1: {
                return (int)(this.g() * 0.5);
            }
            case 3: {
                return (int)(this.g() * 1.5);
            }
        }
        return this.g();
    }

    public double g() {
        return this.d;
    }

    public int a() {
        return this.a;
    }

    public double f() {
        if (this.c.currentScreen instanceof AltRepositoryGUI || this.c.currentScreen instanceof GuiMainMenu || this.c.currentScreen instanceof GuiLogin) {
            return this.e();
        }
        switch (this.c.gameSettings.z) {
            case 1: {
                return (int)(this.e() * 0.5);
            }
            case 3: {
                return (int)(this.e() * 1.5);
            }
        }
        return this.e();
    }

    public int d() {
        if (this.c.currentScreen instanceof AltRepositoryGUI || this.c.currentScreen instanceof GuiMainMenu || this.c.currentScreen instanceof GuiLogin) {
            return this.a();
        }
        switch (this.c.gameSettings.z) {
            case 1: {
                return (int)((double)this.a() * 0.5);
            }
            case 3: {
                return (int)((double)this.a() * 1.5);
            }
        }
        return this.a();
    }

    public int b() {
        return this.f;
    }

    public ScaledResolution(Minecraft minecraft) {
        this.f = minecraft.displayWidth;
        this.a = minecraft.displayHeight;
        this.b = 1;
        MCInvoker.n(minecraft);
        int n = minecraft.currentScreen instanceof AltRepositoryGUI || minecraft.currentScreen instanceof GuiMainMenu || minecraft.currentScreen instanceof GuiLogin ? 2 : minecraft.gameSettings.z;
        n = 1000;
        while (this.b < n && this.f / (this.b + 1) >= 320 && this.a / (this.b + 1) >= 240) {
            ++this.b;
        }
        if (this.b % 2 != 0 && this.b != 1) {
            --this.b;
        }
        this.d = (double)this.f / (double)this.b;
        this.e = (double)this.a / (double)this.b;
        this.f = MathHelper.i(this.d);
        this.a = MathHelper.i(this.e);
        this.c = minecraft;
    }

    public int c() {
        if (this.c.currentScreen instanceof AltRepositoryGUI || this.c.currentScreen instanceof GuiMainMenu || this.c.currentScreen instanceof GuiLogin) {
            return this.b();
        }
        switch (this.c.gameSettings.z) {
            case 1: {
                return (int)((double)this.b() * 0.5);
            }
            case 3: {
                return (int)((double)this.b() * 1.5);
            }
        }
        return this.b();
    }

    public double e() {
        return this.e;
    }

    public int h() {
        return this.b;
    }
}

