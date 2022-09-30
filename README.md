# semgrep-rules

Some Semgrep rules I developed during penetration testing.

These rules were developed quickly during my everyday activities when I could not find what I needed in the official rules repository. Consequently surely they can be improved in speed and coverage, but they do their job.

Most of them have also a "potential" version that adds more results but that increase the number of false positives. Usually, I prefer to review more false positives than to miss a finding, but depends on the specific assessment and on the number of them.

## PHP

### Language

* **sql-injection-php-apps3c.yaml**
* **sql-injection-php-potential-apps3c.yaml**

### YII framework

* **auth-bypass-yii-framework-apps3c.yaml**
* **auth-bypass-yii-framework-potential-apps3c.yaml**
* **sql-injection-yii-framework-apps3c.yaml** (it may works also on other frameworks that uses similar query structures, e.g. "select(...)")
* **sql-injection-yii-framework-potential-apps3c.yaml** (it may works also on other frameworks that uses similar query structures", e.g. "select(...)")
* **xss-yii-framework-potential-apps3c.yaml**

## Kotlin

### Language

* **sql-injection-kotlin-apps3c.yaml**
* **sql-injection-kotlin-potential-apps3c.yaml**

### Android WebView

* **android-webview-kotlin-apps3c.yaml**

## Java

### Android WebView

* **android-webview-java-apps3c.yaml**
