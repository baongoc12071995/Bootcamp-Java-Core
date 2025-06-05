import java.util.Random;
import java.util.Scanner;

public class RPSGame {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int userWin = 0, compWin = 0, choice;

        String[] moves = {"Bao", "Kéo", "Kim"};
        do {
            System.out.print("\nChọn 1.Bao  2.Kéo  3.Kim: ");
            int user = sc.nextInt();
            int comp = rd.nextInt(3) + 1;

            System.out.println("Bạn: " + moves[user - 1] + " | Máy: " + moves[comp - 1]);

            if (user == comp) System.out.println("Hòa!");
            else if ((user == 1 && comp == 2) || (user == 2 && comp == 3) || (user == 3 && comp == 1)) {
                System.out.println("Bạn thắng!");
                userWin++;
            } else {
                System.out.println("Máy thắng!");
                compWin++;
            }

            System.out.print("Nhập số khác 0 để chơi tiếp, 0 để dừng: ");
            choice = sc.nextInt();
        } while (choice != 0);

        System.out.println("\nKẾT QUẢ: Bạn " + userWin + " - " + compWin + " Máy");
        if (userWin > compWin) System.out.println(">>> Bạn thắng chung cuộc!");
        else if (userWin < compWin) System.out.println(">>> Máy thắng chung cuộc!");
        else System.out.println(">>> Hòa!");
	}
}
