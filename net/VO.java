/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import com.google.common.collect.Multimap;
import deobf.IAttribute;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import net.AttributeModifier;
import net.FG;
import net.GD;
import net.MM;
import net.Ma;
import net.aHj;
import net.ahw_2;
import net.dc_0;
import net.dz_0;
import net.ms_0;
import net.zi_2;

public abstract class VO {
    protected Map<IAttribute, ahw_2> b = MapsInvoker.a();
    protected Multimap<IAttribute, IAttribute> c;
    protected Map<String, ahw_2> a = new GD<ahw_2>();

    public ahw_2 a(IAttribute iAttribute) {
        return (ahw_2)MapInvoker.c(this.b, iAttribute);
    }

    public ahw_2 b(IAttribute iAttribute) {
        if (MapInvoker.b(this.a, dc_0.c(iAttribute))) {
            throw new IllegalArgumentException(aHj.a);
        }
        ahw_2 ahw_22 = this.c(iAttribute);
        MapInvoker.c(this.a, dc_0.c(iAttribute), ahw_22);
        MapInvoker.c(this.b, iAttribute, ahw_22);
        IAttribute iAttribute2 = dc_0.b(iAttribute);
        while (true) {
            MM.b(this.c, iAttribute2, iAttribute);
            iAttribute2 = dc_0.b(iAttribute2);
        }
    }

    public void b(Multimap<String, AttributeModifier> multimap) {
        Iterator iterator = ms_0.a(MM.a(multimap));
        while (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            ahw_2 ahw_22 = this.a((String)FG.b(entry));
            Ma.b(ahw_22, (AttributeModifier)FG.a(entry));
        }
    }

    public Collection<ahw_2> a() {
        return this.a.values();
    }

    public ahw_2 a(String string) {
        return (ahw_2)MapInvoker.c(this.a, string);
    }

    public VO() {
        this.c = zi_2.a();
    }

    protected abstract ahw_2 c(IAttribute var1);

    public void a(Multimap<String, AttributeModifier> multimap) {
        Iterator iterator = ms_0.a(MM.a(multimap));
        while (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            ahw_2 ahw_22 = this.a((String)FG.b(entry));
            Ma.b(ahw_22, (AttributeModifier)FG.a(entry));
            Ma.a(ahw_22, (AttributeModifier)FG.a(entry));
        }
    }

    public void a(ahw_2 ahw_22) {
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}

