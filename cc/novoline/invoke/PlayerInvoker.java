/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package cc.novoline.invoke;

import cc.novoline.events.events.MotionUpdateEvent;
import com.mojang.authlib.GameProfile;
import deobf.Entity;
import deobf.EntityPlayerSP;
import deobf.IChatComponent;
import net.minecraft.item.ItemStack;
import deobf.TileEntity;
import deobf.Vec3;
import java.util.Collection;
import java.util.Map;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import deobf.EnumFacing;
import net.Item;
import net.Material;
import net.MovementInput;
import net.Potion;
import net.Slot;
import net.StatFileWriter;
import net.Team;
import net.a2l_0;
import net.a6z_0;
import net.a7K;
import net.a96;
import net.aX4;
import net.dv_1;
import net.na_1;
import net.og_0;
import net.rm_2;
import net.rs_1;

public class PlayerInvoker {
    private static String b = "lVHwHc";

    public static double d(EntityPlayerSP entityPlayerSP, Entity entity) {
        return entityPlayerSP.c(entity);
    }

    public static void a(EntityPlayerSP entityPlayerSP, na_1 na_12, rs_1 rs_12) {
        entityPlayerSP.a(na_12, rs_12);
    }

    public static boolean ai(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.ac();
    }

    public static double b(EntityPlayerSP entityPlayerSP, BlockPos blockPos) {
        return entityPlayerSP.b(blockPos);
    }

    public static void a(EntityPlayerSP entityPlayerSP, a6z_0 a6z_02) {
        entityPlayerSP.a(a6z_02);
    }

    public static double d(EntityPlayerSP entityPlayerSP, boolean bl) {
        return entityPlayerSP.m(bl);
    }

    public static Block z(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.ar();
    }

    public static float X(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.w();
    }

    public static void Y(EntityPlayerSP entityPlayerSP) {
        entityPlayerSP.W();
    }

    public static void a(EntityPlayerSP entityPlayerSP, IChatComponent iChatComponent) {
        entityPlayerSP.addChatComponentMessage(iChatComponent);
    }

    public static boolean ag(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.isUsingItem();
    }

    public static void a(EntityPlayerSP entityPlayerSP, dv_1 dv_12) {
        entityPlayerSP.displayGui(dv_12);
    }

    public static float ab(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.getHorseJumpPower();
    }

    public static void V(EntityPlayerSP entityPlayerSP) {
        entityPlayerSP.Z();
    }

    public static void a(EntityPlayerSP entityPlayerSP, float f) {
        entityPlayerSP.k(f);
    }

    public static boolean B(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.k();
    }

    public static void a(EntityPlayerSP entityPlayerSP, double d, double d2, double d3) {
        entityPlayerSP.a(d, d2, d3);
    }

    public static void a(EntityPlayerSP entityPlayerSP, BlockPos blockPos) {
        entityPlayerSP.b(blockPos);
    }

    public static boolean a(EntityPlayerSP entityPlayerSP, Material material) {
        return entityPlayerSP.isInsideOfMaterial(material);
    }

    public static int a(EntityPlayerSP entityPlayerSP, Item[] itemArray, Item item) {
        return entityPlayerSP.a(itemArray, item);
    }

    public static boolean Q(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.av();
    }

    public static float d(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.o();
    }

    public static boolean C(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.y();
    }

    public static void c(EntityPlayerSP entityPlayerSP, boolean bl) {
        entityPlayerSP.setSprinting(bl);
    }

    public static void b(EntityPlayerSP entityPlayerSP, int n) {
        entityPlayerSP.r(n);
    }

    public static double c(EntityPlayerSP entityPlayerSP, double d, double d2, double d3) {
        return entityPlayerSP.h(d, d2, d3);
    }

    public static void a(EntityPlayerSP entityPlayerSP, BlockPos blockPos, boolean bl) {
        entityPlayerSP.a(blockPos, bl);
    }

    public static void a(EntityPlayerSP entityPlayerSP, a7K a7K2) {
        entityPlayerSP.a(a7K2);
    }

    public static int O(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.r();
    }

    public static Team al(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.getTeam();
    }

    public static a2l_0 a(EntityPlayerSP entityPlayerSP, Potion potion) {
        return entityPlayerSP.getActivePotionEffect(potion);
    }

    public static boolean x(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.isRidingHorse();
    }

    public static int b(EntityPlayerSP entityPlayerSP, Item item) {
        return entityPlayerSP.a(item);
    }

    public static void A(EntityPlayerSP entityPlayerSP) {
        entityPlayerSP.m();
    }

    public static String b() {
        return b;
    }

    public static int S(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.ag();
    }

