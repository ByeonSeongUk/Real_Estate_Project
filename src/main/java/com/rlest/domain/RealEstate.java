/**
 * 매물
 * paramas: rlestNum, brkrId, rlestAdr, rlestSort, deposit, monthlyRent, maintenanceCharge, roomArea, structure, floor,
 * 			totalFloor, parkingCheck, leavtorCheck, moveInDay, postTitle, rlestIntro, deleteStatusCheck, crtId, crtDttm,
 * 			updId, updDttm
 */
package com.rlest.domain;

import lombok.*;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Alias("RealEstate")
public class RealEstate {
	private int 	rlestNum;			// int(8)	 	 '매물 번호'
	private String 	brkrId;				// varchar(30)	 '중개사 아이디'
	private String 	rlestAdr;			// text 		 '매물의 주소'
	private String 	rlestSort;			// varchar(3) 	 '매물 구분'
	private int 	deposit;			// int(9) 		 '보증금'
	private int 	monthlyRent;		// int(7) 		 '월세'
	private int 	maintenanceCharge;	// int(6) 		 '관리비'
	private float 	roomArea;			// decimal(4, 2) '면적'
	private String 	structure;			// varchar(3) 	 '구조(오픈형, 분리형, 복층형)'
	private String 	floor;				// varchar(3)	 '층수'
	private String 	totalFloor;			// varchar(3)	 '건물의 총 층수'
	private boolean parkingCheck;		// boolean	 	 '주차장 유무'
	private boolean	levatorCheck;		// boolean	 	 '엘리베이터 유무'
	private String 	moveInDay;			// varchar(30)	 '입주 가능일'
	private String 	postTitle;			// varchar(30)	 '게시물 제목'
	private String 	rlestIntro;			// varchar(300)  '매물 상세 설명'
	private boolean	deleteStatusCheck;	// boolean	NOT  '삭제 여부'
	private String 	crtId;				// varchar(30)   '생성자 ID'
	private String 	crtDttm;			// datetime 	 '생성일시'
	private String 	updId;				// varchar(30)	 '수정자 ID'
	private String 	updDttm;			// datetime 	 '수정일시'


}
