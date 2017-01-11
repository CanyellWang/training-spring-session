package session.boot.config;

import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 300) //意思是*秒失效
public class HttpSessionConfig {

}
