/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.init;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.StatListInvoker;
import cc.novoline.invoke.SystemInvoker;
import deobf.EntitySnowball;
import net.minecraft.block.BlockDispenser;
import net.minecraft.dispenser.BehaviorProjectileDispense;

import java.io.PrintStream;
import net.EntityEgg;
import net.Items;
import net.aa3_0;
import net.ab3_0;
import net.ab7_0;
import net.abb_1;
import net.abg_2;
import net.abi_0;
import net.abl_2;
import net.abq_1;
import net.abr_2;
import net.abu_2;
import net.abv_1;
import net.abv_2;
import net.abw_1;
import net.abx_1;
import net.ea_1;
import net.k4_0;
import net.px_0;
import net.si_0;
import net.vx_1;
import org.apache.logging.log4j.Logger;

public class Bootstrap {
    private static boolean alreadyRegistered;
    private static PrintStream SYSOUT;
    private static Logger LOGGER;

    public static boolean isRegistered() {
        return alreadyRegistered;
    }

    static void registerDispenserBehaviors() {
        vx_1.a(BlockDispenser.dispenseBehaviorRegistry, Items.arrow, new abl_2());
        vx_1.a(BlockDispenser.dispenseBehaviorRegistry, Items.egg, new EntityEgg());
        vx_1.a(BlockDispenser.dispenseBehaviorRegistry, Items.snowball, new EntitySnowball());
        vx_1.a(BlockDispenser.dispenseBehaviorRegistry, Items.experience_bottle, new BehaviorProjectileDispense());
        vx_1.a(BlockDispenser.dispenseBehaviorRegistry, Items.potionitem, new aa3_0());
        vx_1.a(BlockDispenser.dispenseBehaviorRegistry, Items.spawn_egg, new ab7_0());
        vx_1.a(BlockDispenser.dispenseBehaviorRegistry, Items.fireworks, new abq_1());
        vx_1.a(BlockDispenser.dispenseBehaviorRegistry, Items.fire_charge, new abi_0());
        vx_1.a(BlockDispenser.dispenseBehaviorRegistry, Items.boat, new abg_2());
        abw_1 abw_12 = new abw_1();
        vx_1.a(BlockDispenser.dispenseBehaviorRegistry, Items.lava_bucket, abw_12);
        vx_1.a(BlockDispenser.dispenseBehaviorRegistry, Items.water_bucket, abw_12);
        vx_1.a(BlockDispenser.dispenseBehaviorRegistry, Items.bucket, new abv_2());
        vx_1.a(BlockDispenser.dispenseBehaviorRegistry, Items.flint_and_steel, new abv_1());
        vx_1.a(BlockDispenser.dispenseBehaviorRegistry, Items.dye, new abr_2());
        vx_1.a(BlockDispenser.dispenseBehaviorRegistry, px_0.a(Blocks.Y), new abu_2());
        vx_1.a(BlockDispenser.dispenseBehaviorRegistry, Items.skull, new ab3_0());
        vx_1.a(BlockDispenser.dispenseBehaviorRegistry, px_0.a(Blocks.ap), new abx_1());
    }

    private static void redirectOutputToLog() {
        SystemInvoker.a(new k4_0(si_0.a, System.err));
        SystemInvoker.b(new k4_0(si_0.b, SYSOUT));
    }

    public static void register() {
        if (!alreadyRegistered) {
            alreadyRegistered = true;
            if (LoggerInvoker.a(LOGGER)) {
                Bootstrap.redirectOutputToLog();
            }
            BlocksInvoker.c();
            abb_1.a();
            px_0.c();
            StatListInvoker.a();
            Bootstrap.registerDispenserBehaviors();
        }
    }

    static {
        LOGGER = LogManagerInvoker.c();
        SYSOUT = System.out;
        alreadyRegistered = false;
    }

    public static void a(String string) {
        ea_1.a(SYSOUT, string);
    }
}

