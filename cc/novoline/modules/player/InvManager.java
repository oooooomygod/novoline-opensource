/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.player;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.LoadWorldEvent;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.events.SettingEvent;
import cc.novoline.events.type.State;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.ItemBlockInvoker;
import cc.novoline.invoke.ItemStackInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import cc.novoline.modules.configurations.annotation.Property;
import cc.novoline.modules.exploits.Disabler;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;

import deobf.*;
import net.Ba;
import net.BooleanProperty;
import net.ChestStealer;
import net.Item;
import net.ItemBow;
import net.ItemPotion;
import net.Items;
import net.L0;
import net.LA;
import net.LB;
import net.LC;
import net.LK;
import net.LY;
import net.LZ;
import net.ListProperty;
import net.ModuleManager;
import net.NotificationType;
import net.P8;
import net.Potion;
import net.QI;
import net.R1;
import net.GuiChat;
import net.RW;
import net.StringProperty;
import net.WQ;
import net.a1c;
import net.a2l_0;
import net.a3M;
import net.aAK;
import net.aCM;
import net.aL0;
import net.abb_2;
import net.abx_0;
import net.act_2;
import net.adt_2;
import net.afm_0;
import net.alf_0;
import net.anw_0;
import net.aos_1;
import net.ari_0;
import net.asp_2;
import net.auk_2;
import net.ava_0;
import net.dz_0;
import net.en_2;
import net.lh_0;
import net.ls_0;
import net.lv_0;
import net.lw_0;
import net.ma_1;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.px_0;
import net.qh_1;
import net.rp_0;
import net.yl_2;
import org.checkerframework.checker.nullness.qual.NonNull;


