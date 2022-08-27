/**
 * 옵션 (매물이 가지고 있는 옵션)
 * params: rlestNum, optNum, crtId, crtDttm, updId, updDttm
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
@Alias("AboutOptions")
public class AboutOptions {

	private int 	rlestNum;	// int(8)	 	'매물 번호'
	private String 	optNum;		// varchar(3)	'옵션 번호(코드)'
	private String 	crtId;		// varchar(30)	'생성자ID'
	private String 	crtDttm;	// datetime	 	'생성일시'
	private String 	updId;		// varchar(30) 	'수정자 ID'
	private String 	updDttm;	// datetime 	'수정일시'

}
