package com.Flower.Control;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@RequestMapping(value = "/form_login")
	public String form_login() {
		
		return "Member/form_login";
	}
	
	@RequestMapping(value = "/loginOk")
	public String loginOk() {
		
		return "/loginOk";
	}
	
	@RequestMapping(value = "/logout")
	public String logout() {
		
		return "redirect:main";
	}
	
	@RequestMapping(value = "/form_join")
	public String form_join() {
		
		return "form_join";
	}
	//내 정보 보기(내 정보 삭제)  -- > 정보 수정
	@RequestMapping(value = "/list_info")
	public String list_info() {
		
		return "list_info";
	}
	// 내 정보가 수정되는 페이지
	@RequestMapping(value = "/modify_form_info")
	public String modify_form_info() {
		
		return "modify_form_info";
	}
	// 정보 수정된거 내 정보에서 보기
	@RequestMapping(value = "/modify_info")
	public String modify_info() {
		
		return "redirect:list_info";
	}
	
	//siyeon part. end
	
	//장바구니 페이지
	@RequestMapping(value = "/list_cart")
	public String list_cart() {
		
		return "Cart/list_cart";
	}
	// 상품 --> 장바구니
	@RequestMapping(value = "/add_cart")
	public String add_cart() {
		
		return "Cart/add_cart";
	}
	//전체 섹션 삭제
	@RequestMapping(value = "/delete_cart")
	public String delete_cart() {
		
		return "redirect:Cart/list_cart";
	}
	//개별 세션 삭제
	@RequestMapping(value = "/remove_cart")
	public String remove_cart() {
		
		return "redirect:Cart/list_cart";
	}
	//내 정보에서 보는 결제목록
	@RequestMapping(value = "/list_payment")
	public String list_payment() {
		
		return "Cart/list_payment";
	}
	//결제화면에서 main으로
	@RequestMapping(value = "/payment")
	public String payment() {
		
		return "redirect:index";
	}
	//주문 목록
	@RequestMapping(value = "/list_order")
	public String list_order() {
		
		return "Cart/list_order";
	}
	//주문 취소
	@RequestMapping(value = "/delete_order")
	public String delete_order() {
		
		return "redirect:Cart/list_order";
	}
	
	// Yongju part. end
	
	//메인 화면
	@RequestMapping(value = "/")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping(value="/index")
	public String index1() {
		return "index";
	}
	//상품목록(꽃,식물)
	@RequestMapping(value = "/list_product_flower")
	public String list_product_flower() {
		
		return "list_product_flower";
	}
	//상품목록(화분)
	@RequestMapping(value = "/list_product_port")
	public String list_product_port() {
		
		return "list_product_port";
	}
	//상품목록(선물)
	@RequestMapping(value = "/list_product_gift")
	public String list_product_gift() {
		
		return "list_product_gift";
	}
	//상품상세보기
	@RequestMapping(value = "/list_details")
	public String list_details() {
		
		return "list_details";
	}
	
	
}
