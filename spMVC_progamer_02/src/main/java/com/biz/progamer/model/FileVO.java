package com.biz.progamer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FileVO {
	private long file_seq;
	private long board_file_seq;
	private String file_origin_name;
	private String file_name;
}
