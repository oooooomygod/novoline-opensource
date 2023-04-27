/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
package net.minecraft.command;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import deobf.ICommandManager;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.block.BlockPos;
import net.FG;
import net.HX;
import net.ICommand;
import net.ICommandSender;
import net.XO;
import net.a1c;
import net.a9N;
import net.aIW;
import net.aL0;
import net.aRF;
import net.aS0;
import net.alj_1;
import net.aml_2;
import net.ans_2;
import net.anw_0;
import net.aoz_1;
import net.axe_2;
import net.ays_0;
import net.dz_0;
import net.ht_1;
import net.ip_2;
import net.jz_0;
import net.my_0;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class CommandHandler
implements ICommandManager {
    private static long e = a1c.a(-7858834069007402260L, 2624605978059320159L, MethodHandles.lookup().lookupClass()).a(226231068942084L);
    private static Logger a = LogManagerInvoker.c();
    protected Map<String, ICommand> b = MapsInvoker.a();
    private Set<ICommand> c = axe_2.a();
    private String d;

    @NotNull
    protected static String[] a(@NotNull String[] stringArray) {
        String[] stringArray2 = new String[stringArray.length - 1];
        SystemInvoker.a(stringArray, 1, stringArray2, 0, stringArray.length - 1);
        return stringArray2;
    }

    public CommandHandler(@NotNull String string) {
        this.d = string;
    }

    private int a(ICommand iCommand, String[] stringArray) {
        for (int i = 0; i < stringArray.length; ++i) {
            if (!XO.a(iCommand, stringArray, i) || !ans_2.b(stringArray[i])) continue;
            return i;
        }
        return -1;
    }

    protected boolean a(ICommandSender iCommandSender, String[] stringArray, ICommand iCommand, String string) {
        long l4 = e ^ 0xAD8C39981B8L;
        long l5 = l4 ^ 0x70FDFF49DE29L;
        int n = (int)(l5 >>> 56);
        long l6 = l5 << 8 >>> 8;
        try {
            XO.a((byte)n, l6, iCommand, iCommandSender, stringArray);
            return true;
        }
        catch (ip_2 ip_22) {
            aoz_1 aoz_12 = new aoz_1(jz_0.e, new aoz_1(ip_22.getMessage(), aRF.a(ip_22)));
            HX.a(aIW.a(aoz_12), anw_0.RED);
            alj_1.a(iCommandSender, aoz_12);
        }
        catch (ht_1 ht_12) {
            aoz_1 aoz_13 = new aoz_1(ht_12.getMessage(), aml_2.a(ht_12));
            HX.a(aIW.a(aoz_13), anw_0.RED);
            alj_1.a(iCommandSender, aoz_13);
        }
        catch (Throwable throwable) {
            LoggerInvoker.warn(a, aL0.a(aL0.a(aL0.a(new StringBuilder(), jz_0.g), string), jz_0.c).toString());
            aoz_1 aoz_14 = new aoz_1(jz_0.b, new Object[0]);
            HX.a(aIW.a(aoz_14), anw_0.RED);
            alj_1.a(iCommandSender, aoz_14);
        }
        return false;
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, @NotNull String string, BlockPos blockPos) {
        String[] stringArray = StringInvoker.a(string, jz_0.f, -1);
        String string2 = stringArray[0];
        if (stringArray.length == 1) {
            ArrayList arrayList = my_0.c();
            Iterator iterator = aS0.f(MapInvoker.b(this.b));
            while (dz_0.c(iterator)) {
                Map.Entry entry = (Map.Entry)dz_0.b(iterator);
                if (!ays_0.a(string2, (String)FG.b(entry)) || !XO.a((ICommand)FG.a(entry), iCommandSender)) continue;
                ListInvoker.add(arrayList, FG.b(entry));
            }
            return arrayList;
        }
        ICommand iCommand = (ICommand)MapInvoker.c(this.b, string2);
        if (XO.a(iCommand, iCommandSender)) {
            return XO.a(iCommand, iCommandSender, CommandHandler.a(stringArray), blockPos);
        }
        return null;
    }

    @Override
    public int a(ICommandSender iCommandSender, String string) {
        if (StringInvoker.e(string = StringInvoker.h(string), this.d)) {
            string = StringInvoker.a(string, 1);
        }
        String[] stringArray = StringInvoker.g(string, jz_0.h);
        String string2 = stringArray[0];
        stringArray = CommandHandler.a(stringArray);
        ICommand iCommand = (ICommand)MapInvoker.c(this.b, string2);
        this.a(iCommand, stringArray);
        int n = 0;
        aoz_1 aoz_12 = new aoz_1(jz_0.a, new Object[0]);
        HX.a(aIW.a(aoz_12), anw_0.RED);
        alj_1.a(iCommandSender, aoz_12);
        alj_1.a(iCommandSender, a9N.SUCCESS_COUNT, n);
        return n;
    }

    public void a(ICommand iCommand) {
        MapInvoker.c(this.b, XO.a(iCommand), iCommand);
        aS0.b(this.c, iCommand);
        Iterator iterator = ListInvoker.iterator(XO.b(iCommand));
        while (dz_0.c(iterator)) {
            String string = (String)dz_0.b(iterator);
            ICommand iCommand2 = (ICommand)MapInvoker.c(this.b, string);
            if (XO.a(iCommand2).equals(string)) continue;
            MapInvoker.c(this.b, string, iCommand);
        }
    }

    @Override
    public List<ICommand> a(ICommandSender iCommandSender) {
        ArrayList arrayList = my_0.c();
        Iterator iterator = aS0.f(this.c);
        while (dz_0.c(iterator)) {
            ICommand iCommand = (ICommand)dz_0.b(iterator);
            if (!XO.a(iCommand, iCommandSender)) continue;
            ListInvoker.add(arrayList, iCommand);
        }
        return arrayList;
    }

    @Override
    public Map<String, ICommand> a() {
        return this.b;
    }
}

