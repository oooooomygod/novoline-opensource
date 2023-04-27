/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.Property
 */
package net;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import deobf.NBTBase;
import deobf.NBTTagList;
import java.util.Iterator;
import java.util.UUID;
import net.NBTTagCompound;
import net.a4Z;
import net.aS0;
import net.aod_2;
import net.auw_2;
import net.awc_1;
import net.ayw_0;
import net.dz_0;
import net.kv_0;
import net.ms_0;
import net.po_1;
import net.tn_0;

/*
 * Renamed from net.uu
 */
public class uu_1 {
    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public static NBTTagCompound a(NBTTagCompound nBTTagCompound, GameProfile gameProfile) {
        if (!aod_2.a(a4Z.d(gameProfile))) {
            tn_0.a(nBTTagCompound, auw_2.g, a4Z.d(gameProfile));
        }
        if (a4Z.a(gameProfile) != null) {
            tn_0.a(nBTTagCompound, auw_2.i, a4Z.a(gameProfile).toString());
        }
        if (!ayw_0.b(a4Z.c(gameProfile))) {
            NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
            Iterator iterator = aS0.f(ayw_0.a(a4Z.c(gameProfile)));
            while (dz_0.c(iterator)) {
                String string = (String)dz_0.b(iterator);
                NBTTagList nBTTagList = new NBTTagList();
                Iterator iterator2 = ms_0.a(ayw_0.b(a4Z.c(gameProfile), string));
                while (dz_0.c(iterator2)) {
                    Property property = (Property)dz_0.b(iterator2);
                    NBTTagCompound nBTTagCompound3 = new NBTTagCompound();
                    tn_0.a(nBTTagCompound3, auw_2.n, po_1.b(property));
                    if (po_1.a(property)) {
                        tn_0.a(nBTTagCompound3, auw_2.j, po_1.d(property));
                    }
                    kv_0.a(nBTTagList, nBTTagCompound3);
                }
                tn_0.a(nBTTagCompound2, string, nBTTagList);
            }
            tn_0.a(nBTTagCompound, auw_2.k, (NBTBase)nBTTagCompound2);
        }
        return nBTTagCompound;
    }

    public static GameProfile a(NBTTagCompound nBTTagCompound) {
        UUID uUID;
        String string = null;
        String string2 = null;
        if (tn_0.a(nBTTagCompound, auw_2.f, 8)) {
            string = tn_0.m(nBTTagCompound, auw_2.b);
        }
        if (tn_0.a(nBTTagCompound, auw_2.a, 8)) {
            string2 = tn_0.m(nBTTagCompound, auw_2.e);
        }
        if (aod_2.a(string) && aod_2.a(string2)) {
            return null;
        }
        try {
            uUID = awc_1.a(string2);
        }
        catch (Throwable throwable) {
            uUID = null;
        }
        GameProfile gameProfile = new GameProfile(uUID, string);
        if (tn_0.a(nBTTagCompound, auw_2.d, 10)) {
            NBTTagCompound nBTTagCompound2 = tn_0.d(nBTTagCompound, auw_2.m);
            Iterator iterator = aS0.f(tn_0.c(nBTTagCompound2));
            while (dz_0.c(iterator)) {
                String string3 = (String)dz_0.b(iterator);
                NBTTagList nBTTagList = tn_0.c(nBTTagCompound2, string3, 10);
                for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
                    NBTTagCompound nBTTagCompound3 = kv_0.g(nBTTagList, i);
                    String string4 = tn_0.m(nBTTagCompound3, auw_2.c);
                    if (tn_0.a(nBTTagCompound3, auw_2.l, 8)) {
                        ayw_0.a(a4Z.c(gameProfile), string3, new Property(string3, string4, tn_0.m(nBTTagCompound3, auw_2.h)));
                        continue;
                    }
                    ayw_0.a(a4Z.c(gameProfile), string3, new Property(string3, string4));
                }
            }
        }
        return gameProfile;
    }

    public static boolean a(NBTBase nBTBase, NBTBase nBTBase2, boolean bl) {
        if (nBTBase == nBTBase2) {
            return true;
        }
        return true;
    }
}

