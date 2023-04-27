/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.http.HttpResponse
 *  org.apache.http.client.methods.CloseableHttpResponse
 *  org.apache.http.client.methods.HttpGet
 *  org.apache.http.client.methods.HttpUriRequest
 *  org.apache.http.impl.client.CloseableHttpClient
 *  org.json.JSONObject
 */
package cc.novoline.script;

import cc.novoline.invoke.IOUtilsInvoker;
import java.nio.charset.StandardCharsets;
import net.CE;
import net.V9;
import net.aXI;
import net.ch_2;
import net.pR;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.json.JSONObject;
import net.skidunion.annotations;

public class ScriptWebUtil {
    @annotations
    public JSONObject fetchJSON(String string) {
        try {
            CloseableHttpClient closeableHttpClient = CE.c();
            HttpGet httpGet = new HttpGet(string);
            CloseableHttpResponse closeableHttpResponse = aXI.a(closeableHttpClient, (HttpUriRequest)httpGet);
            return new JSONObject(IOUtilsInvoker.b(pR.a(V9.a((HttpResponse)closeableHttpResponse)), StandardCharsets.UTF_8));
        }
        catch (Exception exception) {
            ch_2.a(exception);
            return null;
        }
    }
}

