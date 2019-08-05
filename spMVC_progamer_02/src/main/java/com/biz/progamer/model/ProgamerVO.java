package com.biz.progamer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProgamerVO {
	private long pg_num;
	private String pg_team;
	private String pg_gamer;
	private String pg_id;
	private String pg_position;
	private String pg_birth;
	private String pg_career;
	private String pg_lastteam;
	private String pg_img;
}
