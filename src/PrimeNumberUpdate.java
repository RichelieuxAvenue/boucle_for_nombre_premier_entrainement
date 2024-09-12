public class PrimeNumberUpdate {
    public static boolean isPrime(int n) {
        //version plus précise avec les exceptions
        if (n < 2){
            return false;
        }
        if (n == 2){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            //Le fait d'utiliser la racine carrée permet de diminuer le nombre d'itération afin d'éviter d'aller jusque n
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void showPrimeNumber(int start, int end) {
        //Méthode qui sera affiché les nombres premiers dans un intervalle avec les deux extrémités comprises
        for (int i = start;i <= end;i++){
            if (isPrime(i)){
                System.out.printf("%d est un nombre premier%n", i);
            }
        }
    }
    public static void main(String[] args) {
        showPrimeNumber(1, 50);
    }
}
