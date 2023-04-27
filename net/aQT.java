/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.ServerInvoker;
import deobf.*;
import deobf.Chunk;
import net.minecraft.crash.CrashReportCategory;
import deobf.Entity;
import deobf.Packet;
import net.minecraft.util.ReportedException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.Logger;

public class aQT {
    private Set<ae_2> d = axe_2.a();
    private int a;
    private IntHashMap<ae_2> b = new IntHashMap();
    private static Logger c = LogManagerInvoker.c();
    private WorldServer e;

    public void a(EntityPlayerMP entityPlayerMP, Chunk chunk) {
        Iterator iterator = aS0.f(this.d);
        while (dz_0.c(iterator)) {
            ae_2 ae_22 = (ae_2)dz_0.b(iterator);
            if (ae_22.i == entityPlayerMP || ae_22.i.V != chunk.f || ae_22.i.s != chunk.v) continue;
            aqe_0.a(ae_22, entityPlayerMP);
        }
    }

    public void a(EntityPlayerMP entityPlayerMP) {
        Iterator iterator = aS0.f(this.d);
        while (dz_0.c(iterator)) {
            ae_2 ae_22 = (ae_2)dz_0.b(iterator);
            if (ae_22.i == entityPlayerMP) {
                aqe_0.a(ae_22, a3V.t(this.e));
                continue;
            }
            aqe_0.a(ae_22, entityPlayerMP);
        }
    }

    public void a(Entity entity) {
        if (entity instanceof EntityPlayerMP) {
            this.a(entity, 512, 2);
            EntityPlayerMP entityPlayerMP = (EntityPlayerMP)entity;
            Iterator iterator = aS0.f(this.d);
            while (dz_0.c(iterator)) {
                ae_2 ae_22 = (ae_2)dz_0.b(iterator);
                if (ae_22.i == entityPlayerMP) continue;
                aqe_0.a(ae_22, entityPlayerMP);
            }
        } else if (entity instanceof oo_1) {
            this.a(entity, 64, 5, true);
        } else if (entity instanceof EntityArrow) {
            this.a(entity, 64, 20, false);
        } else if (entity instanceof oG) {
            this.a(entity, 64, 10, false);
        } else if (entity instanceof oa_1) {
            this.a(entity, 64, 10, false);
        } else if (entity instanceof oq_2) {
            this.a(entity, 64, 10, true);
        } else if (entity instanceof of_1) {
            this.a(entity, 64, 10, true);
        } else if (entity instanceof o7_0) {
            this.a(entity, 64, 4, true);
        } else if (entity instanceof op_1) {
            this.a(entity, 64, 10, true);
        } else if (entity instanceof of_2) {
            this.a(entity, 64, 10, true);
        } else if (entity instanceof oz_1) {
            this.a(entity, 64, 10, true);
        } else if (entity instanceof oi_1) {
            this.a(entity, 64, 10, true);
        } else if (entity instanceof og_0) {
            this.a(entity, 64, 20, true);
        } else if (entity instanceof EntityMinecart) {
            this.a(entity, 80, 3, true);
        } else if (entity instanceof EntityBoat) {
            this.a(entity, 80, 3, true);
        } else if (entity instanceof nJ) {
            this.a(entity, 64, 3, true);
        } else if (entity instanceof nz_1) {
            this.a(entity, 80, 3, false);
        } else if (entity instanceof n1_0) {
            this.a(entity, 80, 3, false);
        } else if (entity instanceof ns_2) {
            this.a(entity, 160, 3, true);
        } else if (entity instanceof UH) {
            this.a(entity, 80, 3, true);
        } else if (entity instanceof od_1) {
            this.a(entity, 160, 10, true);
        } else if (entity instanceof oq_1) {
            this.a(entity, 160, 20, true);
        } else if (entity instanceof nc_2) {
            this.a(entity, 160, Integer.MAX_VALUE, false);
        } else if (entity instanceof ol_2) {
            this.a(entity, 160, 3, true);
        } else if (entity instanceof oa_2) {
            this.a(entity, 160, 20, true);
        } else if (entity instanceof ox_2) {
            this.a(entity, 256, Integer.MAX_VALUE, false);
        }
    }

