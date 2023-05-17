package com.green.board;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //로직담당
public class BoardService {
    private final BoardMapper mapper;

    @Autowired // 또다른 DI
    public BoardService(BoardMapper mapper){
        this.mapper = mapper;
    }

    public int insBoard(BoardEntity entity){
        System.out.println("service-insBoard");
        mapper.insBoard(entity);
        return 1;
    }
}