public class InvManager
extends AbstractModule {
    private static String[] bb;
    @Property(value="keep-items")
    private ListProperty<String> U;
    private static String[] ab;
    @Property(value="pickaxe-slot")
    private IntProperty N;
    @Property(value="shovel-slot")
    private IntProperty Y;
    @Property(value="inventory-cleaner")
    private BooleanProperty R;
    @Property(value="no-move")
    private BooleanProperty X;
    @Property(value="sort-mode")
    private StringProperty H;
    @Property(value="custom-sort-ids")
    private ListProperty<Integer> S;
    @Property(value="arrows")
    private IntProperty I;
    @Property(value="auto-disable")
    private BooleanProperty M;
    @Property(value="axe-slot")
    private IntProperty K;
    @Property(value="open-inventory")
    private BooleanProperty V;
    @Property(value="weapon-slot")
    private IntProperty O;
    @Property(value="delay")
    private IntProperty L;
    private static Map cb;
    @Property(value="bow-slot")
    private IntProperty J;
    @Property(value="gapple-slot")
    private IntProperty P;
    @Property(value="head-slot")
    private IntProperty T;
    private TimerUtil Q;
    @Property(value="blocks")
    private IntProperty W;
    private static long Z;

    private Boolean lambda$new$0() {
        ChestStealer.d();
        return auk_2.b(ava_0.b(this.U, aos_1.h) && auk_2.a((Boolean)Ba.b(this.R)));
    }

    public void a(SettingEvent settingEvent) {
        ChestStealer.j();
        if (settingEvent == null || afm_0.b(settingEvent).equals(aos_1.q) || afm_0.b(settingEvent).equals(aos_1.P)) {
            this.c();
        }
    }

    public IntProperty t() {
        return this.W;
    }

    private Boolean lambda$new$3() {
        return auk_2.b(StringPropertyInvoker.isMode(this.H, aos_1.n));
    }

    private static String b(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    private int m() {
        ItemStack itemStack;
        ChestStealer.d();
        int n = 0;
        int n2 = 0;
        if (ItemStackInvoker.e(PlayerInvoker.f(this.mc.player, n2)) && act_2.k(itemStack = ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n2))) instanceof LC && this.e(itemStack)) {
            n += itemStack.a;
        }
        ++n2;
        return n;
    }

    private boolean d(@NonNull ItemStack itemStack) {
        ChestStealer.j();
        Item item = act_2.k(itemStack);
        if (!(item instanceof ItemBow)) {
            return false;
        }
        float f = this.a(itemStack);
        ItemStack itemStack2 = null;
        int n = 9;
        if (ItemStackInvoker.e(PlayerInvoker.f(this.mc.player, n)) && this.a(itemStack2 = ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n))) > f && act_2.k(itemStack2) instanceof ItemBow) {
            return false;
        }
        ++n;
        if (this.a(itemStack) > this.a(itemStack2)) {
            return true;
        }
        return act_2.s(itemStack) <= act_2.s(itemStack2);
    }

    private boolean[] a(int n) {
        ChestStealer.j();
        return new boolean[]{!ItemStackInvoker.e(PlayerInvoker.f(this.mc.player, n + 36)) || !this.e(ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n + 36))), !ItemStackInvoker.e(PlayerInvoker.f(this.mc.player, n + 36)) || !this.l(ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n + 36))), !ItemStackInvoker.e(PlayerInvoker.f(this.mc.player, n + 36)) || !this.b(ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n + 36))), !ItemStackInvoker.e(PlayerInvoker.f(this.mc.player, n + 36)) || !this.g(ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n + 36))), !ItemStackInvoker.e(PlayerInvoker.f(this.mc.player, n + 36)) || !this.f(ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n + 36))), !ItemStackInvoker.e(PlayerInvoker.f(this.mc.player, n + 36)) || !this.d(ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n + 36))), !ItemStackInvoker.e(PlayerInvoker.f(this.mc.player, n + 36)) || !this.k(ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n + 36)))};
    }

    public IntProperty g() {
        return this.Y;
    }

    public ListProperty<String> q() {
        return this.U;
    }

    public ListProperty<Integer> y() {
        return this.S;
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x4436;
        if (bb[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])cb.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                cb.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_9", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return bb[n2];
    }

    private int n() {
        ItemStack itemStack;
        ChestStealer.d();
        int n = 0;
        int n2 = 0;
        if (ItemStackInvoker.e(PlayerInvoker.f(this.mc.player, n2)) && act_2.k(itemStack = ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n2))) instanceof LK && this.g(itemStack)) {
            n += itemStack.a;
        }
        ++n2;
        return n;
    }

    public InvManager(@NonNull ModuleManager moduleManager, int n, EnumModuleType enumModuleType, String string, int n2, String string2) {
        long l4 = ((long)n << 32 | (long)n2 << 32 >>> 32) ^ Z;
        long l5 = l4 ^ 0x5932632060C3L;
        int n3 = (int)(l5 >>> 48);
        int n4 = (int)(l5 << 16 >>> 48);
        int n5 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n3, enumModuleType, string, (char)n4, n5, string2);
        this.Q = new TimerUtil();
        this.R = asp_2.d();
        this.V = asp_2.c();
        this.X = asp_2.c();
        this.L = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(1)), P8.d(1)), P8.d(10));
        this.I = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(128)), P8.d(64)), P8.d(512));
        this.W = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(128)), P8.d(0)), P8.d(512));
        this.N = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(7)), P8.d(1)), P8.d(9));
        this.K = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(8)), P8.d(1)), P8.d(9));
        this.Y = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(9)), P8.d(1)), P8.d(9));
        this.O = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(1)), P8.d(1)), P8.d(9));
        this.J = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(2)), P8.d(1)), P8.d(9));
        this.T = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(3)), P8.d(1)), P8.d(9));
        int n6 = ChestStealer.d();
        this.P = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(4)), P8.d(1)), P8.d(9));
        this.M = asp_2.d();
        this.U = ava_0.a(asp_2.a(InvManager.b("w", (int)5057, (long)(0x36FB02B9F76E779L ^ l4)), InvManager.b("w", (int)20459, (long)(0x3176430797E2BB45L ^ l4))), new String[]{InvManager.b("w", (int)12739, (long)(0x6020ED7AA272C575L ^ l4)), InvManager.b("w", (int)30202, (long)(0x77079891BD25815EL ^ l4)), InvManager.b("w", (int)16898, (long)(0x151FFA825CCF36A3L ^ l4)), InvManager.b("w", (int)1439, (long)(0x4BDCC05E9D3B712BL ^ l4)), InvManager.b("w", (int)16218, (long)(0x79921E0725C84BF1L ^ l4)), InvManager.b("w", (int)8119, (long)(0x2094433B4C366B1EL ^ l4)), InvManager.b("w", (int)23453, (long)(0x2838526E862AAF35L ^ l4)), InvManager.b("w", (int)18847, (long)(0x305C26926E9CBD2CL ^ l4))});
        this.H = StringPropertyInvoker.b(asp_2.a((String)((Object)InvManager.b("w", (int)29458, (long)(0x189EC1A613028796L ^ l4)))), new String[]{InvManager.b("w", (int)19377, (long)(0x617336F812BF16L ^ l4)), InvManager.b("w", (int)18835, (long)(0xAF73A14B2B43D33L ^ l4))});
        this.S = asp_2.a(new Integer[0]);
        ManagerInvoker.put(new Setting((String)((Object)InvManager.b("w", (int)973, (long)(0x3D3BD7EC7AC8776BL ^ l4))), (String)((Object)InvManager.b("w", (int)15743, (long)(0x34C860F7BFA149DCL ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.H));
        ManagerInvoker.put(new Setting((String)((Object)InvManager.b("w", (int)6813, (long)(0x1F752D290866E2AL ^ l4))), (String)((Object)InvManager.b("w", (int)6907, (long)(0x27348817DAB06E51L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.R));
        ManagerInvoker.put(new Setting((String)((Object)InvManager.b("w", (int)14036, (long)(0x12E6374EC088C276L ^ l4))), (String)((Object)InvManager.b("w", (int)8509, (long)(0x1BC95BFAB537D591L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.V));
        ManagerInvoker.put(new Setting((String)((Object)InvManager.b("w", (int)3269, (long)(0x2C6F800162387868L ^ l4))), (String)((Object)InvManager.b("w", (int)14602, (long)(0x212905F0C67D4DB7L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.X));
        ManagerInvoker.put(new Setting((String)((Object)InvManager.b("w", (int)2297, (long)(0x47178B7456A5FC45L ^ l4))), (String)((Object)InvManager.b("w", (int)10651, (long)(0x2EE972B549C35D20L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.L, 1.0));
        ManagerInvoker.put(new Setting((String)((Object)InvManager.b("w", (int)12231, (long)(0x3300D8D136CFDB72L ^ l4))), (String)((Object)InvManager.b("w", (int)24156, (long)(0x77F207F0CC92AAECL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.W, 64.0, this.R::get));
        ManagerInvoker.put(new Setting((String)((Object)InvManager.b("w", (int)9801, (long)(0x74A03836ACC652F6L ^ l4))), (String)((Object)InvManager.b("w", (int)7997, (long)(0x2EA860D534EB6BBBL ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.I, 64.0, this::lambda$new$0));
        ManagerInvoker.put(new Setting((String)((Object)InvManager.b("w", (int)21732, (long)(0x16AE261D39F22056L ^ l4))), (String)((Object)InvManager.b("w", (int)15016, (long)(0x58D63CCA08A3CE19L ^ l4))), SettingType.SELECTBOX, (AbstractModule)this, this.U));
        ManagerInvoker.put(new Setting((String)((Object)InvManager.b("w", (int)2598, (long)(0x5C2AB136AADF7E9FL ^ l4))), (String)((Object)InvManager.b("w", (int)23710, (long)(0x423866D6E0FD281BL ^ l4))), SettingType.BUTTON, (AbstractModule)this, this::lambda$new$1));
        ManagerInvoker.put(new Setting((String)((Object)InvManager.b("w", (int)15117, (long)(0x4A89B97E3EC8CFA2L ^ l4))), (String)((Object)InvManager.b("w", (int)449, (long)(0x11D359B3F0F7F57BL ^ l4))), SettingType.BUTTON, (AbstractModule)this, this::lambda$new$2, this::lambda$new$3));
        ManagerInvoker.put(new Setting((String)((Object)InvManager.b("w", (int)9475, (long)(0x74ABED3C401251BDL ^ l4))), (String)((Object)InvManager.b("w", (int)2483, (long)(0x5E278E106D697D16L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.M));
        if (ListInvoker.b() != null) {
            ChestStealer.a(++n6);
        }
    }

    static {
        Z = a1c.a(2425609085831677494L, 4775123870836192429L, MethodHandles.lookup().lookupClass()).a(155061536927846L);
        cb = new HashMap(13);
        long l4 = Z ^ 0x2857B6942AE8L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        int n = 2;
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l4 >>> 56);
        int n2 = 1;
        while (true) {
            byArray2 = byArray2;
            byArray2[n2] = (byte)(l4 << n2 * 8 >>> 56);
            ++n2;
        }
    }

    private float h(@NonNull ItemStack itemStack) {
        ChestStealer.j();
        float f = 0.0f;
        Item item = act_2.k(itemStack);
        if (item instanceof lw_0) {
            f += abx_0.a((lw_0)item);
        }
        if (item instanceof LC) {
            f += QI.b((LC)item);
        }
        return f += (float)alf_0.a(yl_2.b.c, itemStack) * 1.25f + (float)alf_0.a(yl_2.e.c, itemStack) * 0.3f;
    }

    public IntProperty r() {
        return this.K;
    }

    private void lambda$new$1(String string) {
        MCInvoker.displayGuiScreen(this.mc, new rp_0());
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = InvManager.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private boolean i(ItemStack itemStack) {
        Object object;
        ChestStealer.d();
        Item item = act_2.k(itemStack);
        String string = itemStack.r();
        int n = px_0.a(item);
        if (n == 58 || StringInvoker.a(StringInvoker.i(string), (CharSequence)aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.OBFUSCATED), aos_1.m).toString()) || StringInvoker.a(string, (CharSequence)aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), new Color(0, 255, 0, 255)), aos_1.x), (Object)anw_0.GRAY), aos_1.T).toString()) || StringInvoker.d(string, aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.AQUA), aos_1.an), (Object)anw_0.BOLD), aos_1.d), (Object)anw_0.GRAY), aos_1.l).toString()) || StringInvoker.d(string, aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.AQUA), aos_1.g), (Object)anw_0.BOLD), aos_1.W), (Object)anw_0.GRAY), aos_1.j).toString()) || StringInvoker.d(string, aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GREEN), aos_1.p), (Object)anw_0.BOLD), aos_1.r), (Object)anw_0.GRAY), aos_1.aB).toString()) || StringInvoker.d(string, aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GREEN), aos_1.aA), (Object)anw_0.GRAY), aos_1.aH).toString()) || StringInvoker.d(string, aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GREEN), aos_1.at), (Object)anw_0.GRAY), aos_1.aa).toString()) || StringInvoker.d(string, aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GREEN), aos_1.F), (Object)anw_0.GRAY), aos_1.H).toString()) || StringInvoker.d(string, aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GREEN), aos_1.S), (Object)anw_0.GRAY), aos_1.aP).toString()) || StringInvoker.d(string, aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.WHITE), aos_1.o), (Object)anw_0.RED), aos_1.ap), (Object)anw_0.GRAY), aos_1.ak).toString()) || StringInvoker.d(string, aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GREEN), aos_1.B), (Object)anw_0.GRAY), aos_1.b).toString()) || StringInvoker.d(string, aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.WHITE), aos_1.K), (Object)anw_0.RED), aos_1.aC), (Object)anw_0.GRAY), aos_1.k).toString()) || StringInvoker.d(string, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GOLD), aos_1.y).toString()) || StringInvoker.d(string, aos_1.I) || StringInvoker.d(string, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GREEN), aos_1.s).toString()) || StringInvoker.d(string, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.RED), aos_1.aM).toString()) || StringInvoker.d(string, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.RED), aos_1.aN).toString()) || StringInvoker.d(string, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GREEN), aos_1.D).toString()) || StringInvoker.d(string, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GOLD), aos_1.aQ).toString()) || StringInvoker.d(string, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GOLD), aos_1.ab).toString()) || n == 116 || n == 145 || StringInvoker.d(string, aos_1.as) || n == 259 || n == 46 || n == 165) {
            return false;
        }
        boolean bl = ava_0.b(this.U, aos_1.av);
        boolean bl2 = ava_0.b(this.U, aos_1.e);
        boolean bl3 = ava_0.b(this.U, aos_1.A);
        boolean bl4 = ava_0.b(this.U, aos_1.az);
        boolean bl5 = ava_0.b(this.U, aos_1.c);
        boolean bl6 = ava_0.b(this.U, aos_1.Q);
        int n2 = P8.b((Integer)adt_2.a(this.O)) - 1;
        int n3 = P8.b((Integer)adt_2.a(this.N)) - 1;
        int n4 = P8.b((Integer)adt_2.a(this.J)) - 1;
        int n5 = P8.b((Integer)adt_2.a(this.Y)) - 1;
        int n6 = P8.b((Integer)adt_2.a(this.K)) - 1;
        int n7 = P8.b((Integer)adt_2.a(this.T)) - 1;
        if ((this.g(itemStack) && this.n() < 2 || act_2.k(itemStack) instanceof LK && itemStack == InventoryInvoker.c(this.mc.player.inventory, n5)) && bl2 || (this.d(itemStack) && this.o() < 2 || act_2.k(itemStack) instanceof ItemBow && itemStack == InventoryInvoker.c(this.mc.player.inventory, n4)) && bl5 || (this.f(itemStack) && this.x() < 2 || act_2.k(itemStack) instanceof L0 && itemStack == InventoryInvoker.c(this.mc.player.inventory, n7)) && bl6 || (this.l(itemStack) && this.j() < 2 || act_2.k(itemStack) instanceof ls_0 && itemStack == InventoryInvoker.c(this.mc.player.inventory, n6)) && bl3 || (this.b(itemStack) && this.w() < 2 || act_2.k(itemStack) instanceof LY && itemStack == InventoryInvoker.c(this.mc.player.inventory, n3)) && bl || (this.e(itemStack) && this.m() < 2 || act_2.k(itemStack) instanceof LC && itemStack == InventoryInvoker.c(this.mc.player.inventory, n2)) && bl4) {
            return false;
        }
        if (item instanceof ItemArmor) {
            ItemStack itemStack2;
            object = (AutoArmor)ModuleInvoker.isEnable(ModuleRegistry.AUTOARMOR);
            int n8 = 1;
            if (!(ItemStackInvoker.e(PlayerInvoker.f(this.mc.player, 4 + n8)) && ((AutoArmor)object).a(itemStack2 = ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, 4 + n8)), n8) || !((AutoArmor)object).a(itemStack, n8))) {
                return false;
            }
            ++n8;
        }
        if (item instanceof ItemBlock && (this.b() > P8.b((Integer)adt_2.a(this.W)) || ListInvoker.contains(ma_1.a((Scaffold)ModuleInvoker.isEnable(ModuleRegistry.SCAFFOLD)), ItemBlockInvoker.a((ItemBlock)item))) || item instanceof ItemPotion && this.c(itemStack) || item instanceof LA && !(item instanceof lh_0) && item != Items.bread && item != Items.pumpkin_pie && item != Items.baked_potato && item != Items.cooked_chicken && item != Items.carrot && item != Items.apple && item != Items.beef && item != Items.cooked_beef && item != Items.porkchop && item != Items.cooked_porkchop && item != Items.mushroom_stew && item != Items.cooked_fish && item != Items.melon || item instanceof LZ || item instanceof lw_0 || item instanceof LC || item instanceof ItemArmor) {
            return true;
        }
        object = px_0.c(item);
        if (StringPropertyInvoker.isMode(this.H, aos_1.au)) {
            return StringInvoker.a((String)object, (CharSequence)aos_1.w) || StringInvoker.a((String)object, (CharSequence)aos_1.G) || this.d() > 64 && item == Items.iron_ingot || this.e() > 64 && item == Items.coal || StringInvoker.a((String)object, (CharSequence)aos_1.aF) || StringInvoker.a((String)object, (CharSequence)aos_1.i) || StringInvoker.a((String)object, (CharSequence)aos_1.ah) || StringInvoker.a((String)object, (CharSequence)aos_1.M) || StringInvoker.a((String)object, (CharSequence)aos_1.aw) || StringInvoker.a((String)object, (CharSequence)aos_1.aq) && !StringInvoker.a(StringInvoker.i(string), (CharSequence)aos_1.aG) || StringInvoker.a((String)object, (CharSequence)aos_1.v) || StringInvoker.a((String)object, (CharSequence)aos_1.ay) || StringInvoker.a((String)object, (CharSequence)aos_1.R) || StringInvoker.a((String)object, (CharSequence)aos_1.a) || StringInvoker.a((String)object, (CharSequence)aos_1.am) || StringInvoker.a((String)object, (CharSequence)aos_1.ar) || StringInvoker.a((String)object, (CharSequence)aos_1.z) || item instanceof LB || item instanceof lv_0 || n == 113 || n == 106 || n == 325 && (!ava_0.b(this.U, aos_1.X) || PlayerInvoker.c(this.mc.player, 325) > 1) || n == 326 && (!ava_0.b(this.U, aos_1.C) || PlayerInvoker.c(this.mc.player, 326) > 1) || n == 327 && (!ava_0.b(this.U, aos_1.aL) || PlayerInvoker.c(this.mc.player, 327) > 1) || n == 335 && (!ava_0.b(this.U, aos_1.aO) || PlayerInvoker.c(this.mc.player, 335) > 1) || n == 111 || n == 85 || n == 188 || n == 189 || n == 190 || n == 191 || n == 401 || n == 192 || n == 81 || n == 32 || StringInvoker.a((String)object, (CharSequence)aos_1.af) || StringInvoker.a((String)object, (CharSequence)aos_1.J) || StringInvoker.a((String)object, (CharSequence)aos_1.Z) || item instanceof ItemBow || item == Items.arrow && this.p() > (ava_0.b(this.U, aos_1.aj) ? P8.b((Integer)adt_2.a(this.I)) : 0) || n == 175 || n == 340 || n == 339 || n == 160 || n == 101 || n == 102 || n == 321 || n == 323 || n == 389 || n == 416 || n == 171 || n == 139 || n == 23 || n == 25 || n == 69 || n == 70 || n == 72 || n == 77 || n == 96 || n == 107 || n == 123 || n == 131 || n == 143 || n == 147 || n == 148 || n == 151 || n == 154 || n == 158 || n == 167 || n == 403 || n == 183 || n == 184 || n == 185 || n == 186 || n == 187 || n == 331 || n == 356 || n == 404 || n == 27 || n == 28 || n == 66 || n == 76 || n == 157 || n == 328 || n == 342 || n == 343 || n == 398 || n == 407 || n == 408 || n == 138 || n == 352 || n == 385 || n == 386 || n == 395 || n == 402 || n == 418 || n == 419 || n == 281 || n == 289 || n == 337 || n == 336 || n == 348 || n == 353 || n == 369 || n == 372 || n == 405 || n == 406 || n == 409 || n == 410 || n == 415 || n == 370 || n == 376 || n == 377 || n == 378 || n == 379 || n == 380 || n == 382 || n == 414 || n == 346 || n == 347 || n == 420 || n == 397 || n == 421 || n == 341 || StringInvoker.a((String)object, (CharSequence)aos_1.E) || StringInvoker.a((String)object, (CharSequence)aos_1.aJ) || StringInvoker.a((String)object, (CharSequence)aos_1.ad) || StringInvoker.a((String)object, (CharSequence)aos_1.t) || StringInvoker.a((String)object, (CharSequence)aos_1.f) || StringInvoker.a((String)object, (CharSequence)aos_1.aS);
        }
        return !ava_0.b(this.S, P8.d(n));
    }

    private boolean g(@NonNull ItemStack itemStack) {
        ChestStealer.d();
        Item item = act_2.k(itemStack);
        if (!(item instanceof LK)) {
            return false;
        }
        float f = this.j(itemStack);
        ItemStack itemStack2 = null;
        int n = 9;
        if (ItemStackInvoker.e(PlayerInvoker.f(this.mc.player, n)) && this.j(itemStack2 = ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n))) > f && act_2.k(itemStack2) instanceof LK) {
            return false;
        }
        ++n;
        if (this.j(itemStack) > this.j(itemStack2)) {
            return true;
        }
        return act_2.s(itemStack) <= act_2.s(itemStack2);
    }

    public BooleanProperty i() {
        return this.X;
    }

    private int d() {
        ItemStack itemStack;
        int n = 0;
        ChestStealer.d();
        int n2 = 0;
        if (ItemStackInvoker.e(PlayerInvoker.f(this.mc.player, n2)) && act_2.k(itemStack = ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n2))) == Items.iron_ingot) {
            n += itemStack.a;
        }
        ++n2;
        return n;
    }

    public IntProperty a() {
        return this.L;
    }

    private boolean e(ItemStack itemStack) {
        ChestStealer.d();
        Item item = act_2.k(itemStack);
        if (!(item instanceof LC)) {
            return false;
        }
        float f = this.h(itemStack);
        ItemStack itemStack2 = null;
        int n = 9;
        if (ItemStackInvoker.e(PlayerInvoker.f(this.mc.player, n)) && this.h(itemStack2 = ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n))) > f && act_2.k(itemStack2) instanceof LC) {
            return false;
        }
        ++n;
        if (this.h(itemStack) > this.h(itemStack2)) {
            return true;
        }
        return act_2.s(itemStack) <= act_2.s(itemStack2);
    }

    private void c() {
        ChestStealer.j();
        Disabler disabler = (Disabler)ModuleInvoker.isEnable(ModuleRegistry.DISABLER);
        if (!(disabler.x() && aAK.c(disabler) || auk_2.a((Boolean)Ba.b(this.X)))) {
            if (!disabler.x()) {
                this.a(this.r(), aos_1.ac, 5000, NotificationType.WARNING);
            }
            this.a(this.r(), aos_1.ai, 5000, NotificationType.WARNING);
            Ba.a(this.X, auk_2.b(true));
        }
    }

    private boolean c(ItemStack itemStack) {
        ChestStealer.j();
        if (itemStack != null && act_2.k(itemStack) instanceof ItemPotion) {
            ItemPotion itemPotion = (ItemPotion)act_2.k(itemStack);
            return en_2.a(itemPotion, itemStack) == null || this.a(itemStack, itemPotion);
        }
        return false;
    }

    private int p() {
        ItemStack itemStack;
        int n = 0;
        ChestStealer.d();
        int n2 = 0;
        if (ItemStackInvoker.e(PlayerInvoker.f(this.mc.player, n2)) && act_2.k(itemStack = ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n2))) == Items.arrow) {
            n += itemStack.a;
        }
        ++n2;
        return n;
    }

    private boolean f(@NonNull ItemStack itemStack) {
        ChestStealer.j();
        return act_2.k(itemStack) instanceof L0 && StringInvoker.a(itemStack.r(), (CharSequence)aos_1.aD) && !StringInvoker.d(itemStack.r(), aos_1.ag) && !StringInvoker.d(itemStack.r(), aos_1.U) && !StringInvoker.d(itemStack.r(), aos_1.aE) && !StringInvoker.d(itemStack.r(), aos_1.N);
    }

    private float a(ItemStack itemStack) {
        return 1 + alf_0.a(yl_2.j.c, itemStack) + alf_0.a(yl_2.a.c, itemStack) + alf_0.a(yl_2.t.c, itemStack);
    }

    private boolean l(@NonNull ItemStack itemStack) {
        ChestStealer.d();
        Item item = act_2.k(itemStack);
        if (!(item instanceof ls_0)) {
            return false;
        }
        float f = this.j(itemStack);
        ItemStack itemStack2 = null;
        int n = 9;
        if (ItemStackInvoker.e(PlayerInvoker.f(this.mc.player, n)) && this.j(itemStack2 = ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n))) > f && act_2.k(itemStack2) instanceof ls_0) {
            return false;
        }
        ++n;
        if (this.j(itemStack) > this.j(itemStack2)) {
            return true;
        }
        return act_2.s(itemStack) <= act_2.s(itemStack2);
    }

    @Override
    public void o() {
    }

    private void lambda$new$2(String string) {
        MCInvoker.displayGuiScreen(this.mc, new RW());
    }

    private boolean b(ItemStack itemStack) {
        ChestStealer.d();
        Item item = act_2.k(itemStack);
        if (!(item instanceof LY)) {
            return false;
        }
        float f = this.j(itemStack);
        ItemStack itemStack2 = null;
        int n = 9;
        if (ItemStackInvoker.e(PlayerInvoker.f(this.mc.player, n)) && this.j(itemStack2 = ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n))) > f && act_2.k(itemStack2) instanceof LY) {
            return false;
        }
        ++n;
        if (this.j(itemStack) > this.j(itemStack2)) {
            return true;
        }
        return act_2.s(itemStack) <= act_2.s(itemStack2);
    }

    public IntProperty u() {
        return this.O;
    }

    private int j() {
        ItemStack itemStack;
        ChestStealer.d();
        int n = 0;
        int n2 = 0;
        if (ItemStackInvoker.e(PlayerInvoker.f(this.mc.player, n2)) && act_2.k(itemStack = ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n2))) instanceof ls_0 && this.l(itemStack)) {
            n += itemStack.a;
        }
        ++n2;
        return n;
    }

    public BooleanProperty h() {
        return this.V;
    }

    private int b() {
        int n = 0;
        ChestStealer.d();
        int n2 = 0;
        if (ItemStackInvoker.e(PlayerInvoker.f(this.mc.player, n2))) {
            ItemStack itemStack = ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n2));
            Item item = act_2.k(itemStack);
            Scaffold scaffold = (Scaffold)ModuleInvoker.isEnable(ModuleRegistry.SCAFFOLD);
            if (act_2.k(itemStack) instanceof ItemBlock && !ListInvoker.contains(ma_1.a(scaffold), ItemBlockInvoker.a((ItemBlock)item))) {
                n += itemStack.a;
            }
        }
        ++n2;
        return n;
    }

    private int e() {
        ItemStack itemStack;
        ChestStealer.d();
        int n = 0;
        int n2 = 0;
        if (ItemStackInvoker.e(PlayerInvoker.f(this.mc.player, n2)) && act_2.k(itemStack = ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n2))) == Items.coal) {
            n += itemStack.a;
        }
        ++n2;
        return n;
    }

    public IntProperty f() {
        return this.J;
    }

    private int x() {
        ItemStack itemStack;
        int n = 0;
        ChestStealer.d();
        int n2 = 0;
        if (ItemStackInvoker.e(PlayerInvoker.f(this.mc.player, n2)) && act_2.k(itemStack = ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n2))) instanceof L0 && this.g(itemStack)) {
            n += itemStack.a;
        }
        ++n2;
        return n;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_9" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    @Override
    public void w() {
        qh_1.b(this.Q);
    }

    @EventTarget
    public void a(LoadWorldEvent loadWorldEvent) {
        ChestStealer.j();
        if (auk_2.a((Boolean)Ba.b(this.M))) {
            this.a(this.r(), aos_1.ae, 3000, NotificationType.WARNING);
            this.d();
        }
    }

    private boolean k(@NonNull ItemStack itemStack) {
        return act_2.k(itemStack) instanceof lh_0;
    }

    public IntProperty s() {
        return this.N;
    }

    public IntProperty k() {
        return this.T;
    }

    public BooleanProperty z() {
        return this.R;
    }

    private int w() {
        ItemStack itemStack;
        ChestStealer.j();
        int n = 0;
        int n2 = 0;
        if (ItemStackInvoker.e(PlayerInvoker.f(this.mc.player, n2)) && act_2.k(itemStack = ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n2))) instanceof LY && this.b(itemStack)) {
            n += itemStack.a;
        }
        ++n2;
        return n;
    }

    @EventTarget
    public void a(MotionUpdateEvent motionUpdateEvent) {
        ChestStealer.j();
        if (EventInvoker.getState(motionUpdateEvent).equals((Object)State.PRE)) {
            if (aCM.a(abb_2.PRE) || aCM.a(abb_2.LOBBY) || auk_2.a((Boolean)Ba.b(this.X)) && PlayerInvoker.q(this.mc.player)) {
                return;
            }
            if (auk_2.a((Boolean)Ba.b(this.V)) ? this.mc.currentScreen instanceof R1 : this.mc.currentScreen == null || this.mc.currentScreen instanceof R1 || this.mc.currentScreen instanceof GuiChat) {
                int n = P8.b((Integer)adt_2.a(this.O)) - 1;
                int n2 = P8.b((Integer)adt_2.a(this.N)) - 1;
                int n3 = P8.b((Integer)adt_2.a(this.J)) - 1;
                int n4 = P8.b((Integer)adt_2.a(this.Y)) - 1;
                int n5 = P8.b((Integer)adt_2.a(this.K)) - 1;
                int n6 = P8.b((Integer)adt_2.a(this.T)) - 1;
                int n7 = P8.b((Integer)adt_2.a(this.P)) - 1;
                boolean bl = ava_0.b(this.U, aos_1.ax);
                boolean bl2 = ava_0.b(this.U, aos_1.V);
                boolean bl3 = ava_0.b(this.U, aos_1.aK);
                boolean bl4 = ava_0.b(this.U, aos_1.aI);
                boolean bl5 = ava_0.b(this.U, aos_1.Y);
                boolean bl6 = ava_0.b(this.U, aos_1.O);
                boolean bl7 = ava_0.b(this.U, aos_1.al);
                AutoArmor autoArmor = (AutoArmor)ModuleInvoker.isEnable(ModuleRegistry.AUTOARMOR);
                int n8 = P8.b((Integer)adt_2.a(this.L)) * 50;
                int n9 = WQ.a(autoArmor) * 50;
                int n10 = 9;
                ItemStack itemStack = ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n10));
                if (itemStack != null && !StringInvoker.a(itemStack.r(), (CharSequence)aos_1.u) && qh_1.b(this.Q, n8)) {
                    if (this.e(itemStack) && bl4 && this.a(n)[0]) {
                        PlayerInvoker.a(this.mc.player, n10, n);
                        qh_1.b(this.Q);
                    }
                    if (this.b(itemStack) && bl && this.a(n2)[2]) {
                        PlayerInvoker.a(this.mc.player, n10, n2);
                        qh_1.b(this.Q);
                    }
                    if (this.l(itemStack) && bl3 && this.a(n5)[1]) {
                        PlayerInvoker.a(this.mc.player, n10, n5);
                        qh_1.b(this.Q);
                    }
                    if (this.d(itemStack) && bl5 && this.a(n3)[5]) {
                        PlayerInvoker.a(this.mc.player, n10, n3);
                        qh_1.b(this.Q);
                    }
                    if (this.f(itemStack) && bl6 && this.a(n6)[4]) {
                        PlayerInvoker.a(this.mc.player, n10, n6);
                        qh_1.b(this.Q);
                    }
                    if (this.g(itemStack) && bl2 && this.a(n4)[3]) {
                        PlayerInvoker.a(this.mc.player, n10, n4);
                        qh_1.b(this.Q);
                    }
                    if (this.k(itemStack) && bl7 && this.a(n7)[6]) {
                        PlayerInvoker.a(this.mc.player, n10, n7);
                        qh_1.b(this.Q);
                    }
                }
                ++n10;
                n10 = 9;
                if (!ItemStackInvoker.e(PlayerInvoker.f(this.mc.player, n10))) {
                    // empty if block
                }
                itemStack = ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n10));
                if (auk_2.a((Boolean)Ba.b(this.R)) && this.i(itemStack) && qh_1.c(this.Q, n8) && qh_1.c(WQ.b(autoArmor), n9)) {
                    PlayerInvoker.b(this.mc.player, n10);
                    qh_1.b(this.Q);
                }
                ++n10;
            }
        }
    }

    private float j(@NonNull ItemStack itemStack) {
        float f;
        block5: {
            block7: {
                lw_0 lw_02;
                String string;
                Item item;
                block6: {
                    block4: {
                        ChestStealer.j();
                        item = act_2.k(itemStack);
                        if (!(item instanceof lw_0)) {
                            return 0.0f;
                        }
                        string = px_0.c(item);
                        lw_02 = (lw_0)item;
                        if (!(item instanceof LY)) break block4;
                        f = abx_0.a(lw_02, itemStack, Blocks.stone);
                        if (!StringInvoker.a(StringInvoker.i(string), (CharSequence)aos_1.aR)) break block5;
                        f -= 5.0f;
                    }
                    if (!(item instanceof LK)) break block6;
                    f = abx_0.a(lw_02, itemStack, Blocks.dirt);
                    if (!StringInvoker.a(StringInvoker.i(string), (CharSequence)aos_1.ao)) break block5;
                    f -= 5.0f;
                }
                if (!(item instanceof ls_0)) break block7;
                f = abx_0.a(lw_02, itemStack, Blocks.b2);
                if (!StringInvoker.a(StringInvoker.i(string), (CharSequence)aos_1.L)) break block5;
                f -= 5.0f;
            }
            return 1.0f;
        }
        f = (float)((double)f + (double)alf_0.a(yl_2.p.c, itemStack) * 0.0075);
        f = (float)((double)f + (double)alf_0.a(yl_2.k.c, itemStack) / 100.0);
        return f;
    }

    private int o() {
        ItemStack itemStack;
        ChestStealer.d();
        int n = 0;
        int n2 = 0;
        if (ItemStackInvoker.e(PlayerInvoker.f(this.mc.player, n2)) && act_2.k(itemStack = ItemStackInvoker.a(PlayerInvoker.f(this.mc.player, n2))) instanceof ItemBow && this.d(itemStack)) {
            n += itemStack.a;
        }
        ++n2;
        return n;
    }

    public boolean a(ItemStack itemStack, ItemPotion itemPotion) {
        ChestStealer.d();
        Iterator iterator = ListInvoker.iterator(en_2.a(itemPotion, itemStack));
        if (dz_0.c(iterator)) {
            a2l_0 a2l_02 = (a2l_0)dz_0.b(iterator);
            a3M.b(a2l_02);
            Potion potion = Potion.potionTypes[a3M.b(a2l_02)];
            if (ari_0.b(potion)) {
                return true;
            }
        }
        return false;
    }

    public IntProperty l() {
        return this.P;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(InvManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

