/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 */
package net;

import cc.novoline.invoke.IOUtilsInvoker;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import deobf.IMetadataSerializer;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import net.AbstractTexture;
import net.T7;
import net.V6;
import net.WN;
import net.YM;
import net.a0D;
import net.a1r;
import net.a3C;
import net.a3K;
import net.a3Y;
import net.a3c_0;
import net.a3s;
import net.a3w_0;
import net.aI_;
import net.aL0;
import net.abh_0;
import net.agi_0;
import net.aiv_2;
import net.amp_1;
import net.aoj_1;
import net.aqd_0;
import net.ara_2;
import net.avm_0;
import net.bc_0;

public class JR
extends AbstractTexture {
    private static IMetadataSerializer i = JR.a();
    private String h;

    private static IMetadataSerializer a() {
        IMetadataSerializer iMetadataSerializer = new IMetadataSerializer();
        YM.a(iMetadataSerializer, new a3K(), avm_0.class);
        YM.a(iMetadataSerializer, new a3w_0(), T7.class);
        YM.a(iMetadataSerializer, new a3C(), bc_0.class);
        YM.a(iMetadataSerializer, new a3Y(), aqd_0.class);
        YM.a(iMetadataSerializer, new a3s(), aoj_1.class);
        return iMetadataSerializer;
    }

    /*
     * Loose catch block
     */
    private avm_0 b() {
        avm_0 avm_02;
        BufferedReader bufferedReader;
        InputStream inputStream;
        String string;
        block7: {
            string = aL0.a(aL0.a(new StringBuilder(), this.h), agi_0.f).toString();
            a0D.k();
            String string2 = agi_0.e;
            inputStream = a3c_0.c(string);
            IMetadataSerializer iMetadataSerializer = i;
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            JsonObject jsonObject = WN.c(a1r.a(new JsonParser(), bufferedReader));
            avm_02 = (avm_0)YM.a(iMetadataSerializer, string2, jsonObject);
            if (avm_02 != null) break block7;
            avm_0 avm_03 = new avm_0(false, false, new ArrayList<Integer>());
            IOUtilsInvoker.b(bufferedReader);
            IOUtilsInvoker.closeQuietly(inputStream);
            return avm_03;
        }
        avm_0 avm_04 = avm_02;
        IOUtilsInvoker.b(bufferedReader);
        IOUtilsInvoker.closeQuietly(inputStream);
        return avm_04;
        {
            catch (RuntimeException runtimeException) {
                try {
                    V6.b(aL0.a(aL0.a(new StringBuilder(), agi_0.d), string).toString());
                    V6.b(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), agi_0.b), ara_2.b(runtimeException.getClass())), agi_0.a), abh_0.a(runtimeException)).toString());
                    avm_02 = new avm_0(false, false, new ArrayList<Integer>());
                    return avm_02;
                }
                catch (Throwable throwable) {
                    throw throwable;
                }
                finally {
                    IOUtilsInvoker.b(bufferedReader);
                    IOUtilsInvoker.closeQuietly(inputStream);
                }
            }
        }
    }

    public JR(String string) {
        this.h = string;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void a(aI_ aI_2) throws IOException {
        a0D.k();
        this.b();
        InputStream inputStream = a3c_0.c(this.h);
        if (inputStream == null) {
            throw new FileNotFoundException(aL0.a(aL0.a(new StringBuilder(), agi_0.c), this.h).toString());
        }
        try {
            BufferedImage bufferedImage = aiv_2.a(inputStream);
            avm_0 avm_02 = this.b();
            aiv_2.a(this.a(), bufferedImage, amp_1.b(avm_02), amp_1.c(avm_02));
            return;
        }
        finally {
            IOUtilsInvoker.closeQuietly(inputStream);
        }
    }
}

