/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.PlayerControllerInvoker;
import cc.novoline.invoke.PlayerInvoker;
import deobf.Entity;
import deobf.EntityPlayer;
import deobf.MCInvoker;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.aCd
 */
public class acd_0 {
    private static Minecraft a = MCInvoker.f();
    private static int b = 47;

    private static void b(EntityPlayer entityPlayer, Entity entity) {
        PlayerInvoker.V(acd_0.a.player);
        PlayerControllerInvoker.a(acd_0.a.playerController, entityPlayer, entity);
    }

    public static void a(EntityPlayer entityPlayer, Entity entity) {
        W8.b();
        if (fo_0.a(fo_0.a()) <= awc_2.b(acu_0.a(47))) {
            acd_0.b(entityPlayer, entity);
        }
        acd_0.c(entityPlayer, entity);
    }

    private static void c(EntityPlayer entityPlayer, Entity entity) {
        PlayerControllerInvoker.a(acd_0.a.playerController, entityPlayer, entity);
        PlayerInvoker.V(acd_0.a.player);
    }

    public static void a(MovingObjectPosition movingObjectPosition) {
        W8.b();
        if (movingObjectPosition != null && movingObjectPosition.typeOfHit != I.ENTITY) {
            PlayerInvoker.V(acd_0.a.player);
        }
    }
}

