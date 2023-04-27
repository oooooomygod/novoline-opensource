/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.reflect.TypeToken
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.common.reflect.TypeToken;
import java.lang.reflect.Field;
import net.GE;
import net.WB;
import net.a68;
import net.aL0;
import net.aVH;
import net.aXZ;
import net.ad__0;
import net.akc_2;
import net.ake_0;
import net.apo_1;
import net.asq_0;
import net.avx_0;
import net.azk_0;
import net.ki_0;
import net.oc_1;

public class aSS
implements akc_2 {
    protected Field a;
    protected TypeToken<?> c;
    protected String b;

    @Override
    public void b(Object object, ad__0 ad__02) throws a68 {
        a68.b();
        asq_0.a(aVH.c(ki_0.j(ad__02)), this.c);
        throw new a68(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), azk_0.f), avx_0.a(this.a)), azk_0.d), this.c).toString());
    }

    public aSS(Field field, String string) {
        this.a = field;
        this.b = string;
        this.c = ake_0.a(avx_0.d(field));
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(Object object, ad__0 ad__02) throws a68 {
        block8: {
            Object object2;
            Object object3;
            a68.b();
            try {
                object3 = avx_0.a(this.a, object);
                ki_0.a(ad__02, null);
                object2 = asq_0.a(aVH.c(ki_0.j(ad__02)), this.c);
                if (object2 == null) {
                    throw new a68(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), azk_0.e), avx_0.a(this.a)), azk_0.c), this.c).toString());
                }
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new a68(aL0.a(aL0.a(new StringBuilder(), azk_0.a), avx_0.a(this.a)).toString(), illegalAccessException);
            }
            {
                WB.a((GE)object2, this.c, object3, ad__02);
            }
            {
                if (!(ad__02 instanceof apo_1) || this.b == null || StringInvoker.g(this.b) || oc_1.a(aXZ.a((apo_1)(object2 = (apo_1)ad__02)))) break block8;
            }
            {
                aXZ.a((apo_1)object2, this.b);
            }
        }
        if (ListInvoker.b() == null) return;
        a68.b(new String[3]);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    protected void a(Object object, ad__0 ad__02, GE<?> gE) throws a68 {
        Object object2;
        a68.b();
        Object object3 = object2 = ki_0.p(ad__02) ? null : WB.a(gE, this.c, ad__02);
        if (object2 == null) {
            Object object4 = avx_0.a(this.a, object);
            this.a(object, ad__02);
        }
        try {
            avx_0.a(this.a, object, object2);
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new a68(aL0.a(aL0.a(new StringBuilder(), azk_0.b), avx_0.a(this.a)).toString(), illegalAccessException);
        }
    }
}

