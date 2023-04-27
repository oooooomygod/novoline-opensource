/*
 * Decompiled with CFR 0.152.
 */
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.SystemInvoker;
import net.Main;
import net.a7r_0;
import net.pe_2;

public class Start {
    private static int[] b;

    public static int[] b() {
        return b;
    }

    public static <T> T[] a(T[] TArray, T[] TArray2) {
        Start.b();
        Object[] objectArray = a7r_0.a((Object[])TArray, TArray.length + TArray2.length);
        SystemInvoker.a(TArray2, 0, objectArray, TArray.length, TArray2.length);
        if (ListInvoker.b() != null) {
            Start.b(new int[2]);
        }
        return objectArray;
    }

    public static void main(String[] stringArray) {
        Start.b();
        Main.main(Start.a(new String[]{pe_2.i, pe_2.g, pe_2.c, pe_2.a, pe_2.e, pe_2.j, pe_2.b, pe_2.h, pe_2.f, pe_2.d}, stringArray));
        ListInvoker.b(new ListInvoker[3]);
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    static {
        if (Start.b() != null) {
            Start.b(new int[2]);
        }
    }
}

