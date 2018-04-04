## 常用算法分析
### 基础篇：
一、排序算法<br/>
<ol>
<li>选择排序</li>
思想：
  
  依次从剩余元素中选出最小的值，放到对应的索引下标的位置上。
  先假定下标为i的元素为最小值，再依次取得下标为n的元素与之比较，
  若小于则交换位置。(n为 i+1 到 最后一位)。 i++。
  ```java
  public void selectionSort(int[] arr){
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
          if(arr[i]>arr[j]){
            swap(arr,i,j);
          }      
      }
    }
  }
  
  ```
  [SelectionSort.java](https://github.com/Egnaxela/java_journey_learning/blob/master/src/com/algorithm/sort/SelectionSort.java)
<li>插入排序</li>
思想：

  将一个元素插入到一个有序序列中，第一次一个元素不用插，从第二个元素开始与前面的有序序列比对插入。
  ```java
  public void insertionSort(int[] arr){
    for(int i=1;i<arr.length;i++){
      for(int j=i;j>0&&arr[j]>arr[j-1];j--){
          swap(arr,j,j-1);      
      }
    }
  }
  ```
  
  优化版本
  ```java
  public void insertionSort(int[] arr){
    for(int i=1;i<arr.length;i++){
      int temp=arr[i];
      int j;
      for(j=i;j>0&&arr[j-1]>temp;j--)
        arr[j]=arr[j-1];
      arr[j]=temp;
    }
  }
  
  ```
  [InsertionSort.java](https://github.com/Egnaxela/java_journey_learning/blob/master/src/com/algorithm/sort/InsertionSort.java)
  与选择排序最大的区别在于内层循环可以提前终止。这样在近乎有序的序列中，最优的时间复杂度可为 O(n) .
</ol>

### 进阶篇：


### 常见经典问题
<ul>
<li>Top K问题</li>
从10亿个数字的文本中，找出最大的前1000个数<br/>
思路:

<ul><li>
  
[小顶堆](http://b18d7b23.wiz03.com/share/s/2NznIz3wXkFc23YdT71GMR-R325xFI2vrAe42_axYs3kj9nX) (大顶堆 -> 最小100个数)</li>
<li>Quick Select算法(Tony Hoare)</li>
</ul>

</ul>
