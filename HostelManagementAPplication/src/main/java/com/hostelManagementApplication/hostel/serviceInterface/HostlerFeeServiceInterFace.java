package com.hostelManagementApplication.hostel.serviceInterface;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.hostelManagementApplication.hostel.dto.HostlerFeeDto;

public interface HostlerFeeServiceInterFace {

	ResponseEntity<List<HostlerFeeDto>> getAll();

	ResponseEntity<HostlerFeeDto> getById(long id);

	ResponseEntity<String> createHostlerFee(HostlerFeeDto hostlerFeeDto);

	ResponseEntity<String> editHostlerFeeById(long id, HostlerFeeDto hostlerFeeDto);

	ResponseEntity<String> deleteHostlerFee(long id);

	ResponseEntity<List<HostlerFeeDto>> getByMobileNumber(String mobileNo);

	ResponseEntity<List<HostlerFeeDto>> getByHostelName(String hostelName);

}
