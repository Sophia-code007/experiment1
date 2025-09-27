public class PrimeNumbers {
    public static void main(String[] args) {
        int max = 20000;
        // 创建布尔数组标记是否为素数
        boolean[] isPrime = new boolean[max + 1];
        
        // 初始化：所有数默认视为素数
        for (int i = 2; i <= max; i++) {
            isPrime[i] = true;
        }
        
        // 0和1不是素数
        isPrime[0] = false;
        isPrime[1] = false;
        
        // 埃拉托斯特尼筛法：标记非素数
        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) { // 如果i是素数，标记其倍数为非素数
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        // 输出所有素数，每10个换一行
        int count = 0;
        System.out.println("1-20000内的所有素数：");
        for (int i = 2; i <= max; i++) {
            if (isPrime[i]) {
                System.out.print(i + "\t");
                count++;
                if (count % 10 == 0) { // 每10个素数换行
                    System.out.println();
                }
            }
        }
    }
}
