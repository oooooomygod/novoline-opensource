/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.reflect.TypeToken
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  org.apache.logging.log4j.Logger
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.modules.AbstractModule;
import com.google.common.reflect.TypeToken;
import deobf.ModuleHolder;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import net.FG;
import net.GE;
import net.ModuleArrayMap;
import net.ModuleManager;
import net.a1c;
import net.a4w_0;
import net.a68;
import net.aL0;
import net.aS0;
import net.aS1;
import net.ad__0;
import net.aen_2;
import net.akk_0;
import net.asl_0;
import net.ayu_1;
import net.bv_0;
import net.dz_0;
import net.ki_0;
import net.pq_1;
import net.ym_1;
import org.apache.logging.log4j.Logger;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

/*
 * Renamed from net.awX
 */
public class awx_1
implements GE<ModuleArrayMap> {
    private @NonNull Logger b;
    private @NonNull ModuleManager a;
    private static String d;
    private static long c;

    @Override
    public void a(@NonNull TypeToken<?> typeToken, @Nullable ModuleArrayMap moduleArrayMap, @NonNull ad__0 ad__02) throws a68 {
        ym_1.b();
        if (moduleArrayMap == null) {
            ki_0.a(ad__02, null);
            return;
        }
        ObjectIterator objectIterator = bv_0.a(moduleArrayMap.object2ObjectEntrySet());
        if (dz_0.c((Iterator)objectIterator)) {
            Object2ObjectMap.Entry entry = (Object2ObjectMap.Entry)dz_0.b((Iterator)objectIterator);
            String string = (String)pq_1.a(entry);
            ModuleHolder moduleHolder = (ModuleHolder)pq_1.b(entry);
            if (moduleHolder != null) {
                TypeToken typeToken2 = akk_0.a((ModuleHolder)pq_1.b(entry));
                AbstractModule abstractModule = akk_0.b((ModuleHolder)pq_1.b(entry));
                ki_0.a(ki_0.a(ad__02, new Object[]{string}), typeToken2, abstractModule);
            }
        }
    }

    public awx_1(@NonNull int n, char c, short s, ModuleManager moduleManager) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)s << 48 >>> 48) ^ awx_1.c;
        this.b = LogManagerInvoker.c();
        asl_0.a(moduleManager, d);
        this.a = moduleManager;
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    static {
        c = a1c.a(-3914521048395595691L, 8020021067485691802L, MethodHandles.lookup().lookupClass()).a(167096034484113L);
        long l4 = c ^ 0x748B2207443AL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        int n = 2;
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l4 >>> 56);
        int n2 = 1;
        while (true) {
            byArray2 = byArray2;
            byArray2[n2] = (byte)(l4 << n2 * 8 >>> 56);
            ++n2;
        }
    }

    @Override
    public @NonNull ModuleArrayMap a(@NonNull TypeToken<?> typeToken, @NonNull ad__0 ad__02) {
        ym_1.b();
        ModuleArrayMap moduleArrayMap = aen_2.c(this.a);
        ModuleArrayMap moduleArrayMap2 = new ModuleArrayMap();
        Iterator iterator = aS0.f(MapInvoker.b(ki_0.g(ad__02)));
        if (dz_0.c(iterator)) {
            ModuleHolder moduleHolder;
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            String string = FG.b(entry).toString();
            ad__0 ad__03 = (ad__0)FG.a(entry);
            if (ki_0.m(ad__03) != aS1.NULL && (moduleHolder = (ModuleHolder)moduleArrayMap.get(string)) != null) {
                AbstractModule abstractModule = null;
                a68 a682 = null;
                try {
                    abstractModule = (AbstractModule)ki_0.a(ad__03, akk_0.a(moduleHolder));
                }
                catch (a68 a683) {
                    a682 = a683;
                }
                if (abstractModule == null) {
                    String string2 = aL0.a(aL0.a(aL0.a(new StringBuilder(), ayu_1.a), string), ayu_1.b).toString();
                    LoggerInvoker.b(this.b, string2, a682);
                    LoggerInvoker.warn(this.b, string2);
                }
                moduleArrayMap2.put(string, a4w_0.a(string, abstractModule));
            }
        }
        if (ListInvoker.b() != null) {
            ym_1.b("FHfyqb");
        }
        return moduleArrayMap2;
    }

    private static a68 a(a68 a682) {
        return a682;
    }
}

