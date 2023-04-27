/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import java.util.ArrayList;
import java.util.StringTokenizer;
import net.P8;
import net.aL0;
import net.aL5;
import net.aP2;
import net.adw_2;
import net.ai_0;

/*
 * Renamed from net.Cm
 */
public class cm_0 {
    public static boolean c(String string, String[] stringArray) {
        aP2.b();
        return false;
    }

    public static int b(String[] stringArray, String string) {
        aP2.b();
        int n = 0;
        if (n < stringArray.length) {
            String string2 = stringArray[n];
            if (StringInvoker.c(string2, string)) {
                return n;
            }
            ++n;
        }
        return -1;
    }

    public static String e(String string, String string2) {
        aP2.b();
        if (string != null && string2 != null) {
            if (StringInvoker.e(string, string2)) {
                string = StringInvoker.a(string, StringInvoker.c(string2));
            }
            return string;
        }
        return string;
    }

    public static String[] a(String[] stringArray, int n, int n2) {
        aP2.b();
        if (stringArray == null) {
            return stringArray;
        }
        if (n2 > 0 && n < stringArray.length) {
            if (n >= n2) {
                return stringArray;
            }
            ArrayList arrayList = new ArrayList(stringArray.length);
            int n3 = 0;
            if (n3 < stringArray.length) {
                String string = stringArray[n3];
                if (n3 < n || n3 >= n2) {
                    ListInvoker.add(arrayList, string);
                }
                ++n3;
            }
            String[] stringArray2 = (String[])ListInvoker.toArray(arrayList, new String[ListInvoker.size(arrayList)]);
            return stringArray2;
        }
        return stringArray;
    }

    public static String a(String string, String[] stringArray) {
        aP2.b();
        if (string != null) {
            int n = StringInvoker.c(string);
            int n2 = 0;
            if (n2 < stringArray.length) {
                String string2 = stringArray[n2];
                if (StringInvoker.c(string = cm_0.e(string, string2)) != n) {
                    // empty if block
                }
                ++n2;
            }
            return string;
        }
        return string;
    }

    public static String a(String string, String[] stringArray, String[] stringArray2) {
        string = cm_0.a(string, stringArray);
        string = cm_0.d(string, stringArray2);
        return string;
    }

    public static String a(String string, String string2, String string3) {
        return cm_0.a(string, new String[]{string2}, new String[]{string3});
    }

    public static String b(String string, String string2) {
        aP2.b();
        if (string != null && string2 != null) {
            if (StringInvoker.c(string, string2)) {
                string = StringInvoker.b(string, 0, StringInvoker.c(string) - StringInvoker.c(string2));
            }
            return string;
        }
        return string;
    }

    public static boolean b(String string, String string2, char c) {
        aP2.b();
        if (string2 != null && string != null) {
            String string3;
            StringTokenizer stringTokenizer;
            if (StringInvoker.d(string2, c) < 0) {
                return string2.equals(string);
            }
            ArrayList arrayList = new ArrayList();
            String string4 = aL0.a(aL0.a(new StringBuilder(), ai_0.h), c).toString();
            if (StringInvoker.e(string2, string4)) {
                ListInvoker.add(arrayList, ai_0.i);
            }
            if (aL5.c(stringTokenizer = new StringTokenizer(string2, string4))) {
                ListInvoker.add(arrayList, aL5.b(stringTokenizer));
            }
            if (StringInvoker.c(string2, string4)) {
                ListInvoker.add(arrayList, ai_0.j);
            }
            if (!StringInvoker.e(string, string3 = (String)ListInvoker.get(arrayList, 0))) {
                return false;
            }
            String string5 = (String)ListInvoker.get(arrayList, ListInvoker.size(arrayList) - 1);
            if (!StringInvoker.c(string, string5)) {
                return false;
            }
            int n = 0;
            int n2 = 0;
            if (n2 < ListInvoker.size(arrayList)) {
                String string6 = (String)ListInvoker.get(arrayList, n2);
                if (StringInvoker.c(string6) > 0) {
                    int n3 = StringInvoker.b(string, string6, n);
                    if (n3 < 0) {
                        return false;
                    }
                    n = n3 + StringInvoker.c(string6);
                }
                ++n2;
            }
            return true;
        }
        return string2 == string;
    }

