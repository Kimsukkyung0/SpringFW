package com.green.board;

import org.apache.ibatis.annotations.Mapper;

@Mapper // my batis에서 제공하는 dao를 만드는 재료 ?

public interface BoardMapper {
    void insBoard(BoardEntity entity);
}
