package com.board.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PagingResponse<T> {
	
	// 현재 페이지에 보여줄 오라클 자료: 10줄
    private List<T> list = new ArrayList<>();
    private Pagination pagination;
    
    // 아래의 paging.jsp 에서 사용하는 변수들
    public PagingResponse(List<T> list, Pagination pagination) {
        this.list.addAll(list);
        this.pagination = pagination;
    }

}
