package practice;


public class randomNumber {
    public static void main(String[] args) {
        int[] arr2 = new int[6];
        for(int i = 0; i < arr2.length; i ++){
            arr2[i]=(int)(Math.random()*30)+1;
            boolean isFlag = false;
            while (true) {
                for(int j = 0; j < i; j ++){
                    if(arr2[i] == arr2[j]){
                        isFlag=true;
                        break;
                    }
                }
                if(isFlag){
                    arr2[i]=(int)(Math.random()*30)+1;
                    isFlag=false;
                    continue;
                }
                break;
            }
        }
        for(int j = 0; j < arr2.length; j ++){
            System.out.println(arr2[j]);
        }
    }
}
