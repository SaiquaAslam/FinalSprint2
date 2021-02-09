package com.cg.main.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.main.model.Admin;
import com.cg.main.service.IAdminService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;



@Api(value = "controller", description="Handler Methods Related To Admin Module !!!!")
@RestController
@RequestMapping("/api")
public class AdminController {
	
	@Autowired
	IAdminService service;
	@ApiOperation(value = "click here to add new admin details")
	@PostMapping("/AdminDetails")
	public Admin addAdmin(@Valid @RequestBody Admin admin){
		Admin admin2 =service.addAdmin(admin);
	return admin2;
	}
	
	
}
	

	
