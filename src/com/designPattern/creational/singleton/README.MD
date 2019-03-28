#### 创建型-单例模式
保证一个类仅有一个实例，并提供一个全局访问点。

懒汉式：只有使用时才去初始化实例，侧重于延迟加载。  
[LazySingleton](https://github.com/Egnaxela/java_journey_learning/blob/master/src/com/designPattern/creational/singleton/LazySingleton.java)   
[LazySingletonDoubleChecked](https://github.com/Egnaxela/java_journey_learning/blob/master/src/com/designPattern/creational/singleton/LazySingletonDoubleChecked.java)
  
饿汉式：在类初始化就初始化实例，如果不使用的话会造成内存浪费  
[HungrySingleton](https://github.com/Egnaxela/java_journey_learning/blob/master/src/com/designPattern/creational/singleton/HungrySingleton.java)

还有第三种方式来实现单例模式，就是使用Enum类
在《Effective Java 第二版》中的第三条规则中就推荐使用Enum类  
因为反射时使用Constructor.newInstance()的方法对枚举类进行特殊处理，如下
```java

    @CallerSensitive
    public T newInstance(Object ... initargs)
        throws InstantiationException, IllegalAccessException,
               IllegalArgumentException, InvocationTargetException
    {
        if (!override) {
            if (!Reflection.quickCheckMemberAccess(clazz, modifiers)) {
                Class<?> caller = Reflection.getCallerClass();
                checkAccess(caller, clazz, null, modifiers);
            }
        }
        //如果使用反射调用Enum类就会直接抛出“Cannot reflectively create enum objects” 异常
        if ((clazz.getModifiers() & Modifier.ENUM) != 0)
            throw new IllegalArgumentException("Cannot reflectively create enum objects");
        ConstructorAccessor ca = constructorAccessor;   // read volatile
        if (ca == null) {
            ca = acquireConstructorAccessor();
        }
        @SuppressWarnings("unchecked")
        T inst = (T) ca.newInstance(initargs);
        return inst;
    }
```
这样就可以避免了反射攻击。
同时枚举类也默认实现了Serializable接口    public abstract class Enum<E extends Enum<E>> implements Comparable<E>, Serializable {}
