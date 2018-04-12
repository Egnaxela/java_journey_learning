# 实战Java高并发程序设计

## 第二章
Thread.sleep()签名如下：<br/>
```java
public static native void sleep(long millis) throws InterruptedException; 
```
InterruptedException不是运行时异常，程序必须捕获处理。

Object中wait、notify方法如下：<br/>
```java
public final native void notify();
public final void wait() throws InterruptedException{
  wait(0);
}
```
