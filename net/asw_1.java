/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListeningExecutorService
 *  com.google.common.util.concurrent.MoreExecutors
 */
package net;

import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.ExecutorService;

/*
 * Renamed from net.asW
 */
public class asw_1 {
    public static ListeningExecutorService a(ExecutorService executorService) {
        return MoreExecutors.listeningDecorator((ExecutorService)executorService);
    }
}

