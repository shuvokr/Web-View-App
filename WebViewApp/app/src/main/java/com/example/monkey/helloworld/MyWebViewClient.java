package com.example.monkey.helloworld;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Monkey on 7/15/2016.
 */
public class MyWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if (url.startsWith("moviezr:")) {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(url));
            StartActivity(intent);
            view.reload();
            return true;
        }

        view.loadUrl(url);
        return true;
    }

    private void StartActivity(Intent intent) {
    }
}
