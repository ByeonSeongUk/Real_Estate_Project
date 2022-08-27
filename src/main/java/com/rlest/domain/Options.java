/**
 * 옵션의 종류
 * params: optNum, optName, crtId, crtDttm, updId, updDttm
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
@Alias("Options")
public class Options {

	private String	optNum;			// varchar(3) '옵션 번호(코드)'
	private String	optName;		// varchar(10) '옵션명'
	private String 	crtId;			// varchar(30)	'생성자ID'
	private String 	crtDttm;		// datetime	 	'생성일시'
	private String 	updId;			// varchar(30) 	'수정자 ID'
	private String 	updDttm;		// datetime 	'수정일시'

}
