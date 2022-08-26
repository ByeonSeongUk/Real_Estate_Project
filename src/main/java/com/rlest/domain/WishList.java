/**
 * 위시리스트
 * paramas: email, rlestNum, crtId, crtDttm
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
@Alias("WishList")
public class WishList {
	private String 	email;		// varchar(30)	'이메일'
	private int 	rlestNum;	// int(8)		'매물 번호'
	private String 	crtId;		// varchar(30)	'생성자 ID'
	private String 	crtDttm; 	// datetime		'생성일시'
}
