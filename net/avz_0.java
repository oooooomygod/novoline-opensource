/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  tv.twitch.ErrorCode
 *  tv.twitch.chat.IChatAPIListener
 */
package net;

import cc.novoline.invoke.StringInvoker;
import net.BM;
import net.G8;
import net.PG;
import net.asx_0;
import net.asy_1;
import net.awb_0;
import net.lf_2;
import tv.twitch.ErrorCode;
import tv.twitch.chat.IChatAPIListener;

/*
 * Renamed from net.aVz
 */
class avz_0
implements IChatAPIListener {
    G8 a;

    public void chatEmoticonDataDownloadCallback(ErrorCode errorCode) {
        if (lf_2.c(errorCode)) {
            this.a.f();
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public void chatShutdownCallback(ErrorCode errorCode) {
        if (lf_2.c(errorCode)) {
            ErrorCode errorCode2 = PG.a(this.a.k);
            if (lf_2.a(errorCode2)) {
                String string = lf_2.b(errorCode2);
                this.a.c(StringInvoker.a(asy_1.b, new Object[]{string}));
            }
            this.a.a(asx_0.Uninitialized);
        } else {
            this.a.a(asx_0.Initialized);
            this.a.c(StringInvoker.a(asy_1.a, new Object[]{errorCode}));
        }
        try {
            if (this.a.b != null) {
                awb_0.b(this.a.b, errorCode);
            }
        }
        catch (Exception exception) {
            this.a.c(exception.toString());
        }
    }

    avz_0(G8 g8) {
        this.a = g8;
    }

    public void chatInitializationCallback(ErrorCode errorCode) {
        if (lf_2.c(errorCode)) {
            BM.b(this.a.g, this.a.i);
            BM.a(this.a.g, this.a.e);
            this.a.b();
            this.a.a(asx_0.Initialized);
        } else {
            this.a.a(asx_0.Uninitialized);
        }
        try {
            if (this.a.b != null) {
                awb_0.a(this.a.b, errorCode);
            }
        }
        catch (Exception exception) {
            this.a.c(exception.toString());
        }
    }
}

