package web.service.follow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("web.service.follow.repository")
public class FollowApplication {
    public static void main(String[] args) {
        SpringApplication.run(FollowApplication.class);
    }
}
