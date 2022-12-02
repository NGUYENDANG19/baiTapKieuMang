package basic.dev;
import java.util.Random;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int [10];
		input (a);
		print(a);
		demChanle(a);
		sapXep(a);
		print(a);
		demsoNguyenTo(a);
		tongCuaMang(a);
		xuatHienNhieu(a);
	}

	private static void xuatHienNhieu(int[] a) {
		// TODO Auto-generated method stub
		int max = 0;
		int [] b = new int[a.length];
		for(int i = 0; i <a.length; i++) {
			for(int j = 0; j <= i; j++ ) 
				if (a[i] == a[j]) b[i]++;
			}
		max  = b[0];
		for(int i = 1; i< a.length; i++)
			if(b[i] > max ) max = b[i];
		for(int i = 0; i < a.length; i++)
			if (b[i] == max) System.out.println(" \n phan tu " + a[i] + " co so lan xuat hien la : " + max );
		}
	

	private static void tongCuaMang(int[] a) {
		// TODO Auto-generated method stub
		int tong = 0;
		for (int i = 0; i<a.length; i++)	{
			tong = tong + a[i];
		}
		System.out.println("tong cua mang la :" + tong);
			if(tong%2==0)	{
				System.out.format(" tong la so chan " );
			}else	{
				System.out.println(" tong la so  le  " );
			}
	}

	private static void demsoNguyenTo(int[] a) {
		// TODO Auto-generated method stub
		int dem = 0;
		for (int i = 0; i<a.length; i++)	{
			if(isPrimary(a[i]))
				dem++;
	}
		System.out.format("mang co so %d nguyen to ",dem).println();
	}
	private static void sapXep(int[] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i<a.length; i++)	{
		for (int j = i +1; j<a.length; j++)	{
			if(a[i] > a[j])	{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
	}
	}
	}
	private static void demChanle(int[] a) {
		// TODO Auto-generated method stub
		int demChan = 0;
		for (int i = 0; i<a.length; i++)	{
			if(a[i] % 2 == 0)
				demChan++;
	}
		System.out.format("%d so chan,%d so le",demChan, a.length - demChan );
	}
	private static void print(int[] a) {
		// TODO Auto-generated method stub
		System.out.println("\nmang a:\t ");
		for (int i = 0; i<a.length; i++)	{
			System.out.format("%d", a[i]).print(" \t ");
	}
	}
	private static void input(int[] a) {
		// TODO Auto-generated method stub
		int min = 1;
		int max = 100;
		for (int  i = 0; i<a.length; i++)	{
			a[i] = randomInteger(min, max);
	}
	}
	
	private static int randomInteger(int min, int max)	{
		Random rand = new Random();		
		return rand.nextInt(max +1 - min) +  min;
	}
	static boolean isPrimary(int n)	{
		if  (n == 1 || n == 2) return true;
		for(int i = 2; i<n; i++)	{
			if(n % i == 0) return false;
		}
		return true;
		
	}
}	
		
	
	
