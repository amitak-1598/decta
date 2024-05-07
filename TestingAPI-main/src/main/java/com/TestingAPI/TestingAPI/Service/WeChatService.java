package com.TestingAPI.TestingAPI.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TestingAPI.TestingAPI.Entities.WeChat;
import com.TestingAPI.TestingAPI.Repository.WechatRepository;

@Service
public class WeChatService {

	@Autowired
	WechatRepository wechatrepository;

	public WeChat addWeChat(WeChat wechatbody) {
		return wechatrepository.save(wechatbody);
	}
}
