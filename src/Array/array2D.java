package Array;

public class array2D {

	public static void main(String[] args) {
		String data[][]=new String[3][2];
		data[0][0]="shrim";
		data[0][1]="Hrim";
		data[1][0]="krim";
		data[1][1]="trim";
		data[2][0]="lrim";
		data[2][1]="prim";
		
		
		System.out.println(data[0][1]);
		System.out.println(data.length);
		System.out.println(data[0].length);
		/*
		for (String[] s : data) {
			for (String k : s) {
				
			
			
			System.out.println(k);
			}
		}*/
		
		for(int i=0;i<data.length;i++){
			for(int j=0;j<data[0].length;j++){
				System.out.println(data[i][j]);
			}
		}

	}

}
