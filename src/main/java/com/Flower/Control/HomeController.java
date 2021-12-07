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
	//�궡 �젙蹂� 蹂닿린(�궡 �젙蹂� �궘�젣)  -- > �젙蹂� �닔�젙
	@RequestMapping(value = "/list_info")
	public String list_info() {
		
		return "list_info";
	}
	// �궡 �젙蹂닿� �닔�젙�릺�뒗 �럹�씠吏�
	@RequestMapping(value = "/modify_form_info")
	public String modify_form_info() {
		
		return "modify_form_info";
	}
	// �젙蹂� �닔�젙�맂嫄� �궡 �젙蹂댁뿉�꽌 蹂닿린
	@RequestMapping(value = "/modify_info")
	public String modify_info() {
		
		return "redirect:list_info";
	}
	
	//siyeon part. end
	
	//�옣諛붽뎄�땲 �럹�씠吏�
	@RequestMapping(value = "/list_cart")
	public String list_cart() {
		
		return "Cart/list_cart";
	}
	// �긽�뭹 --> �옣諛붽뎄�땲
	@RequestMapping(value = "/add_cart")
	public String add_cart() {
		
		return "Cart/add_cart";
	}
	//�쟾泥� �꽮�뀡 �궘�젣
	@RequestMapping(value = "/delete_cart")
	public String delete_cart() {
		
		return "redirect:Cart/list_cart";
	}
	//媛쒕퀎 �꽭�뀡 �궘�젣
	@RequestMapping(value = "/remove_cart")
	public String remove_cart() {
		
		return "redirect:Cart/list_cart";
	}
	//�궡 �젙蹂댁뿉�꽌 蹂대뒗 寃곗젣紐⑸줉
	@RequestMapping(value = "/list_payment")
	public String list_payment() {
		
		return "Cart/list_payment";
	}
	//寃곗젣�솕硫댁뿉�꽌 main�쑝濡�
	@RequestMapping(value = "/payment")
	public String payment() {
		
		return "redirect:index";
	}
	//二쇰Ц 紐⑸줉
	@RequestMapping(value = "/list_order")
	public String list_order() {
		
		return "Cart/list_order";
	}
	//二쇰Ц 痍⑥냼
	@RequestMapping(value = "/delete_order")
	public String delete_order() {
		
		return "redirect:Cart/list_order";
	}
	
	@RequestMapping(value = "/info_cart")
	public String info_cart() {
		return "Cart/info_cart";
	}
	
	@RequestMapping(value = "/info_order")
	public String info_order() {
		return "Cart/info_order";
	}
	@RequestMapping(value = "/info_modify")
	public String info_modify() {
		return "Cart/info_modify";
		
	}
	
	// Yongju part. end
	
	//硫붿씤 �솕硫�
	@RequestMapping(value = "/")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping(value="/index")
	public String index1() {
		return "index";
	}
	//�긽�뭹紐⑸줉(苑�,�떇臾�)
	@RequestMapping(value = "/list_product_flower")
	public String list_product_flower() {
		
		return "list_product_flower";
	}
	//�긽�뭹紐⑸줉(�솕遺�)
	@RequestMapping(value = "/list_product_port")
	public String list_product_port() {
		
		return "list_product_port";
	}
	//�긽�뭹紐⑸줉(�꽑臾�)
	@RequestMapping(value = "/list_product_gift")
	public String list_product_gift() {
		
		return "list_product_gift";
	}
	//�긽�뭹�긽�꽭蹂닿린
	@RequestMapping(value = "/list_details")
	public String list_details() {
		
		return "list_details";
	}
	
	
}
