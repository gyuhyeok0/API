package com.ohgiraffers.section03.stringbuilder;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. StringBuilder 의 자주 사용되는 메소드를 알 수 있다.
            필기.
                delete():  시작과 종료 인덱스를 이용해서 문자열 제거
                deleteCarAt() : 문자열 인덱스를 이용해서 문자 하나를 제거한다.
         */
        StringBuilder sb = new StringBuilder("javaoracle");

        System.out.println(sb);

        System.out.println("delete() : " + sb.delete(2,5));
        System.out.println(sb);

        /* 필기.
            insert: 인자로 전달 된 값을 문자열로 변환 후 지정한 인덱스에 추가
         */

        System.out.println("insert() : " + sb.insert(1,"vao"));
        System.out.println(sb);

        /*필기. reverse() :  문자열 인덱스 순번을 역순으로 재배열 한다.
         */
        System.out.println("reverse() : " + sb.reverse());
    }



}
