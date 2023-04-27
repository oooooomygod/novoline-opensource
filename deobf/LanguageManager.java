/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package deobf;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.StringInvoker;

import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import net.AY;
import net.IResourceManagerReloadListener;
import net.KA;
import net.YD;
import net.a5C;
import net.aDC;
import net.aI_;
import net.aL0;
import net.aZ6;
import net.aag_2;
import net.ady_1;
import net.aeb_0;
import net.akr_1;
import net.aoj_1;
import net.avv_0;
import net.axe_2;
import net.ay8;
import net.azn_2;
import net.dk_2;
import net.dz_0;
import net.ms_0;
import net.my_0;
import net.nk_0;
import net.pr_0;
import net.skidunion.R;
import net.zd_1;
import org.apache.logging.log4j.Logger;
import net.skidunion.Protection;

public class LanguageManager
implements IResourceManagerReloadListener {
    private String e;
    private IMetadataSerializer a;
    private static Logger b = LogManagerInvoker.c();
    private Map<String, aeb_0> d = MapsInvoker.a();
    protected static ady_1 c = new ady_1();

    public void a(List<IResourcePack> list) {
        MapInvoker.d(this.d);
        Iterator iterator = ListInvoker.iterator(list);
        while (dz_0.c(iterator)) {
            IResourcePack iResourcePack = (IResourcePack)dz_0.b(iterator);
            try {
                aoj_1 aoj_12 = (aoj_1)avv_0.a(iResourcePack, this.a, YD.f);
                Iterator iterator2 = ms_0.a(ay8.a(aoj_12));
                while (dz_0.c(iterator2)) {
                    aeb_0 aeb_02 = (aeb_0)dz_0.b(iterator2);
                    if (MapInvoker.b(this.d, AY.a(aeb_02))) continue;
                    MapInvoker.c(this.d, AY.a(aeb_02), aeb_02);
                }
            }
            catch (IOException | RuntimeException exception) {
                LoggerInvoker.b(b, aL0.a(aL0.a(new StringBuilder(), YD.k), avv_0.b(iResourcePack)).toString(), exception);
            }
        }
    }

    @Override
    public void b(aI_ aI_2) {
        ArrayList arrayList = my_0.a(new String[]{YD.i});
        if (!this.e.equals(YD.c)) {
            ListInvoker.add(arrayList, this.e);
        }
        KA.a(c, aI_2, arrayList);
        zd_1.a(LanguageManager.c.b);
    }

    public aeb_0 b() {
        return MapInvoker.b(this.d, this.e) ? (aeb_0)MapInvoker.c(this.d, this.e) : (aeb_0)MapInvoker.c(this.d, YD.l);
    }

    /*
     * Loose catch block
     */
    public void a(Protection protection, JarFile jarFile, PublicKey publicKey) throws IOException, NoSuchProviderException, CertificateException, NoSuchAlgorithmException, InvalidKeyException {
        Object object;
        Object object2;
        ArrayList arrayList = new ArrayList();
        byte[] byArray = new byte[8192];
        Enumeration enumeration = dk_2.a(jarFile);
        while (azn_2.b(enumeration)) {
            object2 = (JarEntry)azn_2.a(enumeration);
            if (a5C.b((JarEntry)object2).equals(YD.j) || a5C.c((JarEntry)object2)) continue;
            akr_1.a(arrayList, object2);
            object = dk_2.a(jarFile, (ZipEntry)object2);
            while (true) {
                int n = aZ6.a((InputStream)object, byArray, 0, byArray.length);
                if (n != -1) continue;
                break;
            }
            aZ6.b((InputStream)object);
            continue;
            catch (SecurityException securityException) {
                aDC.a(securityException);
                throw new R(YD.b);
            }
        }
        object2 = akr_1.a(arrayList);
        while (dz_0.c((Iterator)object2)) {
            object = (JarEntry)dz_0.b((Iterator)object2);
            Certificate[] certificateArray = a5C.a((JarEntry)object);
            if (certificateArray.length == 0) {
                if (StringInvoker.e(a5C.b((JarEntry)object), YD.a) || StringInvoker.e(a5C.b((JarEntry)object), YD.m) || StringInvoker.e(a5C.b((JarEntry)object), YD.e)) continue;
                throw new R(YD.h);
            }
            for (Certificate certificate : certificateArray) {
                if (StringInvoker.e(a5C.b((JarEntry)object), YD.g)) {
                    aag_2.d(protection);
                    continue;
                }
                try {
                    pr_0.a(certificate, publicKey);
                }
                catch (SignatureException signatureException) {
                    nk_0.a(signatureException);
                    throw new R(YD.d);
                }
            }
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    public boolean a() {
        return this.b() != null && AY.b(this.b());
    }

    public LanguageManager(IMetadataSerializer iMetadataSerializer, String string) {
        this.a = iMetadataSerializer;
        this.e = string;
        net.R.a(c);
    }

    public boolean d() {
        return KA.a(c);
    }

    public SortedSet<aeb_0> c() {
        return axe_2.a(this.d.values());
    }

    public void a(aeb_0 aeb_02) {
        this.e = AY.a(aeb_02);
    }
}

