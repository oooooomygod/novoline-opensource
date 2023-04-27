/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package cc.novoline.invoke;

import com.mojang.authlib.GameProfile;
import net.minecraft.inventory.Container;
import deobf.Entity;
import deobf.EntityPlayer;
import deobf.IChatComponent;
import net.minecraft.item.ItemStack;
import deobf.StatBase;
import net.minecraft.network.packts.C15PacketClientSettings;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import deobf.EntityPlayerMP;
import deobf.EnumChatVisibility;
import net.NBTTagCompound;
import net.Team;
import net.World;
import net.WorldServer;
import net.l1_0;
import net.og_0;
import net.rm_2;

public class EntityPlayerInvoker {
    private static ListInvoker[] b;

    public static double f(EntityPlayerMP entityPlayerMP, double d, double d2, double d3) {
        return entityPlayerMP.d(d, d2, d3);
    }

    public static void b(EntityPlayerMP entityPlayerMP, Entity entity) {
        entityPlayerMP.m(entity);
    }

    public static void c(EntityPlayerMP entityPlayerMP, boolean bl) {
        entityPlayerMP.i(bl);
    }

    public static void a(EntityPlayerMP entityPlayerMP) {
        entityPlayerMP.R();
    }

    public static float h(EntityPlayerMP entityPlayerMP) {
        return entityPlayerMP.a();
    }

    public static void t(EntityPlayerMP entityPlayerMP) {
        entityPlayerMP.A();
    }

    static {
        if (EntityPlayerInvoker.b() == null) {
            EntityPlayerInvoker.b(new ListInvoker[1]);
        }
    }

    public static GameProfile I(EntityPlayerMP entityPlayerMP) {
        return entityPlayerMP.X();
    }

    public static void a(EntityPlayerMP entityPlayerMP, World world) {
        entityPlayerMP.a(world);
    }

    public static void o(EntityPlayerMP entityPlayerMP) {
        entityPlayerMP.T();
    }

    public static void a(EntityPlayerMP entityPlayerMP, StatBase statBase) {
        entityPlayerMP.b(statBase);
    }

