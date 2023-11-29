package com.kjy.noticeboard.repository;

import com.kjy.noticeboard.dto.BoardRequestDto;

public class JpaRepository implements BoardRepository{

    BoardRequestDto boardRequestDto;

    public JpaRepository(BoardRequestDto boardRequestDto) {
        this.boardRequestDto = boardRequestDto;
    }
}
