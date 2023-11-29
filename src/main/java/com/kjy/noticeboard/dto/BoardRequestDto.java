package com.kjy.noticeboard.dto;

import lombok.Getter;
import lombok.Setter;

/*
* 데이터 전송 객체
* 주로 데이터를 서로 다른 레이어나 컴포넌트 간 데이터를 전송할 때 씀
* */
@Getter
@Setter
public class BoardRequestDto {
    private Long id;    //게시글 고유 번호

    private String title; // 게시글 제목

    private String writer; //작성자

    private String content; // 내용
}
