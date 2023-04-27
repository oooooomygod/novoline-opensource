/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityPlayer;
import deobf.EntityPlayerSP;
import cc.novoline.modules.visual.HUD;
import deobf.MCInvoker;
import deobf.Vec3;
import net.minecraft.client.Minecraft;

class B3 {
    private Vec3 a;
    private float d;
    private float b;
    private EntityPlayer c;

    public B3(EntityPlayer entityPlayer, double d, double d2, double d3) {
        this.a = new Vec3(d, d2, d3);
        this.d = 0.0f;
        this.b = 200.0f;
        this.c = entityPlayer;
    }

    static float a(B3 b3) {
        return b3.b;
    }

    public B3(EntityPlayer entityPlayer) {
        HUD.t();
        if (entityPlayer instanceof EntityPlayerSP) {
            this.a = new Vec3(MCInvoker.j((Minecraft)MCInvoker.f()).s, MCInvoker.j((Minecraft)MCInvoker.f()).h, MCInvoker.j((Minecraft)MCInvoker.f()).m);
        }
        this.a = new Vec3(entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ);
        this.d = 0.0f;
        this.b = 200.0f;
        this.c = entityPlayer;
    }

    static float a(B3 b3, float f) {
        b3.b = f;
        return b3.b;
    }

    static Vec3 b(B3 b3) {
        return b3.a;
    }
}

