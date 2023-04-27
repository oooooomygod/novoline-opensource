/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Stack;

public class aAH {
    public static Object a(Stack stack, Object object) {
        return stack.push(object);
    }

    public static Object b(Stack stack) {
        return stack.pop();
    }

    public static boolean a(Stack stack) {
        return stack.isEmpty();
    }
}

