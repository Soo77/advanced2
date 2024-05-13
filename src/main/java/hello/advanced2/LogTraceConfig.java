package hello.advanced2;

import hello.advanced2.logtrace.FieldLogTrace;
import hello.advanced2.logtrace.LogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogTraceConfig {

    @Bean
    public LogTrace logTrace() {
        return new FieldLogTrace();
    }




}
