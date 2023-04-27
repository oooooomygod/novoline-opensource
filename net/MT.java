/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.events.events.GuiMoveUpdateEvent;
import cc.novoline.invoke.EventManagerInvoker;
import cc.novoline.invoke.GameSettingsInvoker;
import cc.novoline.invoke.ModuleInvoker;
import deobf.GameSettings;
import deobf.ModuleRegistry;
import net.ChestStealer;
import net.MovementInput;
import net.UhcCrafts;
import net.alu_0;
import net.arw_1;
import net.ty_2;

public class MT
extends MovementInput {
    private GameSettings e;

    @Override
    public void e() {
        this.b(0.0f);
        this.a(0.0f);
        if (GameSettingsInvoker.e(this.e.cd)) {
            this.a(this.a() + 1.0f);
        }
        if (GameSettingsInvoker.e(this.e.L)) {
            this.a(this.a() - 1.0f);
        }
        if (GameSettingsInvoker.e(this.e.ac)) {
            this.b(this.b() + 1.0f);
        }
        if (GameSettingsInvoker.e(this.e.ab)) {
            this.b(this.b() - 1.0f);
        }
        this.a(GameSettingsInvoker.e(this.e.bo));
        this.b(GameSettingsInvoker.e(this.e.A));
        if (this.c()) {
            this.b(this.b() * 0.3f);
            this.a(this.a() * 0.3f);
        }
        ChestStealer chestStealer = (ChestStealer)ModuleInvoker.isEnable(ModuleRegistry.CHESTSTEALER);
        UhcCrafts uhcCrafts = (UhcCrafts)ModuleInvoker.isEnable(ModuleRegistry.UHCCRAFTS);
        GuiMoveUpdateEvent guiMoveUpdateEvent = new GuiMoveUpdateEvent();
        EventManagerInvoker.call(guiMoveUpdateEvent);
        if (ty_2.a(chestStealer) || alu_0.b(uhcCrafts) || arw_1.a(guiMoveUpdateEvent)) {
            this.b(0.0f);
            this.a(0.0f);
        }
    }

    public MT(GameSettings gameSettings) {
        this.e = gameSettings;
    }
}

