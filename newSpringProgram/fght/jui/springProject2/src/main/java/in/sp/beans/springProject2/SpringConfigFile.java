package in.sp.beans.springProject2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.springProject2.student;



@Configuration
public class SpringConfigFile {


    @Bean
public student std1(){
    
student std = new student();

std.setName("Rohit");
std.setRollno(  011);
std.setEmail("rohit@kirtigram.com");
return std;
}
   


}
