/**
 * 중개인
 * paramas: brkrId, brkrOfficeName, brkrOfficeAdr, brkrOfficePhone, brkrNum, brkrTitle, brkrIntro,
 *          brkrOfficeIntro, brkrPhone, ctrId, ctrDttm, updId, updDttm
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
@Alias("BrokerIntro")
public class BrokerIntro {

	private String  brkrId;				// varchar(30) 	'중개사 아이디'
	private String  brkrOfficeName;		// varchar(15)  '중개사무소 이름'
	private String	brkrOfficeAdr;		// test			'중개사무소 주소'
	private String  brkrOfficePhone;	// varchar(11)	'중개사무소 대표 전화번호'
	private String  brkrNum;			// varchar(16) 	'중개사 등록 번호'
	private String  brkrTitle;			// varchar(30)	'중개사 소개 제목'
	private String  brkrIntro;			// varchar(300) '중개사 소개'
	private String  brkrOfficeIntro;    // varchar(300) '중개사무소 소개'
	private String  brkrPhone;			// varchar(11)	'중개사 전화번호'
	private String  ctrId;				// varchar(30) 	'생성자 ID'
	private String  ctrDttm;			// datetime 	'생성일시'
	private String  updId;				// varchar(30)	'수정자 ID'
	private String  updDttm;			// datetime 	'수정일시'

}
