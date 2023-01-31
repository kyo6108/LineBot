package service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import vo.User;

import java.util.Objects;

@Service
public class UserService {
    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    public void createUser(User user) throws Exception{
        if (Objects.isNull(user)){
            throw new Exception("資料空的");
        }



    }
}