    public static GameProfile f(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.X();
    }

    public static float a(EntityPlayerSP entityPlayerSP, TileEntity tileEntity) {
        return entityPlayerSP.a(tileEntity);
    }

    public static boolean b(EntityPlayerSP entityPlayerSP, MotionUpdateEvent motionUpdateEvent) {
        return entityPlayerSP.a(motionUpdateEvent);
    }

    public static a96 i(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.t();
    }

    public static void v(EntityPlayerSP entityPlayerSP) {
        entityPlayerSP.l();
    }

    public static void a(EntityPlayerSP entityPlayerSP, String string) {
        entityPlayerSP.c(string);
    }

    public static double a(EntityPlayerSP entityPlayerSP, double d, double d2) {
        return entityPlayerSP.a(d, d2);
    }

    public static void c(EntityPlayerSP entityPlayerSP, Entity entity) {
        entityPlayerSP.l(entity);
    }

    public static boolean g(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.ay();
    }

    public static String u(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.getName();
    }

    public static double a(EntityPlayerSP entityPlayerSP, boolean bl, double d) {
        return entityPlayerSP.a(bl, d);
    }

    public static Collection E(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.G();
    }

    public static int H(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.Q();
    }

    public static void d(EntityPlayerSP entityPlayerSP, double d) {
        entityPlayerSP.setSpeed(d);
    }

    public static int c(EntityPlayerSP entityPlayerSP, int n) {
        return entityPlayerSP.a(n);
    }

    public static boolean G(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.isInWater();
    }

    public static void ap(EntityPlayerSP entityPlayerSP) {
        entityPlayerSP.C();
    }

    public static void K(EntityPlayerSP entityPlayerSP) {
        entityPlayerSP.X();
    }

    public static Slot f(EntityPlayerSP entityPlayerSP, int n) {
        return entityPlayerSP.p(n);
    }

    public static void a(EntityPlayerSP entityPlayerSP, Entity entity) {
        entityPlayerSP.h(entity);
    }

    public static boolean m(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.ah();
    }

    public static float b(EntityPlayerSP entityPlayerSP, Entity entity) {
        return entityPlayerSP.a(entity);
    }

    public static boolean a(EntityPlayerSP entityPlayerSP, MotionUpdateEvent motionUpdateEvent) {
        return entityPlayerSP.b(motionUpdateEvent);
    }

    public static boolean e(EntityPlayerSP entityPlayerSP, Entity entity) {
        return entityPlayerSP.a(entity);
    }

    public static void P(EntityPlayerSP entityPlayerSP) {
        entityPlayerSP.N();
    }

    public static EnumFacing ae(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.al();
    }

    public static float c(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.as();
    }

    public static void aj(EntityPlayerSP entityPlayerSP) {
        entityPlayerSP.y();
    }

    public static float d(EntityPlayerSP entityPlayerSP, float f) {
        return entityPlayerSP.e(f);
    }

    public static double a(EntityPlayerSP entityPlayerSP, BlockPos blockPos, BlockPos blockPos2) {
        return entityPlayerSP.a(blockPos, blockPos2);
    }

    public static StatFileWriter s(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.k();
    }

    public static boolean w(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.isSneaking();
    }

    public static boolean T(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.aq();
    }

    public static int a(EntityPlayerSP entityPlayerSP, Item item, int n) {
        return entityPlayerSP.b(item, n);
    }

    public static double M(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.al();
    }

    public static UUID ad(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.az();
    }

    public static double k(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.j();
    }

    public static Map o(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.k();
    }

    public static int a(EntityPlayerSP entityPlayerSP, Item item) {
        return entityPlayerSP.c(item);
    }

    public static ItemStack W(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.S();
    }

    public static boolean q(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.isMoving();
    }

    public static float c(EntityPlayerSP entityPlayerSP, double d) {
        return entityPlayerSP.c(d);
    }

    public static int F(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.Y();
    }

    public static boolean L(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.n();
    }

    public static ItemStack h(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.ah();
    }

    public static void a(EntityPlayerSP entityPlayerSP, float f, int n, int n2) {
        entityPlayerSP.a(f, n, n2);
    }

    public static int ah(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.U();
    }

    public static MovementInput j(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.movementInput();
    }

    public static void a(EntityPlayerSP entityPlayerSP, rs_1 rs_12) {
        entityPlayerSP.a(rs_12);
    }

    public static IChatComponent Z(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.getDisplayName();
    }

    public static boolean ao(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.A();
    }

    public static float aa(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.a();
    }

    public static boolean J(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.i();
    }

