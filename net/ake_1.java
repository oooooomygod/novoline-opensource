/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.typesafe.config.Config
 *  com.typesafe.config.ConfigList
 *  com.typesafe.config.ConfigObject
 *  com.typesafe.config.ConfigOrigin
 *  com.typesafe.config.ConfigParseOptions
 *  com.typesafe.config.ConfigRenderOptions
 *  com.typesafe.config.ConfigValue
 *  org.jetbrains.annotations.NotNull
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.StringInvoker;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigList;
import com.typesafe.config.ConfigObject;
import com.typesafe.config.ConfigOrigin;
import com.typesafe.config.ConfigParseOptions;
import com.typesafe.config.ConfigRenderOptions;
import com.typesafe.config.ConfigValue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import net.A0;
import net.C4;
import net.C8;
import net.CD;
import net.ConfigurationOptions;
import net.FG;
import net.H8;
import net.Jd;
import net.MV;
import net.P8;
import net.a2V;
import net.a3b_0;
import net.a4e_0;
import net.a7c_0;
import net.aS0;
import net.aSB;
import net.aVH;
import net.aXZ;
import net.ad__0;
import net.afy_0;
import net.agm_2;
import net.ai5_0;
import net.aio_2;
import net.ajk_0;
import net.ak5_0;
import net.akg_1;
import net.amx_2;
import net.an_1;
import net.ap6_0;
import net.apo_1;
import net.ara_2;
import net.avy_1;
import net.da_1;
import net.dz_0;
import net.ki_0;
import net.oc_1;
import net.ow_1;
import net.s5_0;
import net.wk_2;
import net.xj_1;
import net.xn_0;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.akE
 */
