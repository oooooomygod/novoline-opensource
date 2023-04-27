/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package cc.novoline.modules;

import cc.novoline.Novoline;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.modules.AbstractModule;
import deobf.EnumPlayerType;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import net.Config;
import net.FG;
import net.P8;
import net.a4a_0;
import net.aB0;
import net.aIB;
import net.aMF;
import net.aS0;
import net.aa2_0;
import net.ad__0;
import net.ah__0;
import net.akf_0;
import net.asl_0;
import net.dz_0;
import net.ki_0;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PlayerManager {
    private Logger a = LogManager.getLogger();
    private Config b;
    private Map<String, EnumPlayerType> c = new Object2ObjectArrayMap();

    public boolean a(String string, @NotNull EnumPlayerType enumPlayerType) {
        asl_0.a(string, akf_0.b);
        AbstractModule.c();
        String string2 = StringInvoker.a(string, Locale.ROOT);
        EnumPlayerType enumPlayerType2 = (EnumPlayerType)((Object)MapInvoker.c(this.c, string2));
        if (enumPlayerType2 == enumPlayerType) {
            return false;
        }
        boolean bl = MapInvoker.c(this.c, string2, (Object)enumPlayerType) == enumPlayerType2;
        return bl;
    }

    private void a() {
        ad__0 ad__02 = a4a_0.a(aa2_0.b(this.b));
        AbstractModule.v();
        Iterator iterator = aS0.f(MapInvoker.b(this.c));
        if (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            String string = (String)FG.b(entry);
            EnumPlayerType enumPlayerType = (EnumPlayerType)((Object)FG.a(entry));
            ki_0.a(ki_0.a(ad__02, new Object[]{string}), P8.d(enumPlayerType.ordinal()));
        }
        aa2_0.a(this.b, ad__02);
    }

    private static boolean lambda$whoHas$0(EnumPlayerType enumPlayerType, Map.Entry entry) {
        return FG.a(entry) == enumPlayerType;
    }

    public Logger d() {
        return this.a;
    }

    public List<String> a(@NotNull EnumPlayerType enumPlayerType) {
        return (List)aMF.a(aMF.a(aMF.b(aS0.c(MapInvoker.b(this.c)), arg_0 -> PlayerManager.lambda$whoHas$0(enumPlayerType, arg_0)), Map.Entry::getKey), aB0.a(ObjectArrayList::new));
    }

    public Config c() {
        return this.b;
    }

    public boolean a(String string) {
        AbstractModule.c();
        asl_0.a(string, akf_0.a);
        String string2 = StringInvoker.a(string, Locale.ROOT);
        boolean bl = MapInvoker.a(this.c, string2) != null;
        return bl;
    }

    @Nullable
    public EnumPlayerType b(String string) {
        AbstractModule.v();
        if (aIB.c(string)) {
            return null;
        }
        String string2 = StringInvoker.a(string, Locale.ROOT);
        return (EnumPlayerType)((Object)MapInvoker.c(this.c, string2));
    }

    private void b() {
        AbstractModule.c();
        EnumPlayerType[] enumPlayerTypeArray = EnumPlayerType.values();
        Set set = MapInvoker.b(ki_0.g(aa2_0.a(this.b)));
        Object2ObjectArrayMap object2ObjectArrayMap = new Object2ObjectArrayMap();
        Iterator iterator = aS0.f(set);
        if (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            String string = StringInvoker.a(FG.b(entry).toString(), Locale.ROOT);
            EnumPlayerType enumPlayerType = enumPlayerTypeArray[ki_0.f((ad__0)FG.a(entry))];
            MapInvoker.c((Map)object2ObjectArrayMap, string, (Object)enumPlayerType);
        }
        MapInvoker.a(this.c, (Map)object2ObjectArrayMap);
    }

    public boolean c(String string, @NotNull EnumPlayerType enumPlayerType) {
        AbstractModule.c();
        if (aIB.c(string)) {
            return false;
        }
        String string2 = StringInvoker.a(string, Locale.ROOT);
        EnumPlayerType enumPlayerType2 = (EnumPlayerType)((Object)MapInvoker.c(this.c, string2));
        boolean bl = enumPlayerType2 == enumPlayerType && MapInvoker.a(this.c, string2) == enumPlayerType2;
        return bl;
    }

    public boolean b(String string, @NotNull EnumPlayerType enumPlayerType) {
        AbstractModule.c();
        if (aIB.c(string)) {
            return false;
        }
        String string2 = StringInvoker.a(string, Locale.ROOT);
        return MapInvoker.c(this.c, string2) == enumPlayerType;
    }

    public PlayerManager(@NotNull Novoline novoline, @NotNull String string) {
        this.b = aa2_0.a(ah__0.a(NovolineInvoker.c(novoline), string));
        aa2_0.d(this.b);
        this.b();
    }

    public boolean a(@NotNull EnumPlayerType enumPlayerType, @NotNull Predicate<Map.Entry<String, EnumPlayerType>> predicate) {
        AbstractModule.v();
        boolean bl = aS0.a(MapInvoker.b(this.c), predicate);
        if (bl) {
            this.a();
        }
        return bl;
    }
}

