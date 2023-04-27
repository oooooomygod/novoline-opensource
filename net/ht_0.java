/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 */
package net;

import com.google.common.collect.Multimap;
import deobf.IAttribute;
import java.util.Collection;
import net.AttributeModifier;
import net.VO;
import net.ahw_2;

/*
 * Renamed from net.Ht
 */
public class ht_0 {
    public static void a(VO vO, ahw_2 ahw_22) {
        vO.a(ahw_22);
    }

    public static void a(VO vO, Multimap multimap) {
        vO.b((Multimap<String, AttributeModifier>)multimap);
    }

    public static Collection a(VO vO) {
        return vO.a();
    }

    public static ahw_2 a(VO vO, IAttribute iAttribute) {
        return vO.a(iAttribute);
    }

    public static ahw_2 b(VO vO, IAttribute iAttribute) {
        return vO.b(iAttribute);
    }

    public static void b(VO vO, Multimap multimap) {
        vO.a((Multimap<String, AttributeModifier>)multimap);
    }

    public static ahw_2 a(VO vO, String string) {
        return vO.a(string);
    }
}

