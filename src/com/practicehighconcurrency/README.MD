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
#### synchronized内部锁 与  ReentrantLock重入锁
异同：

1、ReentrantLock与Synchronized都是可以重入锁的。

2、ReentrantLock是基于JDK实现的，而Synchronized是基础JVM实现的。

3、ReentrantLock需要手工声明加锁和释放锁，一般来说最好在finally中声明释放锁。

公平锁：每个线程获取锁的顺序为先后调用lock方法的顺序，类似排队

非公平锁：每个线程获取锁的顺序不确定，随机获取，类似摇号

ReentrantLock重入锁特性：

1、可以指定公平锁还是非公平锁，而synchronized只能是非公平锁。可以通过构造方法的初始值来决定
```java
public class ReentrantLock implements Lock,java.io.Serializable{
···
private final Sync sync;
public ReentrantLock(){
  sync=new NonfairSync();//默认是非公平锁
}

public ReentrantLock(boolean fair){
  sync=fair?new FairSync():new NonfairSync();
}
···
}

```

2、ReentrantLock提供一个Condition（条件），可以用来分组唤醒等待的线程，而不是像synchronized随机唤醒一个或全部唤醒。
如[ReenterLockCondition.java](https://github.com/Egnaxela/java_journey_learning/blob/master/src/com/practicehighconcurrency/chapter3/ReenterLockCondition.java)

3、ReentrantLock提供了一种能够中断等待锁的线程的机制，通过lock.lockInterruptibly()来实现。
如[ReenterLock.java](https://github.com/Egnaxela/java_journey_learning/blob/master/src/com/practicehighconcurrency/chapter3/ReenterLock.java)<br/>
#### Semaphore信号量
Semaphore 实际是对锁的扩展，无论是内部锁还是重入锁一次都只允许一个线程访问一个资源，<br/>
而信号量可以指定多个线程同时访问一个资源。
如[SemaphoreDemo.java](https://github.com/Egnaxela/java_journey_learning/blob/master/src/com/practicehighconcurrency/chapter3/SemaphoreDemo.java)


#### ReadWriteLock读写分离锁 
理论上所有读之间、读与写之间、写和写之间都是串行操作。如果在系统中读操作次数远大于写操作，则读写锁可以发挥最大作用。



