/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.reflect.TypeToken
 */
package net;

import com.google.common.reflect.TypeToken;
import deobf.TypeSerializerCollection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;
import net.GE;
import net.abo_0;
import net.adk_1;
import net.ara_2;
import net.dz_0;
import net.wl_2;

/*
 * Renamed from net.wQ
 */
class wq_1
extends CopyOnWriteArrayList<adk_1>
implements Function<TypeToken<?>, GE<?>> {
    public GE<?> a(TypeToken<?> typeToken) {
        block4: {
            TypeSerializerCollection.b();
            Iterator iterator = this.iterator();
            if (dz_0.c(iterator)) {
                adk_1 adk_12 = (adk_1)dz_0.b(iterator);
                try {
                    if (!wl_2.a(adk_1.a(adk_12), typeToken)) break block4;
                }
                catch (Exception exception) {
                    throw new RuntimeException(ara_2.k(adk_1.b(adk_12).getClass()), exception);
                }
                return adk_1.b(adk_12);
            }
        }
        return null;
    }

    private wq_1() {
    }

    wq_1(abo_0 abo_02) {
        this();
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

