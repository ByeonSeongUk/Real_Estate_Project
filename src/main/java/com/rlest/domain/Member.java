/**
 * 회원
 * paramas: email, mmbrPw, mmbrName, crtId, crtDttm, updId, updDttm
 */
package com.rlest.domain;

import org.apache.ibatis.type.Alias;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Alias("Member")
public class Member {

	private String email;		// varchar(30)	'이메일'
	private String mmbrPw; 		// varchar(64)	'사용자 비밀번호'
	private String mmbrName;	// varchar(5)	'사용자 이름'
	private String crtId;		// varchar(30)	'생성자 ID'
	private String crtDttm;		// datetime 	'생성일시'
	private String updId; 		// varchar(30) 	'수정자 ID'
	private String updDttm; 	// datetime 	'수정일시'

}
