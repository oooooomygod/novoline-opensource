/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.http.client.methods.CloseableHttpResponse
 *  org.apache.http.client.methods.HttpUriRequest
 *  org.apache.http.impl.client.CloseableHttpClient
 */
package net;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;

public class aXI {
    public static CloseableHttpResponse a(CloseableHttpClient closeableHttpClient, HttpUriRequest httpUriRequest) {
        return closeableHttpClient.execute(httpUriRequest);
    }
}

