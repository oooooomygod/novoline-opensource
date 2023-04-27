/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import net.IBlockState;
import net.MQ;
import net.OO;
import net.a6r_0;
import net.aRJ;
import net.atF;
import net.gm_1;

/*
 * Renamed from net.a6u
 */
class a6u_0
extends a6r_0 {
    atF b;

    @Override
    protected aRJ a(IBlockState iBlockState) {
        MQ mQ = (MQ)((Object)BlockStateInvoker.b(iBlockState, gm_1.P));
        switch (mQ) {
            default: {
                return new aRJ(OO.i, OO.d);
            }
            case CHISELED: {
                return new aRJ(OO.c, OO.h);
            }
            case LINES_Y: {
                return new aRJ(OO.e, OO.a);
            }
            case LINES_X: {
                return new aRJ(OO.j, OO.b);
            }
            case LINES_Z: 
        }
        return new aRJ(OO.f, OO.g);
    }

    a6u_0(atF atF2) {
        this.b = atF2;
    }
}

