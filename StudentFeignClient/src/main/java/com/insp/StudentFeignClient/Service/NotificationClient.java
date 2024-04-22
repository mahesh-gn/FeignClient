package com.insp.StudentFeignClient.Service;

import com.insp.StudentFeignClient.Model.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "notification-client", url = "${url}")
public interface NotificationClient {
    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student) ;
}
