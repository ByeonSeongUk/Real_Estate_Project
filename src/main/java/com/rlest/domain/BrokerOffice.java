/**
 * 중개사무소
 * paramas: brkrOfficeNum, brkrOfficeName, brkrOfficeAdr, brkrOfficeIntro, brkrOfficePhone,
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
@Alias("BrokerOffice")
public class BrokerOffice {

	private String  brkrOfficeNum;		// int(3) 		'중개사무소 번호',
	private String  brkrOfficeName;		// varchar(15) 	'중개사무소 이름',
	private String  brkrOfficeAdr;		// text 		'중개사무소 주소',
	private String  brkrOfficeIntro;	// varchar(300) '중개사무소 소개',
	private String  brkrOfficePhone;	// varchar(11) 	'중개사무소 대표 전화번호',
	private String  ctrId;				// varchar(30) 	'생성자 ID'
	private String  ctrDttm;			// datetime 	'생성일시'
	private String  updId;				// varchar(30)	'수정자 ID'
	private String  updDttm;			// datetime 	'수정일시'

}
