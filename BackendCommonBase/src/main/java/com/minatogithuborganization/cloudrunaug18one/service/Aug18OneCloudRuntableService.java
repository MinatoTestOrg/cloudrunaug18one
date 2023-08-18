package com.minatogithuborganization.cloudrunaug18one.service;

import com.vs.rappit.base.acl.IPerimeterManager;
import com.minatogithuborganization.cloudrunaug18one.base.service.Aug18OneCloudRuntableBaseService;
import com.minatogithuborganization.cloudrunaug18one.model.Aug18OneCloudRuntable;
import com.minatogithuborganization.cloudrunaug18one.service.Aug18OneCloudRuntablePerimeterImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service("Aug18OneCloudRuntable")
public class Aug18OneCloudRuntableService extends Aug18OneCloudRuntableBaseService<Aug18OneCloudRuntable> implements IAug18OneCloudRuntableService<Aug18OneCloudRuntable>{

		@Autowired
		private  Aug18OneCloudRuntablePerimeterImpl  aug18onecloudruntablePerimeterImpl;

		public Aug18OneCloudRuntableService(ChangelogService changelogService) {
			super(Aug18OneCloudRuntable.class);	
			setChangelogService(changelogService); 
		}
	
	
}