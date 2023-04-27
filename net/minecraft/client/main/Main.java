/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.mojang.authlib.properties.PropertyMap
 *  com.mojang.authlib.properties.PropertyMap$Serializer
 *  joptsimple.ArgumentAcceptingOptionSpec
 *  joptsimple.NonOptionArgumentSpec
 *  joptsimple.OptionParser
 *  joptsimple.OptionSet
 *  joptsimple.OptionSpec
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net.minecraft.client.main;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import cc.novoline.invoke.ThreadInvoker;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.authlib.properties.PropertyMap;
import net.minecraft.client.main.configuration.DisplayInformation;
import deobf.MCInvoker;
import net.minecraft.client.main.configuration.ServerInformation;
import net.minecraft.client.main.configuration.UserInformation;
import java.io.File;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.NonOptionArgumentSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import net.minecraft.client.Minecraft;
import org.checkerframework.checker.nullness.qual.NonNull;

public class Main {
    public static String a;

    private static boolean a(String string) {
        return !StringInvoker.g(string);
    }

    public static void a(@NonNull File file) {
        try {
            URL uRL = ame_0.a(zq_2.l(file));
            URLClassLoader uRLClassLoader = (URLClassLoader)uo_0.a();
            Method method = ara_2.b(URLClassLoader.class, VE.Q, new Class[]{URL.class});
            VT.a(method, true);
            VT.a(method, uRLClassLoader, new Object[]{uRL});
            ea_1.a(System.out, aL0.a(aL0.a(new StringBuilder(), VE.w), zq_2.q(file)).toString());
            return;
        }
        catch (Throwable throwable) {
            throw new RuntimeException(VE.a, throwable);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public static void main(String[] stringArray) {
        SystemInvoker.b(VE.p, VE.o);
        OptionParser optionParser = new OptionParser();
        EB.a(optionParser);
        EB.a(optionParser, VE.J);
        EB.a(optionParser, VE.P);
        EB.a(optionParser, VE.L);
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec = ado_0.a(EB.a(optionParser, VE.k));
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec2 = aSW.a(aSW.a(ado_0.a(EB.a(optionParser, VE.G)), Integer.class), P8.d(25565), new Integer[0]);
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec3 = aSW.a(aSW.a(ado_0.a(EB.a(optionParser, VE.i)), File.class), new File(VE.x), new File[0]);
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec4 = aSW.a(ado_0.a(EB.a(optionParser, VE.j)), File.class);
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec5 = aSW.a(ado_0.a(EB.a(optionParser, VE.C)), File.class);
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec6 = ado_0.a(EB.a(optionParser, VE.I));
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec7 = aSW.a(aSW.a(ado_0.a(EB.a(optionParser, VE.c)), VE.N, new String[0]), Integer.class);
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec8 = ado_0.a(EB.a(optionParser, VE.F));
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec9 = ado_0.a(EB.a(optionParser, VE.b));
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec10 = aSW.a(ado_0.a(EB.a(optionParser, VE.B)), VE.K, new String[0]);
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec11 = ado_0.a(EB.a(optionParser, VE.n));
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec12 = aSW.a(ado_0.a(EB.a(optionParser, VE.z)));
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec13 = aSW.a(ado_0.a(EB.a(optionParser, VE.v)));
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec14 = aSW.a(aSW.a(ado_0.a(EB.a(optionParser, VE.g)), Integer.class), P8.d(854), new Integer[0]);
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec15 = aSW.a(aSW.a(ado_0.a(EB.a(optionParser, VE.m)), Integer.class), P8.d(480), new Integer[0]);
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec16 = aSW.a(ado_0.a(EB.a(optionParser, VE.E)), VE.D, new String[0]);
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec17 = aSW.a(ado_0.a(EB.a(optionParser, VE.f)), VE.s, new String[0]);
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec18 = ado_0.a(EB.a(optionParser, VE.O));
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec19 = aSW.a(ado_0.a(EB.a(optionParser, VE.e)), VE.q, new String[0]);
        NonOptionArgumentSpec nonOptionArgumentSpec = EB.b(optionParser);
        OptionSet optionSet = EB.a(optionParser, stringArray);
        List list = uc_1.b(optionSet, (OptionSpec)nonOptionArgumentSpec);
        ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec20 = aSW.a(aSW.a(ado_0.b(EB.a(optionParser, VE.h)), String.class), VE.u, new String[0]);
        if (uc_1.c(optionSet, (OptionSpec)argumentAcceptingOptionSpec20) != null && !StringInvoker.g((String)uc_1.c(optionSet, (OptionSpec)argumentAcceptingOptionSpec20))) {
            a = (String)uc_1.c(optionSet, (OptionSpec)argumentAcceptingOptionSpec20);
        }
        if (!ListInvoker.isEmpty(list)) {
            ea_1.a(System.out, aL0.a(aL0.a(new StringBuilder(), VE.r), list).toString());
        }
        String string = (String)uc_1.c(optionSet, (OptionSpec)argumentAcceptingOptionSpec6);
        Proxy proxy = Proxy.NO_PROXY;
        try {
            proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(string, P8.b((Integer)uc_1.c(optionSet, (OptionSpec)argumentAcceptingOptionSpec7))));
        }
        catch (Exception exception) {
            // empty catch block
        }
        String string2 = (String)uc_1.c(optionSet, (OptionSpec)argumentAcceptingOptionSpec8);
        String string3 = (String)uc_1.c(optionSet, (OptionSpec)argumentAcceptingOptionSpec9);
        if (!proxy.equals(Proxy.NO_PROXY) && Main.a(string2) && Main.a(string3)) {
            auw_1.a(new a7s_0(string2, string3));
        }
        int n = P8.b((Integer)uc_1.c(optionSet, (OptionSpec)argumentAcceptingOptionSpec14));
        int n2 = P8.b((Integer)uc_1.c(optionSet, (OptionSpec)argumentAcceptingOptionSpec15));
        boolean bl = uc_1.a(optionSet, VE.t);
        boolean bl2 = uc_1.a(optionSet, VE.A);
        boolean bl3 = uc_1.a(optionSet, VE.d);
        String string4 = (String)uc_1.c(optionSet, (OptionSpec)argumentAcceptingOptionSpec13);
        Gson gson = aB9.b(aB9.a(new GsonBuilder(), PropertyMap.class, (Object)new PropertyMap.Serializer()));
        PropertyMap propertyMap = (PropertyMap)a4W.a(gson, (String)uc_1.c(optionSet, (OptionSpec)argumentAcceptingOptionSpec16), PropertyMap.class);
        PropertyMap propertyMap2 = (PropertyMap)a4W.a(gson, (String)uc_1.c(optionSet, (OptionSpec)argumentAcceptingOptionSpec17), PropertyMap.class);
        File file = (File)uc_1.c(optionSet, (OptionSpec)argumentAcceptingOptionSpec3);
        File file2 = uc_1.a(optionSet, (OptionSpec)argumentAcceptingOptionSpec4) ? (File)uc_1.c(optionSet, (OptionSpec)argumentAcceptingOptionSpec4) : new File(file, VE.H);
        File file3 = uc_1.a(optionSet, (OptionSpec)argumentAcceptingOptionSpec5) ? (File)uc_1.c(optionSet, (OptionSpec)argumentAcceptingOptionSpec5) : new File(file, VE.M);
        String string5 = uc_1.a(optionSet, (OptionSpec)argumentAcceptingOptionSpec11) ? (String)aKB.a((OptionSpec)argumentAcceptingOptionSpec11, optionSet) : (String)aKB.a((OptionSpec)argumentAcceptingOptionSpec10, optionSet);
        String string6 = uc_1.a(optionSet, (OptionSpec)argumentAcceptingOptionSpec18) ? (String)aKB.a((OptionSpec)argumentAcceptingOptionSpec18, optionSet) : null;
        String string7 = (String)uc_1.c(optionSet, (OptionSpec)argumentAcceptingOptionSpec);
        Integer n3 = (Integer)uc_1.c(optionSet, (OptionSpec)argumentAcceptingOptionSpec2);
        Session session = new Session((String)aKB.a((OptionSpec)argumentAcceptingOptionSpec10, optionSet), string5, (String)aKB.a((OptionSpec)argumentAcceptingOptionSpec12, optionSet), (String)aKB.a((OptionSpec)argumentAcceptingOptionSpec19, optionSet));
        GameConfiguration gameConfiguration = new GameConfiguration(new UserInformation(session, propertyMap, propertyMap2, proxy), new DisplayInformation(n, n2, bl, bl2), new FolderInformation(file, file3, file2, string6), new GameInformation(bl3, string4), new ServerInformation(string7, P8.b(n3)));
        als_2.a(als_2.a(), new al0_0(VE.y));
        ThreadInvoker.a(ThreadInvoker.a(), VE.l);
        MCInvoker.L(new Minecraft(gameConfiguration));
    }
}

