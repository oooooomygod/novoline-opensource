/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.EntityPlayerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.Entity;
import deobf.EntityPlayer;
import deobf.NBTBase;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.block.BlockPos;
import net.ChatComponentText;

/*
 * Renamed from net.cp
 */
public class cp_2
extends am_0 {
    private static long b = a1c.a(5062362138607242658L, -224912503674547155L, MethodHandles.lookup().lookupClass()).a(191874705843686L);

    @Override
    public String b(ICommandSender iCommandSender) {
        return X_.cZ;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        long l5 = l4 << 16 | (long)s << 48 >>> 48;
        long l6 = l5 ^ 0xC9BD399A1ABL;
        int n = (int)(l6 >>> 32);
        int n2 = (int)(l6 << 32 >>> 48);
        int n3 = (int)(l6 << 48 >>> 48);
        if (!this.a(n, n2, (short)n3, iCommandSender, stringArray)) {
            if (stringArray.length < 1) {
                throw new ip_2(X_.cR, new Object[0]);
            }
            if (StringInvoker.d(stringArray[0], X_.aE)) {
                if (stringArray.length == 1) {
                    throw new ip_2(X_.bL, new Object[0]);
                }
                if (StringInvoker.d(stringArray[1], X_.s)) {
                    this.a(iCommandSender);
                } else if (StringInvoker.d(stringArray[1], X_.a_)) {
                    if (stringArray.length < 4) {
                        throw new ip_2(X_.cb, new Object[0]);
                    }
                    this.i(iCommandSender, stringArray, 2);
                } else if (StringInvoker.d(stringArray[1], X_.cG)) {
                    if (stringArray.length != 3) {
                        throw new ip_2(X_.cI, new Object[0]);
                    }
                    this.a(iCommandSender, stringArray[2]);
                } else {
                    if (!StringInvoker.d(stringArray[1], X_.cr)) {
                        throw new ip_2(X_.bC, new Object[0]);
                    }
                    if (stringArray.length != 3 && stringArray.length != 4) {
                        throw new ip_2(X_.b6, new Object[0]);
                    }
                    this.c(iCommandSender, stringArray, 2);
                }
            } else if (StringInvoker.d(stringArray[0], X_.r)) {
                if (stringArray.length == 1) {
                    throw new ip_2(X_.N, new Object[0]);
                }
                if (StringInvoker.d(stringArray[1], X_.b0)) {
                    if (stringArray.length > 3) {
                        throw new ip_2(X_.a1, new Object[0]);
                    }
                    this.o(iCommandSender, stringArray, 2);
                } else if (StringInvoker.d(stringArray[1], X_.ct)) {
                    if (stringArray.length < 5) {
                        throw new ip_2(X_.cM, new Object[0]);
                    }
                    this.d(iCommandSender, stringArray, 2);
                } else if (StringInvoker.d(stringArray[1], X_.bN)) {
                    if (stringArray.length < 5) {
                        throw new ip_2(X_.ao, new Object[0]);
                    }
                    this.d(iCommandSender, stringArray, 2);
                } else if (StringInvoker.d(stringArray[1], X_.aA)) {
                    if (stringArray.length < 5) {
                        throw new ip_2(X_.cz, new Object[0]);
                    }
                    this.d(iCommandSender, stringArray, 2);
                } else if (StringInvoker.d(stringArray[1], X_.bz)) {
                    if (stringArray.length != 3 && stringArray.length != 4) {
                        throw new ip_2(X_.bt, new Object[0]);
                    }
                    this.l(iCommandSender, stringArray, 2);
                } else if (StringInvoker.d(stringArray[1], X_.bI)) {
                    if (stringArray.length != 4) {
                        throw new ip_2(X_.a5, new Object[0]);
                    }
                    this.e(iCommandSender, stringArray, 2);
                } else if (StringInvoker.d(stringArray[1], X_.e)) {
                    if (stringArray.length != 5 && stringArray.length != 6) {
                        throw new ip_2(X_.ci, new Object[0]);
                    }
                    this.j(iCommandSender, stringArray, 2);
                } else {
                    if (!StringInvoker.d(stringArray[1], X_.J)) {
                        throw new ip_2(X_.ay, new Object[0]);
                    }
                    if (stringArray.length != 7) {
                        throw new ip_2(X_.b_, new Object[0]);
                    }
                    this.h(iCommandSender, stringArray, 2);
                }
            } else {
                if (!StringInvoker.d(stringArray[0], X_.M)) {
                    throw new ip_2(X_.av, new Object[0]);
                }
                if (stringArray.length == 1) {
                    throw new ip_2(X_.aa, new Object[0]);
                }
                if (StringInvoker.d(stringArray[1], X_.bv)) {
                    if (stringArray.length > 3) {
                        throw new ip_2(X_.A, new Object[0]);
                    }
                    this.n(iCommandSender, stringArray, 2);
                } else if (StringInvoker.d(stringArray[1], X_.cd)) {
                    if (stringArray.length < 3) {
                        throw new ip_2(X_.aN, new Object[0]);
                    }
                    this.g(iCommandSender, stringArray, 2);
                } else if (StringInvoker.d(stringArray[1], X_.br)) {
                    if (stringArray.length != 3) {
                        throw new ip_2(X_.G, new Object[0]);
                    }
                    this.m(iCommandSender, stringArray, 2);
                } else if (StringInvoker.d(stringArray[1], X_.bc)) {
                    if (stringArray.length != 3) {
                        throw new ip_2(X_.aJ, new Object[0]);
                    }
                    this.f(iCommandSender, stringArray, 2);
                } else if (StringInvoker.d(stringArray[1], X_.a0)) {
                    if (!(stringArray.length >= 4 || stringArray.length == 3 && iCommandSender instanceof EntityPlayer)) {
                        throw new ip_2(X_.aP, new Object[0]);
                    }
                    this.b(iCommandSender, stringArray, 2);
                } else if (StringInvoker.d(stringArray[1], X_.bD)) {
                    if (stringArray.length < 3 && !(iCommandSender instanceof EntityPlayer)) {
                        throw new ip_2(X_.X, new Object[0]);
                    }
                    this.k(iCommandSender, stringArray, 2);
                } else {
                    if (!StringInvoker.d(stringArray[1], X_.aO)) {
                        throw new ip_2(X_.bA, new Object[0]);
                    }
                    if (stringArray.length != 4 && stringArray.length != 5) {
                        throw new ip_2(X_.be, new Object[0]);
                    }
                    this.a(iCommandSender, stringArray, 2);
                }
            }
        }
    }

    private boolean a(int n, int n2, short s, ICommandSender iCommandSender, String[] stringArray) throws ht_1 {
        long l4 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)s << 48 >>> 48) ^ b;
        long l5 = l4 ^ 0x659EA1DA93B1L;
        long cfr_ignored_0 = l5 >>> 16;
        int cfr_ignored_1 = (int)(l5 << 48 >>> 48);
        for (int i = 0; i < stringArray.length; ++i) {
            if (!this.a(stringArray, i) || !X_.bJ.equals(stringArray[i])) continue;
            throw new ht_1(X_.aC, new Object[0]);
        }
        return false;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    protected za_2 c() {
        return ServerInvoker.a(ServerInvoker.d(), 0).m();
    }

    protected void g(ICommandSender iCommandSender, String[] stringArray, int n) throws ht_1 {
        String string = stringArray[n++];
        za_2 za_22 = this.c();
        if (za_22.f(string) != null) {
            throw new ht_1(X_.ca, string);
        }
        if (StringInvoker.c(string) > 16) {
            throw new ij_1(X_.cB, string, P8.d(16));
        }
        if (StringInvoker.g(string)) {
            throw new ip_2(X_.a, new Object[0]);
        }
        if (stringArray.length > n) {
            String string2 = aBO.d(cp_2.a(iCommandSender, stringArray, n));
            if (StringInvoker.c(string2) > 32) {
                throw new ij_1(X_.bH, string2, P8.d(32));
            }
            if (!StringInvoker.g(string2)) {
                sd_1.b(VM.f(za_22, string), string2);
            } else {
                VM.f(za_22, string);
            }
        } else {
            VM.f(za_22, string);
        }
        cp_2.a(iCommandSender, (ICommand)this, X_.aK, string);
    }

    protected void k(ICommandSender iCommandSender, String[] stringArray, int n) throws ht_1 {
        za_2 za_22 = this.c();
        HashSet hashSet = axe_2.a();
        HashSet hashSet2 = axe_2.a();
        if (iCommandSender instanceof EntityPlayer && n == stringArray.length) {
            String string = EntityPlayerInvoker.s(cp_2.a(iCommandSender));
            if (VM.d(za_22, string)) {
                aS0.b((Set)hashSet, string);
            } else {
                aS0.b((Set)hashSet2, string);
            }
        } else {
            while (n < stringArray.length) {
                Object object;
                String string;
                if (StringInvoker.e(string = stringArray[n++], X_.q)) {
                    object = ListInvoker.iterator(cp_2.d(iCommandSender, string));
                    while (dz_0.c((Iterator)object)) {
                        Entity entity = (Entity)dz_0.b((Iterator)object);
                        String string2 = cp_2.g(iCommandSender, ayj_0.R(entity).toString());
                        if (VM.d(za_22, string2)) {
                            aS0.b((Set)hashSet, string2);
                            continue;
                        }
                        aS0.b((Set)hashSet2, string2);
                    }
                    continue;
                }
                object = cp_2.g(iCommandSender, string);
                if (VM.d(za_22, (String)object)) {
                    aS0.b((Set)hashSet, object);
                    continue;
                }
                aS0.b((Set)hashSet2, object);
            }
        }
        if (!aS0.b(hashSet)) {
            alj_1.a(iCommandSender, a9N.AFFECTED_ENTITIES, aS0.d(hashSet));
            cp_2.a(iCommandSender, (ICommand)this, X_.I, P8.d(aS0.d(hashSet)), cp_2.a(aS0.a((Set)hashSet, new String[aS0.d(hashSet)])));
        }
        if (!aS0.b(hashSet2)) {
            throw new ht_1(X_.cU, P8.d(aS0.d(hashSet2)), cp_2.a(aS0.a((Set)hashSet2, new String[aS0.d(hashSet2)])));
        }
    }

    protected void a(ICommandSender iCommandSender) throws ht_1 {
        za_2 za_22 = this.c();
        Collection collection = VM.e(za_22);
        if (ms_0.d(collection) <= 0) {
            throw new ht_1(X_.as, new Object[0]);
        }
        aoz_1 aoz_12 = new aoz_1(X_.ak, P8.d(ms_0.d(collection)));
        HX.a(aIW.a(aoz_12), anw_0.DARK_GREEN);
        alj_1.a(iCommandSender, aoz_12);
        Iterator iterator = ms_0.a(collection);
        while (dz_0.c(iterator)) {
            acl_0 acl_02 = (acl_0)dz_0.b(iterator);
            alj_1.a(iCommandSender, new aoz_1(X_.a6, afi_1.d(acl_02), afi_1.b(acl_02), aon_1.a(afi_1.a(acl_02))));
        }
    }

    protected acl_0 a(String string, boolean bl) throws ht_1 {
        za_2 za_22 = this.c();
        VM.a(za_22, string);
        throw new ht_1(X_.co, string);
    }

    protected List<String> a(boolean bl) {
        Collection collection = VM.e(this.c());
        ArrayList arrayList = my_0.c();
        Iterator iterator = ms_0.a(collection);
        while (dz_0.c(iterator)) {
            acl_0 acl_02 = (acl_0)dz_0.b(iterator);
            if (aon_1.b(afi_1.a(acl_02))) continue;
            ListInvoker.add(arrayList, afi_1.d(acl_02));
        }
        return arrayList;
    }

    @Override
    public String b() {
        return X_.ac;
    }

    protected void b(ICommandSender iCommandSender, String[] stringArray, int n) throws ht_1 {
        za_2 za_22 = this.c();
        String string = stringArray[n++];
        HashSet hashSet = axe_2.a();
        HashSet hashSet2 = axe_2.a();
        if (iCommandSender instanceof EntityPlayer && n == stringArray.length) {
            String string2 = EntityPlayerInvoker.s(cp_2.a(iCommandSender));
            if (VM.a(za_22, string2, string)) {
                aS0.b((Set)hashSet, string2);
            } else {
                aS0.b((Set)hashSet2, string2);
            }
        } else {
            while (n < stringArray.length) {
                Object object;
                String string3;
                if (StringInvoker.e(string3 = stringArray[n++], X_.bU)) {
                    object = ListInvoker.iterator(cp_2.d(iCommandSender, string3));
                    while (dz_0.c((Iterator)object)) {
                        Entity entity = (Entity)dz_0.b((Iterator)object);
                        String string4 = cp_2.g(iCommandSender, ayj_0.R(entity).toString());
                        if (VM.a(za_22, string4, string)) {
                            aS0.b((Set)hashSet, string4);
                            continue;
                        }
                        aS0.b((Set)hashSet2, string4);
                    }
                    continue;
                }
                object = cp_2.g(iCommandSender, string3);
                if (VM.a(za_22, (String)object, string)) {
                    aS0.b((Set)hashSet, object);
                    continue;
                }
                aS0.b((Set)hashSet2, object);
            }
        }
        if (!aS0.b(hashSet)) {
            alj_1.a(iCommandSender, a9N.AFFECTED_ENTITIES, aS0.d(hashSet));
            cp_2.a(iCommandSender, (ICommand)this, X_.h, P8.d(aS0.d(hashSet)), string, cp_2.a(aS0.a((Set)hashSet, new String[aS0.d(hashSet)])));
        }
        if (!aS0.b(hashSet2)) {
            throw new ht_1(X_.cN, P8.d(aS0.d(hashSet2)), string, cp_2.a(aS0.a((Set)hashSet2, new String[aS0.d(hashSet2)])));
        }
    }

    protected void c(ICommandSender iCommandSender, String[] stringArray, int n) throws ht_1 {
        this.c();
        String string = stringArray[n++];
        VM.a(string);
        if (stringArray.length == 4) {
            this.a(stringArray[n], false);
        }
        throw new ht_1(X_.bS, string);
    }

    protected void d(ICommandSender iCommandSender, String[] stringArray, int n) throws ht_1 {
        Object object;
        Object object2;
        int n2;
        String string;
        String string2 = stringArray[n - 1];
        int n3 = n;
        if (StringInvoker.c(string = cp_2.g(iCommandSender, stringArray[n++])) > 40) {
            throw new ij_1(X_.cj, string, P8.d(40));
        }
        acl_0 acl_02 = this.a(stringArray[n++], true);
        int n4 = n2 = StringInvoker.d(string2, X_.bg) ? cp_2.d(stringArray[n++]) : cp_2.a(stringArray[n++], 0);
        if (stringArray.length > n) {
            object2 = cp_2.b(iCommandSender, stringArray[n3]);
            try {
                object = jv_2.a(cp_2.a(stringArray, n));
                NBTTagCompound nBTTagCompound = new NBTTagCompound();
                ayj_0.b((Entity)object2, nBTTagCompound);
                if (!S1.a((NBTBase)object, nBTTagCompound, true)) {
                    throw new ht_1(X_.cT, string);
                }
            }
            catch (az3_0 az3_02) {
                throw new ht_1(X_.cm, az3_02.getMessage());
            }
        }
        object2 = this.c();
        object = VM.c((za_2)object2, string, acl_02);
        if (StringInvoker.d(string2, X_.bT)) {
            hs_0.a((QU)object, n2);
        } else if (StringInvoker.d(string2, X_.cA)) {
            hs_0.c((QU)object, n2);
        } else {
            hs_0.b((QU)object, n2);
        }
        cp_2.a(iCommandSender, (ICommand)this, X_.bE, afi_1.d(acl_02), string, P8.d(hs_0.d((QU)object)));
    }

    protected void o(ICommandSender iCommandSender, String[] stringArray, int n) throws ht_1 {
        za_2 za_22 = this.c();
        if (stringArray.length > n) {
            String string = cp_2.g(iCommandSender, stringArray[n]);
            Map map = VM.b(za_22, string);
            alj_1.a(iCommandSender, a9N.QUERY_RESULT, MapInvoker.a(map));
            if (MapInvoker.a(map) <= 0) {
                throw new ht_1(X_.cl, string);
            }
            aoz_1 aoz_12 = new aoz_1(X_.Q, P8.d(MapInvoker.a(map)), string);
            HX.a(aIW.a(aoz_12), anw_0.DARK_GREEN);
            alj_1.a(iCommandSender, aoz_12);
            Iterator iterator = ms_0.a(map.values());
            while (dz_0.c(iterator)) {
                QU qU = (QU)dz_0.b(iterator);
                alj_1.a(iCommandSender, new aoz_1(X_.L, P8.d(hs_0.d(qU)), afi_1.b(hs_0.e(qU)), afi_1.d(hs_0.e(qU))));
            }
        } else {
            Collection collection = VM.a(za_22);
            alj_1.a(iCommandSender, a9N.QUERY_RESULT, ms_0.d(collection));
            if (ms_0.d(collection) <= 0) {
                throw new ht_1(X_.k, new Object[0]);
            }
            aoz_1 aoz_13 = new aoz_1(X_.F, P8.d(ms_0.d(collection)));
            HX.a(aIW.a(aoz_13), anw_0.DARK_GREEN);
            alj_1.a(iCommandSender, aoz_13);
            alj_1.a(iCommandSender, new ChatComponentText(cp_2.a(ms_0.e(collection))));
        }
    }

    protected void l(ICommandSender iCommandSender, String[] stringArray, int n) throws ht_1 {
        za_2 za_22 = this.c();
        String string = cp_2.g(iCommandSender, stringArray[n++]);
        if (stringArray.length > n) {
            acl_0 acl_02 = this.a(stringArray[n++], false);
            VM.b(za_22, string, acl_02);
            cp_2.a(iCommandSender, (ICommand)this, X_.x, afi_1.d(acl_02), string);
        } else {
            VM.b(za_22, string, null);
            cp_2.a(iCommandSender, (ICommand)this, X_.ag, string);
        }
    }

    protected void a(ICommandSender iCommandSender, String string) throws ht_1 {
        za_2 za_22 = this.c();
        acl_0 acl_02 = this.a(string, false);
        VM.c(za_22, acl_02);
        cp_2.a(iCommandSender, (ICommand)this, X_.by, string);
    }

    protected void e(ICommandSender iCommandSender, String[] stringArray, int n) throws ht_1 {
        String string;
        za_2 za_22 = this.c();
        if (StringInvoker.c(string = cp_2.c(iCommandSender, stringArray[n++])) > 40) {
            throw new ij_1(X_.cn, string, P8.d(40));
        }
        acl_0 acl_02 = this.a(stringArray[n], false);
        if (afi_1.a(acl_02) != aOA.b) {
            throw new ht_1(X_.t, afi_1.d(acl_02));
        }
        QU qU = VM.c(za_22, string, acl_02);
        hs_0.a(qU, false);
        cp_2.a(iCommandSender, (ICommand)this, X_.V, afi_1.d(acl_02), string);
    }

    @Override
    public boolean a(String[] stringArray, int n) {
        return !StringInvoker.d(stringArray[0], X_.an) ? StringInvoker.d(stringArray[0], X_.cx) && n == 2 : (stringArray.length > 1 && StringInvoker.d(stringArray[1], X_.f) ? n == 2 || n == 5 : n == 2);
    }

    protected void a(ICommandSender iCommandSender, String[] stringArray, int n) throws ht_1 {
        String string;
        a35 a352 = this.a(stringArray[n++]);
        if (!(StringInvoker.d(string = StringInvoker.i(stringArray[n++]), X_.bk) || StringInvoker.d(string, X_.bn) || StringInvoker.d(string, X_.b3) || StringInvoker.d(string, X_.bR) || StringInvoker.d(string, X_.bm))) {
            throw new ip_2(X_.ah, new Object[0]);
        }
        if (stringArray.length == 4) {
            if (StringInvoker.d(string, X_.bG)) {
                throw new ip_2(X_.aZ, string, cp_2.a(tc_0.a(true, false)));
            }
            if (!StringInvoker.d(string, X_.d) && !StringInvoker.d(string, X_.at)) {
                if (!StringInvoker.d(string, X_.aX) && !StringInvoker.d(string, X_.bf)) {
                    throw new ip_2(X_.B, new Object[0]);
                }
                throw new ip_2(X_.am, string, cp_2.a(to_1.a()));
            }
            throw new ip_2(X_.cV, string, cp_2.a(a7r_0.a(new String[]{X_.aB, X_.a9})));
        }
        String string2 = stringArray[n];
        if (StringInvoker.d(string, X_.aT)) {
            anw_0 anw_02 = tc_0.a(string2);
            if (tc_0.c(anw_02)) {
                throw new ip_2(X_.ap, string, cp_2.a(tc_0.a(true, false)));
            }
            sd_1.a(a352, anw_02);
            sd_1.c(a352, anw_02.toString());
            sd_1.a(a352, anw_0.RESET.toString());
        } else if (StringInvoker.d(string, X_.j)) {
            if (!StringInvoker.d(string2, X_.ce) && !StringInvoker.d(string2, X_.aY)) {
                throw new ip_2(X_.az, string, cp_2.a(a7r_0.a(new String[]{X_.c, X_.o})));
            }
            sd_1.b(a352, StringInvoker.d(string2, X_.al));
        } else if (StringInvoker.d(string, X_.u)) {
            if (!StringInvoker.d(string2, X_.cO) && !StringInvoker.d(string2, X_.cq)) {
                throw new ip_2(X_.ax, string, cp_2.a(a7r_0.a(new String[]{X_.bB, X_.cL})));
            }
            sd_1.a(a352, StringInvoker.d(string2, X_.ch));
        } else {
            if (StringInvoker.d(string, X_.T)) {
                aFJ aFJ2 = to_1.a(string2);
                throw new ip_2(X_.cC, string, cp_2.a(to_1.a()));
            }
            if (StringInvoker.d(string, X_.cp)) {
                aFJ aFJ3 = to_1.a(string2);
                throw new ip_2(X_.b2, string, cp_2.a(to_1.a()));
            }
        }
        cp_2.a(iCommandSender, (ICommand)this, X_.z, string, sd_1.h(a352), string2);
    }

    protected void m(ICommandSender iCommandSender, String[] stringArray, int n) throws ht_1 {
        za_2 za_22 = this.c();
        a35 a352 = this.a(stringArray[n]);
        VM.b(za_22, a352);
        cp_2.a(iCommandSender, (ICommand)this, X_.aw, sd_1.h(a352));
    }

    protected void n(ICommandSender iCommandSender, String[] stringArray, int n) throws ht_1 {
        za_2 za_22 = this.c();
        if (stringArray.length > n) {
            a35 a352 = this.a(stringArray[n]);
            return;
        }
        Collection collection = VM.d(za_22);
        alj_1.a(iCommandSender, a9N.QUERY_RESULT, ms_0.d(collection));
        if (ms_0.d(collection) <= 0) {
            throw new ht_1(X_.bl, new Object[0]);
        }
        aoz_1 aoz_12 = new aoz_1(X_.g, P8.d(ms_0.d(collection)));
        HX.a(aIW.a(aoz_12), anw_0.DARK_GREEN);
        alj_1.a(iCommandSender, aoz_12);
        Iterator iterator = ms_0.a(collection);
        while (dz_0.c(iterator)) {
            a35 a353 = (a35)dz_0.b(iterator);
            alj_1.a(iCommandSender, new aoz_1(X_.bx, sd_1.h(a353), sd_1.c(a353), P8.d(ms_0.d(sd_1.d(a353)))));
        }
    }

    protected void i(ICommandSender iCommandSender, String[] stringArray, int n) throws ht_1 {
        String cfr_ignored_0 = stringArray[n++];
        String string = stringArray[n++];
        this.c();
        aOA cfr_ignored_1 = (aOA)MapInvoker.c(aOA.c, string);
        throw new ip_2(X_.aU, string);
    }

    protected void j(ICommandSender iCommandSender, String[] stringArray, int n) throws ht_1 {
        acl_0 acl_02;
        String string;
        za_2 za_22 = this.c();
        if (StringInvoker.c(string = cp_2.g(iCommandSender, stringArray[n++])) > 40) {
            throw new ij_1(X_.cE, string, P8.d(40));
        }
        if (!VM.a(za_22, string, acl_02 = this.a(stringArray[n++], false))) {
            throw new ht_1(X_.a7, afi_1.d(acl_02), string);
        }
        int n2 = stringArray[n].equals(X_.a3) ? Integer.MIN_VALUE : cp_2.d(stringArray[n]);
        int n3 = ++n < stringArray.length && !stringArray[n].equals(X_.U) ? cp_2.a(stringArray[n], n2) : Integer.MAX_VALUE;
        QU qU = VM.c(za_22, string, acl_02);
        if (hs_0.d(qU) >= n2 && hs_0.d(qU) <= n3) {
            cp_2.a(iCommandSender, (ICommand)this, X_.aW, P8.d(hs_0.d(qU)), P8.d(n2), P8.d(n3));
            return;
        }
        throw new ht_1(X_.cX, P8.d(hs_0.d(qU)), P8.d(n2), P8.d(n3));
    }

    protected void h(ICommandSender iCommandSender, String[] stringArray, int n) throws ht_1 {
        za_2 za_22 = this.c();
        String string = cp_2.g(iCommandSender, stringArray[n++]);
        acl_0 acl_02 = this.a(stringArray[n++], true);
        String string2 = stringArray[n++];
        String string3 = cp_2.g(iCommandSender, stringArray[n++]);
        acl_0 acl_03 = this.a(stringArray[n], false);
        if (StringInvoker.c(string) > 40) {
            throw new ij_1(X_.aj, string, P8.d(40));
        }
        if (StringInvoker.c(string3) > 40) {
            throw new ij_1(X_.cF, string3, P8.d(40));
        }
        QU qU = VM.c(za_22, string, acl_02);
        if (!VM.a(za_22, string3, acl_03)) {
            throw new ht_1(X_.cJ, afi_1.d(acl_03), string3);
        }
        QU qU2 = VM.c(za_22, string3, acl_03);
        if (string2.equals(X_.aF)) {
            hs_0.a(qU, hs_0.d(qU) + hs_0.d(qU2));
        } else if (string2.equals(X_.bj)) {
            hs_0.a(qU, hs_0.d(qU) - hs_0.d(qU2));
        } else if (string2.equals(X_.cP)) {
            hs_0.a(qU, hs_0.d(qU) * hs_0.d(qU2));
        } else if (string2.equals(X_.b)) {
            if (hs_0.d(qU2) != 0) {
                hs_0.a(qU, hs_0.d(qU) / hs_0.d(qU2));
            }
        } else if (string2.equals(X_.w)) {
            if (hs_0.d(qU2) != 0) {
                hs_0.a(qU, hs_0.d(qU) % hs_0.d(qU2));
            }
        } else if (string2.equals(X_.p)) {
            hs_0.a(qU, hs_0.d(qU2));
        } else if (string2.equals(X_.aM)) {
            hs_0.a(qU, MathInvoker.b(hs_0.d(qU), hs_0.d(qU2)));
        } else if (string2.equals(X_.cS)) {
            hs_0.a(qU, MathInvoker.max(hs_0.d(qU), hs_0.d(qU2)));
        } else {
            if (!string2.equals(X_.cY)) {
                throw new ht_1(X_.W, string2);
            }
            int n2 = hs_0.d(qU);
            hs_0.a(qU, hs_0.d(qU2));
            hs_0.a(qU2, n2);
        }
        cp_2.a(iCommandSender, (ICommand)this, X_.bq, new Object[0]);
    }

    protected void f(ICommandSender iCommandSender, String[] stringArray, int n) throws ht_1 {
        za_2 za_22 = this.c();
        a35 a352 = this.a(stringArray[n]);
        ArrayList arrayList = my_0.a(sd_1.d(a352));
        alj_1.a(iCommandSender, a9N.AFFECTED_ENTITIES, ms_0.d(arrayList));
        if (ms_0.c(arrayList)) {
            throw new ht_1(X_.cf, sd_1.h(a352));
        }
        Iterator iterator = ms_0.a(arrayList);
        while (dz_0.c(iterator)) {
            String string = (String)dz_0.b(iterator);
            VM.a(za_22, string, a352);
        }
        cp_2.a(iCommandSender, (ICommand)this, X_.ba, P8.d(ms_0.d(arrayList)), sd_1.h(a352));
    }

    @Override
    public int a() {
        return 2;
    }

    protected List<String> b() {
        Collection collection = VM.e(this.c());
        ArrayList arrayList = my_0.c();
        Iterator iterator = ms_0.a(collection);
        while (dz_0.c(iterator)) {
            acl_0 acl_02 = (acl_0)dz_0.b(iterator);
            if (afi_1.a(acl_02) != aOA.b) continue;
            ListInvoker.add(arrayList, afi_1.d(acl_02));
        }
        return arrayList;
    }

    protected a35 a(String string) throws ht_1 {
        za_2 za_22 = this.c();
        za_22.f(string);
        throw new ht_1(X_.C, string);
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        if (stringArray.length == 1) {
            return cp_2.a(stringArray, X_.D, X_.S, X_.m);
        }
        if (StringInvoker.d(stringArray[0], X_.i)) {
            if (stringArray.length == 2) {
                return cp_2.a(stringArray, X_.a2, X_.aQ, X_.aI, X_.aH);
            }
            if (StringInvoker.d(stringArray[1], X_.bV)) {
                if (stringArray.length == 4) {
                    Set set = MapInvoker.c(aOA.c);
                    return cp_2.a(stringArray, set);
                }
            } else if (StringInvoker.d(stringArray[1], X_.E)) {
                if (stringArray.length == 3) {
                    return cp_2.a(stringArray, this.a(false));
                }
            } else if (StringInvoker.d(stringArray[1], X_.bo)) {
                if (stringArray.length == 3) {
                    return cp_2.a(stringArray, VM.b());
                }
                if (stringArray.length == 4) {
                    return cp_2.a(stringArray, this.a(false));
                }
            }
        } else if (StringInvoker.d(stringArray[0], X_.b7)) {
            if (stringArray.length == 2) {
                return cp_2.a(stringArray, X_.cs, X_.bY, X_.bb, X_.cW, X_.bp, X_.bs, X_.bF, X_.b1);
            }
            if (!(StringInvoker.d(stringArray[1], X_.ai) || StringInvoker.d(stringArray[1], X_.cy) || StringInvoker.d(stringArray[1], X_.y) || StringInvoker.d(stringArray[1], X_.bO))) {
                if (StringInvoker.d(stringArray[1], X_.aq)) {
                    if (stringArray.length == 3) {
                        return cp_2.a(stringArray, ServerInvoker.r(ServerInvoker.d()));
                    }
                    if (stringArray.length == 4) {
                        return cp_2.a(stringArray, this.b());
                    }
                } else if (!StringInvoker.d(stringArray[1], X_.cv) && !StringInvoker.d(stringArray[1], X_.b5)) {
                    if (StringInvoker.d(stringArray[1], X_.K)) {
                        if (stringArray.length == 3) {
                            return cp_2.a(stringArray, VM.a(this.c()));
                        }
                        if (stringArray.length == 4) {
                            return cp_2.a(stringArray, this.a(true));
                        }
                        if (stringArray.length == 5) {
                            return cp_2.a(stringArray, X_.cQ, X_.ck, X_.cH, X_.P, X_.bu, X_.ar, X_.n, X_.bw, X_.bi);
                        }
                        if (stringArray.length == 6) {
                            return cp_2.a(stringArray, ServerInvoker.r(ServerInvoker.d()));
                        }
                        if (stringArray.length == 7) {
                            return cp_2.a(stringArray, this.a(false));
                        }
                    }
                } else {
                    if (stringArray.length == 3) {
                        return cp_2.a(stringArray, VM.a(this.c()));
                    }
                    if (stringArray.length == 4 && StringInvoker.d(stringArray[1], X_.aL)) {
                        return cp_2.a(stringArray, this.a(false));
                    }
                }
            } else {
                if (stringArray.length == 3) {
                    return cp_2.a(stringArray, ServerInvoker.r(ServerInvoker.d()));
                }
                if (stringArray.length == 4) {
                    return cp_2.a(stringArray, this.a(true));
                }
            }
        } else if (StringInvoker.d(stringArray[0], X_.ae)) {
            if (stringArray.length == 2) {
                return cp_2.a(stringArray, X_.Z, X_.af, X_.b9, X_.bP, X_.aV, X_.ad, X_.bQ);
            }
            if (StringInvoker.d(stringArray[1], X_.b4)) {
                if (stringArray.length == 3) {
                    return cp_2.a(stringArray, VM.b(this.c()));
                }
                if (stringArray.length >= 4) {
                    return cp_2.a(stringArray, ServerInvoker.r(ServerInvoker.d()));
                }
            } else {
                if (StringInvoker.d(stringArray[1], X_.cu)) {
                    return cp_2.a(stringArray, ServerInvoker.r(ServerInvoker.d()));
                }
                if (!(StringInvoker.d(stringArray[1], X_.ab) || StringInvoker.d(stringArray[1], X_.l) || StringInvoker.d(stringArray[1], X_.H))) {
                    if (StringInvoker.d(stringArray[1], X_.aS)) {
                        if (stringArray.length == 3) {
                            return cp_2.a(stringArray, VM.b(this.c()));
                        }
                        if (stringArray.length == 4) {
                            return cp_2.a(stringArray, X_.a8, X_.cg, X_.au, X_.a4, X_.bW);
                        }
                        if (stringArray.length == 5) {
                            if (StringInvoker.d(stringArray[3], X_.cD)) {
                                return cp_2.a(stringArray, tc_0.a(true, false));
                            }
                            if (StringInvoker.d(stringArray[3], X_.bZ) || StringInvoker.d(stringArray[3], X_.v)) {
                                return cp_2.a(stringArray, to_1.a());
                            }
                            if (StringInvoker.d(stringArray[3], X_.bX) || StringInvoker.d(stringArray[3], X_.cK)) {
                                return cp_2.a(stringArray, X_.bK, X_.O);
                            }
                        }
                    }
                } else if (stringArray.length == 3) {
                    return cp_2.a(stringArray, VM.b(this.c()));
                }
            }
        }
        return null;
    }
}

