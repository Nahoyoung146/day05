package reference;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] id = new String[5];
		String[] pwd = new String[5];
		String inputid, inputpwd;
		while (true) {
			System.out.println("1. 로그인\n2. 회원가입\n3. 전체 회원보기\n4. 회원정보 수정\n5. 회원정보 삭제\n6. 프로그램 종료");
			System.out.print("메뉴 입력 : ");
			int num = sc.nextInt();
			if (num == 1) {
				if (id[0] == null) {
					System.out.println("회원가입 먼저 진행해주세요.");
				}

				else {
					System.out.print("id 입력 : ");
					inputid = sc.next();
					int i = 0;
					while (i < id.length) {
						if (inputid.equals(id[i])) {
							System.out.print("pwd 입력 : ");
							inputpwd = sc.next();
							if (inputpwd.equals(pwd[i])) {
								System.out.println("인증통과");
							} else {
								System.out.println("비밀번호가 틀렸습니다.");
							}
							break;
						}
						i++;
					}

					if (i == id.length)
						System.out.println("존재하지 않은 id입니다.");
				}
			} else if (num == 2) {
				System.out.print("저장할 id 입력 : ");
				inputid = sc.next();

				int i = 0;
				while (i < id.length) {
					if (inputid.equals(id[i])) {
						System.out.println("동일아이디 존재");
						break;
					}

					if (id[i] == null) {
						System.out.print("저장할 pwd 입력 : ");
						inputpwd = sc.next();
						id[i] = inputid;
						pwd[i] = inputpwd;
						System.out.println("가입완료\n축하합니다.");
						break;
					}
					i++;
				}
				if (i == id.length - 1)
					System.out.println("더 이상 저장할 공간이 없습니다.");
			} else if (num == 3) {
				int i = 0;
				while (i < id.length) {
					if (id[i] != null)
						System.out.println(i + 1 + "번째 회원 id :" + id[i] + ", pwd : " + pwd[i]);
					i++;
				}
			} else if (num == 4) {
				System.out.print("수정할 id 입력 : ");
				inputid = sc.next();

				int i = 0;
				while (i < id.length) {
					if (inputid.equals(id[i])) {
						System.out.print("수정할 pwd 입력 : ");
						inputpwd = sc.next();
						pwd[i] = inputpwd;
						System.out.println("수정완료");

					} else {
						System.out.println("해당id는 존재하지 않습니다.");
					}
					i++;
					break;
				}
			} else if (num == 5) {
				System.out.print("삭제할 id 입력 : ");
				inputid = sc.next();
				int i = 0;
				while (i < id.length) {
					if (inputid.equals(id[i])) {
						id[i] = null;
						System.out.println("삭제완료");
					} else {
						System.out.println("해당id는 삭제할 수 없습니다.");
					}
					i++;
					break;
				}
			} else if (num == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else
				System.out.println("잘못된 입력입나다. 다시 입력해주세요.");
		}
	}
}