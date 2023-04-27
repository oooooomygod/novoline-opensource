/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.TimerUtil;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import net.FG;
import net.aPI;
import net.aS0;
import net.akg_2;
import net.akr_1;
import net.ame_0;
import net.asg_0;
import net.auj_0;
import net.ci_0;
import net.dz_0;

/*
 * Renamed from net.ph
 */
public class ph_2
implements CookieStore {
    private Map<URI, List<HttpCookie>> b = null;
    private Map<String, List<HttpCookie>> c = null;
    private List<HttpCookie> d = new ArrayList<HttpCookie>();
    private ReentrantLock a = null;

    private boolean a(String string, String string2) {
        TimerUtil.e();
        if (string == null || string2 == null) {
            return false;
        }
        boolean bl = StringInvoker.d(aPI.c, string);
        int n = StringInvoker.d(string, 46);
        if (n == 0) {
            n = StringInvoker.a(string, 46, 1);
        }
        if (!(bl || n != -1 && n != StringInvoker.c(string) - 1)) {
            return false;
        }
        int n2 = StringInvoker.d(string2, 46);
        if (n2 == -1 && bl) {
            return true;
        }
        int n3 = StringInvoker.c(string);
        int n4 = StringInvoker.c(string2) - n3;
        if (n4 == 0) {
            return StringInvoker.d(string2, string);
        }
        if (n4 > 0) {
            StringInvoker.b(string2, 0, n4);
            String string3 = StringInvoker.a(string2, n4);
            return StringInvoker.d(string3, string);
        }
        if (n4 == -1) {
            return StringInvoker.b(string, 0) == '.' && StringInvoker.d(string2, StringInvoker.a(string, 1));
        }
        return false;
    }

    public ph_2() {
        this.c = new HashMap<String, List<HttpCookie>>();
        this.b = new HashMap<URI, List<HttpCookie>>();
        this.a = new ReentrantLock(false);
    }

    private void a(List<HttpCookie> list, Map<String, List<HttpCookie>> map, String string, boolean bl) {
        block4: {
            HttpCookie httpCookie;
            Iterator iterator;
            List list2;
            ArrayList arrayList;
            block5: {
                block6: {
                    block7: {
                        TimerUtil.e();
                        arrayList = new ArrayList();
                        Iterator iterator2 = aS0.f(MapInvoker.b(map));
                        if (!dz_0.c(iterator2)) break block4;
                        Map.Entry entry = (Map.Entry)dz_0.b(iterator2);
                        String string2 = (String)FG.b(entry);
                        list2 = (List)FG.a(entry);
                        iterator = ListInvoker.iterator(list2);
                        if (!dz_0.c(iterator) || (auj_0.e(httpCookie = (HttpCookie)dz_0.b(iterator)) != 0 || !this.a(string2, string)) && (auj_0.e(httpCookie) != 1 || !auj_0.a(string2, string))) break block5;
                        if (ListInvoker.indexOf(this.d, httpCookie) == -1) break block6;
                        if (auj_0.d(httpCookie)) break block7;
                        if (!bl && auj_0.a(httpCookie) || ListInvoker.contains(list, httpCookie)) break block5;
                        ListInvoker.add(list, httpCookie);
                    }
                    akr_1.a(arrayList, httpCookie);
                }
                akr_1.a(arrayList, httpCookie);
            }
            if (dz_0.c(iterator = akr_1.a(arrayList))) {
                httpCookie = (HttpCookie)dz_0.b(iterator);
                ListInvoker.remove(list2, httpCookie);
                ListInvoker.remove(this.d, httpCookie);
            }
            akr_1.c(arrayList);
        }
    }

    @Override
    public boolean remove(URI uRI, HttpCookie httpCookie) {
        throw new NullPointerException(aPI.e);
    }

    @Override
    public List<HttpCookie> getCookies() {
        List list;
        TimerUtil.e();
        akg_2.a(this.a);
        try {
            Iterator iterator = ListInvoker.iterator(this.d);
            while (dz_0.c(iterator)) {
                if (!auj_0.d((HttpCookie)dz_0.b(iterator))) continue;
                dz_0.a(iterator);
                break;
            }
            return list;
        }
        finally {
            list = asg_0.b(this.d);
            akg_2.b(this.a);
        }
    }

    @Override
    public boolean removeAll() {
        block4: {
            TimerUtil.e();
            akg_2.a(this.a);
            if (!ListInvoker.isEmpty(this.d)) break block4;
            boolean bl = false;
            akg_2.b(this.a);
            return bl;
        }
        try {
            ListInvoker.clear(this.d);
            MapInvoker.d(this.c);
            MapInvoker.d(this.b);
            return true;
        }
        finally {
            akg_2.b(this.a);
        }
    }

    @Override
    public List<URI> getURIs() {
        ArrayList<URI> arrayList = new ArrayList<URI>();
        TimerUtil.e();
        akg_2.a(this.a);
        try {
            URI uRI;
            List list;
            Iterator iterator = aS0.f(MapInvoker.c(this.b));
            if (dz_0.c(iterator) && ((list = (List)MapInvoker.c(this.b, uRI = (URI)dz_0.b(iterator))) == null || ListInvoker.size(list) == 0)) {
                dz_0.a(iterator);
            }
            return arrayList;
        }
        finally {
            ListInvoker.addAll(arrayList, MapInvoker.c(this.b));
            akg_2.b(this.a);
        }
    }

    private static NullPointerException a(NullPointerException nullPointerException) {
        return nullPointerException;
    }

    private <T> void a(Map<T, List<HttpCookie>> map, T t, HttpCookie httpCookie) {
        TimerUtil.e();
        if (t != null) {
            ArrayList arrayList = (ArrayList)MapInvoker.c(map, t);
            if (arrayList != null) {
                ListInvoker.remove((List)arrayList, httpCookie);
                ListInvoker.add(arrayList, httpCookie);
            }
            arrayList = new ArrayList();
            ListInvoker.add(arrayList, httpCookie);
            MapInvoker.c(map, t, arrayList);
        }
    }

    @Override
    public void add(URI uRI, HttpCookie httpCookie) {
        TimerUtil.e();
        if (httpCookie == null) {
            throw new NullPointerException(aPI.d);
        }
        akg_2.a(this.a);
        try {
            ListInvoker.remove(this.d, httpCookie);
            if (auj_0.b(httpCookie) != 0L) {
                ListInvoker.add(this.d, httpCookie);
                if (auj_0.c(httpCookie) != null) {
                    this.a(this.c, auj_0.c(httpCookie), httpCookie);
                }
                this.a(this.b, this.a(uRI), httpCookie);
            }
            return;
        }
        finally {
            akg_2.b(this.a);
        }
    }

    @Override
    public List<HttpCookie> get(URI uRI) {
        throw new NullPointerException(aPI.f);
    }

    private <T> void a(List<HttpCookie> list, Map<T, List<HttpCookie>> map, Comparable<T> comparable, boolean bl) {
        block2: {
            Iterator iterator;
            block3: {
                HttpCookie httpCookie;
                block4: {
                    List list2;
                    Object object;
                    TimerUtil.e();
                    Iterator iterator2 = aS0.f(MapInvoker.c(map));
                    if (!dz_0.c(iterator2) || ci_0.a(comparable, object = dz_0.b(iterator2)) != 0 || (list2 = (List)MapInvoker.c(map, object)) == null || !dz_0.c(iterator = ListInvoker.iterator(list2))) break block2;
                    httpCookie = (HttpCookie)dz_0.b(iterator);
                    if (ListInvoker.indexOf(this.d, httpCookie) == -1) break block3;
                    if (auj_0.d(httpCookie)) break block4;
                    if (!bl && auj_0.a(httpCookie) || ListInvoker.contains(list, httpCookie)) break block2;
                    ListInvoker.add(list, httpCookie);
                }
                dz_0.a(iterator);
                ListInvoker.remove(this.d, httpCookie);
            }
            dz_0.a(iterator);
        }
    }

    private URI a(URI uRI) {
        URI uRI2 = null;
        try {
            uRI2 = new URI(aPI.a, ame_0.b(uRI), null, null, null);
        }
        catch (URISyntaxException uRISyntaxException) {
            uRI2 = uRI;
        }
        return uRI2;
    }
}

