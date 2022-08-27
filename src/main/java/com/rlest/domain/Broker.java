/**
 * 중개인
 * paramas: brkrId, brkrPw, brkrName, brkrNum, brkrOffice, brkrAdr, brkrTitle, brkrIntro, brkrPhone, brkrStateCheck,
 * 			ctrId, ctrDttm, updId, updDttm
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
@Alias("Broker")
public class Broker {

	private String  brkrId;				// varchar(30) 	'중개사 아이디'
	private String 	brkrOfficeNum;		// int(3)		'중개사무소 번호'
	private String  brkrPw;				// varchar(64) 	'중개사 비밀번호'
	private String  brkrName;			// varchar(5) 	'중개사 이름'
	private String  brkrNum;			// varchar(16) 	'중개사 등록 번호'
	private String  brkrTitle;			// varchar(30)	'중개사 소개 제목'
	private String  brkrIntro;			// varchar(300) '중개사 소개'
	private String  brkrPhone;			// varchar(11)	'중개사 전화번호'
	private boolean brkrStateCheck;		// boolean	 	'계정 승인 상태'
	private String  ctrId;				// varchar(30) 	'생성자 ID'
	private String  ctrDttm;			// datetime 	'생성일시'
	private String  updId;				// varchar(30)	'수정자 ID'
	private String  updDttm;			// datetime 	'수정일시'

}
