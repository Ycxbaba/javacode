package practice;

public class YangHuiAngle {
    public static void main(String[] args) {
        int[][] arr1 = new int[10][];
        for(int i = 0; i < arr1.length; i++){
            //����ÿ�и���
            arr1[i] = new int[i+1];
            //��β��ֵ
            arr1[i][0] = arr1[i][i] = 1;
            //����Ԫ�ظ�ֵ
            if(i >= 2){
                for(int j = 1; j < arr1[i].length - 1; j++){
                    arr1[i][j] = arr1[i-1][j] + arr1[i-1][j-1];
                }
            
            }
            //��������
            for(int k = 0; k < arr1[i].length; k++){
                System.out.print(arr1[i][k] + "  ");
            }
            System.out.println();
        }

    }
}
