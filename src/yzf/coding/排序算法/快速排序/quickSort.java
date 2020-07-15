快排思想：挖坑填数 + 分治法     实现 递归方式
  #1、从要排序的数据中取一个数为“基准数”。
	#2、通过一趟排序将要排序的数据分割成独立的两部分，其中左边的数据都比“基准数”小，右边的数据都比“基准数”大。
	#3、然后再按步骤2对这两部分数据分别进行快速排序，整个排序过程可以递归进行，以此达到整个数据变成有序序列。

void quickSort(int[] array,int start,int end){
    if(start>end){
             return;
           }
    int i=start,j=end,flg=i;
    while(i<j){
         while(i<j&&array[j]>=flg)  j--;
         if(i<j) {
             array[i++]=array[j];
         }
         while(i<j&&array[i]<flg) i++;
         if(i<j){
             array[j--]=array[i];
        }
    }
    array[i]=flg;
    quickSort(array,start,i-1);
    quickSort(array,i+1,end);
}
