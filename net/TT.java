/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.Agent
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.ProfileLookupCallback
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import deobf.MinecraftServer;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;
import net.ML;
import net.a4Z;
import net.a6w_0;
import net.aOE;
import net.aUu;
import net.anz_0;
import net.aod_2;
import net.ik_1;
import net.ms_0;
import net.my_0;
import net.vm_1;
import org.apache.logging.log4j.Logger;

public class TT {
    private static Logger e = LogManagerInvoker.c();
    public static File b = new File(aOE.c);
    public static File d = new File(aOE.d);
    public static File a;
    public static File c;

    public static String a(String string) {
        if (!aod_2.a(string) && StringInvoker.c(string) <= 16) {
            MinecraftServer minecraftServer = ServerInvoker.d();
            GameProfile gameProfile = aUu.a(ServerInvoker.L(minecraftServer), string);
            if (a4Z.a(gameProfile) != null) {
                return a4Z.a(gameProfile).toString();
            }
            if (!ServerInvoker.T(minecraftServer) && ServerInvoker.e(minecraftServer)) {
                ArrayList arrayList = my_0.c();
                ML mL = new ML(minecraftServer, arrayList);
                TT.a(minecraftServer, my_0.a(new String[]{string}), mL);
                return !ListInvoker.isEmpty(arrayList) && a4Z.a((GameProfile)ListInvoker.get(arrayList, 0)) != null ? a4Z.a((GameProfile)ListInvoker.get(arrayList, 0)).toString() : aOE.e;
            }
            return a6w_0.a(new GameProfile(null, string)).toString();
        }
        return string;
    }

    private static boolean lambda$lookupNames$0(String string) {
        return !aod_2.a(string);
    }

    static {
        c = new File(aOE.b);
        a = new File(aOE.a);
    }

    private static void a(MinecraftServer minecraftServer, Collection<String> collection, ProfileLookupCallback profileLookupCallback) {
        String[] stringArray = (String[])anz_0.b((Iterator)anz_0.a(ms_0.a(collection), TT::lambda$lookupNames$0), String.class);
        if (ServerInvoker.e(minecraftServer)) {
            vm_1.a(ServerInvoker.E(minecraftServer), stringArray, Agent.MINECRAFT, profileLookupCallback);
        } else {
            for (String string : stringArray) {
                UUID uUID = a6w_0.a(new GameProfile(null, string));
                GameProfile gameProfile = new GameProfile(uUID, string);
                ik_1.a(profileLookupCallback, gameProfile);
            }
        }
    }

    static Logger a() {
        return e;
    }
}

