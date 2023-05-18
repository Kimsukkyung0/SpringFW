package com.green.board;

import org.apache.ibatis.annotations.Mapper;

@Mapper // my batis에서 제공하는 dao를 만드는 재료 ?

public interface BoardMapper {
    int insBoard(BoardEntity entity);
    int updBoard(BoardEntity entity);
    // insert update delete 명령의 경우 , 앞에 타입을 int로 만들면, 영향받은 후 자동으로 1을 리턴해쥼
}
