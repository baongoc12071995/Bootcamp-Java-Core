
public class SmallestIntNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		while (n * (n + 1) / 2 <= 10000) {
			n++;
		}

		System.out.println("Số nguyên dương nhỏ nhất n sao cho 1 + 2 + ... + n > 10000 là: " + n);
	}
}
