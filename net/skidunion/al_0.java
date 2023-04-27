/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function1
 *  org.jetbrains.annotations.NotNull
 */
package net.skidunion;

import cc.novoline.invoke.ListInvoker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import net.FO;
import net.HU;
import net.JN;
import net.OV;
import net.a31;
import net.aIA;
import net.aVU;
import net.aYB;
import net.aan_1;
import net.acU;
import net.ak0_0;
import net.akr_1;
import net.anp_0;
import net.ans_1;
import net.av9_0;
import net.awh_2;
import net.dz_0;
import net.lx_2;
import net.skidunion.H;
import net.skidunion.Q;
import net.skidunion.Z;
import net.skidunion.a2;
import net.skidunion.aD;
import net.skidunion.aP;
import net.skidunion.aR;
import net.skidunion.aa_0;
import net.skidunion.aj;
import net.skidunion.c_0;
import net.skidunion.u_0;
import net.skidunion.v_0;
import net.skidunion.w_0;
import net.skidunion.x_0;
import net.x6_0;
import net.yc_1;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.net.skidunion.al
 */
@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J)\u0010\f\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\t2\u0006\u0010\r\u001a\u0002H\u0007H\u0002\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J5\u0010\u0012\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\t0\u0013j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\t`\u0014\"\u0006\b\u0000\u0010\u0007\u0018\u00012\u0006\u0010\u0015\u001a\u00020\u0016H\u0082\bJ\u0015\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0010\u00a2\u0006\u0002\b\u001aJ\u0015\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u001cH\u0010\u00a2\u0006\u0002\b\u001dJ\u0015\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u001fH\u0010\u00a2\u0006\u0002\b J\u0010\u0010!\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\"H\u0016J4\u0010#\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0007\u0018\u00012\b\u0010$\u001a\u0004\u0018\u00010%2\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00060'\u00a2\u0006\u0002\b(H\u0082\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0002"}, d2={"Lnet/net.skidunion/al;", "Lnet/net.skidunion/Z;", "a", "Lnet/net.skidunion/aP;", "(Lnet/net.skidunion/aP;)V", "a", "", "T", "request", "Lnet/net.skidunion/c;", "error", "", "a", "data", "(Lnet/net.skidunion/c;Ljava/lang/Object;)V", "a", "ts", "", "a", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "packet", "Lnet/net.skidunion/aj;", "onConfigDownloaded", "event", "Lnet/net.skidunion/v;", "a", "onConfigInfoReceived", "Lnet/net.skidunion/w;", "a", "onConfigListReceived", "Lnet/net.skidunion/x;", "a", "a", "Lnet/net.skidunion/u;", "a", "instance", "", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;"})
public class al_0
extends Z {
    private aP a;

    /*
     * Enabled aggressive block sorting
     */
    private <T> void a(c_0<T> c_02, T t) {
        c_0.b();
        if (a31.e(c_02)) {
            Consumer consumer = a31.f(c_02);
            if (consumer != null) {
                aan_1.a(consumer, t);
                return;
            }
        }
        Q q = a31.b(c_02);
        if (q == null) {
            zx_2.c();
        }
        x6_0.a(q, t);
        av9_0.b(x6_0.a(a31.b(c_02)));
    }

    /*
     * Enabled aggressive block sorting
     */
    private <T> void a(c_0<T> c_02, Throwable throwable) {
        c_0.b();
        if (a31.e(c_02)) {
            Consumer consumer = a31.c(c_02);
            if (consumer != null) {
                aan_1.a(consumer, throwable);
                return;
            }
        }
        Q q = a31.b(c_02);
        if (q == null) {
            zx_2.c();
        }
        x6_0.a(q, throwable);
        av9_0.b(x6_0.a(a31.b(c_02)));
    }

    @Override
    public void a(@NotNull w_0 w_02) {
        Object object;
        c_0 c_02;
        c_0.b();
        zx_2.b(w_02, ak0_0.b);
        Object object2 = this;
        aj aj10 = aa_0.g;
        boolean bl = false;
        boolean bl2 = false;
        Object object3 = new ArrayList();
        Object object4 = yc_1.f(((al_0)object2).a);
        Iterator iterator = OV.a((Iterable)object4);
        if (dz_0.c(iterator) && a31.d(c_02 = (c_0)(object = dz_0.b(iterator))) != null && zx_2.a((Object)a31.d(c_02), aj10) && zx_2.a((Object)anp_0.b(a31.a(c_02)), aYB.a(aj10)) && c_02 instanceof c_0) {
            c_0 c_03 = c_02;
            akr_1.a((ArrayList)object3, c_03);
            HU.b(yc_1.f(((al_0)object2).a), c_02);
        }
        object2 = (Iterable)object3;
        boolean bl3 = false;
        Iterator iterator2 = OV.a((Iterable)object2);
        if (dz_0.c(iterator2)) {
            object4 = dz_0.b(iterator2);
            object3 = (c_0)object4;
            this.a((c_0)object3, (Object)ans_1.a(w_02));
        }
    }

    @Override
    public void a(@NotNull v_0 v_02) {
        Object object;
        c_0 c_02;
        c_0.k();
        zx_2.b(v_02, ak0_0.f);
        Object object2 = this;
        aj aj10 = aD.g;
        boolean bl = false;
        boolean bl2 = false;
        Object object3 = new ArrayList();
        Object object4 = yc_1.f(((al_0)object2).a);
        Iterator iterator = OV.a((Iterable)object4);
        if (dz_0.c(iterator) && a31.d(c_02 = (c_0)(object = dz_0.b(iterator))) != null && zx_2.a((Object)a31.d(c_02), aj10) && zx_2.a((Object)anp_0.b(a31.a(c_02)), aYB.a(aj10)) && c_02 instanceof c_0) {
            c_0 c_03 = c_02;
            akr_1.a((ArrayList)object3, c_03);
            HU.b(yc_1.f(((al_0)object2).a), c_02);
        }
        object2 = (Iterable)object3;
        boolean bl3 = false;
        Iterator iterator2 = OV.a((Iterable)object2);
        if (dz_0.c(iterator2)) {
            object4 = dz_0.b(iterator2);
            object3 = (c_0)object4;
            this.a((c_0)object3, (Object)awh_2.a(v_02));
        }
        if (ListInvoker.b() != null) {
            c_0.b(false);
        }
    }

    private static TypeCastException a(TypeCastException typeCastException) {
        return typeCastException;
    }

    private /* synthetic */ <T> void a(Object object, Function1<? super T, Unit> function1) {
        c_0.b();
        zx_2.a(3, ak0_0.g);
        if (object instanceof Object) {
            aIA.a(function1, object);
        }
    }

    @Override
    public void a(@NotNull x_0 x_02) {
        zx_2.b(x_02, ak0_0.e);
        Object object = this;
        c_0.k();
        aj aj10 = aR.g;
        boolean bl = false;
        boolean bl2 = false;
        Object object2 = new ArrayList();
        Object object3 = yc_1.f(((al_0)object).a);
        Iterator iterator = OV.a((Iterable)object3);
        if (dz_0.c(iterator)) {
            Object object4 = dz_0.b(iterator);
            c_0 c_02 = (c_0)object4;
            if (a31.d(c_02) != null && zx_2.a((Object)a31.d(c_02), aj10) && zx_2.a((Object)anp_0.b(a31.a(c_02)), aYB.a(aj10)) && c_02 instanceof c_0) {
                c_0 c_03 = c_02;
                akr_1.a((ArrayList)object2, c_03);
                HU.b(yc_1.f(((al_0)object).a), c_02);
            }
            ListInvoker.b(new ListInvoker[2]);
        }
        object = (Iterable)object2;
        boolean bl3 = false;
        Iterator iterator2 = OV.a((Iterable)object);
        if (dz_0.c(iterator2)) {
            object3 = dz_0.b(iterator2);
            object2 = (c_0)object3;
            this.a((c_0)object2, (Object)FO.a(x_02));
        }
    }

    @Override
    public void a(@NotNull u_0 u_02) {
        block3: {
            c_0.k();
            zx_2.b(u_02, ak0_0.a);
            Long l4 = JN.a(a2.g);
            if (l4 == null) break block3;
            Long l5 = l4;
            long l6 = acU.c(l5);
            c_0<?> c_02 = this.a(l6);
            if (c_02 != null) {
                c_0<?> c_03;
                c_0<?> c_04 = c_03 = c_02;
                if (aVU.a(u_02)) {
                    this.a((c_0<T>)c_04, new H(aVU.b(u_02)));
                }
                c_0<?> c_05 = c_04;
                if (c_05 == null) {
                    throw new TypeCastException(ak0_0.d);
                }
                this.a((c_0)c_05, (Object)null);
                aVU.a(u_02, true);
            }
        }
    }

    public static /* synthetic */ void a(al_0 al_02, Object object, Function1 function1) {
        al_02.a(object, function1);
    }

    public al_0(@NotNull aP aP10) {
        zx_2.b((Object)aP10, ak0_0.c);
        this.a = aP10;
    }

    private /* synthetic */ <T> ArrayList<c_0<T>> a(aj aj10) {
        Object object;
        c_0 c_02;
        c_0.k();
        boolean bl = false;
        ArrayList<c_0<T>> arrayList = new ArrayList<c_0<T>>();
        Iterable iterable = yc_1.f(this.a);
        Iterator iterator = OV.a(iterable);
        if (dz_0.c(iterator) && a31.d(c_02 = (c_0)(object = dz_0.b(iterator))) != null && zx_2.a((Object)a31.d(c_02), aj10) && zx_2.a((Object)anp_0.b(a31.a(c_02)), aYB.a(aj10)) && c_02 instanceof c_0) {
            c_0 c_03 = c_02;
            akr_1.a(arrayList, c_03);
            HU.b(yc_1.f(this.a), c_02);
        }
        return arrayList;
    }

    private c_0<?> a(long l4) {
        c_0.b();
        Iterable iterable = yc_1.f(this.a);
        Iterator iterator = OV.a(iterable);
        if (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            c_0 c_02 = (c_0)object;
            Long l5 = anp_0.b(a31.a(c_02));
            if (l5 != null && lx_2.a(l5) == l4) {
                HU.b(yc_1.f(this.a), c_02);
                return c_02;
            }
        }
        return null;
    }
}

