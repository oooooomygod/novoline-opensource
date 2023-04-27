/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.modules.AbstractModule;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.aB0;
import net.aMF;
import net.ahg_0;

/*
 * Renamed from net.wE
 */
public class we_1 {
    private static List<Setting> a = new CopyOnWriteArrayList<Setting>();

    private static boolean lambda$getSettingsByMod$0(AbstractModule abstractModule, Setting setting) {
        return ahg_0.C(setting).equals(abstractModule);
    }

    public static List<Setting> a() {
        return a;
    }

    public static List<Setting> a(AbstractModule abstractModule) {
        return (List)aMF.a(aMF.b(ListInvoker.stream(a), arg_0 -> we_1.lambda$getSettingsByMod$0(abstractModule, arg_0)), aB0.a(CopyOnWriteArrayList::new));
    }

    public static void a(Setting setting) {
        ListInvoker.add(a, setting);
    }
}

