/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.Multimap
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 *  paulscode.sound.SoundSystemException
 *  paulscode.sound.codecs.CodecJOrbis
 *  paulscode.sound.libraries.LibraryLWJGLOpenAL
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.SoundHandlerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.ThreadInvoker;
import com.google.common.collect.BiMap;
import com.google.common.collect.Multimap;
import deobf.EntityPlayer;
import deobf.GameSettings;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.BU;
import net.FG;
import net.G2;
import net.MM;
import net.MathHelper;
import net.N6;
import net.P8;
import net.ResourceLocation;
import net.SoundHandler;
import net.a6w_0;
import net.aCD;
import net.aS0;
import net.aSV;
import net.aXM;
import net.af9_0;
import net.ahi_0;
import net.asc_0;
import net.asg_1;
import net.atL;
import net.ati_0;
import net.au6_0;
import net.awu_1;
import net.axw_1;
import net.dz_0;
import net.eu_2;
import net.kq_2;
import net.ms_0;
import net.my_0;
import net.p3_0;
import net.zi_2;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import paulscode.sound.SoundSystemException;
import paulscode.sound.codecs.CodecJOrbis;
import paulscode.sound.libraries.LibraryLWJGLOpenAL;

public class TO {
    private Map<String, Integer> m;
    private asg_1 l;
    private Map<String, aCD> e = au6_0.a();
    private SoundHandler n;
    private List<kq_2> d;
    private Multimap<N6, String> a;
    private Map<aCD, atL> g;
    private int h = 0;
    private static Marker c;
    private boolean k;
    private GameSettings b;
    private Map<aCD, Integer> i;
    private Map<aCD, String> f = ahi_0.a((BiMap)this.e);
    private static Logger j;

    private static URL a(ResourceLocation resourceLocation) {
        String string = StringInvoker.a(p3_0.h, new Object[]{p3_0.i, axw_1.a(resourceLocation), axw_1.b(resourceLocation)});
        BU bU = new BU(resourceLocation);
        try {
            return new URL(null, string, bU);
        }
        catch (MalformedURLException malformedURLException) {
            throw new Error(p3_0.q);
        }
    }

    public void e() {
        aCD aCD2;
        Object object;
        Object object2;
        ++this.h;
        Iterator iterator = ListInvoker.iterator(this.d);
        while (dz_0.c(iterator)) {
            object2 = (kq_2)dz_0.b(iterator);
            eu_2.c((kq_2)object2);
            if (eu_2.b((kq_2)object2)) {
                this.b((aCD)object2);
                continue;
            }
            object = (String)MapInvoker.c(this.f, object2);
            this.l.setVolume((String)object, this.a((aCD)object2, (atL)MapInvoker.c(this.g, object2), G2.c(SoundHandlerInvoker.a(this.n, eu_2.e((kq_2)object2)))));
            this.l.setPitch((String)object, this.a((aCD)object2, (atL)MapInvoker.c(this.g, object2)));
            this.l.setPosition((String)object, eu_2.a((kq_2)object2), eu_2.f((kq_2)object2), eu_2.d((kq_2)object2));
        }
        iterator = aS0.f(MapInvoker.b(this.e));
        while (dz_0.c(iterator)) {
            int n;
            object2 = (Map.Entry)dz_0.b(iterator);
            object = (String)FG.b((Map.Entry)object2);
            aCD2 = (aCD)FG.a((Map.Entry)object2);
            if (this.l.playing((String)object) || (n = P8.b((Integer)MapInvoker.c(this.m, object))) > this.h) continue;
            int n2 = ati_0.f(aCD2);
            if (ati_0.h(aCD2)) {
                MapInvoker.c(this.i, aCD2, P8.d(this.h + n2));
            }
            dz_0.a(iterator);
            LoggerInvoker.d(j, c, p3_0.f, new Object[]{object});
            this.l.removeSource((String)object);
            MapInvoker.a(this.m, object);
            MapInvoker.a(this.g, aCD2);
            try {
                MM.a(this.a, (Object)G2.c(SoundHandlerInvoker.a(this.n, ati_0.c(aCD2))), object);
            }
            catch (RuntimeException runtimeException) {}
            if (!(aCD2 instanceof kq_2)) continue;
            ListInvoker.remove(this.d, aCD2);
        }
        object2 = aS0.f(MapInvoker.b(this.i));
        while (dz_0.c((Iterator)object2)) {
            object = (Map.Entry)dz_0.b((Iterator)object2);
            if (this.h < P8.b((Integer)FG.a((Map.Entry)object))) continue;
            aCD2 = (aCD)FG.b((Map.Entry)object);
            if (aCD2 instanceof kq_2) {
                eu_2.c((kq_2)aCD2);
            }
            this.c(aCD2);
            dz_0.a((Iterator)object2);
        }
    }

    public void a(aCD aCD2, int n) {
        MapInvoker.c(this.i, aCD2, P8.d(this.h + n));
    }

