class android : WebView {

    fun loadUrlAndClearHistory(url: String) {
        clearHistoryOnNextPageLoad = true
        clearHistory()
        loadUrl(url)
    }

    @JavascriptInterface
    fun handleNative(message: String) {
        val aaa = "AAAAA"
    }

    fun testJSEnabled1() {
        mWebView.getSettings().setJavaScriptEnabled(true)
    }

    fun testJSEnabled2() {
        webSettings.javaScriptEnabled = true

        myWebView.webViewClient = WebViewClient()
        myWebView.settings.setAppCacheEnabled(true)
        myWebView.settings.setCacheMode(WebSettings.LOAD_DEFAULT)
        myWebView.settings.setAllowFileAccess(true);
    }

    fun test3() {

        webView.getSettings().setAllowFileAccess(true)

        webView.getSettings().setAllowFileAccessFromFileURLs(true)

        webView.getSettings().setAllowUniversalAccessFromFileURLs(true)

        webView.getSettings().setAllowContentAccess(true)

        addJavascriptInterface(
                JSBridge(context, config), JAVA_SCRIPT_INTERFACE
            )


    }

    fun test4() {

        settings.allowFileAccess = true

        settings.allowFileAccessFromFileURLs = true

        settings.allowUniversalAccessFromFileURLs = true

        settings.allowContentAccess = true


    }


    fun test5() {

        allowFileAccess = true

        allowFileAccessFromFileURLs = true

        allowUniversalAccessFromFileURLs = true

        allowContentAccess = true


    }    

    override fun test6(view: View, savedInstanceState: Bundle?) {


        with(binding.webView) {
            webViewClient = WebViewClient()
            settings.javaScriptEnabled = true
            settings.allowFileAccess = true
            settings.domStorageEnabled = true
            settings.databaseEnabled = true
            settings.setAppCacheEnabled(true)

            if (savedInstanceState == null) {
                loadUrl(arguments.url)
            }
        }
    }

}