public class ake_1
extends akg_1<apo_1> {
    private static ConfigRenderOptions o;
    private ConfigRenderOptions m;
    public static Pattern l;
    private static Constructor<? extends ConfigValue> k;
    private ConfigParseOptions j;
    private static ConfigOrigin n;
    private static Constructor<? extends ConfigValue> p;

    @NotNull
    public static H8 c() {
        return new H8();
    }

    static ConfigValue a(Map<String, ConfigValue> map) {
        try {
            return (ConfigValue)ap6_0.a(k, new Object[]{n, map});
        }
        catch (IllegalAccessException | InstantiationException | InvocationTargetException reflectiveOperationException) {
            throw new RuntimeException(reflectiveOperationException);
        }
    }

    static ConfigValue a(List<ConfigValue> list) {
        try {
            return (ConfigValue)ap6_0.a(p, new Object[]{n, list});
        }
        catch (IllegalAccessException | InstantiationException | InvocationTargetException reflectiveOperationException) {
            throw new RuntimeException(reflectiveOperationException);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static ConfigValue lambda$fromValue$0(ConfigValue configValue, String string) {
        return C4.a(configValue, agm_2.a(C4.c(configValue), amx_2.a(c, string)));
    }

    private static ConfigValue a(ad__0 ad__02) {
        ConfigValue configValue;
        Object object;
        Iterator iterator;
        Object object2;
        H8.b();
        if (ki_0.i(ad__02)) {
            object2 = ajk_0.a(aVH.e(ki_0.j(ad__02)));
            iterator = aS0.f(MapInvoker.b(ki_0.g(ad__02)));
            if (dz_0.c(iterator)) {
                object = (Map.Entry)dz_0.b(iterator);
                MapInvoker.c((Map)object2, StringInvoker.a(FG.b((Map.Entry)object)), ake_1.a((ad__0)FG.a((Map.Entry)object)));
            }
            configValue = ake_1.a((Map<String, ConfigValue>)object2);
        }
        if (ki_0.q(ad__02)) {
            object2 = new ArrayList();
            iterator = ListInvoker.iterator(ki_0.h(ad__02));
            if (dz_0.c(iterator)) {
                object = (ad__0)dz_0.b(iterator);
                ListInvoker.add((List)object2, ake_1.a((ad__0)object));
            }
            configValue = ake_1.a((List<ConfigValue>)object2);
        }
        configValue = avy_1.a(ki_0.e(ad__02), C8.d);
        if (ad__02 instanceof apo_1) {
            object2 = (apo_1)ad__02;
            iterator = configValue;
            configValue = (ConfigValue)oc_1.a(oc_1.a(aXZ.a((apo_1)object2), arg_0 -> ake_1.lambda$fromValue$0((ConfigValue)iterator, arg_0)), configValue);
        }
        return configValue;
    }

    static {
        Class clazz;
        Class clazz2;
        l = ow_1.c(C8.f);
        o = a2V.b(a2V.a(a2V.a(), false), false);
        n = A0.a(C8.a);
        try {
            clazz2 = ara_2.b(ara_2.a(C8.e), ConfigValue.class);
            clazz = ara_2.b(ara_2.a(C8.b), ConfigValue.class);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new ExceptionInInitializerError(classNotFoundException);
        }
        try {
            k = ara_2.a(clazz2, new Class[]{ConfigOrigin.class, Map.class});
            ap6_0.a(k, true);
            p = ara_2.a(clazz, new Class[]{ConfigOrigin.class, List.class});
            ap6_0.a(p, true);
            return;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new ExceptionInInitializerError(noSuchMethodException);
        }
    }

    private ake_1(H8 h8) {
        super(h8, new s5_0[]{an_1.HASH, an_1.DOUBLE_SLASH});
        this.m = aio_2.a(h8);
        this.j = aio_2.b(h8);
    }

    public static ConfigParseOptions a() {
        return ak5_0.a();
    }

    @Override
    @NotNull
    public apo_1 a(@NotNull ConfigurationOptions configurationOptions) {
        H8.b();
        configurationOptions = aVH.a(configurationOptions, (Set)MV.a(Map.class, List.class, Double.class, Long.class, Integer.class, Boolean.class, new Class[]{String.class, Number.class}));
        xn_0 xn_02 = CD.a(configurationOptions);
        ListInvoker.b(new ListInvoker[1]);
        return xn_02;
    }

    private static void a(ConfigValue configValue, apo_1 apo_12) {
        H8.b();
        if (!ListInvoker.isEmpty(agm_2.a(C4.c(configValue)))) {
            aXZ.a(apo_12, wk_2.a(ow_1.a(l, aSB.a(aSB.a('\n'), agm_2.a(C4.c(configValue)))), C8.c));
        }
        switch (C4.a(configValue)) {
            case OBJECT: {
                Object object;
                if (afy_0.b((ConfigObject)configValue)) {
                    aXZ.a(apo_12, da_1.a());
                }
                if (dz_0.c((Iterator)(object = aS0.f(afy_0.a((ConfigObject)configValue))))) {
                    Map.Entry entry = (Map.Entry)dz_0.b((Iterator)object);
                    ake_1.a((ConfigValue)FG.a(entry), aXZ.a(apo_12, new Object[]{FG.b(entry)}));
                }
            }
            case LIST: {
                int n;
                Object object;
                if (ai5_0.a((ConfigList)configValue)) {
                    aXZ.a(apo_12, a7c_0.b());
                }
                if ((n = 0) < ListInvoker.size((List)(object = (ConfigList)configValue))) {
                    ake_1.a((ConfigValue)ListInvoker.get((List)object, n), aXZ.a(apo_12, new Object[]{P8.d(n)}));
                    ++n;
                }
            }
            case NULL: {
                return;
            }
        }
        aXZ.a(apo_12, C4.b(configValue));
    }

    @Override
    public void a(apo_1 apo_12, BufferedReader bufferedReader) throws IOException {
        Config config = a3b_0.a(bufferedReader, this.j);
        H8.b();
        config = xj_1.a(config);
        Iterator iterator = aS0.f(afy_0.a(xj_1.b(config)));
        if (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            ake_1.a((ConfigValue)FG.a(entry), aXZ.a(apo_12, new Object[]{FG.b(entry)}));
        }
        if (ListInvoker.b() != null) {
            H8.b(new int[2]);
        }
    }

    public static ConfigRenderOptions b() {
        return o;
    }

    @Override
    protected void a(ad__0 ad__02, Writer writer) throws IOException {
        H8.b();
        if (!ki_0.i(ad__02)) {
            if (ki_0.e(ad__02) == null) {
                a4e_0.a(writer, a);
                return;
            }
            throw new IOException(C8.g);
        }
        ConfigValue configValue = ake_1.a(ad__02);
        String string = C4.a(configValue, this.m);
        a4e_0.a(writer, string);
    }

    ake_1(H8 h8, Jd jd) {
        this(h8);
    }
}

