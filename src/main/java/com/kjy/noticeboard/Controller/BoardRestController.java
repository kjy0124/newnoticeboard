package com.kjy.noticeboard.Controller;

import com.kjy.noticeboard.dto.BoardRequestDto;
import com.kjy.noticeboard.service.BoardService;
import org.springframework.web.bind.annotation.*;

@RestController
public class BoardRestController {
    private final BoardService boardService;

    public BoardRestController(BoardService boardService){
        this.boardService = boardService;
    }
    //개시글 DB
    @PostMapping("/boardCreate")
    public String boardcreate(@RequestBody BoardRequestDto boardRequestDto) {
        //게시글을 저장하는 서비스 로직이 필요함
        boardService.saveBoard(boardRequestDto);
        return "게시글이 등록되었습니다.";
    }

}
