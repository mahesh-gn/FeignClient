package com.insp.NotificationFeignClient.Controller;

import com.insp.NotificationFeignClient.Model.Notification;
import com.insp.NotificationFeignClient.Model.Student;
import com.insp.NotificationFeignClient.Service.NotificationService;
import com.insp.NotificationFeignClient.Service.StudentClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/notification")
public class NotificationController {

    @Autowired
    NotificationService notificationService;

    @Autowired
    StudentClient studentClient;

    @PostMapping("/save")
    public Notification saveStudent(@RequestBody Student student){
        Notification notification=new Notification();
        notification.setNid(student.getSid());
        notification.setPayLoad(student);
        notification.setDate(LocalDate.now());
        return notificationService.save(notification);
    }

    @GetMapping
    public List<Notification> getAll(){
        System.out.println(studentClient.getAll());
        return notificationService.getAll();
    }
}
