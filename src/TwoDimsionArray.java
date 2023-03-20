public class TwoDimsionArray {
	public static void main(String args[]) {
      int aa[][] = new int[2][2];
       aa[0][0]= 4;
       aa[0][1]= 2;
       aa[1][0]= 3;
       aa[1][1]= 1;
       //System.out.println(aa[0][1]);
       for(int i=0;i<2;i++) {
    	   for(int j=0;j<2;j++) {
    		   System.out.print(aa[i][j]);
    	   }
    	   System.out.println();
       }
	}
}
