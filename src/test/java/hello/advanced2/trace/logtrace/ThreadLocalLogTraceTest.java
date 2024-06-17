package hello.advanced2.trace.logtrace;

import hello.advanced2.trace.TraceStatus;
import org.junit.jupiter.api.Test;

class ThreadLocalLogTraceTest {
    
    ThreadLocalLogTrace trace = new ThreadLocalLogTrace();
    
    @Test
    void begin_end_level2() {
        TraceStatus status1 = trace.begin("하이하이");
        TraceStatus status2 = trace.begin("안녕안녕");
        trace.end(status2);
        trace.end(status1);
    }

    @Test
    void begin_exception_level2() {
        TraceStatus status1 = trace.begin("하이하이");
        TraceStatus status2 = trace.begin("안녕안녕");
        trace.exception(status2, new IllegalStateException());
        trace.exception(status1, new IllegalStateException());
    }

}