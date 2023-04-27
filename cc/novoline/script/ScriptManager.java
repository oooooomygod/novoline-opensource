/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jdk.nashorn.api.scripting.NashornScriptEngineFactory
 */
package cc.novoline.script;

import cc.novoline.Novoline;
import cc.novoline.invoke.IOUtilsInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.script.Script;
import cc.novoline.modules.EnumModuleType;
import deobf.MCInvoker;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import jdk.nashorn.api.scripting.NashornScriptEngineFactory;
import net.minecraft.client.Minecraft;

public class ScriptManager {
    ScriptEngine d;
    public Minecraft b;
    ScriptEngineManager e;
    public List<Script> c = new CopyOnWriteArrayList<Script>();
    public List<AbstractModule> a;

    private static boolean lambda$getRegisteredModules$3(EnumModuleType enumModuleType, AbstractModule abstractModule) {
        return wc_1.d(abstractModule) == enumModuleType;
    }

    private static boolean lambda$removeScript$4(String string, Script script) {
        return asu_1.a(script).equals(string);
    }

    public List<Script> b() {
        return this.c;
    }

    public boolean d(String string) {
        Script.g();
        Iterator iterator = ListInvoker.iterator(this.c);
        if (dz_0.c(iterator)) {
            Script script = (Script)dz_0.b(iterator);
            if (script.e.equals(StringInvoker.a(string, (CharSequence)asc_1.g, (CharSequence)asc_1.h))) {
                return true;
            }
        }
        return false;
    }

    public void a(String string) {
        Script script;
        Script.g();
        Iterator iterator = ListInvoker.iterator(this.c);
        if (dz_0.c(iterator) && StringInvoker.d(asu_1.a(script = (Script)dz_0.b(iterator)), string)) {
            asu_1.c(script);
            asu_1.a(script, true);
        }
    }

    public Script b(String string) {
        Script.g();
        Iterator iterator = ListInvoker.iterator(this.c);
        if (dz_0.c(iterator)) {
            Script script = (Script)dz_0.b(iterator);
            if (script.e.equals(StringInvoker.a(string, (CharSequence)asc_1.n, (CharSequence)asc_1.b))) {
                return script;
            }
        }
        return null;
    }

    private void lambda$refreshScripts$1(Path path) {
        block5: {
            Script.g();
            if (this.d(ah__0.c(path).toString())) {
                try {
                    asu_1.a(this.b(ah__0.c(path).toString()), IOUtilsInvoker.a(new FileReader(ah__0.a(path).toString())));
                    break block5;
                }
                catch (IOException iOException) {
                    a4E.b(iOException);
                }
            }
            try {
                ListInvoker.add(this.c, new Script(StringInvoker.a(ah__0.c(path).toString(), (CharSequence)asc_1.k, (CharSequence)asc_1.d), IOUtilsInvoker.a(new FileReader(ah__0.a(path).toString()))));
            }
            catch (IOException iOException) {
                a4E.b(iOException);
            }
        }
    }

    private static boolean lambda$refreshScripts$0(Path path) {
        return aev_1.a(path, new LinkOption[0]);
    }

    public void c(String string) {
        try {
            aev_1.a(da_0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), NovolineInvoker.t(NovolineInvoker.getInstance())), asc_1.m), string), asc_1.l).toString(), new String[0]));
        }
        catch (IOException iOException) {
            a4E.b(iOException);
        }
        ListInvoker.removeIf(this.c, arg_0 -> ScriptManager.lambda$removeScript$4(string, arg_0));
    }

    /*
     * Loose catch block
     */
    public void a(Novoline novoline) {
        Object object;
        Object object2;
        block30: {
            Script.g();
            object2 = aev_1.a(da_0.a(aL0.a(aL0.a(new StringBuilder(), NovolineInvoker.t(novoline)), asc_1.a).toString(), new String[0]), new FileVisitOption[0]);
            object = null;
            aMF.a(aMF.b((Stream)object2, ScriptManager::lambda$refreshScripts$0), this::lambda$refreshScripts$1);
            try {
                aMF.a((Stream)object2);
            }
            catch (Throwable throwable2) {
                aWR.a((Throwable)object, throwable2);
                aMF.a((Stream)object2);
            }
            break block30;
            catch (Throwable throwable3) {
                object = throwable3;
                try {
                    throw throwable3;
                }
                catch (Throwable throwable2) {
                    try {
                        aMF.a((Stream)object2);
                    }
                    catch (Throwable throwable32) {
                        aWR.a((Throwable)object, throwable32);
                        aMF.a((Stream)object2);
                    }
                    try {
                        throw throwable2;
                    }
                    catch (IOException iOException) {
                        ea_1.a(System.err, asc_1.e);
                    }
                }
            }
        }
        object2 = ListInvoker.iterator(this.c);
        if (dz_0.c((Iterator)object2)) {
            Throwable throwable;
            Stream stream;
            block31: {
                Path path;
                object = (Script)dz_0.b((Iterator)object2);
                stream = aev_1.a(da_0.a(aL0.a(aL0.a(new StringBuilder(), NovolineInvoker.t(novoline)), asc_1.c).toString(), new String[0]), new FileVisitOption[0]);
                throwable = null;
                boolean bl = true;
                List list = (List)aMF.a(aMF.b(stream, ScriptManager::lambda$refreshScripts$2), aB0.a());
                Iterator iterator = ListInvoker.iterator(list);
                if (!dz_0.c(iterator) || !StringInvoker.a(ah__0.c(path = (Path)dz_0.b(iterator)).toString(), (CharSequence)asc_1.i, (CharSequence)asc_1.j).equals(asu_1.a((Script)object))) break block31;
                bl = false;
            }
            ListInvoker.remove(this.c, object);
            try {
                aMF.a(stream);
            }
            catch (Throwable throwable4) {
                aWR.a(throwable, throwable4);
            }
            {
                catch (Throwable throwable5) {
                    throwable = throwable5;
                    try {
                        throw throwable5;
                    }
                    catch (Throwable throwable6) {
                        try {
                            aMF.a(stream);
                        }
                        catch (Throwable throwable7) {
                            aWR.a(throwable, throwable7);
                            aMF.a(stream);
                        }
                        throw throwable6;
                        {
                            catch (IOException iOException) {
                                ea_1.a(System.err, asc_1.f);
                            }
                        }
                    }
                }
            }
        }
    }

    public List<AbstractModule> a(EnumModuleType enumModuleType) {
        return (List)aMF.a(aMF.b(ListInvoker.stream(this.a), arg_0 -> ScriptManager.lambda$getRegisteredModules$3(enumModuleType, arg_0)), aB0.a());
    }

    public List<AbstractModule> a() {
        return this.a;
    }

    private static boolean lambda$refreshScripts$2(Path path) {
        return aev_1.a(path, new LinkOption[0]);
    }

    public ScriptManager(Novoline novoline) {
        this.b = MCInvoker.f();
        this.e = new ScriptEngineManager();
        this.d = hl_0.a(new NashornScriptEngineFactory(), new aOM());
        this.a = new CopyOnWriteArrayList<AbstractModule>();
        this.a(novoline);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

