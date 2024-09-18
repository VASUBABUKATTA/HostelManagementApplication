package com.hostelManagementApplication.hostel.serviceInterface;

import java.util.List;

import org.springframework.http.ResponseEntity;

//import com.hostelManagementApplication.hostel.controller.ResponseEntity;
import com.hostelManagementApplication.hostel.dto.HostlerDto;

public interface HostlerServiceInterface {

	public ResponseEntity<List<HostlerDto>> getAll();

	public ResponseEntity<HostlerDto> getById(long id);

	public ResponseEntity<String> createHostler(HostlerDto hostlerDto);

	public ResponseEntity<String> deleteHostler(long id);

	public ResponseEntity<String> editHostlerById(long id,HostlerDto hostlerDto);

	public ResponseEntity<HostlerDto> getHostlerByMobileNo(String mobileNo);

	public ResponseEntity<HostlerDto> getHostlerByHostelName(String hostelName);

}
