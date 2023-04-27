/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonParser
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.IOUtilsInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.common.base.Charsets;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import net.Ei;
import net.FG;
import net.M0;
import net.WN;
import net.a1r;
import net.a7k_0;
import net.aL0;
import net.aS0;
import net.aWM;
import net.dz_0;
import org.apache.logging.log4j.Logger;

/*
 * Renamed from net.Xf
 */
public class xf_0 {
    private Map<String, File> b;
    private static Logger a = LogManagerInvoker.c();

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    /*
     * Unable to fully structure code
     */
    public xf_0(File var1_1, String var2_2) {
        block11: {
            super();
            this.b = MapsInvoker.a();
            var3_3 = new File(var1_1, a7k_0.c);
            var4_4 = new File(var1_1, aL0.a(aL0.a(aL0.a(new StringBuilder(), a7k_0.d), var2_2), a7k_0.i).toString());
            var5_5 = null;
            try {
                var5_5 = aWM.a(var4_4, Charsets.UTF_8);
                var6_6 = WN.c(a1r.a(new JsonParser(), var5_5));
                var7_9 = Ei.a(var6_6, a7k_0.b, null);
                var8_10 = aS0.f(M0.a(var7_9));
                while (dz_0.c(var8_10)) {
                    var9_11 = (Map.Entry)dz_0.b(var8_10);
                    var10_12 = (JsonObject)FG.a(var9_11);
                    var11_13 = (String)FG.b(var9_11);
                    var12_14 = StringInvoker.a(var11_13, a7k_0.a, 2);
                    if (var12_14.length != 1) ** break block10
                    v0 = var12_14[0];
                    ** GOTO lbl24
                }
                break block11;
                {
                    try {
                        v0 = aL0.a(aL0.a(aL0.a(new StringBuilder(), var12_14[0]), a7k_0.f), var12_14[1]).toString();
lbl24:
                        // 2 sources

                        var13_15 = v0;
                        var14_16 = Ei.f(var10_12, a7k_0.e);
                        var15_17 = new File(var3_3, aL0.a(aL0.a(aL0.a(new StringBuilder(), StringInvoker.b(var14_16, 0, 2)), a7k_0.h), var14_16).toString());
                        MapInvoker.c(this.b, var13_15, var15_17);
                        continue;
                    }
                    catch (JsonParseException var6_7) {
                        LoggerInvoker.f(xf_0.a, aL0.a(aL0.a(new StringBuilder(), a7k_0.j), var4_4).toString());
                        IOUtilsInvoker.b(var5_5);
                    }
                    catch (FileNotFoundException var6_8) {
                        LoggerInvoker.f(xf_0.a, aL0.a(aL0.a(new StringBuilder(), a7k_0.g), var4_4).toString());
                        IOUtilsInvoker.b(var5_5);
                        break block11;
                        {
                            catch (Throwable var16_18) {
                                throw var16_18;
                                break;
                            }
                        }
                    }
                }
            }
            finally {
                IOUtilsInvoker.b(var5_5);
            }
        }
    }

    public Map<String, File> a() {
        return this.b;
    }
}

