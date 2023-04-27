/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.apache.logging.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package net;

import cc.novoline.Novoline;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.NotificationManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.EntityPlayerSP;
import deobf.IChatComponent;
import deobf.MCInvoker;
import deobf.Packet;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

import net.minecraft.block.BlockPos;
import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.a0
 */
public abstract class a0_0
extends am_0 {
    protected String d;
    public static ao5_0 i = aar_1.a(azo_1.a(ain_0.d, anw_0.LIGHT_PURPLE), ain_0.c, anw_0.GRAY);
    public static IChatComponent h = new ChatComponentText(ain_0.a);
    protected qf_2<Minecraft> b;
    protected String j;
    protected Novoline g;
    protected qf_2<EntityPlayerSP> e;
    protected List<String> f;
    private static int[] c;

    @Override
    public int a() {
        return 0;
    }

    protected void a(@NotNull String string, int n) {
        this.a(string, n, NotificationType.ERROR);
    }

    protected void a(@Nullable ao5_0 ao5_02, boolean bl) {
        IChatComponent iChatComponent;
        StringInvoker.b();
        EntityPlayerSP entityPlayerSP = (EntityPlayerSP)ui_0.a(this.e);
        if (ao5_02 != null) {
            iChatComponent = aar_1.a(ao5_02, i);
            iChatComponent = ao5_02;
        }
        iChatComponent = h;
        PlayerInvoker.b(entityPlayerSP, iChatComponent);
        if (ListInvoker.b() != null) {
            StringInvoker.d("udzxc");
        }
    }

    private EntityPlayerSP lambda$new$0() {
        return ((Minecraft)ui_0.a(this.b)).player;
    }

    protected void a(@NotNull String string, @NotNull String string2) {
        this.a(azo_1.a(string, string2));
    }

    protected void b(@NotNull String string) {
        this.a(string, 2000);
    }

    protected a0_0(@NotNull Novoline novoline, @NotNull String string, @Nullable Iterable<String> iterable) {
        this(novoline, string, null, iterable);
    }

    @Override
    public String b() {
        return this.j;
    }

    protected void a(@NotNull String string, @NotNull String string2, int n, NotificationType notificationType) {
        NotificationManagerInvoker.a(NovolineInvoker.getNotificationManager(this.g), string, string2, n, notificationType);
    }

    protected void c(@NotNull String string, int n) {
        this.a(string, n, NotificationType.WARNING);
    }

    protected void a(@Nullable ao5_0 ao5_02) {
        this.a(ao5_02, false);
    }

    protected void a(@NotNull String string, @NotNull String string2, aoa_1 ... aoa_1Array) {
        this.a(azo_1.a(string, string2, aoa_1Array), true);
    }

    protected void b(@NotNull String string, int n) {
        this.a(string, n, NotificationType.INFO);
    }

    protected void a(@Nullable Object object) {
        StringInvoker.b();
        this.e(object != null ? object.toString() : null);
    }

    protected int a(String string) throws iy_2 {
        try {
            return Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            throw new iy_2(aL0.a(aL0.a(new StringBuilder(), string), ain_0.e).toString(), new Object[0]);
        }
    }

    protected void a(@Nullable String string, boolean bl) {
        this.a(azo_1.a(string), bl);
    }

    public qf_2<Minecraft> e() {
        return this.b;
    }

    protected void b() {
        PlayerInvoker.b((EntityPlayerSP)ui_0.a(this.e), azo_1.a());
    }

    protected List<String> a(@NotNull Collection<String> collection, @NotNull String string, boolean bl) {
        return this.a(ms_0.b(collection), string, bl);
    }

    @Override
    @Nullable
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return this.b(stringArray);
    }

    protected void a(@Nullable String string, @NotNull anw_0 anw_02) {
        ao5_0 ao5_02 = azo_1.a(string);
        aar_1.a(ao5_02, anw_02);
        this.a(ao5_02);
    }

    @Override
    @Nullable
    public String b(ICommandSender iCommandSender) {
        return null;
    }

    protected a0_0(@NotNull Novoline novoline, @NotNull String string, @Nullable String string2, @Nullable Iterable<String> iterable) {
        StringInvoker.b();
        this.b = ui_0.b(Minecraft::getInstance);
        this.e = ui_0.b(this::lambda$new$0);
        this.g = novoline;
        this.j = string;
        this.d = string2;
        this.f = iterable != null ? my_0.a(iterable) : asg_0.e();
        ListInvoker.b(new ListInvoker[3]);
    }

    protected a0_0(@NotNull Novoline novoline, @NotNull String string) {
        this(novoline, string, null, (Iterable<String>)null);
    }

    public static int[] d() {
        return c;
    }

    protected void a(@NotNull String string, int n, @Nullable NotificationType notificationType) {
        NotificationManagerInvoker.pop(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), string, n, notificationType);
    }

    protected void f(@NotNull String string) {
        this.c(string, 2000);
    }

    public abstract void a(String[] var1, int var2, int var3) throws ht_1, IOException;

    @Override
    public List<String> a() {
        return this.f;
    }

    private static boolean lambda$completeTab$3(String string, String string2) {
        return StringInvoker.e(string2, string);
    }

    protected void d(@NotNull String string) {
        this.a(string, 2000, NotificationType.INFO);
    }

    static {
        a0_0.b(null);
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        long l5 = l4 << 16 | (long)s << 48 >>> 48;
        long l6 = l5 ^ 0x58755F77170BL;
        int n = (int)(l6 >>> 32);
        int n2 = (int)(l6 << 32 >>> 32);
        try {
            this.a(stringArray, n, n2);
            return;
        }
        catch (ht_1 ht_12) {
            LoggerInvoker.b(this.c(), ht_12);
            throw ht_12;
        }
        catch (Throwable throwable) {
            LoggerInvoker.b(this.c(), throwable);
            aWR.c(throwable);
            throw new ht_1(ain_0.f, throwable, new Object[0]);
        }
    }

    protected List<String> a(@NotNull Stream<String> stream, @NotNull String string, boolean bl) {
        String string2 = StringInvoker.a(string, Locale.ROOT);
        return (List)aMF.a(aMF.b(aMF.a(stream, a0_0::lambda$completeTab$1), arg_0 -> a0_0.lambda$completeTab$2(string2, arg_0)), aB0.a(ObjectArrayList::new));
    }

    protected Logger c() {
        return Novoline.f();
    }

    public Novoline a() {
        return this.g;
    }

    @Nullable
    public List<String> b(String[] stringArray) {
        return null;
    }

    private static boolean lambda$completeTab$2(String string, String string2) {
        return StringInvoker.e(string2, string);
    }

    public void a(Packet packet) {
        MCInvoker.aa((Minecraft)ui_0.a(this.b)).a(packet);
    }

    protected a0_0(@NotNull Novoline novoline, @NotNull String string, @Nullable String string2, @Nullable String string3) {
        this(novoline, string, string2, asg_0.a(string3));
    }

    protected double c(String string) throws iy_2 {
        try {
            return Double.parseDouble(string);
        }
        catch (NumberFormatException numberFormatException) {
            throw new iy_2(aL0.a(aL0.a(new StringBuilder(), string), ain_0.b).toString(), new Object[0]);
        }
    }

    protected a0_0(@NotNull Novoline novoline, @NotNull String string, @Nullable String string2) {
        this(novoline, string, null, asg_0.a(string2));
    }

    @Override
    public boolean a(ICommandSender iCommandSender) {
        return true;
    }

    @Override
    public boolean a(String[] stringArray, int n) {
        return false;
    }

    private static String lambda$completeTab$1(String string) {
        return StringInvoker.a(string, Locale.ROOT);
    }

    protected void e(@Nullable String string) {
        this.a(azo_1.a(string));
    }

    public static void b(int[] nArray) {
        c = nArray;
    }

    protected void a(@NotNull String string, @Nullable NotificationType notificationType) {
        this.a(string, 2000, notificationType);
    }
}

