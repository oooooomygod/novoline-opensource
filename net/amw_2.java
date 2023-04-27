/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  tv.twitch.broadcast.IStatCallbacks
 *  tv.twitch.broadcast.StatType
 */
package net;

import net.aR3;
import net.ard_2;
import tv.twitch.broadcast.IStatCallbacks;
import tv.twitch.broadcast.StatType;

/*
 * Renamed from net.amw
 */
class amw_2
implements IStatCallbacks {
    aR3 a;

    amw_2(aR3 aR32) {
        this.a = aR32;
    }

    public void statCallback(StatType statType, long l4) {
        switch (statType) {
            case TTV_ST_RTMPSTATE: {
                this.a.d = ard_2.a((int)l4);
                break;
            }
            case TTV_ST_RTMPDATASENT: {
                this.a.B = l4;
            }
        }
    }
}

