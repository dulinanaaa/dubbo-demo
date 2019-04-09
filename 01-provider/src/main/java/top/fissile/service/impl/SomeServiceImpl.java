package top.fissile.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import top.fissile.service.SomeService;

@Service
@Component
public class SomeServiceImpl implements SomeService {
    @Override
    public String sayHello(String name) {
        System.out.println("我被执行了，传过来的值为" + name);
        return "result data:" + name;
    }
}
