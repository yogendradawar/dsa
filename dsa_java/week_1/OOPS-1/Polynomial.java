public class Polynomial {
    int arr[];

    Polynomial() {
        arr = new int[10];
    }

    private void doubleCapacity(int degree) {
        int[] temp = arr;
        arr = new int[degree + 1];

        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
    }

    public void setCoefficient(int degree, int coeff) {
        if (degree > arr.length - 1) {
            doubleCapacity(degree);

        }

        arr[degree] = coeff;
    }

    public void print() {
        for(int i = 0 ; i < arr.length; i++) {
            if(arr[i] != 0){
        System.out.print(arr[i] +"x"+ i + " ");
            }
        }
    }


    public Polynomial add(Polynomial p){

        Polynomial ans = new Polynomial();
         
         int p1 = this.arr.length;
         int p2 = p.arr.length;

         int length = Math.min(p1,p2);

        int i = 0;
         for( ; i < length ; i++){
             ans.setCoefficient(i, this.arr[i] + p.arr[i]);
         }

         while(i<p1){
             ans.setCoefficient(i, this.arr[i]);
             i++;
         }

         while(i<p2){
             ans.setCoefficient(i, p.arr[i]);
             i++;
         }

         return ans;
}


public Polynomial subtract(Polynomial p){

    Polynomial ans = new Polynomial();

    int p1 = this.arr.length;
    int p2 = p.arr.length;

    int length = Math.min(p1,p2);

    int i =0;
    for(; i < length ; i++){
        ans.setCoefficient(i, this.arr[i] - p.arr[i]);
    }

    while(i<p1){
            ans.setCoefficient(i, this.arr[i]);
            i++;
    }

    while(i<p2){
        ans.setCoefficient(i, -p.arr[i]);
        i++;
    }

    return ans;
}


public Polynomial multiply(Polynomial p){
		
    Polynomial ans = new Polynomial();

    int p1 = this.arr.length;
    int p2 = p.arr.length;

    for(int i = 0 ; i < p1 ; i++){
        for(int j = 0 ; j < p2 ; j++){
            int tempdegree = i + j ;
            int tempcoeff = this.arr[i] * p.arr[j];
            // int oldcoeff = ans.getoldCoeff(tempdegree);
            ans.setCoefficient(tempdegree, tempcoeff);
        }
    }
    return ans;
}

public int getoldCoeff(int degree){
    if(degree < this.arr.length){
        return arr[degree];
    }
    else{
        return 0;
    }
}
























}
