/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectList
 *  it.unimi.dsi.fastutil.objects.ObjectLists
 */
package net;

import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectLists;

/*
 * Renamed from net.cb
 */
public class cb_2 {
    public static ObjectList a(ObjectList objectList) {
        return ObjectLists.synchronize((ObjectList)objectList);
    }
}

