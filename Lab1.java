import static java.lang.Math.*;

public class Lab1{

	public static int n3(int a){
		int b = a * 2 + 3;
		return b;
	}

	public static double r57(){
		double a = random() * 12.0 - 5.0;
		return  a;
	}

	public static double f1(double a){
		double a = tan(tan(cbrt(a / 2.0)));
		return a;
	}

	public static double f2(double a){
		double b = pow(8.0 * pow(3.0 / (3.0 + a), 9.0), pow(cbrt(a) / 12.0, 2.0) / (1.0 - pow(0.5 / a, a / 3.0)));
		return b;
	}

	public static double f3(double a){
		double b = cbrt(pow(2.0 * a, 2.0) / (2.0 - pow(a * (PI - a), 2.0)));
		return b;
	}

	public static void main(String[] args){
		final int N = 15, M = 9;

		short[] d = new short[M];
		for(int i = 0; i < M; i++){
			d[i] = (short) n3(i);
		}

		double[] x = new double[N];
		for(int i = 0; i < n; i++){
			x[i] = r57();
		}

		double[][] q = new double[M][N];
		for(int i = 0; i < M; i++){

			if(d[i] == 13){
				for(int j = 0; j < N; j++){
					q[i][j] = f1(x[j]);
				}
			} else if(d[i] == 3 || d[i] == 5 || d[i] == 15 || d[i] == 17){
				for(int j=0; j < N; j++){
					q[i][j] = f2(x[j]);
				}
			} else {
				for(int j = 0; j < N; j++){
					q[i][j] = f3(x[j]);
				}
			}
		}

		for(int i = 0;i < M; i++){
			for(int j = 0; j < N; j++){
				System.out.printf("%.2f ", q[i][j]);
			}
			System.out.printf("\n");
		}
	}
}
