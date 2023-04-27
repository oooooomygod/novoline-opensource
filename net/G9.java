/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.MCInvoker;
import java.lang.reflect.Field;
import java.util.HashSet;
import net.minecraft.client.Minecraft;

public class G9
implements a30 {
    @Override
    public Field a() {
        Class<Minecraft> clazz = Minecraft.class;
        aP2.b();
        Field field = this.b();
        if (field == null) {
            ys_2.e(aL0.a(aL0.a(aL0.a(new StringBuilder(), arn_0.a), ara_2.b(clazz)), arn_0.b).toString());
            return null;
        }
        Field field2 = a5h_0.a(Minecraft.class, field, Boolean.TYPE, 0);
        if (field2 == null) {
            ys_2.e(aL0.a(aL0.a(aL0.a(new StringBuilder(), arn_0.d), ara_2.b(clazz)), arn_0.c).toString());
            return null;
        }
        return field2;
    }

    private Field b() {
        Minecraft minecraft = MCInvoker.f();
        boolean bl = minecraft.aC;
        Field[] fieldArray = ara_2.e(Minecraft.class);
        aP2.b();
        minecraft.aC = true;
        Object[] objectArray = a5h_0.a(minecraft, fieldArray, Boolean.TYPE, Boolean.TRUE);
        minecraft.aC = false;
        Object[] objectArray2 = a5h_0.a(minecraft, fieldArray, Boolean.TYPE, Boolean.FALSE);
        minecraft.aC = bl;
        HashSet hashSet = new HashSet(a7r_0.a(objectArray));
        HashSet hashSet2 = new HashSet(a7r_0.a(objectArray2));
        HashSet hashSet3 = new HashSet(hashSet);
        aS0.c(hashSet3, hashSet2);
        Field[] fieldArray2 = (Field[])aS0.a(hashSet3, new Field[aS0.d(hashSet3)]);
        return fieldArray2.length != 1 ? null : fieldArray2[0];
    }
}

