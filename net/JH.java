/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import net.H;
import net.aL0;
import net.jq_0;
import net.my_0;

public class JH
extends IOException {
    private String b;
    private List<jq_0> a = my_0.c();

    public static JH a(Exception exception) {
        if (exception instanceof JH) {
            return (JH)exception;
        }
        String string = exception.getMessage();
        if (exception instanceof FileNotFoundException) {
            string = H.a;
        }
        return new JH(string, exception);
    }

    public void b(String string) {
        jq_0.a((jq_0)ListInvoker.get(this.a, 0), string);
        ListInvoker.add(this.a, 0, new jq_0(null));
    }

    @Override
    public String getMessage() {
        return aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), H.c), ((jq_0)ListInvoker.get(this.a, ListInvoker.size(this.a) - 1)).toString()), H.b), this.b).toString();
    }

    public void a(String string) {
        jq_0.b((jq_0)ListInvoker.get(this.a, 0), string);
    }

    public JH(String string) {
        ListInvoker.add(this.a, new jq_0(null));
        this.b = string;
    }

    public JH(String string, Throwable throwable) {
        super(throwable);
        ListInvoker.add(this.a, new jq_0(null));
        this.b = string;
    }
}

