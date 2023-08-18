package com.minatogithuborganization.cloudrunaug18one.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import com.vs.rappit.base.factory.InstanceFactory;
import com.minatogithuborganization.cloudrunaug18one.base.controller.ApplicationUserBaseController;
import com.minatogithuborganization.cloudrunaug18one.service.IApplicationUserService;
import com.minatogithuborganization.cloudrunaug18one.service.ApplicationUserService;
import com.minatogithuborganization.cloudrunaug18one.model.ApplicationUser;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
@RequestMapping(path = "/rest/applicationusers/", produces = "application/json")
public class ApplicationUserController extends ApplicationUserBaseController<IApplicationUserService<ApplicationUser>, ApplicationUser> {

	public ApplicationUserController(ApplicationUserService applicationUserService) {
		super(applicationUserService);
	}
	
		
	
	
}
