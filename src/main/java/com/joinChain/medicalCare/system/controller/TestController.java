package com.joinChain.medicalCare.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joinChain.medicalCare.base.controller.BaseController;
import com.joinChain.medicalCare.system.entity.User;
import com.joinChain.medicalCare.system.service.IUserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
/**
 * 
 * <b>类名称：</b>TestController<br/>
 * <b>类描述：</b>TODO(测试接口)<br/>
 * <b>创建人：</b>lzh<br/>
 * <b>创建时间：</b>2019年12月19日 下午3:27:14<br/>
 * <b>修改人：</b><br/>
 * <b>修改备注：</b><br/>
 * @version 1.0.0<br/>
 */
@RestController
@Api(value = "test API", tags = {"测试操作接口"})
@Description("测试接口描述")
@RequestMapping("/system")
public class TestController extends BaseController{

	@Autowired
	private IUserService userService;
	
	@ApiOperation(value = "新增用户数据", notes = "新增用户数据接口")
	@PostMapping("/test")
	public Object getUser(@RequestBody User user) {
		User user2 = userService.getUser();
		System.out.println(user2.getName());
		return "";
	}

	public void test01(){
		System.out.println("aaa");
	}

	public static void main(String[] args) {
		System.out.println("aaa");
	}
}
