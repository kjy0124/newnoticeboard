package com.kjy.noticeboard.service;

import com.kjy.noticeboard.dto.BoardRequestDto;
import com.kjy.noticeboard.repository.BoardRepository;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    private BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository){
        this.boardRepository=boardRepository;
    }

    public void saveBoard(BoardRequestDto boardRequestDto){

    }
}
