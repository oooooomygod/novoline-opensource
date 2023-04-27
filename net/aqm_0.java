/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import deobf.MCInvoker;
import java.io.File;
import net.aXR;
import net.ahz_2;
import net.kr_1;
import net.rj_0;
import net.zq_2;

/*
 * Renamed from net.aQm
 */
public class aqm_0 {
    public static void a(rj_0 rj_02, String string, String string2) {
        File[] fileArray;
        int n;
        int n2;
        kr_1.a();
        if (!(MCInvoker.f().currentScreen instanceof rj_0)) {
            return;
        }
        File[] fileArray2 = zq_2.h(new File(string));
        if (fileArray2 != null && (fileArray2.length <= 100 || string.equals(ahz_2.a)) && (n2 = 0) < (n = (fileArray = fileArray2).length)) {
            File file = fileArray[n2];
            if (zq_2.r(file)) {
                aqm_0.a(rj_02, zq_2.j(file), string2);
            }
            if (StringInvoker.c(zq_2.j(file), string2)) {
                aXR.a(rj_02, zq_2.j(file));
            }
            ++n2;
        }
    }
}

