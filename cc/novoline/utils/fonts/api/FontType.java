/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.utils.fonts.api;

import net.asx_2;

public enum FontType {
    DM(asx_2.au),
    FIXEDSYS(asx_2.P),
    ICONFONT(asx_2.y),
    OXIDE(asx_2.al),
    VERDANA(asx_2.c),
    NOTIFICATIONS(asx_2.k),
    JETBRAINS(asx_2.n),
    CONFIGS(asx_2.am),
    POSTERAMA(asx_2.v),
    ARIALMEDIUM(asx_2.D),
    MUSEOREGULAR(asx_2.ax),
    MUSEOMEDIUM(asx_2.H),
    MUSEOBOLD(asx_2.J),
    ROBOTO(asx_2.aB),
    ROBOTOMED(asx_2.h),
    ROBOTOBOLD(asx_2.aa),
    MONTSERRAT(asx_2.ah),
    POPPIN(asx_2.aD),
    WEXICONS(asx_2.x),
    ICONFONT2(asx_2.ai),
    NOTIF(asx_2.a),
    PROFILES(asx_2.m),
    NOVOGUI(asx_2.d),
    NOTIFICATIONS_OLD(asx_2.j),
    SF_REGULAR(asx_2.aw),
    SF_MEDIUM(asx_2.s),
    SF_BOLD(asx_2.an),
    VOLTE_BOLD(asx_2.K),
    VOLTE_MEDIUM(asx_2.ac),
    VOLTE_REGULAR(asx_2.I),
    INTER_REGULAR(asx_2.ae),
    INTER_MEDIUM(asx_2.aq),
    INTER_BOLD(asx_2.at),
    POPPING_REGULAR(asx_2.w),
    POPPING_MEDIUM(asx_2.E),
    POPPING_BOLD(asx_2.C),
    JETBRAINS_REGULAR(asx_2.o),
    JETBRAINS_MEDIUM(asx_2.u),
    JETBRAINS_BOLD(asx_2.O),
    MINECRAFT(asx_2.S),
    SESSION_ICONS(asx_2.as);

    private static int[] b;
    private String d;

    static {
        FontType.b(new int[3]);
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    private FontType(String string2) {
        this.d = string2;
    }

    public static int[] b() {
        return b;
    }

    public String c() {
        return this.d;
    }
}

