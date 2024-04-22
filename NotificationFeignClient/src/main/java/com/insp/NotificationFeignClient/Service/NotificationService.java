package com.insp.NotificationFeignClient.Service;

import com.insp.NotificationFeignClient.Model.Notification;
import com.insp.NotificationFeignClient.Repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class NotificationService {
    @Autowired
    NotificationRepository notificationRepository;

    public Notification save(Notification notification){
        System.out.println(notification.toString());
        return notificationRepository.save(notification);
    }

    public List<Notification> getAll() {
        return notificationRepository.findAll();
    }
}