    public void a(EntityPlayer entityPlayer, float f) {
        if (this.k) {
            float f2 = entityPlayer.prevRotationPitch + (entityPlayer.rotationPitch - entityPlayer.prevRotationPitch) * f;
            float f3 = entityPlayer.prevRotationYaw + (entityPlayer.rotationYaw - entityPlayer.prevRotationYaw) * f;
            double d = entityPlayer.prevPosX + (entityPlayer.posX - entityPlayer.prevPosX) * (double)f;
            double d2 = entityPlayer.prevPosY + (entityPlayer.posY - entityPlayer.prevPosY) * (double)f + (double)a6w_0.q(entityPlayer);
            double d3 = entityPlayer.prevPosZ + (entityPlayer.posZ - entityPlayer.prevPosZ) * (double)f;
            float f4 = MathHelper.cos((f3 + 90.0f) * ((float)Math.PI / 180));
            float f5 = MathHelper.sin((f3 + 90.0f) * ((float)Math.PI / 180));
            float f6 = MathHelper.cos(-f2 * ((float)Math.PI / 180));
            float f7 = MathHelper.sin(-f2 * ((float)Math.PI / 180));
            float f8 = MathHelper.cos((-f2 + 90.0f) * ((float)Math.PI / 180));
            float f9 = MathHelper.sin((-f2 + 90.0f) * ((float)Math.PI / 180));
            float f10 = f4 * f6;
            float f11 = f5 * f6;
            float f12 = f4 * f8;
            float f13 = f5 * f8;
            this.l.setListenerPosition((float)d, (float)d2, (float)d3);
            this.l.setListenerOrientation(f10, f7, f11, f12, f9, f13);
        }
    }

    private float a(aCD aCD2, atL atL2) {
        return (float)MathHelper.b((double)ati_0.b(aCD2) * asc_0.c(atL2), 0.5, 2.0);
    }

    static Logger h() {
        return j;
    }

    public void b(aCD aCD2) {
        if (this.k) {
            String string = (String)MapInvoker.c(this.f, aCD2);
            this.l.stop(string);
        }
    }

    private float a(N6 n6) {
        return n6 != N6.MASTER ? awu_1.a(this.b, n6) : 1.0f;
    }

    public boolean a(aCD aCD2) {
        if (!this.k) {
            return false;
        }
        String string = (String)MapInvoker.c(this.f, aCD2);
        return this.l.playing(string) || MapInvoker.b(this.m, string) && P8.b((Integer)MapInvoker.c(this.m, string)) <= this.h;
    }

    public void a(N6 n6, float f) {
        if (this.k) {
            if (n6 == N6.MASTER) {
                this.l.setMasterVolume(f);
            } else {
                Iterator iterator = ms_0.a(MM.a(this.a, (Object)n6));
                while (dz_0.c(iterator)) {
                    String string = (String)dz_0.b(iterator);
                    aCD aCD2 = (aCD)MapInvoker.c(this.e, string);
                    float f2 = this.a(aCD2, (atL)MapInvoker.c(this.g, aCD2), n6);
                    if (f2 <= 0.0f) {
                        this.b(aCD2);
                        continue;
                    }
                    this.l.setVolume(string, f2);
                }
            }
        }
    }

    private void lambda$loadSoundSystem$0() {
        af9_0.a(new aXM(this));
        this.l = new asg_1(this, null);
        this.k = true;
        this.l.setMasterVolume(awu_1.a(this.b, N6.MASTER));
        LoggerInvoker.a(j, c, p3_0.e);
    }

    private float a(aCD aCD2, atL atL2, N6 n6) {
        return (float)MathHelper.b((double)ati_0.d(aCD2) * asc_0.a(atL2), 0.0, 1.0) * this.a(n6);
    }

    public void c(aCD aCD2) {
        if (this.k) {
            if (this.l.getMasterVolume() <= 0.0f) {
                LoggerInvoker.d(j, c, p3_0.c, new Object[]{ati_0.c(aCD2)});
            } else {
                SoundHandlerInvoker.a(this.n, ati_0.c(aCD2));
                LoggerInvoker.a(j, c, p3_0.g, new Object[]{ati_0.c(aCD2)});
            }
        }
    }

    static {
        j = LogManagerInvoker.c();
        c = aSV.a(p3_0.n);
    }

    public void c() {
        this.d();
        this.a();
    }

    public void d() {
        if (this.k) {
            this.g();
            this.l.cleanup();
            this.k = false;
        }
    }

    public void f() {
        Iterator iterator = aS0.f(MapInvoker.c(this.e));
        while (dz_0.c(iterator)) {
            String string = (String)dz_0.b(iterator);
            LoggerInvoker.d(j, c, p3_0.m, new Object[]{string});
            this.l.pause(string);
        }
    }

    public TO(SoundHandler soundHandler, GameSettings gameSettings) {
        this.g = MapsInvoker.a();
        this.a = zi_2.a();
        this.d = my_0.c();
        this.i = MapsInvoker.a();
        this.m = MapsInvoker.a();
        this.n = soundHandler;
        this.b = gameSettings;
        try {
            af9_0.a(LibraryLWJGLOpenAL.class);
            af9_0.a(p3_0.b, CodecJOrbis.class);
        }
        catch (SoundSystemException soundSystemException) {
            LoggerInvoker.a(j, c, p3_0.j, soundSystemException);
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    private synchronized void a() {
        if (!this.k) {
            try {
                ThreadInvoker.e(new Thread(this::lambda$loadSoundSystem$0, p3_0.d));
            }
            catch (RuntimeException runtimeException) {
                LoggerInvoker.a(j, c, p3_0.k, runtimeException);
                awu_1.a(this.b, N6.MASTER, 0.0f);
                awu_1.c(this.b);
            }
        }
    }

    public void g() {
        if (this.k) {
            Iterator iterator = aS0.f(MapInvoker.c(this.e));
            while (dz_0.c(iterator)) {
                String string = (String)dz_0.b(iterator);
                this.l.stop(string);
            }
            MapInvoker.d(this.e);
            MapInvoker.d(this.i);
            ListInvoker.clear(this.d);
            MM.b(this.a);
            MapInvoker.d(this.g);
            MapInvoker.d(this.m);
        }
    }

    public void b() {
        Iterator iterator = aS0.f(MapInvoker.c(this.e));
        while (dz_0.c(iterator)) {
            String string = (String)dz_0.b(iterator);
            LoggerInvoker.d(j, c, p3_0.a, new Object[]{string});
            this.l.play(string);
        }
    }
}

