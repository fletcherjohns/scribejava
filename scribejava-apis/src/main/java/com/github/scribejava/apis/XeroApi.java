package com.github.scribejava.apis;

import com.github.scribejava.core.builder.api.DefaultApi10a;
import com.github.scribejava.core.model.OAuth1RequestToken;

public class XeroApi extends DefaultApi10a {

    private static final String AUTHORIZE_URL = "https://api.xero.com/oauth/Authorize?oauth_token=%s";
    private static final String REQUEST_TOKEN_URL = "https://api.xero.com/oauth/RequestToken";
    private static final String ACCESS_TOKEN_URL = "https://api.xero.com/oauth/AccessToken";

    protected XeroApi() {
    }

    private static class InstanceHolder {
        private static final XeroApi INSTANCE = new XeroApi();
    }

    public static XeroApi instance() {
        return InstanceHolder.INSTANCE;
    }

    @Override
    public String getRequestTokenEndpoint() {
    return REQUEST_TOKEN_URL;
    }

    @Override
    public String getAccessTokenEndpoint() {
        return ACCESS_TOKEN_URL;
    }

    @Override
    public String getAuthorizationUrl(OAuth1RequestToken requestToken) {
        return  String.format(AUTHORIZE_URL, requestToken.getToken());
    }
}
