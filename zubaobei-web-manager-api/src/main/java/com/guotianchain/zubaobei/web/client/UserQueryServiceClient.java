package com.guotianchain.zubaobei.web.client;

import com.guotianchain.zubaobei.user.api.IUserQueryServiceFeign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
@FeignClient(value = "zubaobei-user-service")
public interface UserQueryServiceClient extends IUserQueryServiceFeign{

}
