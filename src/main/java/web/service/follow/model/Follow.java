package web.service.follow.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.ArrayList;

@Data
@Document(collection = "follow")
public class Follow {
    String userId;
    ArrayList<String> follower;
    ArrayList<String> following;
}
