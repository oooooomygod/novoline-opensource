/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.invoke.LoggerInvoker;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import net.aAY;
import net.ah6_0;
import net.aqb_2;
import net.aro_1;
import net.ayb_0;
import net.c_0;
import net.pu_0;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.z
 */
public class z_0 {
    private ah6_0 c = new ah6_0();
    private aqb_2 a = new aqb_2();
    private static z_0 d;
    private ayb_0 b;

    public void a(@NonNull ayb_0 ayb_02) {
        if (this.b == ayb_02) {
            return;
        }
        switch (pu_0.a[ayb_02.ordinal()]) {
            case 1: {
                aro_1.b(this.a);
                break;
            }
            case 2: {
                aro_1.a(this.a);
            }
        }
        this.b = c_0.a(this.c, ayb_02);
    }

    private z_0(@NonNull ayb_0 ayb_02) throws Throwable {
        this.a(ayb_02);
    }

    private static NoSuchAlgorithmException a(NoSuchAlgorithmException noSuchAlgorithmException) {
        return noSuchAlgorithmException;
    }

    public static z_0 b() {
        return z_0.b(ayb_0.MOJANG);
    }

    public @NonNull ayb_0 c() {
        return this.b;
    }

    private static z_0 b(@NonNull ayb_0 ayb_02) {
        if (d == null) {
            try {
                try {
                    d = new z_0(ayb_02);
                }
                catch (KeyManagementException | NoSuchAlgorithmException generalSecurityException) {
                    LoggerInvoker.b(aqb_2.d, generalSecurityException);
                }
            }
            catch (Throwable throwable) {
                LoggerInvoker.b(aqb_2.d, aAY.a, throwable);
            }
        } else if (d.c() != ayb_02) {
            d.a(ayb_02);
        }
        return d;
    }

    public static z_0 a() {
        return z_0.b(ayb_0.THEALTENING);
    }
}

