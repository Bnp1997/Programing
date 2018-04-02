
import java.lang.Object;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public class Algorytmy {
    int a[] = new int[10];
    int n= 8;
    int x= 8;;
    int middle= 0;
    int left=0;
    int right= 0;

    public static void main (String[]agrs){

    }
    public static <T> void swap(T a, T b) {
        try {
            Field[] fields = a.getClass().getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                Object temp = field.get(a);
                field.set(a, field.get(b));
                field.set(b, temp);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    int WyszukiwanieBinarne(int a[], int n, int x){
    int left= 0;
    int right= n-1;

    while(left<= right) {
        int current= (left+right)/2;
        if (x == a[current]){
          return current;
        }else if (x <a[current]){
            right = current- 1;
        }else {
            left= current+1;
        }
    }
    return(-1);
    }

    void QuickSort(int a[], int left, int right){
    if (left < right){
        int m = left;
        for(int k= left+1; k <= right; ++k){
            if(a[k] <a[left]) swap(a[++m], a[k]);
        }
        swap(a[left], a[m]);
        QuickSort(a, left, m-1);
        QuickSort(a, m+1, right);
    }
    }
    // jakby tamten szit nie działał
    //void swap(int* x, int* y){
    //int tmp= *x; *x= *y; *y= tmp;

    int SortowanieScalanie(int a[], int left, int right){
        if(right>left){
            middle= (left+ right)/2;
            SortowanieScalanie(a,left,middle);
            SortowanieScalanie(a,middle+1,right);
            scalanie(a,left,middle,right);
        }
        return(1);
    }


}
