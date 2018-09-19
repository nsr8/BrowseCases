package com.zuhair.nasri.finalcases;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class ScrollingActivity extends Activity {

    //declare varialbes
    TextView tetTexttView;
    WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        webView = findViewById(R.id.webViewShowNote);


        //copied form stackexchange. This section does some magic that I do not fully understand
        //TREAT THE NEXT TO IF ELSES AS A BLACK BOX
        //-------------------------------DO NOT TOUCH -----------------------------------------------------
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            webView.setWebViewClient(new WebViewClient() {
                @Override
                public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                    if (webResourceRequest.getUrl().getScheme().equals("file")) {
                        webView.loadUrl(webResourceRequest.getUrl().toString());
                    } else {
                        // If the URI is not pointing to a local file, open with an ACTION_VIEW Intent
                        webView.getContext().startActivity(new Intent(Intent.ACTION_VIEW, webResourceRequest.getUrl()));
                    }
                    return true; // in both cases we handle the link manually
                }
            });
        } else {
            webView.setWebViewClient(new WebViewClient() {
                @Override
                public boolean shouldOverrideUrlLoading(WebView webView, String url) {
                    if (Uri.parse(url).getScheme().equals("file")) {
                        webView.loadUrl(url);
                    } else {
                        // If the URI is not pointing to a local file, open with an ACTION_VIEW Intent
                        webView.getContext().startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
                    }
                    return true; // in both cases we handle the link manually
                }
            });
        }
        //--------------------------------- DO NOT TOUCH -----------------------------------------------------------


        // TODO get and display topic in test activity
        /*tetTexttView =findViewById(R.id.testText);
        tetTexttView.setText(getIntent().getStringExtra("TOPIC"));*/


        if (getIntent().getStringExtra("SECTION").equals("About")) {
            //load the about documentation
            webView.loadUrl("file:///android_asset/aboutBrowseCases.html");

        }else if (getIntent().getStringExtra("SECTION").equals("Template")){
            // TODO display template page. delete after completion
            webView.loadUrl("file:///android_asset/template.html");

        }else if (getIntent().getStringExtra("SECTION").equals("Suggest new topic")) {
            //load html page of suggest content
            webView.loadUrl("file:///android_asset/suggest.html");
        }else if (getIntent().getStringExtra("SECTION").equals("feedback")){
            webView.loadUrl("file:///android_asset/issues.html");

        }else if (getIntent().getStringExtra("SECTION").equals("Goiters")) {
            //Goiter surgery short case
            webView.loadUrl("file:///android_asset/ss_goiters.html");



        } else {
           //catch all errors here
          webView.loadUrl("file:///android_asset/contribute.html");
        }


    }
}
