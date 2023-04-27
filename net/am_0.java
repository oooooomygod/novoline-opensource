/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
package net;

import cc.novoline.invoke.EntityPlayerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.common.base.Function;
import deobf.Entity;
import deobf.IChatComponent;
import deobf.MinecraftServer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import net.ChatComponentText;
import deobf.EntityPlayerMP;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.am
 */
public abstract class am_0
implements ICommand {
    private static a8H a;

    public static IChatComponent a(ICommandSender iCommandSender, String[] stringArray, int n, boolean bl) throws i6_0 {
        ChatComponentText chatComponentText = new ChatComponentText(ang_1.E);
        for (int i = n; i < stringArray.length; ++i) {
            if (i > n) {
                aBO.a((IChatComponent)chatComponentText, ang_1.v);
            }
            ChatComponentText chatComponentText2 = new ChatComponentText(stringArray[i]);
            ans_2.a(iCommandSender, stringArray[i]);
            if (ans_2.a(stringArray[i])) {
                throw new i6_0();
            }
            aBO.a((IChatComponent)chatComponentText, chatComponentText2);
        }
        return chatComponentText;
    }

    @Override
    public boolean a(ICommandSender iCommandSender) {
        return alj_1.a(iCommandSender, this.a(), ays_0.a(this));
    }

    public static HY a(double d, String string, int n, int n2, boolean bl) throws iy_2 {
        boolean bl2 = StringInvoker.e(string, ang_1.k);
        if (db_0.f(d)) {
            throw new iy_2(ang_1.x, db_0.a(d));
        }
        double d2 = 0.0;
        if (StringInvoker.c(string) > 1) {
            StringInvoker.a(string, (CharSequence)ang_1.C);
            string = StringInvoker.a(string, 1);
            d2 += am_0.a(string);
            d2 += 0.5;
        }
        if (d2 < (double)n) {
            throw new iy_2(ang_1.I, db_0.a(d2), P8.d(n));
        }
        if (d2 > (double)n2) {
            throw new iy_2(ang_1.K, db_0.a(d2), P8.d(n2));
        }
        return new HY(d2 + d, d2, bl2);
    }

    public static IChatComponent a(List<IChatComponent> list) {
        ChatComponentText chatComponentText = new ChatComponentText(ang_1.m);
        for (int i = 0; i < ListInvoker.size(list); ++i) {
            if (i == ListInvoker.size(list) - 1) {
                aBO.a((IChatComponent)chatComponentText, ang_1.d);
            } else {
                aBO.a((IChatComponent)chatComponentText, ang_1.A);
            }
            aBO.a((IChatComponent)chatComponentText, (IChatComponent)ListInvoker.get(list, i));
        }
        return chatComponentText;
    }

    public static int d(String string) throws iy_2 {
        try {
            return Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            throw new iy_2(ang_1.u, string);
        }
    }

    public static String a(Collection<String> collection) {
        return am_0.a(ms_0.a(collection, new String[ms_0.d(collection)]));
    }

    public static Entity b(ICommandSender iCommandSender, String string) throws il_2 {
        return am_0.a(iCommandSender, string, Entity.class);
    }

    public static double b(double d, String string, int n, int n2, boolean bl) throws iy_2 {
        StringInvoker.e(string, ang_1.r);
        if (db_0.f(d)) {
            throw new iy_2(ang_1.o, db_0.a(d));
        }
        double d2 = d;
        if (StringInvoker.c(string) > 1) {
            StringInvoker.a(string, (CharSequence)ang_1.F);
            string = StringInvoker.a(string, 1);
            d2 += am_0.a(string);
            d2 += 0.5;
        }
        if (d2 < (double)n) {
            throw new iy_2(ang_1.q, db_0.a(d2), P8.d(n));
        }
        if (d2 > (double)n2) {
            throw new iy_2(ang_1.f, db_0.a(d2), P8.d(n2));
        }
        return d2;
    }

    public static double a(String string, double d, double d2) throws iy_2 {
        double d3 = am_0.a(string);
        if (d3 < d) {
            throw new iy_2(ang_1.J, db_0.a(d3), db_0.a(d));
        }
        if (d3 > d2) {
            throw new iy_2(ang_1.g, db_0.a(d3), db_0.a(d2));
        }
        return d3;
    }

    public static double a(String string, double d) throws iy_2 {
        return am_0.a(string, d, Double.MAX_VALUE);
    }

    public static HY b(double d, String string, boolean bl) throws iy_2 {
        return am_0.a(d, string, -30000000, 30000000, bl);
    }

    public static boolean b(String string) throws ht_1 {
        if (!string.equals(ang_1.h) && !string.equals(ang_1.p)) {
            if (!string.equals(ang_1.w) && !string.equals(ang_1.n)) {
                throw new ht_1(ang_1.a, string);
            }
            return false;
        }
        return true;
    }

    public static long c(String string) throws iy_2 {
        try {
            return Long.parseLong(string);
        }
        catch (NumberFormatException numberFormatException) {
            throw new iy_2(ang_1.c, string);
        }
    }

    public static String g(ICommandSender iCommandSender, String string) throws il_2 {
        try {
            return EntityPlayerInvoker.s(am_0.f(iCommandSender, string));
        }
        catch (i6_0 i6_02) {
            try {
                return ayj_0.R(am_0.b(iCommandSender, string)).toString();
            }
            catch (il_2 il_22) {
                if (ans_2.a(string)) {
                    throw il_22;
                }
                return string;
            }
        }
    }

    public static <T extends Entity> T a(ICommandSender iCommandSender, String string, Class<? extends T> clazz) throws il_2 {
        Entity entity = ans_2.a(iCommandSender, string, clazz);
        MinecraftServer minecraftServer = ServerInvoker.d();
        entity = aek_1.a(ServerInvoker.R(minecraftServer), string);
        try {
            UUID uUID = awc_1.a(string);
            entity = ServerInvoker.a(minecraftServer, uUID);
            entity = aek_1.a(ServerInvoker.R(minecraftServer), uUID);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new il_2(ang_1.j, new Object[0]);
        }
        if (ara_2.a(clazz, entity.getClass())) {
            return (T)entity;
        }
        throw new il_2();
    }

    public static List<Entity> d(ICommandSender iCommandSender, String string) throws il_2 {
        return ans_2.a(string) ? ans_2.b(iCommandSender, string, Entity.class) : my_0.a(new Entity[]{am_0.b(iCommandSender, string)});
    }

    public static void a(a8H a8H2) {
        a = a8H2;
    }

    public static Block e(ICommandSender iCommandSender, String string) throws iy_2 {
        ResourceLocation resourceLocation = new ResourceLocation(string);
        if (!a82.d(Block.m, resourceLocation)) {
            throw new iy_2(ang_1.G, resourceLocation);
        }
        Block cfr_ignored_0 = (Block)a82.a(Block.m, resourceLocation);
        throw new iy_2(ang_1.b, resourceLocation);
    }

    public static void a(ICommandSender iCommandSender, ICommand iCommand, String string, Object ... objectArray) {
        am_0.a(iCommandSender, iCommand, 0, string, objectArray);
    }

    public static Item a(ICommandSender iCommandSender, String string) throws iy_2 {
        ResourceLocation resourceLocation = new ResourceLocation(string);
        Item cfr_ignored_0 = (Item)aLP.b(Item.k, resourceLocation);
        throw new iy_2(ang_1.l, resourceLocation);
    }

    public static List<String> a(String[] stringArray, String ... stringArray2) {
        return am_0.a(stringArray, a7r_0.a(stringArray2));
    }

    public static List<String> b(String[] stringArray, int n, BlockPos blockPos) {
        return null;
    }

    public static String a(Object[] objectArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < objectArray.length; ++i) {
            String string = objectArray[i].toString();
            if (i == objectArray.length - 1) {
                aL0.a(stringBuilder, ang_1.e);
            } else {
                aL0.a(stringBuilder, ang_1.B);
            }
            aL0.a(stringBuilder, string);
        }
        return stringBuilder.toString();
    }

    public static List<String> a(String[] stringArray, int n, BlockPos blockPos) {
        return null;
    }

    public static int a(String string, int n) throws iy_2 {
        return am_0.a(string, n, Integer.MAX_VALUE);
    }

    public int a(ICommand iCommand) {
        return StringInvoker.i(ays_0.a(this), XO.a(iCommand));
    }

    public static void a(ICommandSender iCommandSender, ICommand iCommand, int n, String string, Object ... objectArray) {
        if (a != null) {
            a.a(iCommandSender, iCommand, n, string, objectArray);
        }
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return null;
    }

    public static List<String> a(String[] stringArray, Collection<?> collection) {
        String string = stringArray[stringArray.length - 1];
        ArrayList arrayList = my_0.c();
        if (!ms_0.c(collection)) {
            Object object;
            Iterator iterator = ListInvoker.iterator((List)aMF.a(aMF.a(ms_0.b(collection), arg_0 -> ((Function)uc_2.a()).apply(arg_0)), aB0.a()));
            while (dz_0.c(iterator)) {
                object = (String)dz_0.b(iterator);
                if (!am_0.a(string, (String)object)) continue;
                ListInvoker.add(arrayList, object);
            }
            if (ListInvoker.isEmpty(arrayList)) {
                iterator = ms_0.a(collection);
                while (dz_0.c(iterator)) {
                    object = dz_0.b(iterator);
                    if (!(object instanceof ResourceLocation) || !am_0.a(string, axw_1.b((ResourceLocation)object))) continue;
                    ListInvoker.add(arrayList, StringInvoker.a(object));
                }
            }
        }
        return arrayList;
    }

    public static double a(double d, String string, boolean bl) throws iy_2 {
        return am_0.b(d, string, -30000000, 30000000, bl);
    }

    public static boolean a(String string, String string2) {
        return StringInvoker.a(string2, true, 0, string, 0, StringInvoker.c(string));
    }

    public static int a(String string, int n, int n2) throws iy_2 {
        int n3 = am_0.d(string);
        if (n3 < n) {
            throw new iy_2(ang_1.L, P8.d(n3), P8.d(n));
        }
        if (n3 > n2) {
            throw new iy_2(ang_1.y, P8.d(n3), P8.d(n2));
        }
        return n3;
    }

    public static EntityPlayerMP f(ICommandSender iCommandSender, String string) throws i6_0 {
        ans_2.b(iCommandSender, string);
        try {
            aek_1.a(ServerInvoker.R(ServerInvoker.d()), awc_1.a(string));
        }
        catch (IllegalArgumentException illegalArgumentException) {}
        aek_1.a(ServerInvoker.R(ServerInvoker.d()), string);
        throw new i6_0();
    }

    public static EntityPlayerMP a(ICommandSender iCommandSender) throws i6_0 {
        if (iCommandSender instanceof EntityPlayerMP) {
            return (EntityPlayerMP)iCommandSender;
        }
        throw new i6_0(ang_1.t, new Object[0]);
    }

    public static BlockPos b(ICommandSender iCommandSender, String[] stringArray, int n, boolean bl) throws iy_2 {
        BlockPos blockPos = alj_1.d(iCommandSender);
        return new BlockPos(am_0.b(amv_2.j(blockPos), stringArray[n], -30000000, 30000000, bl), am_0.b(amv_2.h(blockPos), stringArray[n + 1], 0, 256, false), am_0.b(amv_2.i(blockPos), stringArray[n + 2], -30000000, 30000000, bl));
    }

    public static String c(ICommandSender iCommandSender, String string) throws i6_0 {
        try {
            return EntityPlayerInvoker.s(am_0.f(iCommandSender, string));
        }
        catch (i6_0 i6_02) {
            if (ans_2.a(string)) {
                throw i6_02;
            }
            return string;
        }
    }

    @Override
    public boolean a(String[] stringArray, int n) {
        return false;
    }

    public int a() {
        return 4;
    }

    public static long a(String string, long l4, long l5) throws iy_2 {
        long l6 = am_0.c(string);
        if (l6 < l4) {
            throw new iy_2(ang_1.z, lx_2.b(l6), lx_2.b(l4));
        }
        if (l6 > l5) {
            throw new iy_2(ang_1.D, lx_2.b(l6), lx_2.b(l5));
        }
        return l6;
    }

    public static IChatComponent a(ICommandSender iCommandSender, String[] stringArray, int n) throws ht_1 {
        return am_0.a(iCommandSender, stringArray, n, false);
    }

    public static String a(String[] stringArray, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = n; i < stringArray.length; ++i) {
            if (i > n) {
                aL0.a(stringBuilder, ang_1.H);
            }
            String string = stringArray[i];
            aL0.a(stringBuilder, string);
        }
        return stringBuilder.toString();
    }

    @Override
    public List<String> a() {
        return asg_0.e();
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    public static double a(String string) throws iy_2 {
        try {
            double d = Double.parseDouble(string);
            if (!uz_2.a(d)) {
                throw new iy_2(ang_1.s, string);
            }
            return d;
        }
        catch (NumberFormatException numberFormatException) {
            throw new iy_2(ang_1.i, string);
        }
    }
}