    public static void e(EntityPlayerSP entityPlayerSP, boolean bl) {
        entityPlayerSP.j(bl);
    }

    public static void b(EntityPlayerSP entityPlayerSP, double d, double d2, double d3) {
        entityPlayerSP.j(d, d2, d3);
    }

    public static boolean am(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.at();
    }

    public static double r(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.e();
    }

    public static boolean b(EntityPlayerSP entityPlayerSP, double d) {
        return entityPlayerSP.f(d);
    }

    public static String y(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.getClientBrand();
    }

    public static boolean ac(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.U();
    }

    public static BlockPos af(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.e();
    }

    public static UUID D(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.J();
    }

    public static void a(EntityPlayerSP entityPlayerSP, double d, double d2, double d3, float f, float f2) {
        entityPlayerSP.b(d, d2, d3, f, f2);
    }

    public static void b(EntityPlayerSP entityPlayerSP, IChatComponent iChatComponent) {
        entityPlayerSP.c(iChatComponent);
    }

    public static rm_2 p(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.getEntityBoundingBox();
    }

    public static boolean U(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.isRiding();
    }

    public static boolean a(EntityPlayerSP entityPlayerSP, double d) {
        return entityPlayerSP.d(d);
    }

    public static boolean b(EntityPlayerSP entityPlayerSP, Potion potion) {
        return entityPlayerSP.isPotionActive(potion);
    }

    public static void b(EntityPlayerSP entityPlayerSP, boolean bl) {
        entityPlayerSP.i(bl);
    }

    public static void a(EntityPlayerSP entityPlayerSP, int n, int n2, boolean bl) {
        entityPlayerSP.b(n, n2, bl);
    }

    public static void e(EntityPlayerSP entityPlayerSP, double d) {
        entityPlayerSP.setMotionSpeed(d);
    }

    public static int c(EntityPlayerSP entityPlayerSP, Potion potion) {
        return entityPlayerSP.b(potion);
    }

    public static int b(EntityPlayerSP entityPlayerSP, Item item, int n) {
        return entityPlayerSP.a(item, n);
    }

    public static boolean a(EntityPlayerSP entityPlayerSP, int n) {
        return entityPlayerSP.k(n);
    }

    static {
        if (PlayerInvoker.b() == null) {
            PlayerInvoker.b("lVHwHc");
        }
    }

    public static float b(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.A();
    }

    public static double a(EntityPlayerSP entityPlayerSP, boolean bl) {
        return entityPlayerSP.l(bl);
    }

    public static int l(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.av();
    }

    public static void an(EntityPlayerSP entityPlayerSP) {
        entityPlayerSP.az();
    }

    public static void e(EntityPlayerSP entityPlayerSP, int n) {
        entityPlayerSP.c(n);
    }

    public static void a(EntityPlayerSP entityPlayerSP, int n, int n2) {
        entityPlayerSP.a(n, n2);
    }

    public static Vec3 e(EntityPlayerSP entityPlayerSP, float f) {
        return entityPlayerSP.c(f);
    }

    public static double e(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.getJumpMotion();
    }

    public static void b(String string) {
        b = string;
    }

    public static BlockPos N(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.at();
    }

    public static aX4 a(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.O();
    }

    public static void a(EntityPlayerSP entityPlayerSP, float f, float f2) {
        entityPlayerSP.e(f, f2);
    }

    public static og_0 a(EntityPlayerSP entityPlayerSP, ItemStack itemStack, boolean bl) {
        return entityPlayerSP.a(itemStack, bl);
    }

    public static void d(EntityPlayerSP entityPlayerSP, int n) {
        entityPlayerSP.q(n);
    }

    public static void a(EntityPlayerSP entityPlayerSP, MovementInput movementInput) {
        entityPlayerSP.a(movementInput);
    }

    public static int c(EntityPlayerSP entityPlayerSP, Item item) {
        return entityPlayerSP.b(item);
    }

    public static int R(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.R();
    }

    public static float b(EntityPlayerSP entityPlayerSP, float f) {
        return entityPlayerSP.b(f);
    }

    public static boolean t(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.ag();
    }

    public static boolean I(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.r();
    }

    public static boolean ak(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.aj();
    }

    public static void b(EntityPlayerSP entityPlayerSP, String string) {
        entityPlayerSP.b(string);
    }

    public static void g(EntityPlayerSP entityPlayerSP, int n) {
        entityPlayerSP.b(n);
    }

    public static double n(EntityPlayerSP entityPlayerSP) {
        return entityPlayerSP.getLastTickDistance();
    }

    public static float c(EntityPlayerSP entityPlayerSP, float f) {
        return entityPlayerSP.c(f);
    }
}

