package com.guotianchain.zubaobei.user.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
@FeignClient(value = "zubaobei-user-service")
public interface UserServiceClient extends com.guotianchain.zubaobei.user.api.IUserServiceFeign {

}
