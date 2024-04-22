package com.insp.NotificationFeignClient.Service;

import com.insp.NotificationFeignClient.Model.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "studentClient", url = "${url}")
public interface StudentClient {
    @GetMapping
    public List<Student> getAll();
}