    public void b(EntityPlayerMP entityPlayerMP) {
        Iterator iterator = aS0.f(this.d);
        while (dz_0.c(iterator)) {
            ae_2 ae_22 = (ae_2)dz_0.b(iterator);
            aqe_0.c(ae_22, entityPlayerMP);
        }
    }

    private static String lambda$addEntityToTracker$0(int n) throws Exception {
        String string = aL0.a(aL0.c(aL0.a(new StringBuilder(), aRA.h), n), aRA.l).toString();
        if (n == Integer.MAX_VALUE) {
            string = aL0.a(aL0.a(aL0.a(new StringBuilder(), aRA.g), string), aRA.j).toString();
        }
        return string;
    }

    public void a(Entity entity, int n, int n2) {
        this.a(entity, n, n2, false);
    }

    public aQT(WorldServer worldServer) {
        this.e = worldServer;
        this.a = aek_1.k(ServerInvoker.R(a3V.m(worldServer)));
    }

    public void a(Entity entity, int n, int n2, boolean bl) {
        if (n > this.a) {
            n = this.a;
        }
        try {
            if (a8a_0.a(this.b, ayj_0.B(entity))) {
                throw new IllegalStateException(aRA.c);
            }
            ae_2 ae_22 = new ae_2(entity, n, n2, bl);
            aS0.b(this.d, ae_22);
            a8a_0.a(this.b, ayj_0.B(entity), ae_22);
            aqe_0.a(ae_22, a3V.t(this.e));
        }
        catch (Throwable throwable) {
            CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, aRA.a);
            CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, aRA.e);
            CrashReportCategoryInvoker.addCrashSection(crashReportCategory, aRA.f, aL0.a(aL0.c(new StringBuilder(), n), aRA.k).toString());
            CrashReportCategoryInvoker.a(crashReportCategory, aRA.b, () -> aQT.lambda$addEntityToTracker$0(n2));
            ayj_0.a(entity, crashReportCategory);
            CrashReportCategory crashReportCategory2 = CrashInvoker.a(crashReport, aRA.d);
            ayj_0.a(((ae_2)a8a_0.c(this.b, (int)ayj_0.B((Entity)entity))).i, crashReportCategory2);
            try {
                throw new ReportedException(crashReport);
            }
            catch (ReportedException reportedException) {
                LoggerInvoker.a(c, aRA.i, reportedException);
            }
        }
    }

    public void a() {
        Object object;
        ArrayList arrayList = my_0.c();
        Iterator iterator = aS0.f(this.d);
        while (dz_0.c(iterator)) {
            object = (ae_2)dz_0.b(iterator);
            aqe_0.b((ae_2)object, a3V.t(this.e));
            if (!((ae_2)object).k || !(((ae_2)object).i instanceof EntityPlayerMP)) continue;
            ListInvoker.add(arrayList, (EntityPlayerMP)((ae_2)object).i);
        }
        iterator = ListInvoker.iterator(arrayList);
        while (dz_0.c(iterator)) {
            object = (EntityPlayerMP)dz_0.b(iterator);
            Iterator iterator2 = aS0.f(this.d);
            while (dz_0.c(iterator2)) {
                ae_2 ae_22 = (ae_2)dz_0.b(iterator2);
                if (ae_22.i == object) continue;
                aqe_0.a(ae_22, (EntityPlayerMP)object);
            }
        }
    }

    public void b(Entity entity, Packet<?> packet) {
        ae_2 ae_22 = (ae_2)a8a_0.c(this.b, ayj_0.B(entity));
        aqe_0.b(ae_22, packet);
    }

    public void b(Entity entity) {
        Object object;
        if (entity instanceof EntityPlayerMP) {
            object = (EntityPlayerMP)entity;
            Iterator iterator = aS0.f(this.d);
            while (dz_0.c(iterator)) {
                ae_2 ae_22 = (ae_2)dz_0.b(iterator);
                aqe_0.b(ae_22, (EntityPlayerMP)object);
            }
        }
        object = (ae_2)a8a_0.b(this.b, ayj_0.B(entity));
        aS0.a(this.d, object);
        aqe_0.a((ae_2)object);
    }

    public void a(Entity entity, Packet<INetHandlerPlayClient> packet) {
        ae_2 ae_22 = (ae_2)a8a_0.c(this.b, ayj_0.B(entity));
        aqe_0.a(ae_22, packet);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

