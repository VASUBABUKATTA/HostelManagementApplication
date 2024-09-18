package com.hostelManagementApplication.hostel.configuration;



import org.modelmapper.ModelMapper;
//import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelmapperConfiguration 
{
    @Bean
    ModelMapper modelMapper() 
	 {
	        return new ModelMapper();
	 }
    
//    public class ModelMapper {
//
//		public Object map(List<Hostler> hostlers, Class<HostlerDto> class1) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//    }

}