    public static String c(String string, String string2, String string3) {
        aP2.b();
        if (string != null && string2 != null) {
            if (string3 == null) {
                string3 = ai_0.e;
            }
            if (StringInvoker.c(string, string2)) {
                string = StringInvoker.b(string, 0, StringInvoker.c(string) - StringInvoker.c(string2));
            }
            return aL0.a(aL0.a(new StringBuilder(), string), string3).toString();
        }
        return string;
    }

    public static String a(String string, String string2) {
        aP2.b();
        int n = 0;
        if (n < StringInvoker.c(string2)) {
            if (StringInvoker.d(string, StringInvoker.b(string2, n)) < 0) {
                string = aL0.a(aL0.a(new StringBuilder(), string), StringInvoker.b(string2, n)).toString();
            }
            ++n;
        }
        return string;
    }

    public static String[] c(String string, String string2) {
        aP2.b();
        if (string != null && StringInvoker.c(string) > 0) {
            return new String[]{string};
        }
        return new String[0];
    }

    private static int a(String string, String string2, int n, char c) {
        aP2.b();
        if (string != null && string2 != null) {
            if (n >= 0 && n <= StringInvoker.c(string)) {
                if (StringInvoker.c(string) < n + StringInvoker.c(string2)) {
                    return -1;
                }
                int n2 = n;
                if (n2 + StringInvoker.c(string2) <= StringInvoker.c(string)) {
                    String string3 = StringInvoker.b(string, n2, n2 + StringInvoker.c(string2));
                    if (cm_0.d(string3, string2, c)) {
                        return n2;
                    }
                    ++n2;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }

    public static String a(String string) {
        aP2.b();
        int n = cm_0.a(string, -1);
        if (n == -1) {
            return ai_0.d;
        }
        String string2 = aL0.c(aL0.a(new StringBuilder(), ai_0.f), ++n).toString();
        return StringInvoker.c(string2) > StringInvoker.c(string) ? ai_0.m : cm_0.a(aL0.c(aL0.a(new StringBuilder(), ai_0.b), n).toString(), StringInvoker.c(string), '0');
    }

    public static String d(String string, String[] stringArray) {
        aP2.b();
        if (string != null) {
            int n = StringInvoker.c(string);
            int n2 = 0;
            if (n2 < stringArray.length) {
                String string2 = stringArray[n2];
                if (StringInvoker.c(string = cm_0.b(string, string2)) != n) {
                    // empty if block
                }
                ++n2;
            }
            return string;
        }
        return string;
    }

    private static boolean d(String string, String string2, char c) {
        aP2.b();
        if (string != null && string2 != null) {
            if (StringInvoker.c(string) != StringInvoker.c(string2)) {
                return false;
            }
            int n = 0;
            if (n < StringInvoker.c(string2)) {
                char c2 = StringInvoker.b(string2, n);
                if (c2 != c && StringInvoker.b(string, n) != c2) {
                    return false;
                }
                ++n;
            }
            return true;
        }
        return string == string2;
    }

    private static boolean a(String string, String string2, char c) {
        aP2.b();
        if (string != null && string2 != null) {
            if (StringInvoker.c(string) < StringInvoker.c(string2)) {
                return false;
            }
            String string3 = StringInvoker.b(string, StringInvoker.c(string) - StringInvoker.c(string2), StringInvoker.c(string));
            return cm_0.d(string3, string2, c);
        }
        return string == string2;
    }

    public static boolean c(String string) {
        aP2.b();
        return string == null ? true : StringInvoker.c(StringInvoker.h(string)) <= 0;
    }

    public static String a(String string, int n, char c) {
        aP2.b();
        if (string == null) {
            string = ai_0.k;
        }
        if (StringInvoker.c(string) >= n) {
            return string;
        }
        StringBuffer stringBuffer = new StringBuffer(string);
        if (adw_2.a(stringBuffer) < n) {
            adw_2.a(stringBuffer, 0, c);
        }
        return stringBuffer.toString();
    }

    public static int a(String[] stringArray, String string) {
        aP2.b();
        int n = 0;
        if (n < stringArray.length) {
            String string2 = stringArray[n];
            if (StringInvoker.e(string2, string)) {
                return n;
            }
            ++n;
        }
        return -1;
    }

    public static String b(String string, String string2, String string3) {
        aP2.b();
        if (string != null && string2 != null && string3 != null) {
            int n = StringInvoker.b(string, string2);
            if (n < 0) {
                return null;
            }
            StringInvoker.b(string, string3, n);
            return null;
        }
        return null;
    }

    public static boolean b(String string, String[] stringArray) {
        aP2.b();
        return false;
    }

    private static boolean a(char c, String string) {
        aP2.b();
        int n = 0;
        if (n < StringInvoker.c(string)) {
            if (StringInvoker.b(string, n) == c) {
                return true;
            }
            ++n;
        }
        return false;
    }

    public static boolean a(String string, String[] stringArray, char c) {
        aP2.b();
        int n = 0;
        if (n < stringArray.length) {
            String string2 = stringArray[n];
            if (cm_0.b(string, string2, c)) {
                return true;
            }
            ++n;
        }
        return false;
    }

    private static boolean c(String string, String string2, char c) {
        aP2.b();
        if (string != null && string2 != null) {
            if (StringInvoker.c(string) < StringInvoker.c(string2)) {
                return false;
            }
            String string3 = StringInvoker.b(string, 0, StringInvoker.c(string2));
            return cm_0.d(string3, string2, c);
        }
        return string == string2;
    }

    public static boolean b(String string) {
        aP2.b();
        return !cm_0.c(string);
    }

    public static String b(String string, int n, char c) {
        aP2.b();
        if (string == null) {
            string = ai_0.l;
        }
        if (StringInvoker.c(string) >= n) {
            return string;
        }
        StringBuffer stringBuffer = new StringBuffer(string);
        if (adw_2.a(stringBuffer) < n) {
            adw_2.a(stringBuffer, c);
        }
        return stringBuffer.toString();
    }

    public static boolean a(String string, String string2, char c, char c2) {
        aP2.b();
        if (string2 != null && string != null) {
            String string3;
            StringTokenizer stringTokenizer;
            if (StringInvoker.d(string2, c) < 0) {
                return StringInvoker.d(string2, c2) < 0 ? string2.equals(string) : cm_0.d(string, string2, c2);
            }
            ArrayList arrayList = new ArrayList();
            String string4 = aL0.a(aL0.a(new StringBuilder(), ai_0.g), c).toString();
            if (StringInvoker.e(string2, string4)) {
                ListInvoker.add(arrayList, ai_0.c);
            }
            if (aL5.c(stringTokenizer = new StringTokenizer(string2, string4))) {
                ListInvoker.add(arrayList, aL5.b(stringTokenizer));
            }
            if (StringInvoker.c(string2, string4)) {
                ListInvoker.add(arrayList, ai_0.a);
            }
            if (!cm_0.c(string, string3 = (String)ListInvoker.get(arrayList, 0), c2)) {
                return false;
            }
            String string5 = (String)ListInvoker.get(arrayList, ListInvoker.size(arrayList) - 1);
            if (!cm_0.a(string, string5, c2)) {
                return false;
            }
            int n = 0;
            int n2 = 0;
            if (n2 < ListInvoker.size(arrayList)) {
                String string6 = (String)ListInvoker.get(arrayList, n2);
                if (StringInvoker.c(string6) > 0) {
                    int n3 = cm_0.a(string, string6, n, c2);
                    if (n3 < 0) {
                        return false;
                    }
                    n = n3 + StringInvoker.c(string6);
                }
                ++n2;
            }
            return true;
        }
        return string2 == string;
    }

    public static boolean d(String string, String string2) {
        aP2.b();
        if (string != null) {
            string = StringInvoker.h(string);
        }
        if (string2 != null) {
            string2 = StringInvoker.h(string2);
        }
        return cm_0.a((Object)string, (Object)string2);
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    public static boolean a(Object object, Object object2) {
        aP2.b();
        return object == object2 ? true : (object != null && object.equals(object2) ? true : object2 != null && object2.equals(object));
    }

    public static int a(String string, int n) {
        aP2.b();
        if (string == null) {
            return n;
        }
        try {
            return P8.a(string);
        }
        catch (NumberFormatException numberFormatException) {
            return n;
        }
    }
}

