public class Main {
    public static void main(String[] args) {
        for (int i=1;i<100000;i++){
            //solution for i
            int totalI=0;
            for (int i1=1;i1<i;i1++){
                if (i%i1==0){
                    totalI+=i1;
                }
            }
            //solution for j
            int j= totalI;
            int totalJ=0;
            for (int j1=1;j1<j;j1++){
                if (j%j1==0){
                    totalJ+=j1;
                }
            }
            if (i==totalJ){
                System.out.println("Arkadaş sayılar bulundu : "+ i+ " ve "+ j);
            }
        }
    }
}