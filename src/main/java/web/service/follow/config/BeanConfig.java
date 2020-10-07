package web.service.follow.config;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanConfig {
    @Bean("user-service")
    ManagedChannel userGrpcBeanChanel(){
        return ManagedChannelBuilder.forAddress("localhost", 6567).usePlaintext().build();
    }
}
