/**
 * 방의 사진 목록
 * params: imgNum, rlestNum, fileType, fileRealName, fileName, filePath, crtId, crtDttm, updId, updDttm
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
@Alias("RoomImgs")
public class RoomImgs {

	private int 	imgNum;			// int	 		'사진 번호'
	private int 	rlestNum;		// int(8)	 	'매물 번호'
	private String 	fileType;		// varchar(5)	'사진의 종류(대표사진, 화장실사진, 주방사진, 일반사진)'
	private String 	fileRealName; 	// text 		'파일의 실제 이름'
	private String 	fileName;		// text 		'중복되지 않는 가상의 파일의 이름'
	private String 	filePath;		// text 		'파일의 저장 경로'
	private String 	crtId;			// varchar(30)	'생성자ID'
	private String 	crtDttm;		// datetime	 	'생성일시'
	private String 	updId;			// varchar(30) 	'수정자 ID'
	private String 	updDttm;		// datetime 	'수정일시'

}
