package learn;
class SqrRoot{
	public static void main(String args[]) {
		double noom, sroot, rerr;
		
		for(noom = 1; noom < 100; noom++) {
			sroot = Math.sqrt(noom);
			
			System.out.println("Квадратный корень из " + noom + " равен " + sroot);
			
			rerr = noom - (sroot * sroot);
			System.out.println("Ошибка округления: " + rerr);
			System.out.println();
		}
    }
}