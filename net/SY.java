/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.EntityPlayer;
import deobf.ISaveHandler;
import deobf.NBTBase;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import net.HC;
import net.NBTTagCompound;
import net.WorldInfo;
import net.a4E;
import net.a6w_0;
import net.a9K;
import net.aL0;
import net.aR8;
import net.aWR;
import net.ajV;
import net.avx_1;
import net.ayk_0;
import net.cd_1;
import net.ch_2;
import net.ku_1;
import net.tn_0;
import net.uv_2;
import net.zq_2;
import org.apache.logging.log4j.Logger;


public class SY
implements ISaveHandler,
ajV {
    private static Logger c = LogManagerInvoker.c();
    private long b = ServerInvoker.c();
    private File f;
    private String a;
    private File e;
    private File d;

    @Override
    public NBTTagCompound a(EntityPlayer entityPlayer) {
        NBTTagCompound nBTTagCompound;
        block3: {
            nBTTagCompound = null;
            File file = new File(this.f, aL0.a(aL0.a(new StringBuilder(), a6w_0.g(entityPlayer).toString()), avx_1.m).toString());
            if (!zq_2.m(file) || !zq_2.d(file)) break block3;
            try {
                nBTTagCompound = aR8.a(new FileInputStream(file));
            }
            catch (Exception exception) {
                LoggerInvoker.warn(c, aL0.a(aL0.a(new StringBuilder(), avx_1.x), a6w_0.C(entityPlayer)).toString());
            }
        }
        a6w_0.b(entityPlayer, nBTTagCompound);
        return nBTTagCompound;
    }

    @Override
    public void b() throws cd_1 {
        try {
            File file = new File(this.e, avx_1.s);
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                if (ayk_0.a(dataInputStream) != this.b) {
                    throw new cd_1(avx_1.h);
                }
            }
            finally {
                ayk_0.b(dataInputStream);
            }
            return;
        }
        catch (IOException iOException) {
            throw new cd_1(avx_1.k);
        }
    }

    @Override
    public ajV c() {
        return this;
    }

    @Override
    public String[] a() {
        String[] stringArray = zq_2.o(this.f);
        stringArray = new String[]{};
        for (int i = 0; i < stringArray.length; ++i) {
            if (!StringInvoker.c(stringArray[i], avx_1.f)) continue;
            stringArray[i] = StringInvoker.b(stringArray[i], 0, StringInvoker.c(stringArray[i]) - 4);
        }
        return stringArray;
    }

    @Override
    public WorldInfo f() {
        File file = new File(this.e, avx_1.q);
        if (zq_2.m(file)) {
            try {
                NBTTagCompound nBTTagCompound = aR8.a(new FileInputStream(file));
                NBTTagCompound nBTTagCompound2 = tn_0.d(nBTTagCompound, avx_1.p);
                return new WorldInfo(nBTTagCompound2);
            }
            catch (Exception exception) {
                ch_2.a(exception);
            }
        }
        if (zq_2.m(file = new File(this.e, avx_1.l))) {
            try {
                NBTTagCompound nBTTagCompound = aR8.a(new FileInputStream(file));
                NBTTagCompound nBTTagCompound3 = tn_0.d(nBTTagCompound, avx_1.r);
                return new WorldInfo(nBTTagCompound3);
            }
            catch (Exception exception) {
                ch_2.a(exception);
            }
        }
        return null;
    }

    public SY(File file, String string, boolean bl) {
        this.e = new File(file, string);
        zq_2.a(this.e);
        this.f = new File(this.e, avx_1.j);
        this.d = new File(this.e, avx_1.t);
        zq_2.a(this.d);
        this.a = string;
        zq_2.a(this.f);
        this.a();
    }

    @Override
    public void a(WorldInfo worldInfo, NBTTagCompound nBTTagCompound) {
        File file;
        File file2;
        block6: {
            File file3;
            block5: {
                NBTTagCompound nBTTagCompound2 = uv_2.a(worldInfo, nBTTagCompound);
                NBTTagCompound nBTTagCompound3 = new NBTTagCompound();
                tn_0.a(nBTTagCompound3, avx_1.i, (NBTBase)nBTTagCompound2);
                file2 = new File(this.e, avx_1.y);
                file3 = new File(this.e, avx_1.a);
                file = new File(this.e, avx_1.b);
                aR8.a(nBTTagCompound3, new FileOutputStream(file2));
                if (!zq_2.m(file3)) break block5;
                zq_2.f(file3);
            }
            zq_2.a(file, file3);
            if (!zq_2.m(file)) break block6;
            zq_2.f(file);
        }
        try {
            zq_2.a(file2, file);
            if (zq_2.m(file2)) {
                zq_2.f(file2);
            }
        }
        catch (Exception exception) {
            ch_2.a(exception);
        }
    }

    @Override
    public String e() {
        return this.a;
    }

    @Override
    public void a(WorldInfo worldInfo) {
        File file;
        File file2;
        block6: {
            File file3;
            block5: {
                NBTTagCompound nBTTagCompound = uv_2.E(worldInfo);
                NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
                tn_0.a(nBTTagCompound2, avx_1.o, (NBTBase)nBTTagCompound);
                file2 = new File(this.e, avx_1.u);
                file3 = new File(this.e, avx_1.v);
                file = new File(this.e, avx_1.w);
                aR8.a(nBTTagCompound2, new FileOutputStream(file2));
                if (!zq_2.m(file3)) break block5;
                zq_2.f(file3);
            }
            zq_2.a(file, file3);
            if (!zq_2.m(file)) break block6;
            zq_2.f(file);
        }
        try {
            zq_2.a(file2, file);
            if (zq_2.m(file2)) {
                zq_2.f(file2);
            }
        }
        catch (Exception exception) {
            ch_2.a(exception);
        }
    }

    @Override
    public File a() {
        return this.e;
    }

    @Override
    public void d() {
    }

    @Override
    public File a(String string) {
        return new File(this.d, aL0.a(aL0.a(new StringBuilder(), string), avx_1.d).toString());
    }

    @Override
    public void b(EntityPlayer entityPlayer) {
        File file;
        File file2;
        block3: {
            NBTTagCompound nBTTagCompound = new NBTTagCompound();
            a6w_0.a(entityPlayer, nBTTagCompound);
            file2 = new File(this.f, aL0.a(aL0.a(new StringBuilder(), a6w_0.g(entityPlayer).toString()), avx_1.A).toString());
            file = new File(this.f, aL0.a(aL0.a(new StringBuilder(), a6w_0.g(entityPlayer).toString()), avx_1.n).toString());
            aR8.a(nBTTagCompound, new FileOutputStream(file2));
            if (!zq_2.m(file)) break block3;
            zq_2.f(file);
        }
        try {
            zq_2.a(file2, file);
        }
        catch (Exception exception) {
            LoggerInvoker.warn(c, aL0.a(aL0.a(new StringBuilder(), avx_1.g), a6w_0.C(entityPlayer)).toString());
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    @Override
    public ku_1 a(a9K a9K2) {
        throw new RuntimeException(avx_1.z);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a() {
        try {
            File file = new File(this.e, avx_1.c);
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            Throwable throwable = null;
            try {
                HC.a(dataOutputStream, this.b);
                return;
            }
            catch (Throwable throwable3) {
                throwable = throwable3;
                throw throwable3;
            }
            finally {
                try {
                    HC.a(dataOutputStream);
                }
                catch (Throwable throwable2) {
                    aWR.a(throwable, throwable2);
                }
            }
        }
        catch (IOException iOException) {
            a4E.b(iOException);
            throw new RuntimeException(avx_1.e);
        }
    }
}

