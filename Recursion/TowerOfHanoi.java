package Recursion;
class TowerOfHanoi {
    public static void towerOfHanoi(int n,char frompeg,char topeg,char auxpeg){
        if(n == 0) return;
        if(n == 1) {
        System.out.println("Move disk 1 from peg " + frompeg + " to peg " + topeg);
        return;
        }
        
        towerOfHanoi(n - 1,frompeg,auxpeg,topeg);
        System.out.println("Move disk " + n + " from peg " + frompeg + " to peg" + topeg);
        towerOfHanoi(n - 1,auxpeg,topeg,frompeg);

    }
    public static void main(String[] args) {
         towerOfHanoi(3,'A','B','C');
    }
}
