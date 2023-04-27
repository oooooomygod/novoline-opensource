/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.resources;

import cc.novoline.invoke.MapInvoker;
import deobf.IMetadataSerializer;
import deobf.IResourcePack;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Set;
import net.IMetadataSection;
import net.K3;
import net.ResourceLocation;
import net.aL0;
import net.aM9;
import net.aiv_2;
import net.ara_2;
import net.auQ;
import net.axw_1;
import net.zq_2;


public class DefaultResourcePack
implements IResourcePack {
    private Map mapAssets;
    private static String a = "CL_00001073";
    public static Set defaultResourceDomains;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public IMetadataSection a(IMetadataSerializer iMetadataSerializer, String string) throws IOException {
        try {
            try {
                FileInputStream fileInputStream = new FileInputStream((File)MapInvoker.c(this.mapAssets, aM9.g));
                return auQ.a(iMetadataSerializer, fileInputStream, string);
            }
            catch (FileNotFoundException fileNotFoundException) {
                return null;
            }
        }
        catch (RuntimeException runtimeException) {
            return null;
        }
    }

    public DefaultResourcePack(Map map) {
        this.mapAssets = map;
    }

    @Override
    public BufferedImage a() throws IOException {
        return aiv_2.a(ara_2.b(DefaultResourcePack.class, aL0.a(aL0.a(new StringBuilder(), aM9.j), axw_1.b(new ResourceLocation(aM9.f))).toString()));
    }

    @Override
    public InputStream b(ResourceLocation resourceLocation) throws IOException {
        InputStream inputStream = this.a(resourceLocation);
        return inputStream;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public Set c() {
        return defaultResourceDomains;
    }

    @Override
    public String b() {
        return aM9.e;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "G\u007f@\u0019]\u0001/5\u0003(\u001a".toCharArray();
        int n2 = 0;
        int n3 = 5;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 1));
            n3 = n3;
        }
    }

    private InputStream a(ResourceLocation resourceLocation) {
        String string = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aM9.c), axw_1.a(resourceLocation)), aM9.b), axw_1.b(resourceLocation)).toString();
        InputStream inputStream = K3.a(string);
        return inputStream;
    }

    @Override
    public boolean a(ResourceLocation resourceLocation) {
        return this.a(resourceLocation) != null || MapInvoker.b(this.mapAssets, resourceLocation.toString());
    }

    public InputStream c(ResourceLocation resourceLocation) throws IOException, FileNotFoundException {
        File file = (File)MapInvoker.c(this.mapAssets, resourceLocation.toString());
        return zq_2.d(file) ? new FileInputStream(file) : null;
    }
}

