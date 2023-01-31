package controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    /**
     * 建立帳戶
     *
     * @param parameterMap
     */
    public void createUser(@RequestBody Map<String, Object> parameterMap) {

        try {

        } catch (Exception e) {
            log.error("Exception Happend ! message:{}", e.getMessage(), e);
        }

    }


}
