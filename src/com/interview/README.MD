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
        //如果调用toArray()后返回的泛型数组不是Object[]类型的，需要重新复制一份
        if (elementData.getClass() != Object[].class)
            elementData = Arrays.copyOf(elementData, size, Object[].class);
    }
 ...
}       
```
关于[Bug 6260652](https://bugs.java.com/bugdatabase/view_bug.do?bug_id=6260652)  
Arrays.asList(x).toArray().getClass() should be Object[].class  
在于Arrays.asList().toArray()    
```java
public class Arrays {

	public static <T> List<T> asList(T... a) {
    	return new ArrayList<>(a); //此处的ArrayList是它的一个内部类不是java.util.ArrayList
	}

	private static class ArrayList<E> extends AbstractList<E>
        implements RandomAccess, java.io.Serializable{
        private static final long serialVersionUID = -2764017481108945198L;
        private final E[] a;//此处的a是要调用toArray后返回的值，它并不是Object[]类型的 而是泛型的数组，即a可能为String[] Integer[] Object[]

        ArrayList(E[] array) {
            a = Objects.requireNonNull(array);
        }

        @Override
        public int size() {
            return a.length;
        }

        @Override
        public Object[] toArray() {
            return a.clone();
        }

        @Override
        @SuppressWarnings("unchecked")
        public <T> T[] toArray(T[] a) {
            int size = size();
            if (a.length < size)
                return Arrays.copyOf(this.a, size,
                                     (Class<? extends T[]>) a.getClass());
            System.arraycopy(this.a, 0, a, 0, size);
            if (a.length > size)
                a[size] = null;
            return a;
        }
	}
    ...
}
```
扩容机制
```java
	
	public boolean add(E e) {
        ensureCapacityInternal(size + 1);  // Increments modCount!!
        elementData[size++] = e;
        return true;
    }
    
    private void ensureCapacityInternal(int minCapacity) {
        if (elementData == EMPTY_ELEMENTDATA) {//如果是一个空的数组，则直接创建一个默认大小为10的数组
            minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
        }

        ensureExplicitCapacity(minCapacity);
    }

    private void ensureExplicitCapacity(int minCapacity) {
        modCount++;

        // overflow-conscious code
        //如果需要的存放空间数 大于  elementData的容积，就进行扩容
        if (minCapacity - elementData.length > 0)
            grow(minCapacity);
    }

    private void grow(int minCapacity) {
        // overflow-conscious code
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);//扩容的新数组为原来旧数组的容量的1.5倍
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        if (newCapacity - MAX_ARRAY_SIZE > 0)//如果新数组的容量大于允许的最大容量，则直接扩为最大容量 Integer.MAX_VALUE - 8
            newCapacity = hugeCapacity(minCapacity);
        // minCapacity is usually close to size, so this is a win:
        elementData = Arrays.copyOf(elementData, newCapacity);
    }
```

例子：[ArrayListTest](https://github.com/Egnaxela/java_journey_learning/blob/master/src/com/interview/daybyday/ArrayListTest.java)

