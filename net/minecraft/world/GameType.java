/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world;

import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.modules.visual.ClickGui;
import deobf.ModuleRegistry;
import net.aCM;
import net.aSY;
import net.abb_2;
import net.aiu_1;
import net.tx_2;
import net.z4_0;

public enum GameType {
    NOT_SET(-1, aiu_1.j),
    SURVIVAL(0, aiu_1.c),
    CREATIVE(1, aiu_1.g),
    ADVENTURE(2, aiu_1.b),
    SPECTATOR(3, aiu_1.i);

    String a;
    int c;

    public boolean a() {
        return this == SURVIVAL || this == ADVENTURE;
    }

    public int d() {
        return this.c;
    }

    public boolean e() {
        return this == ADVENTURE || this == SPECTATOR;
    }

    public static GameType a(String string) {
        for (GameType gameType : GameType.values()) {
            if (!gameType.a.equals(string)) continue;
            return gameType;
        }
        return SURVIVAL;
    }

    public void a(tx_2 tx_22) {
        if (this == CREATIVE) {
            aSY.b(tx_22, true);
            aSY.a(tx_22, true);
            aSY.d(tx_22, true);
        } else if (this == SPECTATOR) {
            aSY.b(tx_22, true);
            aSY.a(tx_22, false);
            aSY.d(tx_22, true);
            aSY.e(tx_22, true);
        } else {
            aSY.b(tx_22, false);
            aSY.a(tx_22, false);
            aSY.d(tx_22, false);
            aSY.e(tx_22, false);
        }
        aSY.c(tx_22, !this.e());
        if (aCM.d() && !aSY.g(tx_22) && (aCM.a(abb_2.NONE) || aCM.a(abb_2.SG))) {
            z4_0.a((ClickGui)ModuleInvoker.isEnable(ModuleRegistry.CLICKGUI), abb_2.LOBBY);
        }
    }

    private GameType(int n2, String string2) {
        this.c = n2;
        this.a = string2;
    }

    public String b() {
        return this.a;
    }

    public boolean c() {
        return this == CREATIVE;
    }

    public static GameType a(int n) {
        for (GameType gameType : GameType.values()) {
            if (gameType.c != n) continue;
            return gameType;
        }
        return SURVIVAL;
    }
}