    public static void a(EntityPlayerMP entityPlayerMP, boolean bl, boolean bl2, boolean bl3) {
        entityPlayerMP.a(bl, bl2, bl3);
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static Collection g(EntityPlayerMP entityPlayerMP) {
        return entityPlayerMP.G();
    }

    public static void a(EntityPlayerMP entityPlayerMP, float f) {
        entityPlayerMP.i(f);
    }

    public static void F(EntityPlayerMP entityPlayerMP) {
        entityPlayerMP.c();
    }

    public static BlockPos x(EntityPlayerMP entityPlayerMP) {
        return entityPlayerMP.e();
    }

    public static String p(EntityPlayerMP entityPlayerMP) {
        return entityPlayerMP.j();
    }

    public static void a(EntityPlayerMP entityPlayerMP, IChatComponent iChatComponent) {
        entityPlayerMP.addChatComponentMessage(iChatComponent);
    }

    public static void E(EntityPlayerMP entityPlayerMP) {
        entityPlayerMP.n();
    }

    public static l1_0 D(EntityPlayerMP entityPlayerMP) {
        return entityPlayerMP.S();
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static void b(EntityPlayerMP entityPlayerMP, NBTTagCompound nBTTagCompound) {
        entityPlayerMP.e(nBTTagCompound);
    }

    public static void c(EntityPlayerMP entityPlayerMP) {
        entityPlayerMP.d();
    }

    public static void z(EntityPlayerMP entityPlayerMP) {
        entityPlayerMP.P();
    }

    public static double c(EntityPlayerMP entityPlayerMP, Entity entity) {
        return entityPlayerMP.g(entity);
    }

    public static int B(EntityPlayerMP entityPlayerMP) {
        return entityPlayerMP.r();
    }

    public static void e(EntityPlayerMP entityPlayerMP, double d, double d2, double d3) {
        entityPlayerMP.a(d, d2, d3);
    }

    public static void w(EntityPlayerMP entityPlayerMP) {
        entityPlayerMP.sendPlayerAbilities();
    }

    public static void b(EntityPlayerMP entityPlayerMP, boolean bl) {
        entityPlayerMP.e(bl);
    }

    public static boolean a(EntityPlayerMP entityPlayerMP, Block block) {
        return entityPlayerMP.b(block);
    }

    public static void markPlayerActive(EntityPlayerMP entityPlayerMP) {
        entityPlayerMP.y();
    }

    public static ItemStack i(EntityPlayerMP entityPlayerMP) {
        return entityPlayerMP.ah();
    }

    public static IChatComponent n(EntityPlayerMP entityPlayerMP) {
        return entityPlayerMP.getDisplayName();
    }

    public static void b(EntityPlayerMP entityPlayerMP, double d, double d2, double d3, float f, float f2) {
        entityPlayerMP.c(d, d2, d3, f, f2);
    }

    public static void a(EntityPlayerMP entityPlayerMP, C15PacketClientSettings c15PacketClientSettings) {
        entityPlayerMP.a(c15PacketClientSettings);
    }

    public static void a(EntityPlayerMP entityPlayerMP, EntityPlayer entityPlayer, boolean bl) {
        entityPlayerMP.a(entityPlayer, bl);
    }

    public static void y(EntityPlayerMP entityPlayerMP) {
        entityPlayerMP.l();
    }

    public static boolean d(EntityPlayerMP entityPlayerMP, Entity entity) {
        return entityPlayerMP.a(entity);
    }

    public static String s(EntityPlayerMP entityPlayerMP) {
        return entityPlayerMP.getName();
    }

    public static Team J(EntityPlayerMP entityPlayerMP) {
        return entityPlayerMP.getTeam();
    }

    public static void l(EntityPlayerMP entityPlayerMP) {
        entityPlayerMP.Z();
    }

    public static void a(EntityPlayerMP entityPlayerMP, String string, String string2) {
        entityPlayerMP.a(string, string2);
    }

    public static void g(EntityPlayerMP entityPlayerMP, Entity entity) {
        entityPlayerMP.k(entity);
    }

    public static void a(EntityPlayerMP entityPlayerMP, double d, boolean bl) {
        entityPlayerMP.a(d, bl);
    }

    public static void a(EntityPlayerMP entityPlayerMP, Container container, List list) {
        entityPlayerMP.a(container, list);
    }

    public static og_0 a(EntityPlayerMP entityPlayerMP, ItemStack itemStack, boolean bl) {
        return entityPlayerMP.a(itemStack, bl);
    }

    public static double c(EntityPlayerMP entityPlayerMP, double d, double d2, double d3) {
        return entityPlayerMP.h(d, d2, d3);
    }

    public static boolean G(EntityPlayerMP entityPlayerMP) {
        return entityPlayerMP.A();
    }

    public static void h(EntityPlayerMP entityPlayerMP, Entity entity) {
        entityPlayerMP.mountEntity(entity);
    }

    public static UUID v(EntityPlayerMP entityPlayerMP) {
        return entityPlayerMP.J();
    }

    public static void a(EntityPlayerMP entityPlayerMP, BlockPos blockPos, boolean bl) {
        entityPlayerMP.a(blockPos, bl);
    }

    public static EnumChatVisibility q(EntityPlayerMP entityPlayerMP) {
        return entityPlayerMP.V();
    }

    public static void e(EntityPlayerMP entityPlayerMP, Entity entity) {
        entityPlayerMP.a(entity);
    }

    public static void a(EntityPlayerMP entityPlayerMP, double d, double d2, double d3) {
        entityPlayerMP.d(d, d2, d3);
    }

    public static boolean r(EntityPlayerMP entityPlayerMP) {
        return entityPlayerMP.n();
    }

    public static void a(EntityPlayerMP entityPlayerMP, Container container) {
        entityPlayerMP.a(container);
    }

    public static boolean m(EntityPlayerMP entityPlayerMP) {
        return entityPlayerMP.y();
    }

    public static void b(EntityPlayerMP entityPlayerMP, double d, double d2, double d3) {
        entityPlayerMP.j(d, d2, d3);
    }

    public static void a(EntityPlayerMP entityPlayerMP, NBTTagCompound nBTTagCompound) {
        entityPlayerMP.c(nBTTagCompound);
    }

    public static void a(EntityPlayerMP entityPlayerMP, int n) {
        entityPlayerMP.b(n);
    }

    public static boolean e(EntityPlayerMP entityPlayerMP) {
        return entityPlayerMP.ae();
    }

    public static void a(EntityPlayerMP entityPlayerMP, double d, double d2, double d3, float f, float f2) {
        entityPlayerMP.b(d, d2, d3, f, f2);
    }

    public static void a(EntityPlayerMP entityPlayerMP, float f, float f2, boolean bl, boolean bl2) {
        entityPlayerMP.a(f, f2, bl, bl2);
    }

    public static void b(EntityPlayerMP entityPlayerMP, StatBase statBase) {
        entityPlayerMP.a(statBase);
    }

    public static long A(EntityPlayerMP entityPlayerMP) {
        return entityPlayerMP.i();
    }

    public static boolean a(EntityPlayerMP entityPlayerMP, int n, String string) {
        return entityPlayerMP.a(n, string);
    }

    public static IChatComponent f(EntityPlayerMP entityPlayerMP) {
        return entityPlayerMP.a();
    }

    public static boolean f(EntityPlayerMP entityPlayerMP, Entity entity) {
        return entityPlayerMP.n(entity);
    }

    public static boolean C(EntityPlayerMP entityPlayerMP) {
        return entityPlayerMP.k();
    }

    public static WorldServer b(EntityPlayerMP entityPlayerMP) {
        return entityPlayerMP.W();
    }

    public static void a(EntityPlayerMP entityPlayerMP, Entity entity) {
        entityPlayerMP.n(entity);
    }

    public static void d(EntityPlayerMP entityPlayerMP, double d, double d2, double d3) {
        entityPlayerMP.moveEntity(d, d2, d3);
    }

    public static rm_2 j(EntityPlayerMP entityPlayerMP) {
        return entityPlayerMP.getEntityBoundingBox();
    }

    public static void u(EntityPlayerMP entityPlayerMP) {
        entityPlayerMP.W();
    }

    public static ItemStack H(EntityPlayerMP entityPlayerMP) {
        return entityPlayerMP.S();
    }

    public static BlockPos d(EntityPlayerMP entityPlayerMP) {
        return entityPlayerMP.T();
    }

    public static void a(EntityPlayerMP entityPlayerMP, boolean bl) {
        entityPlayerMP.setSprinting(bl);
    }
}

