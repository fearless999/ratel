package org.nico.ratel.landlords.enums;

import java.io.Serializable;

public enum ClientEventCode implements Serializable{

	CODE_CLIENT_NICKNAME_SET("设置昵称"),
	
	CODE_CLIENT_EXIT("客户端退出"),
	
	CODE_CLIENT_CONNECT("客户端加入成功"),
	
	CODE_SHOW_OPTIONS("展示选项"),
	
	CODE_SHOW_ROOMS("展示房间列表"),
	
	CODE_SHOW_POKERS("展示Poker"),
	
	CODE_ROOM_CREATE_SUCCESS("创建房间成功"),
	
	CODE_ROOM_JOIN_SUCCESS("加入房间成功"),
	
	CODE_ROOM_JOIN_TRIGGER("加入房间触发"),
	
	CODE_ROOM_JOIN_FAIL_BY_FULL("房间人数已满"),
	
	CODE_ROOM_JOIN_FAIL_BY_INEXIST("房间不存在"),
	
	CODE_GAME_STARTING("开始游戏"),
	
	CODE_GAME_LANDLORD_ELECT("抢地主"),
	
	CODE_GAME_LANDLORD_CONFIRM("地主确认"),
	
	CODE_GAME_LANDLORD_CYCLE("地主一轮确认结束"),
	
	CODE_GAME_POKER_PLAY("出牌回合"),
	
	CODE_GAME_POKER_PLAY_MISMATCH("出牌不匹配"),
	
	CODE_GAME_POKER_PLAY_LESS("出牌太小"),
	
	CODE_GAME_POKER_PLAY_DONT_SELL("不出"),
	
	CODE_GAME_POKER_PLAY_INVALID("无效"),
	
	CODE_GAME_OVER("游戏结束"),
	;
	
	private String msg;

	private ClientEventCode(String msg) {
		this.msg = msg;
	}

	public final String getMsg() {
		return msg;
	}

	public final void setMsg(String msg) {
		this.msg = msg;
	}
	
}