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
<li>插入排序</li>
</ol>

### 进阶篇：


### 常见经典问题
<ul>
<li>Top K问题</li>
从10亿个数字的文本中，找出最大的前1000个数<br/>
思路:

<ul><li>
  
[小顶堆](http://b18d7b23.wiz03.com/share/s/2NznIz3wXkFc23YdT71GMR-R325xFI2vrAe42_axYs3kj9nX) (大顶堆 -> 最小100个数)</li>
<li>Quick Select算法</li>
</ul>

</ul>
