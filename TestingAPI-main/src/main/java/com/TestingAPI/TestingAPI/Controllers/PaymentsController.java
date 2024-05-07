package com.TestingAPI.TestingAPI.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.TestingAPI.TestingAPI.Entities.AliPay;
import com.TestingAPI.TestingAPI.Entities.Apidourlbody;
import com.TestingAPI.TestingAPI.Entities.ApplePay;
import com.TestingAPI.TestingAPI.Entities.GooglePay;
import com.TestingAPI.TestingAPI.Entities.Moto;
import com.TestingAPI.TestingAPI.Entities.Openbanking;
import com.TestingAPI.TestingAPI.Entities.Volt;
import com.TestingAPI.TestingAPI.Entities.WeChat;
import com.TestingAPI.TestingAPI.Entities.Zimpler;
import com.TestingAPI.TestingAPI.Service.AliPayService;
import com.TestingAPI.TestingAPI.Service.ApplePayService;
import com.TestingAPI.TestingAPI.Service.GooglePayService;
import com.TestingAPI.TestingAPI.Service.MotoService;
import com.TestingAPI.TestingAPI.Service.OpenBankingService;
import com.TestingAPI.TestingAPI.Service.PaymentService;
import com.TestingAPI.TestingAPI.Service.VoltService;
import com.TestingAPI.TestingAPI.Service.WeChatService;
import com.TestingAPI.TestingAPI.Service.ZimplerService;

@RestController
public class PaymentsController {

	@Autowired
	VoltService voltservice;
	
	@Autowired
	PaymentService paymentservice;

	@Autowired
	AliPayService alipayservice;

	@Autowired
	GooglePayService googlepayservice;

	@Autowired
	ApplePayService applepayservice;

	@Autowired
	MotoService motoservice;

	@Autowired
	OpenBankingService openbankingService;

	@Autowired
	WeChatService wechatservice;

	@Autowired
	ZimplerService zimplerservice;

	@PostMapping("/volt")
	public Volt addVolt(@RequestBody Volt voltbody) {
		return voltservice.addVolt(voltbody);
	}

	@PostMapping("/payment")
	public Apidourlbody addApidourlPayment(@RequestBody Apidourlbody paymentbody) {
		return paymentservice.addPayment(paymentbody);
	}

	@PostMapping("/alipay")
	public AliPay addAliPay(@RequestBody AliPay alipaybody) {
		return alipayservice.addAliPay(alipaybody);
	}

	@PostMapping("/applepay")
	public ApplePay addApplePay(@RequestBody ApplePay applepaybody) {
		return applepayservice.addApplePay(applepaybody);
	}

	@PostMapping("/googlepay")
	public GooglePay addGooglePay(@RequestBody GooglePay googlepaybody) {
		return googlepayservice.addGooglePay(googlepaybody);
	}

	@PostMapping("/moto")
	public Moto addMoto(@RequestBody Moto motobody) {
		return motoservice.addMoto(motobody);
	}

	@PostMapping("/openbanking")
	public Openbanking addOpenbanking(@RequestBody Openbanking openbankingbody) {
		return openbankingService.addOpenBanking(openbankingbody);
	}

	@PostMapping("/wechat")
	public WeChat addWeChat(@RequestBody WeChat wechatbody) {
		return wechatservice.addWeChat(wechatbody);
	}

	@PostMapping("/zimpler")
	public Zimpler addZimpler(@RequestBody Zimpler zimplerbody) {
		return zimplerservice.addZimpler(zimplerbody);
	}

}
