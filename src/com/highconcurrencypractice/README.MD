
#### 并发编程Bug的源头
* 缓存导致的可见性问题
* 线程切换带来的原子性问题
* 编译优化带来的有序性问题

Java内存模型规范了 JVM 如何提供按需禁用缓存和编译优化的方法.
这些方法包括volatile、synchronize和final三个关键字以及六项Happens-Before规则