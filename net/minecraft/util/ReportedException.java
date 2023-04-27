/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import cc.novoline.invoke.CrashInvoker;
import net.CrashReport;

public class ReportedException
extends RuntimeException {
    private CrashReport a;

    @Override
    public String getMessage() {
        return CrashInvoker.a(this.a);
    }

    public CrashReport a() {
        return this.a;
    }

    @Override
    public Throwable getCause() {
        return CrashInvoker.e(this.a);
    }

    public ReportedException(CrashReport crashReport) {
        this.a = crashReport;
    }
}

