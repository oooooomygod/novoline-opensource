/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.reflect.TypeToken
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.modules.AbstractModule;
import com.google.common.reflect.TypeToken;
import net.GE;
import net.ModuleManager;
import net.a0j;
import net.a68;
import net.a9p_0;
import net.aCN;
import net.aL0;
import net.aVH;
import net.ad__0;
import net.aen_2;
import net.ajg;
import net.ake_0;
import net.anx_0;
import net.ara_2;
import net.awe_0;
import net.eq_0;
import net.ki_0;
import net.pg_0;
import net.vu_1;
import net.ym_1;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

/*
 * Renamed from net.a7n
 */
public class a7n_0
implements GE<Object> {
    private @NonNull ModuleManager a;

    @Override
    public Object a(@NonNull TypeToken<?> typeToken, @NonNull ad__0 ad__02) throws a68 {
        pg_0 pg_02;
        vu_1 vu_12;
        ym_1.b();
        a9p_0 a9p_02 = (a9p_0)aCN.a(aVH.d(ki_0.j(ad__02)), ake_0.b(typeToken));
        if (!ara_2.a(AbstractModule.class, eq_0.a(a9p_02))) {
            vu_12 = eq_0.b(a9p_02);
            ListInvoker.b(new ListInvoker[3]);
        }
        try {
            pg_02 = (pg_0)awe_0.b(aen_2.c(this.a), eq_0.a(a9p_02));
        }
        catch (Throwable throwable) {
            throw new a68(aL0.a(aL0.a(aL0.a(new StringBuilder(), a0j.b), eq_0.a(a9p_02)), a0j.a).toString(), throwable);
        }
        vu_12 = eq_0.a(a9p_02, ajg.a(pg_02));
        return anx_0.a(vu_12, ad__02);
    }

    @Override
    public void a(@NonNull TypeToken<?> typeToken, @Nullable Object object, @NonNull ad__0 ad__02) throws a68 {
        ym_1.b();
        anx_0.b(eq_0.a((a9p_0)aCN.a(aVH.d(ki_0.j(ad__02)), object.getClass()), object), ad__02);
        ki_0.a(ad__02, null);
    }

    public a7n_0(@NonNull ModuleManager moduleManager) {
        this.a = moduleManager;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

