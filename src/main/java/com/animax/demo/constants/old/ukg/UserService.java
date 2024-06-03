package com.animax.demo.constants.old.ukg;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

   // @Autowired
   // RestTemplate restTemplate;


    public String addAndSendUser(List<User> users) throws URISyntaxException {
        URI uri = new URI("http://address");
        HttpEntity<?> entity = null;


        int count = users.size() - 100;
        int size = users.size() - count;
        for(int i= size; i>count; i--) {
            List<User> splitUsers = createUserChunk(users);
        }

        //    restTemplate.exchange(uri, HttpMethod.POST, entity);
        String id = null;
        return id;
    }

    private List<User> createUserChunk(List<User> users) {
        // break users based on count
        List<User> splitUsers = new ArrayList<>();
        //users.stream().collect(Collectors.groupingBy(User::)

        if(!users.isEmpty()) {
            int count = 100;
            splitUsers.addAll(users.subList(users.size(), users.size() - count));
        }
        return splitUsers;
    }
}
