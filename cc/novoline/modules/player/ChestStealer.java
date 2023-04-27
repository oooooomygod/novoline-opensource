/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package cc.novoline.modules.player;

import cc.novoline.events.EventTarget;
import cc.novoline.events.State;
import cc.novoline.events.events.LoadWorldEvent;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.events.PacketEvent;
import cc.novoline.events.events.TickUpdateEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.ItemStackInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.NBTInvoker;
import cc.novoline.invoke.PacketEventInvoker;
import cc.novoline.invoke.PlayerControllerInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.modules.AbstractModule;
import net.minecraft.init.Blocks;
import cc.novoline.modules.EnumModuleType;
import deobf.INetHandlerPlayClient;
import deobf.IntProperty;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import deobf.ModuleRegistry;
import deobf.Packet;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import deobf.TileEntity;
import deobf.TimerUtil;
import net.minecraft.network.packts.C0EPacketClickWindow;
import net.minecraft.network.packts.S2DPacketOpenWindow;
import net.minecraft.network.packts.S30PacketWindowItems;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;

import org.checkerframework.checker.nullness.qual.NonNull;

public class ChestStealer
extends AbstractModule {
    @Property(value="extra-packet")
    private BooleanProperty ae;
    @Property(value="no-move")
    private BooleanProperty N;
    private TimerUtil U;
    private TimerUtil V;
    private List<Integer> Q;
    private boolean ac;
    @Property(value="delay")
    private IntProperty Z;
    @Property(value="close-delay")
    private IntProperty J;
    private TimerUtil T;
    private static int M;
    @Property(value="aura-range")
    private DoubleProperty aa;
    @Property(value="ignore")
    private BooleanProperty H;
    @Property(value="auto-disable")
    private BooleanProperty K;
    private TimerUtil O;
    private static long bb;
    private static String[] cb;
    private String[] W;
    @Property(value="start-delay")
    private IntProperty R;
    private List<Packet> Y;
    @Property(value="rotate-camera")
    private BooleanProperty ab;
    private int ad;
    @Property(value="cs-aura")
    private BooleanProperty X;
    private boolean S;
    private static String[] eb;
    @Property(value="silent")
    private BooleanProperty I;
    private List<String> L;
    private static Map ib;
    private int P;

    public ItemStack d(ItemStack[] itemStackArray) {
        ChestStealer.d();
        if (this.a(itemStackArray)) {
            return (ItemStack)oc_1.b(aMF.b(ListInvoker.stream((List)aMF.a(aMF.a(aMF.a(aMF.b(aMF.a(itemStackArray), ChestStealer::lambda$bestSword$30), ChestStealer::lambda$bestSword$31), this::lambda$bestSword$32), aB0.a()))));
        }
        return null;
    }

    private int lambda$bestTool$29(ItemStack itemStack, ItemStack itemStack2) {
        return axx_1.a(this.b(itemStack2), this.b(itemStack));
    }

    private static int lambda$bestArmor$18(ItemStack itemStack, ItemStack itemStack2) {
        return P8.a(act_2.u(itemStack2) - act_2.s(itemStack2), act_2.u(itemStack) - act_2.s(itemStack));
    }

    public boolean a(ItemStack[] itemStackArray) {
        ChestStealer.d();
        int n = this.f(itemStackArray);
        return n >= 0;
    }

    private int b(ItemStack[] itemStackArray, a71 a712) {
        ChestStealer.j();
        int n = 0;
        if (n < itemStackArray.length) {
            if (itemStackArray[n] != null && StringInvoker.a(px_0.c(act_2.k(itemStackArray[n])), (CharSequence)this.a(a712))) {
                return n;
            }
            ++n;
        }
        return -1;
    }

    private static int lambda$bestArmor$15(ItemStack itemStack, ItemStack itemStack2) {
        return P8.a(act_2.u(itemStack2) - act_2.s(itemStack2), act_2.u(itemStack) - act_2.s(itemStack));
    }

    public boolean a() {
        return this.ac;
    }

    @EventTarget
    public void a(PacketEvent packetEvent) {
        ChestStealer.j();
        if (PacketEventInvoker.getState(packetEvent).equals((Object)State.INCOMING)) {
            Packet<INetHandlerPlayClient> packet;
            if (PacketEventInvoker.c(packetEvent) instanceof S2DPacketOpenWindow) {
                String[] stringArray;
                int n;
                int n2;
                packet = (S2DPacketOpenWindow)PacketEventInvoker.c(packetEvent);
                this.ac = li_2.d(packet).equals(aL0.a(aL0.a(new StringBuilder(), aB_.L), fo_0.a(fo_0.a()) > 340 ? aB_.z : aB_.t).toString());
                if (aCM.a(abb_2.LOBBY) || aCM.a(abb_2.PRE)) {
                    this.ac = false;
                }
                if ((n2 = 0) < (n = (stringArray = this.W).length)) {
                    String string = stringArray[n2];
                    if (StringInvoker.a(StringInvoker.i(aBO.d(li_2.f(packet))), (CharSequence)string)) {
                        this.ac = false;
                    }
                    ++n2;
                }
                if (this.ac) {
                    this.P = li_2.a(packet);
                    this.ad = li_2.e(packet);
                    ListInvoker.clear(this.Q);
                    this.S = false;
                    qh_1.b(this.O);
                    qh_1.b(this.U);
                }
            }
            if (this.ac && PacketEventInvoker.c(packetEvent) instanceof S30PacketWindowItems && agi_1.b((S30PacketWindowItems)(packet = (S30PacketWindowItems)PacketEventInvoker.c(packetEvent))) == this.ad && !this.S) {
                int n = 0;
                if (n < this.P) {
                    ItemStack itemStack = agi_1.a((S30PacketWindowItems)packet)[n];
                    if (!auk_2.a((Boolean)Ba.b(this.H)) || this.e(itemStack) && this.d(itemStack, (S30PacketWindowItems)packet) && this.c(itemStack, (S30PacketWindowItems)packet) && this.a(itemStack, (S30PacketWindowItems)packet) && this.b(itemStack, (S30PacketWindowItems)packet)) {
                        ListInvoker.add(this.Q, P8.d(n));
                    }
                    ++n;
                }
                this.S = true;
            }
        }
    }

    public boolean b() {
        ChestStealer.d();
        return this.x() && auk_2.a((Boolean)Ba.b(this.N)) && this.mc.currentScreen instanceof R_;
    }

    public static void a(int n) {
        M = n;
    }

    private int lambda$bestArmor$16(ItemStack itemStack, ItemStack itemStack2) {
        return axx_1.a(this.d(itemStack2), this.d(itemStack));
    }

    private static int lambda$bestTool$22(ItemStack itemStack, ItemStack itemStack2) {
        return P8.a(act_2.u(itemStack2) - act_2.s(itemStack2), act_2.u(itemStack) - act_2.s(itemStack));
    }

    private ItemStack[] i() {
        return this.mc.player.inventory.d;
    }

    private boolean c(ItemStack itemStack) {
        ChestStealer.j();
        if (itemStack != null && act_2.k(itemStack) instanceof ItemPotion) {
            ItemPotion itemPotion = (ItemPotion)act_2.k(itemStack);
            if (en_2.b(act_2.s(itemStack))) {
                InvManager invManager = (InvManager)ModuleInvoker.isEnable(ModuleRegistry.INVMANAGER);
                return ld_2.a(invManager, itemStack, itemPotion);
            }
        }
        return false;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_8" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private float f(ItemStack itemStack) {
        return 1 + alf_0.a(yl_2.j.c, itemStack) + alf_0.a(yl_2.a.c, itemStack) + alf_0.a(yl_2.t.c, itemStack);
    }

    private void lambda$onMotion$3(Integer n) {
        PlayerInvoker.a(this.mc.player, this.ad, P8.b(n), false);
    }

    @EventTarget
    public void a(MotionUpdateEvent motionUpdateEvent) {
        block8: {
            block9: {
                ChestStealer.d();
                if (!EventInvoker.getState(motionUpdateEvent).equals((Object)cc.novoline.events.type.State.PRE) || !this.ac) break block8;
                if (auk_2.a((Boolean)Ba.b(this.ae))) {
                    if (!ListInvoker.isEmpty(this.Q)) {
                        ListInvoker.forEach(this.Q, this::lambda$onMotion$3);
                        ListInvoker.clear(this.Q);
                    }
                    PlayerInvoker.P(this.mc.player);
                    this.ac = false;
                }
                if (ListInvoker.isEmpty(this.Q)) break block9;
                if (!qh_1.c(this.U, P8.b((Integer)adt_2.a(this.R))) || !qh_1.c(this.T, P8.b((Integer)adt_2.a(this.Z)))) break block8;
                int n = anf_2.a(anf_2.c(), ListInvoker.size(this.Q));
                short s = afy_2.c(this.mc.player.bI);
                ItemStack itemStack = afy_2.a(this.mc.player.bI, P8.b((Integer)ListInvoker.get(this.Q, n)), 0, 1, this.mc.player);
                C0EPacketClickWindow c0EPacketClickWindow = new C0EPacketClickWindow(this.ad, P8.b((Integer)ListInvoker.get(this.Q, n)), 0, 1, itemStack, s);
                if (aCM.d() && !auk_2.a((Boolean)Ba.b(this.N))) {
                    ListInvoker.add(this.Y, c0EPacketClickWindow);
                }
                this.a(c0EPacketClickWindow);
                ListInvoker.remove(this.Q, ListInvoker.get(this.Q, n));
                qh_1.b(this.T);
            }
            if (qh_1.c(this.O, P8.b((Integer)adt_2.a(this.J)))) {
                if (!ListInvoker.isEmpty(this.Y)) {
                    ListInvoker.forEach(this.Y, this::a);
                    ListInvoker.clear(this.Y);
                }
                PlayerInvoker.P(this.mc.player);
                this.ac = false;
            }
        }
    }

    public boolean e() {
        ChestStealer.j();
        return this.x() && this.ac && auk_2.a((Boolean)Ba.b(this.I));
    }

    public boolean a(ItemStack[] itemStackArray, a71 a712) {
        ChestStealer.j();
        int n = this.b(itemStackArray, a712);
        return n >= 0;
    }

    private static int lambda$bestSword$31(ItemStack itemStack, ItemStack itemStack2) {
        return P8.a(act_2.u(itemStack2) - act_2.s(itemStack2), act_2.u(itemStack) - act_2.s(itemStack));
    }

    private int lambda$bestSword$32(ItemStack itemStack, ItemStack itemStack2) {
        return axx_1.a(this.a(itemStack2), this.a(itemStack));
    }

    private Boolean lambda$new$1() {
        ChestStealer.j();
        return auk_2.b(!auk_2.a((Boolean)Ba.b(this.ae)));
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = ChestStealer.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private int f(ItemStack[] itemStackArray) {
        ChestStealer.j();
        int n = 0;
        if (n < itemStackArray.length) {
            if (itemStackArray[n] != null && act_2.k(itemStackArray[n]) instanceof LC) {
                return n;
            }
            ++n;
        }
        return -1;
    }

    public boolean c(ItemStack[] itemStackArray, a2Z a2Z2) {
        ChestStealer.j();
        int n = this.b(itemStackArray, a2Z2);
        return n >= 0;
    }

    private boolean c(ItemStack itemStack, S30PacketWindowItems s30PacketWindowItems) {
        ChestStealer.j();
        if (act_2.k(itemStack) instanceof LY) {
            return itemStack.equals(this.c(agi_1.a(s30PacketWindowItems), a71.PICKAXE)) && (this.c(this.h(), a71.PICKAXE) == null || this.b(this.c(agi_1.a(s30PacketWindowItems), a71.PICKAXE)) > this.b(this.c(this.h(), a71.PICKAXE)));
        }
        if (act_2.k(itemStack) instanceof ls_0) {
            return itemStack.equals(this.c(agi_1.a(s30PacketWindowItems), a71.AXE)) && (this.c(this.h(), a71.AXE) == null || this.b(this.c(agi_1.a(s30PacketWindowItems), a71.AXE)) > this.b(this.c(this.h(), a71.AXE)));
        }
        if (act_2.k(itemStack) instanceof LK) {
            return itemStack.equals(this.c(agi_1.a(s30PacketWindowItems), a71.SHOVEL)) && (this.c(this.h(), a71.SHOVEL) == null || this.b(this.c(agi_1.a(s30PacketWindowItems), a71.SHOVEL)) > this.b(this.c(this.h(), a71.SHOVEL)));
        }
        return true;
    }

    private int lambda$bestArmor$7(ItemStack itemStack, ItemStack itemStack2) {
        return axx_1.a(this.d(itemStack2), this.d(itemStack));
    }

    private float a(@NonNull ItemStack itemStack) {
        ChestStealer.d();
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

    public String a(a71 a712) {
        ChestStealer.d();
        if (a712.equals((Object)a71.AXE)) {
            return aB_.G;
        }
        if (a712.equals((Object)a71.PICKAXE)) {
            return aB_.o;
        }
        if (a712.equals((Object)a71.SHOVEL)) {
            return aB_.w;
        }
        return aB_.i;
    }

    public String b(a2Z a2Z2) {
        ChestStealer.d();
        if (a2Z2.equals((Object)a2Z.LEGGINS)) {
            return aB_.A;
        }
        if (a2Z2.equals((Object)a2Z.CHESTPLATE)) {
            return aB_.p;
        }
        if (a2Z2.equals((Object)a2Z.BOOTS)) {
            return aB_.P;
        }
        if (a2Z2.equals((Object)a2Z.HELMET)) {
            return aB_.c;
        }
        return aB_.C;
    }

    private static boolean lambda$bestBow$33(ItemStack itemStack) {
        ChestStealer.j();
        return itemStack != null && act_2.k(itemStack) instanceof ItemBow;
    }

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x20D4;
        if (eb[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])ib.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                ib.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_8", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return eb[n2];
    }

    private boolean lambda$bestArmor$17(a2Z a2Z2, ItemStack itemStack) {
        ChestStealer.j();
        return itemStack != null && StringInvoker.a(px_0.c(act_2.k(itemStack)), (CharSequence)this.b(a2Z2));
    }

    private static boolean lambda$bestSword$30(ItemStack itemStack) {
        ChestStealer.d();
        return itemStack != null && act_2.k(itemStack) instanceof LC;
    }

    private static boolean lambda$bestTool$24(ItemStack itemStack) {
        ChestStealer.d();
        return itemStack != null && act_2.k(itemStack) instanceof LK;
    }

    @Override
    public void o() {
        ChestStealer.j();
        this.a(auk_2.a((Boolean)Ba.b(this.ae)) ? aB_.s : this.Z.toString());
    }

    @Override
    public void w() {
        this.S = false;
        this.ac = false;
        ListInvoker.clear(this.Q);
    }

    private boolean d(ItemStack itemStack, S30PacketWindowItems s30PacketWindowItems) {
        ChestStealer.d();
        if (StringInvoker.a(px_0.c(act_2.k(itemStack)), (CharSequence)aB_.N)) {
            return itemStack.equals(this.a(agi_1.a(s30PacketWindowItems), a2Z.HELMET)) && (this.a(a2Z.HELMET) == null || this.d(this.a(agi_1.a(s30PacketWindowItems), a2Z.HELMET)) > this.d(this.a(a2Z.HELMET)));
        }
        if (StringInvoker.a(px_0.c(act_2.k(itemStack)), (CharSequence)aB_.e)) {
            return itemStack.equals(this.a(agi_1.a(s30PacketWindowItems), a2Z.CHESTPLATE)) && (this.a(a2Z.CHESTPLATE) == null || this.d(this.a(agi_1.a(s30PacketWindowItems), a2Z.CHESTPLATE)) > this.d(this.a(a2Z.CHESTPLATE)));
        }
        if (StringInvoker.a(px_0.c(act_2.k(itemStack)), (CharSequence)aB_.E)) {
            return itemStack.equals(this.a(agi_1.a(s30PacketWindowItems), a2Z.BOOTS)) && (this.a(a2Z.BOOTS) == null || this.d(this.a(agi_1.a(s30PacketWindowItems), a2Z.BOOTS)) > this.d(this.a(a2Z.BOOTS)));
        }
        if (StringInvoker.a(px_0.c(act_2.k(itemStack)), (CharSequence)aB_.j)) {
            return itemStack.equals(this.a(agi_1.a(s30PacketWindowItems), a2Z.LEGGINS)) && (this.a(a2Z.LEGGINS) == null || this.d(this.a(agi_1.a(s30PacketWindowItems), a2Z.LEGGINS)) > this.d(this.a(a2Z.LEGGINS)));
        }
        return true;
    }

    public ItemStack a(a2Z a2Z2) {
        ChestStealer.j();
        if (this.c(this.h(), a2Z2) && this.c(this.i(), a2Z2)) {
            return (ItemStack)oc_1.b(aMF.b(ListInvoker.stream((List)aMF.a(aMF.a(aMF.a(aMF.b(aMF.a(new ItemStack[]{(ItemStack)oc_1.b(aMF.b(ListInvoker.stream((List)aMF.a(aMF.a(aMF.b(a7r_0.e(this.h()), arg_0 -> this.lambda$bestArmor$4(a2Z2, arg_0)), this::lambda$bestArmor$5), aB0.a())))), (ItemStack)oc_1.b(aMF.b(ListInvoker.stream((List)aMF.a(aMF.a(aMF.b(a7r_0.e(this.i()), arg_0 -> this.lambda$bestArmor$6(a2Z2, arg_0)), this::lambda$bestArmor$7), aB0.a()))))}), arg_0 -> this.lambda$bestArmor$8(a2Z2, arg_0)), ChestStealer::lambda$bestArmor$9), this::lambda$bestArmor$10), aB0.a()))));
        }
        if (this.c(this.h(), a2Z2)) {
            return (ItemStack)oc_1.b(aMF.b(ListInvoker.stream((List)aMF.a(aMF.a(aMF.a(aMF.b(a7r_0.e(this.h()), arg_0 -> this.lambda$bestArmor$11(a2Z2, arg_0)), ChestStealer::lambda$bestArmor$12), this::lambda$bestArmor$13), aB0.a()))));
        }
        if (this.c(this.i(), a2Z2)) {
            return (ItemStack)oc_1.b(aMF.b(ListInvoker.stream((List)aMF.a(aMF.a(aMF.a(aMF.b(a7r_0.e(this.i()), arg_0 -> this.lambda$bestArmor$14(a2Z2, arg_0)), ChestStealer::lambda$bestArmor$15), this::lambda$bestArmor$16), aB0.a()))));
        }
        return null;
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

    private boolean lambda$bestArmor$6(a2Z a2Z2, ItemStack itemStack) {
        ChestStealer.d();
        return itemStack != null && StringInvoker.a(px_0.c(act_2.k(itemStack)), (CharSequence)this.b(a2Z2));
    }

    public ChestStealer(@NonNull ModuleManager moduleManager, EnumModuleType enumModuleType, String string, String string2, short s, int n, short s3) {
        long l4 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)s3 << 48 >>> 48) ^ bb;
        long l5 = l4 ^ 0x28F66AAB59EL;
        int n2 = (int)(l5 >>> 48);
        int n3 = (int)(l5 << 16 >>> 48);
        int n4 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n2, enumModuleType, string, (char)n3, n4, string2);
        this.W = new String[]{ChestStealer.b("m", (int)1959, (long)(0x4EE5FD45CA74C2B3L ^ l4)), ChestStealer.b("m", (int)28464, (long)(0x42E1C3D1F37E2A6BL ^ l4)), ChestStealer.b("m", (int)25067, (long)(0xA66DB63AC3D24F7L ^ l4)), ChestStealer.b("m", (int)22179, (long)(0x2EB012BB7A1E93FAL ^ l4)), ChestStealer.b("m", (int)28839, (long)(0x5150D9987DDBB5AAL ^ l4)), ChestStealer.b("m", (int)4982, (long)(0x6C6F20BB1E29D663L ^ l4)), ChestStealer.b("m", (int)22364, (long)(0x4F4ABBE26692127CL ^ l4)), ChestStealer.b("m", (int)25004, (long)(0x2D2FB25F9E35A4F3L ^ l4)), ChestStealer.b("m", (int)23077, (long)(0x7D75822E96E91F3CL ^ l4)), ChestStealer.b("m", (int)16424, (long)(0x7464C1760027052FL ^ l4)), ChestStealer.b("m", (int)13896, (long)(0xB55F7331119737AL ^ l4)), ChestStealer.b("m", (int)5925, (long)(0x59BDC0155544521BL ^ l4)), ChestStealer.b("m", (int)1005, (long)(0x178B1E4845DEC6E7L ^ l4)), ChestStealer.b("m", (int)30597, (long)(0x18135AC08E5DB2AEL ^ l4)), ChestStealer.b("m", (int)8192, (long)(0x6BB26CBC643B6524L ^ l4)), ChestStealer.b("m", (int)17911, (long)(0x38F4C46715E080F5L ^ l4)), ChestStealer.b("m", (int)19310, (long)(0x69CF353DBEE88E3DL ^ l4)), ChestStealer.b("m", (int)18872, (long)(0x5B96C41E5DD48C82L ^ l4)), ChestStealer.b("m", (int)25971, (long)(0x4C0E215B15EE2056L ^ l4)), ChestStealer.b("m", (int)20793, (long)(0x495FA37D29BB9463L ^ l4)), ChestStealer.b("m", (int)26308, (long)(0x270E9553B40523C7L ^ l4)), ChestStealer.b("m", (int)19935, (long)(0x60632222982188C2L ^ l4)), ChestStealer.b("m", (int)9395, (long)(0x1FDFA5FC2F0E1EDL ^ l4)), ChestStealer.b("m", (int)23999, (long)(0x4072D0AA2B7B18E2L ^ l4)), ChestStealer.b("m", (int)4593, (long)(0x6F15FD158D28D4DEL ^ l4)), ChestStealer.b("m", (int)16672, (long)(0x7B0B1B89D0370428L ^ l4)), ChestStealer.b("m", (int)20883, (long)(0x784F58B16FF14BAL ^ l4)), ChestStealer.b("m", (int)18542, (long)(0x7570BCE4159A8D6FL ^ l4)), ChestStealer.b("m", (int)15967, (long)(0x1A15C036B9297B56L ^ l4)), ChestStealer.b("m", (int)3484, (long)(0x3ECEC53B0473C8A1L ^ l4)), ChestStealer.b("m", (int)16400, (long)(0x6C2A9D7D4E7A850BL ^ l4)), ChestStealer.b("m", (int)29590, (long)(0x7DBE79B2CFE7B690L ^ l4)), ChestStealer.b("m", (int)31001, (long)(0xCC71420B882BC20L ^ l4)), ChestStealer.b("m", (int)6102, (long)(0x7D50758652F752C1L ^ l4)), ChestStealer.b("m", (int)8027, (long)(0x6AEA87ADFE5DDA67L ^ l4)), ChestStealer.b("m", (int)4485, (long)(0x4A4BC91A07D7D4B0L ^ l4)), ChestStealer.b("m", (int)5813, (long)(0x3EA95973EEE2D3ADL ^ l4)), ChestStealer.b("m", (int)11828, (long)(0x7A8EA4C1F70DEB1AL ^ l4)), ChestStealer.b("m", (int)29597, (long)(0x20DAE05D435336B0L ^ l4)), ChestStealer.b("m", (int)16108, (long)(0x56192474E8A7FBCFL ^ l4)), ChestStealer.b("m", (int)32367, (long)(0x3419C9320A7F3B75L ^ l4)), ChestStealer.b("m", (int)31917, (long)(0x362A087113DDB98CL ^ l4)), ChestStealer.b("m", (int)16359, (long)(0x2D05F4BF0172FAF4L ^ l4)), ChestStealer.b("m", (int)13529, (long)(0x3FA98A8A787571D9L ^ l4)), ChestStealer.b("m", (int)30891, (long)(0x1FDC430F307FBDF9L ^ l4)), ChestStealer.b("m", (int)20802, (long)(0x55AEC11D1627945DL ^ l4)), ChestStealer.b("m", (int)16382, (long)(0x5A2BC1A77586FAC9L ^ l4)), ChestStealer.b("m", (int)23248, (long)(0x485B58F9C92E1FF2L ^ l4)), ChestStealer.b("m", (int)1247, (long)(0x236017B1741D41C1L ^ l4)), ChestStealer.b("m", (int)1305, (long)(0x3E50A0C9390DC028L ^ l4))};
        this.T = new TimerUtil();
        this.V = new TimerUtil();
        this.O = new TimerUtil();
        this.U = new TimerUtil();
        this.Q = new ArrayList<Integer>();
        this.Y = new ArrayList<Packet>();
        this.L = new ArrayList<String>();
        this.K = asp_2.d();
        this.Z = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(80)), P8.d(50)), P8.d(200));
        this.ae = asp_2.c();
        this.H = asp_2.c();
        this.N = asp_2.c();
        this.ab = asp_2.c();
        ChestStealer.d();
        this.X = asp_2.c();
        this.aa = (DoubleProperty)MD.c((DoubleProperty)MD.a(asp_2.a(db_0.a(4.0)), db_0.a(3.0)), db_0.a(4.5));
        this.J = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(50)), P8.d(0)), P8.d(200));
        this.R = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(50)), P8.d(0)), P8.d(200));
        this.I = asp_2.c();
        ManagerInvoker.put(new Setting((String)((Object)ChestStealer.b("m", (int)3971, (long)(0x35B75011E937CAB8L ^ l4))), (String)((Object)ChestStealer.b("m", (int)21862, (long)(0x25D8F7B154699050L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.N));
        ManagerInvoker.put(new Setting((String)((Object)ChestStealer.b("m", (int)8186, (long)(0x692B40715BB95AA6L ^ l4))), (String)((Object)ChestStealer.b("m", (int)6235, (long)(0x22A5D3AA368FDD49L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.ab));
        ManagerInvoker.put(new Setting((String)((Object)ChestStealer.b("m", (int)22700, (long)(0x4B5D850391099D86L ^ l4))), (String)((Object)ChestStealer.b("m", (int)28900, (long)(0x8C0F74F18F0B5E8L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.H));
        ManagerInvoker.put(new Setting((String)((Object)ChestStealer.b("m", (int)11755, (long)(0x1D26DBF0D06EE8C3L ^ l4))), (String)((Object)ChestStealer.b("m", (int)1980, (long)(0x513A6D8C915DC2ACL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.I));
        ManagerInvoker.put(new Setting((String)((Object)ChestStealer.b("m", (int)5520, (long)(0x58D5EED77E58D081L ^ l4))), (String)((Object)ChestStealer.b("m", (int)7967, (long)(0x408954127B85DA47L ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.ae));
        ManagerInvoker.put(new Setting((String)((Object)ChestStealer.b("m", (int)10930, (long)(0x26500FAECAB9EF8DL ^ l4))), (String)((Object)ChestStealer.b("m", (int)28519, (long)(0x30B4B329448BAA4BL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.X));
        ManagerInvoker.put(new Setting((String)((Object)ChestStealer.b("m", (int)27445, (long)(0x72FF8CC38FF7AE31L ^ l4))), (String)((Object)ChestStealer.b("m", (int)24974, (long)(0x1267755D91482481L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.aa, 0.1, this.X::get));
        ManagerInvoker.put(new Setting((String)((Object)ChestStealer.b("m", (int)24813, (long)(0x3BEF492C3A5625DDL ^ l4))), (String)((Object)ChestStealer.b("m", (int)28886, (long)(0x66568ACFCBFBB5F1L ^ l4))), SettingType.SLIDER, this, this.Z, 5.0, (String)((Object)ChestStealer.b("m", (int)16380, (long)(0x2C80C9386B57FAC8L ^ l4))), this::lambda$new$0));
        ManagerInvoker.put(new Setting((String)((Object)ChestStealer.b("m", (int)21053, (long)(0x78C05910D07C1738L ^ l4))), (String)((Object)ChestStealer.b("m", (int)5022, (long)(0x46202BC09D35D688L ^ l4))), SettingType.SLIDER, this, this.R, 5.0, (String)((Object)ChestStealer.b("m", (int)2291, (long)(0x468BD6B5DBCDCDD5L ^ l4))), this::lambda$new$1));
        ManagerInvoker.put(new Setting((String)((Object)ChestStealer.b("m", (int)9431, (long)(0x410C4339205AE1D9L ^ l4))), (String)((Object)ChestStealer.b("m", (int)15316, (long)(0x1CDE9BA2D023FEE7L ^ l4))), SettingType.SLIDER, this, this.J, 5.0, (String)((Object)ChestStealer.b("m", (int)2291, (long)(0x468BD6B5DBCDCDD5L ^ l4))), this::lambda$new$2));
        ManagerInvoker.put(new Setting((String)((Object)ChestStealer.b("m", (int)9962, (long)(0x5946B811FB60E3D2L ^ l4))), (String)((Object)ChestStealer.b("m", (int)5271, (long)(0x3E65D718F4B6D19CL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.K));
        ListInvoker.b(new ListInvoker[4]);
    }

    private static int lambda$bestArmor$9(ItemStack itemStack, ItemStack itemStack2) {
        return P8.a(act_2.u(itemStack2) - act_2.s(itemStack2), act_2.u(itemStack) - act_2.s(itemStack));
    }

    private boolean e(ItemStack itemStack) {
        ItemStack itemStack2;
        ItemStack itemStack3 = null;
        float f = -1.0f;
        ChestStealer.j();
        int n = 9;
        if (ItemStackInvoker.e(afy_2.a(this.mc.player.bp, n)) && act_2.k(itemStack2 = ItemStackInvoker.a(afy_2.a(this.mc.player.bp, n))) instanceof LC && act_2.k(itemStack) instanceof LC && f < this.a(itemStack2)) {
            f = this.a(itemStack2);
            itemStack3 = itemStack2;
        }
        ++n;
        if (itemStack3 != null && act_2.k(itemStack3) instanceof LC && act_2.k(itemStack) instanceof LC) {
            float f2 = this.a(itemStack3);
            float f3 = this.a(itemStack);
            if (f3 > f2) {
                return true;
            }
        }
        return itemStack == null || !StringInvoker.a(px_0.c(act_2.k(itemStack)), (CharSequence)aB_.m) && (!StringInvoker.a(px_0.c(act_2.k(itemStack)), (CharSequence)aB_.n) || StringInvoker.a(px_0.c(act_2.k(itemStack)), (CharSequence)aB_.I)) && !StringInvoker.a(px_0.c(act_2.k(itemStack)), (CharSequence)aB_.M) && !StringInvoker.a(px_0.c(act_2.k(itemStack)), (CharSequence)aB_.J) && !StringInvoker.a(px_0.c(act_2.k(itemStack)), (CharSequence)aB_.Q) && !StringInvoker.a(px_0.c(act_2.k(itemStack)), (CharSequence)aB_.v) && !StringInvoker.a(px_0.c(act_2.k(itemStack)), (CharSequence)aB_.g) && !StringInvoker.a(px_0.c(act_2.k(itemStack)), (CharSequence)aB_.B) && !StringInvoker.a(px_0.c(act_2.k(itemStack)), (CharSequence)aB_.O) && !StringInvoker.a(px_0.c(act_2.k(itemStack)), (CharSequence)aB_.R) && !StringInvoker.a(px_0.c(act_2.k(itemStack)), (CharSequence)aB_.d) && !StringInvoker.a(px_0.c(act_2.k(itemStack)), (CharSequence)aB_.u) && !StringInvoker.a(px_0.c(act_2.k(itemStack)), (CharSequence)aB_.q) && !StringInvoker.a(px_0.c(act_2.k(itemStack)), (CharSequence)aB_.r) && !StringInvoker.a(px_0.c(act_2.k(itemStack)), (CharSequence)aB_.y) && !(act_2.k(itemStack) instanceof LB) && !StringInvoker.a(px_0.c(act_2.k(itemStack)), (CharSequence)aB_.H) && (!StringInvoker.a(px_0.c(act_2.k(itemStack)), (CharSequence)aB_.F) || !this.c(itemStack));
    }

    private static int lambda$bestTool$28(ItemStack itemStack, ItemStack itemStack2) {
        return P8.a(act_2.u(itemStack2) - act_2.s(itemStack2), act_2.u(itemStack) - act_2.s(itemStack));
    }

    private float d(@NonNull ItemStack itemStack) {
        ChestStealer.j();
        float f = 0.0f;
        if (act_2.k(itemStack) instanceof ItemArmor) {
            ItemArmor itemArmor = (ItemArmor)act_2.k(itemStack);
            f = (float)((double)f + ((double)itemArmor.o + (double)((100 - itemArmor.o) * alf_0.a(yl_2.x.c, itemStack)) * 0.0075));
            f = (float)((double)f + (double)alf_0.a(yl_2.D.c, itemStack) / 100.0);
            f = (float)((double)f + (double)alf_0.a(yl_2.o.c, itemStack) / 100.0);
            f = (float)((double)f + (double)alf_0.a(yl_2.h.c, itemStack) / 100.0);
            f = (float)((double)f + (double)alf_0.a(yl_2.k.c, itemStack) / 50.0);
            f = (float)((double)f + (double)alf_0.a(yl_2.v.c, itemStack) / 100.0);
        }
        return f;
    }

    private boolean lambda$bestArmor$11(a2Z a2Z2, ItemStack itemStack) {
        ChestStealer.d();
        return itemStack != null && StringInvoker.a(px_0.c(act_2.k(itemStack)), (CharSequence)this.b(a2Z2));
    }

    private Boolean lambda$new$0() {
        ChestStealer.j();
        return auk_2.b(!auk_2.a((Boolean)Ba.b(this.ae)));
    }

    private boolean lambda$bestArmor$8(a2Z a2Z2, ItemStack itemStack) {
        ChestStealer.j();
        return itemStack != null && StringInvoker.a(px_0.c(act_2.k(itemStack)), (CharSequence)this.b(a2Z2));
    }

    public List<String> f() {
        return this.L;
    }

    @EventTarget
    public void a(LoadWorldEvent loadWorldEvent) {
        ChestStealer.j();
        if (auk_2.a((Boolean)Ba.b(this.K))) {
            this.a(this.r(), aB_.b, 3000, NotificationType.WARNING);
            this.d();
        }
    }

    public static int d() {
        return M;
    }

    private int lambda$bestTool$26(ItemStack itemStack, ItemStack itemStack2) {
        return axx_1.a(this.b(itemStack2), this.b(itemStack));
    }

    public ItemStack b(ItemStack[] itemStackArray) {
        ChestStealer.j();
        if (this.e(itemStackArray)) {
            return (ItemStack)oc_1.b(aMF.b(ListInvoker.stream((List)aMF.a(aMF.a(aMF.b(aMF.a(itemStackArray), ChestStealer::lambda$bestBow$33), this::lambda$bestBow$34), aB0.a()))));
        }
        return null;
    }

    public ItemStack c(ItemStack[] itemStackArray, a71 a712) {
        ChestStealer.d();
        if (this.a(itemStackArray, a712)) {
            if (a712.equals((Object)a71.PICKAXE)) {
                return (ItemStack)oc_1.b(aMF.b(aMF.a(aMF.b(aMF.a(itemStackArray), ChestStealer::lambda$bestTool$21), ChestStealer::lambda$bestTool$22), this::lambda$bestTool$23));
            }
            if (a712.equals((Object)a71.SHOVEL)) {
                return (ItemStack)oc_1.b(aMF.b(aMF.a(aMF.b(aMF.a(itemStackArray), ChestStealer::lambda$bestTool$24), ChestStealer::lambda$bestTool$25), this::lambda$bestTool$26));
            }
            if (a712.equals((Object)a71.AXE)) {
                return (ItemStack)oc_1.b(aMF.b(aMF.a(aMF.b(aMF.a(itemStackArray), ChestStealer::lambda$bestTool$27), ChestStealer::lambda$bestTool$28), this::lambda$bestTool$29));
            }
        }
        return null;
    }

    private int lambda$bestArmor$10(ItemStack itemStack, ItemStack itemStack2) {
        return axx_1.a(this.d(itemStack2), this.d(itemStack));
    }

    @EventTarget
    public void a(ayp_1 ayp_12) {
        ChestStealer.d();
        if (awp_0.a(ayp_12).equals(aL0.a(aL0.a(new StringBuilder(), aB_.K), fo_0.a(fo_0.a()) > 340 ? aB_.l : aB_.h).toString()) && this.g()) {
            aYO.a(this.mc.mouseHelper);
        }
    }

    private boolean a(ItemStack itemStack, S30PacketWindowItems s30PacketWindowItems) {
        ChestStealer.d();
        if (act_2.k(itemStack) instanceof LC) {
            return itemStack.equals(this.d(agi_1.a(s30PacketWindowItems))) && (this.d(this.h()) == null || this.a(this.d(agi_1.a(s30PacketWindowItems))) > this.a(this.d(this.h())));
        }
        return true;
    }

    public static int j() {
        ChestStealer.d();
        return 101;
    }

    private int lambda$bestArmor$19(ItemStack itemStack, ItemStack itemStack2) {
        return axx_1.a(this.d(itemStack2), this.d(itemStack));
    }

    private int lambda$bestTool$23(ItemStack itemStack, ItemStack itemStack2) {
        return axx_1.a(this.b(itemStack2), this.b(itemStack));
    }

    private Boolean lambda$new$2() {
        ChestStealer.d();
        return auk_2.b(!auk_2.a((Boolean)Ba.b(this.ae)));
    }

    private ItemStack[] h() {
        return this.mc.player.inventory.b;
    }

    private float b(@NonNull ItemStack itemStack) {
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
                        if (!StringInvoker.a(StringInvoker.i(string), (CharSequence)aB_.f)) break block5;
                        f -= 6.0f;
                    }
                    if (!(item instanceof LK)) break block6;
                    f = abx_0.a(lw_02, itemStack, Blocks.dirt);
                    if (!StringInvoker.a(StringInvoker.i(string), (CharSequence)aB_.x)) break block5;
                    f -= 6.0f;
                }
                if (!(item instanceof ls_0)) break block7;
                f = abx_0.a(lw_02, itemStack, Blocks.b2);
                if (!StringInvoker.a(StringInvoker.i(string), (CharSequence)aB_.k)) break block5;
                f -= 6.0f;
            }
            return 1.0f;
        }
        f = (float)((double)f + (double)alf_0.a(yl_2.p.c, itemStack) * 0.0075);
        f = (float)((double)f + (double)alf_0.a(yl_2.k.c, itemStack) / 100.0);
        return f;
    }

    private int b(ItemStack[] itemStackArray, a2Z a2Z2) {
        ChestStealer.j();
        int n = 0;
        if (n < itemStackArray.length) {
            if (itemStackArray[n] != null && StringInvoker.a(px_0.c(act_2.k(itemStackArray[n])), (CharSequence)this.b(a2Z2))) {
                return n;
            }
            ++n;
        }
        return -1;
    }

    public ItemStack a(ItemStack[] itemStackArray, a2Z a2Z2) {
        ChestStealer.d();
        if (this.c(itemStackArray, a2Z2)) {
            return (ItemStack)oc_1.b(aMF.b(ListInvoker.stream((List)aMF.a(aMF.a(aMF.a(aMF.a(aMF.b(a7r_0.e(itemStackArray), arg_0 -> this.lambda$bestArmor$17(a2Z2, arg_0)), ChestStealer::lambda$bestArmor$18), this::lambda$bestArmor$19), ChestStealer::lambda$bestArmor$20), aB0.a()))));
        }
        return null;
    }

    private boolean lambda$bestArmor$4(a2Z a2Z2, ItemStack itemStack) {
        ChestStealer.j();
        return itemStack != null && StringInvoker.a(px_0.c(act_2.k(itemStack)), (CharSequence)this.b(a2Z2));
    }

    private static boolean lambda$bestTool$21(ItemStack itemStack) {
        ChestStealer.j();
        return itemStack != null && act_2.k(itemStack) instanceof LY;
    }

    private boolean lambda$bestArmor$14(a2Z a2Z2, ItemStack itemStack) {
        ChestStealer.j();
        return itemStack != null && StringInvoker.a(px_0.c(act_2.k(itemStack)), (CharSequence)this.b(a2Z2));
    }

    private int lambda$bestBow$34(ItemStack itemStack, ItemStack itemStack2) {
        return axx_1.a(this.f(itemStack2), this.f(itemStack));
    }

    private static int lambda$bestArmor$12(ItemStack itemStack, ItemStack itemStack2) {
        return P8.a(act_2.u(itemStack2) - act_2.s(itemStack2), act_2.u(itemStack) - act_2.s(itemStack));
    }

    static {
        bb = a1c.a(1031293785120815944L, -2977798974102778265L, MethodHandles.lookup().lookupClass()).a(242160651877161L);
        ib = new HashMap(13);
        long l4 = bb ^ 0x36BC5B7F5449L;
        ChestStealer.a(35);
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

    private static boolean lambda$bestTool$27(ItemStack itemStack) {
        ChestStealer.j();
        return itemStack != null && act_2.k(itemStack) instanceof ls_0;
    }

    public boolean g() {
        ChestStealer.j();
        return this.mc.currentScreen instanceof R_ && this.ac && this.x() && auk_2.a((Boolean)Ba.b(this.ab));
    }

    private int c(ItemStack[] itemStackArray) {
        ChestStealer.j();
        int n = 0;
        if (n < itemStackArray.length) {
            if (itemStackArray[n] != null && act_2.k(itemStackArray[n]) instanceof ItemBow) {
                return n;
            }
            ++n;
        }
        return -1;
    }

    private int lambda$bestArmor$5(ItemStack itemStack, ItemStack itemStack2) {
        return axx_1.a(this.d(itemStack2), this.d(itemStack));
    }

    private float[] a(TileEntity tileEntity) {
        BlockPos blockPos = NBTInvoker.g(tileEntity);
        double d = (double)amv_2.j(blockPos) + 0.5;
        double d2 = (double)amv_2.h(blockPos) + 0.5;
        double d3 = (double)amv_2.i(blockPos) + 0.5;
        return ae4_0.c(d, d3, d2);
    }

    @EventTarget
    public void a(TickUpdateEvent tickUpdateEvent) {
        ChestStealer.d();
        this.a(auk_2.a((Boolean)Ba.b(this.ae)) ? aB_.a : this.Z.toString());
    }

    private int lambda$bestArmor$13(ItemStack itemStack, ItemStack itemStack2) {
        return axx_1.a(this.d(itemStack2), this.d(itemStack));
    }

    public boolean e(ItemStack[] itemStackArray) {
        ChestStealer.j();
        int n = this.c(itemStackArray);
        return n >= 0;
    }

    @EventTarget
    public void b(MotionUpdateEvent motionUpdateEvent) {
        String string;
        TileEntity tileEntity;
        Iterator iterator;
        ChestStealer.d();
        if (auk_2.a((Boolean)Ba.b(this.X)) && dz_0.c(iterator = ListInvoker.iterator(BlockInvoker.m(this.mc.world))) && (tileEntity = (TileEntity)dz_0.b(iterator)) instanceof a6O && !ListInvoker.contains(this.L, string = StringInvoker.a(tileEntity.toString(), (CharSequence)aB_.S, (CharSequence)aB_.D)) && (double)PlayerInvoker.a(this.mc.player, tileEntity) <= db_0.b((Double)MD.b(this.aa)) && this.mc.currentScreen == null && qh_1.c(this.V, 500L)) {
            if (EventInvoker.getState(motionUpdateEvent).equals((Object)cc.novoline.events.type.State.PRE)) {
                float[] fArray = this.a(tileEntity);
                EventInvoker.a(motionUpdateEvent, fArray[0]);
                EventInvoker.b(motionUpdateEvent, fArray[1]);
            }
            PlayerControllerInvoker.a(this.mc.playerController, this.mc.player, this.mc.world, PlayerInvoker.h(this.mc.player), NBTInvoker.g(tileEntity), BlocksInvoker.a(NBTInvoker.g(tileEntity)), MathHelper.a(NBTInvoker.g(tileEntity), BlocksInvoker.a(NBTInvoker.g(tileEntity))));
            ListInvoker.add(this.L, string);
            qh_1.b(this.V);
        }
    }

    private boolean b(ItemStack itemStack, S30PacketWindowItems s30PacketWindowItems) {
        ChestStealer.j();
        if (act_2.k(itemStack) instanceof ItemBow) {
            return itemStack.equals(this.b(agi_1.a(s30PacketWindowItems))) && (this.b(this.h()) == null || this.f(this.b(agi_1.a(s30PacketWindowItems))) > this.f(this.b(this.h())));
        }
        return true;
    }

    private static int lambda$bestTool$25(ItemStack itemStack, ItemStack itemStack2) {
        return P8.a(act_2.u(itemStack2) - act_2.s(itemStack2), act_2.u(itemStack) - act_2.s(itemStack));
    }

    private static int lambda$bestArmor$20(ItemStack itemStack, ItemStack itemStack2) {
        return P8.a(act_2.s(itemStack2), act_2.s(itemStack));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ChestStealer.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

