class android {


    private void setupWebView(Activity activity, String string, boolean bl) {
        OSWebView oSWebView;
        this.webView.setVerticalScrollBarEnabled(false);
        this.webView.setHorizontalScrollBarEnabled(false);
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.addJavascriptInterface(new test2(this), "Android");
        
    }




    public void test() {

		webView.getSettings().setAllowFileAccess(true);

		webView.getSettings().setAllowFileAccessFromFileURLs(true);

		webView.getSettings().setAllowUniversalAccessFromFileURLs(true);

		webView.getSettings().setAllowContentAccess(true);


    }

    @JavascriptInterface
    public void test2(String name, String obj) {
        String te = "TE";
    }

}