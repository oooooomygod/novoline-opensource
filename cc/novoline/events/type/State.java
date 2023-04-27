/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.events.type;

import net.jc_0;

public class State
extends Enum<State> {
    private static int b;
    public static /* enum */ State PRE;
    private static State[] a;
    public static /* enum */ State POST;

    public static State[] values() {
        return (State[])a.clone();
    }

    public static int b() {
        return b;
    }

    public static void b(int n) {
        b = n;
    }

    static {
        PRE = new State();
        State.b(0);
        POST = new State();
        a = new State[]{PRE, POST};
    }

    public static int a() {
        State.b();
        return 46;
    }

    public static State valueOf(String string) {
        return (State)jc_0.a(State.class, string);
    }
}

