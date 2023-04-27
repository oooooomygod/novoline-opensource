/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.IOUtilsInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import deobf.EntityPlayer;
import deobf.GameSettings;
import deobf.ITickable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import net.FG;
import net.G2;
import net.IResourceManagerReloadListener;
import net.JX;
import net.N6;
import net.OA;
import net.ResourceLocation;
import net.T6;
import net.TO;
import net.Ti;
import net.a3p_0;
import net.a4W;
import net.a5_0;
import net.aB9;
import net.aCD;
import net.aET;
import net.aI_;
import net.aL0;
import net.aS0;
import net.aXN;
import net.aag_1;
import net.abh_2;
import net.adt_0;
import net.aif_0;
import net.ajZ;
import net.amo_2;
import net.aoe_2;
import net.atL;
import net.axw_1;
import net.dw_0;
import net.dz_0;
import net.j6_0;
import net.my_0;
import net.qz_2;
import net.tw_0;
import net.zc_2;
import org.apache.logging.log4j.Logger;

public class SoundHandler
implements IResourceManagerReloadListener,
ITickable {
    public static atL f;
    private static Gson g;
    private zc_2 a = new zc_2();
    private TO d;
    private aI_ e;
    private static ParameterizedType b;
    private static Logger c;

    public void a(aCD aCD2, int n) {
        this.d.a(aCD2, n);
    }

    public void c() {
        JX jX = new JX();
        adt_0.a(jX, N6.MASTER);
        Ti ti = new Ti();
        aag_1.a(ti, aXN.o);
        aag_1.a(ti, aET.FILE);
        aag_1.b(ti, 1.0f);
        aag_1.a(ti, 1.0f);
        aag_1.a(ti, 1);
        ListInvoker.add(adt_0.c(jX), ti);
        this.a(new ResourceLocation(aXN.l, aXN.h), jX);
    }

    public void e() {
        tw_0.c(this.d);
    }

    @Override
    public void b() {
        tw_0.a(this.d);
    }

    public void a(aCD aCD2) {
        this.d.c(aCD2);
    }

    public void a(N6 n6, float f) {
        if (n6 == N6.MASTER && f <= 0.0f) {
            this.a();
        }
        tw_0.a(this.d, n6, f);
    }

    public void a() {
        tw_0.b(this.d);
    }

    static zc_2 a(SoundHandler soundHandler) {
        return soundHandler.a;
    }

    static {
        c = LogManagerInvoker.c();
        g = aB9.b(aB9.a(new GsonBuilder(), JX.class, (Object)new OA()));
        b = new a3p_0();
        f = new atL(new ResourceLocation(aXN.i), 0.0, 0.0, false);
    }

    public zc_2 f() {
        return this.a;
    }

    @Override
    public void b(aI_ aI_2) {
        tw_0.d(this.d);
        aif_0.b(this.a);
        this.g();
        Iterator iterator = aS0.f(j6_0.a(aI_2));
        while (dz_0.c(iterator)) {
            String string = (String)dz_0.b(iterator);
            try {
                Iterator iterator2 = ListInvoker.iterator(j6_0.a(aI_2, new ResourceLocation(string, aXN.p)));
                while (dz_0.c(iterator2)) {
                    abh_2 abh_22 = (abh_2)dz_0.b(iterator2);
                    try {
                        Map<String, JX> map = this.a(dw_0.b(abh_22));
                        Iterator iterator3 = aS0.f(MapInvoker.b(map));
                        while (dz_0.c(iterator3)) {
                            Map.Entry entry = (Map.Entry)dz_0.b(iterator3);
                            this.a(new ResourceLocation(string, (String)FG.b(entry)), (JX)FG.a(entry));
                        }
                    }
                    catch (RuntimeException runtimeException) {
                        LoggerInvoker.b(c, aXN.n, runtimeException);
                    }
                }
            }
            catch (IOException iOException) {
            }
        }
    }

    public ajZ a(ResourceLocation resourceLocation) {
        return (ajZ)aif_0.a(this.a, resourceLocation);
    }

    public void d() {
        tw_0.e(this.d);
    }

    public ajZ a(N6 ... n6Array) {
        ArrayList arrayList = my_0.c();
        Iterator iterator = aS0.f(aif_0.a(this.a));
        while (dz_0.c(iterator)) {
            ResourceLocation resourceLocation = (ResourceLocation)dz_0.b(iterator);
            ajZ ajZ2 = (ajZ)aif_0.a(this.a, resourceLocation);
            if (!aoe_2.c((Object[])n6Array, (Object)G2.c(ajZ2))) continue;
            ListInvoker.add(arrayList, ajZ2);
        }
        if (ListInvoker.isEmpty(arrayList)) {
            return null;
        }
        return (ajZ)ListInvoker.get(arrayList, a5_0.a(new Random(), ListInvoker.size(arrayList)));
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public void g() {
        JX jX = new JX();
        adt_0.a(jX, N6.MASTER);
        Ti ti = new Ti();
        aag_1.a(ti, aXN.k);
        aag_1.a(ti, aET.FILE);
        aag_1.b(ti, 1.0f);
        aag_1.a(ti, 1.0f);
        aag_1.a(ti, 1);
        ListInvoker.add(adt_0.c(jX), ti);
        this.a(new ResourceLocation(aXN.a, aXN.e), jX);
    }

    public void h() {
        tw_0.f(this.d);
    }

    public boolean b(aCD aCD2) {
        return this.d.a(aCD2);
    }

    public SoundHandler(aI_ aI_2, GameSettings gameSettings) {
        this.e = aI_2;
        this.d = new TO(this, gameSettings);
    }

    public void c(aCD aCD2) {
        this.d.b(aCD2);
    }

    public void a(EntityPlayer entityPlayer, float f) {
        this.d.a(entityPlayer, f);
    }

    protected Map<String, JX> a(InputStream inputStream) {
        try {
            Map map = (Map)a4W.a(g, (Reader)new InputStreamReader(inputStream), (Type)b);
            return map;
        }
        finally {
            IOUtilsInvoker.closeQuietly(inputStream);
        }
    }

    /*
     * Loose catch block
     */
    private void a(ResourceLocation resourceLocation, JX jX) {
        ajZ ajZ2;
        boolean bl = !aif_0.b(this.a, resourceLocation);
        if (!adt_0.a(jX)) {
            ajZ2 = (ajZ)aif_0.a(this.a, resourceLocation);
        } else {
            LoggerInvoker.a(c, aXN.q, new Object[]{resourceLocation});
            ajZ2 = new ajZ(resourceLocation, 1.0, 1.0, adt_0.b(jX));
            aif_0.a(this.a, ajZ2);
        }
        Iterator iterator = ListInvoker.iterator(adt_0.c(jX));
        block11: while (dz_0.c(iterator)) {
            qz_2<atL> qz_22;
            Ti ti = (Ti)dz_0.b(iterator);
            String string = aag_1.a(ti);
            ResourceLocation resourceLocation2 = new ResourceLocation(string);
            String string2 = StringInvoker.a(string, (CharSequence)aXN.c) ? axw_1.a(resourceLocation2) : axw_1.a(resourceLocation);
            switch (aag_1.f(ti)) {
                case FILE: {
                    ResourceLocation resourceLocation3 = new ResourceLocation(string2, aL0.a(aL0.a(aL0.a(new StringBuilder(), aXN.j), axw_1.b(resourceLocation2)), aXN.b).toString());
                    InputStream inputStream = null;
                    inputStream = dw_0.b(j6_0.b(this.e, resourceLocation3));
                    IOUtilsInvoker.closeQuietly(inputStream);
                    qz_22 = new amo_2(new atL(resourceLocation3, aag_1.b(ti), aag_1.c(ti), aag_1.d(ti)), aag_1.e(ti));
                    break;
                    {
                        catch (FileNotFoundException fileNotFoundException) {
                            LoggerInvoker.b(c, aXN.m, new Object[]{resourceLocation3, resourceLocation});
                            IOUtilsInvoker.closeQuietly(inputStream);
                            continue block11;
                        }
                        catch (IOException iOException) {
                            LoggerInvoker.b(c, aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aXN.d), resourceLocation3), aXN.g), resourceLocation).toString(), iOException);
                            {
                                catch (Throwable throwable) {
                                    IOUtilsInvoker.closeQuietly(inputStream);
                                    throw throwable;
                                }
                            }
                            IOUtilsInvoker.closeQuietly(inputStream);
                            continue block11;
                        }
                    }
                }
                case SOUND_EVENT: {
                    qz_22 = new T6(this, string2, ti);
                    break;
                }
                default: {
                    throw new IllegalStateException(aXN.f);
                }
            }
            G2.a(ajZ2, qz_22);
        }
    }
}

