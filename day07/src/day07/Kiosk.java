package day07;

import java.util.Scanner;

public class Kiosk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menus = new String[3];
        int[] price = new int[3];
        int choice = 0;
        boolean isRun = true;

        while(isRun) {
            System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★");
            System.out.println("★Java 커피에 오신걸 환영합니다.☆");
            System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★");
            System.out.println();
            System.out.print("1. 전체 메뉴 보기\n" +
                    "2. 관리자 로그인\n" +
                    "3. 종료\n" +
                    "입력 >> ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println();
                    for (int i = 0; i < menus.length; i++) {
                        if (menus[i] == null) {
                            System.out.println((i + 1) + ". 메뉴를 준비중 입니다.");
                            System.out.println("---------------------------");
                        } else {
                            System.out.println((i + 1) + ". " + menus[i]);
                            System.out.println("가격 : " + price[i]);
                            System.out.println("---------------------------");
                        }
                    }
                    System.out.println();
                    System.out.print("주문할 메뉴 번호를 입력하세요 >> ");
                    choice = sc.nextInt();
                    if(menus[choice-1] == null){
                        System.out.println("해당 메뉴는 준비중입니다.");
                        System.out.println();
                        break;
                    }
                    System.out.println();
                    System.out.println(menus[choice-1] + "을(를) 선택하셨습니다.");
                    System.out.println("가격은 " + price[choice-1] + "원 입니다.");
                    System.out.println();
                    break;
                case 2:
                    String id = null;
                    int pw = 0;

                    System.out.println();
                    System.out.print("아이디 >> ");
                    id = sc.next();
                    if (id.equals("admin")) {
                        System.out.print("비밀번호 >> ");
                        pw = sc.nextInt();
                        if (pw == 1234) {
                            System.out.println("로그인 성공");
                            System.out.print("1. 메뉴등록\n" +
                                    "2. 메뉴삭제\n" +
                                    "3. 메뉴수정\n" +
                                    "4. 나가기\n" +
                                    "입력 >> ");
                            choice = sc.nextInt();
                            sc.nextLine();
                            switch (choice) {
                                case 1:
                                    System.out.println();
                                    System.out.println("메뉴등록");
                                    System.out.println("------------------");
                                    for (int i = 0; i < menus.length; i++) {
                                        System.out.print((i + 1) + ". 메뉴 이름 >> ");
                                        menus[i] = sc.nextLine();

                                        System.out.print(menus[i] + " 가격 >> ");
                                        price[i] = sc.nextInt();
                                        sc.nextLine();
                                    }
                                    break;
                                case 2:
                                    System.out.println();
                                    System.out.println("메뉴삭제");
                                    System.out.println("------------------");
                                    System.out.println();
                                    for (int i = 0; i < menus.length; i++) {
                                        if (menus[i] == null) {
                                            System.out.println((i + 1) + ". 메뉴를 준비중 입니다.");
                                            System.out.println("---------------------------");
                                        } else {
                                            System.out.println((i + 1) + ". " + menus[i]);
                                            System.out.println("가격 : " + price[i]);
                                            System.out.println("---------------------------");
                                        }
                                    }
                                    System.out.println();
                                    System.out.print("삭제할 메뉴 선택 >> ");
                                    choice = sc.nextInt();
                                    sc.nextLine();
                                    menus[choice - 1] = null;
                                    price[choice - 1] = 0;
                                    break;
                                case 3:
                                    System.out.println();
                                    System.out.println("메뉴수정");
                                    System.out.println("------------------");
                                    System.out.println();
                                    for (int i = 0; i < menus.length; i++) {
                                        if (menus[i] == null) {
                                            System.out.println((i + 1) + ". 메뉴를 준비중 입니다.");
                                            System.out.println("---------------------------");
                                        } else {
                                            System.out.println((i + 1) + ". " + menus[i]);
                                            System.out.println("가격 : " + price[i]);
                                            System.out.println("---------------------------");
                                        }
                                    }
                                    System.out.println();
                                    System.out.print("수정할 메뉴 선택 >> ");
                                    choice = sc.nextInt();
                                    sc.nextLine();
                                    System.out.print("수정할 메뉴 이름 >> ");
                                    menus[choice - 1] = sc.nextLine();
                                    System.out.print(menus[choice-1] + " 가격 >> ");
                                    price[choice - 1] = sc.nextInt();
                                    sc.nextLine();
                                    break;
                                case 4:
                                    System.out.println("메인 메뉴로 돌아갑니다.");
                                    System.out.println();
                                    break;
                                default:
                                    System.out.println("잘못 입력하셨습니다.");
                            }
                        } else {
                            System.out.println("비밀번호를 확인해주세요");
                        }
                    } else {
                        System.out.println("아이디를 확인해주세요");
                    }
                    break;
                case 3:
                    System.out.println("프로그램이 종료됩니다.");
                    isRun = false;
                    break;
                default:
                    System.out.println("잘못 입력했습니다.");
            }
        }
    }
}
