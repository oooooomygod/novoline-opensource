/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableTable
 *  com.google.common.collect.Table
 */
package net;

import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;

/*
 * Renamed from net.aBe
 */
public class abe_0 {
    public static Object a(ImmutableTable immutableTable, Object object, Object object2) {
        return immutableTable.get(object, object2);
    }

    public static ImmutableTable a(Table table) {
        return ImmutableTable.copyOf((Table)table);
    }
}

