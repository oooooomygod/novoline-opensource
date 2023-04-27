/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.aL0;
import net.anf_2;
import net.wj_1;

public class a6W {
    public static String a(int n) {
        wj_1.a();
        char[] cArray = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        if (n2 < n) {
            aL0.a(stringBuilder, cArray[anf_2.a(anf_2.c(), cArray.length)]);
            ++n2;
            ListInvoker.b(new ListInvoker[2]);
        }
        return stringBuilder.toString();
    }
}

