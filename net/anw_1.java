/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import net.AJ;
import net.a7r_0;
import net.aDb;
import net.aP2;
import net.aSG;
import net.ahy_1;
import net.ara_2;
import net.avx_0;

/*
 * Renamed from net.anW
 */
public class anw_1 {
    public static boolean a(Object object, Class clazz, Class clazz2, Object object2) {
        aP2.b();
        ahy_1 ahy_12 = anw_1.b(clazz, clazz2);
        return ahy_12 == null ? false : (!aSG.a(ahy_12) ? false : aDb.a(object, ahy_12, object2));
    }

    public static Object a(Object object, Class clazz, Class clazz2, int n) {
        aP2.b();
        ahy_1 ahy_12 = anw_1.a(clazz, clazz2, n);
        return ahy_12 == null ? null : (!aSG.a(ahy_12) ? null : aDb.a(object, ahy_12));
    }

    public static boolean a(Object object, Class clazz, Class clazz2, int n, Object object2) {
        aP2.b();
        ahy_1 ahy_12 = anw_1.a(clazz, clazz2, n);
        return ahy_12 == null ? false : (!aSG.a(ahy_12) ? false : aDb.a(object, ahy_12, object2));
    }

    public static Field b(Class clazz, Class clazz2, int n) {
        aP2.b();
        Field[] fieldArray = anw_1.c(clazz, clazz2);
        return n >= 0 && n < fieldArray.length ? fieldArray[n] : null;
    }

    public static ahy_1 a(Class clazz, Class clazz2, int n) {
        anw_1.b(clazz, clazz2, n);
        return null;
    }

    public static Field[] a(Field[] fieldArray, Class clazz) {
        ArrayList arrayList;
        block4: {
            int n;
            block5: {
                Field field;
                aP2.b();
                try {
                    arrayList = new ArrayList();
                    n = 0;
                    if (n >= fieldArray.length) break block4;
                    field = fieldArray[n];
                    if (avx_0.e(field) != clazz) break block5;
                }
                catch (Exception exception) {
                    return null;
                }
                avx_0.a(field, true);
                ListInvoker.add(arrayList, field);
            }
            ++n;
        }
        Field[] fieldArray2 = (Field[])ListInvoker.toArray(arrayList, new Field[ListInvoker.size(arrayList)]);
        return fieldArray2;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public static Field a(Class clazz, Class clazz2) {
        block3: {
            int n;
            block4: {
                Field field;
                aP2.b();
                try {
                    Field[] fieldArray = ara_2.e(clazz);
                    n = 0;
                    if (n >= fieldArray.length) break block3;
                    field = fieldArray[n];
                    if (avx_0.e(field) != clazz2) break block4;
                }
                catch (Exception exception) {
                    return null;
                }
                avx_0.a(field, true);
                return field;
            }
            ++n;
        }
        return null;
    }

    public static Object a(Object object, Class clazz, Class clazz2) {
        aP2.b();
        ahy_1 ahy_12 = anw_1.b(clazz, clazz2);
        return ahy_12 == null ? null : (!aSG.a(ahy_12) ? null : aDb.a(object, ahy_12));
    }

    public static Field[] a(Object object, Field[] fieldArray, Class clazz, Object object2) {
        ArrayList arrayList;
        block11: {
            int n;
            block12: {
                Object object3;
                Field field;
                block13: {
                    aP2.b();
                    try {
                        arrayList = new ArrayList();
                        n = 0;
                        if (n >= fieldArray.length) break block11;
                        field = fieldArray[n];
                        if (avx_0.e(field) != clazz) break block12;
                    }
                    catch (Exception exception) {
                        return null;
                    }
                    AJ.c(avx_0.b(field));
                    if (object == null) {
                        // empty if block
                    }
                    if (object != null) {
                        // empty if block
                    }
                    avx_0.a(field, true);
                    object3 = avx_0.a(field, object);
                    if (object3 != object2) break block13;
                    ListInvoker.add(arrayList, field);
                }
                if (object3 != null && object2 != null) {
                    if (!object3.equals(object2)) break block12;
                    ListInvoker.add(arrayList, field);
                }
            }
            ++n;
        }
        Field[] fieldArray2 = (Field[])ListInvoker.toArray(arrayList, new Field[ListInvoker.size(arrayList)]);
        return fieldArray2;
    }

    public static Field[] a(Class clazz, Field field, Class clazz2) {
        int n;
        List list;
        block4: {
            aP2.b();
            try {
                Object[] objectArray = ara_2.e(clazz);
                list = a7r_0.a(objectArray);
                n = ListInvoker.indexOf(list, field);
                if (n >= 0) break block4;
            }
            catch (Exception exception) {
                return null;
            }
            return new Field[0];
        }
        List list2 = ListInvoker.subList(list, n + 1, ListInvoker.size(list));
        Field[] fieldArray = (Field[])ListInvoker.toArray(list2, new Field[ListInvoker.size(list2)]);
        return anw_1.a(fieldArray, clazz2);
    }

    public static Field a(Class clazz, Field field, Class clazz2, int n) {
        aP2.b();
        Field[] fieldArray = anw_1.a(clazz, field, clazz2);
        return n >= 0 && n < fieldArray.length ? fieldArray[n] : null;
    }

    public static ahy_1 b(Class clazz, Class clazz2) {
        anw_1.a(clazz, clazz2);
        return null;
    }

    public static Field[] c(Class clazz, Class clazz2) {
        try {
            Field[] fieldArray = ara_2.e(clazz);
            return anw_1.a(fieldArray, clazz2);
        }
        catch (Exception exception) {
            return null;
        }
    }
}

