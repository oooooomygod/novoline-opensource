/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package cc.novoline.script;

import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.EventManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.ScriptInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import deobf.MCInvoker;
import deobf.ModuleHolder;
import net.minecraft.network.packts.C02PacketUseEntity$Action;
import net.minecraft.network.packts.C07PacketPlayerDigging$Action;
import net.minecraft.network.packts.C0BPacketEntityAction$Action;
import java.util.ArrayList;
import java.util.Iterator;
import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import net.ChatComponentText;
import deobf.EnumFacing;
import net.GW;
import net.ModuleManager;
import net.NotificationType;
import net.aL0;
import net.aSC;
import net.aen_2;
import net.agz_1;
import net.akr_1;
import net.anw_0;
import net.as6_0;
import net.atu;
import net.cx_0;
import net.dz_0;
import net.kp_1;
import net.pg_0;
import net.wc_1;
import org.lwjgl.opengl.GL11;
import net.skidunion.annotations;

public class Script {
    public pg_0 h;
    public boolean d;
    private static int[] c;
    public Invocable g;
    public String b;
    public ScriptEngine f;
    public AbstractModule module;
    public String e;

    static {
        if (Script.g() != null) {
            Script.b(new int[2]);
        }
    }

    public static int[] g() {
        return c;
    }

    @annotations
    public ScriptModule registerModule(String string, EnumModuleType enumModuleType) {
        this.c();
        Script.g();
        EventManagerInvoker.a(this);
        ScriptModule scriptModule = new ScriptModule(NovolineInvoker.l(NovolineInvoker.getInstance()), string, enumModuleType, this.f);
        atu<AbstractModule> atu2 = arg_0 -> Script.lambda$registerModule$0(scriptModule, arg_0);
        aen_2.a(NovolineInvoker.l(NovolineInvoker.getInstance()), aL0.a(aL0.a(new StringBuilder(), this.e), aSC.k).toString(), atu2, false);
        this.module = scriptModule;
        ListInvoker.add(cx_0.a(NovolineInvoker.r(NovolineInvoker.getInstance())), scriptModule);
        if (ListInvoker.b() != null) {
            Script.b(new int[3]);
        }
        return scriptModule;
    }

    public String e() {
        return this.e;
    }

