# 实战Java高并发程序设计

## 第二章
Thread.sleep()签名如下：<br/>
```java
public static native void sleep(long millis) throws InterruptedException; 
```
InterruptedException不是运行时异常，程序必须捕获处理。

Object中wait、notify方法签名如下：<br/>
```java
public final native void notify();
public final void wait() throws InterruptedException{
  wait(0);
}
```
非线性安全的Collection 如[ArrayListMultiThread](https://github.com/Egnaxela/java_journey_learning/blob/master/src/com/practicehighconcurrency/collections/ArrayListMultiThread.java)  [HashMapMultiThread](https://github.com/Egnaxela/java_journey_learning/blob/master/src/com/practicehighconcurrency/collections/HashMapMultiThread.java)

## 第三章
synchronized内部锁 与  ReentrantLock重入锁



Semaphore信号量
Semaphore 实际是对锁的扩展，无论是内部锁还是重入锁一次都只允许一个线程访问一个资源，<br/>
而信号量可以指定多个线程同时访问一个资源。




