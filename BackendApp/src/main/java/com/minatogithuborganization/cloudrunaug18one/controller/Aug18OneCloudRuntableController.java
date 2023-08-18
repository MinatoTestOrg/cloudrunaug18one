package com.minatogithuborganization.cloudrunaug18one.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.http.ResponseEntity;
import com.vs.rappit.base.factory.InstanceFactory;
import com.minatogithuborganization.cloudrunaug18one.base.controller.Aug18OneCloudRuntableBaseController;
import com.minatogithuborganization.cloudrunaug18one.service.IAug18OneCloudRuntableService;
import com.minatogithuborganization.cloudrunaug18one.service.Aug18OneCloudRuntableService;
import com.minatogithuborganization.cloudrunaug18one.model.Aug18OneCloudRuntable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "rest/aug18onecloudruntables/", produces = "application/json")
public class Aug18OneCloudRuntableController extends Aug18OneCloudRuntableBaseController<IAug18OneCloudRuntableService<Aug18OneCloudRuntable>, Aug18OneCloudRuntable> {
	private static XLogger LOGGER = XLoggerFactory.getXLogger(Aug18OneCloudRuntableController.class);
	public Aug18OneCloudRuntableController(Aug18OneCloudRuntableService aug18onecloudruntableService) {
		super(aug18onecloudruntableService);
	}
}
