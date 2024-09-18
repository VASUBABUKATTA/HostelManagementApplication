package com.hostelManagementApplication.hostel.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hostelManagementApplication.hostel.model.Hostler;

@Repository
public interface HostlerRepository extends JpaRepository<Hostler, Long>{

	Optional<Hostler> findByHostlerNameAndHostlerMobile(String name, String mobile);

	Optional<Hostler> findByHostlerMobile(String mobile);

	Optional<Hostler> findByHostlerNameAndHostlerMobileAndHostlerAddressAndHostlerEmail(String name, String mobile,
			String address, String email);

	Optional<Hostler> findByHostelName(String hostelName);

	Optional<Hostler> findByHostlerMobileAndHostelName(String mobile, String hostelName);

//	Optional<Hostler> findByMonth(String month);

}
