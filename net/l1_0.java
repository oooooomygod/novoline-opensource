/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonParser
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StatListInvoker;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import deobf.EntityPlayerMP;
import net.minecraft.stats.Achievement;
import deobf.EntityPlayer;
import deobf.MinecraftServer;
import deobf.StatBase;
import net.minecraft.network.packts.S37PacketStatistics;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.Logger;

/*
 * Renamed from net.l1
 */
public class l1_0
extends StatFileWriter {
    private static Logger e = LogManagerInvoker.c();
    private File b;
    private MinecraftServer g;
    private boolean f = false;
    private int c = -300;
    private Set<StatBase> d = axe_2.a();

    public void c() {
        if (zq_2.d(this.b)) {
            try {
                MapInvoker.d(this.a);
                MapInvoker.a(this.a, this.a(iw_2.b(this.b)));
            }
            catch (IOException iOException) {
                LoggerInvoker.a(e, aL0.a(aL0.a(new StringBuilder(), aK0.n), this.b).toString(), iOException);
            }
            catch (JsonParseException jsonParseException) {
                LoggerInvoker.a(e, aL0.a(aL0.a(new StringBuilder(), aK0.k), this.b).toString(), jsonParseException);
            }
        }
    }

    public void b(EntityPlayerMP entityPlayerMP) {
        int n = ServerInvoker.H(this.g);
        HashMap hashMap = MapsInvoker.a();
        if (this.f || n - this.c > 300) {
            this.c = n;
            Iterator iterator = aS0.f(this.a());
            while (dz_0.c(iterator)) {
                StatBase statBase = (StatBase)dz_0.b(iterator);
                MapInvoker.c(hashMap, statBase, P8.d(this.a(statBase)));
            }
        }
        qv_0.a(entityPlayerMP.playerNetServerHandler, new S37PacketStatistics(hashMap));
    }

    public void a(EntityPlayerMP entityPlayerMP) {
        HashMap hashMap = MapsInvoker.a();
        Iterator iterator = ListInvoker.iterator(apf_0.G);
        while (dz_0.c(iterator)) {
            Achievement achievement = (Achievement)dz_0.b(iterator);
            if (!this.b(achievement)) continue;
            MapInvoker.c(hashMap, achievement, P8.d(this.a((StatBase)achievement)));
            aS0.a(this.d, achievement);
        }
        qv_0.a(entityPlayerMP.playerNetServerHandler, new S37PacketStatistics(hashMap));
    }

    public boolean e() {
        return this.f;
    }

    public l1_0(MinecraftServer minecraftServer, File file) {
        this.g = minecraftServer;
        this.b = file;
    }

    public static String a(Map<StatBase, at3> map) {
        JsonObject jsonObject = new JsonObject();
        Iterator iterator = aS0.f(MapInvoker.b(map));
        while (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            if (amb_1.b((at3)FG.a(entry)) != null) {
                JsonObject jsonObject2 = new JsonObject();
                M0.a(jsonObject2, aK0.j, P8.d(amb_1.a((at3)FG.a(entry))));
                try {
                    M0.a(jsonObject2, aK0.e, aLO.a(amb_1.b((at3)FG.a(entry))));
                }
                catch (Throwable throwable) {
                    LoggerInvoker.b(e, aL0.a(aL0.a(aL0.a(new StringBuilder(), aK0.g), NW.b((StatBase)FG.b(entry))), aK0.h).toString(), throwable);
                }
                M0.a(jsonObject, ((StatBase)FG.b((Map.Entry)entry)).l, (JsonElement)jsonObject2);
                continue;
            }
            M0.a(jsonObject, ((StatBase)FG.b((Map.Entry)entry)).l, P8.d(amb_1.a((at3)FG.a(entry))));
        }
        return jsonObject.toString();
    }

    @Override
    public void a(EntityPlayer entityPlayer, StatBase statBase, int n) {
        int n2 = NW.d(statBase) ? this.a(statBase) : 0;
        super.a(entityPlayer, statBase, n);
        aS0.b(this.d, statBase);
        if (NW.d(statBase)) {
            this.f = true;
            if (ServerInvoker.j(this.g)) {
                aek_1.a(ServerInvoker.R(this.g), new aoz_1(aK0.f, a6w_0.w(entityPlayer), NW.a(statBase)));
            }
        }
        if (NW.d(statBase)) {
            this.f = true;
            if (ServerInvoker.j(this.g)) {
                aek_1.a(ServerInvoker.R(this.g), new aoz_1(aK0.o, a6w_0.w(entityPlayer), NW.a(statBase)));
            }
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public Map<StatBase, at3> a(String string) {
        JsonElement jsonElement = a1r.a(new JsonParser(), string);
        if (!WN.h(jsonElement)) {
            return MapsInvoker.a();
        }
        JsonObject jsonObject = WN.c(jsonElement);
        HashMap hashMap = MapsInvoker.a();
        Iterator iterator = aS0.f(M0.a(jsonObject));
        while (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            StatBase statBase = StatListInvoker.a((String)FG.b(entry));
            at3 at32 = new at3();
            if (WN.k((JsonElement)FG.a(entry)) && aet_0.d(WN.d((JsonElement)FG.a(entry)))) {
                amb_1.a(at32, WN.e((JsonElement)FG.a(entry)));
            } else if (WN.h((JsonElement)FG.a(entry))) {
                JsonObject jsonObject2 = WN.c((JsonElement)FG.a(entry));
                if (M0.c(jsonObject2, aK0.q) && WN.k(M0.d(jsonObject2, aK0.r)) && aet_0.d(WN.d(M0.d(jsonObject2, aK0.l)))) {
                    amb_1.a(at32, aet_0.a(M0.e(jsonObject2, aK0.d)));
                }
                if (M0.c(jsonObject2, aK0.s) && NW.c(statBase) != null) {
                    try {
                        Constructor constructor = ara_2.b(NW.c(statBase), new Class[0]);
                        ac__0 ac__02 = (ac__0)ap6_0.a(constructor, new Object[0]);
                        aLO.a(ac__02, M0.d(jsonObject2, aK0.b));
                        amb_1.a(at32, ac__02);
                    }
                    catch (Throwable throwable) {
                        LoggerInvoker.b(e, aL0.a(aL0.a(new StringBuilder(), aK0.i), this.b).toString(), throwable);
                    }
                }
            }
            MapInvoker.c(hashMap, statBase, at32);
        }
        return hashMap;
    }

    public Set<StatBase> a() {
        HashSet hashSet = axe_2.b(this.d);
        aS0.e(this.d);
        this.f = false;
        return hashSet;
    }

    public void b() {
        aS0.a(this.d, MapInvoker.c(this.a));
    }

    public void d() {
        try {
            iw_2.a(this.b, l1_0.a(this.a));
        }
        catch (IOException iOException) {
            LoggerInvoker.a(e, aK0.m, iOException);
        }
    }
}

