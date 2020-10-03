package web.service.follow.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import web.service.follow.model.Follow;

import java.util.List;

@Repository
public interface FollowRepository extends MongoRepository<Follow, String> {
    Follow getFollowByUserId(String userId);
}
