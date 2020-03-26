package com.pro.controller;

import java.util.List;

import com.pro.serivce.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pro.pojo.Workorder;


@Controller
public class ProjectController {

	//service��ȡ����,ͨ��ע����ж���ע��
	
	@Autowired      //Ĭ�ϰ�������ע��
	@Qualifier("workService")
	private WorkService ws;
	
	@RequestMapping("/aa")
	public String getList(Model model){
		
		List<Workorder> wks=ws.getList();
		
		model.addAttribute("wks", wks);
		return "show";
	}
}
