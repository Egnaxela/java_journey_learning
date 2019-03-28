#### Forward
**若未做特殊说明默认基于JDK1.8**

ArrayList  
ArrayList底层维护一个Object[]的数组，通过对数组的动态扩容来实现数据的存放。

默认提供了三个构造方法
```java
public class ArrayList<E> extends AbstractList<E>
        implements List<E>, RandomAccess, Cloneable, java.io.Serializable{
        
     transient Object[] elementData; //Object[]数组，使用transient关键字表明该元素不被序列化  
        
    //自定义初始化长度的数组的构造方法
    public ArrayList(int initialCapacity) {
        super();
        if (initialCapacity < 0)
            throw new IllegalArgumentException("Illegal Capacity: "+
                                               initialCapacity);
        this.elementData = new Object[initialCapacity];
    }
    
    
    private static final Object[] EMPTY_ELEMENTDATA = {};
    //无参的构造方法会初始化一个为空的数组
    public ArrayList() {
        super();
        this.elementData = EMPTY_ELEMENTDATA;
    }
    
    //带Collection类型参数的构造方法
    public ArrayList(Collection<? extends E> c) {
        elementData = c.toArray();
        size = elementData.length;
        // c.toArray might (incorrectly) not return Object[] (see 6260652)
        if (elementData.getClass() != Object[].class)
            elementData = Arrays.copyOf(elementData, size, Object[].class);
    }
 ...
}       
```
关于[Bug 6260652](https://bugs.java.com/bugdatabase/view_bug.do?bug_id=6260652)
