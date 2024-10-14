package org.pgm.expro.mapper;

import java.util.List;

public interface BoardMapper {
    String getTime();
    void insert(TodoVO todoVO);
    List<TodoVO> getList();
    TodoVO selectOne(int tno);
    void delete(Long tno);
    void update(TodoVO todoVO); //얘를 카운트
}
