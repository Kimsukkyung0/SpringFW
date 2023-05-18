package com.green.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/board")
public class BoardController {
    private final BoardService service;

    @Autowired// DI : dependency injection
    public BoardController(BoardService service){
        this.service = service;
    }

    @PostMapping
    public int boardPost(@RequestBody BoardEntity entity){
        System.out.println(entity);
        return service.insBoard(entity);
    }

//    @PostMapping
//    public String postBoard(BoardEntity entity){
//        System.out.println(entity);
//        return "글 등록완료";
//    }//폼, 패쓰베리어블, 쿼리스트링 : 여러가지 다 받을 수 있는 형태
//    //여러가지가 다 가능한 친구는 .. 속도가 느려질 수 밖에없다

    @PutMapping
    public int boardPut(@RequestBody BoardEntity entity){
        System.out.println(entity);
        return service.updBoard(entity);
    }
    //업데이트
}
