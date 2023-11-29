package com.kjy.noticeboard.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
    //공지사항
    @GetMapping("/notice")
    public String notice() {
        return "notice";
    }
    //인기게시판
    @GetMapping("/hotboard")
    public  String hotboard() {
        return "hotboard";
    }
    //전체게시판
    @GetMapping("/crud")
    public String crud() {
        return "crud";
    }

    @GetMapping(value = "/")
    public String mainpg(){
        return "noticeboard";
    }
}
