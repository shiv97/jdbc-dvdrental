
package com.chpd.wms.controller;


import com.chpd.wms.service.CustomQueryService;
import javafx.beans.property.adapter.ReadOnlyJavaBeanBooleanProperty;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.Request;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class dvdController
{

	@Autowired
	DvdrentalService dvdrentalService;

	@GetMapping("/boxplotData")
	public List<Map<String,Object>> getBoxplotData(@RequestParam String parameterName, String FT, String TT, String Machine){
		try{
			TT = "timestamp '" + TT + "'";
			FT = "timestamp '" + FT + "'";
			List<Map<String, Object>> boxplotData;
			boxplotData = dvdrentalService.getBoxplotData(parameterName, FT, TT, Machine);
			return boxplotData;
		} catch(Exception e){
			System.out.println("Exception from CustomQueryController for boxplotData");
			throw e;
		}
	}}




