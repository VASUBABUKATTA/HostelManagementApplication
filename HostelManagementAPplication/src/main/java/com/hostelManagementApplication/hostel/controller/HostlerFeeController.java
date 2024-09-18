package com.hostelManagementApplication.hostel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hostelManagementApplication.hostel.dto.HostlerFeeDto;
import com.hostelManagementApplication.hostel.serviceInterface.HostlerFeeServiceInterFace;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;

@RestController
@RequestMapping("api/hostlerFee")
@CrossOrigin(origins = "*")
@Validated
public class HostlerFeeController {

	@Autowired
	private HostlerFeeServiceInterFace service;
	
	// to get All Hostlers Fee :
		@GetMapping("/findAll")
		public ResponseEntity<List<HostlerFeeDto>> getAll()
		{
			
			return service.getAll();
		}
		
		// to get All Hostlers Fee Data By Id:
			@GetMapping("/findById/{id}")
			public ResponseEntity<HostlerFeeDto> getById(@PathVariable long id)
			{
				return service.getById(id);
			}
			
			// to get HostlerFee details by MobileNumber
			@GetMapping("/findByMobileNumber/{mobileNo}")
			public ResponseEntity<List<HostlerFeeDto>> getByMobileNumber(@PathVariable @Pattern(regexp = "(^[6-9][0-9]{9}$)", message = "Hostler mobile number shpould be starts with  6 to 9  must be 10 digits") String mobileNo)
			{
					return service.getByMobileNumber(mobileNo);
			}
			
			// to get HostlerFee details by HostelName
						@GetMapping("/findByHostelname/{hostelName}")
						public ResponseEntity<List<HostlerFeeDto>> getByHostelName(@PathVariable String hostelName)
						{
								return service.getByHostelName(hostelName);
						}
			
		// to post or create a hostler 
			@PostMapping("/createHostlerFee")
			public ResponseEntity<String> createHostlerFee(@Valid @RequestBody HostlerFeeDto hostlerFeeDto)
			{
				return service.createHostlerFee(hostlerFeeDto);
			}
			
			// to edita hostler with id
			
			@PutMapping("/editHostlerFee/{id}")
			public ResponseEntity<String> editHostlerFee(@PathVariable long id ,@Valid @RequestBody HostlerFeeDto hostlerFeeDto)
			{
				return service.editHostlerFeeById(id,hostlerFeeDto);
			}
			
			
			// to delete a hostler
			@DeleteMapping("/deleteHostlerFee/{id}")
			public ResponseEntity<String> deleteHostlerFee(@PathVariable long id)
				{
						return service.deleteHostlerFee(id);
				}

	
}
