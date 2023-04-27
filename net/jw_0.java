/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import java.util.Collection;
import deobf.EnumFacing;

/*
 * Renamed from net.Jw
 */
public class jw_0
extends JC<EnumFacing> {
    public static jw_0 a(String string) {
        return jw_0.a(string, (Predicate<EnumFacing>)an7_0.a());
    }

    public static jw_0 a(String string, Collection<EnumFacing> collection) {
        return new jw_0(string, collection);
    }

    public static jw_0 a(String string, Predicate<EnumFacing> predicate) {
        return jw_0.a(string, aG1.a((Collection)my_0.a(EnumFacing.values()), predicate));
    }

    protected jw_0(String string, Collection<EnumFacing> collection) {
        super(string, EnumFacing.class, collection);
    }
}

