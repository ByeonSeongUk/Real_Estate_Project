/**
 * 페이징 처리
 */
package com.rlest.domain;

import lombok.*;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@ToString
@Alias("Paging")
public class Paging {

	private int     page;			  // 현재 페이지 번호
	private int     count;            // 전체 게시물수
	private int     startPage;        // 첫 페이지 번호
	private int     endPage;          // 끝 페이지 번호
	private int     limitStart;       // LIMIT 시작 위치
	private int     offset;           // 한 페이지당 보여줄 게시물 수
	private boolean nextSection;      // 페이징의 다음 섹션 존재 여부
	private int 	before;			  // 이전 버튼 눌렀을때 이동할 페이지 번호
	private int 	forward;		  // 다음 버튼 눌렀을때 이동할 페이지 번호



	public Paging(int page, int count) {

		final int BOARD_CNT = 10; // 한 페이지에 출력될 개수
		final int PAGING_CNT = 5; // 페이지의 수(페이징 버튼)

		this.page = page;
		this.count = count;
		this.offset = BOARD_CNT;

		// 페이징 버튼 section  (ex | 1,2,3,4,5 > 6,7,8,9,10 > ...)
		int section;


		// 페이징 버튼 section 구하기
		if(page % PAGING_CNT == 0) {
			section = page / PAGING_CNT;
		}
		else {
			section = page / PAGING_CNT + 1;
		}

		// limit 시작 인덱스 번호
		limitStart = (page <= 1) ? 0: (page - 1) * BOARD_CNT - 1;

		// 다음 페이지 여부
		nextSection = count > section * (PAGING_CNT * BOARD_CNT);


		// 페이징 최소값
		startPage = 1 + (section - 1) * PAGING_CNT;


		// 페이징 최대값
		if(nextSection) {
			endPage = section * PAGING_CNT;
		}
		else {
			endPage = count / BOARD_CNT + 1;
		}


		// 다음 페이지 구하기
		forward = 1 + section * PAGING_CNT;


		// 이전 페이지 구하기
		before = (section - 1) * PAGING_CNT;
	}

}
