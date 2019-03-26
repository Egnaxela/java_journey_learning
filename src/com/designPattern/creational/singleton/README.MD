#### 创建型-单例模式
保证一个类仅有一个实例，并提供一个全局访问点。

懒汉式：只有使用时才去初始化实例，侧重于延迟加载。
[LazySingleton]
[LazySingletonDoubleChecked]
饿汉式：在类初始化就初始化实例，如果不使用的话会造成内存浪费
[HungrySingleton]