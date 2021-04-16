package asd.algoritma_pengurutan;
public class tugas_no1 {
    public static void insertionSort(int[] A) {
        for(int i = 1; i< A.length; i++) { //i=1 //i=2 //3
            int key = A[i]; //A[1]=7 //A[2]=9 //A[3]=13
            int j = i - 1; //j=0 //j=1 //j=2
            while ((j >= 0 )&&(A[j] > key)) { //
                
                
                A[j + 1] = A[j]; //
                j--;
            }
            A[j + 1] = key;
        }
    }
    public static void tampil(int data[]){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    System.out.println();
    }
    public static void main(String[] args){
        int A[] = {25, 7, 9, 13, 3};
       tugas_no1.tampil(A);
       tugas_no1.insertionSort(A);
       tugas_no1.tampil(A);
       
       System.out.print("INDAH YUNI SAPUTRI");
    }
}
        
        
        
        
        
        
    
  
