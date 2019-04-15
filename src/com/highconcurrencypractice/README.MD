
#### 并发编程Bug的源头
* 缓存导致的可见性问题
* 编译优化带来的有序性问题
* 线程切换带来的原子性问题


Java内存模型规范了JVM如何按需禁用缓存、按需禁用编译优化的方法
这些方法包括volatile、synchronize和final三个关键字以及六项Happens-Before规则
volatile
 被volatile修饰的变量不写入缓存，且不参与重排序，这就解决了可见性与有序性的问题，
 但这是否保证了线程安全呢？答案是否定的，volatile无法保证原子性--引起并发过程中Bug的另一个源头。

Happens-Before规则
 所描述的是：先后发生的两个操作，其结果必须也体现操作的先后顺序，即： 前一个操作的结果对后续操作是可见的 。
1、程序的顺序性规则(程序前面对某个变量的修改一定是对后续操作可见的)
2、volatile(对一个volatile变量的写操作，Happens-Before于后续对这个volatile变量的读操作)
3、传递性(如果A Happens-Before B，且B Happens-Before C，那么A Happens-Before C)
4、管程中锁的规则(对一个锁的解锁Happens-Before于后续对这个锁的加锁)
5、线程start规则  (指主线程 A 启动子线程 B 后，子线程 B 能够看到主线程在启动子线程B之前的操作)
6、线程join规则 (指的是主线程A等待子线程B完成后，主线程能够看到子线程的操作)
