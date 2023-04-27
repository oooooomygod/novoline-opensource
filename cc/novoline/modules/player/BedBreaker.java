/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.jetbrains.annotations.NotNull
 *  org.lwjgl.opengl.GL11
 */
package cc.novoline.modules.player;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.events.Render3DEvent;
import cc.novoline.events.events.TickUpdateEvent;
import cc.novoline.events.type.State;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.EventInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.ObjectMouseOverInvoker;
import cc.novoline.invoke.PlayerControllerInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import net.minecraft.init.Blocks;
import cc.novoline.modules.EnumModuleType;
import deobf.IntProperty;
import deobf.MCInvoker;
import deobf.ModuleRegistry;
import net.minecraft.util.MovingObjectPosition;
import cc.novoline.modules.configurations.annotation.Property;
import deobf.SettingType;
import deobf.Vec3;
import net.minecraft.network.packts.C07PacketPlayerDigging;
import net.minecraft.network.packts.C07PacketPlayerDigging$Action;
import net.minecraft.network.packts.C0APacketAnimation;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.Minecraft;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

public class BedBreaker
extends AbstractModule {
    private static String[] Q;
    private static String[] P;
    private BlockPos M;
    @Property(value="radious")
    private IntProperty L;
    private boolean K;
    @Property(value="mode")
    private StringProperty N;
    @Property(value="draw-radius")
    private BooleanProperty I;
    private double H;
    private static long O;
    private static Map R;
    BlockPos J;

    private static String b(int n, long l4) {
        int n2 = n ^ (int)(l4 & 0x7FFFL) ^ 0x50E5;
        if (Q[n2] == null) {
            try {
                Long l5 = Thread.currentThread().getId();
                Object[] objectArray = (Object[])R.get(l5);
                objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                R.put(l5, objectArray);
            }
            catch (Exception exception) {
                throw new RuntimeException("net/a_i", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l4 >>> 56);
            int n3 = 1;
            while (true) {
                byArray[n3] = (byte)(l4 << n3 * 8 >>> 56);
                ++n3;
            }
        }
        return Q[n2];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
            return mutableCallSite;
        }
        catch (Exception exception) {
            throw new RuntimeException("net/a_i" + " : " + string + " : " + methodType.toString(), exception);
        }
    }

    private boolean a(@NotNull BlockPos blockPos) {
        ChestStealer.d();
        return amv_2.j(blockPos) == amv_2.j(this.J) && amv_2.h(blockPos) == amv_2.h(this.J) && amv_2.i(blockPos) == amv_2.i(this.J);
    }

    @EventTarget
    public void a(TickUpdateEvent tickUpdateEvent) {
        ChestStealer.d();
        if (this.M != null) {
            if (this.H == 0.0) {
                this.a(new C07PacketPlayerDigging(C07PacketPlayerDigging$Action.START_DESTROY_BLOCK, this.M, EnumFacing.UP));
            }
            Block block = BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, this.M));
            this.H += (double)BlocksInvoker.a(block, this.mc.player, this.mc.player.worldObj, this.M);
            if (this.H >= 1.0) {
                this.K = false;
                this.a(new C07PacketPlayerDigging(C07PacketPlayerDigging$Action.STOP_DESTROY_BLOCK, this.M, EnumFacing.UP));
                PlayerControllerInvoker.a(this.mc.playerController, this.M, EnumFacing.UP);
                this.H = 0.0;
                this.M = null;
            }
            this.a(new C0APacketAnimation());
            BlockInvoker.b(this.mc.world, PlayerInvoker.O(this.mc.player), this.M, (int)(this.H * 10.0) - 1);
        }
    }

    public BlockPos b() {
        return this.J;
    }

    private boolean a() {
        ChestStealer.j();
        int n = -P8.b((Integer)adt_2.a(this.L));
        if (n < P8.b((Integer)adt_2.a(this.L)) + 1) {
            int n2 = -P8.b((Integer)adt_2.a(this.L));
            if (n2 < P8.b((Integer)adt_2.a(this.L)) + 1) {
                int n3 = -3;
                BlockPos blockPos = new BlockPos(this.mc.player.posX - (double)n, this.mc.player.posY + (double)n3, this.mc.player.posZ - (double)n2);
                BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, blockPos));
                if (!this.a(blockPos) && BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, blockPos)) == Blocks.aw && BlockStateInvoker.b(BlockInvoker.getMaterial(this.mc.world, blockPos), gp_2.R) == a5E.HEAD) {
                    return true;
                }
                ++n3;
                ++n2;
            }
            ++n;
        }
        return false;
    }

    public void b(BlockPos blockPos) {
        this.J = blockPos;
    }

    @EventTarget
    public void a(MotionUpdateEvent motionUpdateEvent) {
        ChestStealer.d();
        if (EventInvoker.getState(motionUpdateEvent).equals((Object)State.PRE)) {
            int n;
            KillAura killAura = (KillAura)ModuleInvoker.isEnable(ModuleRegistry.KILLAURA);
            if (!(this.M == null || killAura.x() && atH.a(killAura) != null)) {
                if (!this.a()) {
                    this.M = null;
                    this.H = 0.0;
                }
                float[] fArray = ae4_0.a((double)amv_2.j(this.M) + 0.5, (double)amv_2.h(this.M) + 0.5, (double)amv_2.i(this.M) + 0.5);
                EventInvoker.a(motionUpdateEvent, fArray[0]);
                EventInvoker.b(motionUpdateEvent, fArray[1]);
                PlayerInvoker.a(this.mc.player, this.M);
                this.mc.player.aP = fArray[0];
                this.mc.player.renderArmPitch = fArray[1];
            }
            if ((n = -P8.b((Integer)adt_2.a(this.L))) < P8.b((Integer)adt_2.a(this.L)) + 1) {
                int n2 = -P8.b((Integer)adt_2.a(this.L));
                if (n2 < P8.b((Integer)adt_2.a(this.L)) + 1) {
                    int n3 = -3;
                    BlockPos blockPos = new BlockPos(this.mc.player.posX - (double)n, this.mc.player.posY + (double)n3, this.mc.player.posZ - (double)n2);
                    BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, blockPos));
                    if (!this.a(blockPos) && BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, blockPos)) == Blocks.aw && BlockStateInvoker.b(BlockInvoker.getMaterial(this.mc.world, blockPos), gp_2.R) == a5E.HEAD) {
                        if (((String)StringPropertyInvoker.b(this.N)).equals(a1g.a)) {
                            float[] fArray = ae4_0.a((double)amv_2.j(blockPos) + 0.5, (double)amv_2.h(blockPos) + 0.5, (double)amv_2.i(blockPos) + 0.5);
                            Vec3 vec3 = new Vec3(this.mc.player.posX, this.mc.player.posY + (double)PlayerInvoker.X(this.mc.player), this.mc.player.posZ);
                            Vec3 vec32 = this.a(fArray[1], fArray[0]);
                            Vec3 vec33 = aNE.a(vec3, vec32.xCoord * (double)P8.b((Integer)adt_2.a(this.L)), vec32.yCoord * (double)P8.b((Integer)adt_2.a(this.L)), vec32.zCoord * (double)P8.b((Integer)adt_2.a(this.L)));
                            MovingObjectPosition movingObjectPosition = BlockInvoker.a(this.mc.world, vec3, vec33, false, false, false);
                            this.M = ObjectMouseOverInvoker.getBlockPos(movingObjectPosition);
                            this.H = 0.0;
                            if (BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.mc.world, this.M)) == Blocks.aw) {
                                // empty if block
                            }
                        }
                        this.M = blockPos;
                        this.H = 0.0;
                    }
                    ++n3;
                    ++n2;
                }
                ++n;
            }
        }
    }

    protected Vec3 a(float f, float f2) {
        float f3 = MathHelper.b(MathInvoker.o(-f2) - 3.1415927410125732);
        float f4 = MathHelper.h(MathInvoker.o(-f2) - 3.1415927410125732);
        float f5 = -MathHelper.b(MathInvoker.o(-f));
        float f6 = MathHelper.h(MathInvoker.o(-f));
        return new Vec3(f4 * f5, f6, f3 * f5);
    }

    public Vec3 a(float f) {
        return new Vec3(this.mc.player.posX, this.mc.player.posY + (double)PlayerInvoker.X(this.mc.player), this.mc.player.posZ);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l4 = (Long)objectArray[1];
        String string2 = BedBreaker.b(n, l4);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    public BedBreaker(@NonNull short s, ModuleManager moduleManager, EnumModuleType enumModuleType, String string, int n, char c, String string2) {
        long l4 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)c << 48 >>> 48) ^ O;
        long l5 = l4 ^ 0x17FAC413E069L;
        int n2 = (int)(l5 >>> 48);
        int n3 = (int)(l5 << 16 >>> 48);
        int n4 = (int)(l5 << 32 >>> 32);
        super(moduleManager, (char)n2, enumModuleType, string, (char)n3, n4, string2);
        this.J = new BlockPos(0, 0, 0);
        this.N = StringPropertyInvoker.b(asp_2.a((String)((Object)BedBreaker.b("e", (int)7468, (long)(0x57C41C2FE4007DF2L ^ l4)))), new String[]{BedBreaker.b("e", (int)20794, (long)(0x32CF6F3BE9A331E7L ^ l4)), BedBreaker.b("e", (int)19722, (long)(0x74F2164CB82F2DDFL ^ l4))});
        this.L = (IntProperty)adt_2.a((IntProperty)adt_2.c(asp_2.a(P8.d(4)), P8.d(3)), P8.d(5));
        this.I = asp_2.a(auk_2.b(false));
        ManagerInvoker.put(new Setting((String)((Object)BedBreaker.b("e", (int)5801, (long)(0x57DD0D489C24F675L ^ l4))), (String)((Object)BedBreaker.b("e", (int)17149, (long)(0x6F21A2C2D3EE2226L ^ l4))), SettingType.COMBOBOX, (AbstractModule)this, this.N));
        ManagerInvoker.put(new Setting((String)((Object)BedBreaker.b("e", (int)18265, (long)(0x1011E7A0D9B7A780L ^ l4))), (String)((Object)BedBreaker.b("e", (int)6441, (long)(0x14C39FF7691DF9F3L ^ l4))), SettingType.SLIDER, (AbstractModule)this, this.L, 1.0));
        ManagerInvoker.put(new Setting((String)((Object)BedBreaker.b("e", (int)8678, (long)(0x2D5D72C940EFC13EL ^ l4))), (String)((Object)BedBreaker.b("e", (int)6081, (long)(0x8DF54D0695FF71EL ^ l4))), SettingType.CHECKBOX, (AbstractModule)this, this.I));
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

    static {
        O = a1c.a(1087209837050424909L, 7458534437177100705L, MethodHandles.lookup().lookupClass()).a(215059669559660L);
        R = new HashMap(13);
        long l4 = O ^ 0x145052D20ED5L;
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

    @EventTarget
    public void a(Render3DEvent render3DEvent) {
        ChestStealer.d();
        if (auk_2.a((Boolean)Ba.b(this.I))) {
            a1V.e();
            GL11.glLineWidth((float)6.0f);
            GL11.glBegin((int)3);
            double d = 0.0;
            double d2 = d - Math.PI * 2;
            int cfr_ignored_1 = d2 == 0.0 ? 0 : (d2 < 0.0 ? -1 : 1);
            float f = (float)(aol_1.b(new Color(255, 255, 255, 150)) >> 24 & 0xFF) / 255.0f;
            float f2 = (float)(aol_1.b(new Color(255, 255, 255, 150)) >> 16 & 0xFF) / 255.0f;
            float f3 = (float)(aol_1.b(new Color(255, 255, 255, 150)) >> 8 & 0xFF) / 255.0f;
            float f4 = (float)(aol_1.b(new Color(255, 255, 255, 150)) & 0xFF) / 255.0f;
            GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
            double d3 = this.mc.player.lastTickPosX + (this.mc.player.posX - this.mc.player.lastTickPosX) * (double)a1j.a(render3DEvent) + MathInvoker.i(d) * (double)P8.b((Integer)adt_2.a(this.L)) - MCInvoker.j((Minecraft)this.mc).s;
            double d4 = this.mc.player.lastTickPosY + (this.mc.player.posY - this.mc.player.lastTickPosY) * (double)a1j.a(render3DEvent) - MCInvoker.j((Minecraft)this.mc).h;
            double d5 = this.mc.player.lastTickPosZ + (this.mc.player.posZ - this.mc.player.lastTickPosZ) * (double)a1j.a(render3DEvent) + MathInvoker.m(d) * (double)P8.b((Integer)adt_2.a(this.L)) - MCInvoker.j((Minecraft)this.mc).m;
            GL11.glVertex3d((double)d3, (double)d4, (double)d5);
            d += 0.241660973353061;
            GL11.glEnd();
            a1V.b();
        }
        if (this.M != null) {
            a1V.b(new BlockPos(this.M), aol_1.b(new Color(255, 255, 255, 50)));
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(BedBreaker.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

