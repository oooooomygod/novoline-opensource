/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonParseException
 *  com.mojang.authlib.Agent
 *  com.mojang.authlib.GameProfile
 */
package deobf;

import cc.novoline.invoke.IOUtilsInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.common.base.Charsets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import deobf.MinecraftServer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import net.DE;
import net.a4W;
import net.a4Z;
import net.a6w_0;
import net.aB9;
import net.aWM;
import net.abf_2;
import net.afv_2;
import net.akr_1;
import net.aky_1;
import net.anz_0;
import net.aq5;
import net.aqk_2;
import net.ayp_0;
import net.ca_0;
import net.dz_0;
import net.ik_1;
import net.my_0;
import net.vk_0;
import net.vm_1;

public class PlayerProfileCache {
    private static ParameterizedType d;
    protected Gson g;
    private LinkedList<GameProfile> b;
    private Map<String, ayp_0> c = MapsInvoker.a();
    private File f;
    public static SimpleDateFormat e;
    private Map<UUID, ayp_0> h = MapsInvoker.a();
    private MinecraftServer a;

    private ayp_0 a(UUID uUID) {
        ayp_0 ayp_02 = (ayp_0)MapInvoker.c(this.h, uUID);
        GameProfile gameProfile = ayp_02.b();
        aky_1.c(this.b, gameProfile);
        aky_1.b(this.b, gameProfile);
        return ayp_02;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private void a(GameProfile gameProfile, Date date) {
        UUID uUID = a4Z.a(gameProfile);
        Object object = afv_2.a();
        afv_2.a((Calendar)object, new Date());
        afv_2.a((Calendar)object, 2, 1);
        date = afv_2.a((Calendar)object);
        object = StringInvoker.a(a4Z.d(gameProfile), Locale.ROOT);
        ayp_0 ayp_02 = new ayp_0(this, gameProfile, date, null);
        if (MapInvoker.b(this.h, uUID)) {
            ayp_0 ayp_03 = (ayp_0)MapInvoker.c(this.h, uUID);
            MapInvoker.a(this.c, StringInvoker.a(a4Z.d(ayp_03.b()), Locale.ROOT));
            aky_1.c(this.b, gameProfile);
        }
        MapInvoker.c(this.c, StringInvoker.a(a4Z.d(gameProfile), Locale.ROOT), ayp_02);
        MapInvoker.c(this.h, uUID, ayp_02);
        aky_1.b(this.b, gameProfile);
        this.c();
    }

    public PlayerProfileCache(MinecraftServer minecraftServer, File file) {
        this.b = my_0.b();
        this.a = minecraftServer;
        this.f = file;
        GsonBuilder gsonBuilder = new GsonBuilder();
        aB9.a(gsonBuilder, ayp_0.class, (Object)new ca_0(this, null));
        this.g = aB9.b(gsonBuilder);
        this.a();
    }

    private List<ayp_0> a(int n) {
        ArrayList arrayList = my_0.c();
        Iterator iterator = akr_1.a(my_0.a(anz_0.a(aky_1.f(this.b), n)));
        while (dz_0.c(iterator)) {
            GameProfile gameProfile = (GameProfile)dz_0.b(iterator);
            ayp_0 ayp_02 = this.a(a4Z.a(gameProfile));
            akr_1.a(arrayList, ayp_02);
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c() {
        String string = a4W.a(this.g, this.a(1000));
        BufferedWriter bufferedWriter = null;
        try {
            try {
                bufferedWriter = aWM.b(this.f, Charsets.UTF_8);
                abf_2.a(bufferedWriter, string);
            }
            catch (FileNotFoundException fileNotFoundException) {
                IOUtilsInvoker.a(bufferedWriter);
                return;
            }
            catch (IOException iOException) {
                IOUtilsInvoker.a(bufferedWriter);
                return;
            }
        }
        catch (Throwable throwable) {
            IOUtilsInvoker.a(bufferedWriter);
            throw throwable;
        }
        IOUtilsInvoker.a(bufferedWriter);
    }

    public void a(GameProfile gameProfile) {
        this.a(gameProfile, null);
    }

    public GameProfile b(UUID uUID) {
        ayp_0 cfr_ignored_0 = (ayp_0)MapInvoker.c(this.h, uUID);
        return null;
    }

    public GameProfile a(String string) {
        String string2 = StringInvoker.a(string, Locale.ROOT);
        ayp_0 ayp_02 = (ayp_0)MapInvoker.c(this.c, string2);
        if (aqk_2.a(new Date()) >= aqk_2.a(ayp_0.a(ayp_02))) {
            MapInvoker.a(this.h, a4Z.a(ayp_02.b()));
            MapInvoker.a(this.c, StringInvoker.a(a4Z.d(ayp_02.b()), Locale.ROOT));
            aky_1.c(this.b, ayp_02.b());
            ayp_02 = null;
        }
        GameProfile gameProfile = ayp_02.b();
        aky_1.c(this.b, gameProfile);
        aky_1.b(this.b, gameProfile);
        this.c();
        return null;
    }

    static {
        e = new SimpleDateFormat(vk_0.a);
        d = new aq5();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a() {
        BufferedReader bufferedReader = null;
        try {
            try {
                bufferedReader = aWM.a(this.f, Charsets.UTF_8);
                List list = (List)a4W.a(this.g, (Reader)bufferedReader, (Type)d);
                MapInvoker.d(this.c);
                MapInvoker.d(this.h);
                aky_1.e(this.b);
                try {
                    Iterator iterator = ListInvoker.iterator(my_0.a(list));
                    while (dz_0.c(iterator)) {
                        ayp_0 ayp_02 = (ayp_0)dz_0.b(iterator);
                        this.a(ayp_02.b(), ayp_02.a());
                    }
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            catch (JsonParseException | FileNotFoundException throwable) {
                IOUtilsInvoker.b(bufferedReader);
                return;
            }
        }
        catch (Throwable throwable) {
            IOUtilsInvoker.b(bufferedReader);
            throw throwable;
        }
        IOUtilsInvoker.b(bufferedReader);
    }

    public String[] b() {
        ArrayList arrayList = my_0.a(MapInvoker.c(this.c));
        return (String[])ListInvoker.toArray(arrayList, new String[ListInvoker.size(arrayList)]);
    }

    private static GameProfile a(MinecraftServer minecraftServer, String string) {
        GameProfile[] gameProfileArray = new GameProfile[1];
        DE dE = new DE(gameProfileArray);
        vm_1.a(ServerInvoker.E(minecraftServer), new String[]{string}, Agent.MINECRAFT, dE);
        if (!ServerInvoker.e(minecraftServer) && gameProfileArray[0] == null) {
            UUID uUID = a6w_0.a(new GameProfile(null, string));
            GameProfile gameProfile = new GameProfile(uUID, string);
            ik_1.a(dE, gameProfile);
        }
        return gameProfileArray[0];
    }
}

