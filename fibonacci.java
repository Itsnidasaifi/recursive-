public class fibonacci {
    static int  findnthFib(int n){
        if(n<=1){
            return n;
        }
        return findnthFib(n-1)+findnthFib(n-2);
    }
    public static void main(String[] args) {
        int number =findnthFib(6);
        System.out.println("the nth fibonacci number is " +number);;
        
    }
    
}
