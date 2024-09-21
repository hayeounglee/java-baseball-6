package baseball;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        ArrayList<String> numberArray = new ArrayList<>();

        for (int i=1; i<10; i++){
            numberArray.add(String.valueOf(i));
        }

        Collections.shuffle(numberArray);

        ArrayList<String> randomArray = new ArrayList<>();
        randomArray.add(numberArray.get(0));
        randomArray.add(numberArray.get(1));
        randomArray.add(numberArray.get(2));
        System.out.println(randomArray);

        System.out.println("숫자 야구 게임을 시작합니다.");

        while(true){
            System.out.print("숫자를 입력해주세요 : ");
            String input = scanner.nextLine();
            String[] inputNUmber = input.split("");
            Integer index = 0;
            Integer boll = 0;
            Integer strike = 0;


            for(String s : inputNUmber){
                // System.out.println(s);
                // System.out.println(randomArray.get(index));
                if(s.equals(randomArray.get(index))) {
                    strike++; // 같은 수가 같은 자리에 있으면 스트라이크
                }
                else if(randomArray.contains(s)) {
                    boll++; // 같은 수가 같은 자리에 있으면 스트라이크
                }
                index++;
            }
            if(boll != 0 || strike != 0){
                System.out.println(boll+"볼"+strike+"스트라이크");
            }
            if(boll == 0 && strike == 0) {
                System.out.println("낫싱");
            }
            if(boll == 0 && strike == 3) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                if(scanner.nextLine().equals(2)){
                    // 사이클 종료
                    break;
                }
            }
            // System.out.println(boll + " " + strike);
        }
    }
}
