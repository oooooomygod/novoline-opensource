/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.script;

import cc.novoline.invoke.IOUtilsInvoker;
import cc.novoline.invoke.NovolineInvoker;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.attribute.FileAttribute;
import net.FB;
import net.a4E;
import net.aL0;
import net.abf_2;
import net.aev_1;
import net.da_0;
import net.skidunion.annotations;

public class ScriptFileUtil {
    @annotations
    public void writeFile(String string, String ... stringArray) {
        BufferedWriter bufferedWriter;
        block8: {
            ScriptWorld.b();
            String string2 = aL0.a(aL0.a(new StringBuilder(), NovolineInvoker.t(NovolineInvoker.getInstance())), string).toString();
            FileWriter fileWriter = null;
            if (aev_1.d(da_0.a(string2, new String[0]), new LinkOption[0])) {
                try {
                    aev_1.c(da_0.a(string2, new String[0]), new FileAttribute[0]);
                }
                catch (IOException iOException) {
                    a4E.b(iOException);
                }
            }
            try {
                fileWriter = new FileWriter(string2);
            }
            catch (IOException iOException) {
                a4E.b(iOException);
            }
            bufferedWriter = new BufferedWriter(fileWriter);
            abf_2.c(bufferedWriter);
            String[] stringArray2 = stringArray;
            int n = stringArray2.length;
            int n2 = 0;
            if (n2 >= n) break block8;
            String string3 = stringArray2[n2];
            abf_2.a(bufferedWriter, string3);
            abf_2.b(bufferedWriter);
            ++n2;
        }
        try {
            abf_2.a(bufferedWriter);
        }
        catch (IOException iOException) {
            a4E.b(iOException);
        }
    }

    @annotations
    public void createDirectory(String string) {
        String string2 = aL0.a(aL0.a(new StringBuilder(), NovolineInvoker.t(NovolineInvoker.getInstance())), string).toString();
        try {
            aev_1.a(da_0.a(string2, new String[0]), new FileAttribute[0]);
        }
        catch (IOException iOException) {
            a4E.b(iOException);
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @annotations
    public String readFile(String string) {
        try {
            return IOUtilsInvoker.a(new FileReader(aL0.a(aL0.a(new StringBuilder(), NovolineInvoker.t(NovolineInvoker.getInstance())), string).toString()));
        }
        catch (IOException iOException) {
            a4E.b(iOException);
            return FB.a;
        }
    }
}

