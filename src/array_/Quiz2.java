package array_;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] id = new String[5];
		String[] pwd = new String[5];
		String inputid = null, inputpwd = null;
		int i = 0;
		while (true) {
			System.out.println("1. 로그인\n2. 회원가입\n3. 모든 회원보기\n4. 수정\n5. 삭제\n6. 종료");
			System.out.print("메뉴 입력 : ");
			int num = sc.nextInt();
			if (num == 1) {
				if (id[0] == null) {
					System.out.println("회원가입 먼저 진행해주세요.");
				}

				else {
					System.out.print("아이디 입력 : ");
					inputid = sc.next();
					System.out.print("비밀번호 입력 : ");
					inputpwd = sc.next();
					for (i = 0; i < id.length; i++) {
						if (inputid.equals(id[i])) {
							if (inputpwd.equals(pwd[i]))
								System.out.println("인증완료");

							else
								System.out.println("비밀번호가 틀립니다.");
						}

						if (!(inputid.equals(id[i])))
							System.out.println("존재하지 않는 아이디입니다.");

						break;
					}
				}
			}

			else if (num == 2) {

				for (; i < id.length; i++) {
					System.out.println("메뉴로 나가고 싶으면 0번을 누르세요\n계속 진행을 원하시면 아무 숫자나 누르세요");
					int num1 = sc.nextInt();
					if (num1 == 0)
						break;
					System.out.print("저장할 아이디 입력 : ");
					id[i] = sc.next();

					if (i == 0) {
						System.out.print("저장할 비밀번호 입력 : ");
						pwd[i] = sc.next();
						System.out.println("회원가입 성공!!!\n축하합니다.");
					}

					else {
						for (int j = 0; j < i; j++) {
							if (id[j].equals(id[i])) {
								System.out.println("동일한 아이디가 존재합니다.");
								i--;
							}

							else if (j == i - 1) {
								System.out.print("저장할 비밀번호 입력 : ");
								pwd[i] = sc.next();
								System.out.println("회원가입 성공!!!\n축하합니다.");

								if (i == id.length - 1)
									System.out.println("더 이상 저장할 공간이 없습니다.");
							}
						}
					}
				}
			}

			else if (num == 3) {
				for (int j = 0; j < id.length; j++) {
					if (id[j] != null)
						System.out.println(j + 1 + "번째 회원 이름 : " + id[j] + " , 비번 : " + pwd[j]);
				}
			}

			else if (num == 4) {
				System.out.print("수정할 아이디 입력 : ");
				String changeid = sc.next();
				for (i = 0; i < id.length; i++) {
					if (changeid.equals(id[i])) {
						System.out.print("변경할 비밀번호 입력 : ");
						String changepwd = sc.next();
						pwd[i] = changepwd;
						System.out.println("변경완료");
					}

					else
						System.out.println("해당 id는 존재하지 않습니다");

					break;
				}
			}

			else if (num == 5) {
				System.out.print("삭제할 아이디 입력 : ");
				String deleteid = sc.next();
				for (i = 0; i < id.length; i++) {
					if (deleteid.equals(id[i])) {
						id[i] = null;
						System.out.println("삭제완료");
					}

					else
						System.out.println("해당 id는 삭제할 수 없습니다.");

					break;
				}
			}

			else if (num == 6) {
				System.out.println("프로그램 종료");
				break;
			}

			else
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
		}
	}
}