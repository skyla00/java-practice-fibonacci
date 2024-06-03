package com.codestates.seb.fibonacci;
import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args){
    // 1단계. 프로그램 시작을 알리는 출력문 선언
    System.out.println("[안내]피보나치 수열 프로그램 시작.");

    // 사용자의 입력값 받기.
    Scanner sc = new Scanner(System.in);
    System.out.printf("원하는 수열의 개수를 입력해 주세요 : ");
    int count = sc.nextInt();

    // 2단계. 피보나치 수열의 코드 작성
    int[] fibo = new int[count + 1];

    fibo[0] = 0;
    fibo[1] = 1;
    for (int i = 2; i <= count; i ++) {
      fibo[i] = fibo[i - 2] + fibo [i - 1] ;
    }

    // 3단계.
    // 결과 출력을 위한 안내 문구 출력 입니다.
    System.out.println("[피보나치 수열 출력]");

    // 피보나치 수열은 fibonacci 배열에 들어가 있기에 이를 반복문을 통해 호출
    for (int i = 1; i <= count ; i ++) {
      System.out.println(fibo[i]);
    }
    System.out.println("[안내]프로그램을 종료합니다.");
  }
}