    public void f() {
        try {
            ScriptInvoker.a(this.f, this.d());
        }
        catch (ScriptException scriptException) {
            kp_1.a(GW.f(MCInvoker.f().ingameGUI), new ChatComponentText(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.RED), StringInvoker.g(as6_0.a(scriptException), aSC.z)[0]).toString()));
        }
    }

    public void a(String string) {
        this.b = string;
    }

    public AbstractModule getModule() {
        return this.module;
    }

    public void c() {
        ModuleHolder moduleHolder;
        Iterator iterator;
        Script.g();
        EventManagerInvoker.b(this);
        if (this.module != null && wc_1.g(this.module)) {
            wc_1.k(this.module);
        }
        if (dz_0.c(iterator = akr_1.a(new ArrayList(aen_2.c(NovolineInvoker.l(NovolineInvoker.getInstance())).values()))) && (moduleHolder = (ModuleHolder)dz_0.b(iterator)).b().equals(aL0.a(aL0.a(new StringBuilder(), this.e), aSC.a).toString())) {
            wc_1.b(moduleHolder.c(), false);
            Iterator iterator2 = ListInvoker.iterator(ManagerInvoker.a(this.module));
            if (dz_0.c(iterator2)) {
                Setting setting = (Setting)dz_0.b(iterator2);
                ListInvoker.remove(ManagerInvoker.a(), setting);
            }
            aen_2.c(NovolineInvoker.l(NovolineInvoker.getInstance())).remove(aL0.a(aL0.a(new StringBuilder(), this.e), aSC.N).toString());
            ListInvoker.remove(cx_0.a(NovolineInvoker.r(NovolineInvoker.getInstance())), this.module);
        }
    }

    public Script(String string, String string2) {
        ScriptEngine scriptEngine;
        this.b = string2;
        this.e = string;
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        this.f = scriptEngine = agz_1.a(scriptEngineManager, aSC.U);
        this.g = (Invocable)((Object)scriptEngine);
        ScriptInvoker.addWrapper(scriptEngine, aSC.y, this);
        ScriptInvoker.addWrapper(scriptEngine, aSC.u, (Object)EnumModuleType.COMBAT);
        ScriptInvoker.addWrapper(scriptEngine, aSC.L, (Object)EnumModuleType.MOVEMENT);
        ScriptInvoker.addWrapper(scriptEngine, aSC.S, (Object)EnumModuleType.PLAYER);
        ScriptInvoker.addWrapper(scriptEngine, aSC.W, (Object)EnumModuleType.MISC);
        ScriptInvoker.addWrapper(scriptEngine, aSC.t, (Object)EnumModuleType.VISUALS);
        ScriptInvoker.addWrapper(scriptEngine, aSC.h, (Object)EnumModuleType.EXPLOITS);
        ScriptInvoker.addWrapper(scriptEngine, aSC.G, new ScriptConnection(scriptEngine));
        ScriptInvoker.addWrapper(scriptEngine, aSC.s, new ScriptPlayer());
        ScriptInvoker.addWrapper(scriptEngine, aSC.I, new ScriptWorld());
        ScriptInvoker.addWrapper(scriptEngine, aSC.V, new ScriptAngleUtil());
        ScriptInvoker.addWrapper(scriptEngine, aSC.f, new ScriptEntity());
        ScriptInvoker.addWrapper(scriptEngine, aSC.X, new ScriptTimerUtil());
        ScriptInvoker.addWrapper(scriptEngine, aSC.M, new ScriptFileUtil());
        ScriptInvoker.addWrapper(scriptEngine, aSC.p, new ScriptWebUtil());
        ScriptInvoker.addWrapper(scriptEngine, aSC.r, new ScriptGameUtil());
        ScriptInvoker.addWrapper(scriptEngine, aSC.B, new ScriptClientUtil());
        ScriptInvoker.addWrapper(scriptEngine, aSC.w, new ScriptRenderUtil());
        ScriptInvoker.addWrapper(scriptEngine, aSC.Q, (Object)C02PacketUseEntity$Action.ATTACK);
        ScriptInvoker.addWrapper(scriptEngine, aSC.v, (Object)C02PacketUseEntity$Action.INTERACT);
        ScriptInvoker.addWrapper(scriptEngine, aSC.q, (Object)C02PacketUseEntity$Action.INTERACT_AT);
        ScriptInvoker.addWrapper(scriptEngine, aSC.b, (Object)C0BPacketEntityAction$Action.START_SNEAKING);
        ScriptInvoker.addWrapper(scriptEngine, aSC.E, (Object)C0BPacketEntityAction$Action.STOP_SNEAKING);
        ScriptInvoker.addWrapper(scriptEngine, aSC.n, (Object)C0BPacketEntityAction$Action.START_SPRINTING);
        ScriptInvoker.addWrapper(scriptEngine, aSC.K, (Object)C0BPacketEntityAction$Action.STOP_SPRINTING);
        ScriptInvoker.addWrapper(scriptEngine, aSC.l, (Object)C0BPacketEntityAction$Action.STOP_SLEEPING);
        ScriptInvoker.addWrapper(scriptEngine, aSC.D, (Object)C0BPacketEntityAction$Action.RIDING_JUMP);
        ScriptInvoker.addWrapper(scriptEngine, aSC.c, (Object)C0BPacketEntityAction$Action.OPEN_INVENTORY);
        ScriptInvoker.addWrapper(scriptEngine, aSC.i, EnumFacing.UP);
        ScriptInvoker.addWrapper(scriptEngine, aSC.g, EnumFacing.DOWN);
        Script.g();
        ScriptInvoker.addWrapper(scriptEngine, aSC.T, EnumFacing.SOUTH);
        ScriptInvoker.addWrapper(scriptEngine, aSC.j, EnumFacing.NORTH);
        ScriptInvoker.addWrapper(scriptEngine, aSC.d, EnumFacing.WEST);
        ScriptInvoker.addWrapper(scriptEngine, aSC.m, EnumFacing.EAST);
        ScriptInvoker.addWrapper(scriptEngine, aSC.O, (Object)C07PacketPlayerDigging$Action.START_DESTROY_BLOCK);
        ScriptInvoker.addWrapper(scriptEngine, aSC.J, (Object)C07PacketPlayerDigging$Action.ABORT_DESTROY_BLOCK);
        ScriptInvoker.addWrapper(scriptEngine, aSC.o, (Object)C07PacketPlayerDigging$Action.STOP_DESTROY_BLOCK);
        ScriptInvoker.addWrapper(scriptEngine, aSC.x, (Object)C07PacketPlayerDigging$Action.DROP_ALL_ITEMS);
        ScriptInvoker.addWrapper(scriptEngine, aSC.P, (Object)C07PacketPlayerDigging$Action.DROP_ITEM);
        ScriptInvoker.addWrapper(scriptEngine, aSC.F, (Object)C07PacketPlayerDigging$Action.RELEASE_USE_ITEM);
        ScriptInvoker.addWrapper(scriptEngine, aSC.C, (Object)NotificationType.INFO);
        ScriptInvoker.addWrapper(scriptEngine, aSC.H, (Object)NotificationType.SUCCESS);
        ScriptInvoker.addWrapper(scriptEngine, aSC.A, (Object)NotificationType.WARNING);
        ScriptInvoker.addWrapper(scriptEngine, aSC.e, (Object)NotificationType.ERROR);
        ScriptInvoker.addWrapper(scriptEngine, aSC.R, GL11.class);
        ListInvoker.b(new ListInvoker[5]);
    }

    private static AbstractModule lambda$registerModule$0(ScriptModule scriptModule, ModuleManager moduleManager) {
        return scriptModule;
    }

    public static void b(int[] nArray) {
        c = nArray;
    }

    public boolean b() {
        return this.d;
    }

    public void a(boolean bl) {
        Script.g();
        this.d = bl;
        this.c();
    }

    public String d() {
        return this.b;
    }
}

