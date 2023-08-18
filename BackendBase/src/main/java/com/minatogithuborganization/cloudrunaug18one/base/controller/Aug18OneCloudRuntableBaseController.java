package com.minatogithuborganization.cloudrunaug18one.base.controller;

import com.vs.rappit.base.dal.providers.PersistenceType;
import com.vs.rappit.jersey.base.webservice.BaseWebService;
import com.minatogithuborganization.cloudrunaug18one.base.service.IAug18OneCloudRuntableBaseService;
import com.minatogithuborganization.cloudrunaug18one.base.model.Aug18OneCloudRuntableBase;
import java.util.Date;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.vs.rappit.base.model.Primary;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PostMapping;

import com.vs.rappit.base.model.PaginationRequest;

import com.vs.rappit.jersey.webservice.mapper.DatatableJson;

import com.vs.rappit.base.model.PaginationResponse;

import java.util.Map;

public abstract class Aug18OneCloudRuntableBaseController<SERVICE extends IAug18OneCloudRuntableBaseService<M>, M extends Aug18OneCloudRuntableBase>
		extends BaseWebService<SERVICE, M> {
	
	
	public Aug18OneCloudRuntableBaseController(SERVICE logic) {
		super(logic);
	}
	
	
	@PreAuthorize("hasAccess('/aug18onecloudruntables/')")
	@PutMapping
	public M update(@RequestBody M modelObj) {
		return super.update(modelObj);
	}



	@PreAuthorize("hasAccess('/aug18onecloudruntables/autosuggest')")
	@GetMapping(path = "/autosuggest", produces = "application/json")
	public List<Object> autoSuggestService(@RequestParam("query") String searchText,@RequestParam(name = "sortColumn", required = false) String sortColumn,@RequestParam(name = "sortOrder", required = false) String sortOrder,@RequestParam("pgNo") int pgNo,@RequestParam("pgLen") int length) {
		return super.autosuggest(searchText,sortColumn,sortOrder,pgNo,length);
	}


	@PreAuthorize("hasAccess('/aug18onecloudruntables/{sid}')")
	@GetMapping(path = "/{sid}", produces = "application/json")
	public M getById(@PathVariable("sid") Primary sid) {
		return super.getById(sid);
	}


	@PreAuthorize("hasAccess('/aug18onecloudruntables/{ids}')")
	@DeleteMapping("/{ids}")
	public ResponseEntity deleteRecords(@PathVariable("ids") String ids) {
		boolean isDeleted = super.delete(ids);
		if (isDeleted)
			return ResponseEntity.ok().build();
		else
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}


	@PreAuthorize("hasAccess('/aug18onecloudruntables/')")
	@PostMapping
	public M create(@RequestBody M modelObj) {
		return super.save(modelObj);
	}


	@PreAuthorize("hasAccess('/aug18onecloudruntables/datatable')")
	@PostMapping("/datatable")
	public PaginationResponse getDatatableData(@RequestBody DatatableJson datatableJson)
	{
		PaginationRequest dataTable = convertToPaginationRequest(datatableJson);
	 	return logic.getAllByPage(PersistenceType.SEARCH, dataTable);
	}
	



	
}
