/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonParser
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.IOUtilsInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.common.base.Charsets;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import deobf.IMetadataSerializer;
import deobf.IResourcePack;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import net.IMetadataSection;
import net.ResourceLocation;
import net.WN;
import net.YM;
import net.a1r;
import net.ah1_0;
import net.aiv_2;
import net.ame_0;
import net.apg_0;
import net.axw_1;
import net.zq_2;
import org.apache.logging.log4j.Logger;


public abstract class auQ
implements IResourcePack {
    public File b;
    private static Logger a = LogManagerInvoker.c();

    public IMetadataSection a(IMetadataSerializer iMetadataSerializer, String string) throws IOException {
        return auQ.a(iMetadataSerializer, this.c(apg_0.a), string);
    }

    @Override
    public String b() {
        return zq_2.q(this.b);
    }

    /*
     * Loose catch block
     */
    static IMetadataSection a(IMetadataSerializer iMetadataSerializer, InputStream inputStream, String string) {
        BufferedReader bufferedReader = null;
        bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8));
        JsonObject jsonObject = WN.c(a1r.a(new JsonParser(), bufferedReader));
        IOUtilsInvoker.b(bufferedReader);
        return YM.a(iMetadataSerializer, string, jsonObject);
        {
            catch (RuntimeException runtimeException) {
                try {
                    throw new JsonParseException((Throwable)runtimeException);
                }
                catch (Throwable throwable) {
                    IOUtilsInvoker.b(bufferedReader);
                    throw throwable;
                }
            }
        }
    }

    protected void b(String string) {
        LoggerInvoker.b(a, apg_0.d, new Object[]{string, this.b});
    }

    public auQ(File file) {
        this.b = file;
    }

    @Override
    public boolean a(ResourceLocation resourceLocation) {
        return this.a(auQ.a(resourceLocation));
    }

    protected abstract boolean a(String var1);

    @Override
    public BufferedImage a() throws IOException {
        return ah1_0.a(aiv_2.a(this.c(apg_0.c)));
    }

    private static String a(ResourceLocation resourceLocation) {
        return StringInvoker.a(apg_0.e, new Object[]{apg_0.b, axw_1.a(resourceLocation), axw_1.b(resourceLocation)});
    }

    protected static String a(File file, File file2) {
        return ame_0.d(ame_0.a(zq_2.l(file), zq_2.l(file2)));
    }

    protected abstract InputStream c(String var1) throws IOException;

    @Override
    public InputStream b(ResourceLocation resourceLocation) throws IOException {
        return this.c(auQ.a(resourceLocation));
    }
}

